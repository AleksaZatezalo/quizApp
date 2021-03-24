package com.example.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mQuestionsList = Constants.getQuestions()
        setQuestion()

        val tv_opt_one = this.findViewById<TextView>(R.id.tv_option_one)
        val tv_opt_two = this.findViewById<TextView>(R.id.tv_option_two)
        val tv_opt_three = this.findViewById<TextView>(R.id.tv_option_three)
        val tv_opt_four = this.findViewById<TextView>(R.id.tv_option_four)
        val btn_submit = this.findViewById<Button>(R.id.btn_submit)

        tv_opt_one.setOnClickListener(this)
        tv_opt_two.setOnClickListener(this)
        tv_opt_three.setOnClickListener(this)
        tv_opt_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    private fun setQuestion(){
        val question = mQuestionsList!!.get(mCurrentPosition - 1)
        val btn_submit = this.findViewById<Button>(R.id.btn_submit)

        defualtOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            btn_submit.text = "Finish"
        } else{
            btn_submit.text = "Submit"
        }

        val prog_bar = this.findViewById<ProgressBar>(R.id.progressBar)
        val tv_progress = this.findViewById<TextView>(R.id.tv_progress)
        val tv_question = this.findViewById<TextView>(R.id.tv_question)

        val tv_opt_one = this.findViewById<TextView>(R.id.tv_option_one)
        val tv_opt_two = this.findViewById<TextView>(R.id.tv_option_two)
        val tv_opt_three = this.findViewById<TextView>(R.id.tv_option_three)
        val tv_opt_four = this.findViewById<TextView>(R.id.tv_option_four)

        prog_bar.progress = mCurrentPosition
        tv_progress.text = "${mCurrentPosition}" + "/" + prog_bar.max
        tv_question.text = question!!.question
        tv_opt_one.text = question.optionOne
        tv_opt_two.text = question.optionTwo
        tv_opt_three.text = question.optionThree
        tv_opt_four.text = question.optionFour
    }

    private fun defualtOptionsView(){

        val tv_opt_one = this.findViewById<TextView>(R.id.tv_option_one)
        val tv_opt_two = this.findViewById<TextView>(R.id.tv_option_two)
        val tv_opt_three = this.findViewById<TextView>(R.id.tv_option_three)
        val tv_opt_four = this.findViewById<TextView>(R.id.tv_option_four)

        val options = ArrayList<TextView>()
        options.add(0, tv_opt_one)
        options.add(1, tv_opt_two)
        options.add(2, tv_opt_three)
        options.add(3, tv_opt_four)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.deafult_option_border_bg
            )
        }
    }

    override fun onClick(v: View?) {

        val tv_opt_one = this.findViewById<TextView>(R.id.tv_option_one)
        val tv_opt_two = this.findViewById<TextView>(R.id.tv_option_two)
        val tv_opt_three = this.findViewById<TextView>(R.id.tv_option_three)
        val tv_opt_four = this.findViewById<TextView>(R.id.tv_option_four)
        val btn_submit = this.findViewById<Button>(R.id.btn_submit)

        when(v?.id){
            R.id.tv_option_one -> {
                selectedOptionView(tv_opt_one, 1)
            }
            R.id.tv_option_two -> {
                selectedOptionView(tv_opt_two, 2)
            }
            R.id.tv_option_three -> {
                selectedOptionView(tv_opt_three, 3)
            }
            R.id.tv_option_four -> {
                selectedOptionView(tv_opt_four, 4)
            }
            R.id.btn_submit ->{
                if (mSelectedOptionPosition == 0){
                    mCurrentPosition ++

                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            Toast.makeText(
                                    this, "You have finished!",
                                    Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if (question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.incorrect_option_border_bg)
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                    if (mCurrentPosition == mQuestionsList!!.size){
                        btn_submit.text = "Finish"
                    }else {
                        btn_submit.text = "Next"
                    }
                }
                mSelectedOptionPosition = 0
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        val tv_opt_one = this.findViewById<TextView>(R.id.tv_option_one)
        val tv_opt_two = this.findViewById<TextView>(R.id.tv_option_two)
        val tv_opt_three = this.findViewById<TextView>(R.id.tv_option_three)
        val tv_opt_four = this.findViewById<TextView>(R.id.tv_option_four)

        when(answer){
            1 ->{
                tv_opt_one.background = ContextCompat.getDrawable(
                        this,
                        drawableView
                )
            }

            2 ->{
                tv_opt_two.background = ContextCompat.getDrawable(
                        this,
                        drawableView
                )
            }

            3 ->{
                tv_opt_three.background = ContextCompat.getDrawable(
                        this,
                        drawableView
                )
            }

            4 ->{
                tv_opt_four.background = ContextCompat.getDrawable(
                        this,
                        drawableView
                )
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defualtOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
                this,
                R.drawable.selected_option_border_bg
        )

    }

}
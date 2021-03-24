package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mQuestionsList = Constants.getQuestions()
        setQuestion()
    }

    private fun setQuestion(){
        mCurrentPosition = 1
        val question = mQuestionsList!!.get(mCurrentPosition - 1)

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
        options.add(3, tv_opt_three)
        options.add(4, tv_opt_four)
    }

}
package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()
        Log.i("Questions Size", "${questionsList.size}")

        val currentPosition = 1
        val question: Question? = questionsList[currentPosition - 1]

        val prog_bar = this.findViewById<ProgressBar>(R.id.progressBar)
        val tv_progress = this.findViewById<TextView>(R.id.tv_progress)
        val tv_question = this.findViewById<TextView>(R.id.tv_question)

        val tv_opt_one = this.findViewById<TextView>(R.id.tv_option_one)
        val tv_opt_two = this.findViewById<TextView>(R.id.tv_option_two)
        val tv_opt_three = this.findViewById<TextView>(R.id.tv_option_three)
        val tv_opt_four = this.findViewById<TextView>(R.id.tv_option_four)

        prog_bar.progress = 1
        tv_progress.text = "$currentPosition" + "/" + prog_bar.max
        tv_question.text = question!!.question
        tv_opt_one.text = question.optionOne
        tv_opt_two.text = question.optionTwo
        tv_opt_three.text = question.optionThree
        tv_opt_four.text = question.optionFour
    }
}
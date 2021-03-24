package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        var tv_name =  this.findViewById<TextView>(R.id.tv_name)
        tv_name.text = username

        val totalQuest = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctQuest = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        var tv_score =  this.findViewById<TextView>(R.id.tv_score)
        tv_score.text = "Score: $correctQuest" + "/" + "$totalQuest"

        val finish = this.findViewById<Button>(R.id.btn_finish)
        finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
package com.example.quizapp

object Constants{
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
                1,
                "what country does this flag belong to",
                R.drawable.flag,
                "Serbia",
                "Canada",
                "Croatia",
                "Mexico",
                1)
        questionList.add(que1)
        return questionList
    }

}
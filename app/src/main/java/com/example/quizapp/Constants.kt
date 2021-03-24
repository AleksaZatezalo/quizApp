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
        val que2 = Question(
                2,
                "what country does this thing belong to",
                R.drawable.flag,
                "Serbia",
                "Canada",
                "Croatia",
                "Mexico",
                3)

        val que3 = Question(
                3,
                "what country does this sdsd belong to",
                R.drawable.flag,
                "Serbia",
                "Canada",
                "Croatia",
                "Mexico",
                2)
        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        return questionList
    }

}
package com.example.myquizapp

import com.example.myquizapp.R


object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()


        val que1 = Question(
            1, "What are the titens?",
            R.drawable.cor,
            "Boss's", "Heros",
            "ally", "the ancients", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "who are the youngest faction? ",
            R.drawable.ed,
            "Empire", "Federation",
            "Alliance", "independets", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "what is your goal?",
            R.drawable.fac,
            "build a rocket", "Kill ",
            "hide", "nothing", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "how many races are there ?",
            R.drawable.nms,
            "1", "2",
            "6", "3", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What are the fallen?",
            R.drawable.stel,
            "A race", "An empire",
            "Animals", "prisoners", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What happened to your ship?",
            R.drawable.sub,
            "Crashed", "Stolen",
            "Vanished", "Nothing", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Who is the final boss?",
            R.drawable.ter,
            "The twins", "eye of cthulu",
            "the wall of flesh", "moon lord", 4
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What is wrong with the halcyon colony?",
            R.drawable.tow,
            "Food shortage", "At war",
            "Its lost", "its a dictatorship", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Who is the mayor of the farm?",
            R.drawable.stard,
            "Lewis", "Jodi",
            "Pierre", "Penny", 1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What happened to the romuland empire?",
            R.drawable.sto,
            "Where attacked", "Their sun went nova",
            "Conquered", "dissapeared", 2
        )

        questionsList.add(que10)

        return questionsList
    }
    // END
    var MAX_PROGRESS_VALUE = 10
}
// END
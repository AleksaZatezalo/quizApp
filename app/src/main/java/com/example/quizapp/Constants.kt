package com.example.quizapp

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answer"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
                1,
                "Which of the following are computer threats?",
                R.drawable.flag,
                "Spam",
                "DOS or DDOS",
                "Phishing",
                "Options 2 & 3",
                4)
        val que2 = Question(
                2,
                "What is an unsolicited email?",
                R.drawable.flag,
                "Phishing",
                "Trojan",
                "Spam",
                "Malware",
                3)

        val que3 = Question(
                3,
                "Software that filters network traffic is?",
                R.drawable.flag,
                "Firewall",
                "Antivirus",
                "Malware",
                "Adware",
                1)

        val que4 = Question(
            4,
            "All are cyber threats except?",
            R.drawable.flag,
            "Hackers",
            "Spam",
            "Virus",
            "Worm",
            2)

        val que5 = Question(
            5,
            "A monitor that transmits data to other computers?",
            R.drawable.flag,
            "Spyware",
            "Malware",
            "Trojan",
            "Adware",
            1)

        val que6 = Question(
            6,
            "A firewall is a type of?",
            R.drawable.flag,
            "Virus",
            "Security threat",
            "Worm",
            "Security measure",
            4)

        val que7 = Question(
            7,
            "Which of the following threats are internal?",
            R.drawable.flag,
            "A trojan horse",
            "Adware",
            "Angry Employees",
            "Spam",
            3)

        val que8 = Question(
            8,
            "Hackers use proxy servers to?",
            R.drawable.flag,
            "Create strong connections",
            "Get remote access",
            "To hide their location",
            "For no reason",
            3)

        val que9 = Question(
            9,
            "What is the Active Directory port of Windows?",
            R.drawable.flag,
            "80",
            "445",
            "400",
            "389",
            4)

        val que10 = Question(
            10,
            "Hiding information in photos is called?",
            R.drawable.flag,
            "Image rendering",
            "Stenography",
            "Rooting",
            "Backdoor",
            2)

        val que11 = Question(
            11,
            "Which phase of an attack deploys exploits?",
            R.drawable.flag,
            "Reconnaissance",
            "Maintaining access",
            "Gaining access",
            "Scanning",
            3)

        val que12 = Question(
            12,
            "What does a DOS attack do?",
            R.drawable.flag,
            "Exploits weak TCP/IP Stacks",
            "Executes Trojans",
            "Shutdown Systems",
            "Overloads Systems",
            4)

        val que13 = Question(
            13,
            "The steps of a TCP/IP Handshake are?",
            R.drawable.flag,
            "SYN, ACK, FIN",
            "SYN-ACK",
            "SYN, SYN-ACK, ACK",
            "ACK-SYN",
            3)

        val que14 = Question(
            14,
            "What tool is used for Enumeration?",
            R.drawable.flag,
            "Whois",
            "IP Network Browser",
            "Whois",
            "Tor Browser",
            2)

        val que15 = Question(
            15,
            "Hacking first looks to compromise?",
            R.drawable.flag,
            "Availability",
            "Confidentiality",
            "Authentication",
            "Integrity",
            2)

        val que16 = Question(
            16,
            "Why are ping sweeps used?",
            R.drawable.flag,
            "To identify live systems",
            "To locate systems",
            "To identify ports",
            "To locate firewalls",
            1)

        val que17 = Question(
            17,
            "SSH runs on which port?",
            R.drawable.flag,
            "80",
            "8888",
            "3606",
            "22",
            4)

        val que18 = Question(
            18,
            "Which nmap flag is used to run a Christmas scan?",
            R.drawable.flag,
            "-sV",
            "-sX",
            "-sS",
            "-p-",
            2)

        val que19 = Question(
            19,
            "Which tool is used to crack password hashes?",
            R.drawable.flag,
            "Rainbow tables",
            "Dictionaries and word lists",
            "Hydra",
            "Decryption tools",
            1)

        val que20 = Question(
            20,
            "VPNs Hide?",
            R.drawable.flag,
            "Your data",
            "Your identity",
            "Your IP",
            "All of the above",
            4)

        val que21 = Question(
            21,
            "Viruses are?",
            R.drawable.flag,
            "Self replicating",
            "Multiply on networks",
            "Machine generated",
            "None of the above",
            1)

        val que22 = Question(
            22,
            "Trojans?",
            R.drawable.flag,
            "Appear benevolent",
            "Benefit end users",
            "Monitor your network",
            "Encrypt your data",
            1)

        val que23 = Question(
            23,
            "Phishing scams involve?",
            R.drawable.flag,
            "Computer Code",
            "Just email",
            "Hackers faking identity",
            "Messages that appear legit",
            4)

        val que24 = Question(
            24,
            "Spearphishing ___?",
            R.drawable.flag,
            "Is no different from phishing",
            "Targets specific people",
            "Uses SMS",
            "Uses email",
            2)

        val que25 = Question(
            25,
            "Public key encryption ___?",
            R.drawable.flag,
            "Uses two different keys",
            "Uses one key",
            "Is used in AES",
            "Is symetric",
            1)



        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)
        questionList.add(que11)
        questionList.add(que12)
        questionList.add(que13)
        questionList.add(que14)
        questionList.add(que15)
        questionList.add(que16)
        questionList.add(que17)
        questionList.add(que18)
        questionList.add(que19)
        questionList.add(que20)
        questionList.add(que21)
        questionList.add(que22)
        questionList.add(que23)
        questionList.add(que24)
        questionList.add(que25)
        return questionList
    }

}
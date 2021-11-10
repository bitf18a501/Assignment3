package com.example.quizapp;

public class Question {


    public String questions[] = {
            "Where is the sound of 'أ' produced from?",
            "Where is the sound of 'ہ' produced from?",
            "Where is the sound of 'ح' produced from?",
            "Where is the sound of 'ع' produced from?",
            



    };

    public String choices[][] = {
            {"End of throat", "Middle of throat", "Start of throat", "Base of tongue"},
            {"Base of tongue", "End of throat", "Middle of throat", "Start of throat"},
            {"Base of tongue", "End of throat", "Middle of throat", "Start of throat"},
            {"Base of tongue", "End of throat", "Middle of throat", "Start of throat"},





    };

    public String correctAnswer[] = {
            "End of throat",
            "End of throat" ,
            "Middle of throat" ,
            "Middle of throat"

    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}

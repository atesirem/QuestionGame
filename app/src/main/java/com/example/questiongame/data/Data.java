package com.example.questiongame.data;

import com.example.questiongame.model.Question;

import java.util.ArrayList;

public class Data {

    private ArrayList<Question> QuestionDetails = new ArrayList<Question>();
    Question question1 = new Question("Bana Karşı Her Zaman Kibar Ol", "Answer1", "Answer2", 1, "Bravo", "Yazık Kafana", 0);
    Question question2 = new Question("Bana Karşı Her Zaman Kibar Ol", "Answer1", "Answer2", 0, "Bravo", "Yazık Kafana", 1);
    Question question3 = new Question("Bana Karşı Her Zaman Kibar Ol", "Answer1", "Answer2", 1, "Bravo", "Yazık Kafana", 2);


    public Data() {
    }


}


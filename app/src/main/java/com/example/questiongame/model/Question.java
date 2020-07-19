package com.example.questiongame.model;

import java.io.Serializable;

public class Question implements Serializable {
    private String question, answer1, answer2, rightAnswerText, wrongAnswerText;
    private int rightAnswerIndex, backToQuestionIndex;


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getRightAnswerText() {
        return rightAnswerText;
    }

    public void setRightAnswerText(String rightAnswerText) {
        this.rightAnswerText = rightAnswerText;
    }

    public String getWrongAnswerText() {
        return wrongAnswerText;
    }

    public void setWrongAnswerText(String wrongAnswerText) {
        this.wrongAnswerText = wrongAnswerText;
    }

    public int getRightAnswerIndex() {
        return rightAnswerIndex;
    }

    public void setRightAnswerIndex(int rightAnswerIndex) {
        this.rightAnswerIndex = rightAnswerIndex;
    }

    public int getBackToQuestionIndex() {
        return backToQuestionIndex;
    }

    public void setBackToQuestionIndex(int backToQuestionIndex) {
        this.backToQuestionIndex = backToQuestionIndex;
    }


    public Question(String question, String answer1, String answer2, int rightAnswerIndex, String rightAnswerText, String wrongAnswerText, int backToQuestionIndex) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.rightAnswerIndex = rightAnswerIndex;
        this.rightAnswerText = rightAnswerText;
        this.wrongAnswerText = wrongAnswerText;
        this.backToQuestionIndex = backToQuestionIndex;
    }

}

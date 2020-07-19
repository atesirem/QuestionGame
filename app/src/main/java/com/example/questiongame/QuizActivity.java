package com.example.questiongame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.questiongame.model.Questions;

public class QuizActivity extends AppCompatActivity {
    private TextView question;
    private Button answer1,answer2;
    private int rightAnswerIndex,backToQuestionIndex;

    public QuizActivity(int rightAnswerIndex, int backToQuestionIndex) {
        this.rightAnswerIndex = rightAnswerIndex;
        this.backToQuestionIndex = backToQuestionIndex;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        initView();
        parseIntent();
    }

    private void parseIntent() {
        Questions questions = (Questions) getIntent().getSerializableExtra("QuestionClass");
        question.setText(questions.getQuestion());
        answer1.setText(questions.getAnswer1());
        answer2.setText(questions.getAnswer2());
    }

    private void initView() {
        question=findViewById(R.id.question);
        answer1=findViewById(R.id.answer1);
        answer2=findViewById(R.id.answer2);

    }
}
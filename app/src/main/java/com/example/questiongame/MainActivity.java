package com.example.questiongame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.questiongame.model.Question;

public class MainActivity extends AppCompatActivity {
    private Button startButton;
    private TextView question;
    private Button answer1,answer2;
    private int rightAnswerIndex,backToQuestionIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        parseIntent();
    }


    private void parseIntent() {
        Question questions = (Question) getIntent().getSerializableExtra("QuestionClass");
        question.setText(questions.getQuestion());
        answer1.setText(questions.getAnswer1());
        answer2.setText(questions.getAnswer2());
        rightAnswerIndex = questions.getRightAnswerIndex();
        backToQuestionIndex = questions.getBackToQuestionIndex();
    }

    private void initView() {
        question=findViewById(R.id.question);
        answer1=findViewById(R.id.answer1);
        answer2=findViewById(R.id.answer2);
        startButton= findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Intent i = new Intent(MainActivity.this,QuizActivity.class);startActivity(i); }});

    }


}
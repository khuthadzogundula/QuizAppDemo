package com.example.kgundula.quizappdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by kgundula on 2017/06/13.
 */

public class QuizMainActivity extends AppCompatActivity {

    @BindView(R.id.rg_question_jack) RadioGroup questionJack;
    @BindView(R.id.rg_question_egypt)  RadioGroup questionEgypt;

    @BindView(R.id.eqypt) RadioButton eqypt;
    @BindView(R.id.uganda) RadioButton uganda;
    @BindView(R.id.blood)  RadioButton blood;

    @BindView(R.id.tennessee)  RadioButton tennessee;
    @BindView(R.id.coconut)  RadioButton coconut;
    @BindView(R.id.snake)  RadioButton snake;

    int score = 0;

    boolean all_questions_answered = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.submit)
    public void quizSubmit(View view) {

        score = 0;

        if (questionJack.getCheckedRadioButtonId() != -1 && questionEgypt.getCheckedRadioButtonId() != -1 ) {
            all_questions_answered = true;
        }

        if (all_questions_answered ) {

            switch(questionJack.getCheckedRadioButtonId()) {
                case R.id.tennessee:
                    score++;
                    break;
            }

            switch(questionEgypt.getCheckedRadioButtonId()) {
                case R.id.eqypt:
                    score++;
                    break;
            }

            Toast.makeText(getApplicationContext(), "You have scored "+score+" out of 2",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(),"You need to answer all the questions", Toast.LENGTH_LONG).show();
        }
    }
}

package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class AnswerActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        TextView answerTextView = (TextView) findViewById(R.id.answerTextView);
        Intent intent =getIntent();
        boolean answer = intent.getBooleanExtra("answer", true);
        if(answer) answerTextView.setText("Да");
        else answerTextView.setText("Нет");

        Button backBnt = (Button) findViewById(R.id.backBtn);
        backBnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent getMainForm = new Intent( AnswerActivity.this, MainActivity.class);
                startActivity(getMainForm);*/
                finish();
            }
        });


    }
}

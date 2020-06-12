package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button trueButton;
    private Button falseButton;
    private Button getAnswerBtn;
    private TextView questionTextView;
    private int currentIndex=0;
    private int countOfCorrectAnswers=0;
    private TextView countOfCorrectAnswersTV;
    private TextView currentQuestionTV;
    private boolean isNoCheater=true;
    private TextView endOfTestTV;
    private Button restartBtn;

    private Question[] questionBank=/*new Question[]*/{
            new Question(R.string.question_text_1,true),
            new Question(R.string.question_text_2,false),
            new Question(R.string.question_text_3,true),
            new Question(R.string.question_text_4,false),
            new Question(R.string.question_text_5,true),
            new Question(R.string.question_text_6,true),
            new Question(R.string.question_text_7,false),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Начало программы
        Log.d("MainActivity", "********************************* OnCreate() ВЫЗВАН ******************************************");

        // загрузить игру из переменной currentIndexForSave
        // если это первый запуск активности, передаем дефолтное значение ноль.
        // загружаем игру, только если это не первый запуск
        if(savedInstanceState!=null)
        currentIndex = savedInstanceState.getInt("currentIndexForSave",0);


        trueButton = (Button) findViewById(R.id.true_button);
        falseButton = (Button) findViewById(R.id.false_button);
        getAnswerBtn = (Button) findViewById(R.id.get_answer);
        questionTextView = (TextView) findViewById((R.id.question_text_view));
        final int question = questionBank[currentIndex].getTextResId();
        questionTextView.setText(question);
        //updateQuestion();

        currentQuestionTV= (TextView) findViewById(R.id.currentQuestionTextView);
        currentQuestionTV.setText("Вопрос " + currentIndexPlusPlus(currentIndex) + " из " + questionBank.length);



        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
                updateQuestion();

            }
        });

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
                updateQuestion();
            }
        });

        getAnswerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNoCheater=false;
                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("answer", questionBank[currentIndex].isAnswerTrue());
                startActivity(intent);









            }
        });
    } //закрытие метода OnCreate()

    private int currentIndexPlusPlus(int c){
        return ++c;
    }

    private void updateQuestion() {
            //currentIndex=(currentIndex+1)%questionBank.length;
            if(currentIndex<questionBank.length-1) {
                currentIndex++;
                int questionId = questionBank[currentIndex].getTextResId();
                questionTextView.setText(questionId);
                currentQuestionTV.setText("Вопрос " + currentIndexPlusPlus(currentIndex) + " из " + questionBank.length);
                isNoCheater = true;
            }
            else {
                trueButton.setEnabled(false);
                falseButton.setEnabled(false);
                getAnswerBtn.setVisibility(View.INVISIBLE);

                endOfTestTV=(TextView) findViewById(R.id.endOfTestTV);
                double p = (double) countOfCorrectAnswers*100/(double)questionBank.length;
                endOfTestTV.setText("Тест окончен.\nПравильных ответов: " + countOfCorrectAnswers + " из " + questionBank.length +"\nПроцент правильных: " + p);
                restartBtn=(Button) findViewById(R.id.restartBtn);
                restartBtn.setVisibility(View.VISIBLE);
                restartBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        currentIndex=0;
                        recreate();
                    }
                });
            }



        }

    private void checkAnswer(boolean userAnswer){
            boolean answer = questionBank[currentIndex].isAnswerTrue();
            if(userAnswer==answer) Toast.makeText(MainActivity.this, R.string.correct_answer, Toast.LENGTH_SHORT).show();
            else Toast.makeText(MainActivity.this, R.string.incorrect_answer, Toast.LENGTH_SHORT).show();

            if(userAnswer==answer && isNoCheater){
                countOfCorrectAnswers++;
                countOfCorrectAnswersTV=(TextView) findViewById(R.id.correctAnswersTextView);
                //countOfCorrectAnswersTW.setText(String.valueOf(countOfCorrectAnswers));
                //countOfCorrectAnswersTW.setText(Integer.toString(countOfCorrectAnswers));
                countOfCorrectAnswersTV.setText("" + countOfCorrectAnswers);
            }



    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){ //этот метод ОС вызывает перед уничтожением активности
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("currentIndexForSave", currentIndex); //сохранить игру в переменную currentIndexForSave

    }

    //Логирование состояний активности
    @Override
    public void onStart(){
            super.onStart();
            Log.d("MainActivity", "********************************* OnStart() ВЫЗВАН ******************************************");
        }

    @Override
    public void onResume(){
        super.onResume();
        Log.d("MainActivity", "********************************* OnResume() ВЫЗВАН ******************************************");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("MainActivity", "********************************* OnPause() ВЫЗВАН ******************************************");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d("MainActivity", "********************************* OnStop() ВЫЗВАН ******************************************");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity", "********************************* OnDestroy() ВЫЗВАН ******************************************");
    }



}

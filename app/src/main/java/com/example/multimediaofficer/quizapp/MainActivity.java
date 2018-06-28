

/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.multimediaofficer.quizapp;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This activity keeps track of the Quiz attempt and then grade the Quiz.
 * It also reset the Quiz for the user to make another attempt.
 */
public class MainActivity extends AppCompatActivity {


    boolean questionOneOptionOne = false; boolean questionOneOptionTwo = false; boolean questionOneOptionThree = false; boolean questionOneOptionFour = false;

    boolean questionTwoOptionOne = false; boolean questionTwoOptionTwo = false; boolean questionTwoOptionThree = false; boolean questionTwoOptionFour = false;

    boolean questionThreeOptionOne = false; boolean questionThreeOptionTwo = false; boolean questionThreeOptionThree = false; boolean questionThreeOptionFour = false;

    boolean questionFourOptionOne = false; boolean questionFourOptionTwo = false; boolean questionFourOptionThree = false; boolean questionFourOptionFour = false;

    boolean questionFiveOptionOne = false; boolean questionFiveOptionTwo = false; boolean questionFiveOptionThree = false; boolean questionFiveOptionFour = false;

    boolean questionSixOptionOne = false; boolean questionSixOptionTwo = false; boolean questionSixOptionThree = false; boolean questionSixOptionFour = false;

    boolean questionSevenOptionOne = false; boolean questionSevenOptionTwo = false; boolean questionSevenOptionThree = false; boolean questionSevenOptionFour = false;

    boolean questionEightOptionOne = false; boolean questionEightOptionTwo = false; boolean questionEightOptionThree = false; boolean questionEightOptionFour = false;

    boolean questionNineOptionOne = false; boolean questionNineOptionTwo = false; boolean questionNineOptionThree = false; boolean questionNineOptionFour = false;

    boolean questionTenOptionOne = false; boolean questionTenOptionTwo = false; boolean questionTenOptionThree = false; boolean questionTenOptionFour = false;


    int quizScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button submitQuiz = ((Button) findViewById(R.id.quiz_submit));

        submitQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*To make sure the quiz score is reset to zero, so it won't keep incrementing the quizScore
        variable at every submit before resetting.*/


                if(questionOneOptionTwo) {
                    quizScore += 1;
                }

                if(questionTwoOptionFour) {
                    quizScore += 1;
                }

                if(questionThreeOptionFour) {
                    quizScore += 1;
                }

                if(questionFourOptionTwo) {
                    quizScore += 1;
                }

                if(questionFiveOptionFour) {
                    quizScore += 1;
                }

                if(questionSixOptionThree) {
                    quizScore += 1;
                }

                if(questionSevenOptionOne) {
                    quizScore += 1;
                }

                if(questionEightOptionTwo) {
                    quizScore += 1;
                }

                if(questionNineOptionTwo) {
                    quizScore += 1;
                }

                if(questionTenOptionFour) {
                    quizScore += 1;
                }


                Toast.makeText(MainActivity.this, "Your Quiz Score is: " + quizScore + " /10" , Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.report_text)).setText("Quiz Completed! Your Quiz Score is: " + quizScore + "/10");

                quizScore = 0;
                resetCorrectOption();

            }
        });

        Button resetButtonQuiz = ((Button) findViewById(R.id.quiz_reset));

        resetButtonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Clear all the Radio buttons by clearing the Radio Groups. This ensure that the Quiz options are reset
        so the user can retake the Quiz*/

                resetQuiz();
                quizScore = 0;
                resetCorrectOption();
            }
        });
    }

    public void resetCorrectOption(){

        /*Set the designated correct options to false.
        This ensure that the correct boolean variables are destroyed for next trial.
        */

        questionOneOptionTwo = false;
        questionTwoOptionFour = false;
        questionThreeOptionFour = false;
        questionFourOptionTwo = false;
        questionFiveOptionFour = false;

        questionSixOptionThree = false;
        questionSevenOptionOne = false;
        questionEightOptionTwo = false;
        questionNineOptionTwo = false;
        questionTenOptionFour = false;
    }

    public void resetQuiz(){

        /*Clear all the Radio buttons by clearing the Radio Groups. This ensure that the Quiz options are reset
        so the user can retake the Quiz*/

        ((RadioGroup) findViewById(R.id.rg_question1)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question2)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question3)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question4)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question5)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question6)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question7)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question8)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question9)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question10)).clearCheck();
        ((TextView)findViewById(R.id.report_text)).setText("");
        quizScore = 0;
    }

    public void onRadioButtonClicked(View view) {

        questionOneOptionOne = ((RadioButton) findViewById(R.id.question_one_option1)).isChecked();
        questionOneOptionTwo = ((RadioButton) findViewById(R.id.question_one_option2)).isChecked();
        questionOneOptionThree = ((RadioButton) findViewById(R.id.question_one_option3)).isChecked();
        questionOneOptionFour = ((RadioButton) findViewById(R.id.question_one_option4)).isChecked();

        questionTwoOptionOne = ((RadioButton) findViewById(R.id.question_two_option1)).isChecked();
        questionTwoOptionTwo = ((RadioButton) findViewById(R.id.question_two_option2)).isChecked();
        questionTwoOptionThree = ((RadioButton) findViewById(R.id.question_two_option3)).isChecked();
        questionTwoOptionFour = ((RadioButton) findViewById(R.id.question_two_option4)).isChecked();

        questionThreeOptionOne = ((RadioButton) findViewById(R.id.question_three_option1)).isChecked();
        questionThreeOptionTwo = ((RadioButton) findViewById(R.id.question_three_option2)).isChecked();
        questionThreeOptionThree = ((RadioButton) findViewById(R.id.question_three_option3)).isChecked();
        questionThreeOptionFour = ((RadioButton) findViewById(R.id.question_three_option4)).isChecked();

        questionFourOptionOne = ((RadioButton) findViewById(R.id.question_four_option1)).isChecked();
        questionFourOptionTwo = ((RadioButton) findViewById(R.id.question_four_option2)).isChecked();
        questionFourOptionThree = ((RadioButton) findViewById(R.id.question_four_option3)).isChecked();
        questionFourOptionFour = ((RadioButton) findViewById(R.id.question_four_option4)).isChecked();


        questionFiveOptionOne = ((RadioButton) findViewById(R.id.question_five_option1)).isChecked();
        questionFiveOptionTwo = ((RadioButton) findViewById(R.id.question_five_option2)).isChecked();
        questionFiveOptionThree = ((RadioButton) findViewById(R.id.question_five_option3)).isChecked();
        questionFiveOptionFour = ((RadioButton) findViewById(R.id.question_five_option4)).isChecked();

        questionSixOptionOne = ((RadioButton) findViewById(R.id.question_six_option1)).isChecked();
        questionSixOptionTwo = ((RadioButton) findViewById(R.id.question_six_option2)).isChecked();
        questionSixOptionThree = ((RadioButton) findViewById(R.id.question_six_option3)).isChecked();
        questionSixOptionFour = ((RadioButton) findViewById(R.id.question_six_option4)).isChecked();

        questionSevenOptionOne = ((RadioButton) findViewById(R.id.question_seven_option1)).isChecked();
        questionSevenOptionTwo = ((RadioButton) findViewById(R.id.question_seven_option2)).isChecked();
        questionSevenOptionThree = ((RadioButton) findViewById(R.id.question_seven_option3)).isChecked();
        questionSevenOptionFour = ((RadioButton) findViewById(R.id.question_seven_option4)).isChecked();

        questionEightOptionOne = ((RadioButton) findViewById(R.id.question_eight_option1)).isChecked();
        questionEightOptionTwo = ((RadioButton) findViewById(R.id.question_eight_option2)).isChecked();
        questionEightOptionThree = ((RadioButton) findViewById(R.id.question_eight_option3)).isChecked();
        questionEightOptionFour = ((RadioButton) findViewById(R.id.question_eight_option4)).isChecked();

        questionNineOptionOne = ((RadioButton) findViewById(R.id.question_nine_option1)).isChecked();
        questionNineOptionTwo = ((RadioButton) findViewById(R.id.question_nine_option2)).isChecked();
        questionNineOptionThree = ((RadioButton) findViewById(R.id.question_nine_option3)).isChecked();
        questionNineOptionFour = ((RadioButton) findViewById(R.id.question_nine_option4)).isChecked();

        questionTenOptionOne = ((RadioButton) findViewById(R.id.question_ten_option1)).isChecked();
        questionTenOptionTwo = ((RadioButton) findViewById(R.id.question_ten_option2)).isChecked();
        questionTenOptionThree = ((RadioButton) findViewById(R.id.question_ten_option3)).isChecked();
        questionTenOptionFour = ((RadioButton) findViewById(R.id.question_ten_option4)).isChecked();

    }

}

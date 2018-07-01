            package com.example.android.mcqquizapp;

            import android.content.Context;
            import android.os.Bundle;
            import android.support.v7.app.AppCompatActivity;
            import android.view.View;
            import android.widget.CheckBox;
            import android.widget.EditText;
            import android.widget.RadioButton;
            import android.widget.TextView;
            import android.widget.Toast;

            import java.text.NumberFormat;


            public class MainActivity extends AppCompatActivity {

                int answer1_score = 1;
                int answer2_score = 1;
                int answer3_score = 0;
                int answer4_score = 1;
                boolean answer3 = true;
                int final_score;
                int  numberOfQuestionsCorrect  = 1;
                int incorrectAnswersList  = 1;


                private static final String LOG_TAG = MainActivity.class.getSimpleName();
                // Question 1//

                CheckBox question1_choice1;
                CheckBox question1_choice2;
                CheckBox question1_choice3;
                CheckBox question1_choice4;
                // Question 2//
                EditText question2_answer;
                // Question 3//
                RadioButton question2_choice1;
                // Question 4//
                EditText question4_answer;


                public void submitAnswers(View view) {


                    Boolean answer1_choice2;
                    Boolean answer1_choice1;
                    Boolean answer1_choice3;
                    Boolean answer1_choice4;
                    CheckBox question1_choice1 = (CheckBox) this.findViewById(R.id.question1_choice1);
                    CheckBox question1_choice2 = (CheckBox) this.findViewById(R.id.question1_choice2);
                    CheckBox question1_choice3 = (CheckBox) this.findViewById(R.id.question1_choice3);
                    CheckBox question1_choice4 = (CheckBox) this.findViewById(R.id.question1_choice4);
                    if (question1_choice1 != null) {
                        answer1_choice1 = question1_choice1.isChecked();
                    } else {
                        answer1_choice1 = null;
                    }
                    if (question1_choice2 != null) {
                        answer1_choice2 = question1_choice2.isChecked();
                    } else {
                        answer1_choice2 = null;
                    }
                    if (question1_choice3 != null) {
                        answer1_choice3 = question1_choice3.isChecked();
                    } else {
                        answer1_choice3 = null;
                    }
                    if (question1_choice4 != null) {
                        answer1_choice4 = question1_choice4.isChecked();
                    } else {
                        answer1_choice4 = null;
                    }
                    if ((answer1_choice1 != null && answer1_choice1) &&
                            (answer1_choice2 == null || !answer1_choice2) &&
                            (answer1_choice3 != null && answer1_choice3) &&
                            (answer1_choice4 == null || !answer1_choice4)
                            ) {
                        question1_choice1 = (CheckBox) this.findViewById(R.id.question1_choice1);
                        question1_choice2 = (CheckBox) this.findViewById(R.id.question1_choice2);
                        question1_choice3 = (CheckBox) this.findViewById(R.id.question1_choice3);
                        question1_choice4 = (CheckBox) this.findViewById(R.id.question1_choice4);
                        answer1_choice1 = question1_choice1.isChecked();
                        answer1_choice2 = question1_choice2.isChecked();
                        answer1_choice3 = question1_choice3.isChecked();
                        answer1_choice4 = question1_choice4.isChecked();
                        if (answer1_choice1 && !answer1_choice2 && answer1_choice3 && !answer1_choice4) {
                            answer1_score = 1;
                        } else {
                            answer1_score = 0;
                        }

                    }


                }

                //**The correct answer is Accra//
                {
                    String answer2;
                    EditText question2_answer = (EditText) this.findViewById(R.id.question2_answer);
                    if (question2_answer != null) {
                        answer2 = question2_answer.getText().toString().toLowerCase();
                    } else {
                        answer2 = "";
                    }
                    question2_answer = (EditText) this.findViewById(R.id.question2_answer);
                    answer2 = question2_answer.getText().toString().toLowerCase();
                    if (answer2.equals("Accra") || answer2.equals("Accra")) {
                        answer2_score = 1;
                    } else {
                    }


                }

                // Final Question, Meaning of AU*Answer is African Union//
                {
                    RadioButton question3_choice2 = (RadioButton) this.findViewById(R.id.question3_choice2);
                    if (question3_choice2 != null) {
                        boolean answer6 = question3_choice2.isChecked();
                        question3_choice2 = (RadioButton) this.findViewById(R.id.question3_choice2);
                        answer3 = question3_choice2.isChecked();
                        if (answer3) {
                            answer3_score = 1;

                        } else {
                            int answer3 = 0;

                        }
                        if (answer3 == false || !answer3) {
                            answer3_score = 0;
                        } else {
                            answer3_score = 1;
                        }


                    }
                }

                {

                    //**The correct answer is Ethiopia//
                    {
                        String answer2;
                        EditText question2_answer = (EditText) this.findViewById(R.id.question4_answer);
                        if (question4_answer != null) {
                            answer2 = question4_answer.getText().toString().toLowerCase();
                        } else {
                            answer2 = "";
                        }
                        question2_answer = (EditText) this.findViewById(R.id.question4_answer);
                        answer2 = question4_answer.getText().toString().toLowerCase();
                        if (answer2.equals("Ethiopia") || answer2.equals("Ethiopia")) {
                            answer2_score = 1;
                        } else {
                        }
                    }


                }

                private void displayMessage(View view) {
                    resultsDisplay(final_score);
                }

                private void resultsDisplay(int final_score) {
                }


                {


                    final_score = answer1_score + answer2_score + answer3_score + answer4_score;

                    if (final_score == 4) {
                        if (final_score == 4) {
                            final_score.toString() = "Perfect! You scored 4 out of 4";

                        } else {
                            final_score.toString() = "Try again. You scored " + final_score + " out of 4";
                        }

                        }

                        StringBuilder sb = new StringBuilder();
                        for (String s :) {
                            sb.append(s);
                            sb.append("\n\"Perfect! You scored 4 out of 4\"");
                        }

                        {

                            Context context = getApplicationContext();
                            CharSequence text = "You got " + numberOfQuestionsCorrect + "/4 answers right.\n\nRecheck the following:\n" + sb.toString();
                            int duration = Toast.LENGTH_SHORT;

                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();


                        }
                    }


                }


            }
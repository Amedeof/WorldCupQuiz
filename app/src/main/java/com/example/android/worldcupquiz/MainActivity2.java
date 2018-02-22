package com.example.android.worldcupquiz;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;
import android.text.TextWatcher;

import org.w3c.dom.Text;

/**
 * Created by Amedeo on 26/01/18.
 */


public class MainActivity2 extends AppCompatActivity implements OnClickListener {

    Button getScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        // Init Widget GUI
        getScore = findViewById(R.id.getScore);
        // Attached Click listener to Button
        getScore.setOnClickListener(this);
    }

    //display score
    public void onClick(View v) {
        if ((totalScore(getScore)) == 100) {
            Toast.makeText(this, "Your are an expert. You scored : " + totalScore(getScore) + "/100", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "You can do better. You scored : " + totalScore(getScore) + "/100", Toast.LENGTH_LONG).show();
        }
    }


    //Count good answers percentage
    private int totalScore(View v) {
        int score = 0;
        RadioGroup questionOne = findViewById(R.id.first_question);
        if (questionOne.getCheckedRadioButtonId() == R.id.first_answer) {
            score += 15;
        }
        RadioGroup questionTwo = findViewById(R.id.second_question);
        if (questionTwo.getCheckedRadioButtonId() == R.id.second_answer) {
            score += 15;
        }
        RadioGroup questionThree = findViewById(R.id.third_question);
        if (questionThree.getCheckedRadioButtonId() == R.id.third_answer) {
            score += 15;
        }
        EditText questionFour = findViewById(R.id.fourth_question);
        if ("Germany".equalsIgnoreCase(questionFour.getText().toString())) {
            score += 30;
        }
        CheckBox checkBox1 = findViewById(R.id.checkbox_1);
        CheckBox checkBox2 = findViewById(R.id.checkbox_2);
        CheckBox checkBox3 = findViewById(R.id.checkbox_3);
        CheckBox checkBox4 = findViewById(R.id.checkbox_4);
        if (checkBox1.isChecked() && checkBox2.isChecked() && !checkBox3.isChecked() && !checkBox4.isChecked()) {
            score += 25;
        }
        return score;
    }
}
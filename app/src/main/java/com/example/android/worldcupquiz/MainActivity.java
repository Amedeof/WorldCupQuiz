package com.example.android.worldcupquiz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * This app consists in a quiz with 10 questions with initial screen and end screen for score.
 */
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startnow = (Button)findViewById(R.id.start_quiz);

        startnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent start = (new Intent(MainActivity.this, MainActivity2.class));
                startActivity(start);
            }
        });
    }
}

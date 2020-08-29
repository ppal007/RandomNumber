package com.ppal007.randomnumberdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;
    private Button buttonGenerate;

    private Random random;
    private int min,max,outPut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();
        min = 111111;
        max = 999999;

        textViewResult=findViewById(R.id.textViewResult);
        buttonGenerate=findViewById(R.id.buttonGenerateId);

        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                outPut = random.nextInt((max - min) + 1) + min;

                textViewResult.setText("" + outPut);

            }
        });
    }
}
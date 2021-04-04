package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ans1 extends AppCompatActivity {
    /* 15_Manankumar_Domadiya */

    TextView tv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans1);
        tv = (TextView) findViewById(R.id.tv1);
    }

    public void changeRed(View view) {
        tv.setTextColor(0xFFFF0000);
    }

    public void changeGreen(View view) {
        tv.setTextColor(0xFF00FF00);

    }

    public void changeBlue(View view) {
        tv.setTextColor(0xFF0000FF);

    }
}
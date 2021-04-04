package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Ans3_2 extends AppCompatActivity {
    /* 15_Manankumar_Domadiya */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans3_2);
        Bundle bundle = getIntent().getExtras();
        TextView textView = (TextView) findViewById(R.id.textView);
        String name = bundle.getString("name"), surname = bundle.getString("surname");
        textView.setText("Welcome "+name+" "+surname);
        textView.setTextColor(0xFFFF0000);
    }
}
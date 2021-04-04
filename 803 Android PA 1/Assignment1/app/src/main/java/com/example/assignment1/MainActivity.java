package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    /* 15_Manankumar_Domadiya */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ans1(View view) {
        Intent i = new Intent(getApplicationContext(),Ans1.class);
        startActivity(i);

    }
    public void ans2(View view) {
        Intent i = new Intent(getApplicationContext(),Ans2.class);
        startActivity(i);

    }
    public void ans3(View view) {
        Intent i = new Intent(getApplicationContext(),Ans3.class);
        startActivity(i);

    }
    public void ans4(View view) {
        Intent i = new Intent(getApplicationContext(),Ans4.class);
        startActivity(i);

    }
    public void ans5(View view) {
        try {

            Intent i = new Intent(getApplicationContext(),Ans5.class);
            startActivity(i);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
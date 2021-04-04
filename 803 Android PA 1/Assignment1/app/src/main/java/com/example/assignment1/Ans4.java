package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Ans4 extends AppCompatActivity {

    /* 15_Manankumar_Domadiya */

    CheckBox[] checkBoxes;
    TextView tvEatList;
    String text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans4);
        checkBoxes = new CheckBox[4];
        checkBoxes[0] = (CheckBox) findViewById(R.id.chk1);
        checkBoxes[1] = (CheckBox) findViewById(R.id.chk2);
        checkBoxes[2] = (CheckBox) findViewById(R.id.chk3);
        checkBoxes[3] = (CheckBox) findViewById(R.id.chk4);
        tvEatList = (TextView) findViewById(R.id.eatList);
    }

    public void action(View view) {
        int n = 0;
        for (CheckBox ch: checkBoxes) {
            if(ch.isChecked()) {
                n++;
            }

        }
        tvEatList.setText(n+" checkboxes are selected");
    }
}
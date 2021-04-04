package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ans3 extends AppCompatActivity {
    /* 15_Manankumar_Domadiya */

    EditText[] editTexts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans3);
        editTexts = new EditText[2];
        editTexts[0]    = (EditText) findViewById(R.id.name);
        editTexts[1]    = (EditText) findViewById(R.id.surname);
    }

    public void sendData(View view) {
        if(editTexts[0].getText().toString().isEmpty() || editTexts[1].getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Please Fill all the blanks",Toast.LENGTH_LONG).show();
        }else{
        Intent i = new Intent( getApplicationContext() , Ans3_2.class);
            i.putExtra("name",""+editTexts[0].getText());
            i.putExtra("surname",""+editTexts[1].getText());
            startActivity(i);

        }
    }
}
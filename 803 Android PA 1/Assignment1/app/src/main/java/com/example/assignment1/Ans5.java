package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Ans5 extends AppCompatActivity {
    /* 15_Manankumar_Domadiya */

    ListView listView;
    String[] strings = { "અમદાવાદ", "ગાંધીનગર", "અમરેલી", "વડોદરા", "સુરત", "રાજકોટ", "ભાવનગર", "જામનગર", "આણંદ", "નડીઆદ", "પોરબંદર", "જૂનાગઢ", "પાટણ", "ભુજ", "ભરૂચ", "નવસારી"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans5);
        listView = (ListView) findViewById(R.id.cityListView);
        Ans5CustomList ans5CustomList = new Ans5CustomList(this,strings);
        listView.setAdapter(ans5CustomList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view.findViewById(R.id.cityName);
                Toast.makeText(getApplicationContext(),""+textView.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
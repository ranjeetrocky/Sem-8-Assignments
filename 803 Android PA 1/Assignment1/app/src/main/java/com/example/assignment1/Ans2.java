package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

public class Ans2 extends AppCompatActivity {
    /* 15_Manankumar_Domadiya */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans2);
    }

    public void openContextMenu(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent i ;
                switch (item.getItemId()){
                    case R.id.a1 : i = new Intent(getApplicationContext(), Ans1.class);
                        startActivity(i);
                        return true;
                    case R.id.a2 : i = new Intent(getApplicationContext(), Ans2.class);
                        startActivity(i);
                        return true;
                    case R.id.a3 : i = new Intent(getApplicationContext(), Ans3.class);
                        startActivity(i);
                        return true;
                    case R.id.a4 : i = new Intent(getApplicationContext(), Ans5.class);
                        startActivity(i);
                        return true;
                    case R.id.a5 : i = new Intent(getApplicationContext(), Ans5.class);
                        startActivity(i);
                        return true;
                    default : i = new Intent(getApplicationContext(), Ans4.class);
                        startActivity(i);
                        return true;
                }
            }
        });
        popup.inflate(R.menu.popup_menu_ans2);
        popup.show();
    }
    /* 15_Manankumar_Domadiya */
}
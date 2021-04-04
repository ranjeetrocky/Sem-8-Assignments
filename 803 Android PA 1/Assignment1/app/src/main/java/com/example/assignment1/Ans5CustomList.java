package com.example.assignment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Ans5CustomList extends ArrayAdapter<String> {
    /* 15_Manankumar_Domadiya */
    private String[] cityNames;
    Context context;
    public Ans5CustomList(@NonNull Context context,String[] cityNames) {
        super(context, R.layout.ans5_custom_list,cityNames);

        this.cityNames = cityNames;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
    View view = LayoutInflater.from(context).inflate(R.layout.ans5_custom_list,parent,false);
        TextView name = view.findViewById(R.id.cityName);
        name.setText(cityNames[position]);
        return  view;
    }

}

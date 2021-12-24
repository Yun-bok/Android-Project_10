package com.example.chapter6_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class Chapter6_10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter6_10);

        String[] items = {"CSI-뉴욕","CSI-라스베가스","CSI-마이애미","Friends","Lost"};

        AutoCompleteTextView auto =(AutoCompleteTextView)findViewById(R.id.auto);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line);
        auto.setAdapter(adapter);//연결시켜줌

        MultiAutoCompleteTextView mult1 =(MultiAutoCompleteTextView)findViewById(R.id.mult1);
        MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
        mult1.setTokenizer(token);
        mult1.setAdapter(adapter);
    }
}
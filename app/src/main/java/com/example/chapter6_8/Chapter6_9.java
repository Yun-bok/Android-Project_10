package com.example.chapter6_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;

public class Chapter6_9 extends AppCompatActivity {

    Button button,button2;
    Chronometer chronometer;
    TimePicker timepicker;
    RadioButton rdb1,rdb2;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter6_9);
        setTitle("날짜/시간 예약");

        Button button  = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);

        Chronometer chronometer = findViewById(R.id.chronometer);

        TimePicker timepicker = findViewById(R.id.timepicker);

        RadioGroup rg = findViewById(R.id.rg);



    }
}
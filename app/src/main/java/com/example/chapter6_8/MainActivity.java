package com.example.chapter6_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button btn_red,btn_blue,btn_green,btn_turn;
    LinearLayout layout_red,layout_blue,layout_green;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("프레임레이아웃 다루기 예제");

        Button btn_red = findViewById(R.id.btn_red);
        Button btn_blue = findViewById(R.id.btn_blue);
        Button btn_green = findViewById(R.id.btn_green);


        LinearLayout layout_red = findViewById(R.id.layout_red);
        LinearLayout layout_blue = findViewById(R.id.layout_blue);
        LinearLayout layout_green = findViewById(R.id.layout_green);



        btn_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_red.setVisibility(View.VISIBLE);
                layout_blue.setVisibility(View.INVISIBLE);
                layout_green.setVisibility(View.INVISIBLE);

            }
        });
        btn_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_red.setVisibility(View.INVISIBLE);
                layout_blue.setVisibility(View.VISIBLE);
                layout_green.setVisibility(View.INVISIBLE);
            }
        });
        btn_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_red.setVisibility(View.INVISIBLE);
                layout_blue.setVisibility(View.INVISIBLE);
                layout_green.setVisibility(View.VISIBLE);
            }
        });
    }
}
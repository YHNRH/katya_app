package com.example.katyaappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ListScreen extends AppCompatActivity {

    TextView tw0;

    TextView tw1_1;
    TextView tw3_1;
    TextView tw8_1;
    TextView tw11_1;

    TextView tw1;
    TextView tw2;
    TextView tw3;
    TextView tw4;
    TextView tw5;
    TextView tw6;
    TextView tw7;
    TextView tw8;
    TextView tw9;
    TextView tw10;
    TextView tw11;
    TextView tw12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_screen);
        tw0 = findViewById(R.id.p0);
        tw3_1= findViewById(R.id.p3_1);
        tw1_1= findViewById(R.id.p1_1);
        tw8_1 = findViewById(R.id.p8_1);
        tw11_1 = findViewById(R.id.p11_1);

        tw1 = findViewById(R.id.p1);
        tw2= findViewById(R.id.p2);
        tw3 = findViewById(R.id.p3);
        tw4 = findViewById(R.id.p4);
        tw5 = findViewById(R.id.p5);
        tw6 = findViewById(R.id.p6);
        tw7 = findViewById(R.id.p7);
        tw8 = findViewById(R.id.p8);
        tw9 = findViewById(R.id.p9);
        tw10 = findViewById(R.id.p10);
        tw11 = findViewById(R.id.p11);
        tw12 = findViewById(R.id.p12);
        tw1.setText(R.string.nobj1);
        tw2.setText(R.string.nobj2);
        tw3.setText(R.string.nobj3);
        tw4.setText(R.string.nobj4);
        tw5.setText(R.string.nobj5);
        tw6.setText(R.string.nobj6);
        tw7.setText(R.string.nobj7);
        tw8.setText(R.string.nobj8);
        tw9.setText(R.string.nobj9);
        tw10.setText(R.string.nobj10);
        tw11.setText(R.string.nobj11);
        tw12.setText(R.string.nobj12);

        tw0.setText("Характеристика маршрута");
        tw1_1.setText("Информация по маршруту 1");
        tw3_1.setText("Информация по маршруту 2");
        tw8_1.setText("Информация по маршруту 3");
        tw11_1.setText("Информация по маршруту 4");
    }
}
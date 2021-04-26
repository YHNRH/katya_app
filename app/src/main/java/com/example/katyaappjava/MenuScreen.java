package com.example.katyaappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
    }
    public void start(View v){
        startActivity(new Intent(this, PointScreen.class));
    }

    public void toList(View v){
        startActivity(new Intent(this, ListScreen.class));
    }

    public void toMap(View v){
        startActivity(new Intent(this, MapsActivity.class));
    }
}
package com.example.katyaappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoadScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Thread thread = new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (Exception e){}
            startActivity(new Intent(this, MenuScreen.class));
        });
        thread.start();
        setContentView(R.layout.activity_load_screen);
    }
}
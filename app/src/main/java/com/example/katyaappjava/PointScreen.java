package com.example.katyaappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PointScreen extends AppCompatActivity {
    private int obj =1;
    TextView tw;
    ImageView iw;
    TextView next;
    TextView prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_screen);
        tw = findViewById(R.id.text);
        iw = findViewById(R.id.img);
        next = findViewById(R.id.next);
        prev = findViewById(R.id.previous);
        setTextAndImg();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj!=12) {
                    obj++;
                    setTextAndImg();
                }
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj!=1) {
                    obj--;
                    setTextAndImg();
                }
            }
        });

    }
    private void setTextAndImg(){
        switch (obj){
            case 1:
                tw.setText(R.string.obj1);
                iw.setImageResource(R.drawable.obj1);
                break;

            case 2:
                tw.setText(R.string.obj2);
                //  iw.setImageResource(R.drawable.obj2);
                break;

            case 3:
                tw.setText(R.string.obj3);
                //     iw.setImageResource(R.drawable.obj3);
                break;

            case 4:
                tw.setText(R.string.obj4);
                //     iw.setImageResource(R.drawable.obj4);
                break;

            case 5:
                tw.setText(R.string.obj5);
                //     iw.setImageResource(R.drawable.obj5);
                break;

            case 6:
                tw.setText(R.string.obj6);
                //      iw.setImageResource(R.drawable.obj6);
                break;

            case 7:
                tw.setText(R.string.obj7);
                //    iw.setImageResource(R.drawable.obj7);
                break;

            case 8:
                tw.setText(R.string.obj8);
                //     iw.setImageResource(R.drawable.obj8);
                break;

            case 9:
                tw.setText(R.string.obj9);
                //     iw.setImageResource(R.drawable.obj9);
                break;

            case 10:
                tw.setText(R.string.obj10);
                //     iw.setImageResource(R.drawable.obj10);
                break;

            case 11:
                tw.setText(R.string.obj11);
                //     iw.setImageResource(R.drawable.obj11);
                break;
            case 12:
                tw.setText(R.string.obj12);
                //      iw.setImageResource(R.drawable.obj12);
                break;
        }


    }
}
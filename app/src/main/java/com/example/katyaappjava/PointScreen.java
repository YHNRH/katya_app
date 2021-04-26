package com.example.katyaappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PointScreen extends AppCompatActivity {
    private int obj = 0;
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
                    switch (obj){
                        case 1:
                            obj=101;
                            break;
                        case 101:
                            obj=2;
                            break;
                        case 3:
                            obj=301;
                            break;
                        case 301:
                            obj=4;
                            break;
                        case 8:
                            obj = 801;
                            break;
                        case 801:
                            obj = 9;
                        case 11:
                            obj = 1101;
                            break;
                        case 1101:
                            obj = 12;
                            break;
                        default:
                            obj++;
                    }
                    setTextAndImg();
                }
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj!=0) {
                    switch (obj){
                        case 2:
                            obj=101;
                            break;
                        case 101:
                            obj=1;
                            break;
                        case 4:
                            obj=301;
                            break;
                        case 301:
                            obj=3;
                            break;
                        case 9:
                            obj = 801;
                            break;
                        case 801:
                            obj = 8;
                        case 12:
                            obj = 1101;
                            break;
                        case 1101:
                            obj = 11;
                            break;
                        default:
                            obj--;
                    }setTextAndImg();
                }
            }
        });

    }
    private void setTextAndImg(){
        switch (obj){
            case 0:
                tw.setText(R.string.obj0);
                iw.setImageResource(R.drawable.obj0);
                break;
            case 101:
                tw.setText(R.string.obj1_1);
                iw.setImageResource(R.drawable.obj1_1);
                break;

            case 301:
                tw.setText(R.string.obj3_1);
                iw.setImageResource(R.drawable.obj3_1);
                break;

            case 801:
                tw.setText(R.string.obj8_1);
                iw.setImageResource(R.drawable.obj8_1);
                break;

            case 1101:
                tw.setText(R.string.obj11_1);
                iw.setImageResource(R.drawable.obj11_1);
                break;

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
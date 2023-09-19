package com.itproger.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivitySposob extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sposob);
    }

    //Сюда в конечном итоге ссылаются все кнопки. Переход на сл активити
    public void AllSposobs() {
        Intent intent = new Intent(this, ActivityOpisanie.class);
        startActivity(intent);
    }

    //Способ 1
    public void onClick_to_KnopSposob1(View view){
        Nom.boolOpisSp1 = true;
        AllSposobs();
    }
    //Способ 2
    public void onClick_to_KnopSposob2(View view){
        Nom.boolOpisSp2 = true;
        AllSposobs();
    }
    //Способ 3
    public void onClick_to_KnopSposob3(View view){
        Nom.boolOpisSp3 = true;
        AllSposobs();
    }
    //Способ 4
    public void onClick_to_KnopSposob4(View view){
        Nom.boolOpisSp4 = true;
        AllSposobs();
    }
    //Способ 5
    public void onClick_to_KnopSposob5(View view){
        Nom.boolOpisSp5 = true;
        AllSposobs();
    }
}
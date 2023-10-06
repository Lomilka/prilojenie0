package com.itproger.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityRezultat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezultat);


        TextView TextRezultat = findViewById(R.id.TextRezultat);
        TextRezultat.setText("Победитель - кандидат "+Ball.otwet); //////////////////// в 1 и в 2 одинаковая пустота
        TextView TextUraMolodec = findViewById(R.id.TextUraMolodec);
        TextUraMolodec.setText("Ураа, "+Ball.otwet+" молодец!"); ////////////
    }
    public void vMenu(View view){
        Intent intent = new Intent(this,ActivitySposob.class);
        Nom.sposobInt = 0;
        startActivity(intent);
    }
}
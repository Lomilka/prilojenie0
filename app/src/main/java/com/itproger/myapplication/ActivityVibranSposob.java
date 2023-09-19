package com.itproger.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityVibranSposob extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibran_sposob);

        if (Nom.sposobInt==1){
            TextView TextUra = findViewById(R.id.TextUra);
            TextUra.setText("Ура. Выбран способ №1.");
        }else if (Nom.sposobInt==2){
            TextView TextUra = findViewById(R.id.TextUra);
            TextUra.setText("Ура. Выбран способ №2.");
        }else if (Nom.sposobInt==3){
            TextView TextUra = findViewById(R.id.TextUra);
            TextUra.setText("Ура. Выбран способ №3.");
        }else if (Nom.sposobInt==4){
            TextView TextUra = findViewById(R.id.TextUra);
            TextUra.setText("Ура. Выбран способ №4.");
        }else if (Nom.sposobInt==5){
            TextView TextUra = findViewById(R.id.TextUra);
            TextUra.setText("Ура. Выбран способ №5.");
        }

    }
}
package com.itproger.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class ActivityVibranSposob extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibran_sposob);

        if (Nom.sposobInt==1){
            TextView TextUra = findViewById(R.id.TextUra);
            TextUra.setText("Ура. Выбран способ №1.");

            new CountDownTimer(3000, 1000){
                public void onFinish() {
                    if(Nom.predGolosa){goToActivityShoudISave();}
                    else{goToAActivityVvodGolosov();}
                }
                public void onTick(long millisUntilFinished) {}// millisUntilFinished   The amount of time until finished.
            }.start();



        }else if (Nom.sposobInt==2){
            TextView TextUra = findViewById(R.id.TextUra);
            TextUra.setText("Ура. Выбран способ №2.");

            new CountDownTimer(3000, 1000){
                public void onFinish() {
                    if(Nom.predGolosa){goToActivityShoudISave();}
                    else{goToAActivityVvodGolosov();}
                }
                public void onTick(long millisUntilFinished) {}// millisUntilFinished   The amount of time until finished.
            }.start();



        }else if (Nom.sposobInt==3){
            TextView TextUra = findViewById(R.id.TextUra);
            TextUra.setText("Ура. Выбран способ №3.");

            new CountDownTimer(3000, 1000){
                public void onFinish() {
                    goToActivityPered3i4_1();
                }
                public void onTick(long millisUntilFinished) {}// millisUntilFinished   The amount of time until finished.
            }.start();



        }else if (Nom.sposobInt==4){
            TextView TextUra = findViewById(R.id.TextUra);
            TextUra.setText("Ура. Выбран способ №4.");

            new CountDownTimer(3000, 1000){
                public void onFinish() {
                    goToActivityPered3i4_1();
                }
                public void onTick(long millisUntilFinished) {}// millisUntilFinished   The amount of time until finished.
            }.start();



        }else if (Nom.sposobInt==5){
            TextView TextUra = findViewById(R.id.TextUra);
            TextUra.setText("Ура. Выбран способ №5.");

            new CountDownTimer(3000, 1000){
                public void onFinish() {
                    if(Nom.predGolosa){goToActivityShoudISave();}
                    else{goToAActivityVvodGolosov();}
                }
                public void onTick(long millisUntilFinished) {}// millisUntilFinished   The amount of time until finished.
            }.start();
        }
    }
    public void goToAActivityVvodGolosov(){
        Intent intentVvodGolosov = new Intent(this, ActivityVvodGolosov.class);
        startActivity(intentVvodGolosov);
    }
    public void goToActivityShoudISave(){
        Intent intentShoudISave = new Intent(this, ActivityShoudISave.class);
        startActivity(intentShoudISave);
    }
    public void goToActivityPered3i4_1(){
        Intent intentPered3i4_1 = new Intent(this, ActivityPered3i4_1.class);
        startActivity(intentPered3i4_1);
    }
}
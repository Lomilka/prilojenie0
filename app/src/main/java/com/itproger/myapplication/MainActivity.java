package com.itproger.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int count_of_KKnopDalshe0 = 0;
    public void onClick_to_KnopDalshe0(View view){
        if (count_of_KKnopDalshe0==0){ //Первое нажатие
            //Сделать изображение iSoft прозрачным
            ImageView iSoft = findViewById(R.id.iSoft);
            iSoft.setAlpha(0f);
            //Сделать изображение privet2d непрозрачным
            ImageView privet2d = findViewById(R.id.privet2d);
            privet2d.setAlpha(1f);
            //Сделать изображение privet2d непрозрачным
            ImageView Balloon1 = findViewById(R.id.Balloon1);
            Balloon1.setAlpha(1f);
            //Сделать текст privet2d непрозрачным
            TextView TextLomilka = findViewById(R.id.TextLomilka);
            TextLomilka.setAlpha(1f);
            //Поменять текст в кнопке
            TextView KnopDalshe0 = findViewById(R.id.KnopDalshe0);
            KnopDalshe0.setText("ОК");


            count_of_KKnopDalshe0 = 1;

        }else if (count_of_KKnopDalshe0==1){ //Второе нажатие
            //Сделать текст privet2d прозрачным
            TextView TextLomilka = findViewById(R.id.TextLomilka);
            TextLomilka.setAlpha(0f);
            //Сделать текст privet2d непрозрачным
            TextView TextProvodnik = findViewById(R.id.TextProvodnik);
            TextProvodnik.setAlpha(1f);
            //Поменять текст в кнопке
            TextView KnopDalshe0 = findViewById(R.id.KnopDalshe0);
            KnopDalshe0.setText("Хорошо");

            count_of_KKnopDalshe0 = 2;

        }else if (count_of_KKnopDalshe0==2){ //Третье нажатие
        //Переход на выбор способа
            Intent intent = new Intent(this, ActivitySposob.class);
            startActivity(intent);
        }
    }
}
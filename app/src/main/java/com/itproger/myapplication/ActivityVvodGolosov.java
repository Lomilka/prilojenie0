package com.itproger.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

class Ttext{public static TextView TextVvediteGolos;}

public class ActivityVvodGolosov extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vvod_golosov);
    }
    @SuppressLint("SetTextI18n")
    @Override
    protected void onStart()
    {
        super.onStart();
        Ttext.TextVvediteGolos = findViewById(R.id.textVvediteGolos);
        Ttext.TextVvediteGolos.setText(new StringBuilder().append("Введите, сколько голосов получил кандидат ").append(Ball.ballA.ima).append("?").toString());
    }
    @SuppressLint("SetTextI18n")
    public void Vvesti(View view){
        if(Nom.sposobInt!=5){
            if(Nom.vvod==2){
                TextInputLayout TextInput = findViewById(R.id.TextInput);
                Editable text = TextInput.getEditText().getText();
                Ball.ballA.znach = Integer.valueOf(String.valueOf(text));
                Nom.vvod=3;

                TextView TextVvediteGolos = findViewById(R.id.textVvediteGolos);
                TextVvediteGolos.setText("Введите, сколько голосов получил кандидат "+Ball.ballB.ima+"?");
            }else if(Nom.vvod==3){
                TextInputLayout TextInput = findViewById(R.id.TextInput);
                Editable text = TextInput.getEditText().getText();
                Ball.ballB.znach = Integer.valueOf(String.valueOf(text));
                Nom.vvod=4;
                Toast toast = Toast.makeText(this, "Мы дошли до неотображаемого б",Toast.LENGTH_LONG);
                toast.show();

                TextView TextVvediteGolos = findViewById(R.id.textVvediteGolos);
                TextVvediteGolos.setText("Введите, сколько голосов получил кандидат "+Ball.ballC.ima+"?");
            }else if(Nom.vvod==4){
                TextInputLayout TextInput = findViewById(R.id.TextInput);
                Editable text = TextInput.getEditText().getText();
                Ball.ballC.znach = Integer.valueOf(String.valueOf(text));
                Nom.vvod=5;

                TextView TextVvediteGolos = findViewById(R.id.textVvediteGolos);
                TextVvediteGolos.setText("Введите, сколько голосов получил кандидат "+Ball.ballD.ima+"?");
            }else if(Nom.vvod==5){
                TextInputLayout TextInput = findViewById(R.id.TextInput);
                Editable text = TextInput.getEditText().getText();
                Ball.ballD.znach = Integer.valueOf(String.valueOf(text));

                VvodGolosovOkonchen();
            }









        }else if(Nom.sposobInt==5) {
            Ball.var5(); //таблицы tablNach и tablVtor внутри all
            osn5();
            VvodGolosovOkonchen();
            Toast toast666 = Toast.makeText(getApplicationContext(),
                    "ввод окончен", Toast.LENGTH_SHORT);
            toast666.show();
        }
    }



    public void VvodGolosovOkonchen(){
        Nom.vvod = 2;
        Nom.predGolosa=true;
        if(Nom.sposobInt==1){
            vars1();
        }else if (Nom.sposobInt==5){
            vars5();
        }else if(Nom.sposobInt==2){
            vars2();
        }
    }
    public void vars1(){
        Ball.var1();
        Intent intentVars15 = new Intent(this,ActivityRezultat.class); //переход на Результат
        startActivity(intentVars15);
    }
    public void vars5(){
        Intent intentVars15 = new Intent(this,ActivityRezultat.class); //переход на Результат
        startActivity(intentVars15);
    }
    public void vars2(){
        Ball.var2();
        Intent intentVars2 = new Intent(this,ActivityVar22.class); //переход на активитивар22
        startActivity(intentVars2);
    }


    public void osn5(){
        for (int k = 0; k < Ball.kolvoTurov; k++) {//-1

            Toast toast1 = Toast.makeText(getApplicationContext(),
                    "1 for", Toast.LENGTH_SHORT);
            toast1.show();

            for (int prox = 0; prox<Ball.kolvoTurov; prox++){

                TextInputLayout TextInput = findViewById(R.id.TextInput);
                Editable text = TextInput.getEditText().getText();
                Ball.all[k][prox].znach = Integer.valueOf(String.valueOf(text));
                if(prox+1<Ball.kolvoTurov){
                    TextView TextVvediteGolos = findViewById(R.id.textVvediteGolos);
                    TextVvediteGolos.setText("Введите, сколько голосов получил кандидат "+Ball.all[k][prox].ima+"?");

                    Toast toast2 = Toast.makeText(getApplicationContext(),
                            "2 for", Toast.LENGTH_SHORT);
                    toast2.show();
                }
            }

            int lox = 0;
            for (int min = 1; min < Ball.spisok.length; min++) { //Находим лоха (минимум)
                if (Ball.all[k][min] != null) {
                    if (Ball.all[k][min].znach < Ball.all[k][lox].znach) {
                        System.out.println("обнаружен новый минимум, это " + Ball.all[k][min].ima);
                        lox = Ball.whatID(Ball.all[k], Ball.all[k][min]); //Нам нужно id лоха
                    }
                } else {
                    Ball.countOfNulls = Ball.countOfNulls + 1; //да-да-да, костыль. Он тут чтоб А ЕСЛИ БАЛЛЫ РАВНЫ А А А задел на будущее так сказатб.
                }
            }
            System.out.println("айди лоха " + lox);


            if (lox > 0) {
                System.out.println("id лоха > 0 --> Всё, что ДО него, щас сохраним");
                if (k < Ball.kolvoTurov - 1) {
                    for (int t = 0; t < lox; t++) {
                        Ball.all[k + 1][t] = Ball.all[k][t];
                    }
                } else {
                    Ball.otwet = Ball.all[Ball.kolvoTurov - 1][0].ima;
                }
            }

            if (lox < (Ball.spisok.length - 1) - Ball.countOfNulls) {
                System.out.println("id лоха < spisok.length-1 - *Число нулей в конце списка* --> Всё, что ПОСЛЕ него, щас сохраним");
                if (k < Ball.kolvoTurov - 1) {
                    System.out.println("Начнём сохранять с id " + (lox + 1));
                    for (int tt = lox + 1; tt < Ball.spisok.length; tt++) {
                        System.out.println("id сохраняемого = " + tt);
                        if (Ball.all[k][tt] != null) {
                            Ball.all[k + 1][tt - 1] = Ball.all[k][tt];
                        }
                    }
                } else {
                    Ball.otwet = Ball.all[Ball.kolvoTurov - 1][1].ima;
                }
            }

            //countOfNulls=countOfNulls+1; //да-да-да, костыль. Ну блин я не знаю, как динамически сокращать размер массива который не ArrayList
            for (int n = 0; n < Ball.spisok.length; n++) { //Обнуление всех элементов текущего списка
                Ball.all[k][n] = null;
            }
        }
    }
}
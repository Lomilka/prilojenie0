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
        Ball.var5();
        Intent intentVars15 = new Intent(this,ActivityRezultat.class); //переход на Результат
        startActivity(intentVars15);
    }
    public void vars2(){
        Ball.var2();
        Intent intentVars2 = new Intent(this,ActivityVar22.class); //переход на активитивар22
        startActivity(intentVars2);
    }
}
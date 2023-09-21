package com.itproger.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class ActivityVvodGolosov extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vvod_golosov);

        TextView TextVvediteGolos = findViewById(R.id.textVvediteGolos);
        TextVvediteGolos.setText("Введите, сколько голосов получил кандидат "+Ball.ballA.ima+"?");

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
        Intent intent = new Intent(this,ActivityRezultat.class); //переход на 1 2 либо 5 в зависимости от Nom.sposobInt
        Nom.vvod = 2;
        Nom.predGolosa=true;
        startActivity(intent);
    }
}
//Осуществить ввод голосов в Nom (или в Ball)
//Nom.predGolosa=true
//Перейти на 1 2 или 3 в зав от Nom.sposobInt
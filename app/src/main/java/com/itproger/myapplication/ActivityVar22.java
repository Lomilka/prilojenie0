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

public class ActivityVar22 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_var22);

        TextView TextNowSravni = findViewById(R.id.TextNowSravni);
        //TextNowSravni.setText("Требуются новые данные. Попросите участников проголосовать между кандидатом "+Ball.twoTur[0].ima+" и кандидатом "+Ball.twoTur[1].ima);
        TextView knopOkDopolnu = findViewById(R.id.knopOkDopolnu);
        knopOkDopolnu.setText("Оки");
    }
    @SuppressLint("SetTextI18n")
    public void oki(View view){
        if(Nom.vvod==2){
            Nom.vvod=3;
            TextView knopOkDopolnu = findViewById(R.id.knopOkDopolnu);
            knopOkDopolnu.setText("Ввести");
            TextInputLayout TextInput22 = findViewById(R.id.TextInput34);
            TextInput22.setAlpha(1);

            TextView TextNowSravni = findViewById(R.id.TextNowSravni);
            TextNowSravni.setText("Введите, сколько голосов получил кандидат "+Ball.twoTur[0].ima+"?");
        }else if(Nom.vvod==3){
            TextInputLayout TextInput22 = findViewById(R.id.TextInput34);
            Editable text22 = TextInput22.getEditText().getText();
            Ball.twoTur[0].znach = Integer.parseInt(String.valueOf(text22));
            Toast.makeText(this, Ball.twoTur[0].ima, Toast.LENGTH_LONG).show();

            Nom.vvod=4;
            TextView TextNowSravni = findViewById(R.id.TextNowSravni);
            TextNowSravni.setText("Введите, сколько голосов получил кандидат "+Ball.twoTur[1].ima+"?");
        }else if(Nom.vvod==4){
            TextInputLayout TextInput22 = findViewById(R.id.TextInput34);
            Editable text22 = TextInput22.getEditText().getText();
            Ball.twoTur[1].znach = Integer.parseInt(String.valueOf(text22));
            Toast.makeText(this, Ball.twoTur[1].ima, Toast.LENGTH_LONG).show();

            Ball.var22();

            Nom.vvod = 2;
            Intent intent = new Intent(this,ActivityRezultat.class); //переход на Результат
            startActivity(intent);
        }
    }
}
//Не, ну СНАЧАЛА запустить вар22, а ПОТОМ вписать данные НЕОБХОДИМЫЕ для вар22 это конечно гениально..
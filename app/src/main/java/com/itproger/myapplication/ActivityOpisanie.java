package com.itproger.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityOpisanie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opisanie);

        if(Nom.boolOpisSp1){ //Если способ 1
            ImageView mem1sp = findViewById(R.id.mem1sp);
            /////////////////////////////////////////////////////mem1sp.setAlpha(1f);
            Nom.tekMem = mem1sp;
            Nom.tekMem.setAlpha(1f);

            TextView knopSposob = findViewById(R.id.knopSposob);
            knopSposob.setText("Способ №1");
            TextView TextOpisaniePodrobno = findViewById(R.id.TextOpisaniePodrobno);
            TextOpisaniePodrobno.setText("Победитель определяется по большинству первых мест в первом (и единственном) туре");
            TextView TextPreduprejdenie2 = findViewById(R.id.TextPreduprejdenie2);
            TextPreduprejdenie2.setText("!Требуются готовые данные опроса голосующих");

            Nom.boolOpisSp1 = false;
            Nom.sposobInt = 1;


        }else if(Nom.boolOpisSp2){ //Если способ 2
            ImageView mem2sp = findViewById(R.id.mem2sp);
            Nom.tekMem = mem2sp;
            Nom.tekMem.setAlpha(1f);

            TextView knopSposob = findViewById(R.id.knopSposob);
            knopSposob.setText("Способ №2");
            TextView TextOpisaniePodrobno = findViewById(R.id.TextOpisaniePodrobno);
            TextOpisaniePodrobno.setText("Победитель определяется по большинству первых мест в первом туре, лучшие два выходят во второй (финальный) тур");
            TextView TextPreduprejdenie2 = findViewById(R.id.TextPreduprejdenie2);
            TextPreduprejdenie2.setText("!Требуются готовые данные опроса голосующих");

            Nom.boolOpisSp2 = false;
            Nom.sposobInt = 2;


        }else if(Nom.boolOpisSp3){ //Если способ 3
            ImageView mem3sp = findViewById(R.id.mem3sp);
            Nom.tekMem = mem3sp;
            Nom.tekMem.setAlpha(1f);;

            TextView knopSposob = findViewById(R.id.knopSposob);
            knopSposob.setText("Способ №3");
            TextView TextOpisaniePodrobno = findViewById(R.id.TextOpisaniePodrobno);
            TextOpisaniePodrobno.setText("Победитель определяется по системе Кондорсе, в результате парных сравнений");
            TextView TextPreduprejdenie2 = findViewById(R.id.TextPreduprejdenie2);
            TextPreduprejdenie2.setText("!Понадобится личное участие каждого голосующего");

            Nom.boolOpisSp3 = false;
            Nom.sposobInt = 3;


        }else if(Nom.boolOpisSp4){ //Если способ 4
            ImageView mem4sp = findViewById(R.id.mem4sp);
            Nom.tekMem = mem4sp;
            Nom.tekMem.setAlpha(1f);

            TextView knopSposob = findViewById(R.id.knopSposob);
            knopSposob.setText("Способ №4");
            TextView TextOpisaniePodrobno = findViewById(R.id.TextOpisaniePodrobno);
            TextOpisaniePodrobno.setText("Победитель определяется по по системе Борда, набирая баллы за места");
            TextView TextPreduprejdenie2 = findViewById(R.id.TextPreduprejdenie2);
            TextPreduprejdenie2.setText("!Понадобится личное участие каждого голосующего");

            Nom.boolOpisSp4 = false;
            Nom.sposobInt = 4;


        }else if(Nom.boolOpisSp5){ //Если способ 5
            ImageView mem5sp = findViewById(R.id.mem5sp);
            Nom.tekMem = mem5sp;
            Nom.tekMem.setAlpha(1f);

            TextView knopSposob = findViewById(R.id.knopSposob);
            knopSposob.setText("Способ №5");
            TextView TextOpisaniePodrobno = findViewById(R.id.TextOpisaniePodrobno);
            TextOpisaniePodrobno.setText("Победитель определяется по многотуровой системе отсеивания");
            TextView TextPreduprejdenie2 = findViewById(R.id.TextPreduprejdenie2);
            TextPreduprejdenie2.setText("!Требуются готовые данные опроса голосующих");

            Nom.boolOpisSp5 = false;
            Nom.sposobInt = 5;
        }
    }

    //Кнопка Выбрать
    public void onClick_to_KnopDalshe3(View view){
        Nom.tekMem.setAlpha(0f);
        Intent intentD = new Intent(this, ActivityVibranSposob.class);
        startActivity(intentD);
    }
    //Кнопка назад
    public void onClick_to_knopNazad1(View view){
        Nom.tekMem.setAlpha(0f);
        Intent intentN = new Intent(this, ActivitySposob.class);
        startActivity(intentN);
    }
}
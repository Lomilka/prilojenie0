package com.itproger.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityShoudISave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoud_isave);
        Toast toast = Toast.makeText(this, "Hello Android!",Toast.LENGTH_LONG);
        toast.show();

        TextView TextPredKanA = findViewById(R.id.TextPredKanA);
        TextPredKanA.setText(Ball.ballA.ima);
        TextView TextPredBallKanA = findViewById(R.id.TextPredBallKanA);
        TextPredBallKanA.setText(String.valueOf(Ball.ballA.znach));

        TextView TextPredKanB = findViewById(R.id.TextPredKanB);
        TextPredKanB.setText(Ball.ballB.ima);
        TextView TextPredBallKanB = findViewById(R.id.TextPredBallKanB);
        TextPredBallKanB.setText(String.valueOf(Ball.ballB.znach));

        TextView TextPredKanC = findViewById(R.id.TextPredKanC);
        TextPredKanC.setText(Ball.ballC.ima);
        TextView TextPredBallKanC = findViewById(R.id.TextPredBallKanC);
        TextPredBallKanC.setText(String.valueOf(Ball.ballC.znach));

        TextView TextPredKanD = findViewById(R.id.TextPredKanD);
        TextPredKanD.setText(Ball.ballD.ima);
        TextView TextPredBallKanD = findViewById(R.id.TextPredBallKanD);
        TextPredBallKanD.setText(String.valueOf(Ball.ballD.znach));

    }
    public void ostavKakEst(View view){
        Intent intentDaSave = new Intent(this, ActivityRezultat.class); //переход на 1 2 либо 5 в зависимости от Nom.sposobInt
        startActivity(intentDaSave);
    }
    public void ochistit_i_na_vvod(View view){
        Intent intentNotSave = new Intent(this, ActivityVvodGolosov.class);
        Ball.ballA.ima="";
        Ball.ballA.znach=0;
        Ball.ballB.ima="";
        Ball.ballB.znach=0;
        Ball.ballC.ima="";
        Ball.ballC.znach=0;
        Ball.ballD.ima="";
        Ball.ballD.znach=0;
        Nom.predGolosa = false;
        startActivity(intentNotSave);
    }
}
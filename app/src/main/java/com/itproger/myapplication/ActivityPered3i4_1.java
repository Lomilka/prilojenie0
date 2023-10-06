package com.itproger.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityPered3i4_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pered3i41);
    }
    public void na34(View view){
        Intent intentNa3 = new Intent(this, ActivityVar3.class);
        Intent intentNa4 = new Intent(this, ActivityVar4.class);
        if(Nom.sposobInt==3){startActivity(intentNa3);}
        else if(Nom.sposobInt==4){startActivity(intentNa4);};
    }
}
//Осуществить ввод числа голосующих в класс Ball и ВСЁ
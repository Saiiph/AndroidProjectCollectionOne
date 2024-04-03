package com.example.androidprojectcollection;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;


public class ButtonExercise extends AppCompatActivity {
    ConstraintLayout layout;
    Button btnToast;
    Button btnDisp;
    Button btnClose;
    Button btnBG;
    Button btnBTBG;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(
                        ButtonExercise.this,//context
                        CloseOpen.class//destination activity
                );
                startActivity(intent1);
            }
        });

        btnToast=findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonExercise.this, "BAYOT", Toast.LENGTH_SHORT).show();
            }
        });

        btnBG=findViewById(R.id.btnBgCol);
        layout=findViewById(R.id.buttonLayout);
        btnBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor(ButtonExercise.this, android.R.color.holo_orange_light));
                Random random=new Random();
                int color= Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
                layout.setBackgroundColor(color);
            }
        });

        btnBTBG=findViewById(R.id.btnBtnCol);
        btnBTBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                int color= Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
                btnBTBG.setBackgroundColor(color);
            }
        });

        btnDisp=findViewById(R.id.btnGhost);
        btnDisp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDisp.setVisibility(View.INVISIBLE);
            }
        });
    }

}

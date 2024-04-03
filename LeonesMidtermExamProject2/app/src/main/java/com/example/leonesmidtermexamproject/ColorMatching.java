package com.example.leonesmidtermexamproject;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorMatching extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;


    ArrayList<Button> buttonArrayList=new ArrayList<>();
    ArrayList<Color> colorArrayList=new ArrayList<>();

    Color c1=Color.valueOf(0,255,0,100);
    Color c2=Color.valueOf(255,0,0,100);
    Color c3=Color.valueOf(0,0,255,100);

    int[]gameState={3,3,3,3,3,3,3,3,3,3};
    int counter=0;
    Button btnRet;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colormatching);

        initButton();
        fillButtonArrayList();
        fillColorArrayList();
    }
    private void initButton(){
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
        btn7=findViewById(R.id.button7);
        btn8=findViewById(R.id.button8);
        btn9=findViewById(R.id.button9);
        btnRet=findViewById(R.id.btnReturn);
    }
    private void fillButtonArrayList(){
        buttonArrayList.add(btn1);
        buttonArrayList.add(btn2);
        buttonArrayList.add(btn3);
        buttonArrayList.add(btn4);
        buttonArrayList.add(btn5);
        buttonArrayList.add(btn6);
        buttonArrayList.add(btn7);
        buttonArrayList.add(btn8);
        buttonArrayList.add(btn9);
    }
    private void fillColorArrayList(){
        colorArrayList.add(c1);
        colorArrayList.add(c2);
        colorArrayList.add(c3);
    }

    private void setButtonArrayClickers(){
        for(Button button:buttonArrayList){
            button.setOnClickListener(v ->{
                int index=buttonArrayList.indexOf(button);
                int left=index-1;
                int right = index+1;
                int up=index-3;
                int down=index+3;
            });
        }
    }


}

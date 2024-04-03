package com.example.androidprojectcollection;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;
import java.util.Arrays;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorMatching extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button btnRet;

    ArrayList<Button> buttonArrayList=new ArrayList<>();
    ArrayList<Color> colorArrayList=new ArrayList<>();
    int[]gameState={3,3,3,3,3,3,3,3,3,3};
    int counter=0;
    Color c1=Color.valueOf(0,255,0,100);
    Color c2=Color.valueOf(255,0,0,100);
    Color c3=Color.valueOf(0,0,255,100);


    
    @RequiresApi(api = Build.VERSION_CODES.O)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colormatching);

        initButton();
        fillButtonArrayList();
        fillColorArrayList();
        setButtonArrayClickers();
        restartGame();

    }
    private void initButton(){
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.btnConnect);
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

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void setButtonArrayClickers(){
        for(Button button:buttonArrayList){
            button.setOnClickListener(v ->{
                int index=buttonArrayList.indexOf(button);
                int left=index-1;
                int right = index+1;
                int up=index-3;
                int down=index+3;

                if(counter>2){
                    counter=0;
                }

                if((index+1)%3!=0){
                    changeCellColor(right);
                }
                if(index%3!=0){
                    changeCellColor(left);
                }
                changeCellColor(up);
                changeCellColor(down);

                counter++;

                if(checkAllcellsMatchingColor()){
                    endgame();
                }
            });
        }
        btnRet.setOnClickListener(v->restartGame());
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    private void changeCellColor(int index){
        if(index>=0&&index<=8){
            gameState[index]=counter;
            buttonArrayList.get(index).setBackgroundColor(colorArrayList.get(counter).toArgb());
        }
    }

    private boolean checkAllcellsMatchingColor(){
        int firstColor=gameState[0];
        for(int i=1;i<gameState.length;i++){
            if(gameState[i]!=firstColor){
                return false;
            }
        }
        return true;
    }
    private void endgame(){
        for(Button button: buttonArrayList){
            button.setEnabled(false);
        }
        Toast.makeText(ColorMatching.this,"Winner!",Toast.LENGTH_SHORT).show();
    }
    private void restartGame(){
        Random rand=new Random();
        counter=0;
        Arrays.fill(gameState,3);

        for(Button button: buttonArrayList){
            int randInt=rand.nextInt(3);
            button.setEnabled(true);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                button.setBackgroundColor(colorArrayList.get(randInt).toArgb());
            }
        }
    }


}

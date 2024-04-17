 package com.example.androidprojectcollection;

 import android.annotation.SuppressLint;
 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.Toast;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    Button btn5;
    Button btn6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn1 = findViewById(R.id.btnLayoutExercise);
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent1= new Intent(
                       MainActivity.this,//context
                       LayoutExercise.class//destination activity
               );
               startActivity(intent1);
           }
       });

        btn2 = findViewById(R.id.btnButtonExercise);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(
                        MainActivity.this,//context
                        ButtonExercise.class//destination activity
                );
                startActivity(intent2);
            }
        });

        btn3 = findViewById(R.id.btnCalcuExer);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(
                        MainActivity.this,//context
                        CalculatorExercise.class//destination activity
                );
                startActivity(intent3);
            }
        });

        btn4 = findViewById(R.id.btnMidterm);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                startActivity(new Intent(MainActivity.this,ColorMatching.class));
                Toast.makeText(MainActivity.this, "Michael Harry P. Leones, ColorMatching", Toast.LENGTH_SHORT).show();
            }
        });

        btn5 = findViewById(R.id.btnConnect);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                startActivity(new Intent(MainActivity.this, ConnectActivity.class));
                Toast.makeText(MainActivity.this, "Michael Harry P. Leones, Connect 3 ", Toast.LENGTH_SHORT).show();
            }
        });

        btn6=findViewById(R.id.btnIntents);

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                startActivity(new Intent(MainActivity.this,PassingIntents.class));
                Toast.makeText(MainActivity.this, "Michael Harry P. Leones, Passing Intents", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
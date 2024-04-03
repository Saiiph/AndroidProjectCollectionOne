package com.example.leonesmidtermexamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.btnColorMatching);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                startActivity(new Intent(MainActivity.this,ColorMatching.class));
                Toast.makeText(MainActivity.this, "Michael Harry P. Leones, ColorMatching", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
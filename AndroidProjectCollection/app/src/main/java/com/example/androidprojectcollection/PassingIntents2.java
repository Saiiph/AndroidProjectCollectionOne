package com.example.androidprojectcollection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class PassingIntents2 extends AppCompatActivity {

    Button btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents2_exercise);

        TextView tfirstName = findViewById(R.id.txtFirst);
        TextView tbirthdate=findViewById(R.id.txtBday);
        TextView tlastName=findViewById(R.id.txtLast);
        TextView tgender=findViewById(R.id.txtGender);
        TextView tstudId=findViewById(R.id.txtStudid);
        TextView temail=findViewById(R.id.txtEmail);
        TextView tbirthplace=findViewById(R.id.txtBplace);
        TextView tprogram =findViewById(R.id.txtProgram);
        TextView tsection=findViewById(R.id.txtSection);
        TextView tstatus=findViewById(R.id.txtStatus);
        TextView tNumber=findViewById(R.id.txtPhone);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("fname_key");
        String lastname = intent.getStringExtra("lname_key");
        String bdate=intent.getStringExtra("bdate_key");
        String gender=intent.getStringExtra("gender_key");
        String studid=intent.getStringExtra("studId_key");
        String email=intent.getStringExtra("email_key");
        String bplace=intent.getStringExtra("bplace_key");
        String program=intent.getStringExtra("prog_key");
        String section=intent.getStringExtra("sec_key");
        String status=intent.getStringExtra("status_key");
        String number=intent.getStringExtra("num_key");

        tfirstName.setText(firstName); tlastName.setText(lastname);
        tbirthdate.setText(bdate); tgender.setText(gender);
        tstudId.setText(studid); temail.setText(email);
        tstatus.setText(status); tbirthplace.setText(bplace);
        tprogram.setText(program); tsection.setText(section);
        tNumber.setText(number);

        btnReturn = findViewById(R.id.btnRet);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        PassingIntents2.this,
                        PassingIntents.class);
                startActivity(intent);
            }
        });






    }


}

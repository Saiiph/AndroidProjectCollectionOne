package com.example.androidprojectcollection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PassingIntents extends AppCompatActivity {


    TextView txtFirstname,txtLastName,txtBirthdate,txtStudId,txtBirthPlace,txtEmail,txtProgram,txtSection,txtNumber;
    RadioButton radMale, radFemale, radOthers,radSingle,radMarried,radWidowed;

    Button btnClear,btnsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        txtFirstname=findViewById(R.id.editFirstName);
                txtLastName=findViewById(R.id.editLastName);
                txtBirthdate=findViewById(R.id.editBirth);
                txtStudId=findViewById(R.id.editId);
                txtBirthPlace=findViewById(R.id.editBplace);
                txtEmail=findViewById(R.id.editAddress);
                txtProgram=findViewById(R.id.editProg);
                txtSection=findViewById(R.id.editSect);
                txtNumber=findViewById(R.id.editNumber);
                radMarried=findViewById(R.id.radbtnMarried);
                radMale=findViewById(R.id.radbtnMale);
                radFemale=findViewById(R.id.radbtnFem);
                radWidowed=findViewById(R.id.radbtnWidowed);
                radOthers=findViewById(R.id.radbtnOthers);
                radSingle=findViewById(R.id.radbtnSingle);

         btnClear=findViewById(R.id.btnClear) ;
        btnsubmit = findViewById(R.id.btnSubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = txtFirstname.getText().toString();
                String lastName = txtLastName.getText().toString();
                String birthdate = txtBirthdate.getText().toString();
                String number = txtNumber.getText().toString();
                String studId = txtStudId.getText().toString();
                String email = txtEmail.getText().toString();
                String birthplace=txtBirthPlace.getText().toString();
                String program=txtProgram.getText().toString();
                String section=txtSection.getText().toString();

                String gender;
                if(radMale.isChecked())
                    gender = "Male";
                else if (radFemale.isChecked())
                    gender = "Female";
                else if (radOthers.isChecked())
                    gender = "Others";
                else
                    gender = "Unknown";

                String status;
                if(radSingle.isChecked())
                    status="Single";
                else if(radMarried.isChecked())
                    status = "Married";
                else if(radWidowed.isChecked())
                    status="Widowed";
                else
                    status = "Unknown";

                Intent intent7= new Intent(PassingIntents.this,PassingIntents2.class);
                intent7.putExtra("fname_key",firstName); intent7.putExtra("lname_key",lastName);
                intent7.putExtra("bdate_key",birthdate); intent7.putExtra("studId_key",studId);
                intent7.putExtra("email_key",email);     intent7.putExtra("bplace_key",birthplace);
                intent7.putExtra("prog_key",program);    intent7.putExtra("sec_key",section);
                intent7.putExtra("gender_key",gender);   intent7.putExtra("status_key",status);
                intent7.putExtra("num_key",number);
                startActivity(intent7);
            }
        });

        btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtFirstname.setText("");
                txtLastName.setText("");
                txtBirthdate.setText("");
                txtStudId.setText("");
                txtBirthPlace.setText("");
                txtEmail.setText("");
                txtProgram.setText("");
                txtSection.setText("");
                txtNumber.setText("");
                radMarried.setChecked(false);
                radMale.setChecked(false);
                radFemale.setChecked(false);
                radWidowed.setChecked(false);
                radOthers.setChecked(false);
                radSingle.setChecked(false);
            }
        });


    }
}

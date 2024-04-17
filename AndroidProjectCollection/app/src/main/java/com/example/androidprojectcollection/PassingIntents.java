package com.example.androidprojectcollection;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PassingIntents extends AppCompatActivity {

    TextView txtFirstname, txtLastName, txtBirthdate, txtStudId, txtBirthPlace, txtEmail, txtProgram, txtSection;
    Button btnClear, btnSubmit;
    RadioButton radMale, radFemale, radOthers,radSingle,radMarried,radWidowed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);
    }

    public void onClick(View view) {
        String firstName = txtFirstname.getText().toString();
        String lastName = txtLastName.getText().toString();
        String birthdate = txtBirthdate.getText().toString();
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
    }




}

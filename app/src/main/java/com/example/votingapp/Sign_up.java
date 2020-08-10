package com.example.votingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_up extends AppCompatActivity {
    EditText Student_ID, firstName, lastName, VerifyPassword, password;
    Button SignUpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Student_ID = findViewById(R.id.TxtStudent_id);
        firstName = findViewById(R.id.Txtfirst_name);
        lastName = findViewById(R.id.Txtlast_name);
        password = findViewById(R.id.Txtpassword);
        VerifyPassword = findViewById(R.id.TxtVerifypassword);
        SignUpbtn = findViewById(R.id.BtnSignUp);
        SignUpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Sign_up
                        .this, Dashboard.class);
                startActivity(intent1);
            }
        });

    }

}

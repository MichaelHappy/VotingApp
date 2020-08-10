package com.example.votingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView MobileNumbertxt;
    TextView Passwordtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileNumbertxt = findViewById(R.id.PhoneNumber);
        Passwordtxt = findViewById(R.id.PwdTxt);
        Button Log_in = findViewById(R.id.LogInBtn);
        Log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity
                        .this, Sign_up.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.cinescopapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { // Corrected parameter name
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Button getinBtn = findViewById(R.id.getinBtn);
        getinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, LoginActivity.class));
            }
        }); // Added missing closing parenthesis
    }
}

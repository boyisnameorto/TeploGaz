package com.example.teplogaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {
Button blagoBtn, vneshBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        blagoBtn = findViewById(R.id.blagoBtn);
        vneshBtn = findViewById(R.id.vneshBtn);

        blagoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FourthActivity.this, FiveActivity.class));
            }
        });

        vneshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "under reconstruction!";
                Toast.makeText(FourthActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
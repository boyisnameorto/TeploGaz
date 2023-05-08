package com.example.teplogaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FiveActivity extends AppCompatActivity {

    Button leninBtn, samotekBtn, kanalBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);



        leninBtn = findViewById(R.id.leninBtn);
        samotekBtn = findViewById(R.id.samotekBtn);
        kanalBtn = findViewById(R.id.kanalBtn);


        leninBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FiveActivity.this, LeninActivity.class));
            }
        });
        samotekBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FiveActivity.this, SamotekActivity.class));
            }
        });
        kanalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FiveActivity.this, KanalActivity.class));
            }
        });
    }
}
package com.example.teplogaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.JsonReader;

import com.airbnb.lottie.LottieAnimationView;

import java.io.InputStreamReader;

public class SplashScreen extends AppCompatActivity {
LottieAnimationView animationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        animationView = findViewById(R.id.animation_view);
        animationView.setAnimation(R.raw.teplogaz);
        animationView.playAnimation();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 4500);

    }
}
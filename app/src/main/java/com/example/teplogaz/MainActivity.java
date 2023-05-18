package com.example.teplogaz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    AppCompatButton materialBtn, ustrBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialBtn = findViewById(R.id.materialBtn);
        ustrBtn = findViewById(R.id.ustrBtn);

// Создание цветового состояния для нажатия
        ColorStateList colorStateList = new ColorStateList(
                new int[][]{
                        new int[]{android.R.attr.state_pressed},
                        new int[]{}
                },
                new int[]{
                        Color.YELLOW, // Цвет текста для состояния нажатия (синий)
                        Color.BLACK // Цвет текста для обычного состояния (белый)
                }
        );
// Установка цветового состояния для текста кнопки
        materialBtn.setTextColor(colorStateList);
        ustrBtn.setTextColor(colorStateList);

        materialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        ustrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FourthActivity.class));
            }
        });
    }
}
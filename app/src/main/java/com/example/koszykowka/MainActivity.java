package com.example.koszykowka;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textViewpunkty;
    private Button button1, button2, button3;

    private int punkty = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textViewpunkty = findViewById(R.id.textview);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        textViewpunkty.setText(String.valueOf(punkty));
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punkty++;
                textViewpunkty.setText(String.valueOf(punkty));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punkty+=2;
                textViewpunkty.setText(String.valueOf(punkty));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punkty+=3;
                textViewpunkty.setText(String.valueOf(punkty));
            }
        });
    }
}
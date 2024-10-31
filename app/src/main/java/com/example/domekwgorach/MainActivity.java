package com.example.domekwgorach;

import android.annotation.SuppressLint;
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
    private Button usunBtn, polubBtn;
    private int counter = 0;
    private TextView polubienia;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usunBtn = findViewById(R.id.usunBtn);
        polubBtn = findViewById(R.id.polubBtn);
        polubienia = findViewById(R.id.polubienia);

        polubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter+=1;
                update(counter);
            }
        });

        usunBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter>0){
                    counter-=1;
                }
                update(counter);
            }
        });
    }
    public void update(int counter){
        polubienia.setText(counter +" polubień");
    }

}
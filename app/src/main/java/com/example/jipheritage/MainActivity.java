package com.example.jipheritage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button B;
    Button B2;
    Button B3;
    Button B4;
    Button B5;
    Button B6;
    TextView T;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B = findViewById(R.id.button1);
        T = findViewById(R.id.textView);
        B2 = findViewById(R.id.button2);
        B3 = findViewById(R.id.button3);
        B4 = findViewById(R.id.button4);
        B5 = findViewById(R.id.button5);
        B6 = findViewById(R.id.button6);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}

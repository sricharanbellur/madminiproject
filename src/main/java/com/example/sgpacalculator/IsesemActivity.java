package com.example.sgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IsesemActivity extends AppCompatActivity {
    Button ise3,ise4,ise5,ise6,ise7,ise8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isesem);

        ise3 = findViewById(R.id.ise3);
        ise4 = findViewById(R.id.ise4);
        ise5 = findViewById(R.id.ise5);
        ise6 = findViewById(R.id.ise6);
        ise7 = findViewById(R.id.ise7);
        ise8 = findViewById(R.id.ise8);
        ise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IsesemActivity.this,Ise3semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
        ise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IsesemActivity.this,Ise4semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
        ise5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IsesemActivity.this,Ise5semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });

        ise6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IsesemActivity.this,Ise6semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });

        ise7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IsesemActivity.this,Ise7semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });

        ise8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IsesemActivity.this,Ise8semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
    }
}
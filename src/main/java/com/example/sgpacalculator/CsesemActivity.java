package com.example.sgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CsesemActivity extends AppCompatActivity {
Button cse3,cse4,cse5,cse6,cse7,cse8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem);
        cse3 = findViewById(R.id.cse3);
        cse4 = findViewById(R.id.cse4);
        cse5 = findViewById(R.id.cse5);
        cse6 = findViewById(R.id.cse6);
        cse7 = findViewById(R.id.cse7);
        cse8 = findViewById(R.id.cse8);

        cse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CsesemActivity.this,Cse3semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
        cse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CsesemActivity.this,Cse4semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
        cse5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CsesemActivity.this,Cse5semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });

        cse6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CsesemActivity.this,Cse6semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });

        cse7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CsesemActivity.this,Cse7semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });

        cse8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CsesemActivity.this,Cse8semActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
    }
}
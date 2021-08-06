package com.example.sgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button sgpabtn,cgpabtn,perbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sgpabtn = findViewById(R.id.sgpabtn);
        cgpabtn = findViewById(R.id.cgpabtn);
        perbtn = findViewById(R.id.sgpatopercentage);

        sgpabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SgpaActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });

        cgpabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CgpaActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
        perbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PerActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
    }
}
package com.example.sgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SgpaActivity extends AppCompatActivity {
Button pcyclebtn,csebtn,isebtn,ccyclebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa);
        csebtn = findViewById(R.id.csebtn);
        isebtn = findViewById(R.id.isebtn);
        pcyclebtn = findViewById(R.id.pcyclebtn);
        ccyclebtn = findViewById(R.id.ccyclebtn);
        csebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SgpaActivity.this,CsesemActivity.class);
                /* intent.putExtra("mode",1); */
                startActivity(intent);
            }
        });

        isebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SgpaActivity.this,IsesemActivity.class);
                /* intent.putExtra("mode",1); */
                startActivity(intent);
            }
        });

        pcyclebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SgpaActivity.this,PhysicsActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
        ccyclebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SgpaActivity.this,ChemistryActivity.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
    }
}
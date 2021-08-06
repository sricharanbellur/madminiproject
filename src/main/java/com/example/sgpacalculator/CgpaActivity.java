package com.example.sgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class CgpaActivity extends AppCompatActivity {
    TextInputEditText s1, s2, s3, s4, s5, s6, s7, s8;
    TextView cgpares;
    Button calculate,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);

        s1 = findViewById(R.id.sem1sgpa);
        s2 = findViewById(R.id.sem2sgpa);
        s3 = findViewById(R.id.sem3sgpa);
        s4 = findViewById(R.id.sem4sgpa);
        s5 = findViewById(R.id.sem5sgpa);
        s6 = findViewById(R.id.sem6sgpa);
        s7 = findViewById(R.id.sem7sgpa);
        s8 = findViewById(R.id.cpll);
        cgpares = findViewById(R.id.sgparescse3);
        calculate=findViewById(R.id.calculate);
        reset = findViewById(R.id.resetcgpa);
        calculate.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
              calculate();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                    Intent intent = new Intent(CgpaActivity.this,CgpaActivity.class);
                    intent.putExtra("mode",1);
                    startActivity(intent);
                }
            });
    }

    public void calculate() {
        if (s1.getText().toString().equals("") || s2.getText().toString().equals("") || s3.getText().toString().equals("") || s4.getText().toString().equals("") || s5.getText().toString().equals("") || s6.getText().toString().equals("") || s7.getText().toString().equals("") || s8.getText().toString().equals("")) {
            Toast.makeText(CgpaActivity.this, "Please enter All marks", Toast.LENGTH_SHORT);

        } else {

            float sem1 = Float.parseFloat(s1.getText().toString());
            float sem2 = Float.parseFloat(s2.getText().toString());
            float sem3 = Float.parseFloat(s3.getText().toString());
            float sem4 = Float.parseFloat(s4.getText().toString());
            float sem5 = Float.parseFloat(s5.getText().toString());
            float sem6 = Float.parseFloat(s6.getText().toString());
            float sem7 = Float.parseFloat(s7.getText().toString());
            float sem8 = Float.parseFloat(s8.getText().toString());

            if ((sem1 <= 10.0 && sem1 >= 0.0) && (sem2 <= 10.0 && sem2 >= 0.0) && (sem3 <= 10.0 && sem3 >= 0.0) && (sem4 <= 10.0 && sem4 >= 0.0) && (sem5 <= 10.0 && sem5 >= 0.0) && (sem6 <= 10.0 && sem6 >= 0.0) && (sem7 <= 10.0 && sem7 >= 0.0) && (sem8 <= 10.0 && sem8 >= 0.0)) {
                if (sem3 == 0.0 && sem4 == 0.0 && sem5 == 0.0 && sem6 == 0.0 && sem7 == 0.0 && sem8 == 0.0) {
                    float cgpa = (float) ((float) (20.0 * sem1 + 20.0 * sem2) / 40.0);
                    cgpares.setText(String.valueOf(cgpa));
                } else if (sem4 == 0.0 && sem5 == 0.0 && sem6 == 0.0 && sem7 == 0.0 && sem8 == 0.0) {
                    float cgpa = (float) ((float) (20.0 * sem1 + 20.0 * sem2 + sem3 * 24.0) / 64.0);
                    cgpares.setText(String.valueOf(cgpa));
                } else if (sem5 == 0.0 && sem6 == 0.0 && sem7 == 0.0 && sem8 == 0.0) {
                    float cgpa = (float) ((20.0 * sem1 + 20.0 * sem2 + sem3 * 24.0 + 24.0 * sem4) / 88.0);
                    cgpares.setText(String.valueOf(cgpa));
                } else if (sem6 == 0.0 && sem7 == 0.0 && sem8 == 0.0) {
                    float cgpa = (float) ((20.0 * sem1 + 20.0 * sem2 + sem3 * 24.0 + 24.0 * sem4 + 25 * sem5) / 113.0);
                    cgpares.setText(String.valueOf(cgpa));
                } else if (sem7 == 0.0 && sem8 == 0.0) {
                    float cgpa = (float) ((20.0 * sem1 + 20.0 * sem2 + sem3 * 24.0 + 24.0 * sem4 + 25 * sem5 + 24 * sem6) / 137.0);
                    cgpares.setText(String.valueOf(cgpa));
                } else if (sem8 == 0.0) {
                    float cgpa = (float) ((20.0 * sem1 + 20.0 * sem2 + sem3 * 24.0 + 24.0 * sem4 + 25 * sem5 + 24 * sem6 + 20 * sem7) / 157.0);
                    cgpares.setText(String.valueOf(cgpa));
                } else {
                    float cgpa = (float) ((20.0 * sem1 + 20.0 * sem2 + 24.0 * sem3 + 24.0 * sem4 + 25 * sem5 + 24 * sem6 + 20 * sem7 + 18 * sem8) / 175.0);
                    cgpares.setText(String.valueOf(cgpa));
                }
            } else {
                Toast.makeText(CgpaActivity.this, "Please Check Your SGPA", Toast.LENGTH_SHORT).show();
            }
        }
    }

}

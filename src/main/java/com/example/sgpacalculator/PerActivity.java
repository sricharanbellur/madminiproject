package com.example.sgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class PerActivity extends AppCompatActivity {
    EditText sgpaper, percentage;
    Button calculate, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per);
        sgpaper = findViewById(R.id.sgpaper);
        percentage = findViewById(R.id.percentage);
        calculate = findViewById(R.id.calcper);
        reset = findViewById(R.id.resetper);
        calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                percalculate();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(PerActivity.this, PerActivity.class);
                intent.putExtra("mode", 1);
                startActivity(intent);
            }
        });

    }

    public void percalculate() {
        if (sgpaper.getText().toString().equals("")) {
            Toast.makeText(PerActivity.this, "Please enter SGPA", Toast.LENGTH_SHORT);

        } else {
            float sgpa = Float.parseFloat(sgpaper.getText().toString());
            if (sgpa <= 10.0 && sgpa > 0.0) {
                float percent = (float) ((sgpa - 0.75) * 10.0);
                percentage.setText(String.valueOf(percent));
            } else {
                Toast.makeText(PerActivity.this, "Please Check Your SGPA", Toast.LENGTH_SHORT).show();
            }

        }

    }
}
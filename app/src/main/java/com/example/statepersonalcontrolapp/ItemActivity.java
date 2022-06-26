package com.example.statepersonalcontrolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        String name = getIntent().getStringExtra("NAME");
        String id = getIntent().getStringExtra("ID");
        String lowPressure = getIntent().getStringExtra("LOW_PRESSURE");
        String topPressure = getIntent().getStringExtra("TOP_PRESSURE");
        String pulse = getIntent().getStringExtra("PULSE");
        String report = getIntent().getStringExtra("REPORT");
        String alcohol = getIntent().getStringExtra("ALCOHOL");
        String temperature = getIntent().getStringExtra("TEMPERATURE");

        TextView nameTextView = findViewById(R.id.name);
        TextView idTextView = findViewById(R.id.id);
        TextView lowPressureTextView = findViewById(R.id.lowPressure);
        TextView topPressureTextView = findViewById(R.id.topPressure);
        TextView pulseTextView = findViewById(R.id.pulse);
        TextView reportTextView = findViewById(R.id.report);
        TextView alcoholTextView = findViewById(R.id.alcohol);
        TextView temperatureTextView = findViewById(R.id.temperature);

        nameTextView.setText(name);
        idTextView.setText(id);
        lowPressureTextView.setText(lowPressure);
        topPressureTextView.setText(topPressure);
        pulseTextView.setText(pulse);
        reportTextView.setText(report);
        alcoholTextView.setText(alcohol);
        temperatureTextView.setText(temperature);
    }
}
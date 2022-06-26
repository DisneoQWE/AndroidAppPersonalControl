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
        Integer id = getIntent().getIntExtra("ID", 0);
        Integer lowPressure = getIntent().getIntExtra("LOW_PRESSURE", 0);
        Integer topPressure = getIntent().getIntExtra("TOP_PRESSURE", 0);
        Integer pulse = getIntent().getIntExtra("PULSE", 0);
        String report = getIntent().getStringExtra("REPORT");
        String alcohol = getIntent().getStringExtra("ALCOHOL");
        Double temperature = getIntent().getDoubleExtra("TEMPERATURE", 0);

        TextView nameTextView = findViewById(R.id.name);
        TextView idTextView = findViewById(R.id.id);
        TextView lowPressureTextView = findViewById(R.id.lowPressure);
        TextView topPressureTextView = findViewById(R.id.topPressure);
        TextView pulseTextView = findViewById(R.id.pulse);
        TextView reportTextView = findViewById(R.id.report);
        TextView alcoholTextView = findViewById(R.id.alcohol);
        TextView temperatureTextView = findViewById(R.id.temperature);

        nameTextView.setText(name);
        idTextView.setText(id.toString());
        lowPressureTextView.setText(lowPressure.toString());
        topPressureTextView.setText(topPressure.toString());
        pulseTextView.setText(pulse.toString());
        reportTextView.setText(report);
        alcoholTextView.setText(alcohol);
        temperatureTextView.setText(temperature.toString());
    }
}
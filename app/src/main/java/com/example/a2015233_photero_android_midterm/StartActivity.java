package com.example.a2015233_photero_android_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btnTemperature, btnMetrics, btnEnd;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        initialize();
    }

    private void initialize()
    {
        btnTemperature=findViewById(R.id.btnToTemp);
        btnMetrics=findViewById(R.id.btnToMetrics);
        btnEnd=findViewById(R.id.btnEnd);

        btnTemperature.setOnClickListener(this);
        btnMetrics.setOnClickListener(this);
        btnEnd.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        int id=view.getId();
        switch (id)
        {
            case R.id.btnToTemp:
                Intent intentTemp = new Intent(this, TemperActivity.class);
                startActivity(intentTemp);
                break;
            case R.id.btnToMetrics:
                Intent intentMetric = new Intent(this, MetrixActivity.class);
                startActivity(intentMetric);
                break;
            case R.id.btnEnd:
                System.exit(0);
        }
    }

}
package com.example.a2015233_photero_android_midterm;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MetrixActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btnConvertToMeters, btnReturn;
    EditText editTextKilometers;

    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_metrix);
        initialize();
    }

    private void initialize()
    {
        btnConvertToMeters =findViewById(R.id.btnConvertToMeter);
        btnReturn=findViewById(R.id.btnMetricsToMain);

        btnConvertToMeters.setOnClickListener(this);
        btnReturn.setOnClickListener(this);

        editTextKilometers=findViewById(R.id.editTextKilometers);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            // String degrees = editTextKilometers.getText().toString();
            //Log.d("Converting Temperature: ", "degrees" + degrees + "C");





        }
    }


}

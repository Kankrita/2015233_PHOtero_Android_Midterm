package com.example.a2015233_photero_android_midterm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a2015233_photero_android_midterm.Model.Converter;

public class TemperActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btnConvertToFahrenheit, btnReturn;
    EditText editTextDegrees;

    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_temper);
        initialize();
    }

    private void initialize()
    {
        btnConvertToFahrenheit =findViewById(R.id.btnConvertToFarenheit);
        btnReturn=findViewById(R.id.btnTempToMain);

        btnConvertToFahrenheit.setOnClickListener(this);
        btnReturn.setOnClickListener(this);

        editTextDegrees=findViewById(R.id.editTextDegrees);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btnConvertToFarenheit:
                Converter converter = new Converter();
            double degrees = Double.valueOf(editTextDegrees.getText().toString());
            double result = converter.CelsiusToFahrenheit(degrees);
                Toast.makeText(this,"Converting Temperature: " + result + "F",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnTempToMain:
                finish();
                break;
        }
    }


}

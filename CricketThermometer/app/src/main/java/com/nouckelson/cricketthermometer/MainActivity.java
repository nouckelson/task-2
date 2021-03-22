package com.nouckelson.cricketthermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity{
    EditText chirpsNumber;
    TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chirpsNumber=(EditText) findViewById(R.id.chirpsNumber);
        resultView=(TextView) findViewById(R.id.resultView);
    }

    public void Calculate(View view) {
        Double result;


        String pattern = "###.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(Double.parseDouble(chirpsNumber.getText().toString()));
        Double chirps=Double.parseDouble(format);
        result=(chirps/3)+4;
        resultView.setText("The approximate temperature outside is "+result+" degrees Celsius.");
    }
}
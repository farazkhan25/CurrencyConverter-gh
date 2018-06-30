package com.farazkhan.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText input = findViewById(R.id.input);
        double inputdouble = Double.parseDouble(input.getText().toString());
        double result = inputdouble * 68.45; //As of June 2018
        DecimalFormat df = new DecimalFormat("#.##");
        Toast.makeText(MainActivity.this, "₹ " + df.format(result), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

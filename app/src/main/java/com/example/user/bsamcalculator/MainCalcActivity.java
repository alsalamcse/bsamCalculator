package com.example.user.bsamcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainCalcActivity extends AppCompatActivity implements View.OnClickListener
{
    private TextView tvaeshara;
    private TextView tvResult;
    private EditText etNUM1;
    private EditText etNUM2;
    private EditText etResult;
    private Button btnPlus;
    private Button btnMines;
    private Button btndarb;
    private Button btnkesma;
    private Button btneosawi;
    private Button btnkowa;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);

        tvaeshara = (TextView) findViewById(R.id.tvaeshara);
        tvResult = (TextView) findViewById(R.id.tvResult);
        etNUM1 = (EditText) findViewById(R.id.etNUM1);
        etNUM2 = (EditText) findViewById(R.id.etNUM2);
        etResult = (EditText) findViewById(R.id.etResult);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMines = (Button) findViewById(R.id.btnMines);
        btndarb = (Button) findViewById(R.id.btndarb);
        btnkesma = (Button) findViewById(R.id.btnkesma);
        btneosawi = (Button) findViewById(R.id.btneosawi);
        btnkowa = (Button) findViewById(R.id.btnkowa);
        btnClear = (Button) findViewById(R.id.btnClear);

        btnPlus.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnkowa.setOnClickListener(this);
        btneosawi.setOnClickListener(this);
        btndarb.setOnClickListener(this);
        btnkesma.setOnClickListener(this);
        btnMines.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {
        String stNum1=etNUM1.getText().toString();
        double num1=Double.parseDouble(stNum1);

        if (view==btnPlus)
        {

        }
        if (view==btnClear)
        {

        }
        if (view==btnkowa)
        {

        }
        if (view==btneosawi)
        {

        }
        if (view==btndarb)
        {

        }
        if (view==btnkesma)
        {

        }
        if (view==btnMines)
        {

        }


    }
}

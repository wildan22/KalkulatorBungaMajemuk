package com.example.compoundcalculator;
import android.text.TextUtils;
import android.view.View;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalculateInterest extends AppCompatActivity implements View.OnClickListener{
    private EditText edtStartCapital,edtAnnualGrowth,edtMumberOfYear;
    private Button btnCalculate,btnReset;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_compound_calculator);
        edtStartCapital = (EditText)findViewById(R.id.edt_start_capital);
        edtAnnualGrowth = (EditText)findViewById(R.id.edt_annual_growth);
        edtMumberOfYear = (EditText)findViewById(R.id.edt_number_of_year);
        btnCalculate = (Button)findViewById(R.id.btn_calculate);
        btnReset = (Button)findViewById(R.id.btn_reset);
        tvResult = (TextView)findViewById(R.id.tv_result);
        btnCalculate.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn_calculate){
            String startCapital = edtStartCapital.getText().toString().trim();
            String annualGrowth = edtAnnualGrowth.getText().toString().trim();
            String numberOfYear = edtMumberOfYear.getText().toString().trim();
            boolean isEmptyFields = false;

            if(TextUtils.isEmpty(startCapital)){
                isEmptyFields = true;
                edtStartCapital.setError("This Field can't be blank");
            }
            if(TextUtils.isEmpty(annualGrowth)){
                isEmptyFields = true;
                edtAnnualGrowth.setError("This Field can't be blank");
            }
            if(TextUtils.isEmpty(numberOfYear)){
                isEmptyFields = true;
                edtMumberOfYear.setError("This Field can't be blank");
            }
            if(!isEmptyFields){
                double capital = Double.parseDouble(startCapital);
                double growth = Double.parseDouble(annualGrowth)/100;
                double year = Double.parseDouble(numberOfYear);
                double r = capital*(Math.pow(1+(growth/12),(12*year)));
                //int result = (int)r;
                NumberFormat formatter = new DecimalFormat("#,###.00");
                String result = formatter.format(r);
                tvResult.setText(result);
            }
        }
        if(v.getId() ==  R.id.btn_reset){
            edtStartCapital.setText("");
            edtMumberOfYear.setText("");
            edtAnnualGrowth.setText("");
            tvResult.setText("");
        }
    }

}

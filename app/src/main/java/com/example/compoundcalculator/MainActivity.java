package com.example.compoundcalculator;
import android.content.Intent;
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

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn_activity_compoundcalculator);
        Button about = (Button) findViewById(R.id.btn_activity_about);
        Button help = (Button) findViewById(R.id.btn_activity_help);

        help.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent goToInformasi = new Intent(getApplicationContext(),HelpActivity.class);
                startActivity(goToInformasi);
            }
        });


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToAbout = new Intent(getApplicationContext(),AboutActivity.class);
                startActivity(goToAbout);
            }
        });

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goToCalculateInterest = new Intent(getApplicationContext(),CalculateInterest.class);
                startActivity(goToCalculateInterest);
            }
        });
    }




}

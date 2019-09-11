package com.example.compoundcalculator;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;



import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HelpActivity extends AppCompatActivity {
    Button btn_show_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_informasi);

        btn_show_info = (Button)findViewById(R.id.btn_show_info);
        btn_show_info.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                getSupportFragmentManager().beginTransaction().add(R.id.frame_layout, new ShowFragment()).commit();
            }
        });
    }
}
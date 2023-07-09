package com.example54.temperatureconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ansBtn, againBtn;
    TextView showAns;
    EditText getVal;
    RadioButton c2f, f2c;
    Double x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ansBtn = findViewById(R.id.ansBtn);
        showAns = findViewById(R.id.showAns);
        getVal = findViewById(R.id.getVal);
        c2f = findViewById(R.id.c2f);
        f2c = findViewById(R.id.f2c);
        againBtn = findViewById(R.id.againBtn);
        ansBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getVal.getText().toString().isEmpty()){
                    showAns.setText("Please give value of Temperature");
                }else{
                    x = Double.parseDouble(String.valueOf(getVal.getText()));
                    if(c2f.isChecked()){
                        x = (x * 9) / 5 + 32;    //this is equation
                        showAns.setText(String.valueOf(x)+" Degree F");
                    }else{
                        x = (x - 32) * 5 / 9;
                        showAns.setText(String.valueOf(x)+" Degree C");
                    }
                }
            }
        });

        againBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAns.setText("");
                getVal.setText("");
            }
        });
    }
}
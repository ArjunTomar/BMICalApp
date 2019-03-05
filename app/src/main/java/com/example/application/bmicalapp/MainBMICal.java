package com.example.application.bmicalapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainBMICal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bmical);

    }
    public void CalBMIFunc(View View)
    {
        EditText input1 = (EditText)findViewById(R.id.input1);
        EditText input2 = (EditText)findViewById(R.id.input2);
        TextView BMI= (TextView) findViewById(R.id.BMI);
        TextView weightCat = (TextView)findViewById(R.id.weightCat);

        double weight=Double.parseDouble(input1.getText().toString());
        double height=Double.parseDouble(input2.getText().toString());
        double bmi=weight/(height*height);
        DecimalFormat df2 = new DecimalFormat(".##");

        BMI.setText(String.valueOf(df2.format(bmi)));



        String message="";
         if(bmi<18.5)
           {
             message+="UnderWeight";
           }
        else if(bmi>=18.5 && bmi<=25)
           {
             message+="Normal";
           }
        else
           {
             message+="OverWeight";
           }
         weightCat.setText(message);
    }

}

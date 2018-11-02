package com.example.pc.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayCoffeeVariety extends AppCompatActivity {

    static double sumTotal = 0.0;

    double val1;
    double val22;
    double val33;
    double val44;
    double val55;


    TextView txt11;
    TextView txt22;
    TextView txt33;
    TextView txt44;
    TextView txt55;

    double a;
    double a2;
    double a3;
    double a4;
    double a5;

    public void addCoffeee(View view)
    {
        switch(view.getId())
        {
            case R.id.button11:

                if(txt11.getVisibility() == View.GONE)
                {
                    txt11.setVisibility(View.VISIBLE);
                }
                TextView txt1 = findViewById(R.id.textView1);
                String text1 = txt1.getText().toString();
                int val = Integer.parseInt(text1);
                if(val < 8) {
                    ++val;

                    this.a = val * this.val1;

                    txt1.setText(Integer.toString(val));
                    txt11.setText(Double.toString(a));

                }
                break;
            case R.id.button22:

                if(txt22.getVisibility() == View.GONE)
                {
                    txt22.setVisibility(View.VISIBLE);
                }

                TextView txt2 = findViewById(R.id.textView2);
                String text2 = txt2.getText().toString();
                int val2 = Integer.parseInt(text2);
                if(val2 < 8) {
                    ++val2;

                    this.a2 = val2 * this.val22;

                    txt2.setText(Integer.toString(val2));
                    txt22.setText(Double.toString(a2));
                }

                break;
            case R.id.button33:
                if(txt33.getVisibility() == View.GONE)
                {
                    txt33.setVisibility(View.VISIBLE);
                }

                TextView txt3 = findViewById(R.id.textView3);
                String text3 = txt3.getText().toString();
                int val3 = Integer.parseInt(text3);
                if(val3 < 8) {
                    ++val3;
                    this.a3 = val3 * this.val33;

                    txt3.setText(Integer.toString(val3));
                    txt33.setText(Double.toString(a3));
                }

                break;
            case R.id.button44:

                if(txt44.getVisibility() == View.GONE)
                {
                    txt44.setVisibility(View.VISIBLE);
                }

                TextView txt4 = findViewById(R.id.textView4);
                String text4 = txt4.getText().toString();
                int val4 = Integer.parseInt(text4);
                if(val4 < 8) {
                    ++val4;
                    this.a4 = val4 * this.val44;

                    txt4.setText(Integer.toString(val4));
                    txt44.setText(Double.toString(a4));
                }

                break;
            case R.id.button55:
                if(txt55.getVisibility() == View.GONE)
                {
                    txt55.setVisibility(View.VISIBLE);
                }

                TextView txt5 = findViewById(R.id.textView5);
                String text5 = txt5.getText().toString();
                int val5= Integer.parseInt(text5);
                if(val5 < 8) {
                    ++val5;

                    this.a5 = val5 * this.val55;

                    txt5.setText(Integer.toString(val5));
                    txt55.setText(Double.toString(a5));
                }


                break;
        }
    }

    public void subtractCoffee(View view)
    {
        switch(view.getId())
        {
            case R.id.button1:

                TextView txt1 = findViewById(R.id.textView1);
                String text1 = txt1.getText().toString();
                int val = Integer.parseInt(text1);
                if(val > 0) {
                    if(val == 1)
                    {
                        txt11.setVisibility(View.GONE);
                    }
                    --val;
                    this.a -= this.val1;

                    txt1.setText(Integer.toString(val));
                    txt11.setText(Double.toString(a));
                }
                break;
            case R.id.button2:

                TextView txt2 = findViewById(R.id.textView2);
                String text2 = txt2.getText().toString();
                int val2 = Integer.parseInt(text2);
                if(val2 > 0) {
                    if(val2 == 1)
                    {
                        txt22.setVisibility(View.GONE);
                    }
                    --val2;
                    this.a2 -= this.val22;

                    txt2.setText(Integer.toString(val2));
                    txt22.setText(Double.toString(a2));
                }
                break;
            case R.id.button3:

                TextView txt3 = findViewById(R.id.textView3);
                String text3 = txt3.getText().toString();
                int val3 = Integer.parseInt(text3);
                if(val3 > 0) {
                    if(val3 == 1)
                    {
                        txt33.setVisibility(View.GONE);
                    }
                    --val3;
                    this.a3 -= this.val33;

                    txt3.setText(Integer.toString(val3));
                    txt33.setText(Double.toString(a3));
                }

                break;
            case R.id.button4:

                TextView txt4 = findViewById(R.id.textView4);
                String text4 = txt4.getText().toString();
                int val4 = Integer.parseInt(text4);
                if(val4 > 0) {
                    if(val4 == 1)
                    {
                        txt44.setVisibility(View.GONE);
                    }
                    --val4;
                    this.a4 -= this.val44;

                    txt4.setText(Integer.toString(val4));
                    txt44.setText(Double.toString(a4));
                }
                break;
            case R.id.button5:

                TextView txt5 = findViewById(R.id.textView5);
                String text5 = txt5.getText().toString();
                int val5= Integer.parseInt(text5);
                if(val5 > 0) {
                    if(val5 == 1)
                    {
                        txt55.setVisibility(View.GONE);
                    }
                    --val5;
                    this.a5 -= this.val55;

                    txt5.setText(Integer.toString(val5));
                    txt55.setText(Double.toString(a5));
                }
                break;
        }
    }


    public void orderCoffee(View view)
    {

                TextView txt11 = findViewById(R.id.textView1);
                String text11 = txt11.getText().toString();
                int val1 = Integer.parseInt(text11);


                double total = this.val1*val1;
                sumTotal += total;


                TextView txt22 = findViewById(R.id.textView2);
                String text22 = txt22.getText().toString();
                int val22 = Integer.parseInt(text22);

                double total2 = this.val22*val22;
                sumTotal += total2;


                TextView txt33 = findViewById(R.id.textView3);
                String text33 = txt33.getText().toString();
                int val33 = Integer.parseInt(text33);

                double total3 = this.val33*val33;
                sumTotal += total3;

                TextView txt44 = findViewById(R.id.textView4);
                String text44 = txt44.getText().toString();
                int val44 = Integer.parseInt(text44);

                double total4 = this.val44*val44;
                sumTotal += total4;

                TextView txt55 = findViewById(R.id.textView5);
                String text55 = txt55.getText().toString();
                int val55 = Integer.parseInt(text55);

                double total5 = this.val55*val55;
                sumTotal += total5;


        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setTitle("Confirm");
        builder1.setMessage("Your total amount is"+ sumTotal);
        builder1.setCancelable(true);
        builder1.setNeutralButton(android.R.string.ok,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
        sumTotal = 0.0;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_coffee_variety);

        this.txt11 = findViewById(R.id.textView11);
        String text11 = txt11.getText().toString();
        this.val1= Double.parseDouble(text11);

        this.txt22 = findViewById(R.id.textView22);
        String text22 = txt22.getText().toString();
        this.val22= Double.parseDouble(text22);

        this.txt33 = findViewById(R.id.textView33);
        String text33 = txt33.getText().toString();
        this.val33= Double.parseDouble(text33);

        this.txt44 = findViewById(R.id.textView44);
        String text44 = txt44.getText().toString();
        this.val44= Double.parseDouble(text44);

        this.txt55 = findViewById(R.id.textView55);
        String text55 = txt55.getText().toString();
        this.val55= Double.parseDouble(text55);
    }
}

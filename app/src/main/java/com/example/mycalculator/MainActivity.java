package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnadd, btnsub, btnmulti,
            btndiv, btnequals, btnclear;
    EditText editText;
    String dispnum = "";
    Integer numone, numtwo, res;
    String operator, error;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0      = findViewById(R.id.btn0);
        btn1      = findViewById(R.id.btn1);
        btn2      = findViewById(R.id.btn2);
        btn3      = findViewById(R.id.btn3);
        btn4      = findViewById(R.id.btn4);
        btn5      = findViewById(R.id.btn5);
        btn6      = findViewById(R.id.btn6);
        btn7      = findViewById(R.id.btn7);
        btn8      = findViewById(R.id.btn8);
        btn9      = findViewById(R.id.btn9);
        btnadd    = findViewById(R.id.btnadd);
        btnsub    = findViewById(R.id.btnsub);
        btnmulti  = findViewById(R.id.btnmulti);
        btndiv    = findViewById(R.id.btndiv);
        btnequals = findViewById(R.id.btnequals);
        btnclear  = findViewById(R.id.btnclear);
        editText  = findViewById(R.id.display);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnequals.setOnClickListener(this);
        btnclear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn0){
            dispnum = "";
            editText.setText(dispnum);
            dispnum += 0;
            editText.setText(dispnum);
        }

        if(v.getId() == R.id.btn1){
            dispnum = "";
            editText.setText(dispnum);
            dispnum += 1;
            editText.setText(dispnum);
        }

        if(v.getId() == R.id.btn2){
            dispnum = "";
            editText.setText(dispnum);
            dispnum += 2;
            editText.setText(dispnum);
        }

        if(v.getId() == R.id.btn3){
            dispnum = "";
            editText.setText(dispnum);
            dispnum += 3;
            editText.setText(dispnum);
        }

        if(v.getId() == R.id.btn4){
            dispnum = "";
            editText.setText(dispnum);
            dispnum += 4;
            editText.setText(dispnum);
        }

        if(v.getId() == R.id.btn5){
            dispnum = "";
            editText.setText(dispnum);
            dispnum += 5;
            editText.setText(dispnum);
        }

        if(v.getId() == R.id.btn6){
            dispnum = "";
            editText.setText(dispnum);
            dispnum += 6;
            editText.setText(dispnum);
        }

        if(v.getId() == R.id.btn7){
            dispnum = "";
            editText.setText(dispnum);
            dispnum += 7;
            editText.setText(dispnum);
        }

        if(v.getId() == R.id.btn8){
            dispnum = "";
            editText.setText(dispnum);
            dispnum += 8;
            editText.setText(dispnum);
        }

        if(v.getId() == R.id.btn9){
            dispnum = "";
            editText.setText(dispnum);
            dispnum += 9;
            editText.setText(dispnum);
        }

        if(v.getId() == R.id.btnadd){

            if(dispnum == ""){
                error = "Choose a number first";
                editText.setHint(error);
            }else{
                numone = Integer.parseInt(dispnum);
                operator = "+";
                dispnum = "+";
                editText.setText(dispnum);
            }
        }

        if(v.getId() == R.id.btnsub){
            if(dispnum == ""){
                error = "Choose a number first";
                editText.setHint(error);
            }else {
                numone = Integer.parseInt(dispnum);
                operator = "-";
                dispnum = "-";
                editText.setText(dispnum);
            }
        }

        if(v.getId() == R.id.btndiv){
            if(dispnum == ""){
                error = "Choose a number first";
                editText.setHint(error);
            }else {
                numone = Integer.parseInt(dispnum);
                operator = "/";
                dispnum = "/";
                editText.setText(dispnum);
            }
        }

        if(v.getId() == R.id.btnmulti){
            if(dispnum == ""){
                error = "Choose a number first";
                editText.setHint(error);
            }else {
                numone = Integer.parseInt(dispnum);
                operator = "*";
                dispnum = "*";
                editText.setText(dispnum);
            }
        }

        if(v.getId() == R.id.btnclear){
            dispnum = "";
            editText.setText(dispnum);
        }

        if(v.getId() == R.id.btnequals){
            if(dispnum == ""){
                error = "Choose a number first";
                editText.setHint(error);
            }else {
                numtwo = Integer.parseInt(dispnum);
                res = getResult(operator, numone, numtwo);
                editText.setText(String.valueOf(res));
            }
        }

    }

    private int getResult(String op,int n1, int n2)
    {
        if (op == "+") {
            return n1 + n2;
        } else if (op == "-") {
            return n1 - n2;
        } else if (op == "/") {
            return n1 / n2;
        } else if (op == "*") {
            return n1 * n2;
        } else {
            return 0;
        }
    }
}


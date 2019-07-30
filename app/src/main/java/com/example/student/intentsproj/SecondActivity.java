package com.example.student.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private int n1, n2, ans;
    String input1, input2, displayAns;
    private TextView display;
    private EditText fnum,fnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fnum = findViewById(R.id.editText5);
        fnum2 = findViewById(R.id.editText2);
        display = findViewById(R.id.textView);


        Intent intent = getIntent();

        input1 = intent.getStringExtra(FirstActivity.Number_1);
        input2 = intent.getStringExtra(FirstActivity.Number_2);

        fnum.setText(input1);
        fnum2.setText(input2);

        n1 = Integer.parseInt(input1);
        n2 = Integer.parseInt(input2);

    }

    public void addition(View view)
    {
        ans = n1+n2;
        displayAns = input1+" + "+input2+" = "+ans;
        displayAnswer(displayAns);
    }

    public void sub(View view)
    {
        ans = n1-n2;
        displayAns = input1+" - "+input2+" = "+ans;
        displayAnswer(displayAns);
    }

    public void devide(View view) {
        ans = n1 / n2;
        displayAns = input1 + " / " + input2 + " = " + ans;
        displayAnswer(displayAns);
    }
    public void multiply(View view)
    {
        ans = n1*n2;
        displayAns = input1+" x "+input2+" = "+ans;
        displayAnswer(displayAns);
    }

    public void displayAnswer(String displayAns){
        display.setText(displayAns);
    }
}


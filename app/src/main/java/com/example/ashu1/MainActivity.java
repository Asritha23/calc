package com.example.ashu1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String Extra_this="Extra";
    private EditText number1;
    private EditText number2;
    private Button Add;
    private Button Sub;
    private Button Mul;
    private Button Div;
    private int answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        Add= (Button) findViewById(R.id.add);
        Sub= (Button) findViewById(R.id.sub);
        Mul= (Button) findViewById(R.id.mul);
        Div= (Button) findViewById(R.id.div);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().toString().length() >0 && number2.getText().toString().length() >0) {
                    answer = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
                    showAnswer(v);
                }
                else{
                    if (number1.getText().toString().length()==0){
                        number1.setError("Enter the number");
                    }
                    if(number2.getText().toString().length()==0){
                        number2.setError("Enter the number");
                    }
                }
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().toString().length() >0 && number2.getText().toString().length() >0) {
                    answer = Integer.parseInt(number1.getText().toString()) - Integer.parseInt(number2.getText().toString());
                    showAnswer(v);
                }
                else{
                    if (number1.getText().toString().length()==0){
                        number1.setError("Enter the number");
                    }
                    if(number2.getText().toString().length()==0){
                        number2.setError("Enter the number");
                    }
                }
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().toString().length() >0 && number2.getText().toString().length() >0) {
                    answer = Integer.parseInt(number1.getText().toString()) * Integer.parseInt(number2.getText().toString());
                    showAnswer(v);
                }
                else{
                    if (number1.getText().toString().length()==0){
                        number1.setError("Enter the number");
                    }
                    if(number2.getText().toString().length()==0){
                        number2.setError("Enter the number");
                    }
                }
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().toString().length() >0 && number2.getText().toString().length() >0) {
                    answer = Integer.parseInt(number1.getText().toString()) / Integer.parseInt(number2.getText().toString());
                    showAnswer(v);
                }
                else{
                    if (number1.getText().toString().length()==0){
                        number1.setError("Enter the number");
                    }
                    if(number2.getText().toString().length()==0){
                        number2.setError("Enter the number");
                    }
                }
            }
        });

    }

    public void showAnswer(View view) {

        int txt= answer;
        Intent intent= new Intent(this,res.class);
        intent.putExtra(Extra_this,txt);
        startActivity(intent);
    }
}
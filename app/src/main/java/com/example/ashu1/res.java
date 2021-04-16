package com.example.ashu1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class res extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
        Intent intent = getIntent();
        int num;
        num = intent.getIntExtra(MainActivity.Extra_this,0);
        TextView ans= (TextView) findViewById(R.id.ans);
        ans.setText(""+num);
    }
}
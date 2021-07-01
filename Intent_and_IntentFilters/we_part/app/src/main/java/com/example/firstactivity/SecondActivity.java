package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
private TextView mtvusername;
private TextView mtvwelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mtvusername = findViewById(R.id.tvusername);
        mtvwelcome = findViewById(R.id.tvwelcome);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("key");
        mtvusername.setText(userName);
    }
}
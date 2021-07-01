package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
private TextView mtvEmailname;
private TextView mtvthankyou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mtvEmailname=findViewById(R.id.tvEmailname);
        mtvthankyou=findViewById(R.id.tvthankyou);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("useremail");
        mtvEmailname.setText(userName);
    }
}
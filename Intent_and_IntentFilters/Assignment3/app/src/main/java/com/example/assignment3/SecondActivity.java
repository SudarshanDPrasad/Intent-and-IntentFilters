package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mtvaddbuyer;
    private TextView mtvorganastioname;
    private TextView mtvDeatils;
    private TextView mtvName;
    private EditText metName;
    private TextView mtvMobileNo;
    private EditText metMobileNo;
    private TextView mtvemail;
    private EditText metemail;
    private TextView mtvaddress;
    private EditText metaddress;
    private TextView mtvManfactuer;
    private EditText metmanfactuare;
    private TextView mtvid;
    private EditText metid;
    private TextView mtvthank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        intids();

        Intent intent = getIntent();
        String userName = intent.getStringExtra("username");
        metName.setText(userName);
        String usermobileNumber = intent.getStringExtra("usermobileNumber");
        metMobileNo.setText(usermobileNumber);
        String useremail = intent.getStringExtra("useremail");
        metemail.setText(useremail);
        String useraddress = intent.getStringExtra("useraddress");
        metaddress.setText(useraddress);
        String usermanfucater = intent.getStringExtra("usermanfucater");
        metmanfactuare.setText(usermanfucater);
        String userid = intent.getStringExtra("userid");
        metid.setText(userid);


    }

    private void intids() {
        mtvaddbuyer = findViewById(R.id.tvaddbuyer);
        mtvorganastioname = findViewById(R.id.tvorganastioname);
        mtvDeatils = findViewById(R.id.tvDeatils);
        mtvName = findViewById(R.id.tvName);
        mtvMobileNo = findViewById(R.id.tvMobileNo);
        mtvemail = findViewById(R.id.tvemail);
        mtvaddress = findViewById(R.id.tvaddress);
        mtvManfactuer = findViewById(R.id.tvManfactuer);
        mtvid = findViewById(R.id.tvid);
        mtvthank = findViewById(R.id.tvthank);
        metName = findViewById(R.id.etName);
        metMobileNo = findViewById(R.id.etMobileNo);
        metemail = findViewById(R.id.etemail);
        metaddress = findViewById(R.id.etaddress);
        metmanfactuare = findViewById(R.id.etmanfactuare);
        metid = findViewById(R.id.etid);

    }
}
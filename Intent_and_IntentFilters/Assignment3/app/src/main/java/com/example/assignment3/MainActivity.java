package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mtvaddbuyer;
    private Button mbtnclick;
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
        setContentView(R.layout.activity_main);
        intids();
        mbtnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("username",metName.getText().toString());
                intent.putExtra("usermobileNumber",metMobileNo.getText().toString());
                intent.putExtra("useremail",metemail.getText().toString());
                intent.putExtra("useraddress",metaddress.getText().toString());
                intent.putExtra("usermanfucater",metmanfactuare.getText().toString());
                intent.putExtra("userid",metid.getText().toString());
                startActivity(intent);
            }
        });
    }

    private void intids() {
        mbtnclick = findViewById(R.id.btnclick);
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
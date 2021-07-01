package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button mbnconform;
    private EditText metEmail;
    private EditText metPassword;
    private EditText metphonenumber;
    private EditText metage;
    private TextView mtvwelcome;
    private EditText metgender;
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    private String emphoneNo = "[0-9]";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initideas();
        mbnconform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isVaildEmialid() && isVaildPassword() && isphoneno()) {
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    intent.putExtra("useremail",metEmail.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

    private void initideas() {
        metEmail = findViewById(R.id.etEmail);
        metPassword = findViewById(R.id.etPassword);
        metphonenumber = findViewById(R.id.etPassword);
        metage = findViewById(R.id.etage);
        metgender = findViewById(R.id.etgender);
        mbnconform = findViewById(R.id.bnconform);
        mtvwelcome = findViewById(R.id.tvwelcome);
    }

    public boolean isVaildEmialid() {
        if (metEmail.getText().toString().length() > 1 &&
                metEmail.getText().toString().matches(emailValidation)) {
            return true;
        } else {
            metEmail.setError("InvailidEmail");
            return false;
        }
    }

    public boolean isVaildPassword() {
        if (metPassword.getText().toString().length() > 1) {
            return true;
        } else {
            metPassword.setError("Invailid Password");
            return false;
        }
    }

    public boolean isphoneno() {

        if (metPassword.getText().toString().length() > 1) {
            return true;
        } else {
            metPassword.setError("Invailid Password");
            return false;
        }
    }
}
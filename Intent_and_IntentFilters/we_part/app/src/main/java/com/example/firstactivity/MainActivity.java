package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText metEmail;
    private EditText metUsername;
    private EditText metPassword;
    private Button mbtnLogin;
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        mbtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isUsername() && ispassword() && isEmailVlaid()) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("key",metUsername.getText().toString());
                    startActivity(intent);
                }
            }
        });


    }

    private void initViews() {
        mbtnLogin = findViewById(R.id.btnLogin);
        metEmail = findViewById(R.id.etEmail);
        metPassword = findViewById(R.id.etPassword);
        metUsername = findViewById(R.id.etUsername);
    }


    private boolean isEmailVlaid() {
        if (metEmail.getText().toString().length() >= 1 &&
                metEmail.getText().toString().matches(emailValidation)) {
            return true;
        } else {
            metEmail.setError("InvalidEmail");
            return false;
        }
    }

    private boolean ispassword() {
        if (metPassword.getText().toString().length() >= 6) {
            return true;
        } else {
            metPassword.setError("Paswword length is short");
            return false;
        }
    }

    private boolean isUsername() {
        if (metUsername.getText().toString().trim().length() >= 4) {
            return true;
        } else {
            metUsername.setError("The Length is Short");
            return false;
        }
    }
}
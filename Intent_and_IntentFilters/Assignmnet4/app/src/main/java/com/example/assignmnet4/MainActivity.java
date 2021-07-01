package com.example.assignmnet4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText metto;
    private EditText metcc;
    private EditText metmessage;
    private Button mbtnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intides();
        mbtnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to = metto.getText().toString();
                String cc = metcc.getText().toString();
                String message = metmessage.getText().toString();

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, " email subject");
                emailIntent.putExtra(Intent.EXTRA_CC, new String[]{cc});
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                emailIntent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(emailIntent);
            }
        });
    }

    private void intides() {
        mbtnsend = findViewById(R.id.btnsend);
        metcc = findViewById(R.id.etcc);
        metto = findViewById(R.id.etto);
        metmessage = findViewById(R.id.etmessage);
    }
}
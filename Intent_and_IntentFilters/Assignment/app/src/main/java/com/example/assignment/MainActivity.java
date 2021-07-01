package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEtName;
    private Button mbtnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        mbtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("android.content.Intent.ACTION_SEND");
                intent.putExtra("username", mEtName.getText().toString());

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Not Found", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initviews() {
        mEtName = findViewById(R.id.EtName);
        mbtnSend = findViewById(R.id.btnSend);
    }
}
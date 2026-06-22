package com.example.lab04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSubmit = findViewById(R.id.btn_submit);
        Button btnClear = findViewById(R.id.btn_clear);
        EditText edtName = findViewById(R.id.edt_name);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edtName.getText().toString();

                Toast.makeText(MainActivity.this,
                        "Hello, " + name + "!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtName.setText("");

                //commits will start now
                //commit
            }
        });
    }
}
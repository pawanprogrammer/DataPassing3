package com.trishasofttech.datapassing3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_next;
    EditText et_username, et_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_next = findViewById(R.id.btn_next);
        et_email = findViewById(R.id.et_email);
        et_username = findViewById(R.id.et_username);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, HomeActivity.class);
                /*to store the username in java object*/
                Data data=new Data();
                data.name=et_username.getText().toString();
                data.email=et_email.getText().toString();
                startActivity(intent);
            }
        });

    }
}
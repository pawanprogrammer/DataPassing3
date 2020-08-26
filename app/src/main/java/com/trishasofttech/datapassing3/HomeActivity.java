package com.trishasofttech.datapassing3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
TextView tv_data;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tv_data=findViewById(R.id.tv_data);
        Data data=new Data();
        /*to display the username from java object*/
        tv_data.setText(data.name+ "\n"+data.email);

    }
}
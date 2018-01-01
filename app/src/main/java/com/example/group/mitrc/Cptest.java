package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cptest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cptest);
        Button b= (Button) findViewById(R.id.btt1);
    }
    public void hunn(View v)
    {
        Intent i=new Intent(Cptest.this,Cptest1.class);
        startActivity(i);
    }
}

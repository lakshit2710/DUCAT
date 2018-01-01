package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cptest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cptest1);
        Button b= (Button) findViewById(R.id.btt2);
    }
    public void hunn1(View v)
    {
        Intent i=new Intent(Cptest1.this,Cptest2.class);
        startActivity(i);
    }
}

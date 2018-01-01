package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jtest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jtest);
        Button b= (Button) findViewById(R.id.bnn1);
    }
    public void sun1(View v)
    {
        Intent i=new Intent(Jtest.this,Jtest1.class);
        startActivity(i);
    }
}

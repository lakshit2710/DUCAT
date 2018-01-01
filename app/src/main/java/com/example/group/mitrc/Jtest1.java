package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jtest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jtest1);
        Button b= (Button) findViewById(R.id.bnn2);
    }
    public void sun2(View v)
    {
        Intent i=new Intent(Jtest1.this,Jtest2.class);
        startActivity(i);
    }
}

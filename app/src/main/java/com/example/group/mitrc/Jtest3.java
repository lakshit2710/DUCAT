package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jtest3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jtest3);
        Button b= (Button) findViewById(R.id.bnn4);
    }
    public void sun4(View v)
    {
        Intent i=new Intent(Jtest3.this,Jtest4.class);
        startActivity(i);
    }
}

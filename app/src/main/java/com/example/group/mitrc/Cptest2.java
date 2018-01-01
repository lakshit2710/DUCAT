package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cptest2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cptest2);
        Button b= (Button) findViewById(R.id.btt3);
    }
    public void hunn2(View v)
    {
        Intent i=new Intent(Cptest2.this,Cptest3.class);
        startActivity(i);
    }
}

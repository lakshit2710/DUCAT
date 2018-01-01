package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ptest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptest1);
        Button b= (Button) findViewById(R.id.bttt2);
    }
    public void huun1(View v)
    {
        Intent i=new Intent(Ptest1.this,Ptest4.class);
        startActivity(i);
    }
}

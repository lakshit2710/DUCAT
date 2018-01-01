package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ctest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctest1);
        Button b= (Button) findViewById(R.id.bt2);
    }
    public void hun1(View v)
    {
        Intent i=new Intent(Ctest1.this,Ctest2.class);
        startActivity(i);
    }
}

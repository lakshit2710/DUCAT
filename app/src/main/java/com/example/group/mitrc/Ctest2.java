package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ctest2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctest2);
        Button b= (Button) findViewById(R.id.bt3);
    }
    public void hun2(View v)
    {
        Intent i=new Intent(Ctest2.this,Ctest3.class);
        startActivity(i);
    }
}

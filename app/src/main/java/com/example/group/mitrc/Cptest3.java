package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cptest3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cptest3);
        Button b= (Button) findViewById(R.id.btt4);
    }
    public void hunn3(View v)
    {
        Intent i=new Intent(Cptest3.this,Ctest4.class);
        startActivity(i);
    }
}

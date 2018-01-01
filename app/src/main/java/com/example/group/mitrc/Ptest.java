package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ptest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptest);
        Button b= (Button) findViewById(R.id.bttt1);
    }
    public void huun(View v)
    {
        Intent i=new Intent(Ptest.this,Ptest1.class);
        startActivity(i);
    }
}

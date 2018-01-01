package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ctest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctest);
        Button b= (Button) findViewById(R.id.bt1);
    }
    public void hun(View v)
    {
        Intent i=new Intent(Ctest.this,Ctest1.class);
        startActivity(i);
    }
}

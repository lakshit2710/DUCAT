package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ctest3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctest3);
        Button b= (Button) findViewById(R.id.bt4);
    }
    public void hun3(View v)
    {
        Intent i=new Intent(Ctest3.this,Ctest4.class);
        startActivity(i);
    }
}

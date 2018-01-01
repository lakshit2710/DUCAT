package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Atest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atest1);
        Button b= (Button) findViewById(R.id.btnn2);
    }
    public void gun2(View v)
    {
        Intent i=new Intent(Atest1.this,Atest2.class);
        startActivity(i);
    }
}

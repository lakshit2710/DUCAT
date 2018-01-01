package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Atest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atest);
        Button b= (Button) findViewById(R.id.btnn1);
    }
    public void gun1(View v)
    {
        Intent i=new Intent(Atest.this,Atest1.class);
        startActivity(i);
    }
}

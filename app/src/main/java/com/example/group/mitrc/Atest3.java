package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Atest3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atest3);
        Button b= (Button) findViewById(R.id.btnn4);
    }
    public void gun4(View v)
    {
        Intent i=new Intent(Atest3.this,Atest4.class);
        startActivity(i);
    }
}

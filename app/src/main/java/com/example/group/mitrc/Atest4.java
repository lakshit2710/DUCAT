package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Atest4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atest4);
        Button b= (Button) findViewById(R.id.btnn5);
    }
    public void gun5(View v)
    {
        Intent i=new Intent(Atest4.this,MainActivity.class);
        startActivity(i);
        Toast.makeText(this, "Submitted sucessful", Toast.LENGTH_SHORT).show();
    }
}

package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cptest4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cptest4);
        Button b= (Button) findViewById(R.id.btt5);
    }
    public void hunn4(View v)
    {
        Intent i=new Intent(Cptest4.this,MainActivity.class);
        startActivity(i);
        Toast.makeText(this, "Submitted Sucessful", Toast.LENGTH_SHORT).show();
    }
}

package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fees extends AppCompatActivity {
    String []arr = {"C","C++","JAVA","Android","PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fees);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        ListView l = (ListView) findViewById(R.id.ls2);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent = new Intent(Fees.this,Cfees.class);
                    startActivity(intent);
                }
                if (i==1){
                    Intent intent = new Intent(Fees.this,Cplusfees.class);
                    startActivity(intent);
                }
                if (i==2){
                    Intent intent = new Intent(Fees.this,Javafees.class);
                    startActivity(intent);
                }
                if (i==3){
                    Intent intent = new Intent(Fees.this,Androidfees.class);
                    startActivity(intent);
                }
                if (i==4){
                    Intent intent = new Intent(Fees.this,Phpfees.class);
                    startActivity(intent);
                }
            }
        });

    }
}

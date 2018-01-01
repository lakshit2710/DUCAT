package com.example.group.mitrc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tutorial extends Activity {
    String []arr={"C","C++","JAVA","Android","PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        ListView l = (ListView) findViewById(R.id.ls1);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent = new Intent(Tutorial.this,C.class);
                    startActivity(intent);
                }


                if (i==1){
                    Intent intent = new Intent(Tutorial.this,Cpp.class);
                    startActivity(intent);
                }
                if (i==2){
                    Intent intent = new Intent(Tutorial.this,Java.class);
                    startActivity(intent);
                }
                if (i==3){
                    Intent intent = new Intent(Tutorial.this,Android.class);
                    startActivity(intent);
                }
                if (i==4){
                    Intent intent = new Intent(Tutorial.this,Php.class);
                    startActivity(intent);
                }
            }
        });
    }
}

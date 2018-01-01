package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.w3c.dom.Text;

public class Test extends AppCompatActivity {
    String []test={"C","C++","JAVA","ANDROID","PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,test);
        ListView lv = (ListView) findViewById(R.id.ls3);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent in= new Intent(Test.this,Ctest.class);
                    startActivity(in);

                }
                if (i==1){
                    Intent in= new Intent(Test.this,Cptest.class);
                    startActivity(in);

                }
                if (i==4){
                    Intent in= new Intent(Test.this,Ptest.class);
                    startActivity(in);

                }
                if (i==2){
                    Intent in= new Intent(Test.this,Jtest.class);
                    startActivity(in);

                }
                if (i==3){
                    Intent in= new Intent(Test.this,Atest.class);
                    startActivity(in);

                }

            }

        });
    }
}

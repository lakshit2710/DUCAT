package com.example.group.mitrc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Gallery extends AppCompatActivity {
    String []arr={"Img1","Img2","Img3","Img4","Img5","Img6","Img7","Img8","Img9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Gallery.this,android.R.layout.simple_list_item_1,arr);
        GridView l =(GridView)findViewById(R.id.gv);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(Gallery.this, GV1.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(Gallery.this, Gv2.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(Gallery.this, GV3.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(Gallery.this, GV4.class);
                    startActivity(intent);
                }
                if (position==4){
                    Intent intent = new Intent(Gallery.this, GV5.class);
                    startActivity(intent);
                }
                if (position==5){
                    Intent intent = new Intent(Gallery.this, GV6.class);
                    startActivity(intent);
                }
                if (position==6){
                    Intent intent = new Intent(Gallery.this, GV7.class);
                    startActivity(intent);
                }
                if (position==7){
                    Intent intent = new Intent(Gallery.this, GV8.class);
                    startActivity(intent);
                }
                if (position==8){
                    Intent intent = new Intent(Gallery.this, GV9.class);
                    startActivity(intent);
                }

            }
        });
    }
}

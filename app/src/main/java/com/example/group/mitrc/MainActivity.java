package com.example.group.mitrc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllId();
    }

    private void findAllId() {
        ImageButton b1 = (ImageButton) findViewById(R.id.b1);
        ImageButton b2 = (ImageButton) findViewById(R.id.b2);
        ImageButton b3 = (ImageButton) findViewById(R.id.b3);
        ImageButton b4 = (ImageButton) findViewById(R.id.b4);
        ImageButton b5 = (ImageButton) findViewById(R.id.b5);
        ImageButton b6 = (ImageButton) findViewById(R.id.b6);
        ImageButton b7 = (ImageButton) findViewById(R.id.b7);
        ImageButton b8 = (ImageButton) findViewById(R.id.b8);
        ImageButton b9 = (ImageButton) findViewById(R.id.b9);
        ImageButton b10 = (ImageButton) findViewById(R.id.b10);
    }

    public void fun(View v){

        if (v.getId()==R.id.b1) {
            Intent intent = new Intent(MainActivity.this, Tutorial.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.b2) {
            Intent intent = new Intent(MainActivity.this, Fees.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.b3) {
            Intent intent = new Intent(MainActivity.this, Gallery.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.b4) {
            Intent intent = new Intent(MainActivity.this,Certification.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.b5) {
            Intent intent = new Intent(MainActivity.this,Test.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.b6) {
            Intent intent = new Intent(MainActivity.this,Feedback.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.b7) {
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in/maps/search/cetpa/@26.831985,73.686508,7z/data=!3m1!4b1"));
            startActivity(intent);
        }
        if (v.getId()==R.id.b8) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.facebook.com/Cetpa-1851610365113496/"));
            startActivity(intent);
        }
        if (v.getId()==R.id.b9) {
            Intent intent = new Intent(MainActivity.this,Contactus.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.b10) {
            Intent intent = new Intent(MainActivity.this,Aboutus.class);
            startActivity(intent);
        }

    }
}

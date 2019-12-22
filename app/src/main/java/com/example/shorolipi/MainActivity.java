package com.example.shorolipi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img=(ImageView) findViewById(R.id.shikhi);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new  Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });


        ImageView img2=(ImageView) findViewById(R.id.likhi);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 =new  Intent(MainActivity.this,Main3Activity.class);
                startActivity(i2);
            }
        });

        ImageView img3=(ImageView) findViewById(R.id.shonkha);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 =new  Intent(MainActivity.this,Main4Activity.class);
                startActivity(i3);
            }
        });
    }
}

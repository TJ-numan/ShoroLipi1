package com.example.shorolipi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView img4=(ImageView) findViewById(R.id.shoreo);
        ImageView img5=(ImageView) findViewById(R.id.kokho);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 =new  Intent(Main2Activity.this,Main5Activity.class);
                startActivity(i4);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 =new  Intent(Main2Activity.this,Main6Activity.class);
                startActivity(i5);
            }
        });

    }


}

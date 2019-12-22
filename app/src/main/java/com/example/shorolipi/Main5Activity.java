package com.example.shorolipi;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main5Activity extends AppCompatActivity {
    MediaPlayer sound;
    MediaPlayer sound2;
    MediaPlayer sound3;
    MediaPlayer sound4;

    private ImageView so;
    private ImageView ojogor;
    private ImageView sa;
    private ImageView aam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ojogor =findViewById(R.id.ojogor);
        sa =findViewById(R.id.sa);
        so =findViewById(R.id.so);
        aam =findViewById(R.id.am);

        sound=MediaPlayer.create(this,R.raw.ojogor);
        ojogor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.start();
            }
        });

        sound2=MediaPlayer.create(this,R.raw.b_1);
        so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound2.start();
            }
        });

        sound3=MediaPlayer.create(this,R.raw.b_2);
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound3.start();
            }
        });

        sound4=MediaPlayer.create(this,R.raw.am);
        aam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound4.start();
            }
        });
    }
}

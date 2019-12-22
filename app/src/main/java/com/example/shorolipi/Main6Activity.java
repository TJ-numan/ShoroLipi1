package com.example.shorolipi;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main6Activity extends AppCompatActivity {

    MediaPlayer sound;
    MediaPlayer sound2;
    MediaPlayer sound3;
    MediaPlayer sound4;

    private ImageView ko;
    private ImageView kola;
    private ImageView kho;
    private ImageView khorgosh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ko =findViewById(R.id.ko);
        kola =findViewById(R.id.kola);
        kho =findViewById(R.id.kho);
        khorgosh =findViewById(R.id.khorgosh);

        sound=MediaPlayer.create(this,R.raw.b_12);
        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.start();
            }
        });

        sound2=MediaPlayer.create(this,R.raw.b_13);
        kho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound2.start();
            }
        });

        sound3=MediaPlayer.create(this,R.raw.kola);
        kola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound3.start();
            }
        });

        sound4=MediaPlayer.create(this,R.raw.khorgosh);
        khorgosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound4.start();
            }
        });

    }
}

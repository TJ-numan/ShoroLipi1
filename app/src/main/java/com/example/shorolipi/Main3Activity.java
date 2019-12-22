package com.example.shorolipi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class Main3Activity extends AppCompatActivity {
    DrawableView drawableView;
    Button up,down,change,undo;
    DrawableViewConfig config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        drawableView = findViewById(R.id.PaintView);
        up = findViewById(R.id.buttonUp);
        down = findViewById(R.id.buttonDown);
        change = findViewById(R.id.buttonColor);
        undo = findViewById(R.id.buttonUndo);

        config = new DrawableViewConfig();
        config.setStrokeColor(getResources().getColor(android.R.color.black));
       // config.setShowCanvasBounds(true);
        config.setMaxZoom(3.0f);
        config.setMinZoom(1.0f);
        config.setCanvasHeight(1920);
        config.setCanvasWidth(1080);

        drawableView.setConfig(config);

    }
}

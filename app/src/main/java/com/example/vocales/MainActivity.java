package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imagen1;
    ImageButton imagen2;
    ImageButton imagen3;
    ImageButton imagen4;
    ImageButton imagen5;

    private MediaPlayer mediaplayer;
    private MediaPlayer mediaplayer2;
    private MediaPlayer mediaplayer3;
    private MediaPlayer mediaplayer4;
    private MediaPlayer mediaplayer5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen1= (ImageButton) findViewById(R.id.imageButton);
        mediaplayer= MediaPlayer.create(this,R.raw.audio1);
        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });

        imagen2= (ImageButton) findViewById(R.id.imageButton2);
        mediaplayer2= MediaPlayer.create(this,R.raw.audio2);
        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer2.start();
            }
        });

        imagen3= (ImageButton) findViewById(R.id.imageButton3);
        mediaplayer3= MediaPlayer.create(this,R.raw.audio3);
        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer3.start();
            }
        });

        imagen4= (ImageButton) findViewById(R.id.imageButton4);
        mediaplayer4= MediaPlayer.create(this,R.raw.audio4);
        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer4.start();
            }
        });

        imagen5= (ImageButton) findViewById(R.id.imageButton5);
        mediaplayer5= MediaPlayer.create(this,R.raw.audio5);
        imagen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer5.start();
            }
        });


    }
}
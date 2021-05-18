package com.example.beatbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BeatActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12;
    MediaPlayer music1,music2,music3,music4,music5,music6,music7,music8,music9,music10,music11,music12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                bt1 = findViewById(R.id.img_1);
                bt2= findViewById(R.id.img_2);
                bt3= findViewById(R.id.img_3);
                bt4= findViewById(R.id.img_4);
                bt5= findViewById(R.id.img_5);
                bt6= findViewById(R.id.img_6);
                bt7= findViewById(R.id.img_7);
                bt8= findViewById(R.id.img_8);
                bt9= findViewById(R.id.img_9);
                bt10= findViewById(R.id.img_10);
                bt11= findViewById(R.id.img_11);
                bt12= findViewById(R.id.img_12);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt10.setOnClickListener(this);
        bt11.setOnClickListener(this);
        bt12.setOnClickListener(this);

        //bt1.setVisibility(View.VISIBLE);



                //Initialize Music Players.....
        music1 = MediaPlayer.create(this,R.raw.elec1);
        music2 = MediaPlayer.create(this,R.raw.amb2);
        music3 = MediaPlayer.create(this,R.raw.elec2);
        music4 = MediaPlayer.create(this,R.raw.beat1);
        music5 = MediaPlayer.create(this,R.raw.elec3);
        music6 = MediaPlayer.create(this,R.raw.beat2);
        music7 = MediaPlayer.create(this,R.raw.elec4);
        music8 = MediaPlayer.create(this,R.raw.beat3);
        music9 = MediaPlayer.create(this,R.raw.elec5);
        music10 = MediaPlayer.create(this,R.raw.beat4);
        music11 = MediaPlayer.create(this,R.raw.amb1);
        music12 = MediaPlayer.create(this,R.raw.elec6);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.img_1 :

               // music1.start();
                //Do things...
               if(!music1.isPlaying()){
                    music1.start();
                    music1.setLooping(true);
                    bt1.setBackgroundColor(Color.parseColor("#4CB8FB"));


                }else{
                    //music1.stop();
                    music1.seekTo(0);
                    music1.pause();
                    bt1.setBackgroundColor(Color.parseColor("#AA1C02"));
                    //music1.prepareAsync();
               }
               break;

            case R.id.img_2 :

                if(!music2.isPlaying()){
                    music2.start();
                    music2.setLooping(true);
                    bt2.setBackgroundColor(Color.parseColor("#4CB8FB"));
                }else{
                    music2.pause();
                    music2.seekTo(0);
                    bt2.setBackgroundColor(Color.parseColor("#ADB1F1"));
                    //music1.prepareAsync();
                }

                break;
            case R.id.img_3 :
                if(!music3.isPlaying()){
                    music3.start();
                    music3.setLooping(true);
                    bt3.setBackgroundColor(Color.parseColor("#4CB8FB"));
                }else{
                    music3.pause();
                    music3.seekTo(0);
                    //music1.prepareAsync();
                    bt3.setBackgroundColor(Color.parseColor("#134A04"));
                }


                break;
            case R.id.img_4 :
                if(!music4.isPlaying()){
                    music4.start();
                    music4.setLooping(true);
                    bt4.setBackgroundColor(Color.parseColor("#4CB8FB"));
                }else{
                    music4.pause();
                    music4.seekTo(0);
                    bt4.setBackgroundColor(Color.parseColor("#000998"));
                    //music1.prepareAsync();
                }


                break;
            case R.id.img_5 :
                if(!music5.isPlaying()){
                    music5.start();
                    music5.setLooping(true);
                    bt5.setBackgroundColor(Color.parseColor("#4CB8FB"));
                }else{
                    music5.pause();
                    music5.seekTo(0);
                    bt5.setBackgroundColor(Color.parseColor("#19DF13"));
                    //music1.prepareAsync();
                }


                break;
            case R.id.img_6 :
                if(!music6.isPlaying()){
                    music6.start();
                    music6.setLooping(true);
                    bt6.setBackgroundColor(Color.parseColor("#4CB8FB"));
                }else{
                    music6.pause();
                    music6.seekTo(0);
                    bt6.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    //music1.prepareAsync();
                }
                break;
            case R.id.img_7 :
                if(!music7.isPlaying()){
                    music7.start();
                    music7.setLooping(true);
                    bt7.setBackgroundColor(Color.parseColor("#4CB8FB"));
                }else{
                    music7.pause();
                    music7.seekTo(0);
                    //music1.prepareAsync();
                    bt7.setBackgroundColor(Color.parseColor("#9C27B0"));
                }
                break;
            case R.id.img_8 :
                if(!music8.isPlaying()){
                    music8.start();
                    music8.setLooping(true);
                    bt8.setBackgroundColor(Color.parseColor("#4CB8FB"));
                }else{
                    music8.pause();
                    music8.seekTo(0);
                    //music1.prepareAsync();
                    bt8.setBackgroundColor(Color.parseColor("#673AB7"));
                }
                break;
            case R.id.img_9:
                if(!music9.isPlaying()){
                    music9.start();
                    music9.setLooping(true);
                    bt9.setBackgroundColor(Color.parseColor("#4CB8FB"));
                }else{
                    music9.pause();
                    music9.seekTo(0);
                    //music1.prepareAsync();
                    bt9.setBackgroundColor(Color.parseColor("#8BC34A"));
                }
                break;
            case R.id.img_10 :
                if(!music10.isPlaying()){
                    music10.start();
                    music10.setLooping(true);
                    bt10.setBackgroundColor(Color.parseColor("#4CB8FB"));
                }else{
                    music10.pause();
                    music10.seekTo(0);
                    //music1.prepareAsync();
                    bt10.setBackgroundColor(Color.parseColor("#E91E63"));
                }
                break;
            case R.id.img_11 :
                if(!music11.isPlaying()){
                    music11.start();
                    music11.setLooping(true);
                    bt11.setBackgroundColor(Color.parseColor("#4CB8FB"));
                }else{
                    music11.pause();
                    music11.seekTo(0);
                    //music1.prepareAsync();
                    bt11.setBackgroundColor(Color.parseColor("#372043"));
                }
                break;
            case R.id.img_12 :
                if(!music12.isPlaying()){
                    music12.start();
                    music12.setLooping(true);
                    bt12.setBackgroundColor(Color.parseColor("#4CB8FB"));
                }else{
                    music12.pause();
                    music12.seekTo(0);
                    //music1.prepareAsync();
                    bt12.setBackgroundColor(Color.parseColor("#FF5722"));
                }
                break;
        }
    }
}
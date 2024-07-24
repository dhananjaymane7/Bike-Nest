package com.example.royalenfield;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class Homepage extends AppCompatActivity {

    VideoView videoView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        videoView1 = findViewById(R.id.scram);
        videoView1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.scram);
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView1);
//        videoView1.setMediaController(mediaController);
        videoView1.requestFocus();
        videoView1.start();
        videoView1.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {

            @Override
            public void onPrepared(MediaPlayer mediaPlayer)
            {
                mediaPlayer.setVolume(0f, 0f);
                mediaPlayer.setLooping(true);
            }
        });
    }
    public void click2(View view)
    {
        Intent i = new Intent(Homepage.this,motorcycles.class);
        startActivity(i);
    }

    public void click3(View view)
    {
        Intent i = new Intent(Homepage.this,accessories1.class);
        startActivity(i);
    }

    public void click4(View view)
    {
        Intent i = new Intent(Homepage.this,aboutus.class);
        startActivity(i);
    }

    public void click5(View view)
    {
        Intent i = new Intent(Homepage.this,contactus.class);
        startActivity(i);
    }

    public void click6(View view)
    {
        Intent i = new Intent(Homepage.this,Our_World.class);
        startActivity(i);
    }

    public void clickim1(View view)
    {
        Intent i = new Intent(Homepage.this,motorcycles.class);
        startActivity(i);
    }

    public void click22(View view)
    {
        Intent i = new Intent(Homepage.this,accessories1.class);
        startActivity(i);
    }

    public void apparel(View view)
    {
        Intent i = new Intent(Homepage.this,apparel.class);
        startActivity(i);
    }

    public void app(View view)
    {
        Intent i = new Intent(Homepage.this,apparel.class);
        startActivity(i);
    }

    public void click7(View view)
    {
        Intent i = new Intent(Homepage.this,event.class);
        startActivity(i);
    }


    public void showroom(View view)
    {
        openMap();
    }

    private void openMap()
    {
        Uri uri= Uri.parse("geo:0, 0?q=Royal Enfield Showroom - Nand Enterprises Satara");
        Intent i =new Intent(Intent.ACTION_VIEW,uri);
        i.setPackage("com.google.android.apps.maps");
        startActivity(i);
    }


    public void bookBike(View view)
    {
        Intent intent=new Intent(this,bookbike11.class);
        startActivity(intent);
    }

    public void book(View view)
    {
        Intent intent=new Intent(this,testride.class);
        startActivity(intent);
    }
}
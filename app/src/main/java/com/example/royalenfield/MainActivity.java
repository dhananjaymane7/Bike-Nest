package com.example.royalenfield;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
{
    private ProgressBar progressBar;
    private Timer timer;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        progressBar=findViewById(R.id.progressBar1);
        timer=new Timer();
        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                if (i<100)
                {
                    runOnUiThread(new Runnable()
                    {
                        @Override
                        public void run()
                        {

                        }
                    });
                    progressBar.setProgress(i);
                    i++;
                }else
                {
                    timer.cancel();
                    Intent intent=new Intent(MainActivity.this, LoginPage.class);
                    startActivity(intent);
                    finish();
                }
            }
        },0,30);
    }
}
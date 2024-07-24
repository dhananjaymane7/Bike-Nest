package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class accessories1 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories1);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void scram(View view)
    {
        Intent i = new Intent(accessories1.this,scram411.class);
        startActivity(i);

    }

    public void classic(View view)
    {
        Intent i = new Intent(accessories1.this,classic.class);
        startActivity(i);
    }

    public void meteor(View view)
    {
        Intent i = new Intent(accessories1.this,meteor.class);
        startActivity(i);
    }

    public void bullet(View view)
    {
        Intent i1 = new Intent(accessories1.this,bullet.class);
        startActivity(i1);
    }

    public void himalayan(View view)
    {
        Intent i1 = new Intent(accessories1.this,himalaya.class);
        startActivity(i1);
    }

    public void interceptor(View view)
    {
        Intent i1 = new Intent(accessories1.this,interceptor.class);
        startActivity(i1);
    }

    public void continental(View view)
    {
        Intent i1 = new Intent(accessories1.this,continental.class);
        startActivity(i1);

    }
}
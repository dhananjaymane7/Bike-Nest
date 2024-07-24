package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class apparel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apparel);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void helmets(View view)
    {
        Intent i = new Intent(apparel.this,helmet.class);
        startActivity(i);
    }

    public void jackets(View view)
    {
        Intent i = new Intent(apparel.this,jackets.class);
        startActivity(i);
    }

    public void boots(View view)
    {
        Intent i = new Intent(apparel.this,boots.class);
        startActivity(i);
    }

    public void gloves(View view)
    {
        Intent i = new Intent(apparel.this,gloves.class);
        startActivity(i);
    }
}
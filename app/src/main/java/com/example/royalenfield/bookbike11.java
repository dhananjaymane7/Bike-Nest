package com.example.royalenfield;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class bookbike11 extends AppCompatActivity {

    Spinner model;
    String models[]={"Scram411","Classic 350","Meteor","Himalayan","Intercepter","Continental GT","Bullet"};
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookbike11);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        model=findViewById(R.id.model);
    }

    public void book(View view)
    {
        adp=new ArrayAdapter<String>(this, android.support.constraint.R.layout.support_simple_spinner_dropdown_item,models);
        model.setAdapter(adp);
    }
}
package com.example.royalenfield;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.Toast;

public class contactus extends AppCompatActivity {

    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        checkBox=findViewById(R.id.ch1);
    }

    public void click12(View view)
    {
        if(checkBox.isChecked())
        {

        }
        else
        {
            Toast.makeText(this,"Please agree terms and conditions",Toast.LENGTH_LONG).show();
        }
    }
}
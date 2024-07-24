package com.example.royalenfield;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class otp_verification extends AppCompatActivity
{
    TextView t1;
    Button verify;
    EditText getotp;
    RegistrationLoginDatabase rdb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        getotp = findViewById(R.id.getotp);

        rdb=new RegistrationLoginDatabase(this);


    }
    public void verify(View v){

        String name=getIntent().getStringExtra("name");
        String email=getIntent().getStringExtra("email");
        String phone=getIntent().getStringExtra("phone");
        String username=getIntent().getStringExtra("username");
        String userpassword=getIntent().getStringExtra("userpassword");
        String i_otp=getIntent().getStringExtra("otp");
        String otp=getotp.getText().toString();

        if(otp.equals(i_otp)){
            rdb.insertData(name,email,Long.parseLong(phone),username,userpassword);
            Toast.makeText(this, "Data Inserted!", Toast.LENGTH_SHORT).show();

            Intent i=new Intent(this,LoginPage.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Invalid OTP! Try Again!", Toast.LENGTH_SHORT).show();
        }

    }
}
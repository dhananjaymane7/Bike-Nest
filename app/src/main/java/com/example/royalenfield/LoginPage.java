package com.example.royalenfield;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class LoginPage extends AppCompatActivity
{

    EditText username,password;
    RegistrationLoginDatabase rdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        rdb = new RegistrationLoginDatabase(this);
    }

    public void login(View view) {

        boolean isAvailable=false;
        String name=username.getText().toString();
        String pass=password.getText().toString();
        int flag=0;
//        Random rand=new Random();
//        int otp=rand.nextInt(1000000)+9999;

        Cursor c=rdb.displayData();

        if(name.equals("")&&pass.equals("") || pass.equals("") || name.equals(""))
        {
            Toast.makeText(this, "Please Enter All Fields!", Toast.LENGTH_SHORT).show();
            flag++;
        }
        if(name.equals("admin") && pass.equals("admin123")){
            Intent i=new Intent(this,adminActivity.class);
            startActivity(i);
//            SmsManager sm=SmsManager.getDefault();
//            sm.sendTextMessage(pho,null,String.valueOf(otp),null,null);
//            Intent i=new Intent(this,otp_verification.class);
//            startActivity(i);

        }

        while(c.moveToNext()){
            if(c.getString(3).equals(name) && c.getString(4).equals(pass)){
                isAvailable=true;
                Intent i = new Intent(LoginPage.this,Homepage.class);
                SharedPreferences sharedPreferences = getSharedPreferences("uname",MODE_PRIVATE);

                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("name", name);

                myEdit.commit();
                startActivity(i);
            }

        }
        if(!isAvailable && flag!=1){
            Toast.makeText(this, "Invalid Credentials!", Toast.LENGTH_SHORT).show();

        }

    }

    public void registerPage(View view) {
//        Intent i=new Intent(this,Login.class);
        Random rand=new Random();
        int otp=rand.nextInt(1000000)+9999;

        Intent i=new Intent(this,Login.class);
        i.putExtra("otp",String.valueOf(otp));

        startActivity(i);
    }
}





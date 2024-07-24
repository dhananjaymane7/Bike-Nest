package com.example.royalenfield;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Login extends AppCompatActivity
{


    EditText name,email,phone,R_username,R_password;

    RegistrationLoginDatabase rdb;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        rdb=new RegistrationLoginDatabase(this);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        R_username=findViewById(R.id.R_username);
        R_password=findViewById(R.id.R_password);

    }

    public void register(View view) {
        String nm=name.getText().toString();
        String em=email.getText().toString();
        String pho=phone.getText().toString();
        String uname=R_username.getText().toString();
        String upass=R_password.getText().toString();

        boolean isRight=true;
        Cursor c=rdb.displayData();


//         if(rdb.isExists(uname)){
//             isRight= false;
//             Toast.makeText(this, "Username Already Exists", Toast.LENGTH_SHORT).show();
//         }


        if(nm.equals("") || em.equals("") || pho.equals("") || uname.equals("") || upass.equals("")){
            Toast.makeText(this, "Please Fill All Fields!", Toast.LENGTH_SHORT).show();
            isRight=false;
        }
        if(nm.length()<5 || uname.length()<5){
            Toast.makeText(this, "Name should 5 chars long!", Toast.LENGTH_SHORT).show();
            isRight=false;
        }
        if(pho.length()!=10){
            Toast.makeText(this, "Phone Number should be 10 digit long!", Toast.LENGTH_SHORT).show();
            isRight=false;
        }
        if(upass.length()<8){
            Toast.makeText(this, "Password should be 8 digit long!", Toast.LENGTH_SHORT).show();
            isRight=false;
        }



        if(isRight)
        {
            Random rand=new Random();
            int otp=rand.nextInt(1000000)+9999;



            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},0);

            if(ContextCompat.checkSelfPermission(this,Manifest.permission.SEND_SMS)==PackageManager.PERMISSION_GRANTED)
            {
                SmsManager sm=SmsManager.getDefault();
                sm.sendTextMessage(pho,null,String.valueOf(otp),null,null);

                Intent i=new Intent(this,otp_verification.class);

                i.putExtra("name",nm);
                i.putExtra("email",em);
                i.putExtra("phone",pho);
                i.putExtra("username",uname);
                i.putExtra("userpassword",upass);
                i.putExtra("otp",String.valueOf(otp));

                startActivity(i);
            }



        }
    }
    }


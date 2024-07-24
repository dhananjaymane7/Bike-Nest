package com.example.royalenfield;

import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class adminActivity extends AppCompatActivity {

    TableLayout root;
    boolean isclicked=true;
    RegistrationLoginDatabase rdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        getSupportActionBar().hide();
        root=findViewById(R.id.root);
        rdb=new RegistrationLoginDatabase(this);
    }


    public void userDetails(View view) {

        if(isclicked) {

            isclicked=false;
            Cursor c = rdb.displayData();

            TableLayout stk = findViewById(R.id.table_main);
            TableRow tbrow0 = new TableRow(this);
            TextView tv0 = new TextView(this);
            tv0.setText(" Name ");
            tv0.setGravity(Gravity.CENTER);
            tv0.setTypeface(Typeface.DEFAULT_BOLD);

//        tv0.setTextColor(Color.WHITE);
            tbrow0.addView(tv0);
            TextView tv1 = new TextView(this);
            tv1.setText(" Email ");
            tv1.setGravity(Gravity.CENTER);
            tv1.setTypeface(Typeface.DEFAULT_BOLD);
//        tv1.setTextColor(Color.WHITE);
            tbrow0.addView(tv1);
            TextView tv2 = new TextView(this);
            tv2.setText(" Phone Number ");
            tv2.setGravity(Gravity.CENTER);
            tv2.setTypeface(Typeface.DEFAULT_BOLD);
//        tv2.setTextColor(Color.WHITE);
            tbrow0.addView(tv2);
            TextView tv3 = new TextView(this);
            tv3.setText(" Username ");
            tv3.setGravity(Gravity.CENTER);
            tv3.setTypeface(Typeface.DEFAULT_BOLD);
//        tv3.setTextColor(Color.WHITE);
            tbrow0.addView(tv3);

            stk.addView(tbrow0);
            while (c.moveToNext()) {

                TableRow tbrow = new TableRow(this);

//                TextView t0v = new TextView(this);
//                t0v.setText(c.getInt(0));
//                t0v.setGravity(Gravity.CENTER);

                TextView t1v = new TextView(this);
                t1v.setText(c.getString(0));


//                t1v.setTextColor(Color.WHITE);
                t1v.setGravity(Gravity.CENTER);
                tbrow.addView(t1v);
                TextView t2v = new TextView(this);
                t2v.setText(c.getString(1));


//                t2v.setTextColor(Color.WHITE);
                t2v.setGravity(Gravity.CENTER);
                tbrow.addView(t2v);
                TextView t3v = new TextView(this);
                t3v.setText(c.getLong(2) + "");

//                t3v.setTextColor(Color.WHITE);
                t3v.setGravity(Gravity.CENTER);
                tbrow.addView(t3v);
                TextView t4v = new TextView(this);
                t4v.setText(c.getString(3));
//                t4v.setTextColor(Color.WHITE);
                t4v.setGravity(Gravity.CENTER);


                tbrow.addView(t4v);
                stk.addView(tbrow);

            }

        }


    }
}
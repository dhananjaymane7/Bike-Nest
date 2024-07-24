package com.example.royalenfield;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class RegistrationLoginDatabase extends SQLiteOpenHelper {
    Context c;
    public RegistrationLoginDatabase(Context c){
        super(c,"User_Registration_DB",null,1);
        this.c=c;

    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query="create table User_Registration_Details(Name text,Email text,PhoneNumber int primary key,Username text,Password text);";
//      String query="drop table User_Registration_Details";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


    }
    public void insertData(String name,String email,long phone,String username,String password){
        SQLiteDatabase s=getWritableDatabase();

        String query="insert into User_Registration_Details values('"+name+"','"+email+"',"+phone+",'"+username+"','"+password+"');";
        Log.d("query",query);
        s.execSQL(query);
    }
    public Cursor displayData(){

        SQLiteDatabase s=getWritableDatabase();
        String query="select * from User_Registration_Details";
        Cursor c=s.rawQuery(query,null);
        return c;

    }
    public boolean isExists(String username){
        SQLiteDatabase s=getWritableDatabase();
        Cursor c1=s.query("User_Registration_Details",null,"username=?",new String[]{username},null,null,null);
        c1.moveToFirst();


        return true;
    }
}

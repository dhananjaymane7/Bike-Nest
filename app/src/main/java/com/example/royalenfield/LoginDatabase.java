package com.example.royalenfield;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class LoginDatabase extends SQLiteOpenHelper {
    public LoginDatabase(Context c){
        super(c,"USERDB",null,1);

    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query="create table User_Login_Details(Username text,Password text);";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void insertData(String name,String password){
        SQLiteDatabase s=getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put("Username",name);
        c.put("Password",password);
        s.insert("User_Login_Details",null,c);
    }
    public Cursor displayData(){

        SQLiteDatabase s=getWritableDatabase();
        String query="select * from User_Login_Details";
        Cursor c=s.rawQuery(query,null);
        return c;

    }
}

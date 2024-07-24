package com.example.royalenfield;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class Accessories_Db extends SQLiteOpenHelper {
    Context c;
    public Accessories_Db(Context c){
        super(c,"access",null,1);
        this.c=c;

    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query="create table purchase (uname text,Name text,Price integer);";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


    }
    public void insertData(String uname,String name,int price ){
        SQLiteDatabase s=getWritableDatabase();

       ContentValues c = new ContentValues();
       c.put("uname",uname);
        c.put("name",name);
        c.put("price",price);
        s.insert("purchase",null,c);
    }

    public Cursor displayData(){

        SQLiteDatabase s=getWritableDatabase();
        String query="select * from purchase";
        Cursor c=s.rawQuery(query,null);
        return c;

    }

}

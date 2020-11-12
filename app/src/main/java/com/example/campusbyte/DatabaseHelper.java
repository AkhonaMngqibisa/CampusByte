package com.example.campusbyte;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper
{
    public DatabaseHelper(Context context)
    {
        super (context, "CampusByte.db", null, 1);

    }

    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("Create table user(fullname text, username text,email text primary key, password text)");

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("drop table if exists user");

    }

    //Inserting values to DB
    public boolean insert(String fullname, String username, String email, String password )
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("fullname", fullname);
        contentValues.put("username",username);
        contentValues.put("email",email);
        contentValues.put("password",password);

        long ins = db.insert("user",null,contentValues);
        if(ins==-1) return false;
        else return true;
    }

    //Checking if email exist
    public Boolean checkEmail(String email)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from user where email=? ", new String[] {email});
        if(cursor.getCount()>0) return false;

        else return true;
 }

 //validating email ad password
    public boolean checkEandP(String email, String password)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from user where email=? and password=?", new String[] {email,password} );
        if(cursor.getCount()>0) return true;

        else return false;
    }

}

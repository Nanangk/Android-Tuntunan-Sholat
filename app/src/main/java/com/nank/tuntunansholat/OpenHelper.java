package com.nank.tuntunansholat;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class OpenHelper extends SQLiteOpenHelper {
    static final String DB_NAME= "MyDb";
    static final Integer DB_VERSION= 1;
    public OpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION); }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE sholat("+ "subuh PRIMARY KEY,"+ "zuhur TEXT, asar TEXT, magrib TEXT, isya TEXT)");
    }
    @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)  {
        Log.w("Upgrade", "Prosesakandrop danbuatulangtabel.");
        db.execSQL("DROP TABLE IF EXISTS sholat"); onCreate(db);
    }


}

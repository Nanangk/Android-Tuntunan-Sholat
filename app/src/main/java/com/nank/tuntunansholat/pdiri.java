package com.nank.tuntunansholat;
import android.app.AlertDialog;
import android.database.Cursor;
import android.view.View;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;


public class pdiri extends AppCompatActivity {

    private SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    { // TODOAuto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdiri);
        openDatabase();

    }
    @Override
    protected void onDestroy()
    { // TODOAuto-generated method stub
        super.onDestroy();
        closeDatabase(); }
    public void openDatabase() {
        OpenHelper xy= new OpenHelper(
                this.getApplicationContext());
        db= xy.getWritableDatabase();}
    public void closeDatabase() {
        db.close(); }

    public void simpan(View v) {
        TextView subuh = (TextView) findViewById(R.id.csubuh);
        TextView zuhur= (TextView) findViewById(R.id.czuhur);
        TextView asar= (TextView) findViewById(R.id.casar);
        TextView magrib= (TextView) findViewById(R.id.cmagrib);
        TextView isya= (TextView) findViewById(R.id.cisya);
        ContentValues initialValues= new ContentValues();
        initialValues.put("subuh", subuh.getText().toString());
        initialValues.put("zuhur", zuhur.getText().toString());
        initialValues.put("asar", asar.getText().toString());
        initialValues.put("magrib", magrib.getText().toString());
        initialValues.put("isya", isya.getText().toString());
        db.insert("sholat", null, initialValues);
        tampilToast("Berhasil Disimpan");
    }

    private void tampilToast(String pesan)
    { int duration = Toast.LENGTH_SHORT;
        Toast toast= Toast.makeText(getApplicationContext(), pesan, duration);
        toast.show(); }




}

package com.nank.tuntunansholat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tuntunansholat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuntunansholat);
    }

    public void gogo(View v){
        Intent tabel = new Intent(this,tabel.class);
        startActivity(tabel);

    }
}

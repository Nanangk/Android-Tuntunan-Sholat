package com.nank.tuntunansholat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class depan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depan);
    }
    public void Klik(View v){
        Intent wudhu = new Intent(this,wudhu.class);
                startActivity(wudhu);

    }
    public void Klik2(View v){
        Intent rsholat = new Intent(this,rukunsholat.class);
        startActivity(rsholat);

    }

    public void Klik3(View v){
        Intent tsholat = new Intent(this,tuntunansholat.class);
        startActivity(tsholat);

    }

    public void Klik4(View v){
        Intent swsholat = new Intent(this,swsholat.class);
        startActivity(swsholat);

    }

    public void Klik5(View v){
        Intent sssholat = new Intent(this,sssholat.class);
        startActivity(sssholat);

    }

    public void Klik6(View v){
        Intent ymsholat = new Intent(this,ymsholat.class);
        startActivity(ymsholat);

    }

    public void Klik7(View v){
        Intent pdiri = new Intent(this,pdiri.class);
        startActivity(pdiri);

    }
}

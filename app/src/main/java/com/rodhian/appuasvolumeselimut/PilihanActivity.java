package com.rodhian.appuasvolumeselimut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PilihanActivity extends AppCompatActivity {
    ImageView kembali, kubus, kerucut, balok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan);

        kembali = (ImageView) findViewById(R.id.kembali);
        kubus = (ImageView) findViewById(R.id.kubus);
        kerucut = (ImageView) findViewById(R.id.kerucut);
        balok = (ImageView) findViewById(R.id.balok);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PilihanActivity.this, MainActivity.class);
                PilihanActivity.this.startActivity(intent);
                PilihanActivity.this.finish();
            }
        });
        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PilihanActivity.this, HalamanKubusActivity.class);
                PilihanActivity.this.startActivity(intent);
                PilihanActivity.this.finish();
            }
        });
        kerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PilihanActivity.this, HalamanKerucutActivity.class);
                PilihanActivity.this.startActivity(intent);
                PilihanActivity.this.finish();
            }
        });
        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PilihanActivity.this, HalamanBalokActivity.class);
                PilihanActivity.this.startActivity(intent);
                PilihanActivity.this.finish();
            }
        });
    }
}

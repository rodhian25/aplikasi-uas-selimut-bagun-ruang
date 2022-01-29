package com.rodhian.appuasvolumeselimut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HalamanBalokActivity extends AppCompatActivity {
    ImageView kembali3, imageView5, imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanbalok);

        kembali3 = (ImageView) findViewById(R.id.kembali3);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);

        kembali3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanBalokActivity.this,
                        PilihanActivity.class);
                HalamanBalokActivity.this.startActivity(intent);
                HalamanBalokActivity.this.finish();
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanBalokActivity.this,
                        VolumeBalokActivity.class);
                HalamanBalokActivity.this.startActivity(intent);
                HalamanBalokActivity.this.finish();
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanBalokActivity.this,
                        LuasBalokActivity.class);
                HalamanBalokActivity.this.startActivity(intent);
                HalamanBalokActivity.this.finish();
            }
        });
    }
}

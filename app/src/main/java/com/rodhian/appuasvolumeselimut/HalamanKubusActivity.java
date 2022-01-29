package com.rodhian.appuasvolumeselimut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HalamanKubusActivity extends AppCompatActivity {
    ImageView kembali4, imageView, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamankubus);

        kembali4 = (ImageView) findViewById(R.id.kembali4);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        kembali4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanKubusActivity.this,
                        PilihanActivity.class);
                HalamanKubusActivity.this.startActivity(intent);
                HalamanKubusActivity.this.finish();
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanKubusActivity.this,
                        VolumeKubusActivity.class);
                HalamanKubusActivity.this.startActivity(intent);
                HalamanKubusActivity.this.finish();
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanKubusActivity.this,
                        LuasKubusActivity.class);
                HalamanKubusActivity.this.startActivity(intent);
                HalamanKubusActivity.this.finish();
            }
        });
    }
}

package com.rodhian.appuasvolumeselimut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HalamanKerucutActivity extends AppCompatActivity {
    ImageView kembali2, imageView3, imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamankerucut);

        kembali2 = (ImageView) findViewById(R.id.kembali2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);

        kembali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanKerucutActivity.this,
                        PilihanActivity.class);
                HalamanKerucutActivity.this.startActivity(intent);
                HalamanKerucutActivity.this.finish();
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanKerucutActivity.this,
                        VolumeKerucutActivity.class);
                HalamanKerucutActivity.this.startActivity(intent);
                HalamanKerucutActivity.this.finish();
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanKerucutActivity.this,
                        LuasKerucutActivity.class);
                HalamanKerucutActivity.this.startActivity(intent);
                HalamanKerucutActivity.this.finish();
            }
        });
    }
}

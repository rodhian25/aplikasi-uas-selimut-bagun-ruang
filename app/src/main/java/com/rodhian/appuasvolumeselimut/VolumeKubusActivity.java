package com.rodhian.appuasvolumeselimut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VolumeKubusActivity extends AppCompatActivity {
    ImageView kembali5;
    Button button;
    EditText editText3;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumekubus);

        kembali5  = (ImageView) findViewById(R.id.kembali5);
        button    = (Button)    findViewById(R.id.button);
        editText3 = (EditText)  findViewById(R.id.editText3);
        hasil     = (TextView)  findViewById(R.id.hasil);


        kembali5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VolumeKubusActivity.this,
                        HalamanKubusActivity.class);
                VolumeKubusActivity.this.startActivity(intent);
                VolumeKubusActivity.this.finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                //pengkondisian apabila editext sisi kosong
                if (editText3.length() == 0 ) {
                    Toast.makeText(getApplication(),"Sisi Kubus Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    //ambil nilai dari sisi
                    String inputSisi = editText3.getText().toString();

                    //parsing isiAlas dan isiTinggi menjadi double
                    double sisi= Double.parseDouble(inputSisi);

                    //panggil method Volume Kubus
                    double Hasil = volumeKubus(sisi);

                    //parsing hasil menjadi string
                    String output = String.valueOf(Hasil);

                    //set txtHasil dengan output (string hasil parsing)
                    hasil.setText(output.toString());
                }
            }
            public double volumeKubus(double s) {
                return (s*s*s);
            }
        });
    }
}

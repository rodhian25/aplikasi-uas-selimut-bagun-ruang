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

public class VolumeKerucutActivity extends AppCompatActivity {
    ImageView kembali9;
    Button button5;
    EditText editText9, editText10;
    TextView textView17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumekerucut);

        kembali9   = (ImageView) findViewById(R.id.kembali9);
        button5    = (Button)    findViewById(R.id.button5);
        editText9  = (EditText)  findViewById(R.id.editText9);
        editText10 = (EditText)  findViewById(R.id.editText10);
        textView17 = (TextView)  findViewById(R.id.textView17);

        kembali9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VolumeKerucutActivity.this,
                        HalamanKerucutActivity.class);
                VolumeKerucutActivity.this.startActivity(intent);
                VolumeKerucutActivity.this.finish();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                //pengkondisian apabila editext kosong
                if (editText9.length() == 0  && editText10.length() == 0)  {
                    Toast.makeText(getApplication(),"Semua inputan Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext jari-jari kosong
                else if (editText9.length() == 0){
                    Toast.makeText(getApplication(),"Jari-jari Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext tinggi kosong
                else if (editText10.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    //ambil nilai dari
                    String inputJari = editText9.getText().toString();
                    String inputTinggi = editText10.getText().toString();

                    //parsing isiAlas dan isiTinggi menjadi double
                    double j = Double.parseDouble(inputJari);
                    double t = Double.parseDouble(inputTinggi);

                    //panggil method volume kerucut
                    double hs = VolumeKerucut(j, t);

                    //parsing hasil menjadi string
                    String output = String.valueOf(hs);

                    //set txtHasil dengan output (string hasil parsing)
                    textView17.setText(output.toString());
                }
            }
            public double VolumeKerucut(double j, double t) {
                return (1*(3.14*j*j)/3)*t;
            }
        });
    }
}

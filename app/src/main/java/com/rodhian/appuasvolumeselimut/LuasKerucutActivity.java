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

public class LuasKerucutActivity extends AppCompatActivity {
    ImageView kembali10;
    Button button6;
    EditText editText11, editText12;
    TextView textView22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luaskerucut);

        kembali10  = (ImageView) findViewById(R.id.kembali10);
        button6    = (Button)    findViewById(R.id.button6);
        editText11 = (EditText)  findViewById(R.id.editText11);
        editText12 = (EditText)  findViewById(R.id.editText12);
        textView22 = (TextView)  findViewById(R.id.textView22);

        kembali10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LuasKerucutActivity.this,
                        HalamanKerucutActivity.class);
                LuasKerucutActivity.this.startActivity(intent);
                LuasKerucutActivity.this.finish();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                //pengkondisian apabila editext kosong
                if (editText11.length() == 0  && editText12.length() == 0)  {
                    Toast.makeText(getApplication(),"Semua inputan Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext jari-jari kosong
                else if (editText11.length() == 0){
                    Toast.makeText(getApplication(),"Jari-jari Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext tinggi kosong
                else if (editText12.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    //ambil nilai dari
                    String inputJari = editText11.getText().toString();
                    String inputTinggi = editText12.getText().toString();

                    //parsing isiAlas dan isiTinggi menjadi double
                    double jari = Double.parseDouble(inputJari);
                    double tinggi = Double.parseDouble(inputTinggi);
                    double Hasil = LuasPerKerucut(jari, tinggi);

                    //parsing hasil menjadi string
                    String output = String.valueOf(Hasil);

                    //set txtHasil dengan output (string hasil parsing)
                    textView22.setText(output.toString());
                }
            }
            public double LuasPerKerucut(double j, double t) {
                return (3.14*j*
                        (j+(3.14*j)*(Math.sqrt( Math.pow(j,2)+ Math.pow(t,2)))));
            }
        });
    }
}

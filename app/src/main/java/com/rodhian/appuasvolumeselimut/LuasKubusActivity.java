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

public class LuasKubusActivity extends AppCompatActivity {
    ImageView kembali7;
    Button button2;
    EditText editText2;
    TextView hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luaskubus);

        kembali7  = (ImageView) findViewById(R.id.kembali7);
        button2   = (Button)    findViewById(R.id.button2);
        editText2 = (EditText)  findViewById(R.id.editText2);
        hasil2    = (TextView)  findViewById(R.id.hasil2);

        kembali7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LuasKubusActivity.this,
                        HalamanKubusActivity.class);
                LuasKubusActivity.this.startActivity(intent);
                LuasKubusActivity.this.finish();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                //pengkondisian apabila editext sisi kosong
                if (editText2.length() == 0 ) {
                    Toast.makeText(getApplication(),"Sisi Kubus Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    //ambil nilai dari sisi
                    String inputSisi = editText2.getText().toString();

                    //parsing isiAlas dan isiTinggi menjadi double
                    double sisi = Double.parseDouble(inputSisi);

                    //panggil method Luas Permukaan Kubus
                    double Hasil = LuasperKubus(sisi);

                    //parsing hasil menjadi string
                    String output = String.valueOf(Hasil);

                    //set txtHasil dengan output (string hasil parsing)
                    hasil2.setText(output.toString());

                }
            }
            public double LuasperKubus(double s) {
                return (6*(s*s));

            }
        });
    }
}

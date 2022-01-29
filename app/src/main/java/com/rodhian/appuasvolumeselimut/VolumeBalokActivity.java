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

public class VolumeBalokActivity extends AppCompatActivity {
    ImageView kembali6;
    Button button4;
    EditText editText6, editText7, editText8;
    TextView textView11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumebalok);

        kembali6   = (ImageView) findViewById(R.id.kembali6);
        button4    = (Button)    findViewById(R.id.button4);
        editText6  = (EditText)  findViewById(R.id.editText6);
        editText7  = (EditText)  findViewById(R.id.editText7);
        editText8  = (EditText)  findViewById(R.id.editText8);
        textView11 = (TextView)  findViewById(R.id.textView11);

        kembali6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VolumeBalokActivity.this,
                        HalamanBalokActivity.class);
                VolumeBalokActivity.this.startActivity(intent);
                VolumeBalokActivity.this.finish();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                //pengkondisian apabila editext kosong
                if (editText6.length() == 0  && editText7.length() == 0 && editText8.length() == 0){
                    Toast.makeText(getApplication(),"Semua inputan Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext panjang kosong
                else if (editText6.length() == 0){
                    Toast.makeText(getApplication(),"Panjang Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext lebar kosong
                else if (editText7.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext tinggi kosong
                else if (editText8.length() ==0 ){
                    Toast.makeText(getApplication(),"Tinggi Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    //ambil nilai dari
                    String inputPanjang = editText6.getText().toString();
                    String inputLebar = editText7.getText().toString();
                    String inputTinggi = editText8.getText().toString();

                    //parsing isiAlas dan isiTinggi menjadi double
                    double panjang = Double.parseDouble(inputPanjang);
                    double lebar = Double.parseDouble(inputLebar);
                    double tinggi = Double.parseDouble(inputTinggi);

                    //panggil method volume balok
                    double Hasil = VolumeBalok(panjang, lebar, tinggi);

                    //parsing hasil menjadi string
                    String output = String.valueOf(Hasil);

                    //set txtHasil dengan output (string hasil parsing)
                    textView11.setText(output.toString());
                }
            }
            public double VolumeBalok(double p, double l, double t ) {
                return (p*l*t);
            }
        });
    }
}


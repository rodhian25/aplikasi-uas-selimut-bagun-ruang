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

public class LuasBalokActivity extends AppCompatActivity {
    ImageView kembali8;
    Button button3;
    EditText editText, editText4, editText5;
    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luasbalok);

        kembali8  = (ImageView) findViewById(R.id.kembali8);
        button3   = (Button)    findViewById(R.id.button3);
        editText  = (EditText)  findViewById(R.id.editText);
        editText4 = (EditText)  findViewById(R.id.editText4);
        editText5 = (EditText)  findViewById(R.id.editText5);
        textView5 = (TextView)  findViewById(R.id.textView5);

        kembali8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LuasBalokActivity.this,
                        HalamanBalokActivity.class);
                LuasBalokActivity.this.startActivity(intent);
                LuasBalokActivity.this.finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                //pengkondisian apabila editext semua kosong
                if (editText.length() == 0  && editText4.length() == 0 && editText5.length() == 0) {
                    Toast.makeText(getApplication(),"Semua inputan Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext panjang kosong
                else if (editText.length() == 0){
                    Toast.makeText(getApplication(),"Panjang Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext lebar kosong
                else if (editText4.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext tinggi kosong
                else if (editText5.length() ==0 ){
                    Toast.makeText(getApplication(),"Tinggi Tidak Boleh Kosong ",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    //ambil nilai dari
                        String inputPanjang = editText.getText().toString();
                        String inputLebar = editText4.getText().toString();
                        String inputTinggi = editText5.getText().toString();

                    //parsing isiAlas dan isiTinggi menjadi double
                        double panjang = Double.parseDouble(inputPanjang);
                        double lebar = Double.parseDouble(inputLebar);
                        double tinggi = Double.parseDouble(inputTinggi);

                    //panggil method luas permukaan balok
                    double hs = LuasPermBalok(panjang, lebar, tinggi);

                    //parsing hasil menjadi string
                    String output = String.valueOf(hs);

                    //set txtHasil dengan output (string hasil parsing)
                    textView5.setText(output.toString());
                }
            }
            public double LuasPermBalok(double p, double l, double t ) {
                return (2*((p*l)+(p*t)+(l*t)));
            }
        });
    }
}

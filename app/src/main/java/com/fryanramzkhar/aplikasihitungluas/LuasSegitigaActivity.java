package com.fryanramzkhar.aplikasihitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegitigaActivity extends AppCompatActivity {
    EditText edtAlas;
    EditText edtTinggi;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        edtAlas = findViewById(R.id.edtAlas);
        edtTinggi = findViewById(R.id.edtTinggi);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer alas = Integer.valueOf(edtAlas.getText().toString());
                Integer tinggi = Integer.valueOf(edtTinggi.getText().toString());

                hitungLuasLingkaran(alas, tinggi);

            }
        });
    }

    public void hitungLuasLingkaran(Integer alas, Integer tinggi) {
        int hasil = alas * tinggi / 2;

        txtHasil.setText(String.valueOf(hasil));
    }
}

package com.fryanramzkhar.aplikasihitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasLingkaranActivity extends AppCompatActivity {
    EditText edtJari;
    TextView txtHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);
        edtJari = findViewById(R.id.edtJari);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer jari = Integer.valueOf(edtJari.getText().toString());

                hitungLuasLingkaran(jari);

            }
        });
    }

    private void hitungLuasLingkaran(Integer jari) {
        //TODO 7 menghitung  luas persegi
        Double hasil = 3.14 * jari * jari;

        //TODO 8 Mencetak Hasil
        txtHasil.setText(String.valueOf(hasil));
    }
}

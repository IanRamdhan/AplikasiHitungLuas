package com.fryanramzkhar.aplikasihitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegiPanjangActivity extends AppCompatActivity {

    //TODO 1 Luas Persegi Panjang membuat variable Global dengan tipe data Widget
    EditText edtPanjang;
    EditText edtLebar;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);

        //TODO 2 Menginialisasikan objek ke dalam Widget
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        //TODO 3 membuat method onClick untuk mendeteksi click dari User
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO 4 Memasukkan Input editText dari luar
                Integer panjang = Integer.valueOf(edtPanjang.getText().toString());
                Integer lebar = Integer.valueOf(edtLebar.getText().toString());

                //TODO 5 Memanggil Function
                hitungLuasPersegiPanjang(panjang,lebar);

            }
        });
    }
    //TODO 6 membuat method hitungLuasPrsegiPanjang
    public void hitungLuasPersegiPanjang(Integer panjang, Integer lebar){
        int hasil = panjang * lebar;

        txtHasil.setText(String.valueOf(hasil));
    }
}

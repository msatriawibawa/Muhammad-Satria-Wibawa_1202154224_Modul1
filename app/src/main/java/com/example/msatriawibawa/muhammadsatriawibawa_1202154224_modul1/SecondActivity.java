package com.example.msatriawibawa.muhammadsatriawibawa_1202154224_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView tvtempat, tvmenu, tvporsi, tvharga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvtempat = (TextView) findViewById(R.id.tempat);
        tvmenu = (TextView) findViewById(R.id.menu);
        tvporsi = (TextView) findViewById(R.id.porsi);
        tvharga = (TextView) findViewById(R.id.harga);

        Intent intent = getIntent();

        String tempat = intent.getStringExtra("Tempat");
        String namamakanan = intent.getStringExtra("NamaMakanan");

        int banyakporsi = intent.getIntExtra("BanyakPorsi", 0);
        int totalharga = intent.getIntExtra("TotalHarga", 0);
        int uangosas = intent.getIntExtra("UangOsas", 0);

        tvtempat.setText(tempat);
        tvmenu.setText(namamakanan);
        tvporsi.setText(String.valueOf(banyakporsi));
        tvharga.setText(String.valueOf(totalharga));

        if (uangosas > totalharga) {
            Toast.makeText(SecondActivity.this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(SecondActivity.this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }
    }
}

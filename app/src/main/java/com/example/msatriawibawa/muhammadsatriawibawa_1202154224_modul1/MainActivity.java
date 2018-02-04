package com.example.msatriawibawa.muhammadsatriawibawa_1202154224_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int hargaeatbus = 50000;
    int hargaabnormal = 30000;
    int uangosas = 65500;

    EditText makanan, porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makanan = (EditText) findViewById(R.id.jenismakanan);
        porsi = (EditText) findViewById(R.id.jumlahporsi);
    }

    public void Eatbus(View view) {
        String NamaMakanan = makanan.getText().toString();
        String Tempat = "EATBUS";

        int BanyakPorsi = Integer.parseInt(porsi.getText().toString());
        int TotalEatbus = hargaeatbus * BanyakPorsi;

        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("UangOsas", uangosas);
        intent.putExtra("NamaMakanan", NamaMakanan);
        intent.putExtra("BanyakPorsi", BanyakPorsi);
        intent.putExtra("TotalHarga", TotalEatbus);
        intent.putExtra("Tempat", Tempat);
        startActivity(intent);
    }

    public void Abnormal(View view) {
        String NamaMakanan = makanan.getText().toString();
        String Tempat = "ABNORMAL";

        int BanyakPorsi = Integer.parseInt(porsi.getText().toString());
        int TotalAbnormal = hargaabnormal * BanyakPorsi;

        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("UangOsas", uangosas);
        intent.putExtra("NamaMakanan", NamaMakanan);
        intent.putExtra("BanyakPorsi", BanyakPorsi);
        intent.putExtra("TotalHarga", TotalAbnormal);
        intent.putExtra("Tempat", Tempat);
        startActivity(intent);
    }
}

package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    EditText UzunKenarr, KisaKenarr;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        UzunKenarr = findViewById(R.id.UzunKenarr);
        KisaKenarr = findViewById(R.id.KısaKenarr);
        Button KareAlanı = findViewById(R.id.KareAlanı);
        Button DikdörtgenAlanı = findViewById(R.id.DikdörtgenAlanı);
        TextView Alan = findViewById(R.id.Alan);
        KareAlanı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int KısaKenar = Integer.parseInt(KisaKenarr.getText().toString());
                Uyg6Hesapla sa = new Uyg6Hesapla(KısaKenar);
                Alan.setText("Sonuç = " + sa.deger);
            }
        });

        DikdörtgenAlanı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int UzunKenar = Integer.parseInt(UzunKenarr.getText().toString());
                int KisaKenar = Integer.parseInt(KisaKenarr.getText().toString());
                Uyg6Hesapla sa = new Uyg6Hesapla(KisaKenar,UzunKenar);
                Alan.setText("Sonuç = " + sa.deger);
            }
        });
    }


    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg6Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

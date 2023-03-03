package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);
       TextView textViewBilgi = findViewById(R.id.AracBilgisi);

        Button buttonArabaKapi = findViewById(R.id.ArabaKapıSayısı);
        Button buttonArabaHiz = findViewById(R.id.Arabamaksimumhızı);
        Button buttonArabaCalistir = findViewById(R.id.Arabayıcalıstır);
        Button buttonArabaIseGit = findViewById(R.id.ArabaiseGit);
        Button buttonMinibusKapi = findViewById(R.id.MinibusKapıSayısı);
        Button buttonMinibusHiz = findViewById(R.id.Minibusmaksimumhızı);
        Button buttonMinibusCalistir = findViewById(R.id.Minibusucalıştır);
        Button buttonMinibusYolcuIndir = findViewById(R.id.MinibüsYolcuİndir);
        Araba araba = new Araba();
        araba.setKapiSayisi(5);
        araba.setMaksimumHiz(210);
        Minibus minibus = new Minibus();
        minibus.setKapiSayisi(3);
        minibus.setMaksimumHiz(170);
        buttonArabaKapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.kapiSayisiniGoster());
            }
        });
        buttonArabaHiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.maksimumHizGoster());
            }
        });
        buttonArabaCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.calistir());
            }
        });
        buttonArabaIseGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.iseGit());
            }
        });
        buttonMinibusKapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.kapiSayisiniGoster());
            }
        });
        buttonMinibusHiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.maksimumHizGoster());
            }
        });
        buttonMinibusCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.calistir());
            }
        });
        buttonMinibusYolcuIndir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.yolcuIndir());
            }
        });
    }
    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg8Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

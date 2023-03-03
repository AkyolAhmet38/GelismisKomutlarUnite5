package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg11Activity extends AppCompatActivity {
    public Integer[] notlar = new Integer[6];
    public int indis =0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg11_activity);
        TextView textViewIndis = findViewById(R.id.index);
        TextView textViewToplam = findViewById(R.id.sonucc);
        EditText editTextSayi = findViewById(R.id.editTextNumber2);
        Button buttonEkle = findViewById(R.id.hesapp);
        Button buttonSifirla = findViewById(R.id.sil);
        buttonEkle.setOnClickListener(view -> {
            if (indis <6){
                int sayi;
                sayi = Integer.parseInt(editTextSayi.getText().toString());
                notlar[indis]=sayi;
                indis++;
                textViewIndis.setText("İndis: " + Integer.toString(indis));
                int toplam = 0;
                for (int i = 0; i < indis; i++) {
                    toplam += notlar[i];
                }
                textViewToplam.setText("Toplam: " + Integer.toString(toplam));
                editTextSayi.getText().clear();
            }
            else{
                textViewIndis.setText("Dizi dolu");
            }
        });
        buttonSifirla.setOnClickListener(view -> {
            indis=0;
            textViewIndis.setText("İndis: 0");
            textViewToplam.setText("Toplam: 0");
            notlar = new Integer[6];
        });
    }


    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg11Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

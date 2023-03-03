package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ss206 extends AppCompatActivity {
    public Asker2 asker;
    public Tank2 tankci;
    public topçu topçu2;
    String mesaj = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss206);
        asker = new Asker2();
        tankci = new Tank2();
        topçu2 = new topçu();
        TextView textViewMesaj = findViewById(R.id.Mesaj);
        Button buttonAsker = findViewById(R.id.AskerAteşEt);
        Button buttonTankci = findViewById(R.id.TankçıAteşEt);
        Button buttonTopçu = findViewById(R.id.TopçuAtes);
        buttonAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = asker.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
        buttonTankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = tankci.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });

        buttonTopçu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = topçu2.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(ss206.this, MainActivity.class);
        startActivity(uyg);
    }
}


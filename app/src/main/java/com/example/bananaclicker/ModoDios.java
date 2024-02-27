package com.example.bananaclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class ModoDios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_dios);

        Switch switchModoLadoOscuro = findViewById(R.id.switch1);

        switchModoLadoOscuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModoDios.this, MainJuego.class);
                startActivity(intent);
            }
        });


    }
}
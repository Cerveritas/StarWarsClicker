package com.example.bananaclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class ModoDios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_dios);

        Switch switchModoLadoOscuro = findViewById(R.id.switch1);
        ImageButton botonImperio = findViewById(R.id.buttonImperio);
        TextView textoPuntuacion = findViewById(R.id.textViewPoints);

        switchModoLadoOscuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModoDios.this, MainJuego.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        final int puntuacion[] = {0};
        botonImperio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntuacion[0]++;
                textoPuntuacion.setText(String.valueOf(puntuacion[0]));
            }
        });


    }
}
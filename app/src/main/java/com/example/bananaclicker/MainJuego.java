package com.example.bananaclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainJuego extends AppCompatActivity {

    private Handler handler;
    private Runnable runnable;
    private Runnable runnable2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_juego);

        Switch switchModoLuminoso = findViewById(R.id.switch2);

        ImageButton botonRepublica = findViewById(R.id.buttonRepublic);
        ImageButton botonYoda = findViewById(R.id.imageButtonYoda);
            /*botonYoda.setEnabled(false);
            botonYoda.setAlpha(0.2f);*/
        ImageButton botonChewa = findViewById(R.id.imageButtonChewa);
            /*botonChewa.setEnabled(false);
            botonChewa.setAlpha(0.2f);*/
        ImageButton botonLuke = findViewById(R.id.imageButtonLuke);
            /*botonLuke.setEnabled(false);
            botonLuke.setAlpha(0.2f);*/

        TextView textoPuntuacion = findViewById(R.id.textViewPoints);
        TextView textViewChewa = findViewById(R.id.textViewChewa);




        /********************************************************************************************************************************/




        switchModoLuminoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainJuego.this, ModoDios.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        //Variables de puntuacion
        final int[] puntuacion = {0};
        final int puntuacionAcumulada = Integer.parseInt(textoPuntuacion.getText().toString());



        botonRepublica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                puntuacion[0]++;
                textoPuntuacion.setText(String.valueOf(puntuacion[0]));



            }
        });



        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                int count = Integer.parseInt(textoPuntuacion.getText().toString());
                count++;
                textoPuntuacion.setText(String.valueOf(count));
                handler.postDelayed(runnable, 1000); // Suma cada 1 segundo


            }
        };

        runnable2 = new Runnable() {
            @Override
            public void run() {
                int count = Integer.parseInt(textoPuntuacion.getText().toString());
                count += 50;
                textoPuntuacion.setText(String.valueOf(count));
                handler.postDelayed(runnable2, 1000); // Suma cada 1 segundo
            }
        };


        botonYoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                handler.post(runnable);

            }
        });

        botonChewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        botonLuke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.post(runnable2);

            }
        });





    }
}
package com.example.zadanie1;

import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button klik; //deklaracja przycisku
    private Button klik2;

    private int licznik;

    private TextView counter;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);


        //Inicjalizacja przycisku poprzez od z pliku XML
        klik = findViewById(R.id.p1);

        klik2 = findViewById(R.id.p2);

        counter = findViewById(R.id.counter);

        //Ustawienie nasłuchiwania na kliknięcie przycisku
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                klik.setEnabled(false);
                licznik++;
                counter.setText("Counter: " + licznik);
                Toast.makeText(MainActivity.this, "Przycisk został kliknięty", Toast.LENGTH_SHORT).show();
            }

        });

        klik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                klik.setEnabled(true);
                Toast.makeText(MainActivity.this, "Przycisk został kliknięty", Toast.LENGTH_SHORT).show();

            }
        });



    }

}
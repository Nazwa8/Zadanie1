package com.example.zadanie1;

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

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        //Inicjalizacja przycisku poprzez od z pliku XML
        klik = findViewById(R.id.klik);

        //Ustawienie nasłuchiwania na kliknięcie przycisku
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                klik.setEnabled(false);

            }
        });
    }
}
package com.example.areas_volmenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner lista1, lista2;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista1 = findViewById(R.id.lista1);
        lista2 = findViewById(R.id.lista2);
        btn = findViewById(R.id.button);

        lista1.setOnItemSelectedListener(this);
        String[] datos = new String[] {"Prisma Rectangular", "Cubo", "Cilindro", "Cono", "Esfera", "Piramida Rectangular"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, datos);
        lista1.setAdapter(adapter);

        lista2.setOnItemSelectedListener(this);
        String[] datos2 = new String[] {"Cuadrado", "Tríangulo", "Círculo", "Rectángulo", "Rombo", "Pentagono"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, datos2);
        lista2.setAdapter(adapter2);

    }

    int a = 0;

    public void area(View view){
        a = 2;
        lista2.setVisibility(View.VISIBLE);
        lista1.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.VISIBLE);

    }

    public void volumen(View view){

        a = 1;
        lista1.setVisibility(View.VISIBLE);
        lista2.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.VISIBLE);
    }

    public void AoV(View view){

        if(a==2){
            int a= lista2.getSelectedItemPosition();

            switch(a){
                case 0:
                    Intent sq = new Intent(MainActivity.this, activity2.class);
                    startActivity(sq);
            }

        }

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
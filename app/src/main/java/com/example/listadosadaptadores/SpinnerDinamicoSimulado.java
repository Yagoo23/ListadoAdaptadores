package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioMetadataReadMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SpinnerDinamicoSimulado extends AppCompatActivity {

    private Spinner spPlanetas;
    private ArrayList<String> arrayListPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_dinamico_simulado);
        spPlanetas=findViewById(R.id.spPlanetasDinamicoSimulado);

        arrayListPlanetas=new ArrayList<String>();
        //añadimos elementos al array de forma dinámica (en timpo de ejecución)
        arrayListPlanetas.add("Mercurio");
        arrayListPlanetas.add("Venus");
        arrayListPlanetas.add("Tierra");
        arrayListPlanetas.add("Marte");
        arrayListPlanetas.add("Júpiter");

        //creación del adaptador
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,arrayListPlanetas);
        //asignar el adaptador a la vista correspondiente
        spPlanetas.setAdapter(adaptador);

        spPlanetas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String planeta=spPlanetas.getSelectedItem().toString();
                Toast.makeText(SpinnerDinamicoSimulado.this, "Planeta: "+planeta, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
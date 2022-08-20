package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerDatosJava extends AppCompatActivity {

    private Spinner spPlanetasJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_datos_java);
        spPlanetasJava=findViewById(R.id.spPlanetasDatosJava);

        String[] arrayPlanetas={"Mercurio", "Venus", "Tierra", "Marte", "Júpiter","Saturno","Urano","Neptuno"};

        //creamos el adaptador simple
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(SpinnerDatosJava.this, android.R.layout.simple_spinner_dropdown_item,arrayPlanetas);
        //asignamos el adaptador a la vista spinner
        spPlanetasJava.setAdapter(adaptador);
        spPlanetasJava.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //obtenemos el elemento seleccionado
                String seleccion1=spPlanetasJava.getSelectedItem().toString();
                //otra forma de obtener el item pulsado
                String seleccion2=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(SpinnerDatosJava.this, "Elegiste el planeta "+seleccion1+"\n"+seleccion2, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
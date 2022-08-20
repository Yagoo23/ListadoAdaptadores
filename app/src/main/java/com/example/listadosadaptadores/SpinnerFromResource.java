package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerFromResource extends AppCompatActivity {

    private Spinner spPlanetasResources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_from_resource);

        spPlanetasResources=findViewById(R.id.spPlanetasDatosResource);
        //recuperar los datos desde (values) el string-array mediente un método nuevo
        ArrayAdapter<CharSequence> adaptador=ArrayAdapter.createFromResource(this,R.array.planetas, android.R.layout.simple_spinner_dropdown_item);
        spPlanetasResources.setAdapter(adaptador);
        spPlanetasResources.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //obtenemos el elemento seleccionado
                String seleccion1=spPlanetasResources.getSelectedItem().toString();
                //otra forma de obtener el item pulsado
                String seleccion2=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(SpinnerFromResource.this, "Elegiste el planeta "+seleccion1+"\n"+seleccion2, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
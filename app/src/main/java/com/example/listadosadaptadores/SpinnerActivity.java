package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spPlanetas=findViewById(R.id.spPlanetas);
        //crear el escuchador del Spinner
        spPlanetas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //obtenemos el elemento seleccionado
                String seleccion1=spPlanetas.getSelectedItem().toString();
                //otra forma de obtener el item pulsado
                String seleccion2=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(SpinnerActivity.this, "Elegiste el planeta "+seleccion1+"\n"+seleccion2, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
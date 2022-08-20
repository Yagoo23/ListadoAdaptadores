package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SpinnerDinamicoReal extends AppCompatActivity {

    private Spinner spPlanetas;
    private ArrayList<String> arrayListPlanetas;
    private Button btnAñadir;
    private EditText etPlaneta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_dinamico_real);
        spPlanetas=findViewById(R.id.spPlanetasDinamicoReal);
        btnAñadir=findViewById(R.id.btnAñadir);
        etPlaneta=findViewById(R.id.etPlaneta);
        arrayListPlanetas=new ArrayList<String>();
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,arrayListPlanetas);

        btnAñadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String planeta=etPlaneta.getText().toString();
                if(planeta.isEmpty()){
                    Toast.makeText(SpinnerDinamicoReal.this, "FALTAN DATOS", Toast.LENGTH_SHORT).show();
                }else{
                    arrayListPlanetas.add(planeta);
                    spPlanetas.setAdapter(adaptador);
                    etPlaneta.setText("");

                }
            }
        });

        spPlanetas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String planeta=spPlanetas.getSelectedItem().toString();
                Toast.makeText(SpinnerDinamicoReal.this, "Planeta: "+planeta, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
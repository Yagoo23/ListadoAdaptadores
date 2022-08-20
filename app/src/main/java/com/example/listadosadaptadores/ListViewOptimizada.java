package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listadosadaptadores.adapter.AdaptadorOptimizado;

public class ListViewOptimizada extends AppCompatActivity {

    private ListView lvPlanetas;
    private String[] arrayPlanetas;
    private String[] arrayInforPlanetas;
    private TypedArray arrayIdFotos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_optimizada);
        lvPlanetas = findViewById(R.id.lvPlanetas);
        arrayPlanetas=getResources().getStringArray(R.array.planetas);
        TypedArray arrayIdFotos = getResources().obtainTypedArray(R.array.fotos);

        //crear una instancia de mi adaptador
        AdaptadorOptimizado adaptador=new AdaptadorOptimizado(this, R.layout.fila_tv, arrayPlanetas,arrayInforPlanetas, arrayIdFotos);
        //asignar a la lista
        lvPlanetas.setAdapter(adaptador);

        lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String planeta=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(ListViewOptimizada.this, "Planeta: "+planeta, Toast.LENGTH_SHORT).show();
            }
        });

    }
    }

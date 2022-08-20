package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listadosadaptadores.POJO.Planeta;
import com.example.listadosadaptadores.adapter.AdaptadorOptimizado;
import com.example.listadosadaptadores.adapter.AdaptadorPOJO;

import java.util.ArrayList;

public class ListViewPOJO extends AppCompatActivity {

    private ListView lvPlanetas;
    private ArrayList<Planeta> planetas;
    private String [] arrayPlanetas;
    private TypedArray arrayIdFotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_pojo);
        lvPlanetas = findViewById(R.id.lvPlanetas);

        for (int i=0;i<planetas.size();i++){
            String nombre=arrayPlanetas.toString();
            String info="Información sobre "+arrayPlanetas.toString();
            int imagen=arrayIdFotos.getResourceId(i,0);
            Planeta planeta=new Planeta(nombre,info,imagen);
            planetas.add(planeta);
        }

        //crear una instancia de mi adaptador
        AdaptadorPOJO adaptador=new AdaptadorPOJO(this, R.layout.fila_tv, planetas);
        //asignar a la lista
        lvPlanetas.setAdapter(adaptador);


        lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String planeta=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(ListViewPOJO.this, "Planeta: "+planeta, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
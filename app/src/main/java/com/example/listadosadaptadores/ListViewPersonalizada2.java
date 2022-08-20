package com.example.listadosadaptadores;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

//LISTA CON DIFERENTE IMAGEN EN CADA ITEM

public class ListViewPersonalizada2 extends AppCompatActivity {

    private ListView lvPlanetas;
    private String[] arrayPlanetas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_personalizada2);
        lvPlanetas = findViewById(R.id.lvPlanetas);
        arrayPlanetas=getResources().getStringArray(R.array.planetas);
//        int[] arrayIdFotos={R.drawable.mercurio,R.drawable.venus,R.drawable.tierra,R.drawable.marte,
//                R.drawable.jupiter,R.drawable.saturno,R.drawable.urano,R.drawable.neptuno};
        TypedArray arrayIdFotos = getResources().obtainTypedArray(R.array.fotos);

        //crear una instancia de mi adaptador
        AdaptadorPersonalizado1 adaptador=new AdaptadorPersonalizado1(this, R.layout.fila_imagen_diferente, arrayPlanetas, arrayIdFotos);
        //asignar a la lista
        lvPlanetas.setAdapter(adaptador);

        lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String planeta=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(ListViewPersonalizada2.this, "Planeta: "+planeta, Toast.LENGTH_SHORT).show();
            }
        });

    }


}
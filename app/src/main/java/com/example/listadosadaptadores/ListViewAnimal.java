package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listadosadaptadores.POJO.Animal;
import com.example.listadosadaptadores.POJO.Planeta;
import com.example.listadosadaptadores.adapter.AdaptadorAnimales;
import com.example.listadosadaptadores.adapter.AdaptadorPOJO;

import java.util.ArrayList;

public class ListViewAnimal extends AppCompatActivity {

    private ListView lvAnimales;
    private ArrayList<Animal> animales;
    private String [] arrayAnimales;
    private String [] arrayInfo;
    private TypedArray arrayFotosAnimales;
    private TypedArray arrayColores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_animal);
        lvAnimales=findViewById(R.id.lvAnimales);
        animales=new ArrayList<>();
        arrayAnimales=getResources().getStringArray(R.array.animales);
        arrayInfo=getResources().getStringArray(R.array.info);
        arrayFotosAnimales=getResources().obtainTypedArray(R.array.fotosAnimales);
        arrayColores=getResources().obtainTypedArray(R.array.colores);

        for(int i=0;i<arrayAnimales.length;i++){
            String nombre=arrayAnimales[i];
            String info=arrayInfo[i];
            int imagen=arrayFotosAnimales.getResourceId(i,-1);
            int colores=arrayColores.getResourceId(i,-1);
            Animal animal=new Animal(nombre,info,imagen,colores);
            animales.add(animal);
        }

        AdaptadorAnimales adaptador=new AdaptadorAnimales(this, R.layout.fila_animales, animales);
        //asignar a la lista
        lvAnimales.setAdapter(adaptador);

        lvAnimales.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Animal animal=(Animal) adapterView.getItemAtPosition(i);
                Toast.makeText(ListViewAnimal.this, animal.getNombre().toString()+"\n"+animal.getInfo().toString(), Toast.LENGTH_SHORT).show();
                view.setBackgroundColor(Color.parseColor("#FF4CAF50"));

            }
        });
    }

}
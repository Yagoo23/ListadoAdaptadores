package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewImagen extends AppCompatActivity {

    private ListView lvPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_imagen);
        lvPlanetas=findViewById(R.id.lvPlanetas);

        //adaptador PERSONALIZADO para el array con la imagen única
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.fila_simple, R.id.tvPlaneta, getResources().getStringArray(R.array.planetas));
        lvPlanetas.setAdapter(adapter);
        //listener de la lista
        lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String planeta=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(ListViewImagen.this, "Planeta: "+planeta, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
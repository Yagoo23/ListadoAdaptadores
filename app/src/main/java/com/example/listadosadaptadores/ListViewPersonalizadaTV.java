package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewPersonalizadaTV extends AppCompatActivity {

        private ListView lvPlanetas;
        private String[] arrayPlanetas;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list_view_personalizada_tv);
            lvPlanetas = findViewById(R.id.lvPlanetas);
            arrayPlanetas=getResources().getStringArray(R.array.planetas);

            //crear una instancia de mi adaptador
            AdaptadorPersonalizado2 adaptador=new AdaptadorPersonalizado2(this, R.layout.fila_tv, arrayPlanetas);
            //asignar a la lista
            lvPlanetas.setAdapter(adaptador);

            lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String planeta=adapterView.getItemAtPosition(i).toString();
                    Toast.makeText(ListViewPersonalizadaTV.this, "Planeta: "+planeta, Toast.LENGTH_SHORT).show();
                }
            });

    }
}
package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    private ListView lvPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lvPlanetas=findViewById(R.id.lvPlanetas);

        //listener de la ListView
        lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //recuperar el elemento seleccionado
                String planeta=lvPlanetas.getItemAtPosition(i).toString();
                Toast.makeText(ListViewActivity.this, "Planeta: "+planeta, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewDinamica extends AppCompatActivity {

    private ArrayList<String> arrayListTexto;
    private ListView lvTexto;
    private Button btnAñadir;
    private EditText etTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_dinamica);
        lvTexto=findViewById(R.id.lvDinamica);
        btnAñadir=findViewById(R.id.btnAñadir);
        etTexto=findViewById(R.id.etTexto);
        arrayListTexto=new ArrayList<String>();

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayListTexto);

        btnAñadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto=etTexto.getText().toString();
                if(texto.isEmpty()){
                    Toast.makeText(ListViewDinamica.this, "FALTAN DATOS", Toast.LENGTH_SHORT).show();
                }else{
                    arrayListTexto.add(texto);
                    lvTexto.setAdapter(adaptador);
                    etTexto.setText("");

                }
            }
        });


    }
}
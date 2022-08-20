package com.example.listadosadaptadores;

import android.app.Activity;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdaptadorPersonalizado2 extends ArrayAdapter {
    private Activity context;
    private String[] arrayPlanetas;

    public AdaptadorPersonalizado2(@NonNull Activity context, int layoutPersonalizado, String[] arrayPlanetas) {

        //Constructor defectivo de 3 parámetros
        super(context, layoutPersonalizado, arrayPlanetas);
        this.context=context;
        this.arrayPlanetas=arrayPlanetas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Creamos un objeto "inflador" para convertir nuestro layout de fila
        //en un objeto java manipulable
        LayoutInflater layoutInflater=context.getLayoutInflater();
        //mediante el método inflador ( inflate() ) creamos el objeto java para rellenar con los datos
        View fila=layoutInflater.inflate(R.layout.fila_tv,null);
        TextView tvPlaneta1=fila.findViewById(R.id.tvPlaneta1);
        TextView tvPlaneta2=fila.findViewById(R.id.tvPlaneta2);
        tvPlaneta1.setText(arrayPlanetas[position]);
        tvPlaneta2.setText("Información sobre "+arrayPlanetas[position]);


        return fila;
    }
}

package com.example.listadosadaptadores.adapter;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listadosadaptadores.POJO.Animal;
import com.example.listadosadaptadores.R;

import java.util.ArrayList;


public class AdaptadorAnimales extends ArrayAdapter {

    private Activity context;
    private String[] arrayAnimales;
    private ArrayList<Animal> animales;
    private String[] arrayInfo;

    public AdaptadorAnimales(@NonNull Activity context, int layoutPersonalizado, ArrayList animales) {
        super(context, layoutPersonalizado,animales);
        this.context = context;
        this.animales = animales;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /* primera optimización */
        View fila=convertView;
        ViewHolder viewHolder;
        if(fila == null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            fila=layoutInflater.inflate(R.layout.fila_animales,null);

            viewHolder= new ViewHolder();
            viewHolder.tvAnimal=fila.findViewById(R.id.tvAnimal);
            viewHolder.tvInfo=fila.findViewById(R.id.tvInfo);
            viewHolder.fotoAnimal=fila.findViewById(R.id.imgAnimal);
            viewHolder.colores=fila.findViewById(R.id.imgCirculo);
            viewHolder.lyFondo=fila.findViewById(R.id.lyFondo);
            fila.setTag(viewHolder);
        }else{
            viewHolder= (AdaptadorAnimales.ViewHolder) fila.getTag();
        }
        viewHolder.tvAnimal.setText(animales.get(position).getNombre());
        viewHolder.tvInfo.setText(animales.get(position).getInfo());
        viewHolder.fotoAnimal.setImageResource(animales.get(position).getImagenAnimales());
        viewHolder.colores.setImageResource(animales.get(position).getColores());
        if(position%2==1){
            //viewHolder.lyFondo.setBackgroundColor(Color.parseColor("#C0EDF3"));
            viewHolder.lyFondo.setBackgroundColor(context.getResources().getColor(R.color.blue));
            viewHolder.tvAnimal.setTextColor(context.getResources().getColor(R.color.gris));

        }else{
            viewHolder.lyFondo.setBackgroundColor(context.getResources().getColor(R.color.blue2));
            viewHolder.tvAnimal.setTextColor(context.getResources().getColor(R.color.purple_700));
        }
        return fila;
    }
    static class  ViewHolder{
        TextView tvAnimal;
        TextView tvInfo;
        ImageView fotoAnimal;
        ImageView colores;
        LinearLayout lyFondo;
    }
}

package com.example.listadosadaptadores.adapter;

import android.app.Activity;
import android.content.res.TypedArray;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listadosadaptadores.POJO.Planeta;
import com.example.listadosadaptadores.R;

import java.util.ArrayList;

public class AdaptadorPOJO extends ArrayAdapter {
    private Activity context;
    private String[] arrayPlanetas;
    //private int[] arrayIdFotos;
    private TypedArray arrayIdFotos;
    private String[] arrayInforPlanetas;
    private ArrayList<Planeta> planetas;


    public AdaptadorPOJO(@NonNull Activity context, int layoutPersonalizado, ArrayList planetas) {
        super(context, layoutPersonalizado,planetas);
        this.context=context;
        this.planetas=planetas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /* primera optimización */
        View fila=convertView;
        ViewHolder viewHolder;
        if(fila == null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            fila=layoutInflater.inflate(R.layout.fila_tv2,null);

            viewHolder=new ViewHolder();
            viewHolder.tvPlaneta=fila.findViewById(R.id.tvPlaneta);
            viewHolder.tvInfo=fila.findViewById(R.id.tvInfo);
            viewHolder.imgPlaneta=fila.findViewById(R.id.imgPlaneta);
            fila.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) fila.getTag();
        }
        viewHolder.tvPlaneta.setText(planetas.get(position).getNombre());
        viewHolder.tvInfo.setText(planetas.get(position).getInfo());
        viewHolder.imgPlaneta.setImageResource(planetas.get(position).getImagen());
        return fila;
    }
    static class  ViewHolder{
        TextView tvPlaneta;
        TextView tvInfo;
        ImageView imgPlaneta;
    }
}

package com.example.listadosadaptadores.adapter;

import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listadosadaptadores.R;


public class AdaptadorOptimizado extends ArrayAdapter {

        private Activity context;
        private String[] arrayPlanetas;
        //private int[] arrayIdFotos;
        private TypedArray arrayIdFotos;
        private String[] arrayInforPlanetas;


        public AdaptadorOptimizado(@NonNull Activity context, int layoutPersonalizado,@NonNull String[] arrayPlanetas,@NonNull String[] arrayInforPlanetas, TypedArray arrayIdFotos) {

            //Constructor defectivo de 3 parámetros
            super(context, layoutPersonalizado, arrayPlanetas);
            this.context=context;
            this.arrayPlanetas=arrayPlanetas;
            this.arrayIdFotos=arrayIdFotos;
            this.arrayInforPlanetas=arrayInforPlanetas;
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
            viewHolder.tvPlaneta.setText(arrayPlanetas[position]);
            viewHolder.tvInfo.setText("Información sobre "+arrayPlanetas[position]);
            viewHolder.imgPlaneta.setImageResource(arrayIdFotos.getResourceId(position,0));
            return fila;
        }
        static class  ViewHolder{
            TextView tvPlaneta;
            TextView tvInfo;
            ImageView imgPlaneta;
        }
    }



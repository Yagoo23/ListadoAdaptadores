package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnes(View view) {
        Intent i = new Intent();
        switch (view.getId()) {
            case R.id.btnSpinner:
                i.setClass(this, SpinnerActivity.class);
                break;
            case R.id.btnSpinnerDatosJava:
                i.setClass(this, SpinnerDatosJava.class);
                break;
            case R.id.btnSpinnerFromResources:
                i.setClass(this, SpinnerFromResource.class);
                break;
            case R.id.btnSpinnerDinamicoSim:
                i.setClass(this, SpinnerDinamicoSimulado.class);
                break;
            case R.id.btnSpinnerDinamicoReal:
                i.setClass(this, SpinnerDinamicoReal.class);
                break;
            case R.id.btnListView:
                i.setClass(this, ListViewActivity.class);
                break;
            case R.id.btnListViewImg:
                i.setClass(this, ListViewImagen.class);
                break;
            case R.id.btnListViewDifImg:
                i.setClass(this, ListViewPersonalizada2.class);
                break;
            case R.id.btnListViewTV:
                i.setClass(this, ListViewPersonalizadaTV.class);
                break;
            case R.id.btnListViewDinamica:
                i.setClass(this, ListViewDinamica.class);
                break;
            case R.id.btnListViewImgDistinta:
                i.setClass(this,ListViewImagenDiferente.class);
        }
        startActivity(i);
    }
}
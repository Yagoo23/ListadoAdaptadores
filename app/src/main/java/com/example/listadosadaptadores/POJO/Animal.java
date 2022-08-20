package com.example.listadosadaptadores.POJO;

public class Animal {

    private String nombre;
    private String info;
    private int imagenAnimales;
    private int colores;

    public Animal(String nombre, String info, int imagenAnimales, int colores) {
        this.nombre = nombre;
        this.info = info;
        this.imagenAnimales = imagenAnimales;
        this.colores = colores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImagenAnimales() {
        return imagenAnimales;
    }

    public void setImagenAnimales(int imagenAnimales) {
        this.imagenAnimales = imagenAnimales;
    }

    public int getColores() {
        return colores;
    }

    public void setColores(int colores) {
        this.colores = colores;
    }
}

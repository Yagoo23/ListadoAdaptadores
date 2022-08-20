package com.example.listadosadaptadores.POJO;


public class Planeta {
    private String nombre;
    private String info;
    private int imagen;


    public Planeta(String nombre, String info, int imagen) {
        this.nombre = nombre;
        this.info = info;
        this.imagen = imagen;
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

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}

package Modelo;

import java.util.ArrayList;


public class Pelicula {
    private String titulo;
    private char[] año;
    private float duracion;
    private String tipo;
    
    //
    private ArrayList<Estudio> listaEstudios;
    
    public Pelicula(String titulo,char[] año,int duracion,String tipo){
        this.titulo = null;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char[] getAño() {
        return año;
    }

    public void setAño(char[] año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudio> getListaEstudios() {
        return listaEstudios;
    }

    public void setListaEstudios(ArrayList<Estudio> listaEstudios) {
        this.listaEstudios = listaEstudios;
    }
}

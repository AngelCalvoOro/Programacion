package UML;

import java.util.ArrayList;

public class Departamento {
    //Atributos
    private String nombre;
    
    // Relación bidireccional
    private ArrayList<Persona> listaPersonas;

    //Métodos
    public Departamento(){
        listaPersonas = new ArrayList<Persona>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(Persona p) {
        this.listaPersonas.add(p);
    }
    
    public void eliminarEmpleado(Persona p){
        listaPersonas.remove(p);
    }
    
    @Override
    public String toString(){
        return getNombre();
    }
    
}

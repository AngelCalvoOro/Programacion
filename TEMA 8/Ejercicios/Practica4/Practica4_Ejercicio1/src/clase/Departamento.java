
package clase;

import java.util.ArrayList;


public class Departamento {
    private String nombre;
    private String id;

    private ArrayList <Trabajador> listaTrabajadores = new ArrayList <Trabajador>();
    
    
    public Departamento(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Departamento(String nombre, String id,ArrayList <Trabajador> listaTrabajadores) {
        this.nombre = nombre;
        this.id = id;
        this.listaTrabajadores = listaTrabajadores;
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

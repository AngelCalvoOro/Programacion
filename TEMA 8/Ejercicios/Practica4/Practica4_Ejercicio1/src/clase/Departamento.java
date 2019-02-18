
package clase;

import java.util.ArrayList;


public class Departamento {
    private String nombre;
    private String id;

    private ArrayList <Trabajador> listaTrabajadores = new ArrayList <Trabajador>();

    public Departamento() {
    }
    
    
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
    
    public void setTrabajador(Trabajador trabajador) {
        this.listaTrabajadores.add(trabajador);
    }
    
    public void deleteTrabajador(Trabajador trabajador) {
        int i = -1;
        for (i = 0; i < listaTrabajadores.size() && !listaTrabajadores.get(i).getN_emple().equals(trabajador.getN_emple()); i++) {}
        if(i < listaTrabajadores.size()){
            this.listaTrabajadores.remove(i);
        }
        
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


package clase;

import java.util.ArrayList;


public class Contrato {
    private String id;
    private String nombre;
    
    private ArrayList <Trabajador> listaTrabajadores= new ArrayList <Trabajador>();

    public Contrato() {
    }
    
    public Contrato(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Contrato(String id, String nombre,ArrayList <Trabajador> listaTrabajadores) {
        this.id = id;
        this.nombre = nombre;
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
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

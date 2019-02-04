package UML;

import java.util.ArrayList;

public class SocioFamiliar extends Socio{
    private ArrayList<Hijo> listaHijos;

    public SocioFamiliar(String n, String a, String t, String c) {
        // llamada al constructor de la clase padre 
        super(n,a,t,c);
    }

    
    public ArrayList<Hijo> getListaHijos() {
        return listaHijos;
    }

    public void setListaHijos(ArrayList<Hijo> listaHijos) {
        this.listaHijos = listaHijos;
    }
    
    public int getNumeroSocios(){
        return listaHijos.size();
    }
    
}

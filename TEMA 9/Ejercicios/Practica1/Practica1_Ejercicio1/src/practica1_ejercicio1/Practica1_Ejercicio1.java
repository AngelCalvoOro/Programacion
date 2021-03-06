
package practica1_ejercicio1;

import Modelo.*;
import Modelo.Persona;
import Vista.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Practica1_Ejercicio1 {
    
    private static SelecOption selector;
    private static VentanaPersona vP;
    private static PersonaDAO pDAO;
    
    
    public static void main(String[] args) {
        selector= new SelecOption();
        selector.setVisible(true);
    }
    public static void cierreprograma(){
        selector.dispose();
        System.exit(0);
    }
    public static void goRegistro(){
        selector.dispose();
        vP = new VentanaPersona(false);
        vP.setVisible(true);
    }
    public static void volverSelector(){
        vP.dispose();
        selector= new SelecOption();
        selector.setVisible(true);
    }
    public static void goListaPersonas(){
        
        selector.dispose();
        vP = new VentanaPersona(true);
        vP.setVisible(true);
    }
    
    public static void registrarPersona(String rnombre, Integer redad, String rprofesion, String rtelefono) throws Exception{
        Persona nuevaPersona=new Persona();
        nuevaPersona.setNombre(rnombre);
        nuevaPersona.setEdad(redad);
        nuevaPersona.setProfesion(rprofesion);
        nuevaPersona.setTelefono(rtelefono);
        
        pDAO.darAlta(nuevaPersona);
    }
    public static String confirmexist(String nombreP){
        Persona p= new Persona();
        p.setNombre(nombreP);
        Persona pObtenida = pDAO.findP(p);
        String message = "";
        if(pObtenida == null){
            message="No hemos encontrado a esta persona";
        }else{
            message = pObtenida.getNombre() + "\n" 
                    + pObtenida.getEdad() + "\n"
                    + pObtenida.getProfesion() + "\n"
                    + pObtenida.getTelefono();
        }
        
        return message;
    }
    public static void getListaP(){
       ArrayList<Persona> lista = pDAO.findAll();
       goListaPersonas();  
       vP.showPersonas(lista);
    }
    
}

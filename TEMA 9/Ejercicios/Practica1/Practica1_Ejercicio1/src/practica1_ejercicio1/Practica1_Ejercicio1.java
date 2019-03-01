
package practica1_ejercicio1;

import Modelo.*;
import Modelo.Persona;
//import java.sql.*;
import Vista.*;
import java.sql.SQLException;

public class Practica1_Ejercicio1 {
    
    private static SelecOption selector;
    private static VentanaPersona vP;
    //private static Connection con;
    private static BaseDatos bd;
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
        vP = new VentanaPersona();
        vP.setVisible(true);
    }
    public static void volverSelector(){
        vP.dispose();
        selector= new SelecOption();
        selector.setVisible(true);
    }
    public static void goListaPersonas(){
        selector.dispose();
        vP = new VentanaPersona();
        vP.setVisible(true);
    }
    
    public static void registrarPersona(String rnombre, Integer redad, String rprofesion, String rtelefono) throws SQLException{
        Persona nuevaPersona=new Persona();
        nuevaPersona.setNombre(rnombre);
        nuevaPersona.setEdad(redad);
        nuevaPersona.setProfesion(rprofesion);
        nuevaPersona.setTelefono(rtelefono);
        
        pDAO.darAlta(nuevaPersona);
    }

    public static void registrarPersona(String text, int parseInt, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

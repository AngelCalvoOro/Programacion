
package practica1_ejercicio1;

//import Modelo.*;
//import java.sql.*;
import Vista.*;

public class Practica1_Ejercicio1 {
    
    private static SelecOption selector;
    private static VentanaPersona vP;
    //private static Connection con;
    //private static BaseDatos bd;
    
    
    
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
    public static void goListaPersonas(){
        selector.dispose();
        vP = new VentanaPersona();
        vP.setVisible(true);
        
    }
}

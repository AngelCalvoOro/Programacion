
package practica1_ejercicio1;

import Modelo.*;
import java.sql.*;
import Vista.*;

public class Practica1_Ejercicio1 {
    
    private static SelecOption selector;
    private static Connection con;
    private static BaseDatos bd;
    
    
    public static void main(String[] args) {
        bd=new BaseDatos();
        con =bd.conectar();
        if (con == null) {
            System.out.println("problema con la base de datos");
            System.exit(-1);
        }
        
    }
}

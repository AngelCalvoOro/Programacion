/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication121;

import Modelo.*;
import java.sql.*;
import Vista.*;

public class JavaApplication121 {

    private static Connection con;
    private static PersonaDAO oPersonaDAO;
    private static BaseDatos bd;
    private static Ventana v;
    
    public static void main(String[] args) {
        // Opcion uno
       bd = new BaseDatos();
       con = bd.conectar();
       if (con == null)
       {
           System.out.println("Problemas con la base de datos");
           System.exit(-1);
       }
       oPersonaDAO = new PersonaDAO(con);
       
       // Opcion dos(static)
       /*con = BaseDatos.conectar();
       if (con == null)
       {
           System.out.println("Problemas con la base de datos");
           System.exit(-1);
       }*/
       v= new Ventana();
       v.setVisible(true);
    }
    
    public static void darAlta(String nombre, Integer nro)
    {
        Persona p = new Persona(nombre,nro);
        //insertar
        oPersonaDAO.darAlta(p);
    }
    
    public static String consultar(String nombre)
    {
        return oPersonaDAO.consultar(nombre);
    }
    public static void salir(){
        bd.cerrar();
        System.exit(0);
    }
    
}

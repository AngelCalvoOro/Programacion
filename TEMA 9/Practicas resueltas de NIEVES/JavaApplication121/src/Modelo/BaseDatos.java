/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;

public class BaseDatos {
    private Connection con;
    
    public Connection conectar()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3307/"+"bdPersonas";
            String usuario = "root";
            String pass = "usbw";
            con = DriverManager.getConnection (url,usuario,pass);
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
    public void cerrar()
    {
        try{
        con.close();
        }
        catch(Exception e){}
    }
    
}

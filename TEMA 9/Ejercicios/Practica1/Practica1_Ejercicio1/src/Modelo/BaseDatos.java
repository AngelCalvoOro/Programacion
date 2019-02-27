
package Modelo;

import java.sql.*;

public class BaseDatos {
    private Connection con;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/bspersona";
            String usuario="root";
            String passwd="usbw";
            con= DriverManager.getConnection(url,usuario,passwd);
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
    public void cerrar(Connection con){
        try{
            con.close();
        }
        catch(Exception e){}
    }
}

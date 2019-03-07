
package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Time;


public class EventoDAO {

    public static Connection conectar(){
        Connection con;
        ConexionBase cb= new ConexionBase();
        
        con =cb.conectar();
        if (con == null) {
            System.out.println("Problema con la conexion a laa bse de datos.");
            System.exit(0);
        }
        return con;
    }
    public static void desconectar(Connection c){
        ConexionBase cb = new ConexionBase();
        cb.cerrar(c);
    }
    public static void addEventoBD(Evento e) {
        Connection c = conectar();
        try {
            String addE= "INSERT INTO evento VALUES (?,?,?,?,?,?);";
            PreparedStatement ae= c.prepareStatement(addE);
            ae.setString(1,e.getNombre());
            ae.setString(2,e.getLugar());
            
            Date fechad= java.sql.Date.valueOf(e.getFecha());
            ae.setDate(3, fechad);
            
            Time hIniciod= Time.valueOf(e.gethInicio());
            ae.setTime(4, hIniciod);
            
            Time hFinald= Time.valueOf(e.gethFinal());
            ae.setTime(5, hFinald);
            
            ae.setInt(6, e.getMaxPersona());
            ae.executeUpdate();
            ae.close();
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }finally{
            desconectar(c);
        }
    }
    
    
}

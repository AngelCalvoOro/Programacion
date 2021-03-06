//cambiar el modo de conexion a el main y cerrar la conexion al cerrar el problema
package Modelo;

import com.db4o.ObjectContainer;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;


public class EventoDAO {

    
    public static ObjectContainer conectar() throws Exception{
        ObjectContainer ob;
        ConexionBase cb = new ConexionBase();
        ob =cb.getConexion();
        return ob;
        /*Connection con;
        ConexionBase cb= new ConexionBase();
        
        con =cb.conectar();
        if (con == null) {
            System.out.println("Problema con la conexion a laa bse de datos.");
            System.exit(0);
        }
        return con;*/
    }
    public static void desconectar() throws Exception{
        ConexionBase cb = new ConexionBase();
        cb.cerrar();
    }
    public static void addEventoBD(Evento e) throws Exception {
        ObjectContainer oc = conectar();
        oc.store(e);
        desconectar();
        
    }
    /*public static ArrayList<Evento> getListaEventos() {
        Connection c = conectar();
        ArrayList <Evento> listaEventos =  new ArrayList <Evento>();
        try {
            String getE= "SELECT nombre FROM evento";
            PreparedStatement ae= c.prepareStatement(getE);
            ResultSet rs =ae.executeQuery();
            
            while (rs.next()) {
                Evento e= new Evento();
                e.setNombre(rs.getString("nombre"));
                listaEventos.add(e);
            }
            ae.close();
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }finally{
            desconectar(c);
        }
        return listaEventos;
    }

    public static void deleteEvento(Evento nDelete) {
        Connection c = conectar();
        try {
            String delE= "Delete from evento where UPPER(NOMBRE)=?;";
            PreparedStatement ae= c.prepareStatement(delE);
            ae.setString(1,nDelete.getNombre().toUpperCase());
            ae.executeUpdate();
            ae.close();
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }finally{
            desconectar(c);
        }
    }

    public static Evento getEvento(Evento eUpdate) {
        Connection c = conectar();
        Evento e=null;
        try {
            String getE= "SELECT * FROM evento  where UPPER(NOMBRE)= ?";
            PreparedStatement ae= c.prepareStatement(getE);
            ae.setString(1, eUpdate.getNombre());
            ResultSet rs =ae.executeQuery();
            
            if (rs.next()) {
                e = new Evento();
                e.setNombre(rs.getString("nombre"));
                e.setLugar(rs.getString("lugar"));
                e.setMaxPersona(rs.getInt("maxPersona"));

                e.setFecha(rs.getDate("fecha").toLocalDate());
                
                e.sethInicio(rs.getTime("hInicio").toLocalTime());
                e.sethFinal(rs.getTime("hFinal").toLocalTime());
            }
            ae.close();
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }finally{
            desconectar(c);
        }
        return e;
    }

    public static void addChangeEvento(Evento e) {
         Connection c = conectar();
        try {
            String chageE= "UPDATE evento set lugar = ?, fecha = ?, hInicio = ?, hFinal = ?, maxPersona = ? where nombre = ?";
            PreparedStatement ae= c.prepareStatement(chageE);
            ae.setString(6,e.getNombre());
            ae.setString(1,e.getLugar());
            
            Date fechad= java.sql.Date.valueOf(e.getFecha());
            ae.setDate(2, fechad);
            
            Time hIniciod= Time.valueOf(e.gethInicio());
            ae.setTime(3, hIniciod);
            
            Time hFinald= Time.valueOf(e.gethFinal());
            ae.setTime(4, hFinald);
            
            ae.setInt(5, e.getMaxPersona());ae.setString(6,e.getNombre());
            ae.executeUpdate();
            ae.close();
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }finally{
            desconectar(c);
        }
    }*/
}

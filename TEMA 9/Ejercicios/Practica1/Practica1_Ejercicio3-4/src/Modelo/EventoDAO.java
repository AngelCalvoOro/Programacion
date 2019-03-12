
package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;


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
    public static ArrayList<Evento> getListaEventos() {
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
                
                java.util.Date fechaD= rs.getDate("fecha");
                LocalDate fecha = fechaD.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                e.setFecha(fecha);
                
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
    

    public Evento takeEvento(Evento takeEvento) {
        Connection c = conectar();
        Evento e=null;
        try {
            String getE= "SELECT * FROM evento  where UPPER(NOMBRE)= ?";
            PreparedStatement ae= c.prepareStatement(getE);
            ae.setString(1, takeEvento.getNombre().toUpperCase());
            ResultSet rs =ae.executeQuery();
            
            if (rs.next()) {
                e = new Evento();
                e.setNombre(rs.getString("nombre"));
                e.setLugar(rs.getString("lugar"));
                e.setMaxPersona(rs.getInt("maxPersona"));
                
                java.util.Date fechaD= rs.getDate("fecha");
                LocalDate fecha = fechaD.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                e.setFecha(fecha);
                
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
    
    
}

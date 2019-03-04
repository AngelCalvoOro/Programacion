
package Modelo;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;


public class PersonaDAO {
    private static Connection con;
        
    private static Connection conecta(){
        Connection con;
        BaseDatos bd=new BaseDatos();
        
        con =bd.conectar();
        if (con == null) {
            System.out.println("problema con la base de datos");
            System.exit(-1);
        }
        
        return con;
    }
    
    private static void desconecta (Connection c){
        BaseDatos bd=new BaseDatos();
        bd.cerrar(c);
    }
    
    public static void darAlta(Persona p) throws Exception{
        Connection c = conecta();
        try {
            String insertP = "INSERT INTO persona VALUES (?,?,?,?);";
            PreparedStatement ps = c.prepareStatement(insertP);
            ps.setString(1, p.getNombre());
            ps.setInt(2,p.getEdad());
            ps.setString(3, p.getProfesion());
            ps.setString(4,p.getTelefono());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            desconecta(c);
        }
        
    }
    public static Persona findP(Persona p){
        Connection c = conecta();
        Persona pEncontrado = null;
        try {
            String selectP = "SELECT * FROM persona WHERE UPPER(nombre) =?";
            PreparedStatement ps = c.prepareStatement(selectP);
            ps.setString(1, p.getNombre().toUpperCase());
            ResultSet resul= ps.executeQuery();
            if (resul.next()) {
                pEncontrado= new Persona();
                pEncontrado.setNombre(resul.getString("nombre"));
                pEncontrado.setEdad(resul.getInt("edad"));
                pEncontrado.setProfesion(resul.getString("profesion"));
                pEncontrado.setTelefono(resul.getString("telefono"));
            }
            ps.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            desconecta(c);
        }
        return pEncontrado;
    }
    public static ArrayList<Persona> findAll(){
        Connection c = conecta();
        ArrayList<Persona> lista = new ArrayList<Persona>();
        try {
            String selectP = "SELECT * FROM persona";
            PreparedStatement ps = c.prepareStatement(selectP);
            ResultSet resul= ps.executeQuery();
            while(resul.next()) {
                Persona pEncontrado= new Persona();
                pEncontrado.setNombre(resul.getString("nombre"));
                pEncontrado.setEdad(resul.getInt("edad"));
                pEncontrado.setProfesion(resul.getString("profesion"));
                pEncontrado.setTelefono(resul.getString("telefono"));
                
                lista.add(pEncontrado);
            }
            ps.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            desconecta(c);
        }
        return lista;
    }
    
}

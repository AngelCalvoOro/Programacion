
package Modelo;

import java.sql.Connection;
import java.sql.*;


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
        
        String plantilla = "INSERT INTO persona VALUES (?,?,?,?);";
        PreparedStatement ps = c.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setInt(2,p.getEdad());
        ps.setString(3, p.getProfesion());
        ps.setString(4,p.getTelefono());
        ps.executeUpdate();
        ps.close();
        
        desconecta(c);
    }
    
    
}

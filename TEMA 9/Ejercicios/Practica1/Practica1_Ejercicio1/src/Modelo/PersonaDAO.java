
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
    
    public static void darAlta(Persona p) throws SQLException{
        Connection c = conecta();
        
        String plantilla = "INSERT INTO personas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getPersona());
        ps.setInt(2,p.getEdadPersona());
        ps.setString(3, p.getProfesionPersona());
        ps.setString(4,p.getTelefonoPersona());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
        
        
        
        desconecta(c);
    }
    
    
}

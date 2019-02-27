
package Modelo;

import java.sql.Connection;


public class PersonaDAO {

        
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
    
    public static void darAlta(Persona p){
        Connection c = conecta();
        
        
        
        
        
        desconecta(c);
    }
    
    
}

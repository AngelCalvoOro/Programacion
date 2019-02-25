
package conexion;

import java.sql.*;

public class BaseDatos {
    
    public void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e){
            
        }
    }
}

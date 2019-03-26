
package Modelo;

import com.db4o.*;


public class ConexionBase {
    private ObjectContainer oC;
    
    public ConexionBase() throws Exception{
        oC = Db4o.openFile("bdEvento");
    }
    public void cerrar (){
        oC.close();
    }
    public ObjectContainer getConexion(){
        return oC;
    }
}

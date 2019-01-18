package t8p1e2;

import vista.VentanaAltaPersona;
import vista.VentanaListado;
import java.util.ArrayList;
import UML.*;

public class T8p1e2 {
    
    private static ArrayList<Persona> listaPersonas;
    
    private static VentanaAltaPersona vap;
    private static VentanaListado vl;

    public static void main(String[] args) {
        // Simulación de la base de datos
        listaPersonas = new ArrayList<Persona>();
        
        vap = new VentanaAltaPersona();
        vap.setVisible(true);
    }
    
    
    public static void altaPersona(String nombre, String apellidos,String dni)
    {
        
            listaPersonas.add(new Persona(nombre,apellidos,dni));
    }
    
    public static void salir(){
        // Eliminar la ventana
        vap.dispose();
        // Crear y mostrar la ventana de salida
        vl = new VentanaListado(generarListado());
        vl.setVisible(true);
    }
    
    public static String generarListado(){
        String datos="";
        for(int x = 0; x < listaPersonas.size(); x++)
        {
            datos += listaPersonas.get(x).getNombre() + "  " + listaPersonas.get(x).getApellidos() + "  " + listaPersonas.get(x).getDni() + " \n" ;
        }
        if (datos.compareTo("")== 0)
            datos = "No hay datos que mostrar";
        return datos;
        
    }
    
    public static void terminar(){
        vl.dispose();
        System.exit(0);
    }
}

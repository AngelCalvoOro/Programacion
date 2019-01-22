
package practica1_ejercicio2;

import Ventana.Ventana_Alta;
import Ventana.Ventana_Listado;
import java.util.ArrayList;
import Clases.Persona;


public class Practica1_Ejercicio2 {
    private static ArrayList<Persona> listadoPersonas;
    private static Ventana_Alta vAlta;
    private static Ventana_Listado vListado;

    
    public static void main(String[] args) {
        listadoPersonas =new ArrayList<Persona>();
        //crear y visualizacion de ventana_lista
        vAlta = new Ventana_Alta();
        vAlta.setVisible(true);
    }
    public static void salir(){
        //eliminar ventana_alta
        vAlta.dispose();
        //crear y abrir ventana_listado
        vListado = new Ventana_Listado();
        vListado.setVisible(true);
    }
    public static void finalizacion(){
        //fin del programa
        System.exit(0);
    }
    public static boolean validarDni(String dni){
        //comprobacion de que el Dni puesto no se repite
        int i;
        /*explicacion del for:
        si "i" es menor que la cantidad del ArrayList y 
        el dni de la posicion "i" lo comparamos con los dni del Array (si es diferente nos devolvera 1)
        si se cumple eso incrementa "i" hasta que sea igual a la cantidad del ArrayList*/
        for (i = 0; i < listadoPersonas.size() && listadoPersonas.get(i).getDni().compareTo(dni)!= 0; i++) {}
        
        if (i == listadoPersonas.size()) {
            return true;
        }
        return false;
    }
    public static boolean darAlta(String nombre, String apellidos,String dni){
        listadoPersonas.add(new Persona(nombre,apellidos,dni));
        return true;
    }
    
}

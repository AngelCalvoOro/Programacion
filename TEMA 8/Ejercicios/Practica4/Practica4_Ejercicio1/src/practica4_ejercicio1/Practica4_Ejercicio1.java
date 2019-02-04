
package practica4_ejercicio1;

import ventana.*;
import clase.*;
import java.util.ArrayList;

public class Practica4_Ejercicio1 {
    private static Inicio vI;
    private static VentanaPrincipal vP;
    private static ArrayList<Personal> listaPersonal;
    public static void main(String[] args) {
        //creacion de base de datos
        generarPersonal();
        //creacion y inicio de ventana Inicio
        vI = new Inicio();
        vI.setVisible(true);
    }
    private static void generarPersonal(){
        //creacion de lista Array personal y sus datos
        listaPersonal = new ArrayList<Personal>();
        
        listaPersonal.add(new Personal ("usuario1","11111"));
        listaPersonal.add(new Personal ("usuario2","22222"));
        listaPersonal.add(new Personal ("usuario23","33333"));
        
        //crear lista inventada de departamentos y contratos
    }
    public static void cierreyFin(){
        vI.dispose();
        System.exit(0);
    }

    public static void validarUsuario() {
        vI.dispose();
        vP = new VentanaPrincipal();
        vP.setVisible(true);
    }
}

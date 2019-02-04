
package practica4_ejercicio1;

import ventana.*;
import clase.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Practica4_Ejercicio1 {
    private static Inicio vI;
    private static VentanaPrincipal vP;
    private static Formulario vF;
    private static ArrayList<Usuarios> listaPersonal;
    public static void main(String[] args) {
        //creacion de base de datos
        generarPersonal();
        //creacion y inicio de ventana Inicio
        vI = new Inicio();
        vI.setVisible(true);
    }
    private static void generarPersonal(){
        //creacion de lista Array personal y sus datos
        listaPersonal = new ArrayList<Usuarios>();
        
        listaPersonal.add(new Usuarios ("usuario1","11111"));
        listaPersonal.add(new Usuarios ("usuario2","22222"));
        listaPersonal.add(new Usuarios ("usuario3","33333"));
        
        //crear lista inventada de departamentos y contratos
    }
    public static void cierreyFin(){
        vI.dispose();
        System.exit(0);
    }

    public static void validarUsuario(String nombre, String contrasena) {
        int x= 0;
        for (x = 0; x < listaPersonal.size(); x++) {
            Usuarios p =listaPersonal.get(x);

            if(p.getNombre().equals(nombre) && p.getContrasena().equals(contrasena)){
                JOptionPane.showMessageDialog(null,"Bienvenido "+ nombre);
                vI.dispose();
                vP = new VentanaPrincipal();
                vP.setVisible(true);
                
                break;
            }
        }
        if (listaPersonal.size() == x) {
            JOptionPane.showMessageDialog(null, "El usuario indicado no existe");
        }
        
    }

    public static void goToFormulario() {
        vP.dispose();
        vF = new Formulario();
        vF.setVisible(true);
    }
    
    
}

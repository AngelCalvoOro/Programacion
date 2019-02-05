
package practica4_ejercicio1;

import ventana.*;
import clase.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Practica4_Ejercicio1 {
    private static Inicio vI;
    private static VentanaPrincipal vP;
    private static Formulario vF;
    private static ArrayList<Usuarios> listaUsuarios;
    public static void main(String[] args) {
        //creacion de base de datos
        generarPersonal();
        //creacion y inicio de ventana Inicio
        vI = new Inicio();
        vI.setVisible(true);
    }
    private static void generarPersonal(){
        //creacion de lista Array personal y sus datos
        listaUsuarios = new ArrayList<Usuarios>();
        
        listaUsuarios.add(new Usuarios ("usuario1","11111"));
        listaUsuarios.add(new Usuarios ("usuario2","22222"));
        listaUsuarios.add(new Usuarios ("usuario3","33333"));
        
        //crear lista inventada de departamentos y contratos
    }
    public static void cierreyFin(){
        vI.dispose();
        System.exit(0);
    }

    public static int validarUsuario(String nombre, String contrasena, int contador) {
        int x;
        for (x = 0; x < listaUsuarios.size() && (listaUsuarios.get(x).getNombre().equals(nombre) && listaUsuarios.get(x).getContrasena().equals(contrasena)); x++) {}
        if (listaUsuarios.size() == x) {
            contador++;
            if (contador>3) {
                JOptionPane.showMessageDialog(null, "HAS SUPERADO EL LIMITE DE INTENTOS.");
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "El usuario indicado no existe");
        }//ejecuta directamente el else
        else{
            JOptionPane.showMessageDialog(null,"Bienvenido "+ nombre);
                vI.dispose();
                vP = new VentanaPrincipal();
                vP.setVisible(true);
        }
        
        return contador;
        
    }

    public static void goToFormulario() {
        vP.dispose();
        vF = new Formulario();
        vF.setVisible(true);
    }
    
    
}

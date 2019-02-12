
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
    private static ArrayList<Trabajador> listaTrabajador;
    private static ArrayList<Contratos> listaContratos;
    private static ArrayList<Departamentos> listaDepartamentos;
    public static void main(String[] args) {
        //creacion de base de datos
        generarContenido();
        //creacion y inicio de ventana Inicio
        vI = new Inicio();
        vI.setVisible(true);
    }
    private static void generarContenido(){
        //creacion de lista Array Usuarios y sus datos
        listaUsuarios = new ArrayList<Usuarios>();
        
        listaUsuarios.add(new Usuarios ("usuario1","11111"));
        listaUsuarios.add(new Usuarios ("usuario2","22222"));
        listaUsuarios.add(new Usuarios ("usuario3","33333"));
        
        //creacion de lista Array Contratos y Departamentos
        listaContratos= new ArrayList<Contratos>();
        
        listaContratos.add(new Contratos ("Indefinido"));
        listaContratos.add(new Contratos ("Formativo"));
        listaContratos.add(new Contratos ("Discontinuo"));
        listaContratos.add(new Contratos ("Fijo"));
        
        listaDepartamentos =new ArrayList<Departamentos>();
        listaDepartamentos.add(new Departamentos ("Informatica"));
        listaDepartamentos.add(new Departamentos ("Mantenimiento"));
        listaDepartamentos.add(new Departamentos ("Gestion"));
        
        //creacion de lista Array personal y sus datos
        listaTrabajador = new ArrayList<Trabajador>();
        
        /*
        (USAR COMO AYUDA EJERCICO REALIZADO POR BLANCA NOMBRE= t8p3e1)
        configurar trabajador:
        AÑADIR SU RELACION CON CONTRATOS Y DEPARTAMENTOS
        TERMINAR LA CREACION DE LA CLASE TRABAJADOR
        */
        //listaTrabajador.add(new Trabajador ("1234567S","111111111","Paco","Fernandez","C/ mario Nº53","667579471","Hombre","soltero"));
        
        //crear lista inventada de departamentos y contratos
        
    }
    public static void cierreyFin(){
        vI.dispose();
        System.exit(0);
    }

    public static int validarUsuario(String nombre, String contrasena, int contador) {
        int x;
        for (x = 0; x < listaUsuarios.size() && !(listaUsuarios.get(x).getNombre().equals(nombre) && listaUsuarios.get(x).getContrasena().equals(contrasena)); x++) {}
        if (listaUsuarios.size() == x) {
            contador++;
            if (contador>3) {
                JOptionPane.showMessageDialog(null, "HAS SUPERADO EL LIMITE DE INTENTOS.");
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "El usuario indicado no existe");
        }
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

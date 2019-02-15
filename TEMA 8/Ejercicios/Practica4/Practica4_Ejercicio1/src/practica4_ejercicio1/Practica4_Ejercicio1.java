
package practica4_ejercicio1;

import ventana.*;
import clase.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Practica4_Ejercicio1 {
    private static Inicio vI;
    private static VentanaPrincipal vP;
    private static Formulario vF;
    private static ArrayList<Usuario> listaUsuarios;
    private static ArrayList<Trabajador> listaTrabajadores;
    private static ArrayList<Contrato> listaContratos;
    private static ArrayList<Departamento> listaDepartamentos;
    public static void main(String[] args) {
        //creacion de base de datos
        generarContenido();
        //creacion y inicio de ventana Inicio
        vI = new Inicio();
        vI.setVisible(true);
    }
    private static void generarContenido(){
        //creacion de lista Array Contratos y Departamentos
        listaContratos= new ArrayList<Contrato>();
        
        Contrato c1 =new Contrato ("Indefinido", "1");
        listaContratos.add(c1);
        Contrato c2 =new Contrato ("Formativo", "2");
        listaContratos.add(c2);
        Contrato c3 =new Contrato ("Discontinuo", "3");
        listaContratos.add(c3);
        Contrato c4=new Contrato ("Fijo", "4");
        listaContratos.add(c4);
        
        listaDepartamentos =new ArrayList<Departamento>();
        Departamento d1 = new Departamento ("Informatica", "1");
        listaDepartamentos.add(d1);
        Departamento d2 =new Departamento ("Mantenimiento", "2");
        listaDepartamentos.add(d2);
        Departamento d3 =new Departamento ("Gestion", "3");
        listaDepartamentos.add(d3);

        //creacion de lista Array personal y sus datos
        listaTrabajadores = new ArrayList<Trabajador>();
        Trabajador t1 =new Trabajador ("1234567S","111111111","Paco","Fernandez","C/ mario Nº53","667579471","H","S",new Date (1994,3,23),"1",d1,c4);
        listaTrabajadores.add(t1);
        Trabajador t2 =new Trabajador ("4581235S","222222222","Mario","Pescado","C/ wo Nº23","667579472","H","C",new Date (1994,4,23),"2",d2,c4);
        listaTrabajadores.add(t2);
        Trabajador t3 =new Trabajador ("1234562S","333333333","Sofia","Wololo","C/ Mar Nº55","667579421","M","C",new Date (1996,3,23),"3",d3,c4);
        listaTrabajadores.add(t3);
        
        //creacion de lista Array Usuarios y sus datos
        listaUsuarios = new ArrayList<Usuario>();
        
        listaUsuarios.add(new Usuario ("usuario1","11111",t1));
        listaUsuarios.add(new Usuario ("usuario2","22222",t2));
        listaUsuarios.add(new Usuario ("usuario3","33333",t3));
        
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
            //JOptionPane.showMessageDialog(null,"Bienvenido "+ nombre);
                vI.dispose();
                vP = new VentanaPrincipal(listaUsuarios.get(x));
                vP.setVisible(true);
        }
        
        return contador;
    }

    public static void goToFormulario() {
        vP.dispose();
        vF = new Formulario();
        vF.setVisible(true);
    }
    
    public static ArrayList<Departamento> dameDepartamentos(){
        return listaDepartamentos;
    }
    
}

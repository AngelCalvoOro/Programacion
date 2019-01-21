package t8p1e3;

import Vista.*;
import UML.*;
import java.util.ArrayList;


public class T8p1e3 {
    
    private static Ventana v;
    
    private static Curso[] listaCursos;
    private static ArrayList<Persona> listaPersonas;
    
    private static Curso cu;
    private static Persona p;
    
    public static void main(String[] args) {
        // Preparo la "base de datos"
        generarCursos();
        listaPersonas = new ArrayList<Persona>();
        
        // Ceder el control a la ventana
        mostrarVentana();
    }
    
    public static void mostrarVentana(){
        v = new Ventana();
        v.setVisible(true);
    }
    
    public static void generarCursos(){
        listaCursos= new Curso[16];
        cu = new Curso("1A");
        listaCursos[0]= cu;
        cu = new Curso("1B");
        listaCursos[1]= cu;
        cu = new Curso("1C");
        listaCursos[2]= cu;
        cu = new Curso("1D");
        listaCursos[3]= cu;
        cu = new Curso("2A");
        listaCursos[4]= cu;
        cu = new Curso("2B");
        listaCursos[5]= cu;
        cu = new Curso("2C");
       listaCursos[6]= cu;
        cu = new Curso("2D");
        listaCursos[7]= cu;
        cu = new Curso("3A");
       listaCursos[8]= cu;
        cu = new Curso("3B");
       listaCursos[9]= cu;
        cu = new Curso("3C");
        listaCursos[10]= cu;
        cu = new Curso("3D");
      listaCursos[11]= cu;
        cu= new Curso("4A");
       listaCursos[12]= cu;
        cu = new Curso("4B");
      listaCursos[13]= cu;
        cu = new Curso("4C");
      listaCursos[14]= cu;
        //cu = new Curso("4D");
        listaCursos[15]=new Curso("4D");
    }
    
    public static boolean validarDni(String dni){
        int x;
        for(x = 0;x < listaPersonas.size() && listaPersonas.get(x).getDni().compareTo(dni)!= 0;x++){}
        if (x == listaPersonas.size())
            // dni no encontrado
            return false;
        
        // dni encontrado
        // Variable global p
        p = listaPersonas.get(x);
        return true;
    }
    
    public static Persona getPersona(){
        return p;
    }
    
    public static boolean validarCurso(String c){
        int x;
        for(x = 0;x < listaCursos.length && listaCursos[x].getCurso().compareToIgnoreCase(c)!= 0;x++){}
        if (x == listaCursos.length)
            return false;
        
        cu = listaCursos[x];
        return true;
    }
    
    public static void altaPersona(String d, String n, String a){
        listaPersonas.add(new Persona (d,n,a,cu));
        volverEmpezar();
    }
    
    public static void volverEmpezar(){
        v.dispose();
        // También se puede limpiar
        mostrarVentana();
    }
    
    public static void borrarPersona(){
        // Quitarla del curso
        p.getC().borrarAlumno(p);
        
        listaPersonas.remove(p);
        volverEmpezar();
    }
    
    public static void modificarPersona(){
        // Quitarla del curso
        p.getC().borrarAlumno(p);
        
        // Añadir al nuevo curso
        p.setC(cu);
        volverEmpezar();
    }
    
    public static void terminar(){
        v.dispose();
        // No debería estar aquí. Es una comprobación
       System.out.println(generarDatos());
       System.exit(0);
    }
    
    public static String generarDatos(){
        String datos="";
        int x;
        
        // Personas
        for(x = 0; x < listaPersonas.size();x++)
        {
            datos += listaPersonas.get(x).getDni() + "  " + listaPersonas.get(x).getNombre() + listaPersonas.get(x).getApellidos();
            datos += "  " + listaPersonas.get(x).getC().getCurso() + " \n";
        }
        
        // Cursos
        datos += "\n Listado de alumnos por curso \n";
        for(x = 0; x < listaCursos.length;x++)
        {
            datos += "\n Curso: " + listaCursos[x].getCurso() + " \n";
            for(int y=0; y < listaCursos[x].getListaAlumnos().size(); y++)
                datos += listaCursos[x].getListaAlumnos().get(y).getNombre() + " \n";
    
        }
        
        if (datos.isEmpty())
            datos = "No hay datos";
        return datos;
    }
}

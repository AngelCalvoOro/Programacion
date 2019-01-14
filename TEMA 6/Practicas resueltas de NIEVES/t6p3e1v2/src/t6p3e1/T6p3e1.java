
package t6p3e1;

import Excepciones.*;
import Modelo.Alumno;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p3e1 {

    public static void main(String[] args) {
        try
        {
            ArrayList<Alumno> listaClase;
            listaClase = obtenerDatosAlumnos();
            buscarPorCodigo(listaClase);
        }
        catch(Exception e)
        {
            System.out.println("Problemas");
        }
    }
    
    
    public static void buscarPorCodigo(ArrayList<Alumno> lista) throws Exception{
        JOptionPane.showMessageDialog(null, "Ahora procederemos a buscar los datos de un alumno");
        String codigo = obtenerDato("codigo", "^[0-9]{5}$");
        
        // Buscar
        int x;
        for(x = 0; x < lista.size() && lista.get(x).getCodigo().equals(codigo)== false; x++){}
        if( x == lista.size())
            JOptionPane.showMessageDialog(null,"Alumno no encontrado");
        else
            JOptionPane.showMessageDialog(null,"Objeto alumno: \n" + lista.get(x).toString());
          
        // Buscar más avanzado
        lista.stream().filter(obj->obj.getCodigo().equals(codigo)).forEach((elemento)->JOptionPane.showMessageDialog(null,elemento.toString() ));
        if (lista.stream().filter(obj->obj.getCodigo().equals(codigo)).count()== 0)
             JOptionPane.showMessageDialog(null,"Alumno no encontrado");
    }
    
    public static ArrayList<Alumno> obtenerDatosAlumnos() throws Exception{
        ArrayList<Alumno> lista = new ArrayList();
        do
        {
                String codigo = obtenerDato("codigo", "^[0-9]{5}$");
                String nombre = obtenerDato ("nombre" , "^[A-Z][a-z]+( [A-Z][a-z]+)*");
                String domicilio = obtenerDato("domicilio","^c/([A-Z][a-z]*)+[ ][0-9]{1,3}[ ][0-9][a-z]$");
                String telefono = obtenerDato("telefono","^[6789][0-9]{8}$");
            
                Alumno a = new Alumno(codigo,nombre,domicilio,telefono);
                
                // Con edad y fecha de nacimiento no uso obtener dato porque no son string
                a.setEdad(obtenerEdad());
                a.setEmail(obtenerDato("email","^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+.([a-z]{2,4})$"));
                a.setFechaNacimiento(obtenerFecha());
                a.setEstadoCivil(obtenerDato("estado civil","^(casado|soltero)$" ));
                
                lista.add(a);
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Hay más alumnos en clase?")==0);
        return lista;
    }
    
    public static String obtenerDato(String campo, String expresion)throws Exception{
        String dato="";
        boolean error = false;
        do
        {
            try
            {
                dato = JOptionPane.showInputDialog("Indica el " + campo + " del alumno");
                Pattern patron = Pattern.compile(expresion);
                Matcher m = patron.matcher(dato);
                if (!m.matches())
                    throw new DatoNoValido();
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "El " + campo + " del alumno no es válido");
                error = true;
            }
        }
        while(error);
        return dato;
    }
    
    public static int obtenerEdad(){
        String edad="";
        boolean error = false;
        do
        {
            try
            {
                edad = JOptionPane.showInputDialog("Indica la edad del alumno");
                Pattern patron = Pattern.compile("^[0-9]{1,2}$");
                Matcher m = patron.matcher(edad);
                if (!m.matches())
                    throw new DatoNoValido();
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "La edad del alumno no es valida");
                error = true;
            }
        }
        while(error);
        return Integer.parseInt(edad);
    }
    
    public static LocalDate obtenerFecha(){
        LocalDate fecha=null;
        boolean error = false;
        do
        {
            try
            {
                String f = JOptionPane.showInputDialog("Indica la fecha de nacimiento del alumno");
                Pattern patron = Pattern.compile("^\\d{1,2}/\\d{1,2}/\\d{4}$");
                Matcher m = patron.matcher(f);
                if (!m.matches())
                    throw new DatoNoValido();
                
                // Convertir string en localDae
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                fecha = LocalDate.parse(f, formatter);
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "La fecha no es valida");
                error = true;
            }
            catch(DateTimeParseException e)
            {
                JOptionPane.showMessageDialog(null, "La fecha no es valida. Problemas con la conversión");
                error = true;
            }
        }
        while(error);
        return fecha;
    }
    
                
}

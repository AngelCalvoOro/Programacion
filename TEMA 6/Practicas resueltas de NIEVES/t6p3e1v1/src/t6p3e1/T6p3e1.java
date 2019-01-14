
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
        String codigo = obtenerCodigo();
        
        // Buscar
        int x;
        for(x = 0; x < lista.size() && lista.get(x).getCodigo().equals(codigo)== false; x++){}
        if( x == lista.size())
            JOptionPane.showMessageDialog(null,"Alumno no encontrado");
        else
            JOptionPane.showMessageDialog(null,"Objeto alumno: \n" + lista.get(x).toString());
    }
    
    public static ArrayList<Alumno> obtenerDatosAlumnos() throws Exception{
        ArrayList<Alumno> lista = new ArrayList();
        do
        {
                String codigo = obtenerCodigo();
                String nombre = obtenerNombre();
                String domicilio = obtenerDomicilio();
                String telefono = obtenerTelefono();
            
                Alumno a = new Alumno(codigo,nombre,domicilio,telefono);
                
                a.setEdad(obtenerEdad());
                a.setEmail(obtenerEmail());
                a.setFechaNacimiento(obtenerFecha());
                a.setEstadoCivil(obtenerEstado());
                
                lista.add(a);
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Hay más alumnos en clase?")==0);
        return lista;
    }
    
    public static String obtenerCodigo()throws Exception{
        String codigo="";
        boolean error = false;
        do
        {
            try
            {
                codigo = JOptionPane.showInputDialog("Indica el código del alumno");
                Pattern patron = Pattern.compile("^[0-9]{5}$");
                Matcher m = patron.matcher(codigo);
                if (!m.matches())
                    throw new DatoNoValido();
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "El código del alumno no es válido");
                error = true;
            }
        }
        while(error);
        return codigo;
    }
    
    public static String obtenerNombre(){
        String nombre="";
        boolean error = false;
        do
        {
            try
            {
                nombre = JOptionPane.showInputDialog("Indica el nombre del alumno");
                Pattern patron = Pattern.compile("^[A-Z][a-z]+( [A-Z][a-z]+)*$");
                Matcher m = patron.matcher(nombre);
                if (!m.matches())
                    throw new DatoNoValido();
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "El nombre del alumno no es válido");
                error = true;
            }
        }
        while(error);
        return nombre;
    }
    
    public static String obtenerDomicilio(){
        String domicilio="";
        boolean error = false;
        do
        {
            try
            {
                domicilio = JOptionPane.showInputDialog("Indica el domicilio del alumno");
                Pattern patron = Pattern.compile("^c/([A-Z][a-z]*)+[ ][0-9]{1,3}[ ][0-9][a-z]$");
                Matcher m = patron.matcher(domicilio);
                if (!m.matches())
                    throw new DatoNoValido();
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "El domicilio del alumno no es válido");
                error = true;
            }
        }
        while(error);
        return domicilio;
    }
    
    public static String obtenerTelefono(){
        String telefono="";
        boolean error = false;
        do
        {
            try
            {
                telefono = JOptionPane.showInputDialog("Indica el telefono del alumno");
                Pattern patron = Pattern.compile("^[6789][0-9]{8}$");
                Matcher m = patron.matcher(telefono);
                if (!m.matches())
                    throw new DatoNoValido();
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "El telefono del alumno no es válido");
                error = true;
            }
        }
        while(error);
        return telefono;
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
    
    public static String obtenerEmail(){
        String email="";
        boolean error = false;
        do
        {
            try
            {
                email = JOptionPane.showInputDialog("Indica el email del alumno");
                Pattern patron = Pattern.compile("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+.([a-z]{2,4})$");
                Matcher m = patron.matcher(email);
                if (!m.matches())
                    throw new DatoNoValido();
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "La dirección de correo no es valida");
                error = true;
            }
        }
        while(error);
        return email;
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
         
    public static String obtenerEstado(){
        String estado="";
        boolean error = false;
        do
        {
            try
            {
                estado = JOptionPane.showInputDialog("Indica el estado civil del alumno");
                Pattern patron = Pattern.compile("^(casado|soltero)$");
                Matcher m = patron.matcher(estado);
                if (!m.matches())
                    throw new DatoNoValido();
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "El estado civil del alumno no es valido");
                error = true;
            }
        }
        while(error);
        return estado;
    }
                
}

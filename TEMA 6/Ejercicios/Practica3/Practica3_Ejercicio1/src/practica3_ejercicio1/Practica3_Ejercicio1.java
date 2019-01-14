
package practica3_ejercicio1;

import Excepciones.*;
import lista_clases.Alumno;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Practica3_Ejercicio1 {

    
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
        String codigo = JOptionPane.showInputDialog("Teclea el código del alumno");
        // Validar
        validarCodigo(codigo);
        // Buscar por código
        int x;
        for(x = 0; x < lista.size() && lista.get(x).getCodigo().equals(codigo)== false; x++){}
        if( x == lista.size())
            JOptionPane.showMessageDialog(null,"Alumno no encontrado");
        else
            JOptionPane.showMessageDialog(null,"Objeto alumno: " + lista.get(x) + "\n" + lista.get(x).toString());
            
    }
    
    public static ArrayList<Alumno> obtenerDatosAlumnos(){
        ArrayList<Alumno> lista = new ArrayList();
        do
        {
            try
            {
                String codigo = JOptionPane.showInputDialog("Teclea el código del alumno");
                validarCodigo(codigo);
                String nombre = JOptionPane.showInputDialog("Teclea el nombre del alumno");
                validarNombre(nombre);
                String domicilio = JOptionPane.showInputDialog("Teclea el domicilio del alumno");
                validarDomicilio(domicilio);
                String telefono = JOptionPane.showInputDialog("Teclea el teléfono del alumno");
                validarTelefono(telefono);
            
                Alumno a = new Alumno(codigo,nombre,domicilio,telefono);
                
                lista.add(a);
            }
            catch(DatoNoValido e){
              JOptionPane.showMessageDialog(null,"El dato introducido no es correcto");
            }
            catch(Exception e)
            {
                System.out.println("Problemas");
            }
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Quieres continuar?")==0);
        return lista;
    }
    
    public static void validarCodigo(String codigo)throws Exception{
        // Cinco dígitos numéricos
        boolean error=false;
        if (codigo.length()!= 5)
            error = true;
        else
            for (int x = 0; x < codigo.length() && error == false;x++)
                if (Character.isAlphabetic(codigo.charAt(x)))
                    error = true;
        if (error)
            throw new DatoNoValido();
                    
    }
    
    public static void validarNombre(String nombre)throws Exception{
        
        boolean error=false;
        if (nombre.length()<= 2)
            error = true;
        else
            // Todo letras
            for (int x = 0; x < nombre.length() && error == false;x++)
                if (Character.isDigit(nombre.charAt(x)))
                    error = true;
        if (error)
            throw new DatoNoValido();
                    
    }
    
    public static void validarDomicilio(String domicilio)throws Exception{
        if (domicilio.length()<= 10)
            throw new DatoNoValido();
                    
    }
    
    public static void validarTelefono(String telefono) throws Exception{
        // 9 digitos numéricos empezando por 6, 7 , 8 o 9
        Pattern pat = Pattern.compile("^[6-9][0-9]{8}$");
        Matcher mat = pat.matcher(telefono);
        boolean error=false;
        if (mat.matches()){
        }
        else{
            error = true;
        }
        if (error)
            throw new DatoNoValido();
    }
}

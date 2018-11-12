package ejerciciodiecisiete;

import javax.swing.JOptionPane;

public class EjercicioDiecisiete {
    
    // variables globales
    static int maximo = -1, minimo = 11;
    static String nombreMax,nombreMin;
    
    public static void main(String[] args) {
        for ( int contador = 0; contador < 40; contador++)
        {
            String nombre = JOptionPane.showInputDialog(null, "Teclea el nombre del alumno");
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Teclea la calificación del alumno"));
            calcularMaxMin(calificacion,nombre);
        }
    
        JOptionPane.showMessageDialog(null, nombreMax + " es el alumno con la calificación más alta "+ maximo + " " + nombreMin + " es el alumno con la calificación más baja " + minimo);  
    }
    
    public static void calcularMaxMin(int calificacion,String nombre){
        if (calificacion > maximo)
        {
            maximo = calificacion;
            nombreMax = nombre;
        }
        if (calificacion < minimo)
        {
            minimo = calificacion;
            nombreMin = nombre;
        }
    }
    
}


package t4p1e9;

import javax.swing.JOptionPane;

public class T4p1e9 {

    // Declaración y creación de arrays
    static int[][] numeroAlumnos = new int [3][4];
    static String [] niveles = {"Básico", "Medio","Perfeccionamiento"};
    static String [] idiomas = {"Inglés", "Francés","Aleman","Ruso"};
    
    public static void main(String[] args) {
        try
        {
            entradaDatos();
            salidaPorNiveles();
            salidaPorIdiomas();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas");
        }
        
    }
    
    public static void entradaDatos() throws Exception{
        for (int x = 0; x < niveles.length; x++)
            for (int y = 0; y < idiomas.length;y++)
                numeroAlumnos[x][y] = Integer.parseInt(JOptionPane.showInputDialog(" Indica cuantos alumnos hay en el nivel " + niveles[x] + " del idioma "+ idiomas[y]));
    }
    
    public static void salidaPorNiveles() throws Exception{
         for (int x = 0; x < niveles.length; x++)
         {
            int alumnos = 0; 
            for (int y = 0; y < idiomas.length;y++)
                alumnos += numeroAlumnos[x][y];
            JOptionPane.showMessageDialog(null,"En el nivel "+ niveles[x] + " hay "+ alumnos + " alumnos");
         }
    }
    
    public static void salidaPorIdiomas() throws Exception{
         for (int x = 0; x < idiomas.length; x++)
         {
            int alumnos = 0; 
            for (int y = 0; y < niveles.length;y++)
                alumnos += numeroAlumnos[y][x];
            JOptionPane.showMessageDialog(null,"En "+ idiomas[x] + " hay "+ alumnos + " alumnos");
         }
    }
    
}

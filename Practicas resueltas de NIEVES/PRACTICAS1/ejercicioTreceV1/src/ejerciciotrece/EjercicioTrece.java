
package ejerciciotrece;
import javax.swing.JOptionPane;

public class EjercicioTrece {
    // Variables globales
    private static int contador = 0;
    public static int contadorChicos = 0;
    static int contadorChicas = 0;
    static int peso;
    static int edad;
    static String nombre;
    static String sexo;
    static float estatura;
    
    public static void main(String[] args) {
       do
       {
           // Datos de entrada
            JOptionPane.showMessageDialog(null, "Teclea los datos de un alumno");
            peso = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea el peso"));
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea la edad"));
            nombre = JOptionPane.showInputDialog(null,"Teclea el nombre");
            sexo = JOptionPane.showInputDialog(null,"Teclea el sexo");
            estatura = Float.parseFloat(JOptionPane.showInputDialog(null,"Teclea la estatura"));
            
            // LLamada a la función
            aptoNoApto();
            contador = contador + 1;
       }
       while (contador != 30);
       JOptionPane.showMessageDialog(null, contadorChicos + " " + contadorChicas);
    }
    
    // Función aptoNoApto
    public static void aptoNoApto(){
            
        // comparar Strings
        if (sexo.compareToIgnoreCase("femenino")==0)
        {
            if (estatura > 1.6 && peso > 60)
                contadorChicas += 1;
        }
        else
            // Supongo que es masculino
            if (estatura > 1.7 && peso > 70)
                contadorChicos ++;
    }
}

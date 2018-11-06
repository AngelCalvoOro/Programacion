
package ejerciciotrece;
import javax.swing.JOptionPane;

public class EjercicioTrece {
    // Variables globales
    // Se modifican en la función y se visualizan en el main
    static int contadorChicos = 0;
    static int contadorChicas = 0;
    
    
    public static void main(String[] args) {
       // Variables locales
       int contador = 0;
       int edad;
       String nombre;
       // se usan en la función pero no se modifican
       int peso;
       String sexo;
       float estatura;
       
       do
       {
            JOptionPane.showMessageDialog(null, "Teclea los datos de un alumno");
            peso = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea el peso"));
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea la edad"));
            nombre = JOptionPane.showInputDialog(null,"Teclea el nombre");
            sexo = JOptionPane.showInputDialog(null,"Teclea el sexo");
            estatura = Float.parseFloat(JOptionPane.showInputDialog(null,"Teclea la estatura"));
            // LLamada a la función
            aptoNoApto(peso,sexo,estatura);
            contador = contador + 1;
       }
       while (contador != 3);
       JOptionPane.showMessageDialog(null, contadorChicos + " " + contadorChicas);
    }
    
    // Función aptoNoApto
    public static void aptoNoApto(int peso,String sexo,float estatura){
        if (sexo.equals("femenino"))
        {
            if (estatura > 1.6 && peso > 60)
                contadorChicas += 1;
                
        }
        else
            // Supongo que es masculino
            if (estatura > 1.7 && peso > 70)
                contadorChicos += 1;
                
        
        
    }
}


package ejerciciotrece;
import javax.swing.JOptionPane;

public class EjercicioTrece {
        
    public static void main(String[] args) {
       // Variables locales
       int edad;
       String nombre;
       // se usan en la función pero no se modifican
       int peso;
       String sexo;
       float estatura;
       
       // Se modifican en la función y se visualizan en el main
       int contadorChicos = 0;
       int contadorChicas = 0;
       
       for( int contador = 0; contador < 3; contador++)
       {
            JOptionPane.showMessageDialog(null, "Teclea los datos de un alumno");
            peso = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea el peso"));
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea la edad"));
            nombre = JOptionPane.showInputDialog(null,"Teclea el nombre");
            sexo = JOptionPane.showInputDialog(null,"Teclea el sexo");
            estatura = Float.parseFloat(JOptionPane.showInputDialog(null,"Teclea la estatura"));
            
            // LLamada a las funciones
            if (sexo.equalsIgnoreCase("masculino"))
                contadorChicos = aptoNoAptoChico(peso,estatura,contadorChicos);
            else
                contadorChicas = aptoNoAptoChica(peso,estatura,contadorChicas);
       }
       JOptionPane.showMessageDialog(null, contadorChicos + " " + contadorChicas);
    }
    
    // Funciones
    public static int aptoNoAptoChico(int peso,float estatura,int contadorChicos){
            if (estatura > 1.7 && peso > 70)
                     contadorChicos += 1;
            return contadorChicos;
    }
    public static int aptoNoAptoChica(int peso,float estatura,int contadorChicas){
        if (estatura > 1.6 && peso > 60)
                contadorChicas += 1;
        return contadorChicas;
    }
}

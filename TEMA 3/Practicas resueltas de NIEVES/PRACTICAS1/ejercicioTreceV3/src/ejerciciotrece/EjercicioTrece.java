
package ejerciciotrece;
import javax.swing.JOptionPane;

public class EjercicioTrece {
        
    public static void main(String[] args) {
       // Variables locales
       int contador = 0;
       int edad;
       String nombre;
       // se usan en la función pero no se modifican
       int peso;
       String sexo;
       float estatura;
       
       // Se modifican en la función y se visualizan en el main
       int contadorChicos = 0;
       int contadorChicas = 0;
       
       do
       {
            JOptionPane.showMessageDialog(null, "Teclea los datos de un alumno");
            peso = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea el peso"));
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea la edad"));
            nombre = JOptionPane.showInputDialog(null,"Teclea el nombre");
            sexo = JOptionPane.showInputDialog(null,"Teclea el sexo");
            estatura = Float.parseFloat(JOptionPane.showInputDialog(null,"Teclea la estatura"));
            
            // LLamada a las funciones
            contadorChicos = aptoNoAptoChico(peso,sexo,estatura,contadorChicos);
            contadorChicas = aptoNoAptoChica(peso,sexo,estatura,contadorChicas);
            contador = contador + 1;
       }
       while (contador != 3);
       JOptionPane.showMessageDialog(null, contadorChicos + " " + contadorChicas);
    }
    
    // Funciones
    public static int aptoNoAptoChico(int peso,String sexo,float estatura,int contadorChicos){
            if (sexo.equalsIgnoreCase("masculino"))
                 if (estatura > 1.7 && peso > 70)
                     contadorChicos += 1;
            return contadorChicos;
    }
    public static int aptoNoAptoChica(int peso,String sexo,float estatura,int contadorChicas){
        if (sexo.equalsIgnoreCase("femenino"))
            if (estatura > 1.6 && peso > 60)
                contadorChicas += 1;
        return contadorChicas;
    }
}

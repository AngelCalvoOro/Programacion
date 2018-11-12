
package ejercicioquince;

import javax.swing.JOptionPane;

public class EjercicioQuince {

    public static void main(String[] args) {
        int contador = 0;
        String respuesta;
        do
        {
            int nota = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea una nota"));
            if (nota >= 6)
                contador = contador + 1;
            
            do
            {
                respuesta = JOptionPane.showInputDialog(null,"¿ Quieres continuar?");
            }
            while (respuesta.equalsIgnoreCase("si") == false && respuesta.equalsIgnoreCase("no") == false);
        }
        while(respuesta.equalsIgnoreCase("si"));// == true ! false
        JOptionPane.showMessageDialog(null,"El número de aprobados es "+ contador);
    }
    
}

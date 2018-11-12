
package ejercicioquince;

import javax.swing.JOptionPane;

public class EjercicioQuince {

    public static void main(String[] args) {
        int contador = 0;
        String respuesta="si";
        // inicializo a si para entrar la primera vez.
        while(respuesta.equalsIgnoreCase("si"))
        {
            int nota = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea una nota"));
            if (nota >= 6)
                contador = contador + 1;
            respuesta = JOptionPane.showInputDialog(null,"¿ Quieres continuar?");
        }
        JOptionPane.showMessageDialog(null,"El número de aprobados es "+ contador);
    }
    
}

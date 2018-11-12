
package ejercicioocho;

import javax.swing.JOptionPane;

public class EjercicioOcho {

    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota (0 al 10)"));
        if (nota >= 0 && nota <= 10)
        {
            // Nota correcta
            if (nota < 5)
                JOptionPane.showMessageDialog(null, "Suspendido");
            else
                JOptionPane.showMessageDialog(null, "Aprobado");
        }
        else
            JOptionPane.showMessageDialog(null, "La nota introducida no es correcta");
    }
    
}

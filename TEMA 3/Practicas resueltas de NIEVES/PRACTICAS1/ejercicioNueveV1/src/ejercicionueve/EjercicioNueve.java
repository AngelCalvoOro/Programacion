package ejercicionueve;

import javax.swing.JOptionPane;

public class EjercicioNueve {

    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la nota (0 al 10)"));
        if (nota >= 0 && nota <= 10)
        {
            // tratarNota
            if (nota < 5)
            {
                // Suspendido
                if (nota < 4)
                    JOptionPane.showMessageDialog(null, "Deficiente");
                else
                    JOptionPane.showMessageDialog(null, "Insuficiente");
            }
            else
            {
                // Aprobado
                if (nota < 7)
                    if (nota < 6)
                        JOptionPane.showMessageDialog(null, "Suficiente");
                    else
                        JOptionPane.showMessageDialog(null, "Bien");
                else 
                    if (nota < 9)
                        JOptionPane.showMessageDialog(null, "Notable");
                    else
                        JOptionPane.showMessageDialog(null, "Sobresaliente");
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Nota incorrecta");
    }
    
}

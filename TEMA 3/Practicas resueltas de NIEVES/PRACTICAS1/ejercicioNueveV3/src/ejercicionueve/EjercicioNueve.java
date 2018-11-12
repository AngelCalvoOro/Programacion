package ejercicionueve;

import javax.swing.JOptionPane;

public class EjercicioNueve {

    // Variable global
    private static int nota;
    
    public static void main(String[] args) {
        nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la nota"));
        if (nota >= 0 && nota <= 10)
        {
            // Nota correcta
            tratarNota();
        }
        else
            JOptionPane.showMessageDialog(null, "La nota introducida no es correcta");
    }
    
    public static void tratarNota(){
        if (nota < 5)
                if (nota < 4)
                    JOptionPane.showMessageDialog(null, "Deficiente");
                else
                    JOptionPane.showMessageDialog(null, "Insuficiente");
            else
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

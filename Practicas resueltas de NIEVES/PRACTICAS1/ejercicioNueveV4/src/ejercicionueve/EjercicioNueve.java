package ejercicionueve;

import javax.swing.JOptionPane;

public class EjercicioNueve {

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
        switch (nota)
        {
            case 1: case 2: case 3:
                JOptionPane.showMessageDialog(null, "Deficiente");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Insuficiente");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Suficiente");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Bien");
                break;
            case 7: case 8:
                JOptionPane.showMessageDialog(null, "Notable");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Sobresaliente");
                break;
        }
    }
    
}

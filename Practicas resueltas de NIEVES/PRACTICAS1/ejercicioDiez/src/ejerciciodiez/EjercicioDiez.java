
package ejerciciodiez;

import javax.swing.JOptionPane;

public class EjercicioDiez {


    public static void main(String[] args) {
        byte dia = Byte.parseByte(JOptionPane.showInputDialog(null,"Indica el día de la semana en número"));
        switch (dia)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
                break;
        }
    }
    
}

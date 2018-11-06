
package ejerciciodiez;

import javax.swing.JOptionPane;

public class EjercicioDiez {


    public static void main(String[] args) {
        byte dia = Byte.parseByte(JOptionPane.showInputDialog(null,"Indica el día de la semana en número"));
        if (dia == 1)
                JOptionPane.showMessageDialog(null, "Lunes");
        else
            if (dia == 2)
                JOptionPane.showMessageDialog(null, "Martes");
            else
                if (dia == 3)
                    JOptionPane.showMessageDialog(null, "Miercoles");
                else
                    if (dia == 4)
                        JOptionPane.showMessageDialog(null, "Jueves");
                    else
                        if (dia == 5)
                            JOptionPane.showMessageDialog(null, "Viernes");
                        else
                            if (dia == 6)
                                JOptionPane.showMessageDialog(null, "Sábado");
                            else
                                if (dia == 7)
                                    JOptionPane.showMessageDialog(null, "Domingo");
                                else
                                    JOptionPane.showMessageDialog(null, "Error");
    }
    
}

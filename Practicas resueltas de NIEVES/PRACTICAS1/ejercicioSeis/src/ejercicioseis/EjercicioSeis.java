package ejercicioseis;

import javax.swing.JOptionPane;

public class EjercicioSeis {

    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
        // Funciones matemáticas en la clase Math
        double area = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es " + area);
    }
    
}

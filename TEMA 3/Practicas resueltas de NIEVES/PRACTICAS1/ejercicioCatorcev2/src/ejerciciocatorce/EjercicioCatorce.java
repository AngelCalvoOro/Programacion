package ejerciciocatorce;

import javax.swing.JOptionPane;

public class EjercicioCatorce {

    public static void main(String[] args) {
        int suma = 0;
        for(int contador = 0; contador < 10; contador++)
        {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Teclea un número"));
            suma = suma + n;
        }
        JOptionPane.showMessageDialog(null,"El resultado de la suma es " + suma);
    }
    
}

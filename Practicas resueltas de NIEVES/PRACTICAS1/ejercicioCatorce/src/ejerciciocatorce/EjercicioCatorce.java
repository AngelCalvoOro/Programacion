package ejerciciocatorce;

import javax.swing.JOptionPane;

public class EjercicioCatorce {

    public static void main(String[] args) {
        int contador = 0;
        int suma = 0;
        while(contador != 10)
        {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Teclea un número"));
            suma = suma + n;
            contador = contador + 1;
        }
        
        JOptionPane.showMessageDialog(null,"El resultado de la suma es " + suma);
    }
    
}

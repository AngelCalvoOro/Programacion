
package ejercicio22;

import javax.swing.JOptionPane;

public class Ejercicio22 {

    private static int nro;
    
    public static void main(String[] args) {
        int ultimoNro = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número"));
        nro = ultimoNro;
        do
        {
            funcionPrimo();
            nro = nro - 1;
        }
        while(nro >= 2);
        // Para el uno
        JOptionPane.showMessageDialog(null,nro + " NO es un número primo");
    }
    
    public static void funcionPrimo()
    {
        int divisor = nro;
        int resto = 1;
        while (resto != 0 && divisor > 2)
        {
            divisor = divisor - 1;
            resto = nro % divisor;
        }
        
        if (resto == 0)
            JOptionPane.showMessageDialog(null,nro + " NO es un número primo");
        else
            JOptionPane.showMessageDialog(null,nro + " SI es un número primo");
    }
    
}

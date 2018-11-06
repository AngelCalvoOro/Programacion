
package ejercicio21;

import javax.swing.JOptionPane;

public class Ejercicio21 {

    public static void main(String[] args) {
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número"));
        switch(nro)
        {
            case 1: 
                JOptionPane.showMessageDialog(null,"El número tecleado NO es un número primo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"El número tecleado SI es un número primo");
                break;
            default:
                comprobar(nro);
        }
    }
    public static void comprobar(int nro)
    {
        int divisor = nro;
        int resto;
        do
        {
            divisor = divisor - 1; 
            resto = nro % divisor;
        }
        while (resto != 0 && divisor > 2);
        if (resto == 0)
            JOptionPane.showMessageDialog(null,"El número " + nro + " NO es un número primo");
        else
            JOptionPane.showMessageDialog(null,"El número " + nro + " SI es un número primo");
            
    }
    
}

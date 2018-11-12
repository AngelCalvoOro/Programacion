
package ejercicio21;

import javax.swing.JOptionPane;

public class Ejercicio21 {

    public static void main(String[] args) {           
        
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número"));
        int divisor = nro;
        int resto;
        do
        {
            // Si el número tecleado es 1 el programa falla al intentar dividir entro 0
            // Si el número es dos dice que no es primo y si lo es
            divisor = divisor - 1; 
            resto = nro % divisor;
        }
        while(resto != 0 && divisor > 2);
        if (resto == 0)
            JOptionPane.showMessageDialog(null,"El número tecleado NO es un número primo");
        else
            JOptionPane.showMessageDialog(null,"El número tecleado SI es un número primo");
    
}
}

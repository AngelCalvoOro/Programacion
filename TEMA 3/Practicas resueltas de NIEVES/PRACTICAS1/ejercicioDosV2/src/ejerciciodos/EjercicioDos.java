
package ejerciciodos;

import javax.swing.JOptionPane;


public class EjercicioDos {

    public static void main(String[] args){
        String numeroUno = JOptionPane.showInputDialog("Teclea el primer número");
        int n1 = Integer.parseInt(numeroUno);
        
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Teclea el segundo número"));
        
        int resultado = n1 * n2;
        
        JOptionPane.showMessageDialog(null,resultado);
        
    }
}


package ejercicio22;

import javax.swing.JOptionPane;
// Todas las clases del paquete ejercicio21
import ejercicio21.*;

public class Ejercicio22 {

    private static int nro;
    
    public static void main(String[] args) {
        int ultimoNro = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número"));
        nro = ultimoNro;
        do
        {
            Ejercicio21.comprobar(nro);
            nro = nro - 1;
        }
        while(nro >= 2);
        // Para el uno
        JOptionPane.showMessageDialog(null,nro + " NO es un número primo");
    }
    
    
}

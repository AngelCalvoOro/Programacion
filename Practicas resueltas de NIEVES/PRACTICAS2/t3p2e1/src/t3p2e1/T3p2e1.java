
package t3p2e1;

import javax.swing.JOptionPane;

public class T3p2e1 {

    /**
     * Dada una cadena de caracteres mostrar por pantalla la cantidad de
        vocales que tiene. 
    * Ejemplo:
        Entrada: Hola tu
        Salida: La cantidad de vocales es 3
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        int numero = contarVocales(cadena);
        JOptionPane.showMessageDialog(null, " La cadena tiene " + numero + " vocales");
    }
    
    public static int contarVocales(String cadena){
        int contador = 0;
        // Repetitiva para ir recorriendo la cadena
        for(int x = 0; x < cadena.length(); x++)
        {
            // charAt(x) == caracter de la posición x
            switch (cadena.charAt(x))
            {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    contador = contador +1;
                    break;
            }
        }
        return contador; 
    }
    
}


package practica2_ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica2_Ejercicio1 {

    /**
     * 
     * Dada una cadena de caracteres mostrar por pantalla la cantidad de
       vocales que tiene.
    * Ejemplo:
        Entrada: Hola tu
        Salida: La cantidad de vocales es 3
     */
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog(null,"escribe algo para mostrar la cantidad de vocales");
        int numero = contadorVocales(entrada);
        JOptionPane.showMessageDialog(null,"lo escrito tiene " + numero + " vocales.");
        
    }
    public static int contadorVocales(String entrada){
        int contador = 0;
        for(int x= 0; x < entrada.length(); x++){
            switch (entrada.charAt(x))
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
                    contador = contador + 1;
                    break;
            }
        }
        return contador;
    }
}

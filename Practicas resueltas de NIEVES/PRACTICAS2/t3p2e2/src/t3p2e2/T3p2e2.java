package t3p2e2;

import javax.swing.JOptionPane;

public class T3p2e2 {

    /**
     * Dada una cadena de caracteres invertir la misma y mostrar 
     * por pantalla.
    Ejemplo:
    Entrada: casa blanca
    Salida: acnalb asac
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        invertirCadena(cadena);
    }
    public static void invertirCadena(String cadena){
        StringBuilder cadenaInvertida = new StringBuilder(); 
        String cadenaInvertida2="";
        // Recorrer desdee el final al principio.
        for(int y = cadena.length()-1; y >= 0; y--)
        {
            cadenaInvertida.append(cadena.charAt(y));
            cadenaInvertida2 = cadenaInvertida2 + cadena.charAt(y);
        }
        
        JOptionPane.showMessageDialog(null, " La cadena invertida es " + cadenaInvertida);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_identifica_palindromo;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica_identifica_palindromo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog(null,"Teclea una palabra para saber si es un palindromo");
        cadenaInversa(cadena);
        
    }
    public static void cadenaInversa( String cadena){
        String cadenaInversa = "";
        for (int y = cadena.length()-1; y >= 0; y--) {
            cadenaInversa= cadenaInversa + cadena.charAt(y);            
        }
        if (cadenaInversa.equals(cadena)) {
            JOptionPane.showMessageDialog(null, "la palabra " + cadena + " es un palindromo.");
        }
        else{
            JOptionPane.showMessageDialog(null, "la palabra " + cadena + "  NO es un palindromo.");
        }
    }
}

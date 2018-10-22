/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_ejercicio2;

import javax.swing.JOptionPane;

/**
 *Dada una cadena de caracteres invertir la misma y mostrar por pantalla.
 *Ejemplo:
    Entrada: casa blanca
    Salida: acnalb asac
 */
public class Practica2_ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog(null,"Teclea una frase para ponerla de manera inversa");
        invertirCadena(cadena);
    }
    public static void invertirCadena(String cadena){
        StringBuilder cadenaInvertida = new StringBuilder();
        for(int y = cadena.length()-1; y >= 0; y--){
            cadenaInvertida.append(cadena.charAt(y));
        }
        JOptionPane.showMessageDialog(null,"La cadena invertida es " + cadenaInvertida);
    }
}

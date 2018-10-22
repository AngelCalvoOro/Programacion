/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_ejercicio3;

import javax.swing.JOptionPane;

/**
 *Dada una cadena de caracteres y un caracter, verificar cuantas veces se repite el caracter en la cadena,
 *por ejemplo:
    Entrada: casa blanca ’a’
    Salida: El caracter ’a’ se repite 4 veces
 */
public class Practica2_ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null,"Intruduce una frase");
        String caracter_contar = JOptionPane.showInputDialog(null,"Intruduce el caracter que se contara de la frase");
        contadorCaracter(frase, caracter_contar);
    }
    public static void contadorCaracter(String frase, String contadorCaracter){
        int contador = 0;
        for(int x= 0; x < frase.length(); x++){
            if(caracter_contar == frase.charAt(x)){
                contador = contador + 1;
            }
        }
        JOptionPane.showMessageDialog(null,"En la frase el caracter indicado esta puesto " + contador + " veces.");
    }
    
}

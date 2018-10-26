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
        //el .charAt(0) indicara que coga la primera posicion del valor indicado.
        char caracter_contar = JOptionPane.showInputDialog(null,"Intruduce el caracter que se contara de la frase").charAt(0);
        int contadorCaracter = contadorCaracter(frase, caracter_contar);
        JOptionPane.showMessageDialog(null,"En la frase (" + frase + ") hay " + contadorCaracter +" " + caracter_contar);
    }
    public static int contadorCaracter(String frase, char contadorCaracter){
        int contador = 0;
        //frase.length() enumera la cadena de caracteres de el String frase.
        //en el for el legth se transforma en el numero total de caracteres ejemplo "hola" en valor sera 3 hsiendo 0 y a siendo 3.
        for(int x= 0; x < frase.length(); x++){
            /*
            que realizara ejemplo
            frase = hola
            frase.legth = h= 0 |o= 1|l=2 |a=3 |
            if = hace que mire cada letra y si la letra esta es igual a la letra que queremos cuma contador
            Cada letra se representa con valor numerico con el .charAt
            */
            if(frase.charAt(x) == contadorCaracter){
                contador = contador + 1;
            }
        }  
        return contador;
    }
    
}

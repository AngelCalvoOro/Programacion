/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ejercicio1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica1_Ejercicio1 {

    /**
    1. Crear un array de diez elementos para guardar en el numeros de tipo
    real (float o double) que nos iran introduciendo por teclado. Una vez
    almacenados se visualizara el valor maximo y el mınimo.
    */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("añade valores numericos 10 veces"));
        }
        Arrays.sort(numeros);
        JOptionPane.showMessageDialog(null,"El numero mas pequeño es " + numeros[0] + " y es mayor es " + numeros[9]);
    }
    
}

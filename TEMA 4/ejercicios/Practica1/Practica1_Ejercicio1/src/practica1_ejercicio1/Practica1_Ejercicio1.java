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
        //creacion del array con 10 espacios para diferentes datos marcados desde el 0 al 9.
        int[] numeros = new int[10];
        
        //usamos el .length para indicar el maximo del array indicado previamente.
        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Añade el "+ (i+1) + "º valor numericos."));
        }
        
        //este Array.sort coge los valores numericos y los ordena poniendo en el 0 el valor mas pequeño y en el 9 el mas grande.
        Arrays.sort(numeros);
        JOptionPane.showMessageDialog(null,"El numero mas pequeño es " + numeros[0] + " y el mayor es " + numeros[9]);
    }
    
}

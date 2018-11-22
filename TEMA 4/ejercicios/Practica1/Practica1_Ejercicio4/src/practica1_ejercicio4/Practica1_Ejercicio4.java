/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ejercicio4;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica1_Ejercicio4 {

    /**
    4. Realizar un programa que cuente el numero de veces que aparece cada
    una de las letras del abecedario en un texto introducido por teclado y
    a continuacion imprima el resultado.
    */
    public static void main(String[] args) {
        char[] abecedario= new char[26];
        int[]  contadorLetras= new int[26];
        String resultados="";  
        int y;
        creacionAbecedario(abecedario);
        
        //esta funcion es para poner a todos los contadorLetras el valor 0
        for (int i = 0; i < abecedario.length; i++) {
             contadorLetras[i] = 0;
        }
        
        /*aqui se pone la frase y luego se descompone en caracteres, 
          los compara con el abecedario, si son iguales sumara a un espacio especifico
          reservado de contadorLetras.
        */
        String texto = JOptionPane.showInputDialog("Introduce un texto o frase");
        for (int i = 0; i < texto.length(); i++) {
            y = Arrays.binarySearch(abecedario, texto.charAt(i));
            if (y != -1){
                contadorLetras[y]=contadorLetras[y]+1;
            }
        }
        //aqui se hace una tabla mostrando el resultado en forma de lista y solo los que tengan un valor mayor que 1. 
        for (int x = 0; x <contadorLetras.length; x++)
        {
           if(contadorLetras[x]!=0)  
              resultados = resultados + abecedario[x] + " - " + contadorLetras[x]+ "\n";
        }
        JOptionPane.showMessageDialog(null, "La frecuencia de las letras es: \n\n" + resultados  ); 
    }

    private static void creacionAbecedario(char[] abecedario) {
        //creacion del abecedario
        char caracter=97;
        for (int x = 0; x < abecedario.length; x++)
           abecedario[x] = caracter++; 
           
           
    }
}

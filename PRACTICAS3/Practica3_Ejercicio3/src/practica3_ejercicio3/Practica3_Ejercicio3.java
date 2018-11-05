/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica3_Ejercicio3 {

    /**
    Mostrar al usuario el siguiente menu:
    
    -1.- Sumar dos numeros.
    -2.- Restar dos numeros.
    -3.- Visualizar la tabla de multiplicar de un numero. 
    -4.- Visualizar el cociente y el resto de una division. 
    -5.- Salir del programa. 
    -Elige una opcion:
    
    Cuando tengamos el resultado de la operacion elegida, lo visualizamos
    en pantalla y volveremos a mostrar el menu hasta que seleccione
    la opcion de salir.
    */
    public static void main(String[] args) {
        String operacion = JOptionPane.showInputDialog("Indica si se hace una | suma | resta | multiplicar | dividir |");
        /*int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Pon el primer valor"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Pon el segundo valor"));*/
        switch(operacion){
            case "suma":
                int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Pon el primer valor"));
                int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Pon el segundo valor"));
                int resultado = valor1 + valor2;
                JOptionPane.showMessageDialog(null,"La operacion y resultado siguientes son " + valor1 + " + " + valor2 + " = " + resultado);
            break;
            case "resta":
                valor1 = Integer.parseInt(JOptionPane.showInputDialog("Pon el primer valor"));
                valor2 = Integer.parseInt(JOptionPane.showInputDialog("Pon el segundo valor"));
                resultado = valor1 - valor2;
            JOptionPane.showMessageDialog(null,"La operacion y resultado siguientes son " + valor1 + " - " + valor2 + " = " + resultado);
            break;
            case "multiplicar":
                String tabla="";
                int valorMultiplicar = Integer.parseInt(JOptionPane.showInputDialog("Pon un numero para monstrar su tabla de multiplicar"));
                JOptionPane.showMessageDialog(null,"Se mostrara la tabla de multiplicacion de " + valorMultiplicar);
                for (int contador = 0; contador <= 10; contador++) {
                    tabla = tabla + valorMultiplicar + " * " + contador + " = " + (valorMultiplicar * contador) + "\n";
                    //JOptionPane.showMessageDialog(null, valorMultiplicar + " * " + contador + " = " + valorMultiplicar*contador);   
                }
                 JOptionPane.showMessageDialog(null, tabla);
            break;
            case "dividir":
                int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Pon el dividendo"));
                int divisor = Integer.parseInt(JOptionPane.showInputDialog("Pon el divisor"));
                int cociente = dividendo / divisor;
                int resto = dividendo % divisor;
                JOptionPane.showMessageDialog(null,"De la division " + dividendo + " / " + divisor + " el cociente es " + cociente + " y el resto es " + resto);
            break;
        }
    }
    
}

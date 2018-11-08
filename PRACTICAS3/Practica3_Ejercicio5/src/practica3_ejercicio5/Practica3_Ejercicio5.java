/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_ejercicio5;

import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw06
 */
public class Practica3_Ejercicio5 {

    /**
    Desarrolla una programa que nos permita jugar a Muertos y heridos
    con numeros de tres cifras. Generaremos automaticamente un
    numero e intentaremos adivinarlo teniendo como pista el numero de
    numeros que estan en la posicion adecuada (muertos) y el numero
    de numeros que estan pero no en la posicion adecuada (heridos).
    (charAt(posicion))
    */
    public static void main(String[] args) {
        String numero = numeroAleatorio();
         jugar(numero);
    }
    public static String numeroAleatorio(){
        String numero;
        boolean error;
        do
        {
            error = false;
            Integer n1 = (int) (Math.random() * 999) + 1;
            numero = String.valueOf(n1);
            if (numero.charAt(0) == numero.charAt(1) || numero.charAt(0) == numero.charAt(2) || numero.charAt(1) == numero.charAt(2))
                error = true;
        }
        while (error == true);
        //aqui sabremos cual es el numero aleatorio mostrado en el Output
        System.out.println(numero);
        return numero;
    }
    public static String entrada(){
        //aqui pondremos el numero de tres cifras y marcaremos ciertas obligaciones
        boolean correcto;
        String numero="";
        do
        {
            correcto = true;
            try
            {
                numero = JOptionPane.showInputDialog(null, "Teclea tres números.");
                if (numero.length()!= 3)
                {
                    throw new LongitudNoValida();
                }
                // Compruebo que son numeros
                for (int x=0;x < numero.length() && correcto == true; x++)
                {
                    if (Character.isDigit(numero.charAt(x))==false)
                    {
                        throw new DatoNoNumerico();
                    }
                }
                // conprobar que ningun numero es igual y forzar a que sean distintos, numericos y 3 numeros
                if (numero.charAt(0) == numero.charAt(1) || numero.charAt(0) == numero.charAt(2) || numero.charAt(1) == numero.charAt(2))
                {
                    throw new NumerosDistintos();
                } 
            }
            catch(LongitudNoValida e)
            {
                JOptionPane.showMessageDialog(null,"Tres dígitos");
                correcto = false;
            }
            catch(DatoNoNumerico e)
            {
                JOptionPane.showMessageDialog(null,"Solo números");
                correcto = false;
            }
            catch(NumerosDistintos e)
            {
                JOptionPane.showMessageDialog(null,"Los tres números tienen que ser diferentes");
                correcto = false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas con el número tecleado");
                correcto = false;
            }
        }
        while(correcto == false);
        return numero;
    }
    public static void jugar(String numero) {
        JOptionPane.showMessageDialog(null, "Todo en orden. Empieza.");
        boolean continuar = true;
        do{
            String nro=entrada();
            if (nro.equals(numero))
            {
                continuar = false;
                JOptionPane.showMessageDialog(null, "SUPISTE EL NUMERO ALEATORIO");
            }
            else
            {
                String mensaje = buscarMuertos(nro,numero) + buscarHeridos(nro,numero);
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }
        while(continuar == true);
    }
    public static String buscarMuertos(String nro, String numero){
        int contador = 0;
        for(int x=0; x < numero.length();x++)
            if (nro.charAt(x)== numero.charAt(x))
                contador = contador + 1;
        return " Hay " + contador + " muertos \n";
    }
    
    public static String buscarHeridos(String nro, String numero){
        int contador = 0;
        
        if (numero.charAt(0) == nro.charAt(1) || numero.charAt(0) == nro.charAt(2))
            contador ++;
        if (numero.charAt(1) == nro.charAt(0) || numero.charAt(1) == nro.charAt(2))
            contador ++;
        if (numero.charAt(2) == nro.charAt(0) || numero.charAt(2) == nro.charAt(1))
            contador ++;
        return " Hay " + contador + " heridos";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica1_Ejercicio3 {

    /**
    3. Desarrolla un programa que pida los litros de agua caıdos durante un
    año determinado (dıa, mes y litros). Cuando el usuario nos indique
    que no quiere continuar, debemos mostrar lo que ha llovido en cada
    uno de los meses del año. Todos lo datos de entrada son numericos y
    suponemos que correctos.
     */
    public static void main(String[] args) {
        boolean respuesta = false;
        String pregunta = null;
        double litros;
        double litroMes = 0;
        String[] listaMes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","semtiembre","octubre","noviembre","diciembre"};
        for (int x = 0; x < listaMes.length; x++) {
            do
            {
                try
                {
                    pregunta = JOptionPane.showInputDialog("Ha llovido en " + listaMes[x] + "? " + "\n\n" + "Si has terminado escribe FIN ");
                    if (!pregunta.equalsIgnoreCase("si") && !pregunta.equalsIgnoreCase("no") && !pregunta.equalsIgnoreCase("fin")) {
                        throw new diferenteException();
                    }
                    respuesta = true;
                }
                catch(diferenteException e)
                {
                    JOptionPane.showMessageDialog(null,"RESPONDE SOLO CON (SI), (NO) o (FIN)");
                    respuesta = false;
                }
            }while(respuesta == false);
            
            if (pregunta.equalsIgnoreCase("si") || x == 12) 
            {
               int cantidadDias = Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias a llovido en " + listaMes[x]));
               String[] listaDias = new String[cantidadDias];
                for (int i = 0; i < listaDias.length; i++) {
                    litros = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto llovio el " + (i+1) + "º dia?"));
                    litroMes = litroMes + litros;
                }
                
            }
            else if (pregunta.equalsIgnoreCase("no"))
            {
                litroMes = 0;
            }
            else if (pregunta.equalsIgnoreCase("fin") || x == 12)
            {
                String lista = "";
                for (int i = 0; i < 12; i++) {
                    lista = lista + listaMes[i+1] + " = " + litroMes + "\n";
                }
                JOptionPane.showMessageDialog(null, "Los litros recogidos durante los doce meses del año son: \n" + lista);

            }
            
            //EMPEZAR DE NUEVO PARA HACERLO MEJOR
        }
    }
    
}
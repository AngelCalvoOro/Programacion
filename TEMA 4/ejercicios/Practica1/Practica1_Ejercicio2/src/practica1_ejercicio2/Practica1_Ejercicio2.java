/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica1_Ejercicio2 {

    /**
    2. Desarrolla un programa que solicite al usuario un mes en letra y que
    luego lo valide, es decir, que muestre un mensaje indicando si el mes
    tecleado es correcto o no.
    */
    public static void main(String[] args) {
        /*
        otra manera de hacer este array 
        String[] listaMes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","semtiembre","octubre","noviembre","diciembre"};
        */
        String[] listaMes = new String[12];
        listaMes[0] = "enero";
        listaMes[1] = "febrero";
        listaMes[2] = "marzo";
        listaMes[3] = "abril";
        listaMes[4] = "mayo";
        listaMes[5] = "junio";
        listaMes[6] = "julio";
        listaMes[7] = "agosto";
        listaMes[8] = "semtiembre";
        listaMes[9] = "octubre";
        listaMes[10] = "noviembre";
        listaMes[11] = "diciembre";
        String mes = JOptionPane.showInputDialog("Escriba un mes del año.");
        for (int i = 0; i < listaMes.length; i++) {
            if (mes.equalsIgnoreCase(listaMes[i])== true) {
                JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                System.exit(0);
            }
        }
        JOptionPane.showMessageDialog(null,"Lo escrito no es uno de los 12 meses.");
        
        /*int respuesta;
        
        String mes = JOptionPane.showInputDialog("Escriba un mes del año.");
        listadoMes();
        switch(mes.toLowerCase())
        {
            case "enero":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es enero.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            case "febrero":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es febrero.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            case "marzo":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es marzo.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            case "abril":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es abril.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            case "mayo":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es mayo.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            case "junio":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es junio.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            case "julio":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es julio.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            case "agosto":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es agosto.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            case "septiembre":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es septiembre.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            case "ortubre":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es ortubre.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            case "noviembre":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es noviembre.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            case "diciembre":
                respuesta = JOptionPane.showConfirmDialog(null,"El mes que pusiste es diciembre.");
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null,"OK. TODO ESTA BIEN.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"algo esta mal");
                }
            break;
            */
        }
    }

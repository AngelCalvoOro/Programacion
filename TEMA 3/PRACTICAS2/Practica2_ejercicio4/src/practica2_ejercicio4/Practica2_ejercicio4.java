/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_ejercicio4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica2_ejercicio4 {

    /**
     *Crear un programa que calcule la diferencia en dıas entre dos fechas
        dadas por el usuario como cadenas con el formato dd/mm/yy. 
     */
    public static void main(String[] args){
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
            String fechaString = JOptionPane.showInputDialog(null,"escribe una fecha de esta manera dd/MM/yy");
            LocalDate fechaUno = LocalDate.parse(fechaString, formatter);
            
            fechaString = JOptionPane.showInputDialog(null,"escribe una segunda fecha de esta manera dd/MM/yy");
            LocalDate fechaDos =LocalDate.parse(fechaString, formatter);

            Period period = Period.between(fechaUno, fechaDos);
            JOptionPane.showMessageDialog(null, "La diferencia entre las dos fechas es de " + period.getDays() + " días.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Esta algo mal");
        }
    }
    
}

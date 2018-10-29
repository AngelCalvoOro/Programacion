/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_ejercicio7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica2_ejercicio7 {

    /**
     * Crear un programa que reciba dos fechas y que devuelva la cantidad
        de domingos comprendidos entre ambas fechas.
     */
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yy");
        String fechaString = JOptionPane.showInputDialog(null,"Pon una primera fecha con el formato dd/mm/yy");
        LocalDate fechaUno = LocalDate.parse(fechaString, formatter);
          
        fechaString = JOptionPane.showInputDialog(null,"Pon una segunda fecha dd/mm/yy");
        LocalDate fechaDos = LocalDate.parse(fechaString, formatter);
        
        int contador = 0;
        while(fechaUno.isBefore(fechaDos))
        {
            if (fechaUno.getDayOfWeek()==DayOfWeek.SUNDAY)
                contador++;
            fechaUno = fechaUno.plusDays(1);
        }
        JOptionPane.showMessageDialog(null, "Entre las dos Fechas tienes " + contador + " domingos.");
    }
    
}

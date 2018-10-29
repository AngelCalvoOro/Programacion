/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_ejercicio5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica2_ejercicio5 {

    /**
     * Crear un programa que recoja una fecha introducida por el usuario
        como 3 campos numericos (dıa, mes, año) y devuelva la fecha 100 dıas
        posterior mostrada con el formato: Viernes, 16 de noviembre de 2018.
     */
    public static void main(String[] args) throws ParseException {
        try{
            int dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Numera un día"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Numera un mes"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Numera un año"));
            
            LocalDate fecha = LocalDate.of(ano,mes,dia);
            fecha = fecha.plusDays(100);
            JOptionPane.showMessageDialog(null, fecha.getDayOfWeek()+ ", " + fecha.getDayOfMonth() + " de " + fecha.getMonth()+ " del " + fecha.getYear());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Tienes algun problema en el ejercicio.");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_ejercicio6;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica2_ejercicio6 {

    /**
     * Crear un programa que reciba una fecha y que devuelva el nombre
        de la estacion en la que esta ubicado dicha fecha.
     */
    public static void main(String[] args) {
       final LocalDate PRIMAVERA = LocalDate.of(2018,3,21);
       final LocalDate VERANO = LocalDate.of(2018,6,21);
       final LocalDate OTOÑO = LocalDate.of(2018,9,21);
       final LocalDate INVIERNO = LocalDate.of(2018,12,21);
       
        try{
            
            int dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Pon un día entre el 1 y 31"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Pon un mes entre 1 y 12"));
            LocalDate fecha = LocalDate.of(2018,mes,dia);
            
            if (fecha.isBefore(PRIMAVERA))
            {
                JOptionPane.showMessageDialog(null,"Invierno");
            }
            else
            {
                if(fecha.isBefore(VERANO))
                {
                    JOptionPane.showMessageDialog(null,"Primavera");
                }    
                else
                {
                    if(fecha.isBefore(OTOÑO))
                    {
                        JOptionPane.showMessageDialog(null,"Verano");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Otoño");
                    }
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Algo esta mal puesto o algo a fallado en la programacion.");
        }
    }
    
}

package t3p2e4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class T3p2e4 {

    /**
     * Crear un programa que calcule la diferencia en días entre dos fechas
      dadas por el usuario como cadenas con el formato dd/mm/yy.
     */
    public static void main(String[] args) {
        // Con Date
        /*try{
            String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
            Date fechaUno = formatter.parse(fechaString);
        
            fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            Date fechaDos = formatter.parse(fechaString);
        
            // resta
            Long milisegundos = fechaUno.getTime() - fechaDos.getTime();
            // 24 horas * 60 minutos * 60 segundos * 1000 milisegundos = 86.400.000
            Long dias = milisegundos / 86400000;
            JOptionPane.showMessageDialog(null, "La diferencia es de " + dias + " días");
        //}
        /*catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas");
        }*/
        
        // Con Calendar
        /*try{
            
            Calendar fechaUno = Calendar.getInstance();
            Calendar fechaDos = Calendar.getInstance();
            
            String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
            fechaUno.setTime(formatter.parse(fechaString));
           
            fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            fechaDos.setTime(formatter.parse(fechaString));
            // resta
            Long milisegundos = fechaUno.getTimeInMillis() - fechaDos.getTimeInMillis();
            // 24 horas * 60 minutos * 60 segundos * 1000 milisegundos = 86.400.000
            Long dias = milisegundos / 86400000;
            JOptionPane.showMessageDialog(null, "La diferencia es de " + dias + " días");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas");
        }*/
        
        // Con LocalDate
        try{
           
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
            String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            LocalDate fechaUno = LocalDate.parse(fechaString, formatter);
           
        
            fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            LocalDate fechaDos = LocalDate.parse(fechaString, formatter);
          
            Period period = Period.between(fechaUno, fechaDos);
            JOptionPane.showMessageDialog(null, "La diferencia es de " + period.getDays() + " días");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas");
        }
    }
    
}

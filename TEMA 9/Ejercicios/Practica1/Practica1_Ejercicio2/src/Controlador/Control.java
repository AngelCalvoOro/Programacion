package Controlador;

import Modelo.*;
import Vista.*;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 * 
 * @author angel
 * @version 1
 * 
 */

public class Control {
    private static VentanaAddEvento vAdd; 
    private static VentanaPrincipal vP;
    private static EventoDAO eDAO;
    
    public static void main(String[] args) {
        vP = new VentanaPrincipal();
        vP.setVisible(true);
    }

    public static void ventanaAnadir() {
        vP.dispose();
        vAdd =new VentanaAddEvento();
        vAdd.setVisible(true);
        
    }
    public static void returnToPrincipal(){
        vAdd.dispose();
        vP.setVisible(true);
    }
    public static void finPrograma(){
        vP.dispose();
        System.exit(0);
    }

    public static void addEvento(String nombre, String lugar, LocalDate fecha, LocalTime horaI, LocalTime horaF, int maxPersona) {
        Evento e =new Evento();
        e.setNombre(nombre);
        e.setLugar(lugar);
        e.setFecha(fecha);
        e.sethInicio(horaI);
        e.sethFinal(horaF);
        e.setMaxPersona(maxPersona);
        
        eDAO.addEventoBD(e);
        
    }
    
}

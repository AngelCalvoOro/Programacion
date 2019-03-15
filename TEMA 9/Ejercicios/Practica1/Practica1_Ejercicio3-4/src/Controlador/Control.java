package Controlador;

import Modelo.*;
import Vista.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
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
    private static VentanaEliminar vE;
    
    public static void main(String[] args) {
        vP = new VentanaPrincipal();
        vP.setVisible(true);
    }

    public static void ventanaAnadir() {
        vP.dispose();
        vAdd =new VentanaAddEvento();
        vAdd.setVisible(true);
    }
    public static void ventanaEliminar() {
        ArrayList<Evento> listaEventos=getListaEventos();
        vP.dispose();
        vE =new VentanaEliminar(listaEventos);
        vE.setVisible(true);
    }
    public static void returnToPrincipal(){
        vAdd.dispose();
        vP.setVisible(true);
    }
    public static void returnToPrincipalFromDelete(){
        vE.dispose();
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
    public static ArrayList<Evento> getListaEventos(){
        ArrayList<Evento> listaEvento=eDAO.getListaEventos();
        return listaEvento;
    }

    public static void deleteEvento(String nombreDelete) {
        Evento nDelete= new Evento();
        nDelete.setNombre(nombreDelete);
        eDAO.deleteEvento(nDelete);
    }

    public static Evento updateEvento(String nombreM) {
        Evento eUpdate = new Evento();
        eUpdate.setNombre(nombreM);
        Evento eRecibido = eDAO.getEvento(eUpdate);
        return eRecibido;
    }
    public static void ventanaModificar(Evento encontrado) {
        vP.dispose();
        vAdd =new VentanaAddEvento(encontrado);
        vAdd.setVisible(true);
    }

    

    
    
    
    
}

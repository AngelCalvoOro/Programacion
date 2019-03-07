
package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;


public class Evento {
    private String nombre;
    private String lugar;
    private LocalDate fecha;
    private LocalTime hInicio;
    private LocalTime hFinal;
    private int maxPersona;

    public int getMaxPersona() {
        return maxPersona;
    }

    public void setMaxPersona(int maxPersona) {
        this.maxPersona = maxPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime gethInicio() {
        return hInicio;
    }

    public void sethInicio(LocalTime hInicio) {
        this.hInicio = hInicio;
    }

    public LocalTime gethFinal() {
        return hFinal;
    }

    public void sethFinal(LocalTime hFinal) {
        this.hFinal = hFinal;
    }
    
    
}

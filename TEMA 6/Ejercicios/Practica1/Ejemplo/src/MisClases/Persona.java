/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author usuario
 */
public class Persona {
    private String nombre;
    private int edad;
    public String trabajo;

    public Persona() {
    }

    public Persona(String nombre, int edad, String trabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.trabajo = trabajo;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    /*public Persona(String trabajo){
        
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    
    public void cumplirAños(){
        this.edad = this.edad + 1;
    }
    
    
}

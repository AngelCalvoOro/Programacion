/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import MisClases.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Teclea la edad")));
        p1.setNombre("Pepe");
        p1.trabajo="Estudiante";
        JOptionPane.showMessageDialog(null, p1.getNombre() + p1.getEdad() + p1.trabajo);
        
        
        Persona p2=new Persona("Juan",40,"Minero");
        JOptionPane.showMessageDialog(null, p2.toString());
        
        Persona p3 = new Persona("Ana");
        p3.setEdad(20);
        JOptionPane.showMessageDialog(null, p3.getNombre() + p3.getEdad() + p3.getTrabajo());
        
        ArrayList<Persona> lista = new ArrayList();
        lista.add(p1);
        lista.add(p2);
        lista.get(0).setEdad(80);
        
        Persona[] listaDos = new Persona[6];
        listaDos[0] = p1;
        
    }
    
}

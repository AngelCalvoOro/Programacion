/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ejercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica1_Ejercicio1 {

    /**
    Crea un arraylist para guardar valores de tipo real (Float o Double) que iremos
    introduciendo por teclado hasta finalizar (mientras quiera continuar).
    Posteriormente muestra un menu para que el usuario pueda realizar las
    siguientes operaciones:
    
        1. Visualizar el valor maximo y el mınimo.
        2. Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo
        has encontrado o no.
        3. Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra
        un mensaje de error.
        4. Convertir el arrayList en un array.
        5. Si no esta vacıo, mostrar el numero de elementos que contiene.
        6. Insertar un nuevo elemento por el final.
        7. Insertar un nuevo elemento en la posicion que te indique el usuario.
        8. Borrar un elemento de una posicion concreta.
        9. Calcular la suma y la media aritmetica de los valores contenidos.
        10. Finalizar.
    */
    public static void main(String[] args) {
        ArrayList<Float> listaValores = new ArrayList();
        valoresArrayList(listaValores);
        // siguiente objetivo hacer menu
        opcionesLista();//(listaMenu)
    }

    private static void valoresArrayList(ArrayList<Float> listaValores){
        int x = 1;
        int respuesta = 0;
        do{
            listaValores.add(Float.parseFloat(JOptionPane.showInputDialog("Introduce el "+x+"º valor")));
            x++;
            respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres añadir mas valores?");
        } while (respuesta == 0);
    }

    private static void opcionesLista() {
        String lista=" ";
        
    }
    
    
}

package practica3_ejercicio1;

import Clases.*;
import Ventanas.Almacen;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Practica3_Ejercicio1 {
    private static ArrayList<Productos> listaProductos;
    private static Productos p;
    private static Almacen vA;

    public static void main(String[] args) {
        generarProductos();
        vA = new Almacen();
        vA.setVisible(true);
    }
    public static void finalizar(){
        vA.dispose();
        System.exit(0);
    }

    private static void generarProductos() {
        listaProductos = new ArrayList<Productos>();
        p = new Productos ("Producto1",10,3.5f);
        listaProductos.add(p);
        p = new Productos ("Producto2",45,1.7f);
        listaProductos.add(p);
        p = new Productos ("Producto3",64,5.5f);
        listaProductos.add(p);
        p = new Productos ("Producto4",32,3.4f);
        listaProductos.add(p);
        p = new Productos ("Producto5",12,7.8f);
    }
    public static boolean validarProducto(String producto){
        boolean respuestaProducto = true;
        for (int x = 0; x < listaProductos.size(); x++) {
            if (producto == listaProductos.get(x).getNombre()) {
                respuestaProducto = true;
            }else respuestaProducto = false;
        }
        return respuestaProducto;
    }
}

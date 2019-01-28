package practica3_ejercicio1;

import Clases.*;
import Ventanas.Almacen;
import java.util.ArrayList;

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
        p = new Productos ("Producto",45,1.7f);
        listaProductos.add(p);
        p = new Productos ("Producto",64,5.5f);
        listaProductos.add(p);
        p = new Productos ("Producto",32,3.4f);
        listaProductos.add(p);
        p = new Productos ("Producto",12,7.8f);
        listaProductos.add(p);
    }
    
}

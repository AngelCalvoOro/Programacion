package practica3_ejercicio1;

import Clases.*;
import Ventanas.Almacen;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Practica3_Ejercicio1 {
    private static ArrayList<Productos> listaProductos; 
    private static ArrayList<Proveedores> listaProveedores;
    private static Almacen vA;

    public static void main(String[] args) {
        generarProductos();
        generarProveedores();
        vA = new Almacen();
        vA.setVisible(true);
    }
    public static void finalizar(){
        vA.dispose();
        System.exit(0);
    }

    private static void generarProductos() {
        listaProductos = new ArrayList<Productos>();

        listaProductos.add(new Productos ("Producto1",10,3.5f));
        listaProductos.add(new Productos ("Producto2",45,1.7f));
        listaProductos.add(new Productos ("Producto3",64,5.5f));
        listaProductos.add(new Productos ("Producto4",32,3.4f));
        listaProductos.add(new Productos ("Producto5",12,7.8f));
    }
    
    private static void generarProveedores() {
        listaProveedores = new ArrayList<Proveedores>();

        listaProveedores.add(new Proveedores ("Proveedor1"));
        listaProveedores.add(new Proveedores ("Proveedor2"));
        listaProveedores.add(new Proveedores ("Proveedor3"));
        listaProveedores.add(new Proveedores ("Proveedor4"));
        listaProveedores.add(new Proveedores ("Proveedor5"));
    }
    public static boolean validarProducto(String producto){
        boolean respuestaProducto = false;
        for (int x = 0; x < listaProductos.size() && !respuestaProducto; x++) {
            if (producto.equalsIgnoreCase(listaProductos.get(x).getNombre())) {
                respuestaProducto = true;
            }else respuestaProducto = false;
        }
        return respuestaProducto;
    }
    
}

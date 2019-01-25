package t8p1e4;

import UML.*;
import java.util.ArrayList;
import GUI.*;

public class T8p1e4 {
    private static VentanaCompras vc;
    private static VentanaVentas vv;
    private static VentanaPrincipal vp;
    
    private static ArrayList<Producto> listaProductos;
    private static Producto p;

    public static void main(String[] args) {
        generarProductos();
        vp = new VentanaPrincipal();
        vp.setVisible(true);
    }
    
    public static void generarProductos(){
        listaProductos = new ArrayList<Producto>();
        p = new Producto ("Producto uno",1.5f,100);
        listaProductos.add(p);
         p = new Producto ("Producto dos",2.5f,50);
        listaProductos.add(p);
         p = new Producto ("Producto tres",3f,1000);
        listaProductos.add(p);
         p = new Producto ("Producto cuatro",1.5f,10);
        listaProductos.add(p);
         p = new Producto ("Producto cinco",4f,76);
        listaProductos.add(p);
         p = new Producto ("Producto seis",10f,25);
        listaProductos.add(p);
    }
    
    public static void visualizarCompra(){
        vp.setVisible(false);
        vc = new VentanaCompras();
        vc.setVisible(true);
    }
    
    public static void visualizarVenta(){
        vp.setVisible(false);
        vv = new VentanaVentas();
        vv.setVisible(true);
    }
    
    public static void terminar(){
        vp.dispose();
        System.exit(0);
    }
    
    public static String generarListado(){
        String datos="";
        for(int x = 0; x < listaProductos.size(); x++)
            datos += listaProductos.get(x).toString();
        return datos;
    }
    
    public static boolean validarProducto(String nombre){
        int x;
        for(x=0; x < listaProductos.size() && listaProductos.get(x).getNombre().compareToIgnoreCase(nombre)!= 0; x++){}
        if (x == listaProductos.size())
            return false;
        p = listaProductos.get(x);
        return true;
    }
    
    public static boolean aceptarCompra(int u,Float pr){
        try
        {
            // Modificamos el objeto
            float nuevoPrecio = (p.getUnidades()*p.getPrecio()+ u * pr)/(p.getUnidades()+ u);
            p.setUnidades(p.getUnidades() + u);
            p.setPrecio(nuevoPrecio);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public static void volver(javax.swing.JFrame v){
        v.dispose();
        vp.setVisible(true);
    }
    
    public static float getPrecio(){
        return p.getPrecio();
    }
    
    public static int getUnidades(){
        return p.getUnidades();
    }
    public static boolean aceptarVenta(int u){
        try
        {
            p.setUnidades(p.getUnidades() - u);
            return true;
        }
        catch(Exception e){
            return false;
        }
        
    }
}

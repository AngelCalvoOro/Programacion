package t8p3e1;

import Vista.*;
import UML.*;
import java.util.ArrayList;

public class Main {
    // "Base de datos"
    private static Proveedor[] aProveedores;
    private static Producto[] aProductos;
    private static ArrayList<Cliente> lClientes;
    
    private static VentanaCompraVenta v;
    
    private static Producto objetoProducto;
    private static Proveedor objetoProveedor;
    private static Cliente objetoCliente;
    
    private final static int DTOPP = 3;
    private final static int DTOV = 2;

    public static void main(String[] args) {
        crearDatos();

        v = new VentanaCompraVenta(true);
        v.setVisible(true);
    }

    public static void crearDatos(){
         
        // Proveedores
        aProveedores = new Proveedor[5];
        aProveedores[0] = new Proveedor();
        aProveedores[0].setNombre("Luisa");
        aProveedores[1] = new Proveedor();
        aProveedores[1].setNombre("Mónica");
        aProveedores[2] = new Proveedor();
        aProveedores[2].setNombre("Inés");
        aProveedores[3] = new Proveedor();
        aProveedores[3].setNombre("Ana");
        aProveedores[4] = new Proveedor();
        aProveedores[4].setNombre("Miren");
        
       //Productos
        aProductos=new Producto[3];
        aProductos[0] = new Producto("Producto uno",10,257.2f);
        aProductos[1] = new Producto("Producto dos",100,2f);
        aProductos[2] = new Producto("Producto tres",5,50f);
        
       // Relación entre productos y proveedores
        aProductos[0].setListaProveedores(aProveedores[1]);
        aProductos[0].setListaProveedores(aProveedores[3]);
        
        aProductos[1].setListaProveedores(aProveedores[4]);
        
        aProductos[2].setListaProveedores(aProveedores[0]);
        aProductos[2].setListaProveedores(aProveedores[4]);
        
        // clientes
        lClientes = new ArrayList();
    }

    public static void cancelar(){
        v.dispose();
        System.exit(0);
    }
    
    public static String datos(){
        String datos = "Datos sobre los productos \n";
        for(int x = 0; x < aProductos.length; x++)
        {
            datos += "\n \n" + aProductos[x].getNombre() + " Unidades: " + aProductos[x].getUnidades() + " Precio: " + aProductos[x].getPrecio() + "\n";
            datos += "Proveedores: \n";
            for(int y = 0 ; y < aProductos[x].getListaProveedores().size(); y++)
            {
                datos += aProductos[x].getListaProveedores().get(y).getNombre() + " \n ";
            }
            datos += "\n\nClientes: \n";
            for(int y = 0; y < lClientes.size(); y++)
                if (lClientes.get(y).getListaProductos().contains(aProductos[x]))
                    datos += lClientes.get(y).getNombre() + "\n";
                
        }
        return datos;
    }

    public static boolean validarNombreProducto(String producto){
        int x;
        for(x = 0; x < aProductos.length && aProductos[x].getNombre().compareToIgnoreCase(producto)!= 0; x++){}
        if (x == aProductos.length)
        {
            objetoProducto = null;
            return false;
        }
        objetoProducto = aProductos[x];
        return true;
    }

    public static boolean llenarProveedores(javax.swing.JComboBox lista){
        try
        {
            //lista.removeAllItems();
            for(int x = 0; x < objetoProducto.getListaProveedores().size()  ; x++)
            {
                lista.insertItemAt(objetoProducto.getListaProveedores().get(x).getNombre(), x);
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public static void guardarProveedor(int x){
        objetoProveedor=objetoProducto.getListaProveedores().get(x);
        
    }
    public static void compra(int unidades, float precioCompra){
        objetoProducto.comprarUnidades(unidades,precioCompra);
    }

    public static void volverEmpezar(){
        v.dispose();
        v = new VentanaCompraVenta(false);
        v.setVisible(true);
    }

    public static float getPrecioVenta(){
        return objetoProducto.getPrecioVenta();
    }

    public static int getUnidades(){
        return objetoProducto.getUnidades();
    }

    

     public static float calcularImporteVenta(int u,boolean isDv,boolean isDppp){
         float importe;
         int dto = 0;
         importe=objetoProducto.getPrecioVenta() *u;
         if (isDv)
         {
             dto=dto + DTOPP;
         }
         if (isDppp)
         {
            dto=dto + DTOV;
         }
         importe=importe * (100 - dto)/100;
         return importe;
     }
     public static void venta(int u, String nombreCliente)
     {       
        objetoProducto.venderUnidades(u);
        // Cliente
        int x = 0;
        for(x = 0; x < lClientes.size() && lClientes.get(x).getNombre().compareToIgnoreCase(nombreCliente) != 0;x++);
        if (x == lClientes.size())
        {
            // Cliente nuevo
            objetoCliente = new Cliente(nombreCliente);
            objetoCliente.setProducto(objetoProducto);
            lClientes.add(objetoCliente);
        }
        else
        {
            // Ya existe. Añadimos el producto si es necesario.
            objetoCliente = lClientes.get(x);
            if (objetoCliente.getListaProductos().contains(objetoProducto) == false)
                objetoCliente.getListaProductos().add(objetoProducto);
            
        }
        
     }
     
     public static boolean hayUnidades(int u)
     {
          if (u > objetoProducto.getUnidades())
             return false;
          return true;
     }
    
}

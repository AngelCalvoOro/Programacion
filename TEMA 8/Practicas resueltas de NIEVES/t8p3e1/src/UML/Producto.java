package UML;

import java.util.ArrayList;

public class Producto {
    //Atributos
    private String nombre;
    private Integer unidades;
    private Float precioUnitario;
    
    private ArrayList<Proveedor> listaProveedores;
  

    public ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(Proveedor p) {
        this.listaProveedores.add(p);
    }

    public Producto(String n, Integer u, Float p){
        this.nombre = n;
        this.unidades = u;
        this.precioUnitario = p;
        listaProveedores = new ArrayList();
    }


    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }

    public void setUnidades(Integer u){
       unidades = u;
    }
    
    public void comprarUnidades(Integer u,Float p)
    {
        setNuevoPrecio(u,p);
        unidades = unidades + u;
        
    }
    
    public void venderUnidades(Integer u)
    {
        unidades = unidades - u;
    }
    
    public Integer getUnidades(){
        return unidades;
    }

    public void setPrecioUnitario(Float p){
        precioUnitario = p;
    }

    public void setNuevoPrecio(int unidades, float p){
        precioUnitario =((this.unidades * this.precioUnitario) + (unidades * p))/(this.unidades + unidades);
    }
    
    public Float getPrecio(){
        return precioUnitario;
    }
    
    public Float getPrecioVenta(){
        return precioUnitario * 2;
    }
    
}

package UML;

public class Producto {
    private String nombre;
    private float precio;
    private int unidades;

    public Producto(String nombre, float precio, int unidades) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    @Override
    public String toString(){
        return nombre + "  " + precio + "  " + unidades + "\n";
    }
}

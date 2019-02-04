
package UML;

public class Hijo {
    private String nombre;
    private String fecha;
    // private Date fecha
   

    public Hijo(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

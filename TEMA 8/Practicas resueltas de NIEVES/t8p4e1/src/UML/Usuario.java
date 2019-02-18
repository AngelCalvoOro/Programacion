package UML;

public class Usuario {
    //Usuario que puede utilizar la aplicación
    //Atributos
    private String nombre;
    private String contraseña;

    //Métodos
    public Usuario(){}

   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    @Override
    public String toString(){
        return nombre + " \n" + contraseña;
    }
}

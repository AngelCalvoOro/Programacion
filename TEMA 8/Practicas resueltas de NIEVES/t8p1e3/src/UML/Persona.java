package UML;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private Curso c;

    public Persona(String dni, String nombre, String apellidos,Curso c) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        setC(c);
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Curso getC() {
        return c;
    }

    public void setC(Curso c) {
        this.c = c;
        // bidireccionalidad
        this.c.setListaAlumnos(this);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

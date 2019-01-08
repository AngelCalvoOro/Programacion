package lista_clases;

public class Piloto {
    private String codigo_piloto;
    private String nombre;
    private String apellido;
    private Integer numero_licencia;

    public Piloto(String codigo_piloto, String nombre, String apellido, Integer numero_licencia) {
        this.codigo_piloto = codigo_piloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_licencia = numero_licencia;
    }

    public String getCodigo_piloto() {
        return codigo_piloto;
    }

    public void setCodigo_piloto(String codigo_piloto) {
        this.codigo_piloto = codigo_piloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumero_licencia() {
        return numero_licencia;
    }

    public void setNumero_licencia(Integer numero_licencia) {
        this.numero_licencia = numero_licencia;
    }
    
    public void agregar_nuevo(){
        
    }
    public void asignar_vuelo(){
        
    }
    public void cancelar_vuelo(){
        
    }
    public void modificar(){
        
    }
    public Piloto buscar(){
        return null;
    }
}

package lista_clases;

class Ciudad {
    private String codigo_ciudad;
    private String nombre;

    public Ciudad(String codigo_ciudad, String nombre) {
        this.codigo_ciudad = codigo_ciudad;
        this.nombre = nombre;
    }

    public String getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(String codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregar_nuevo(){
        
    }
    public Ciudad obtener(){
        return null;
        
    }
}

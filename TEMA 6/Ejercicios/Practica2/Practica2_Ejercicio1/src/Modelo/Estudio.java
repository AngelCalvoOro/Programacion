package Modelo;


public class Estudio {
    
    private String nombre;
    private String ciudad;
    private String direccion;
    private String dirWeb;
    private String fechaFun;
    private String pais;
    private String telefonos;

    public Estudio(String nombre, String ciudad, String direccion, String dirWeb, String fechaFun, String pais, String telefonos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirWeb = dirWeb;
        this.fechaFun = fechaFun;
        this.pais = pais;
        this.telefonos = telefonos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public String getFechaFun() {
        return fechaFun;
    }

    public void setFechaFun(String fechaFun) {
        this.fechaFun = fechaFun;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }
    
    
}

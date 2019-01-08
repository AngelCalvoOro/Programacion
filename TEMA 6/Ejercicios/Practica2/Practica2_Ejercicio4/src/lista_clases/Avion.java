package lista_clases;

public class Avion {
    private String aerolinea;
    private String codigo_avion;
    private int numero_asientos;
    private String compartimentos;

    public Avion(String aerolinea, String codigo_avion, int numero_asientos, String compartimentos) {
        this.aerolinea = aerolinea;
        this.codigo_avion = codigo_avion;
        this.numero_asientos = numero_asientos;
        this.compartimentos = compartimentos;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCodigo_avion() {
        return codigo_avion;
    }

    public void setCodigo_avion(String codigo_avion) {
        this.codigo_avion = codigo_avion;
    }

    public int getNumero_asientos() {
        return numero_asientos;
    }

    public void setNumero_asientos(int numero_asientos) {
        this.numero_asientos = numero_asientos;
    }

    public String getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(String compartimentos) {
        this.compartimentos = compartimentos;
    }
    
    public void asignar_vuelo(){
        
    }
    public Avion obtener(){
        return null;
    }
    public void cancelar_vuelo(){
        
    }
}

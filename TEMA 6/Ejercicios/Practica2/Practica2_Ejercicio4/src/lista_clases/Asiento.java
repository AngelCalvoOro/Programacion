package lista_clases;

public class Asiento {
    private int numero_asiento;
    private boolean estado;
    private String compartimento;

    public Asiento(int numero_asiento, boolean estado, String compartimento) {
        this.numero_asiento = numero_asiento;
        this.estado = estado;
        this.compartimento = compartimento;
    }

    public int getNumero_asiento() {
        return numero_asiento;
    }

    public void setNumero_asiento(int numero_asiento) {
        this.numero_asiento = numero_asiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }
    
    public void reservar(){
        
    }
    public void comprar(){
        
    }
    public boolean mostrar_disponibilidad(){
        return false;
    }
    public void desbloquear(){
        
    }
}

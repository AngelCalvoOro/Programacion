
package Excepciones;

public class DatoObligatorio extends Exception {
    private int numero;

    public DatoObligatorio() {
    }

    public DatoObligatorio(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}

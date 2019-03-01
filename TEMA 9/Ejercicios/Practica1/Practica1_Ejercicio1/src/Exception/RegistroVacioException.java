
package Exception;


public class RegistroVacioException extends Exception {
    private int numero;
    
    public RegistroVacioException(int numero) {
        this.numero=numero;
    }
    public String getMessage(){
        String mensaje=null;
        switch(numero)
        {
            case 1: mensaje = "El nombre es un campo obligatorio";
                break;
            case 2: mensaje = "La edad es un campo obligatorio";
                break;
            case 3: mensaje = "La profesión es un campo obligatorio";
                break;
            case 4: mensaje = "El teléfono es un campo obligatorio";
                break;
            case 5: mensaje = "Indica una opción";
                break;
        }
        return mensaje;
    }
}

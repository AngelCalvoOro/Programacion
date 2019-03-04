
package Exception;


public class FormatoException extends Exception {
    private int numero;
    
    public FormatoException(int numero) {
        this.numero=numero;
    }
    public String getMessage(){
        String mensaje=null;
        switch(numero)
        {
            case 1: mensaje = "El formato del nombre es erroneo.";
                break;
            case 2: mensaje = "La formato de la edad el erroneo. \n Solo son validos 2 valores numericos. ";
                break;
            case 3: mensaje = "El formato de la profesión es erroneo.";
                break;
            case 4: mensaje = "El formato del telefono es erroneo. \n Solo son validos 9 valores numericos.";
                break;
        }
        return mensaje;
    }
}

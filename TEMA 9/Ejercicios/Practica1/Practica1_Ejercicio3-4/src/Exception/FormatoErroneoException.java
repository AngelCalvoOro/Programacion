
package Exception;


public class FormatoErroneoException  extends Exception{
    private int numero;

    public FormatoErroneoException(int numero) {
        this.numero=numero;
    }
    public String getMessage(){
        String mensaje=null;
        switch(numero)
        {
            case 1: mensaje = "El formato del nombre es erroneo.";
                break;
            case 2: mensaje = "El formato de max de personas es erroneo.";
                break;
        }
        return mensaje;
    }
}


package Exception;


public class EventoVacionException extends Exception {
    private int numero;
    
    public EventoVacionException (int numero) {
        this.numero=numero;
    }
    public String getMessage(){
        String mensaje=null;
        switch(numero){
            case 1:mensaje= "Es obligatorio el nombre del evento.";
                break;
            case 2: mensaje = "Es obligatorio un lugar para el evento.";
                break;
            case 3: mensaje = "Es obligatorio indicar la fecha del evento.";
                break;
            case 4: mensaje ="Es obligatorio indicar la hora de inicio del evento.";
                break;
            case 5: mensaje ="Es obligatorio indicar la hora final del evento.";
                break;
            case 6: mensaje ="Es obligatorio indicar la cantidad de personas maxima del evento.";
                break;
        }
        return mensaje;
    }
}

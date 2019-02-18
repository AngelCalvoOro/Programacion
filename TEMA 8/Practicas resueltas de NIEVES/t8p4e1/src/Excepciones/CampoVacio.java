package Excepciones;

public class CampoVacio extends Exception{
    private String campo;

    // Constructor sobrecargado
    public CampoVacio(){}

    public CampoVacio(String campo){
        this.campo = campo;
    }

    @Override
    public String getMessage(){
        // switch
        if (campo.compareTo("Dni")==0)
            return "El DNI es un campo obligatorio y debe tener formato 99.999.999-L";
        else
            if (campo.compareTo("Nss")==0)
                return "El número de la seguridad social es un campo obligatorio y debe tener formato 00/0000/00";
            else
                if (campo.compareTo("Nombre")==0)
                    return "El nombre y los apellidos son obligatorios";
                else
                    if (campo.compareTo("Direccion")==0)
                        return "La dirección es un campo obligatorio";
                    else
                        if (campo.compareTo("Telefono")==0)
                           return "El teléfono es un campo obligatorio";
                        else
                           if (campo.compareTo("Sexo")==0)
                                return "Hay que indicar si es hombre o mujer";
                           else
                                if (campo.compareTo("Estado")==0)
                                     return "Hay que indicar el estado civil";
                                else
                                    if (campo.compareTo("Contrato")==0)
                                           return "Hay que indicar el tipo de contrato";
                                    else
                                        if (campo.compareTo("Departamento")==0)
                                             return "Hay que indicar el departamento";
                                        else
                                           // fecha
                                           return "La fecha de alta es obligatoria";

}
}

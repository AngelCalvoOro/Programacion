package t8p4e1;

import UML.*;
import java.util.ArrayList;
import Vista.*;
import java.time.LocalDate;
import javax.swing.JComboBox;
import java.util.Random;

public class Main {
    // "Base de datos" Variables globales
    
    private static Departamento aDepartamento[];
    private static Contrato aContrato[];
    private static ArrayList<Persona> aPersona;
    
    // objeto concreto sobre el que estamos trabajando
    private static Persona oPersona;
    
    // Alta, modificación o baja
    private static String operacion;

    
    public static void main(String[] args) {
       //generar Datos
        generarDatos();

        // Como son muchos elementos, creo un controlador de vista.
        ControladorVista.empezar();
        
    }

    public static void generarDatos(){
        //Contratos
        aContrato = new Contrato[2];
        aContrato[0] = new Contrato();
        aContrato[0].setDescripcion("Relevo");
        aContrato[1] = new Contrato();
        aContrato[1].setDescripcion("Indefinido");

        //Departamentos
        aDepartamento = new Departamento[3];
        aDepartamento[0] = new Departamento();
        aDepartamento[0].setNombre("Gestión");
        aDepartamento[1] = new Departamento();
        aDepartamento[1].setNombre("Informática");
        aDepartamento[2] = new Departamento();
        aDepartamento[2].setNombre("Producción");


        //Algún trabajador del departamento de gestión del personal
        aPersona = new ArrayList<Persona>();
        
        oPersona = new Persona();
        aPersona.add(oPersona);

        oPersona.setDni("11.111.111Y");
        oPersona.setNss("11/1111/11");
        oPersona.setNombreApellidos("NUno AUno");
        oPersona.setDireccion("c/Uno");
        oPersona.setTelefono("11111111");
        oPersona.setSexo('V');
        oPersona.setEstadoCivil('S');
        oPersona.setC(aContrato[0]);
        oPersona.setD(aDepartamento[0]);
        oPersona.setFechaAlta(LocalDate.of(2001, 10 , 1));
        oPersona.setNumeroEmpleado("0001");
        // Usuario para utilizar la aplicación
        oPersona.setU(new Usuario());
        oPersona.getU().setNombre("a");
        oPersona.getU().setContraseña("a");
    }
    
    public static void terminar(){
        // Finaliza la ejecución del proyecto
        System.exit(0);
    }

    public static boolean identificar(String usuario,String contraseña){
        // Comprobamos si el username y password tecleados son correctos.
        boolean usuarioValido = false;
        int x;
        for(x=0; x < aPersona.size() && usuarioValido == false; x++)
            if (aPersona.get(x).getU() != null)
                if (aPersona.get(x).getU().getNombre().compareToIgnoreCase(usuario)== 0 && aPersona.get(x).getU().getContraseña().compareTo(contraseña)== 0)
                {
                    usuarioValido = true;
                    oPersona = aPersona.get(x);
                }
      
               
        return usuarioValido;
        // Con try catch(NullPointerException) también se podría plantear
    }
   
    public static void identificarOperacion(String ope){
        // Guardar la operación que hay que realizar
        // Alta, baja o modificación
        operacion = ope;
    }
    
    public static String getOperacion(){
        return operacion;
    }
    
    public static void llenarContratos(JComboBox contratos){
        // Llenar la lista desplegable con la descripción de los contratos
        for(int x = 0; x < aContrato.length; x++)
            contratos.insertItemAt(aContrato[x].getDescripcion(), x);

    }
    
    public static void llenarDepartamentos(JComboBox departamentos)
    {
        // LLenar la combobox con el nombre de los departamentos
        for(int x = 0; x < aDepartamento.length ;x++)
            departamentos.insertItemAt(aDepartamento[x].toString(), x);
    }

    public static boolean validarDni(String dni){
       //Si encontramos una persona con este Dni devuelvo true
        int x;
        for(x=0; x < aPersona.size() && aPersona.get(x).getDni().compareTo(dni) != 0; x++){}
        if (x == aPersona.size())
            return false;
        return true;
    }

    public static boolean validarNss(String nss){
       //Si encontramos una persona con este número de la seguridad social devuelvo true
        int x;
        for(x=0; x < aPersona.size() && aPersona.get(x).getNss().compareTo(nss) != 0; x++){}
        return x != aPersona.size();
    }

    public static String altaPersona(String d, String nss, String na, String dir, String t, Character s, Character ec, int contrato, int dpto, LocalDate f)throws Exception{
        //Dar de alta una persona a partir de los datos tecleados en la ventana
        oPersona = new Persona();

        oPersona.setDni(d);
        oPersona.setNss(nss);
        oPersona.setNombreApellidos(na);
        oPersona.setDireccion(dir);
        oPersona.setTelefono(t);
        oPersona.setSexo(s);
        oPersona.setEstadoCivil(ec);
        oPersona.setC(aContrato[contrato]);
        oPersona.setD(aDepartamento[dpto]);
        // bidireccionalidad "escondida"
        oPersona.setFechaAlta(f);
        oPersona.setNumeroEmpleado(Main.generarNumeroEmpleado());

        aPersona.add(oPersona);
        
        // Usuario informático???
        if (oPersona.getD().getNombre().compareToIgnoreCase("Gestión")== 0)
            Main.asignarUsuarioContraseña();

        return oPersona.getNumeroEmpleado();

    }

    public static String generarNumeroEmpleado() throws Exception{
       // Generamos de manera aleatorio el código del empleado
        Random r = new Random();
        String nEmpleado;
        int x;
       //Genero el número
        do{
            nEmpleado="";
            for(x = 0; x < 4; x++)
            {
                nEmpleado = nEmpleado + r.nextInt(9);
            }
            //Compruebo que no esta repetido
            for(x = 0; x < aPersona.size() && aPersona.get(x).getNumeroEmpleado().compareTo(nEmpleado)!= 0; x++){}

        }while (x != aPersona.size());

        return nEmpleado;
        
        // También podría ser secuencial
        // aPersona.get(aPersona.size() -1 ).getNumeroEmpleado() + 1;
    }

    public static void asignarUsuarioContraseña()throws Exception{
        //Genera usuario y contraseña para el nuevo empleado del departamento de gestion
        //Devuelve los datos a la ventana para que el usuario los vea.
        Random r = new Random();
        String contraseña;
        String nombre;
        int x;
        boolean encontrado;

        Usuario u = new Usuario();

        //Genero el nombre con los cuatro primeros caracteres del nombre y dos números
        if (oPersona.getNombreApellidos().length() >= 4)
            nombre=oPersona.getNombreApellidos().substring(0,4);
        else
            nombre="abcd";
        
        // Los dos números
        do
        {
            for(x = 0; x < 2; x++)
            {
                    nombre = nombre + r.nextInt(9);
            }
            //Compruebo que no está repetido
            encontrado = false;
            for(x = 0; x < aPersona.size() && encontrado == false; x++)
            {
                if (aPersona.get(x).getU()!= null)
                    if (aPersona.get(x).getU().getNombre().compareTo(nombre)== 0)
                        encontrado = true;
            }
        }while (encontrado);

        u.setNombre(nombre);

        //Genero la contraseña con los dos primeros caracteres de la dirección y dos números
        if (oPersona.getDireccion().length()>=2)
            contraseña = oPersona.getDireccion().substring(0, 2);
        else
            contraseña = "ab";
        
        for(x = 0; x < 2; x++)
        {
                    contraseña = contraseña + r.nextInt(9);
        }
        u.setContraseña(contraseña);

        //Relación con persona
        oPersona.setU(u);

        
    }
   
    public static String getNombreContraseña(){
        // Devuelve los datos del usuario informático cuando hacemos un alta para que se sepa cuales son.
        return oPersona.getU().toString();
        
    }

    public static String modificarPersona(String na, String dir, String t, Character s, Character ec, int contrato, int dpto, LocalDate f){
        String mensaje="";
        try
        {
            //Modificamos los datos de una persona a partir de los datos tecleados en la ventana
            oPersona.setNombreApellidos(na);
            oPersona.setDireccion(dir);
            oPersona.setTelefono(t);
            oPersona.setSexo(s);
            oPersona.setEstadoCivil(ec);
            oPersona.setC(aContrato[contrato]);
            //Si ha cambiado de departamento tendremos que tener en cuenta lo del usuario informático
            // También lo de la bidireccionalidad
            if (oPersona.getD().getNombre().compareTo(aDepartamento[dpto].getNombre())!= 0)
            {   
                //Si antes era de gestión le quito el usuario
                if (oPersona.getD().getNombre().compareTo("Gestión")== 0)
                {   
                    oPersona.setU(null);
                    mensaje = "Ya no eres del departamento de gestión";
                }
                 //Si ahora es del departamento de gestión, pongo el usuario informático
                if (aDepartamento[dpto].getNombre().compareTo("Gestión")==0)
                {
                    asignarUsuarioContraseña();
                    mensaje = getNombreContraseña();
                }

                oPersona.getD().eliminarEmpleado(oPersona);
                oPersona.setD(aDepartamento[dpto]);
        }
        
        oPersona.setFechaAlta(f);
        mensaje = mensaje + "\n" + "Datos modificados";
     }
     catch(Exception e){
         mensaje = e.getMessage();
     }
     finally{
         return mensaje;
     }
    }

    public static boolean bajaPersona(){
        try{
            // Bidireccionalidad
            oPersona.getD().eliminarEmpleado(oPersona);
            aPersona.remove(oPersona);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public static String getNombreUsuario(){
        return oPersona.getNombreApellidos();
    }
    
    public static boolean validarNumeroEmpleado(String ne){
        int x;
        for(x=0; x < aPersona.size() && aPersona.get(x).getNumeroEmpleado().compareTo(ne)!= 0;x++){}
        if (x == aPersona.size())
            return false;
        oPersona = aPersona.get(x);
        return true;
    }

    /* Métodos a través de los cuales se pasan los datos a la ventana
    para que los muestre en el caso de la baja y de la modificación */
    
    public static String getDni(){
        return oPersona.getDni();
    }
    public static String getNss(){
        return oPersona.getNss();
    }
    public static String getNombreApellidos(){
        return oPersona.getNombreApellidos();
    }
    public static String getDireccion(){
        return oPersona.getDireccion();
    }
    public static String getTelefono(){
        return oPersona.getTelefono();
    }
    public static Character getSexo(){
        return oPersona.getSexo();
    }
    public static Character getEstadoCivil(){
        return oPersona.getEstadoCivil();
    }
    public static String getDescripcion(){
        return oPersona.getC().getDescripcion();
    }
    public static String getNombre(){
        return oPersona.getD().getNombre();
    }
    public static LocalDate getFechaAlta(){
        return oPersona.getFechaAlta();
    }
    public static String getNumeroEmpleado(){
        return oPersona.getNumeroEmpleado();
    }
    // Fin de métodos para mostrar datos
    
    // Métodos para los listados
    public static String getDatosEmpleado(){
        // La función añadir nos da en un stri
        return oPersona.toString();
    }
    
    public static String generarDatosListado(String tipo, int indice){
        String datos="";

        if (tipo.compareTo("contratos")== 0)
        {
            for(int x=0; x < aPersona.size();x++)
            {
                if (aPersona.get(x).getC()== aContrato[indice])
                {
                    datos = datos + aPersona.get(x).toString();
                }
            }
        }
        else
        {
            // Departamentos (Utilizo la bidireccionalidad)
            // También se puede hacer desde aPersona igual que los contratos
            for(int x=0; x < aDepartamento[indice].getListaPersonas().size();x++)
            {
                datos = datos + aDepartamento[indice].getListaPersonas().get(x).toString();
            }
        }
        if (datos.compareTo("")==0)
            datos = "No hay elementos que mostrar";
        return datos;
    }

    public static String añadir(){
        String datos = "DNI: " + oPersona.getDni();
        datos += "  " + "NSS: " + oPersona.getNss() + "\n";
        datos += "Nombre y apellidos: " + oPersona.getNombreApellidos() + "\n";
        datos += "Dirección: " + oPersona.getDireccion() + "\n";
        datos += "Telefono: " + oPersona.getTelefono() + "\n";
        datos += "Sexo: " + oPersona.getSexo();
        datos += "  " + "Estado civil: " + oPersona.getEstadoCivil() + "\n";
        datos += "Contrato: " + oPersona.getC().getDescripcion() + "\n";
        datos += "Departamento: " + oPersona.getD().getNombre() + "\n";
        if (oPersona.getU() != null)
        {
            datos += "\t" + "Usuario: " + oPersona.getU().getNombre();
            datos += "\t" + "Contraseña: " + oPersona.getU().getContraseña() + "\n";
        }

        datos += "Fecha de alta: " + oPersona.getFechaAlta() + "\n";
        datos += "Número del empleado: " + oPersona.getNumeroEmpleado() + "\n \n";
        return datos;
    }

}

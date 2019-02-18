/*
1º-Si en la seccion de formulario estaria bien crear una variable de tipo trabajador para pasar los datos por ello 
o pasar cada dato por del formulario. 
NO. HACERLO COMO ELLA DICE Y FUERA SOLO PORQUE ES EL EXAMEN
2º-LOS ID DE CONTRATO Y DEPARTAMENTO NO SON NECESARIOS.

*/
package practica4_ejercicio1;

import ventana.*;
import clase.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Practica4_Ejercicio1 {
    private static Inicio vI;
    private static VentanaPrincipal vP;
    private static Formulario vF;
    private static ArrayList<Usuario> listaUsuarios;
    private static ArrayList<Trabajador> listaTrabajadores;
    private static ArrayList<Contrato> listaContratos;
    private static ArrayList<Departamento> listaDepartamentos;
    public static void main(String[] args) {
        //creacion de base de datos
        generarContenido();
        //creacion y inicio de ventana Inicio
        vI = new Inicio();
        vI.setVisible(true);
    }
    private static void generarContenido(){
        //creacion de lista Array Contratos y Departamentos
        listaContratos= new ArrayList<Contrato>();
        
        Contrato c1 =new Contrato ("1","Indefinido");
        listaContratos.add(c1);
        Contrato c2 =new Contrato ("2","Formativo");
        listaContratos.add(c2);
        Contrato c3 =new Contrato ("3","Discontinuo");
        listaContratos.add(c3);
        Contrato c4=new Contrato ("4","Fijo");
        listaContratos.add(c4);
        
        listaDepartamentos =new ArrayList<Departamento>();
        Departamento d1 = new Departamento ("Informatica", "1");
        listaDepartamentos.add(d1);
        Departamento d2 =new Departamento ("Mantenimiento", "2");
        listaDepartamentos.add(d2);
        Departamento d3 =new Departamento ("Gestion", "3");
        listaDepartamentos.add(d3);

        //creacion de lista Array personal y sus datos
        listaTrabajadores = new ArrayList<Trabajador>();
        Trabajador t1 =new Trabajador ("1234567S","111111111","Paco","Fernandez","C/ mario Nº53","667579471","H","S",LocalDate.of(1994,3,23),"1",d1,c4);
        d1.setTrabajador(t1);
        c4.setTrabajador(t1);
        listaTrabajadores.add(t1);
        Trabajador t2 =new Trabajador ("4581235S","222222222","Mario","Pescado","C/ wo Nº23","667579472","H","C", LocalDate.of(1994,4,23),"2",d2,c4);
        d2.setTrabajador(t2);
        c4.setTrabajador(t2);
        listaTrabajadores.add(t2);
        Trabajador t3 =new Trabajador ("1234562S","333333333","Sofia","Wololo","C/ Mar Nº55","667579421","M","C",LocalDate.of(1996,3,23),"3",d3,c4);
        d3.setTrabajador(t3);
        c4.setTrabajador(t3);
        listaTrabajadores.add(t3);
        Trabajador t4 =new Trabajador ("1234566S","444444444","Prueba","Prueba","C/ prueba Nº1","667000000","M","C",LocalDate.of(1996,3,23),"4",d3,c4);
        d3.setTrabajador(t4);
        c4.setTrabajador(t4);
        listaTrabajadores.add(t4);
       
        
        //creacion de lista Array Usuarios y sus datos
        listaUsuarios = new ArrayList<Usuario>();
        
        listaUsuarios.add(new Usuario ("u1","1",t1));
        listaUsuarios.add(new Usuario ("usuario2","22222",t2));
        listaUsuarios.add(new Usuario ("usuario3","33333",t3));
        
    }
    public static void cierreyFin(){
        vI.dispose();
        System.exit(0);
    }

    public static int validarUsuario(String nombre, String contrasena, int contador) {
        int x;
        for (x = 0; x < listaUsuarios.size() && !(listaUsuarios.get(x).getNombre().equals(nombre) && listaUsuarios.get(x).getContrasena().equals(contrasena)); x++) {}
        if (listaUsuarios.size() == x) {
            contador++;
            if (contador>3) {
                JOptionPane.showMessageDialog(null, "HAS SUPERADO EL LIMITE DE INTENTOS.");
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "El usuario indicado no existe");
        }
        else{
                vI.dispose();
                vP = new VentanaPrincipal(listaUsuarios.get(x));
                vP.setVisible(true);
        }
        
        return contador;
    }

    public static void goToFormulario() {
        vP.dispose();
        vF = new Formulario();
        vF.setVisible(true);
    }
    public static void goToFormularioModificacion() {
         boolean confirmacion = true;
          do{  
            int i;
           
            String idEmpleado = JOptionPane.showInputDialog(null, "Indique el Nº de empleado que desea modificar.");
            for (i = 0; i < listaTrabajadores.size() && !listaTrabajadores.get(i).getN_emple().equals(idEmpleado); i++) {}
            if (listaTrabajadores.size() == i) {
                JOptionPane.showMessageDialog(null, "El Nº de empleado indicado no existe");
                confirmacion = false;
            }
            else{
                confirmacion = true;
         
                vP.dispose();
                vF = new Formulario(listaTrabajadores.get(i));
                vF.setVisible(true);
            }
          }
         while(confirmacion == false);
       
        
    }
    public static void darbaja() {
        int i = -1;
        String numero_emple= JOptionPane.showInputDialog(null,"Añada el numero de empleado a eliminar");
        int confirmar = JOptionPane.showConfirmDialog(null,"¿Seguro que quiere eliminar este empleado?");
        if (confirmar == 0) {
            for (i = 0; i < listaTrabajadores.size() && !listaTrabajadores.get(i).getN_emple().equals(numero_emple); i++) {}
            if (listaTrabajadores.size() == i) {
                JOptionPane.showMessageDialog(null, "El Nº de empleado indicado no existe");
            }
            else{
                
                listaTrabajadores.get(i).getContrato().getListaTrabajadores().remove(listaTrabajadores.get(i));
                listaTrabajadores.get(i).getDepartamento().getListaTrabajadores().remove(listaTrabajadores.get(i));
                listaTrabajadores.remove(i);
            }
        }
        else{
            
        }
        
    }
    public static void returnToVentanaPrincipal(){
        vF.dispose();
        vP.setVisible(true);
    }
    
    public static ArrayList<Departamento> dameDepartamentos(){
        return listaDepartamentos;
    }
    
    public static ArrayList<Contrato> dameContratos(){
        return listaContratos;
    }
   
    public static void altatrabajador(String dni,String nss,String nombre,String apellido,String direccion,String telefono,String fechaAlta,int departamento,int contrato,String sexo,String estadocivil){
        Trabajador tnew = new Trabajador();
        tnew.setDni(dni);
        tnew.setNss(nss);
        tnew.setNombre(nombre);
        tnew.setApellido(apellido);
        tnew.setDireccion(direccion);
        tnew.setTelefono(telefono);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        tnew.setFechaAlta(LocalDate.parse(fechaAlta, formatter));
        
        tnew.setDepartamento(listaDepartamentos.get(departamento));
        tnew.setContrato(listaContratos.get(contrato));
        
        tnew.setSexo(sexo);
        tnew.setEstadoCivil(estadocivil);
        
        tnew.setN_emple(String.valueOf(dameUltimoNumEmple()));
        
        //relacion bidireccional
        listaDepartamentos.get(departamento).setTrabajador(tnew);
        listaContratos.get(contrato).setTrabajador(tnew);
        
        listaTrabajadores.add(tnew);
    }
    
    public static void modificartrabajador(String dni,String nss,String nombre,String apellido,String direccion,String telefono,String fechaAlta,int departamento,int contrato,String sexo,String estadocivil, String n_emple){
        Trabajador tnew = new Trabajador();
        tnew.setDni(dni);
        tnew.setNss(nss);
        tnew.setNombre(nombre);
        tnew.setApellido(apellido);
        tnew.setDireccion(direccion);
        tnew.setTelefono(telefono);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        tnew.setFechaAlta(LocalDate.parse(fechaAlta, formatter));
        
        tnew.setDepartamento(listaDepartamentos.get(departamento));
        tnew.setContrato(listaContratos.get(contrato));
        
        tnew.setSexo(sexo);
        tnew.setEstadoCivil(estadocivil);
        
        tnew.setN_emple(n_emple);
        
        
        int i = -1;
        for (i = 0; i < listaTrabajadores.size() && !listaTrabajadores.get(i).getN_emple().equals(n_emple); i++) {}
        if (i == listaTrabajadores.size()) {
            JOptionPane.showMessageDialog(null, "algo esta mal");
        }
        else{
            listaTrabajadores.remove(i);
            listaTrabajadores.add(i,tnew);
            
            //relacion bidireccional
            listaDepartamentos.get(departamento).deleteTrabajador(listaTrabajadores.get(i));
            listaDepartamentos.get(departamento).setTrabajador(tnew);
            listaContratos.get(contrato).deleteTrabajador(listaTrabajadores.get(i));
            listaContratos.get(contrato).setTrabajador(tnew);
        }
        
    }
    
    public static int dameUltimoNumEmple(){
        int num = -1;
        for (int x = 0; x < listaTrabajadores.size(); x++) {
            if(num<Integer.parseInt(listaTrabajadores.get(x).getN_emple())){
                num = Integer.parseInt(listaTrabajadores.get(x).getN_emple());
            }
        }
        return num + 1;
    }
}

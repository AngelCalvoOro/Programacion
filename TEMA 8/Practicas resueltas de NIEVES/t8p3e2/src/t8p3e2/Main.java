package t8p3e2;

import UML.*;
import java.util.ArrayList;
import GUI.*;


public class Main {
    // "Base de datos "
    // Lista de socios tanto individuales como familiares
    private static ArrayList<Socio> listaSocios;
    
    private static SocioFamiliar sf;
    private static SocioIndividual si;
    
    // No he retocado el setListaHijos por lo que he de pasar todo el arrayList
    // Hay que crearlo por socio.
    private static ArrayList<Hijo> listaHijos;
   
    private static Ventana v;
    
    public static void main(String[] args) {
        listaSocios = new ArrayList<Socio>();
        
        v = new Ventana();
        v.setVisible(true);
    }
    
    public static void crearListaHijos(){
        listaHijos = new ArrayList<Hijo>();
    }
    
    public static void añadirHijo(String n,String f){
        listaHijos.add(new Hijo(n,f));
        
    }
    
    public static void inscripcionIndividual(String n,String a, String t, String c)throws Exception{
        si = new SocioIndividual(n,a,t,c);
        listaSocios.add(si);
        
    }
    public static void inscripcionFamiliar(String n,String a, String t, String c)throws Exception{
        sf = new SocioFamiliar(n,a,t,c);
        sf.setListaHijos(listaHijos);
        listaSocios.add(sf);
        
    }
    
    public static String generaListado(){
        String listado = "Datos de los socios inscritos \n";
        for(int x = 0; x < listaSocios.size();x++){
            try
            {
                sf = (SocioFamiliar) listaSocios.get(x);
                listado += sf.getNombre()+ " " + sf.getApellidos()+ " " +sf.getTelefono()+ " " +sf.getCorreo()+ "\n " ;
                listado += "Hijos \n" ;
                for (int y = 0; y < sf.getListaHijos().size();y++)
                    listado += sf.getListaHijos().get(y).getNombre() + " " + sf.getListaHijos().get(y).getFecha() + "\n";
            }
            catch(ClassCastException e){
                 si = (SocioIndividual) listaSocios.get(x);
                 listado += si.getNombre()+ " " + si.getApellidos()+ " " +si.getTelefono() + " "+si.getCorreo() + "\n";
            }
            catch(Exception e)
            {
                listado = "Problemas generando el listado";
            }
        }
        return listado;
    }
    
    public static void inicializar()throws Exception{
        v.dispose();
        v = new Ventana();
        v.setVisible(true);
    }
}

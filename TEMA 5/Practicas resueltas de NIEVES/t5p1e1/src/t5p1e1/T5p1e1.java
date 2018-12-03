
package t5p1e1;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import Excepciones.*;
import java.util.Iterator;

public class T5p1e1 {

    // Variables globales
    private static ArrayList<Double> lista;
    private static double sumaTotal=0;
     
    public static void main(String[] args) {
        try
        {
            lista = new ArrayList();
            llenar();
            mostrarMenu();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas: " + e.getMessage());
        }
    }
    
    public static void llenar() throws Exception{
        do{
            // Añadimos elememtos al arrayList
            lista.add(pedirNumero());
        }
        while(JOptionPane.showConfirmDialog(null,"¿Quieres continuar introduciendo números en el arrayList (s/n)?")==0);
    }
    
    public static Double pedirNumero() throws Exception{
        double numero=0;
        boolean correcto;
        do
        {
            try
            {
                numero = Double.parseDouble(JOptionPane.showInputDialog("Teclea el número"));
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"El dato tecleado no es válido");
                correcto = false;
            }
        }
        while(!correcto);
        return numero;
       
    }
    
    public static void mostrarMenu()throws Exception{
        int opcion = 0;
        do{
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Indica la operación que deseas realizar: \n "
                        + "1.-Visualizar máximo y mínimo \n "
                        + "2.- Buscar un número \n"
                        + "3.- Borrar un número \n"
                        + "4.- Convertir en un array \n"
                        + "5.- Mostrar el numero de elementos que contiene. ´\n" 
                        + "6.- Inserta un nuevo elemento por el ﬁnal.\n" 
                        + "7.- Inserta un nuevo numero en una posición concreta \n" 
                        + "8.- Borra un elemento de una posicion concreta. \n"
                        + "9.- Calcular la suma y la media aritmética de los valores contenido. \n"
                        + "10.- Fin"));
                switch(opcion)
                {
                    case 1:
                        f1();
                        break;
                     case 2:
                        f2();
                        break;   
                     case 3:
                        f3();
                        break;
                     case 4:
                        f4();
                        break;
                     case 5:
                        f5();
                        break;
                    case 6:
                       f6();
                       break;
                    case 7:
                       f7();
                       break;
                    case 8:
                       f8();
                       break;
                    case 9:
                        f9();
                       break;
                    case 10:
                        break;
                    default:
                        throw new OpcionNoValida();
                 }
            }
            catch(NumberFormatException e)
            {
                    JOptionPane.showMessageDialog(null,"Opción no válida. Necesitamos un número.");
            }
            catch(OpcionNoValida e)
            {
                    JOptionPane.showMessageDialog(null,"Opción no válida. Necesitamos un número del 1 al 10");
            }
        }
        while(opcion!= 10);
    }
   
    public static void f1() throws Exception{
	// Visualizar maximo y minimo
        
        // Primera forma
        // Inicializaciones
        double maximo = lista.get(0);
        int posicionMaximo = 0;
        double minimo = lista.get(0);
        int posicionMinimo = 0;
        
        // proceso
        for(int x = 1; x < lista.size(); x++)
        {
            if (lista.get(x) > maximo)
            {
              maximo = lista.get(x);
              posicionMaximo = x;
            }
            else
                if (lista.get(x) < minimo)
                {
                    minimo = lista.get(x);
                    posicionMinimo = x;
                }
        }
        
        JOptionPane.showMessageDialog(null, visualizar() + "\nEl máximo es " + maximo + 
                " y se encuentra en la posición " + posicionMaximo + 
                "\n El mínimo es " + minimo + " y se encuentra en la posición " 
                + posicionMinimo);
        
        // Segunda forma
        System.out.println("El número mayor del conjunto es... " + Collections.max(lista));
        System.out.println("El número menor del conjunto es... "  + Collections.min(lista));
    }
    
    public static String visualizar(){
         String datos="";
        // for (int x = 0; x < lista.size(); x++)
               
          for (Double elemento : lista) 
             datos += elemento + " ";
          
          // datos = lista.stream().map((elemento) -> elemento + " ").reduce(datos, String::concat);
          
         return datos;
    }
    
    public static void f2()throws Exception{
        // "Buscar un número"
        Double numero = pedirNumero();
        
        if (lista.contains(numero))
            JOptionPane.showMessageDialog(null, "El número se encuentra en la posición " + lista.indexOf(numero));
        else
            JOptionPane.showMessageDialog(null, "El número indicado no se encuentra");
        
        // Segunda forma
        int x;
        for (x = 0; x < lista.size() && lista.get(x).doubleValue()!= numero.doubleValue(); x++){}
        // lista.get(x) devuelve el objeto, no el value
        if (x != lista.size())
            JOptionPane.showMessageDialog(null, "El número se encuentra en la posición " + x);
        else
            JOptionPane.showMessageDialog(null, "El número indicado no se encuentra");        
    }  
    
    public static void f3()throws Exception{
        //"Borrar un número "
        
        // Se puede intentar reutilizar la función b
        Double numero = pedirNumero();
        
        // busco y luego borro
        if (lista.contains(numero)){
            lista.remove(numero);
            JOptionPane.showMessageDialog(null, "El número ha sido borrado. \n" + visualizar());
        }
        else
            JOptionPane.showMessageDialog(null, "El número indicado no se encuentra. \n "+ visualizar());      

        // borrar directamente
        if (lista.remove(pedirNumero())== true)
            JOptionPane.showMessageDialog(null, "El número ha sido borrado. \n" + visualizar());
        else
            // Excepcion??
            JOptionPane.showMessageDialog(null, "El número indicado no se encuentra. \n "+ visualizar());      
    }
    
    public static void f4()throws Exception{
        // " Convertir en un array"
        Double[] array;
        array = lista.toArray(new Double[lista.size()]);
        
        // Segunda forma
        Double[] arrayDos = new Double[lista.size()];
        for(int x = 0; x < lista.size(); x++)
            arrayDos[x] = lista.get(x);
        
        // visualizo el array
        String datos="";
        for(int x = 0; x < array.length; x++)
            datos += array[x] + " " + arrayDos[x] + "\n";
        JOptionPane.showMessageDialog(null, "Datos del array; \n "+ datos);
    }
    
    public static void f5()throws Exception{
        //  "e.- Mostrar el numero de elementos que contiene. " 
        JOptionPane.showMessageDialog(null, "La lista tiene: " + lista.size()+ " elementos " + visualizar());
    }
    
    public static void f6()throws Exception{
        // "Inserta un nuevo elemento por el ﬁnal." 
        lista.add(pedirNumero());  
        visualizar();
    }
    
    public static void f7()throws Exception{
        //  "Inserta un nuevo numero en una posición concreta" 
          Double numero = pedirNumero();
          int posicion= pedirPosicion();
          lista.add(posicion,numero);
          visualizar();
    }
    
    public static int pedirPosicion(){
        int posicion;
         do
         {
            posicion = Integer.parseInt(JOptionPane.showInputDialog("Teclea la posición; "));
            if (posicion < 0 || posicion > (lista.size() - 1))
               JOptionPane.showMessageDialog(null, "La posición indicada no es válida");
          }while (posicion < 0 || posicion > (lista.size() - 1));
         
         return posicion;
         
         /* En vez de comproblar nosotros si la posición es lógica, podríamos dejar 
         que saltará la exception. Lo hago en la siguiente función */
    }
    
    public static void f8(){
        // "Borra un elemento de una posicion concreta."
                 
         // int posicion= pedirPosicion();
        try
        {
          int posicion = Integer.parseInt(JOptionPane.showInputDialog("Teclea la posición "));
          lista.remove(posicion);
          visualizar();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas: " + e.getClass());
        }
    }
    
    public static void f9()throws Exception{
        // Calcular la suma y la media de los valores contenido.
        double suma = 0;
        Iterator<Double> iterador = lista.iterator();
        while(iterador.hasNext())
        {
            suma += iterador.next();
        }
        JOptionPane.showMessageDialog(null,"La suma es igual a: " + suma + " y la media: "+ (suma/lista.size()));
     
        lista.forEach((elemento)->{sumaTotal += elemento;});
        JOptionPane.showMessageDialog(null,"La suma es igual a: " + sumaTotal + " y la media: "+ (sumaTotal/lista.size()));
    }
    
}

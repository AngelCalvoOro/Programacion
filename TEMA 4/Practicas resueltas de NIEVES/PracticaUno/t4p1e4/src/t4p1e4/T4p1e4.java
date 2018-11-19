package t4p1e4;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class T4p1e4 {
    
    public static void main(String[] args)
    {
        try{
            
            //Creacion de los arrays
            char[] alfabeto= new char[26];
            int  tcont[]= new int[26];   //por defecto se inicializa a ceros. 
                                        // Los [] pueden ir también al final     

            // Inicializar el array con las letras del abecedario
            inicializarAbecedario(alfabeto);

            // Poner los elementos a cero
            inicializarContador(tcont);

           //Entrada de datos y cálculo de la tabla de frecuencias
            entradaDatos(alfabeto,tcont);

            // Salida de la tabla de frecuencia 
            salidaDatos(alfabeto,tcont);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas de tipo: "+ e.getMessage());
        }
 }

    private static void inicializarAbecedario(char[] alfabeto) throws Exception
    {
        //Código ascii
        char caracter=97;
        for (int x = 0; x < alfabeto.length; x++)
           alfabeto[x] = caracter++;   
        // = {'a','b',.........}
        
    }

    private static void inicializarContador(int[] tcont) throws Exception
    {
        for (int x = 0; x < tcont.length; x++)
           tcont[x] = 0;
        //Arrays.fill(tcont, 0);
    }

    private static void entradaDatos(char[] alfabeto, int[] tcont) throws Exception
    {
        int y;
        String texto= JOptionPane.showInputDialog("Introducir texto.").toLowerCase();     
        // no me planteo validaciones
        for (int x = 0; x < texto.length(); x++)
        {
            /*for(y=0; (y<alfabeto.length && texto.charAt(x)!=alfabeto[y]); y++);  //Buscar
            if (y!=alfabeto.length)                       //Si encontrado...
                   tcont[y]=tcont[y]+1; */  
            
            y = Arrays.binarySearch(alfabeto, texto.charAt(x));
            if (y != -1)
                tcont[y]=tcont[y]+1;
        } 
    }

    private static void salidaDatos(char[] alfabeto, int[] tcont) throws Exception
    {
        String resultados="";       
        for (int x = 0; x <tcont.length; x++)
        {
           if(tcont[x]!=0)  //se quiere excluir las que no aparecen
              resultados = resultados + alfabeto[x] + " - " + tcont[x]+ "\n";
        }
        JOptionPane.showMessageDialog(null, "La frecuencia de las letras es: \n\n" + resultados  ); 
   
    }
}

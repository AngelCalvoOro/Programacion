
package t4p1e6;

import javax.swing.JOptionPane;
import Excepciones.*;

public class T4p1e6 {

    public static void main(String[] args) {
        int[] totalFaltas= new int[5];
        int[] codigosAlumnos= new int[5];
        // codigos de tipo String

        char continuar;
        
        do
        {
            controlFalta(codigosAlumnos,totalFaltas);
            continuar=controlContinuar();
        }
        while(continuar=='s');  
        
        salidadatos(codigosAlumnos,totalFaltas);
    }

    private static void controlFalta(int[] codigosAlumnos,int[] totalFaltas) 
    {
        boolean error;
        do{
            try
            {
                int x=0;

                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el codigo alumno"));

                for(x=0; x<codigosAlumnos.length && codigosAlumnos[x]!=0 && codigosAlumnos[x]!=codigo; x++){}
                if(x==codigosAlumnos.length)
                    // Ya tengo cinco y no coincide con ninguno
                    throw new CodigoNoValido();
                          
                if (codigosAlumnos[x]==0)
                    // No está pero tengo sitio para ponerlo
                    codigosAlumnos[x]=codigo;
                
                int faltasDia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nro de faltas en el dia =>"));
                totalFaltas[x]= totalFaltas[x]+faltasDia; 
                error = false;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Los datos son numéricos");
                error = true;
            }
            catch(CodigoNoValido e){
                String texto="Los codigos permitidos son: \n";
                for(int y=0; y<codigosAlumnos.length; y++)
                        texto=texto + codigosAlumnos[y]+ " ";
                JOptionPane.showMessageDialog(null, texto);
                error = true;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Problemas");
                error = true;
            }
        }
        while(error);
    }

    private static char controlContinuar()
    {
        // Podiamos poner el try
        char continuar=' ';
        while (continuar!='s' && continuar!='n')
        {
                continuar = JOptionPane.showInputDialog("Desea continuar <s/n> ").toLowerCase().charAt(0);
        }
        return continuar;
    }

    private static void salidadatos(int[] codigosAlumnos, int[] totalFaltas)
    {
        String texto="El total de faltas de cada alumno es: \n";
        for(int y=0; y<codigosAlumnos.length && codigosAlumnos[y]!=0; y++)
        {  
          texto=texto + codigosAlumnos[y]+ " - "+totalFaltas[y]+ "\n";
        }
        
        JOptionPane.showMessageDialog(null, texto);
    }
}


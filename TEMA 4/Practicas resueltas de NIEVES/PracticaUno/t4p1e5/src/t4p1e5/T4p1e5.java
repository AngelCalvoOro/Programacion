
package t4p1e5;

import javax.swing.JOptionPane;
import Excepciones.*;

public class T4p1e5 {

 
    public static void main(String[] args) {
         //Inicializacion de array con distintas monedas
        float[] monedas= new float[15];
        InicializarArrayMonedas(monedas);
    
        //Entrada de datos               
        float importeVenta = entradaImporte();
        float dineroEntregado = entradaDineroEntregado();
                  
        //Control dinero de vuelta
        String dineroDeVuelta=CalculoDineroDeVuelta(importeVenta,dineroEntregado,monedas);
        
        //Salida de datos
        JOptionPane.showMessageDialog(null, "El dinero de vuelta es: \n\n" + dineroDeVuelta ); 
    }

    public static float entradaImporte()
    {
        boolean error;
        float importeVenta=0;
        do
        {
            try
            {
                importeVenta = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el importe de la venta =>"));
                if (importeVenta <= 0)
                    throw new DatoNoValido();
                error = false;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"El dato debe ser numérico");
                error = true;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,"El dato proporcionado no es lógico");
                error = true;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas: " + e.getClass());
                error = true;
            }
            
        }
        while(error);
        return importeVenta;
    }
    
    public static float entradaDineroEntregado()
    {
        boolean error;
        float dineroEntregado=0;
        do
        {
            try
            {
                dineroEntregado = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el importe entregado =>"));
                if (dineroEntregado <= 0)
                    throw new DatoNoValido();
                error = false;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"El dato debe ser numérico");
                error = true;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,"El dato proporcionado no es lógico");
                error = true;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas: " + e.getClass());
                error = true;
            }
            
        }
        while(error);
        return dineroEntregado;
    }
    
    public static void InicializarArrayMonedas(float[] monedas)
    {
        monedas[0]=500f;
        monedas[1]=200f;
        monedas[2]=100f;
        monedas[3]=50f;
        monedas[4]=20f;
        monedas[5]=10f;
        monedas[6]=5f;    
        monedas[7]=2f;
        monedas[8]=1f;
        monedas[9]=0.50f;
        monedas[10]=0.20f;
        monedas[11]=0.10f;
        monedas[12]=0.05f;
        monedas[13]=0.02f;
        monedas[14]=0.01f;  
        // También se pueden indicar todos los valores entre {}
    }

    private static String CalculoDineroDeVuelta(double importeVenta, double dineroEntregado, float[] monedas)
    {
       String vueltas="";
       double dineroVuelta = dineroEntregado - importeVenta;
       if (dineroVuelta < 0)
           JOptionPane.showMessageDialog(null,"Algo no cuadra");
           //nueva excepcion
       else
           if (dineroVuelta == 0)
                JOptionPane.showMessageDialog(null,"En paz. No hay vueltas");
           else
           {
                JOptionPane.showMessageDialog(null, "Debemos devolver al cliente "+dineroVuelta+ " euros"); 

                 double cambio = dineroVuelta; 
                 int x=0;
                 while (cambio > 0)  
                 { 
                   // Redondeo a double con dos decimales
                   cambio = Math.rint(cambio*100)/100; 

                   /*if (cambio >= monedas[x])
                   {
                     vueltas = vueltas + "\nEntregar un billete o moneda de "+monedas[x]+" euros";
                     cambio = cambio - monedas[x];  
                   }
                   else
                      x= x + 1;*/
                   
                   //Se puede plantear una segunda repetitiva para conseguir el número de billetes o monedas
                   int cont = 0;
                   while(cambio>=monedas[x])
                   {
                       cont++;
                       cambio = cambio - monedas[x];
                   }
                   if (cont != 0)
                       vueltas = vueltas + "\nEntregar " + cont +  " billete(s) o moneda(s) de "+monedas[x]+" euros";
                   x++;   
                }
           }
        return vueltas;
    }
}

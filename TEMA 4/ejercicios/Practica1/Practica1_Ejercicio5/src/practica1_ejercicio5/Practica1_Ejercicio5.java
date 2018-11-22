/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica1_Ejercicio5 {

    /**
    5. Disenar un programa que a partir del importe de una venta y del pago
    del comprador, calcule la vuelta y el numero de monedas y/o billetes
    de cada clase que se deben entregar al comprador. Intentaremos
    devolver el mınimo numero de billetes y/o monedas.
    */
    public static void main(String[] args) {
        float[] valorMoneda = new float[15];
        arrayMonedas(valorMoneda);
        float importeCosto = 0;
        float importePago = 0;
        int x=0;
        String tabla = "";
        importeCosto = Float.parseFloat(JOptionPane.showInputDialog("Intruduzca CUANTO CUESTA"));
        importePago  = Float.parseFloat(JOptionPane.showInputDialog("Intruduzca CUANTO VA A PAGAR"));
        float CantidadSobrante = importePago - importeCosto;
        if (CantidadSobrante < 0)
        {
            JOptionPane.showMessageDialog(null,"Algo no cuadra");
        }
        else
        {
            if (CantidadSobrante == 0) 
            {
                JOptionPane.showInternalMessageDialog(null,"La cantidad devuleta es exacta.");

            }
            else
            {
                JOptionPane.showMessageDialog(null, "La cantidad a devolver es " +CantidadSobrante+ " euros");
                double cambio = CantidadSobrante; 
                
                while (cambio > 0)  
                { 
                    int cont = 0;
                   while(cambio>=valorMoneda[x])
                   {
                       cont++;
                       cambio = cambio - valorMoneda[x];
                   }
                   if (cont != 0)
                       tabla = tabla + "\nEntregar " + cont +  " billete(s) o moneda(s) de "+valorMoneda[x]+" euros";
                   x++;  
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El dinero de vuelta es: \n\n" + tabla ); 
    }

    private static void arrayMonedas(float[] valorMoneda) {
        valorMoneda[0]=500f;
        valorMoneda[1]=200f;
        valorMoneda[2]=100f;
        valorMoneda[3]=50f;
        valorMoneda[4]=20f;
        valorMoneda[5]=10f;
        valorMoneda[6]=5f;    
        valorMoneda[7]=2f;
        valorMoneda[8]=1f;
        valorMoneda[9]=0.50f;
        valorMoneda[10]=0.20f;
        valorMoneda[11]=0.10f;
        valorMoneda[12]=0.05f;
        valorMoneda[13]=0.02f;
        valorMoneda[14]=0.01f;
        //la f despues de cada valor hace que el compilador lo trate como un float.Sin ello seria un double.
    }
    
}

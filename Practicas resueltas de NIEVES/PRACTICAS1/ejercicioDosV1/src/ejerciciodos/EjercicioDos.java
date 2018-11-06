
package ejerciciodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDos {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Entrada 
        System.out.print("Introduce dos números: ");
        
        // lectura del número uno
        String numeroUno = br.readLine();
        // conversión
        int n1 = Integer.parseInt(numeroUno);
        //float n11 = Float.parseFloat(numeroUno);
        
        // conversión y lectura en la misma línea
        int n2 = Integer.parseInt(br.readLine());
        
        // Proceso
        int resultado = n1 * n2;
        
        // Salida
        System.out.println(resultado);
    }
}


package ejerciciciounov2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicicioUnoV2 {

    // throws o try catch
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Entrada
        System.out.print("Teclea un mensaje: ");
        String mensaje = br.readLine();
        
        // Salida
        System.out.println(mensaje);
    } 
}

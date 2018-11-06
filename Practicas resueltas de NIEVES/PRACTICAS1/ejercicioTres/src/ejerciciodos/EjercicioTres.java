
package ejerciciodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTres {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Entrada 
        System.out.print("Introduce la base y la altura: ");
        
        int base = Integer.parseInt(br.readLine());
        
        int altura = Integer.parseInt(br.readLine());
        // Proceso
        int perimetro = 2 * base + 2 * altura;
        // Salida
        System.out.println(" El perimetro es: " + perimetro);
        
    }
}

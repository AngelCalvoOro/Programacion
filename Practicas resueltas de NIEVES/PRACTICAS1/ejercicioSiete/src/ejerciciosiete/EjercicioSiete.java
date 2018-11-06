package ejerciciosiete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSiete {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Entrada 
        System.out.print("Introduce los dos catetos: ");
        double c1 = Double.parseDouble(br.readLine());
        double c2 = Double.parseDouble(br.readLine());
        // Proceso
        // sqrt --- raiz cuadrada
        // pow --- potencia
        Double hipotenusa = Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
        // rint --- redondeo
        hipotenusa = Math.rint(hipotenusa);
      
        // Salida
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
    
}

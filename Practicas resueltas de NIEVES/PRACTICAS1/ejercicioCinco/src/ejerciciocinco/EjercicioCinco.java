package ejerciciocinco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCinco {

    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Entrada 
        System.out.print("Introduce los grados centígrados: ");
        double gradosC = Double.parseDouble(br.readLine());
        
        // Proceso
        Double gradosF = 1.8 * gradosC + 32;
        //float gradosF = (float) 1.8 * gradosC + 32;
        //float gradosF = 1.8f * gradosC + 32;
        
        // Salida
        System.out.println(gradosC  + " ºC son " + gradosF + "ºF");
    }
    
}

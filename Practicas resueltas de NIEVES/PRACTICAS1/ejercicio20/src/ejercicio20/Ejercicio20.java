package ejercicio20;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio20 {

    public static void main(String[] args) {
        // http://chuwiki.chuidiang.org/index.php?title=Generar_n%C3%BAmeros_aleatorios_en_Java
     
        /*Random r = new Random();
        int nroGenerado = r.nextInt(100);*/
        
        int nroGenerado = (int) (Math.random()*100);
        System.out.println(nroGenerado);
       
        
        int nro;
        String nroString = JOptionPane.showInputDialog(null,"Teclea un número");
        // == false
        while (!nroString.equalsIgnoreCase("Fin"))
        {
            nro = Integer.parseInt(nroString);
            if (nro != nroGenerado)
            {
                if (nro < nroGenerado)
                    JOptionPane.showMessageDialog(null,"Inténtalo con un número más grande o teclea fin si te has cansado");
                else
                    JOptionPane.showMessageDialog(null,"Inténtalo con un número más pequeño o teclea fin si te has cansado");
                nroString = JOptionPane.showInputDialog(null,"Teclea otro número");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Enhorabuena has acertado");
                nroString = "Fin";
            }
        
        }
    }
}

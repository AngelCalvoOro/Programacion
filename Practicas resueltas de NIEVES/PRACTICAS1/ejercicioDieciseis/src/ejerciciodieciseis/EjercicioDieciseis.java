
package ejerciciodieciseis;

import javax.swing.JOptionPane;

public class EjercicioDieciseis {

    public static void main(String[] args) {
        int contador=0,sumaEdades=0;
        //String respuesta;
        int respuest;
      
        do
        {
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Teclea la edad"));
            contador++;
            sumaEdades += edad;
            //respuesta = JOptionPane.showInputDialog(null,"¿ Quieres continuar? ");
            respuest = JOptionPane.showConfirmDialog(null, "Te pregunto si quieres continuar");
        }
        //while(respuesta.equals("si"));
        while(respuest == 0);
        // operación en show
        JOptionPane.showMessageDialog(null, " La media es "+ (sumaEdades/contador));
    }
    
}

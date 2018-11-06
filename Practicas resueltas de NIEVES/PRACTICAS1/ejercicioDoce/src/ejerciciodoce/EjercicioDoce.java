package ejerciciodoce;

import javax.swing.JOptionPane;


public class EjercicioDoce {

    public static void main(String[] args) {
  
        double importe;
        int consumo = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea el consumo mensual"));
        if (consumo > 300)
            if (consumo > 500)
            {
                importe = 300 * 0.03 + (consumo - 300) * 0.02;
                
                if (consumo > 800)
                    importe = importe - (importe * 1.25)/100;
            }
            else
                // Entre 300 y 500
                importe = consumo * 0.03;
            
        else
            // No > 300
            importe = consumo * 0.04;
        
        JOptionPane.showMessageDialog(null, importe);
    }
    
}

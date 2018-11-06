package ejerciciodoce;

import javax.swing.JOptionPane;


public class EjercicioDoce {

    public static void main(String[] args) {
        // Trabajando con constantes el mantenimiento del programa es más fácil.
        
        final float PRECIO1 = 0.03f;
        final float PRECIO2 = 0.02f;
        final float PRECIO3 = 0.04f;
        final int TRAMOUNO = 300;
        final int TRAMODOS = 500;
        final int TRAMOTRES = 800;
        
        double importe;
        int consumo = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea el consumo mensual"));
        if (consumo > TRAMOUNO)
            if (consumo > TRAMODOS)
            {
                importe = TRAMOUNO * PRECIO1 + (consumo - TRAMOUNO) * PRECIO2;
                
                if (consumo > TRAMOTRES)
                    importe = importe - (importe * 1.25)/100;
            }
            else
                // Entre 300 y 500
                importe = consumo * PRECIO1;
            
        else
            // No > 300
            importe = consumo * PRECIO3;
        
        JOptionPane.showMessageDialog(null, importe);
    }
    
}

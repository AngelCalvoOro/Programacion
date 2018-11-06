package ejerciciodiecinueve;

import javax.swing.JOptionPane;

public class EjercicioDiecinueve {

    public static void main(String[] args) {
        long nro = Long.parseLong(JOptionPane.showInputDialog(null,"Teclea el número"));
        int contador = 0, nroImpar = 1;
        long resultado = 0;
        while(contador < nro)
        {
            resultado = resultado + nroImpar;
            nroImpar = nroImpar + 2;
            contador = contador + 1;
        }
        JOptionPane.showMessageDialog(null,resultado);
        
        // Segunda manera
        
        resultado = 0;
        nroImpar = 1;
        for(contador = 0; contador < nro; contador++)
        {   
            resultado = resultado + nroImpar;
            nroImpar = nroImpar + 2;
        }
        
        JOptionPane.showMessageDialog(null,resultado);
        
        // Tercera manera. Más de una variable en el for
        resultado = 0;
        for(contador = 0,nroImpar = 1; contador < nro; contador++,nroImpar = nroImpar + 2)
            resultado = resultado + nroImpar;
        JOptionPane.showMessageDialog(null,resultado);
            
    }
    
}

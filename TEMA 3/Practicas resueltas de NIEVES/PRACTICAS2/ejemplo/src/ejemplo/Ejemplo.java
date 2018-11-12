package ejemplo;

import javax.swing.JOptionPane;

public class Ejemplo {

    public static void main(String[] args) {
        try
        {
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Teclea la nota (0-10)"));
            if (nota < 0 || nota >10)
                throw new NotaNoValidaException();
            funcionUno();
                
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"La nota es un dato numérico");
        }
        catch(NotaNoValidaException e)
        {
            JOptionPane.showMessageDialog(null,"La nota no puede ser menor que cero o mayor que diez");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas");
        }
    }
    
    public static void funcionUno()throws Exception{
        int nota2 = 6;
        int resultado = nota2/0;
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Teclea la segunda nota"));
         
    }
}

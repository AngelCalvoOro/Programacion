package ejercicioonce;

import javax.swing.JOptionPane;

public class EjercicioOnce {

    public static void main(String[] args) {
      int n1 =  Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
      int n2 =  Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
      int n3 =  Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer número"));
      
      if (n1 > n2 && n1 > n3)
      {
          JOptionPane.showMessageDialog(null, n1 + " es el más grande");
          if (n2 > n3)
              JOptionPane.showMessageDialog(null, n3 + " es el más pequeño");
          else
              JOptionPane.showMessageDialog(null, n2 + " es el más pequeño");
      }
      else
      {
          // n1 no es el más grande
          if (n2 > n3)
          {
              JOptionPane.showMessageDialog(null, n2 + " es el más grande");
              if (n1 > n3)
                    JOptionPane.showMessageDialog(null, n3 + " es el más pequeño");
              else
                    JOptionPane.showMessageDialog(null, n1 + " es el más pequeño");
          }
          else
          {
              JOptionPane.showMessageDialog(null, n3 + " es el más grande");
              if (n1 > n2)
                    JOptionPane.showMessageDialog(null, n2 + " es el más pequeño");
              else
                    JOptionPane.showMessageDialog(null, n1 + " es el más pequeño");
          }
      }
    }
}
   
  

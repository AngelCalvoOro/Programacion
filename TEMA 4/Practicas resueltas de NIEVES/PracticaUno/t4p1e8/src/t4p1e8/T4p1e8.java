package t4p1e8;

import javax.swing.JOptionPane;

public class T4p1e8 {

    private static  final int FILAS=10;
    private static  final int COLS=10;

    public static void main(String[] args)
    {  
         
          int[][] matriz= new int [FILAS][COLS];

          char continuar;      
          do
          {
              entradaDatos(matriz);
              continuar=controlContinuar();
          }
          while (continuar == 's');          
 
         salidaDatos(matriz);
 
    }
    
    private static char controlContinuar()
    {
        char continuar=' ';
        while (continuar!='s' && continuar!='n' )
        {
                continuar = JOptionPane.showInputDialog("Desea continuar <s/n> ").toLowerCase().charAt(0);
        }
        return continuar;
    }

    private static void entradaDatos(int[][] m)
    {

          int fila, columna;                 // fila y columna del elemento accedido        
          do
          {

            fila = Integer.parseInt(JOptionPane.showInputDialog("Numero de fila de la matriz(1..10):    "));
          }
          while (fila < 1 || fila > FILAS);
          fila--; // empezamos por la posición cero
          
          do
          {
            columna = Integer.parseInt(JOptionPane.showInputDialog("Numero de columna de la matriz(1..10):    "));
          }
          while (columna < 1 || columna > COLS);
          columna--; // empezamos por la posición cero

          int valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor a guardar en la matriz:    "));

          m[fila][columna] += valor;
    }

    private static void salidaDatos(int[][] m) 
    {
          int sumafila;                // suma de los elementos de una fila
          int fila, columna;                 // fila y columna del elemento accedido  
          String texto="\nLos valores introducidos son:\n\n";   
          
          for (fila = 0; fila < FILAS; fila++)
          {
              sumafila  = 0;
              for (columna = 0; columna < COLS; columna++)
              {
                    texto= texto+ " "+ m[fila][columna];
                    sumafila += m[fila][columna];
              }
              texto=texto+ " "+ " = "+ sumafila+ "\n";
          }
          texto=texto+ " "+ "\nFin del proceso.\n";
          JOptionPane.showMessageDialog(null, texto); 
    }
}

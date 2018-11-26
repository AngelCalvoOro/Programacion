package t4p1e7;

import javax.swing.JOptionPane;
import Excepciones.*;
import java.util.Arrays;

public class T4p1e7 {

    public static void main(String[] args) {
        int[] arrayProductos={10,23,30,47,55,65,135,256,526,663};
        int[] arrayUnidades= new int[10];     
        char continuar;

        /* Inicializar la tabla de las unidades aunque no es necesario*/
        for (int x=0;x < arrayUnidades.length;x++)
            arrayUnidades[x] = 0;
       // Arrays.fill(arrayUnidades, 0);

        /* Entrada de datos */
        do
        {
            entradaDatos(arrayProductos,arrayUnidades);
            continuar=controlContinuar();
        }
        while (continuar == 's');
        
        ordenarDatos(arrayProductos,arrayUnidades); 
        
        /* Visualizar los datos de salida */  
        salidaDatos(arrayProductos,arrayUnidades);

    }
    

    private static void ordenarDatos(int[] arrayProductos, int[] arrayUnidades)
    {
        // https://www.discoduroderoer.es/formas-de-ordenar-un-array-en-java/
            int auxiliar;

            for (int x = 0; x < arrayUnidades.length - 1; x++)
            {
                for (int y = x+1 ;y <arrayUnidades.length; y++)
                {
                        if (arrayUnidades[x] < arrayUnidades[y])
                        {
                          auxiliar = arrayUnidades[x];
                          arrayUnidades[x] = arrayUnidades[y];
                          arrayUnidades[y] = auxiliar;

                          auxiliar = arrayProductos[x];
                          arrayProductos[x] = arrayProductos[y];
                          arrayProductos[y] = auxiliar;                  
                        }
                }
             }
            
            
           // Arrays.sort(miArray);
    }

    private static void entradaDatos(int[] arrayProductos, int[] arrayUnidades)
    {
        int unidades = 0, posicion=0;
        int codigo;
        do
        {
            try{
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Teclea el codigo del producto =>"));
                posicion=busquedaCodigo(arrayProductos,codigo);  
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"El código es un dato numérico");
                posicion=arrayProductos.length;
            }
            catch(CodigoNoValido e)
            {
                String texto="Los codigos permitidos son: \n";
                for(int y=0; y<arrayProductos.length; y++)
                    texto=texto + arrayProductos[y]+ " ";
                JOptionPane.showMessageDialog(null, texto);
                posicion=arrayProductos.length;
            }
             catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getClass());
                posicion=arrayProductos.length;
            }
        }
        while (posicion==arrayProductos.length);

        boolean error;
        do
        {
            try
            {
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Teclea las unidades vendidas: "));
                if (unidades <= 0)
                    throw new UnidadesNoValidas();
                error = false;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Las unidades han de ser numéricas");
                error = true;
            }
            catch(UnidadesNoValidas e){
                JOptionPane.showMessageDialog(null,"Las unidades han de ser mayores que cero");
                error = true;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getClass());
                error = true;
            }
        }
        while (error); 

        // Guardar los datos 
        arrayUnidades[posicion] = arrayUnidades[posicion] + unidades;

    }

   private static int busquedaCodigo(int[] arrayProductos, int codigo) throws Exception
    {
        int x;
        
        for(x=0; x<arrayProductos.length && arrayProductos[x]!=codigo; x++){}
        if(x==arrayProductos.length)
        { 
            throw new CodigoNoValido();
        }
        return x;
        //return Arrays.binarySearch(arrayProductos, codigo);
       
        
    }   
    
    private static char controlContinuar()
    {
        // try
        char continuar=' ';
        while (continuar!='s' && continuar!='n')
        {
                continuar = JOptionPane.showInputDialog("Desea continuar <s/n> ").toLowerCase().charAt(0);
        }
        return continuar;
    }

    private static void salidaDatos(int[] arrayProductos, int[] arrayUnidades)
    {
        int totalCantidad=0;
        String texto="Producto   Unidades vendidas"+("\n--------   -----------------");
        for (int x = 0; x < arrayProductos.length; x++)
        {
            texto=texto+ "\n"+arrayProductos[x]+"             "+arrayUnidades[x];
            totalCantidad = totalCantidad + arrayUnidades[x];
        }
        texto=texto+"\n El numero total de unidades vendidas asciende a:"+totalCantidad;
        JOptionPane.showMessageDialog(null, texto);   
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkgtry.pkgcatch.pkgfinally;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class EjemploTryCatchFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        el try lo usaremos para ejecuciones en las que puedan aparecer errores
        El catch esta para indicar que hacer al encuntrar un error o si encuentra 
        */
        try{
            int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea un numero"));
            JOptionPane.showMessageDialog(null,"el numero es " + n);
            int a = n / 0;
        }
        /*
        el catch(NumberFormatException ) se ejecuta si en el try de este caso ponemos un valor String letra
        */
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"ya te vale tenias que poner un numero");
        }
        /*
        el catch(ArithmeticException ) se ejecuta si en el try de este caso se realiza una operacion aritmetica que no existe en este ejemplo el [int a = n / 0]
        */
       catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null,"ya te vale en la programacion algo que esta no existe");
        }
        /*
        el catch(Exception ) se ejecuta si en el try ocurre cualquier error
        */
       catch(Exception e){
            JOptionPane.showMessageDialog(null,"ya te vale algo fallo en la programacion");
        }
        /*
        Es opcional y se se ejecuta siempre al final .En este caso lo usamos para indicar que la ejecucion termino
        */
        finally{
            JOptionPane.showMessageDialog(null,"se acabo");
        }
    }
    
}

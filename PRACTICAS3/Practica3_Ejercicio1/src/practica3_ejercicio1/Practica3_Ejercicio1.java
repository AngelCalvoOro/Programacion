/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_ejercicio1;

import java.nio.charset.Charset;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica3_Ejercicio1 {

    /*
    Introducir por teclado el numero de horas trabajadas por un empleado
    e imprimir el sueldo que le corresponde cobrar teniendo en cuenta que
    cada hora normal se paga a 10 euros y cada hora extra a 15.
    
    Las horas extras son aquellas superiores a las cuarenta.
    
    En algunos casos, a la nomina calculada hay que sumarle un plus de
    100 euros segun el estado civil y el nivel de estudios del empleado.
    Esta ultima informacion tambien la obtendremos a traves del teclado.
    
    El estado civil puede ser S de soltero, C de casado, V de viudo y D de
    divorciado (S C V D ).
    
    El nivel de estudios puede ser P de primario, M de medio y S de
    superior (P M S).
    
    Llevan el plus de 100 euros las siguientes combinaciones: SP VS SM
    CS VP SS DS.
    */
    public static void main(String[] args) {
        int pagoFinal;
        
        int numHoras = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe el numero de horas trabajadas"));
        String estadoCivil = JOptionPane.showInputDialog(null,"Indique su estado civil.(soltero/casado/viudo/divorciado)");
        String nivelEstudios = JOptionPane.showInputDialog(null,"Indique su nivel de estudios.(primario/medio/superior)");
        int pagoBase = numHoras * 10;
        if (numHoras > 40) {
            int horasExtra = (numHoras - 40) * 15;
            int pagoBaseExtra = pagoBase + horasExtra;
            pagoFinal = pagoBaseExtra;
        }
        else{
            pagoFinal = pagoBase;
        }
        if (estadoCivil == "soltero" && nivelEstudios == "primario") {
            pagoFinal = pagoFinal + 100;
        }
        if (estadoCivil == "soltero" && nivelEstudios == "medio") {
            pagoFinal = pagoFinal + 100;
        }
        if (estadoCivil == "soltero" && nivelEstudios == "superior") {
            pagoFinal = pagoFinal + 100;
        }
        if (estadoCivil == "casado" && nivelEstudios == "superior") {
            pagoFinal = pagoFinal + 100;
        }
        if (estadoCivil == "viudo" && nivelEstudios == "superior") {
            pagoFinal = pagoFinal + 100;
        }
        if (estadoCivil == "viudo" && nivelEstudios == "primario") {
            pagoFinal = pagoFinal + 100;
        }
        if (estadoCivil == "divorciado" && nivelEstudios == "superior") {
            pagoFinal = pagoFinal + 100;
        }
        JOptionPane.showMessageDialog(null,pagoFinal + " Es el sueldo acorde a lo indico usted.");
    }
    
}

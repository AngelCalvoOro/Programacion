/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica3_Ejercicio4 {

    /**
    Desarrolla un programa en el que el usuario nos proporcione el
    nombre de los alumnos de un curso y sus notas en seis asignaturas
    distintas. El programa terminara cuando en el como nombre nos tecleen la
    palabra FIN.
     
    Nuestro programa debe visualizar el nombre de cada uno de los alumnos
    y su nota media. 
     
    Al final, cuando nos tecleen fin, mostraremos la nota media del conjunto
    de alumnos.
    */
    public static void main(String[] args) {
        
        //FALTARIA AÑADIR LOS TRY, CATCH Y AÑADIR OBLIGACIONES COMO SOLO NUMERO O SOLO LETRA
        String alumno;
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;
        int nota5 = 0;
        int nota6 = 0;
        int mediaAlumno;
        int contador = 0;
        int sumaMedias = 0;
        int notaMediaFinal;
        //alumno y notas
        do
        {
        alumno = JOptionPane.showInputDialog("Intruduzca el nombre de los alumnos cuando termine escriba FIN");
            if (!alumno.equals("FIN")) 
            {
                nota1 = Integer.parseInt(JOptionPane.showInputDialog("Nota de primera asignatura"));
                nota2 = Integer.parseInt(JOptionPane.showInputDialog("Nota de segunda asignatura"));
                nota3 = Integer.parseInt(JOptionPane.showInputDialog("Nota de tercera asignatura"));
                nota4 = Integer.parseInt(JOptionPane.showInputDialog("Nota de cuarta asignatura"));
                nota5 = Integer.parseInt(JOptionPane.showInputDialog("Nota de quinta asignatura"));
                nota6 = Integer.parseInt(JOptionPane.showInputDialog("Nota de sexta asignatura"));
                //media de alumno
                mediaAlumno = (nota1+nota2+nota3+nota4+nota5+nota6) / 6;
                JOptionPane.showMessageDialog(null,"La nota media de " + alumno + " es " + mediaAlumno);
                contador = contador + 1;
                sumaMedias = sumaMedias + mediaAlumno;
             }
        }
        while(!alumno.equals("FIN"));
        //contador de alumnos para hacer media de conjunto de alumnos puestos
        if (sumaMedias != 0) {
            notaMediaFinal = sumaMedias / contador;
            JOptionPane.showMessageDialog(null,"La media general es " + notaMediaFinal);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No hay ninguna media");
        }
        
        
    }
    
}

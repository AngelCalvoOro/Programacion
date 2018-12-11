/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica3_Ejercicio2 {

    /**
    En un cursillo de programacion se estudian cuatro lenguajes: Visual.
    Net, Cobol, Java y SQL. La nota final del curso depende de una
    practica que se realiza en los cuatro lenguajes.
    
    La nota en cada una de las practicas es apto o no apto y la nota del curso
    puede ser un sobresaliente, notable, bien, suficiente o insuficiente.

    Para calcular la nota del curso hay que seguir las siguientes instrucciones:
    
    -Apto en los cuatro lenguajes Sobresaliente
    -Apto en SQL, Cobol y uno de los otros dos Notable
    -Apto en Cobol y SQL Bien
    -Apto en SQL y uno entre Java y Visual.Net Suficiente
    -Apto en Cobol y uno entre Java y Visual.Net Suficiente
    -Resto de los casos Insuficiente.

    Desarrolla un programa que permita visualizar la nota de los alumnos
    recibiendo por teclado el apto o no apto en cada uno de los lenguajes.
     */
    public static void main(String[] args) {
        boolean bien = false;
        String VN = null;
        String Covol = null;
        String Java = null;
        String SQL = null;
        do
        {
            try
            {
                VN = JOptionPane.showInputDialog("¿Es apto o no en Visual.Net?");
                if (!VN.equals("apto") && !VN.equals("no apto")) 
                {
                    throw new valorException();
                }
                bien = true;
            }
            catch(valorException e)
            {
                JOptionPane.showMessageDialog(null,"Pon solo si es apto o no apto");
                bien = false;
            }
        }
        while(bien == false);
        do
        {
            try
            {
                Covol = JOptionPane.showInputDialog("¿Es apto o no en Covol?");
                if (!VN.equals("apto") && !VN.equals("no apto"))
                {
                    throw new valorException();
                }
                bien = true;
            }
            catch(valorException e)
            {
                JOptionPane.showMessageDialog(null,"Pon solo si es apto o no apto");
                bien = false;
            }
        }
        while(bien == false);
        do
        {
            try
            {
                Java = JOptionPane.showInputDialog("¿Es apto o no en Java?");
                if (!VN.equals("apto") && !VN.equals("no apto"))
                {
                    throw new valorException();
                }
                bien = true;
            }
            catch(valorException e)
            {
                JOptionPane.showMessageDialog(null,"Pon solo si es apto o no apto");
                bien = false;
            }

        }
        while(bien == false);
        do
        {
            try
            {
                SQL = JOptionPane.showInputDialog("¿Es apto o no en SQL?");
                if (!VN.equals("apto") && !VN.equals("no apto"))
                    {
                        throw new valorException();
                    }
                    bien = true;
            }
            catch(valorException e)
            {
                JOptionPane.showMessageDialog(null,"Pon solo si es apto o no apto");
                bien = false;
            }
        
        }
        while(bien == false);
        if (VN.equals("apto") && Covol.equals("apto") && Java.equals("apto") && SQL.equals("apto"))
        {
            JOptionPane.showMessageDialog(null,"Este alumno tiene un SOBRESALIENTE");
        }
        else if (Covol.equals("apto") && SQL.equals("apto") && (VN.equals("apto") || Java.equals("apto")))
        {
            JOptionPane.showMessageDialog(null,"Este alumno tiene un NOTABLE");
        }
        else if (Covol.equals("apto") && SQL.equals("apto"))
        {
            JOptionPane.showMessageDialog(null,"Este alumno tiene un BIEN");
        }
        else if ((Covol.equals("apto") || SQL.equals("apto")) && (VN.equals("apto") || Java.equals("apto")))
        {
            JOptionPane.showMessageDialog(null,"Este alumno tiene un SUFICIENTE");
        }
        else{
           JOptionPane.showMessageDialog(null,"Este alumno ES UN INUTIL Y POR ESO TIENE UN INSUFICIENTE");
        }
    }
}

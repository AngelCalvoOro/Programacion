/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica1_Ejercicio1 {

    /**
    Crea un arraylist para guardar valores de tipo real (Float o Double) que iremos
    introduciendo por teclado hasta finalizar (mientras quiera continuar).
    Posteriormente muestra un menu para que el usuario pueda realizar las
    siguientes operaciones:
    
        1. Visualizar el valor maximo y el mınimo.
        2. Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo
        has encontrado o no.
        3. Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra
        un mensaje de error.
        4. Convertir el arrayList en un array.
        5. Si no esta vacıo, mostrar el numero de elementos que contiene.
        6. Insertar un nuevo elemento por el final.
        7. Insertar un nuevo elemento en la posicion que te indique el usuario.
        8. Borrar un elemento de una posicion concreta.
        9. Calcular la suma y la media aritmetica de los valores contenidos.
        10. Finalizar.
    */
    public static void main(String[] args) {
        ArrayList<Float> listaValores = new ArrayList();
        valoresArrayList(listaValores);
        opcionesLista(listaValores);
    }

    private static void valoresArrayList(ArrayList<Float> listaValores){
        int x = 1;
        int respuesta = 0;
        do{
            try{
                listaValores.add(Float.parseFloat(JOptionPane.showInputDialog("Introduce el "+x+"º valor")));
                x++;
                respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres añadir mas valores?");
            }
            
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Solo se pueden añadir valores numericos.");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"ALGO FALLA.");
            }
        }while (respuesta == 0);
    }

    private static void opcionesLista(ArrayList<Float> listaValores) {
        int menu=0;
        do {
            try{
                menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Escoge una de las siguientes operaciones para mostrar: \n"
                                                                            + "1. Visualizar el valor maximo y el mınimo. \n"
                                                                            + "2. Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo has encontrado o no. \n"
                                                                            + "3. Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error. \n"
                                                                            + "4. Convertir el arrayList en un array. \n"//
                                                                            + "5. Si no esta vacıo, mostrar el numero de elementos que contiene. \n"//
                                                                            + "6. Insertar un nuevo elemento por el final. \n"//
                                                                            + "7. Insertar un nuevo elemento en la posicion que te indique el usuario. \n"//
                                                                            + "8. Borrar un elemento de una posicion concreta. \n"// LO MISMO QUE EL 3.
                                                                            + "9. Suma y media aritmetica de los valores contenidos. \n"// DE TODOS LOS VALORES SUMARLO Y HACER MEDIA
                                                                            + "10. Finalizar. \n"));
                casosLista(menu,listaValores);
            }
            catch (numeroInvalido e) {
                JOptionPane.showMessageDialog(null,"El valor introducido no esta entre 1 y 10.");
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Solo se pueden añadir valores numericos.");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ALGO FALLA.");
            }
        } while (menu != 10); 
    }
    private static void casosLista(int menu,ArrayList<Float> listaValores) throws Exception{
             switch(menu){
                    case 1:
                        caso1(listaValores);
                    break;
                    case 2:
                        caso2(listaValores);
                    break;
                    case 3:
                        caso3(listaValores);
                    break;
                    case 4:
                        caso4(listaValores);
                    break;
                    case 5:
                        caso5(listaValores);
                    break;
                    case 6:
                        caso6(listaValores);
                    break;
                    case 7:
                        caso7(listaValores);
                    break;
                    case 8:
                        caso8(listaValores);
                    break;
                    case 9:
                        caso9(listaValores);
                    break;
                    case 10:
                        JOptionPane.showMessageDialog(null,"Finalizacion de programa.");
                        System.exit(0);
                    break;
                    default:
                        throw new numeroInvalido();
                }
        
    }
    private static void caso1(ArrayList<Float> listaValores) {
        JOptionPane.showMessageDialog(null,"MOSTRAREMOS LOS VALORES PUESTOS Y LUEGO EN VALOR MINIMO Y MAXIMO.");
        
        Collections.sort(listaValores);
        JOptionPane.showMessageDialog(null,"LISTADO DE VALORES ORDENADOS \n"
                                            + listaValores+"\n\n"
                                            +"NUMEROS MAYOR Y MENOR \n"
                                            + listaValores.get(0)+" Es el valor mas pequeño \n"
                                            + listaValores.get((listaValores.size()-1))+" Es el valor mas grande.");
    }

    private static void caso2(ArrayList<Float> listaValores) {
        int valorVerificar =Integer.parseInt(JOptionPane.showInputDialog(null,"Intruduce un valor para visualizar a ver si esta en la lista"));
        if (listaValores.indexOf(valorVerificar) == -1) {
            JOptionPane.showMessageDialog(null,"No esta en la lista.");
        }
        else{
            JOptionPane.showMessageDialog(null,"El valor "+ valorVerificar + " se encuentra en la lista.");
        }
    }

    private static void caso3(ArrayList<Float> listaValores) {
        int valorVerificar =Integer.parseInt(JOptionPane.showInputDialog(null,"Intruduce un valor para visualizar a ver si esta en la lista"));
        if (listaValores.indexOf(valorVerificar) == -1) {
            JOptionPane.showMessageDialog(null,"No esta en la lista.");
        }
        else{
            JOptionPane.showMessageDialog(null,"El valor "+ valorVerificar + " se encuentra en la lista y sera EXTERMINADO");
            listaValores.remove(valorVerificar);
        }
    }

    private static void caso4(ArrayList<Float> listaValores) {
        // no entiendo las diferencias ni nada respecto a este apartado
        
    }

    private static void caso5(ArrayList<Float> listaValores) {
        JOptionPane.showMessageDialog(null,"SI NO HAY VALORES NO APARECERA NADA \n"+listaValores);
        //esta igual porque al inicio se obliga añadir minimo 1 valor
    }

    private static void caso6(ArrayList<Float> listaValores) {
        JOptionPane.showMessageDialog(null,"SON LOS VALORES DEL PRINCIPIO \n\n"+listaValores);
        valoresArrayList(listaValores);
        JOptionPane.showMessageDialog(null,"SON LOS VALORES DEL PRINCIPIO + LOS NUEVOS AÑADIDOS \n\n"+listaValores);
        //La unica pega en esto es que cuando vas a añadir un valor nuevo te dice añade el valor 1 en vez de la posicion del valor nuevo
    }

    private static void caso7(ArrayList<Float> listaValores) {
        float valorNuevo = Float.parseFloat(JOptionPane.showInputDialog("Introduce el nuevo valor a añadir."));
        int indicePosicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion donde quieres añadir el valor"));
        listaValores.add(indicePosicion,valorNuevo);
        JOptionPane.showMessageDialog(null,"lista de valores mas el valor añadido \n"+listaValores+"\n"+"El valor "+valorNuevo+ " esta en la posicion "+indicePosicion+"º");
    }

    private static void caso8(ArrayList<Float> listaValores) {
        int indicePosicion = Integer.parseInt(JOptionPane.showInputDialog("indica la posicion que quieres eliminar de la siguiente lista \n"+listaValores));
        listaValores.remove(indicePosicion);
        JOptionPane.showMessageDialog(null,"lista de valores menos el valor de la posicion indicada \n"+listaValores);
    }

    private static void caso9(ArrayList<Float> listaValores) {
        //falla
        float sumaTotal = 0;
        float media = 0;
        for (int x = 0; x < listaValores.get((listaValores.size())); x++) {
            sumaTotal += listaValores.get(x);
            media = sumaTotal / listaValores.get((listaValores.size())) ;
            
        }
        JOptionPane.showMessageDialog(null,"La media de todos los valores puestos es: " + media);
    }

}

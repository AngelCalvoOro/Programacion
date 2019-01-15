
package practica1_ejercicio1;



public class Practica1_Ejercicio1 {

    private static Ventana1 v;

    
    public static void main(String[] args) {
        //crear y visualizar ventana
        v = new Ventana1();
        v.setVisible(true);
    }
    public static void salir(){
        v.dispose();
        System.exit(0);
    }
    
}

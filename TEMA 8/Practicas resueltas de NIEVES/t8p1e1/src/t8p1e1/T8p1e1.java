package t8p1e1;

public class T8p1e1 {

    private static Ventana v;
    
    public static void main(String[] args) {
       // Crear y mostrar la ventana
       v = new Ventana();
       v.setVisible(true);
    }
    
    public static void salir(){
        v.dispose();
        System.exit(0);
    }
    
}

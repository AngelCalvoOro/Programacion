
package Vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import t8p4e1.Main;

public class ControladorVista {
    
    private static DialogoIdentificacion di;
    private static PanelFondo pf;
    
    private static VentanaPersona vper;
    private static VentanaPrincipal vp;
    private static ListadoContratos lc;
    private static ListadoDepartamentos ld;
    
    public static void empezar(){
        
        vp = new VentanaPrincipal();
        
        // Imagen de fondo
        pf = new PanelFondo();
        vp.add(pf, BorderLayout.CENTER);
        vp.pack();
        
        // Cuadro de dialogo para solicitar usuario y contraseña
        di = new DialogoIdentificacion(vp,true);
        di.setSize(400, 300);
        // centrarlo
        di.setLocationRelativeTo(vp);
        // Mostrar
        vp.setVisible(true);
        di.setVisible(true);
    }
    
    public static void mostrarListadoContratos(){
               
        // Cuadro de dialogo para solicitar usuario y contraseña
        lc = new ListadoContratos(vp,false);
        lc.setSize(600, 500);
        // centrarlo
        lc.setLocationRelativeTo(vp);
        // Mostrar
        lc.setVisible(true);
    }
    
    public static void mostrarListadoDepartamentos(){
               
        // Cuadro de dialogo para solicitar usuario y contraseña
        ld = new ListadoDepartamentos(vp,false);
        ld.setSize(600, 500);
        // centrarlo
        ld.setLocationRelativeTo(vp);
        // Mostrar
        ld.setVisible(true);
    }
    
    public static void usuarioCorrecto(){
        di.dispose();
        vp.mostrarPanelBienvenida(Main.getNombreUsuario());
    }
    
    public static void mostrarVentanaPersona(String operacion){
        //vp.setVisible(false);
        vper = new VentanaPersona(operacion);
        vper.setVisible(true);
    }
    
    public static void volverVentanaPrincipal (JFrame v)
    {
        v.dispose();
        //vp.setVisible(true);
    }
    
}

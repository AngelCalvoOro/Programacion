package t3p3e1;

import javax.swing.JOptionPane;
import Excepciones.*;

public class T3p3e1 {

    // Variables globales
    private static byte horasTrabajadas;
    private static char estadoCivil;
    private static char nivelEstudios;
    
    public static void main(String[] args) {
        
        solicitarDatos();
       // float sueldo = calcularSueldo();   
        JOptionPane.showMessageDialog(null, "El sueldo de este trabajador asciende a " + calcularSueldo()); 
    }
         
    public static void solicitarDatos(){
        boolean correcto = false;
        while(correcto == false)
        {
            try
            {
                horasTrabajadas = Byte.parseByte(JOptionPane.showInputDialog("Teclea el número de horas que ha trabajado"));
                correcto = true;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El dato tecleado no es del tipo correcto");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getClass()+ e.getMessage());
            } 
        }
        
        correcto = false;
        while(correcto == false)
        {
            try
            {
                String ne = JOptionPane.showInputDialog("Teclea el nivel de estudios del trabajador").toUpperCase();
                if (ne.length()!= 1)
                    throw new MuchosCaracteresException();
                nivelEstudios = ne.charAt(0);
                if (nivelEstudios != 'P'  && nivelEstudios != 'M' && nivelEstudios != 'S')
                    throw new NivelEstudiosException();
                correcto = true;
            }
            catch(MuchosCaracteresException e){
                JOptionPane.showMessageDialog(null, "El nivel de estudios no muy largo o está vacío");
            }
            catch(NivelEstudiosException e){
                JOptionPane.showMessageDialog(null, "El nivel de estudios no es correcto");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getClass()+ e.getMessage());
            } 
        }
        
        correcto = false;
        while(correcto == false)
        {
            try
            {
                estadoCivil = JOptionPane.showInputDialog("Teclea el estado civil del trabajador").charAt(0);
                estadoCivil = Character.toUpperCase(estadoCivil);

                if (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'D' && estadoCivil != 'V')
                     throw new EstadoCivilException();
                correcto = true;
            }
            catch(EstadoCivilException e){
                JOptionPane.showMessageDialog(null, "El estado civil no es correcto");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getClass()+ e.getMessage());
            } 
        }
        //Hasta que no tengamos un dato correcto no seguimos.
    }
     
    public static float calcularSueldo(){
         //Constantes
         final float PRECIOHORANORMAL = 10;
         final float PRECIOHORAEXTRA = 15;
         
        //Operaciones para calcular la nómina
        float sueldo;
        if (horasTrabajadas > 40) // 40 podría ser otra constante
            sueldo = (horasTrabajadas - 40) * PRECIOHORAEXTRA + 40 * PRECIOHORANORMAL;
        else
            sueldo = horasTrabajadas * PRECIOHORANORMAL; 
                
        final float plus = 100f;
                
        if (nivelEstudios == 'S')
            sueldo = sueldo + plus;
        else
            if (estadoCivil == 'S')
                sueldo += plus;
            else
                if (estadoCivil == 'V' && nivelEstudios == 'P')
                    sueldo += plus;
        
        return sueldo;
                
    }
    
    
}

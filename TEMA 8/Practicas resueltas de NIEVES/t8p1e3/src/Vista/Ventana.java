
package Vista;

import t8p1e3.T8p1e3;
import Excepciones.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ventana extends javax.swing.JFrame {

    // Variable global para saber si es un alta o una modificación
    private boolean modificar = false;
   
    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        tfCurso = new javax.swing.JFormattedTextField();
        tfDni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Dni");

        jLabel4.setText("Curso");

        bAceptar.setText("Aceptar");
        bAceptar.setEnabled(false);
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        try {
            tfCurso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#?")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCursoActionPerformed(evt);
            }
        });

        tfDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDniFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDni))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(bAceptar)
                        .addGap(102, 102, 102)
                        .addComponent(bSalir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bSalir))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
       T8p1e3.terminar();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
       if (modificar) 
           modificar();
       else
           alta();
    }//GEN-LAST:event_bAceptarActionPerformed

    
    private void alta(){
          // alta
         try{
            if (tfNombre.getText().isEmpty())
                throw new DatoObligatorio(1);
            if (tfApellidos.getText().isEmpty())
                throw new DatoObligatorio(2);
            if (tfCurso.getText().isEmpty())
                throw new DatoObligatorio(3);
            if (T8p1e3.validarCurso(tfCurso.getText()) == false)
                throw new CursoNoValido();
            T8p1e3.altaPersona(tfDni.getText(),tfNombre.getText(),tfApellidos.getText());
        }
        catch(DatoObligatorio e){
             javax.swing.JOptionPane.showMessageDialog(this,"Todos los datos de entrada son obligatorios");
             if (e.getNumero()== 1)
                 tfNombre.requestFocus();
             else
                 if (e.getNumero() == 2)
                     tfApellidos.requestFocus();
                else
                    tfCurso.requestFocus();
        }
       catch(CursoNoValido e){
           javax.swing.JOptionPane.showMessageDialog(this,"El curso tecleado no existe");
           tfCurso.requestFocus();
       }
       catch(Exception e){
           javax.swing.JOptionPane.showMessageDialog(this,"Problemas en el botón alta");
       }
    }
    
    private void tfDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDniFocusLost
         // La caja pierder el cursor
        try{
          // DNIs correctos: 11111111H y 22222222J
          validarDni();
          
          // La clase principal comprueba si hay una persona con este dni
          if (T8p1e3.validarDni(tfDni.getText()))          
          {
              // Ha encontrado una persona con ese dni
              mostrarDatos();
          }
          else
          {
              // La persona es nueva
              bAceptar.setEnabled(true);
              tfNombre.requestFocus();
          }
          tfDni.setEditable(false);
              
      }
      catch(DatoObligatorio e){
          javax.swing.JOptionPane.showMessageDialog(this,"El dni es un dato obligatorio");
          tfDni.requestFocus();
      }
      catch(DniNoValido e){
          javax.swing.JOptionPane.showMessageDialog(this,"El dni no es correcto");
          tfDni.requestFocus();
      }
      catch(Exception e){
          javax.swing.JOptionPane.showMessageDialog(this,"Problemas validando el dni");
      }
    }//GEN-LAST:event_tfDniFocusLost

    private void tfCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCursoActionPerformed

    private void validarDni() throws Exception {
        // Vacío
        if (tfDni.getText().isEmpty())
              throw new DatoObligatorio();
        
        // Formato
        Pattern pattern=Pattern.compile("(\\d{8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
        Matcher matcher=pattern.matcher(tfDni.getText());
        if(matcher.matches()){
            // Concordancia de la letra
            // subexpresiones ()
            String letra=matcher.group(2);
            String letras="TRWAGMYFPDXBNJZSQVHLCKE";
            int numero=Integer.parseInt(matcher.group(1));
            numero=numero%23;
            String reference=letras.substring(numero,numero+1);
            if(!reference.equalsIgnoreCase(letra))
                throw new DniNoValido();
         }
        else
            throw new DniNoValido();
    }
    
    private void borrar() {
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(this, "¿Estas segur@? Ten en cuenta que los datos se eliminarán definitivamente.");
        if (respuesta == 0)
            T8p1e3.borrarPersona();
        else
            T8p1e3.volverEmpezar();
}

    private void modificar() {
    try{
         if (tfCurso.getText().isEmpty())
             throw new DatoObligatorio();
         if (T8p1e3.validarCurso(tfCurso.getText()) == false)
             throw new CursoNoValido();
         T8p1e3.modificarPersona();
         
     }
     catch(DatoObligatorio e){
          javax.swing.JOptionPane.showMessageDialog(this,"Todos los datos de entrada son obligatorios");
          tfCurso.requestFocus();
      }
     catch(CursoNoValido e){
         javax.swing.JOptionPane.showMessageDialog(this,"El curso tecleado no existe");
         tfCurso.requestFocus();
     }
     catch(Exception e){
         javax.swing.JOptionPane.showMessageDialog(this,"Problemas en el botón modificar");
    }
}

    public void mostrarDatos(){
        // muestro datos. No permito modificaciones
        tfNombre.setText(T8p1e3.getPersona().getNombre());
        tfNombre.setEnabled(false);
        tfApellidos.setText(T8p1e3.getPersona().getApellidos());
        tfApellidos.setEnabled(false);
        tfCurso.setText(T8p1e3.getPersona().getC().getCurso());   
        tfCurso.setEnabled(false);
        
        int respuesta =0;
        do{
            try{
            respuesta = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(this,"1.- Borrar \n 2.- Modificar curso\n"));
            if (respuesta == 1)
                borrar();
            else
                if(respuesta == 2)
                {
                    tfCurso.setEnabled(true);
                    tfCurso.requestFocus();
                    bAceptar.setEnabled(true);
                    modificar=true;
                }
                else
                    // podía crear una nueva excepción
                    throw new Exception();
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(this,"Responde 1 o 2");
            }
         }
        while(respuesta != 1 && respuesta !=2);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JFormattedTextField tfCurso;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}

package GUI;

import t8p1e4.T8p1e4;
import Excepciones.*;

public class VentanaCompras extends javax.swing.JFrame {

    private boolean nombreValidado = false;
   
    public VentanaCompras() {
        initComponents();
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfProducto = new javax.swing.JTextField();
        tfUnidades = new javax.swing.JTextField();
        tfPrecioUnitario = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compra");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ventana compras");

        jLabel2.setText("Producto");

        jLabel3.setText("Unidades");

        jLabel4.setText("Precio Unitario");

        tfProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProductoActionPerformed(evt);
            }
        });

        tfUnidades.setEnabled(false);
        tfUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUnidadesActionPerformed(evt);
            }
        });

        tfPrecioUnitario.setEnabled(false);
        tfPrecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioUnitarioActionPerformed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.setEnabled(false);
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPrecioUnitario)
                            .addComponent(tfUnidades)
                            .addComponent(tfProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(bAceptar)
                        .addGap(60, 60, 60)
                        .addComponent(bCancelar)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void tfProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProductoActionPerformed
      try
      {
          if (tfProducto.getText().isEmpty())
              throw new DatoObligatorio();
          // Expresión regular controlando que sean letras
          if (T8p1e4.validarProducto(tfProducto.getText()) == false)
              throw new ProductoNoValido();
          tfUnidades.setEnabled(true);
          tfUnidades.requestFocus();
      }
      catch(DatoObligatorio e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "El nombre del producto es un dato obligatorio");
          tfProducto.requestFocus();
      }
      catch(ProductoNoValido e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "El producto indicado no existe");
          tfProducto.requestFocus();
      }
      catch(Exception e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "Problemas con el nombre del producto");
          tfProducto.requestFocus();
      }
}//GEN-LAST:event_tfProductoActionPerformed

private void tfPrecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioUnitarioActionPerformed
      try
      {
          if (tfPrecioUnitario.getText().isEmpty())
              throw new DatoObligatorio();
          Float.parseFloat(tfPrecioUnitario.getText());
          bAceptar.setEnabled(true);
          bAceptar.requestFocus();
      }
      catch(DatoObligatorio e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "Es obligatorio indicar el precio ");
          tfPrecioUnitario.requestFocus();
      }
      catch(NumberFormatException e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "El precio tiene que ser numérico");
          tfPrecioUnitario.requestFocus();
      }
      catch(Exception e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "Problemas con el precio");
          tfPrecioUnitario.requestFocus();
      }
}//GEN-LAST:event_tfPrecioUnitarioActionPerformed

private void tfUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUnidadesActionPerformed
      try
      {
          if (tfUnidades.getText().isEmpty())
              throw new DatoObligatorio();
          // Si no puede convertir salta NumberFormatException
          Integer.parseInt(tfUnidades.getText());
          tfPrecioUnitario.setEnabled(true);
          tfPrecioUnitario.requestFocus();
      }
      catch(DatoObligatorio e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "Es obligatorio indicar las unidades compradas");
          tfUnidades.requestFocus();
      }
      catch(NumberFormatException e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "Las unidades son numéricas");
          tfUnidades.requestFocus();
      }
      catch(Exception e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "Problemas con las unidades");
          tfUnidades.requestFocus();
      }
}//GEN-LAST:event_tfUnidadesActionPerformed

private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
   boolean correcto = T8p1e4.aceptarCompra(Integer.parseInt(tfUnidades.getText()),Float.parseFloat(tfPrecioUnitario.getText()));
   if (correcto)
       javax.swing.JOptionPane.showMessageDialog(this,"Compra grabada");
   else
       javax.swing.JOptionPane.showMessageDialog(this,"Problemas al grabar la compra");
   T8p1e4.volver(this);
}//GEN-LAST:event_bAceptarActionPerformed

private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
  T8p1e4.volver(this);
}//GEN-LAST:event_bCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaCompras().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfPrecioUnitario;
    private javax.swing.JTextField tfProducto;
    private javax.swing.JTextField tfUnidades;
    // End of variables declaration//GEN-END:variables
}

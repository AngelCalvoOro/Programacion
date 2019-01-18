
package t8p1e1;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    private Integer aciertos;
    private Integer fallas;
    private Integer intentos;
    
    public Ventana() {
        initComponents();
        // Centrar la ventana
        setLocationRelativeTo(null);
        // inicialización de variables
        aciertos = 0;
        fallas = 0;
        intentos = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNumeroUno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNumeroDos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfResultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfIntentos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfAciertos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfFallas = new javax.swing.JTextField();
        bActivar = new javax.swing.JButton();
        bComprobar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aleatorio");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Número 1: ");

        tfNumeroUno.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("+ Número 2");

        tfNumeroDos.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("= Resultado");

        tfResultado.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Intentos");

        tfIntentos.setText("0");
        tfIntentos.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Aciertos");

        tfAciertos.setText("0");
        tfAciertos.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Fallas");

        tfFallas.setText("0");
        tfFallas.setEnabled(false);

        bActivar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bActivar.setText("Activar");
        bActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActivarActionPerformed(evt);
            }
        });

        bComprobar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bComprobar.setText("Comprobar");
        bComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobarActionPerformed(evt);
            }
        });

        bSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfNumeroUno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNumeroDos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tfIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFallas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(bActivar)
                        .addGap(18, 18, 18)
                        .addComponent(bComprobar)
                        .addGap(18, 18, 18)
                        .addComponent(bSalir)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNumeroUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfNumeroDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfFallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bActivar)
                    .addComponent(bComprobar)
                    .addComponent(bSalir))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
       // Finaliza la ejecución
        T8p1e1.salir();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActivarActionPerformed
        // Generar los dos números aleatorios
        Integer numero = (int)(Math.random()*1000);
        tfNumeroUno.setText(numero.toString());
        numero = (int)(Math.random()*1000);
        tfNumeroDos.setText(numero.toString());
        
    }//GEN-LAST:event_bActivarActionPerformed

    private void bComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobarActionPerformed
        // Solicitar el resultado
        try{
            if (tfNumeroUno.getText().isEmpty())
                throw new OrdenNoValido();
            intentos += 1;
            tfIntentos.setText(intentos.toString());
            int resultado = Integer.parseInt(JOptionPane.showInputDialog(this,"Introduce valor"));
            Integer resultadoReal = Integer.parseInt(tfNumeroUno.getText()) + Integer.parseInt(tfNumeroDos.getText());
            // tfResultado.setText(resultadoReal.toString());
            if (resultadoReal == resultado){
                aciertos += 1;
                tfAciertos.setText(aciertos.toString());
                // Inicializo
                tfNumeroUno.setText("");
                tfNumeroDos.setText("");
            }
            else{
                fallas += 1;
                tfFallas.setText(fallas.toString());
            }
        }
        catch(OrdenNoValido e)
        {
            JOptionPane.showMessageDialog(this,"Antes de adivinar el resultado hay que generar los números");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"El resultado debe ser un dato numérico");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Problemas");
            T8p1e1.salir();
        }
    }//GEN-LAST:event_bComprobarActionPerformed

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
    private javax.swing.JButton bActivar;
    private javax.swing.JButton bComprobar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfAciertos;
    private javax.swing.JTextField tfFallas;
    private javax.swing.JTextField tfIntentos;
    private javax.swing.JTextField tfNumeroDos;
    private javax.swing.JTextField tfNumeroUno;
    private javax.swing.JTextField tfResultado;
    // End of variables declaration//GEN-END:variables
}

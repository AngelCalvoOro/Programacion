
package practica1_ejercicio1;

import javax.swing.JOptionPane;

public class Ventana1 extends javax.swing.JFrame {
    
    private Integer aciertos;
    private Integer fallos;
    private Integer intentos;
    
    public Ventana1() {
        initComponents();
        //centrar ventana1
        setLocationRelativeTo(null);
        //contadores
        aciertos = 0;
        fallos = 0;
        intentos = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfnumero1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfnumero2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfresultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfintentos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfaciertos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tffallos = new javax.swing.JTextField();
        jbactivar = new javax.swing.JButton();
        jbcomprobar = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número 1:");

        tfnumero1.setEnabled(false);

        jLabel2.setText("+ Número 2:");

        tfnumero2.setEnabled(false);

        jLabel3.setText("= Resultado");

        jLabel4.setText("Intentos:");

        tfintentos.setText("0");
        tfintentos.setEnabled(false);

        jLabel5.setText("Aciertos:");

        tfaciertos.setText("0");
        tfaciertos.setEnabled(false);

        jLabel6.setText("Fallas:");

        tffallos.setText("0");
        tffallos.setEnabled(false);

        jbactivar.setText("Activar");
        jbactivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbactivarMouseClicked(evt);
            }
        });

        jbcomprobar.setText("Comprobar");
        jbcomprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbcomprobarMouseClicked(evt);
            }
        });

        jbsalir.setText("Salir");
        jbsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbsalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jbactivar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbcomprobar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfintentos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfaciertos)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tffallos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbsalir))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfintentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfaciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tffallos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbactivar)
                    .addComponent(jbcomprobar)
                    .addComponent(jbsalir))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbsalirMouseClicked
        //Hacer clic sobre Salir:
        //Vuelve a main y va al evento salir
        Practica1_Ejercicio1.salir();
    }//GEN-LAST:event_jbsalirMouseClicked

    private void jbactivarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbactivarMouseClicked
        //Hacer clic sobre el boton Activar:
        //Hace dos numeros aleatorios diferentes y los pone en los tfnumero1 y 2
        Integer numRandom = (int) (Math.random()* 998) +1;
        tfnumero1.setText(numRandom.toString());
        numRandom = (int) (Math.random()* 998) +1;
        tfnumero2.setText(numRandom.toString());
    }//GEN-LAST:event_jbactivarMouseClicked

    private void jbcomprobarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbcomprobarMouseClicked
        //Hacer clic sobre Comprobar:
        //Comprueba si hay algun numero aleatorio y en tfresultado
        try{
            if (tfnumero1.getText().isEmpty()) {
                throw new Sincomprobar();
            }
            Integer sumaNumeros = Integer.parseInt(tfnumero1.getText()) + Integer.parseInt(tfnumero2.getText());
            if (tfresultado.getText().isEmpty()){
                throw new ResultadoVacio();
            }
            else{
                intentos++;
                tfintentos.setText(intentos.toString());
                if (sumaNumeros == Integer.parseInt(tfresultado.getText())) {
                    aciertos ++;
                    tfaciertos.setText(aciertos.toString());
                    tfnumero1.setText("");
                    tfnumero2.setText("");
                }
                else{
                    fallos++;
                    tffallos.setText(fallos.toString());
                }
 
            }
        }
        catch(Sincomprobar e){
            JOptionPane.showMessageDialog(this, "PULSA PRIMERO EL BOTON COMPROBAR");
        }
        catch(ResultadoVacio e)
        {
            JOptionPane.showMessageDialog(this, "PON UN RESULTADO PRIMERO");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Solo valido datos numericos");
        }
        //Suma los tfnumero1 y 2 y lo compara con el numero puesto en tfresultado
        
        
    }//GEN-LAST:event_jbcomprobarMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbactivar;
    private javax.swing.JButton jbcomprobar;
    private javax.swing.JButton jbsalir;
    private javax.swing.JTextField tfaciertos;
    private javax.swing.JTextField tffallos;
    private javax.swing.JTextField tfintentos;
    private javax.swing.JTextField tfnumero1;
    private javax.swing.JTextField tfnumero2;
    private javax.swing.JTextField tfresultado;
    // End of variables declaration//GEN-END:variables
}

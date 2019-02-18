package Vista;

import Excepciones.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import t8p4e1.Main;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    public VentanaPrincipal() {
        initComponents();
        panelBienvenido.setVisible(false);
        //Maximizada setExtendedState(JFrame.MAXIMIZED_BOTH);
        // centrada
        this.setLocationRelativeTo(null);
    }

    public void mostrarPanelBienvenida(String nombre){
        lNombre.setText(nombre);
        panelBienvenido.setVisible(true);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        bAlta = new javax.swing.JButton();
        bBaja = new javax.swing.JButton();
        bModificacion = new javax.swing.JButton();
        bListadoNumero = new javax.swing.JButton();
        bListadoDepartamento = new javax.swing.JButton();
        bListadoContrato = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bCerrarSesion = new javax.swing.JButton();
        panelBienvenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miAlta = new javax.swing.JMenuItem();
        miModificacion = new javax.swing.JMenuItem();
        miBaja = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miListadoNumero = new javax.swing.JMenuItem();
        miListadoContrato = new javax.swing.JMenuItem();
        miListadoDepartamento = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana principal");

        jToolBar1.setRollover(true);

        bAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.jpg"))); // NOI18N
        bAlta.setToolTipText("Alta de un empleado");
        bAlta.setFocusable(false);
        bAlta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAlta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaActionPerformed(evt);
            }
        });
        jToolBar1.add(bAlta);

        bBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.jpg"))); // NOI18N
        bBaja.setToolTipText("Baja de un empleado");
        bBaja.setFocusable(false);
        bBaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBajaActionPerformed(evt);
            }
        });
        jToolBar1.add(bBaja);

        bModificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit.jpg"))); // NOI18N
        bModificacion.setToolTipText("Modificación de los datos de un empleado");
        bModificacion.setFocusable(false);
        bModificacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bModificacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificacionActionPerformed(evt);
            }
        });
        jToolBar1.add(bModificacion);

        bListadoNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado.jpg"))); // NOI18N
        bListadoNumero.setToolTipText("Datos de un empleado");
        bListadoNumero.setFocusable(false);
        bListadoNumero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bListadoNumero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bListadoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListadoNumeroActionPerformed(evt);
            }
        });
        jToolBar1.add(bListadoNumero);

        bListadoDepartamento.setText("ListadoPorDepartamento");
        bListadoDepartamento.setFocusable(false);
        bListadoDepartamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bListadoDepartamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bListadoDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListadoDepartamentoActionPerformed(evt);
            }
        });
        jToolBar1.add(bListadoDepartamento);

        bListadoContrato.setText("ListadoPorContrato");
        bListadoContrato.setFocusable(false);
        bListadoContrato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bListadoContrato.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bListadoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListadoContratoActionPerformed(evt);
            }
        });
        jToolBar1.add(bListadoContrato);

        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.JPG"))); // NOI18N
        bSalir.setToolTipText("Salir");
        bSalir.setFocusable(false);
        bSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(bSalir);

        bCerrarSesion.setText("Cerrar sesion");
        bCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarSesionActionPerformed(evt);
            }
        });

        panelBienvenido.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido");

        javax.swing.GroupLayout panelBienvenidoLayout = new javax.swing.GroupLayout(panelBienvenido);
        panelBienvenido.setLayout(panelBienvenidoLayout);
        panelBienvenidoLayout.setHorizontalGroup(
            panelBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(lNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        panelBienvenidoLayout.setVerticalGroup(
            panelBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jMenu1.setText("Personas");

        miAlta.setText("Alta");
        miAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaActionPerformed(evt);
            }
        });
        jMenu1.add(miAlta);

        miModificacion.setText("Modificacion");
        miModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificacionActionPerformed(evt);
            }
        });
        jMenu1.add(miModificacion);

        miBaja.setText("Baja");
        miBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaActionPerformed(evt);
            }
        });
        jMenu1.add(miBaja);

        jMenu3.setText("Listado");

        miListadoNumero.setText("Por número de empleado");
        miListadoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListadoNumeroActionPerformed(evt);
            }
        });
        jMenu3.add(miListadoNumero);

        miListadoContrato.setText("Por contrato");
        miListadoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListadoContratoActionPerformed(evt);
            }
        });
        jMenu3.add(miListadoContrato);

        miListadoDepartamento.setText("Por departamento");
        miListadoDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListadoDepartamentoActionPerformed(evt);
            }
        });
        jMenu3.add(miListadoDepartamento);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        mSalir.setText("Salir");
        mSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(mSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCerrarSesion)
                .addGap(281, 281, 281))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(panelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(panelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(bCerrarSesion)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaActionPerformed
        Main.identificarOperacion("alta");
        ControladorVista.mostrarVentanaPersona("alta");
       
    }//GEN-LAST:event_miAltaActionPerformed

    private void bCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarSesionActionPerformed
      // Vuelvo a mostrar usuario y contraseña.
      ControladorVista.empezar();
    }//GEN-LAST:event_bCerrarSesionActionPerformed

    private void bAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaActionPerformed
       miAlta.doClick();
    }//GEN-LAST:event_bAltaActionPerformed

    private void mSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSalirMouseClicked
        Main.terminar();
    }//GEN-LAST:event_mSalirMouseClicked

    private void miModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificacionActionPerformed
      if (solicitarNumeroEmpleado())
      { 
          Main.identificarOperacion("modificacion");
          ControladorVista.mostrarVentanaPersona("modificacion");
      }
    }//GEN-LAST:event_miModificacionActionPerformed

    private boolean solicitarNumeroEmpleado(){
        try
        {
          String nEmpleado = JOptionPane.showInputDialog(this,"Indica el número del empleado");

          // Validaciones
          if (nEmpleado.isEmpty())
              throw new CampoVacio();
          
          Integer.parseInt(nEmpleado);
          
          // Consulta en la "base de datos"
          if (Main.validarNumeroEmpleado(nEmpleado))
              //Existe un empleado con ese número
              return true;
          // No existe empleado con ese número
          throw new EmpleadoNoValido();
        }
        catch(CampoVacio e)
        {
            JOptionPane.showMessageDialog(this,"Es obligatorio indicar el número del empleado cuyos datos se desea modificar");
            return false;
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"El número del empleado es un dato numérico");
            return false;
        }
        catch(EmpleadoNoValido e)
        {
            JOptionPane.showMessageDialog(this,"No hay ningún empleado con ese número");
            return false;
        }
        catch(NullPointerException e){
            //Se produce cuando el usuario hace clic en el botón cancelar del cuadro de dialogo
           return false;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Problemas sin determinar");
            return false;
        }
    }
    private void bModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificacionActionPerformed
        miModificacion.doClick();
    }//GEN-LAST:event_bModificacionActionPerformed

    private void miListadoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListadoNumeroActionPerformed
        // Solicitamos el número del empleado cuyos datos se quieren visualizar.
        // Tras las validaciones, si es correcto mostraremos sus datos
        if (solicitarNumeroEmpleado())
             JOptionPane.showMessageDialog(this,Main.getDatosEmpleado());
  
    }//GEN-LAST:event_miListadoNumeroActionPerformed

    private void bListadoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListadoNumeroActionPerformed
        miListadoNumero.doClick();
    }//GEN-LAST:event_bListadoNumeroActionPerformed

    private void miListadoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListadoContratoActionPerformed
        ControladorVista.mostrarListadoContratos();
    }//GEN-LAST:event_miListadoContratoActionPerformed

    private void miListadoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListadoDepartamentoActionPerformed
        ControladorVista.mostrarListadoDepartamentos();
    }//GEN-LAST:event_miListadoDepartamentoActionPerformed

    private void bListadoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListadoDepartamentoActionPerformed
        miListadoDepartamento.doClick();
    }//GEN-LAST:event_bListadoDepartamentoActionPerformed

    private void bListadoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListadoContratoActionPerformed
        miListadoContrato.doClick();
    }//GEN-LAST:event_bListadoContratoActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
       Main.terminar();
    }//GEN-LAST:event_bSalirActionPerformed

    private void miBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaActionPerformed
        if (solicitarNumeroEmpleado())
        {    //Existe un empleado con ese número, pedimos confirmación
              Main.identificarOperacion("baja");
              ControladorVista.mostrarVentanaPersona("baja");
          }

    }//GEN-LAST:event_miBajaActionPerformed

    private void bBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBajaActionPerformed
        miBaja.doClick();
    }//GEN-LAST:event_bBajaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlta;
    private javax.swing.JButton bBaja;
    private javax.swing.JButton bCerrarSesion;
    private javax.swing.JButton bListadoContrato;
    private javax.swing.JButton bListadoDepartamento;
    private javax.swing.JButton bListadoNumero;
    private javax.swing.JButton bModificacion;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lNombre;
    private javax.swing.JMenu mSalir;
    private javax.swing.JMenuItem miAlta;
    private javax.swing.JMenuItem miBaja;
    private javax.swing.JMenuItem miListadoContrato;
    private javax.swing.JMenuItem miListadoDepartamento;
    private javax.swing.JMenuItem miListadoNumero;
    private javax.swing.JMenuItem miModificacion;
    private javax.swing.JPanel panelBienvenido;
    // End of variables declaration//GEN-END:variables

}

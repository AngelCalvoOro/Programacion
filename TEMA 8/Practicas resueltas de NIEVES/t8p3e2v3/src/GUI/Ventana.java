package GUI;

import Excepciones.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t8p3e2.Main;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends javax.swing.JFrame {

    private String fecha;
    // Posición vertical de las filas de hijos.
    private int vertical;
    // Array que contendrá las filas que vamos generando
    private ArrayList<ArrayList<Object>> listaObjetos = new ArrayList();
    
    public Ventana() {
        initComponents();
        
        // color de fondo (desde propiedades no funciona)
        getContentPane().setBackground(new java.awt.Color(51, 255, 0));
        
        vertical = 42;
        crearFila();
    }

    private void llenarComboAños(JComboBox cb){
        // Desde al año actual vamos restando 18
        LocalDate fecha = LocalDate.now();
        int año = fecha.getYear();
        for (int x = 0; x < 18; x++){
            cb.insertItemAt(año, x);
            año = año - 1;
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCategoria = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbFamiliar = new javax.swing.JRadioButton();
        rbIndividual = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfCorreo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bAñadir = new javax.swing.JButton();
        bInscribirse = new javax.swing.JButton();
        tfTelefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Si, deseo/deseamos hacerme/hacernos socio/s del ZooClub. Cuota de ingreso 15€");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Categoría: ");

        grupoCategoria.add(rbFamiliar);
        rbFamiliar.setText("Familiar: 68€");
        rbFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFamiliarActionPerformed(evt);
            }
        });

        grupoCategoria.add(rbIndividual);
        rbIndividual.setText("Individual: 32€");
        rbIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIndividualActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellidos:");

        jLabel6.setText("Teléfono:");

        jLabel7.setText("Correo electrónico:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenDos.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Hijos: (sólo menores de edad y en categoria familiar)");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bAñadir.setText("Añadir hijo");
        bAñadir.setEnabled(false);
        bAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(465, Short.MAX_VALUE)
                .addComponent(bAñadir)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(bAñadir)
                .addContainerGap())
        );

        bInscribirse.setText("Inscribirse");
        bInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInscribirseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(tfApellidos))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(tfNombre))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(tfTelefono))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorreo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbFamiliar)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbIndividual)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(60, 60, 60)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(bInscribirse)))
                .addGap(298, 298, 298))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rbFamiliar)
                            .addComponent(rbIndividual))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bInscribirse)
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenUno.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hoja de inscripción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void bInscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInscribirseActionPerformed
    try
    {
        if (tfNombre.getText().isEmpty() || tfApellidos.getText().isEmpty() ||  tfCorreo.getText().isEmpty() ||  tfTelefono.getText().isEmpty())
            throw new CampoObligatorio();
        validarTelefono();
        validarFormatoCorreo();
        if (rbFamiliar.isSelected())
        {
            // último hijo
            bAñadir.doClick();
            Main.inscripcionFamiliar(tfNombre.getText(),tfApellidos.getText(),tfTelefono.getText(),tfCorreo.getText());
        }
        else
            Main.inscripcionIndividual(tfNombre.getText(),tfApellidos.getText(),tfTelefono.getText(),tfCorreo.getText());
        // inicializarVentana
        Main.inicializar();
    }
     catch(CampoObligatorio e){
        javax.swing.JOptionPane.showMessageDialog(this,"En este formulario hay datos obligatorios");
    }
    catch(TelefonoNoValido e){
        javax.swing.JOptionPane.showMessageDialog(this,"El teléfono tecleado no es válido");
    }
    catch(CorreoNoValido e){
        javax.swing.JOptionPane.showMessageDialog(this,"El correo tecleado no es válido");
    }
    catch(FechaNoValida e){
        javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la fecha");
    }
    catch(Exception e){
        javax.swing.JOptionPane.showMessageDialog(this,"Problemas");
    }
}//GEN-LAST:event_bInscribirseActionPerformed

private void validarDatos() throws Exception{
     String nombre = ((JTextField) listaObjetos.get(listaObjetos.size() - 1).get(1)).getText();
     JComboBox cbDia = (JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(3);
     JComboBox cbMes = (JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(4);
     JComboBox cbAño = (JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(5);
     
     if (nombre.isEmpty() || cbDia.getSelectedIndex() == -1 || cbMes.getSelectedIndex() == -1 || cbAño.getSelectedIndex() == -1)
                    throw new CampoObligatorio();
     validarFecha(cbDia,cbMes,cbAño);
     Main.añadirHijo(nombre,fecha);
}
private void bAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadirActionPerformed
   try{
         validarDatos();
         crearFila();
   }
   catch(CampoObligatorio e){
        javax.swing.JOptionPane.showMessageDialog(this,"En este formulario hay datos obligatorios");
    }
   catch(FechaNoValida|DateTimeException e){
        javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la fecha");
    }
   catch(Exception e){
        javax.swing.JOptionPane.showMessageDialog(this,"Problemas");
    }
}//GEN-LAST:event_bAñadirActionPerformed


private void crearFila(){
    // Crear los objetos
    
      /* jLabel11 = new javax.swing.JLabel(); 
       tfNombreHijo1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbDiaNac1 = new javax.swing.JComboBox();
        cbMesNac1 = new javax.swing.JComboBox();
        cbAñoNac1 = new javax.swing.JComboBox();*/
      
    listaObjetos.add(new ArrayList());
    listaObjetos.get(listaObjetos.size() - 1).add(new javax.swing.JLabel());
    listaObjetos.get(listaObjetos.size() - 1).add(new javax.swing.JTextField());
    listaObjetos.get(listaObjetos.size() - 1).add(new javax.swing.JLabel());
    listaObjetos.get(listaObjetos.size() - 1).add(new javax.swing.JComboBox());
    listaObjetos.get(listaObjetos.size() - 1).add(new javax.swing.JComboBox());
    listaObjetos.get(listaObjetos.size() - 1).add(new javax.swing.JComboBox());
  
    // Propiedades
    /*
    jLabel11.setText("Nombre:");

        tfNombreHijo1.setEnabled(false);

        jLabel12.setText("Fecha de nac.:");

        cbDiaNac1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", 
"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDiaNac1.setEnabled(false);

        cbMesNac1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbMesNac1.setSelectedIndex(-1);
        cbMesNac1.setEnabled(false);
        cbAñoNac1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbAñoNac1.setEnabled(false);
    */
    
    JLabel e = (JLabel) listaObjetos.get(listaObjetos.size() - 1).get(0);
    e.setText("Nombre:");
    //JTextField c = (JTextField)listaObjetos.get(listaObjetos.size() - 1).get(1);
    e = (JLabel) listaObjetos.get(listaObjetos.size() - 1).get(2);
    e.setText("Fecha de nac.:");
    JComboBox cbDia = (JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(3);
    cbDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", 
"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
    JComboBox cbMes = (JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(4);
    cbMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
    cbMes.setSelectedIndex(-1);
    JComboBox cbAño = (JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(5);
    cbAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
    
    // Ubicar
     javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent((JLabel) listaObjetos.get(listaObjetos.size() - 1).get(0))
                .addGap(18, 18, 18)
                .addComponent((JTextField) listaObjetos.get(listaObjetos.size() - 1).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent((JLabel) listaObjetos.get(listaObjetos.size() - 1).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(4), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(5), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bAñadir)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(vertical, vertical, vertical)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent((JLabel) listaObjetos.get(listaObjetos.size() - 1).get(0))
                    .addComponent((JTextField) listaObjetos.get(listaObjetos.size() - 1).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent((JLabel) listaObjetos.get(listaObjetos.size() - 1).get(2))
                    .addComponent((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(4), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(5), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(bAñadir)
                .addContainerGap())
        );

    pack();
    // Los datos del siguiente hijo más abajo
    vertical += 30;
    // LLenar la combo de los años.
    llenarComboAños((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(5));


}

private void rbFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFamiliarActionPerformed
// habilitar
    Main.crearListaHijos();
    ((JTextField) listaObjetos.get(listaObjetos.size() - 1).get(1)).setEnabled(true);
    ((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(3)).setEnabled(true);
    ((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(4)).setEnabled(true);
    ((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(5)).setEnabled(true);
    bAñadir.setEnabled(true);
    
}//GEN-LAST:event_rbFamiliarActionPerformed

private void rbIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIndividualActionPerformed
// deshabilitar por si acaso
   ((JTextField) listaObjetos.get(listaObjetos.size() - 1).get(1)).setEnabled(false);
    ((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(3)).setEnabled(false);
    ((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(4)).setEnabled(false);
    ((JComboBox) listaObjetos.get(listaObjetos.size() - 1).get(5)).setEnabled(false);
    bAñadir.setEnabled(false);
}//GEN-LAST:event_rbIndividualActionPerformed

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    // listado de salida
    javax.swing.JOptionPane.showMessageDialog(this,Main.generaListado());
}//GEN-LAST:event_formWindowClosing

  
  public void validarFormatoCorreo()throws Exception{        
        Pattern pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        Matcher mat = pat.matcher(tfCorreo.getText());
        if (mat.find()== false) 
           throw new CorreoNoValido();
  }
  
  public void validarTelefono()throws Exception{        
        Pattern pat = Pattern.compile("^[6789][0-9]{8}$");
        Matcher mat = pat.matcher(tfTelefono.getText());
        if (mat.find()== false) 
           throw new TelefonoNoValido();
  }
  
  public void validarFecha(JComboBox cbDia,JComboBox cbMes, JComboBox cbAño)throws Exception{
      int dia = Integer.parseInt(cbDia.getSelectedItem().toString());
      int mes = Integer.parseInt(cbMes.getSelectedItem().toString());
      int año = Integer.parseInt(cbAño.getSelectedItem().toString());
      LocalDate f = LocalDate.of(año,mes,dia); 
      // si la fecha no es lógica salta la exception DateTimeParseException
      fecha = f.toString();
      // En la clase he usado tipo de datos String
       // que no sea superior a la actual
      if (f.isAfter(LocalDate.now())) 
          throw new FechaNoValida();
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
    private javax.swing.JButton bAñadir;
    private javax.swing.JButton bInscribirse;
    private javax.swing.ButtonGroup grupoCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbFamiliar;
    private javax.swing.JRadioButton rbIndividual;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}

package GUI;

import Excepciones.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t7p3e2.Main;

public class Ventana extends javax.swing.JFrame {

    private String fecha;
    private int numeroHijos;
    
    public Ventana() {
       initComponents();
       getContentPane().setBackground(new java.awt.Color(51, 255, 0));
       llenarComboAños();
       cbDiaNac.setSelectedIndex(-1);
      
       
       
        numeroHijos = 0;
        ocultarHijos();
    }

    public void ocultarHijos(){
        ocultar1();
        ocultar2();
        
        // También se puede con un único método que reciba como parámetros los elementos que tiene que ocultar
        // ocultar(jLabel1,tfNombreHijo1,jLabel12,cbDiaNac1,.........);
    }
    
    public void ocultar1()
    {
        jLabel11.setVisible(false);
        tfNombreHijo1.setVisible(false);
        jLabel12.setVisible(false);
        cbDiaNac1.setVisible(false);
        cbMesNac1.setVisible(false);
        cbAñoNac1.setVisible(false);
        bQuitarHijo1.setVisible(false);
    }
    
    public void visualizar1()
    {
        jLabel11.setVisible(true);
        tfNombreHijo1.setVisible(true);
        jLabel12.setVisible(true);
        cbDiaNac1.setVisible(true);
        cbMesNac1.setVisible(true);
        cbAñoNac1.setVisible(true);
        bQuitarHijo1.setVisible(true);
    }
    
    public void ocultar2()
    {
        // Si todos los elementos están en un panel, ocultando el panel ocultamos todo
       /* jLabel14.setVisible(false);
        tfNombreHijo2.setVisible(false);
        jLabel13.setVisible(false);
        cbDiaNac2.setVisible(false);
        cbMesNac2.setVisible(false);
        cbAñoNac2.setVisible(false);*/
        jPanelHijo3.setVisible(false);
    }
    
    public void visualizar2()
    {
       /* jLabel14.setVisible(true);
        tfNombreHijo2.setVisible(true);
        jLabel13.setVisible(true);
        cbDiaNac2.setVisible(true);
        cbMesNac2.setVisible(true);
        cbAñoNac2.setVisible(true);*/
        jPanelHijo3.setVisible(true);
    }
    
   
    public void llenarComboAños(){
        // Desde al año actual vamos restando 18
        Calendar c = Calendar.getInstance();
        int año = c.get(Calendar.YEAR);
        for (int x = 0; x < 18; x++){
            cbAñoNac.insertItemAt(año, x);
            cbAñoNac1.addItem(año);
            cbAñoNac2.addItem(año);
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
        jLabel9 = new javax.swing.JLabel();
        tfNombreHijo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbDiaNac = new javax.swing.JComboBox();
        cbMesNac = new javax.swing.JComboBox();
        cbAñoNac = new javax.swing.JComboBox();
        bAñadir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfNombreHijo1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbDiaNac1 = new javax.swing.JComboBox();
        cbMesNac1 = new javax.swing.JComboBox();
        cbAñoNac1 = new javax.swing.JComboBox();
        bQuitarHijo = new javax.swing.JButton();
        bQuitarHijo1 = new javax.swing.JButton();
        jPanelHijo3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tfNombreHijo2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbDiaNac2 = new javax.swing.JComboBox();
        cbMesNac2 = new javax.swing.JComboBox();
        cbAñoNac2 = new javax.swing.JComboBox();
        bQuitarHijo2 = new javax.swing.JButton();
        bInscribirse = new javax.swing.JButton();
        ftfTelefono = new javax.swing.JFormattedTextField();
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

        jLabel9.setText("Nombre:");

        tfNombreHijo.setEnabled(false);

        jLabel10.setText("Fecha de nac.:");

        cbDiaNac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDiaNac.setEnabled(false);

        cbMesNac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbMesNac.setSelectedIndex(-1);
        cbMesNac.setEnabled(false);

        cbAñoNac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbAñoNac.setEnabled(false);

        bAñadir.setText("Añadir hijo");
        bAñadir.setEnabled(false);
        bAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadirActionPerformed(evt);
            }
        });

        jLabel11.setText("Nombre:");

        jLabel12.setText("Fecha de nac.:");

        cbDiaNac1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDiaNac1.setSelectedIndex(-1);

        cbMesNac1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbMesNac1.setSelectedIndex(-1);

        cbAñoNac1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        bQuitarHijo.setForeground(new java.awt.Color(255, 0, 0));
        bQuitarHijo.setText("X");

        bQuitarHijo1.setForeground(new java.awt.Color(255, 0, 0));
        bQuitarHijo1.setText("X");

        jPanelHijo3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel14.setText("Nombre:");

        jLabel13.setText("Fecha de nacimiento");

        cbDiaNac2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDiaNac2.setSelectedIndex(-1);

        cbMesNac2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbMesNac2.setSelectedIndex(-1);

        cbAñoNac2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        bQuitarHijo2.setForeground(new java.awt.Color(255, 0, 0));
        bQuitarHijo2.setText("X");

        javax.swing.GroupLayout jPanelHijo3Layout = new javax.swing.GroupLayout(jPanelHijo3);
        jPanelHijo3.setLayout(jPanelHijo3Layout);
        jPanelHijo3Layout.setHorizontalGroup(
            jPanelHijo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHijo3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(tfNombreHijo2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDiaNac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMesNac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAñoNac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bQuitarHijo2)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanelHijo3Layout.setVerticalGroup(
            jPanelHijo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHijo3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanelHijo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHijo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbDiaNac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbMesNac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbAñoNac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bQuitarHijo2))
                    .addGroup(jPanelHijo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(tfNombreHijo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bAñadir)
                .addGap(67, 67, 67))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(tfNombreHijo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAñoNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bQuitarHijo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(tfNombreHijo1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDiaNac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbMesNac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAñoNac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bQuitarHijo1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelHijo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfNombreHijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAñoNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bQuitarHijo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfNombreHijo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbDiaNac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMesNac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAñoNac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bQuitarHijo1))
                .addGap(18, 18, 18)
                .addComponent(jPanelHijo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bAñadir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bInscribirse.setText("Inscribirse");
        bInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInscribirseActionPerformed(evt);
            }
        });

        try {
            ftfTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ftfTelefono)
                                            .addComponent(tfApellidos)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(tfNombre))))
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(bInscribirse)
                .addGap(184, 184, 184))
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
                            .addComponent(ftfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bInscribirse)
                        .addGap(240, 240, 240))))
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
        if (tfNombre.getText().isEmpty() || tfApellidos.getText().isEmpty() ||  tfCorreo.getText().isEmpty() )
            throw new CampoObligatorio();
        if (ftfTelefono.getText().compareTo("         ")==0)
            throw new TelefonoNoValido();
        validarFormatoCorreo();
        if (rbFamiliar.isSelected())
        {
            // último hijo
            bAñadir.doClick();
            Main.inscripcionFamiliar(tfNombre.getText(),tfApellidos.getText(),ftfTelefono.getText(),tfCorreo.getText());
        }
        else
            Main.inscripcionIndividual(tfNombre.getText(),tfApellidos.getText(),ftfTelefono.getText(),tfCorreo.getText());
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

private void añadir(String nombre,javax.swing.JComboBox dia,javax.swing.JComboBox mes,javax.swing.JComboBox año) throws Exception
{
         if (nombre.isEmpty() || dia.getSelectedIndex() == -1 || mes.getSelectedIndex() == -1 || año.getSelectedIndex() == -1)
                    throw new CampoObligatorio();
         validarFecha(dia,mes,año);
         Main.añadirHijo(nombre,fecha);
         
 }
private void bAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadirActionPerformed
   try{
        switch(numeroHijos)
        {
            case 0:
                añadir(tfNombreHijo.getText(),cbDiaNac,cbMesNac,cbAñoNac);
                numeroHijos = numeroHijos + 1;
                visualizar1();
                break;
            case 1:
                añadir(tfNombreHijo1.getText(),cbDiaNac1,cbMesNac1,cbAñoNac1);
                numeroHijos = numeroHijos + 1;
                visualizar2();
                break;
            case 2:
                añadir(tfNombreHijo2.getText(),cbDiaNac2,cbMesNac2,cbAñoNac2);
                
                // Como no tengo más filas vuelvo a empezar
                limpiar(tfNombreHijo,cbDiaNac,cbMesNac,cbAñoNac);
                numeroHijos = 0;
                ocultarHijos();
                limpiar(tfNombreHijo1,cbDiaNac1,cbMesNac1,cbAñoNac1);
                limpiar(tfNombreHijo2,cbDiaNac2,cbMesNac2,cbAñoNac2);
                
                break;
        }
   }
   catch(CampoObligatorio e){
        javax.swing.JOptionPane.showMessageDialog(this,"En este formulario hay datos obligatorios");
    }
    catch(FechaNoValida e){
        javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la fecha");
    }
   catch(Exception e){
        javax.swing.JOptionPane.showMessageDialog(this,"Problemas");
    }
}//GEN-LAST:event_bAñadirActionPerformed

private void rbFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFamiliarActionPerformed
// habilitar
    Main.crearListaHijos();
    tfNombreHijo.setEnabled(true);
    cbDiaNac.setEnabled(true);
    cbMesNac.setEnabled(true);
    cbAñoNac.setEnabled(true);
    bAñadir.setEnabled(true);
    
}//GEN-LAST:event_rbFamiliarActionPerformed

private void rbIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIndividualActionPerformed
// deshabilitar
   tfNombreHijo.setEnabled(false); 
   cbDiaNac.setEnabled(false);
    cbMesNac.setEnabled(false);
    cbAñoNac.setEnabled(false);
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
  
  public void validarFecha(javax.swing.JComboBox dia,javax.swing.JComboBox mes,javax.swing.JComboBox año)throws Exception{
       fecha = dia.getSelectedItem().toString() + '-' + mes.getSelectedItem().toString() + '-' + año.getSelectedItem().toString();
      
       DateFormat df= new SimpleDateFormat("dd-MM-yyyy");
       Date d=df.parse(fecha); 
       // para controlar si me lo ha cambiado 31-2-2000 me pone 2 de marzo
       if (!df.format(d).equals(fecha))
           throw new FechaNoValida();
       
       // que no sea superior a la actual
      if (d.after(Calendar.getInstance().getTime())) 
          throw new FechaNoValida();
  }
  
  public void limpiar(javax.swing.JTextField n, javax.swing.JComboBox dia,javax.swing.JComboBox mes,javax.swing.JComboBox año){
      n.setText("");
      dia.setSelectedIndex(-1);
      mes.setSelectedIndex(-1);
      año.setSelectedIndex(-1);
      
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
    private javax.swing.JButton bQuitarHijo;
    private javax.swing.JButton bQuitarHijo1;
    private javax.swing.JButton bQuitarHijo2;
    private javax.swing.JComboBox cbAñoNac;
    private javax.swing.JComboBox cbAñoNac1;
    private javax.swing.JComboBox cbAñoNac2;
    private javax.swing.JComboBox cbDiaNac;
    private javax.swing.JComboBox cbDiaNac1;
    private javax.swing.JComboBox cbDiaNac2;
    private javax.swing.JComboBox cbMesNac;
    private javax.swing.JComboBox cbMesNac1;
    private javax.swing.JComboBox cbMesNac2;
    private javax.swing.JFormattedTextField ftfTelefono;
    private javax.swing.ButtonGroup grupoCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelHijo3;
    private javax.swing.JRadioButton rbFamiliar;
    private javax.swing.JRadioButton rbIndividual;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombreHijo;
    private javax.swing.JTextField tfNombreHijo1;
    private javax.swing.JTextField tfNombreHijo2;
    // End of variables declaration//GEN-END:variables
}

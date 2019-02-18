

package Vista;
import Excepciones.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import t8p4e1.Main;

public class VentanaPersona extends javax.swing.JFrame {

    private LocalDate fecha;
    
    //Variable que indicará el tipo de operación que se quiere realizar
    //Posibles valores: Alta, baja y modificacion.
    private String operacion;
    
    
    public VentanaPersona() {
        initComponents();
        
    }

    public VentanaPersona(String operacion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.operacion = operacion;
        
        Main.llenarContratos(cbContratos);
        Main.llenarDepartamentos(cbDepartamentos);

        if (operacion.compareTo("alta")!=0)
        {
            // Baja o modificación
            mostrarDatos();
        }
        
        // Si es alta todo tal y como está en diseño

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        grupoEstadoCivil = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfNombreApellidos = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        rbHombre = new javax.swing.JRadioButton();
        rbMujer = new javax.swing.JRadioButton();
        rbSoltero = new javax.swing.JRadioButton();
        rbCasado = new javax.swing.JRadioButton();
        cbContratos = new javax.swing.JComboBox();
        cbDepartamentos = new javax.swing.JComboBox();
        tfNumeroEmpleado = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        tfDni = new javax.swing.JFormattedTextField();
        tfNss = new javax.swing.JFormattedTextField();
        tfFechaAlta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta, baja o modificación de los datos de un trabajador");

        jLabel1.setText("DNI");

        jLabel2.setText("NSS");

        jLabel3.setText("Nombre y apellidos");

        jLabel4.setText("Dirección");

        jLabel5.setText("Sexo");

        jLabel6.setText("Estado civil");

        jLabel7.setText("Teléfono");

        jLabel8.setText("Tipo de contrato");

        jLabel9.setText("Departamento");

        jLabel10.setText("Fecha de alta");

        jLabel11.setText("Número de empleado");

        grupoSexo.add(rbHombre);
        rbHombre.setText("Hombre");

        grupoSexo.add(rbMujer);
        rbMujer.setText("Mujer");

        grupoEstadoCivil.add(rbSoltero);
        rbSoltero.setText("Solter@");

        grupoEstadoCivil.add(rbCasado);
        rbCasado.setText("Casad@");

        cbContratos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbContratos.setSelectedIndex(-1);

        cbDepartamentos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbDepartamentos.setSelectedIndex(-1);

        tfNumeroEmpleado.setEditable(false);

        bAceptar.setText("Aceptar");
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

        try {
            tfDni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfNss.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/####/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(tfNumeroEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbDepartamentos, 0, 269, Short.MAX_VALUE)
                                    .addComponent(cbContratos, 0, 269, Short.MAX_VALUE)
                                    .addComponent(tfFechaAlta)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNss, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(tfDni, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(tfDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(tfNombreApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbHombre)
                                    .addComponent(rbSoltero))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbMujer)
                                    .addComponent(rbCasado))))))
                .addContainerGap(104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNombreApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbHombre)
                            .addComponent(rbMujer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbCasado)
                            .addComponent(rbSoltero))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbContratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfNumeroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(bCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAceptar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarDatos(){
         tfDni.setText(Main.getDni());
         tfNss.setValue(Main.getNss());
         tfNombreApellidos.setText(Main.getNombreApellidos());
         tfDireccion.setText(Main.getDireccion());
         tfTelefono.setText(Main.getTelefono());

         if (Main.getSexo() == 'H')
             rbHombre.setSelected(true);
         else
             rbMujer.setSelected(true);

         if (Main.getEstadoCivil() == 'S')
             rbSoltero.setSelected(true);
         else
             rbCasado.setSelected(true);

         cbContratos.setSelectedItem(Main.getDescripcion());
         cbDepartamentos.setSelectedItem(Main.getNombre());
         // tfFechaAlta.setText(Main.getFechaAlta()); año-dia-mes
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        tfFechaAlta.setText( Main.getFechaAlta().format(dtf));
        tfNumeroEmpleado.setText(Main.getNumeroEmpleado());
         
         // No todo se puede modificar
         tfDni.setEditable(false);
         tfNss.setEditable(false);
         tfNumeroEmpleado.setEditable(false);
         
         // Si es una baja no pueden modificar nada.
         if (operacion.equals("baja"))
         {
            tfNombreApellidos.setEditable(false);
            tfDireccion.setEditable(false);
            tfTelefono.setEditable(false);
            grupoSexo.getSelection().setEnabled(false);
            grupoEstadoCivil.getSelection().setEnabled(false);
            cbContratos.setEditable(false);
            cbDepartamentos.setEditable(false);
            tfFechaAlta.setEditable(false);
         }
    }
    
    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
      try
      {
          if (operacion.equals("baja"))
          {
              int respuesta = JOptionPane.showConfirmDialog(this, "¿Estas seguro? Ten en cuenta que los datos se perderán","IMPORTANTE",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
              if (respuesta == 0)
                  //Borro
                  if (Main.bajaPersona())
                      JOptionPane.showMessageDialog(this,"Persona borrada");
          }
          else
          {
            // alta o modificación
            if (datosCorrectos())
            {
               //Obtengo los valores asociados a los radioButtons
               Character valorSexo;
               if (rbHombre.isSelected())
                       valorSexo = 'H';
               else
                       valorSexo = 'M';

            Character valorEstadoCivil;
            if (rbSoltero.isSelected())
                    valorEstadoCivil = 'S';
            else
                    valorEstadoCivil = 'C';

            //ALTA
            if (operacion.compareTo("alta")==0)
            {
                String numeroEmpleado = Main.altaPersona(tfDni.getText(),tfNss.getText(), tfNombreApellidos.getText(), tfDireccion.getText(), tfTelefono.getText(), valorSexo, valorEstadoCivil, cbContratos.getSelectedIndex(), cbDepartamentos.getSelectedIndex(), fecha);
                tfNumeroEmpleado.setText(numeroEmpleado);
                JOptionPane.showMessageDialog(this, "Empleado creado correctamente");
                //Si además es del departamento de gestión, mostramos usuario y contraseña
                if (String.valueOf(cbDepartamentos.getSelectedItem()).compareTo("Gestión")== 0)
                     JOptionPane.showMessageDialog(this,Main.getNombreContraseña());
            }
            else
            {
                //Supongo que es modificación
                String mensaje = Main.modificarPersona(tfNombreApellidos.getText(), tfDireccion.getText(), tfTelefono.getText(), valorSexo, valorEstadoCivil, cbContratos.getSelectedIndex(), cbDepartamentos.getSelectedIndex(), fecha);
                JOptionPane.showMessageDialog(this,mensaje);
             }
            }
           }
           ControladorVista.volverVentanaPrincipal(this);
      }
     catch(Exception e){
           JOptionPane.showMessageDialog(this,"Problemas a la hora de realizar la operación");
     }

    }//GEN-LAST:event_bAceptarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        ControladorVista.volverVentanaPrincipal(this);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void validarDni() throws Exception{
        if (tfDni.getValue()== null)
                throw new CampoVacio("Dni");
        //Si el dni no cumple con la máscara, también entra en CampoVacio ya que java lo quita
        
        // Generar dni validos http://niednicifgenerador.appspot.com/
        //No está vacío por lo que sólo me falta validar la letra
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKET";
        // Quitar los puntos y poder convertir en un número
        String dni = tfDni.getText().substring(0, 2);
        dni += tfDni.getText().substring(3, 6);
        dni += tfDni.getText().substring(7, 10);
        
        int modulo= Integer.parseInt(dni) % 23;
        
        char letra = juegoCaracteres.charAt(modulo);
        if (tfDni.getText().charAt(11)!= letra)
                throw new DniNoValido();
        
        //En el caso de la modificación sólo valido el DNI si lo han cambiado
        // if (operacion.compareTo("alta")== 0 || (operacion.compareTo("modificacion")== 0 && tfDni.getText().compareTo(oPersona.getDni())!= 0))
       
        // Falta comprobar que no existe ya una persona con este DNI
        if (operacion.compareTo("alta")== 0)
            if (Main.validarDni(tfDni.getText())== true)
                throw new DniRepetido();
    }
    private void validarNss() throws Exception{
        if (tfNss.getValue() == null)
                throw new CampoVacio("Nss");
        
        // Para el formato tengo mascara
        
        // Sólo falta comprobar que no está repetido
        if ((operacion.compareTo("alta")== 0) )
                if (Main.validarNss(tfNss.getText())== true)
                    throw new NssRepetido();
    }
    
    private void validarTexto() throws Exception{
        if (tfNombreApellidos.getText().isEmpty())
                throw new CampoVacio("Nombre");
        if (tfDireccion.getText().isEmpty())
                throw new CampoVacio("Direccion");
        if (tfTelefono.getText().isEmpty())
                throw new CampoVacio("Telefono");
    }
    
    private void validarTelefono() throws Exception{
        Pattern pat = Pattern.compile("^[6789]{1}[0-9]{8}$");
        Matcher mat = pat.matcher(tfTelefono.getText());
        if (mat.matches()==false) 
           throw new TelefonoNoValido();
    }
    
    private void validarSexo() throws Exception{
        if (rbHombre.isSelected() == false && rbMujer.isSelected() == false)
            throw new CampoVacio("Sexo");
    }
    
    private void validarEstadoCivil() throws Exception{
        if (rbSoltero.isSelected() == false && rbCasado.isSelected() == false)
            throw new CampoVacio("Estado");
    }
    private void validarContrato() throws Exception{
        if (cbContratos.getSelectedIndex()== -1)
                throw new CampoVacio("Contrato");
    }
    
    private void validarDepartamento() throws Exception{
        if (cbDepartamentos.getSelectedIndex()== -1)
                throw new CampoVacio("Departamento");
    }
    
    private void validarFecha() throws Exception{
       if (tfFechaAlta.getText()== null)
                throw new CampoVacio("Fecha");
            
       
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
	//convert String to LocalDate
       fecha = LocalDate.parse(tfFechaAlta.getText(), formatter);
       
       // que no sea posterior a la actual
      if (fecha.isAfter(LocalDate.now()) )
          throw new FechaNoValida();
    }
    
    
    private boolean datosCorrectos(){
        //Valida todos los datos de la ventana
        try
        {
            if (operacion.equals("alta"))
            {
                validarDni();
                validarNss();
                validarTexto();
                validarTelefono();
                validarSexo();
                validarEstadoCivil();
                validarContrato();
                validarDepartamento();
                validarFecha();

                return true;
            }
            else
            {
                // Modificación
                validarTexto();
                validarTelefono();
                validarSexo();
                validarEstadoCivil();
                validarContrato();
                validarDepartamento();
                validarFecha();

                return true;
            }
        }
        catch(CampoVacio e){
            JOptionPane.showMessageDialog(this,e.getMessage());
            return false;
        }
        catch(DniNoValido e){
            JOptionPane.showMessageDialog(this,"El DNI tecledo no es válido");
            return false;
        }
        catch(DniRepetido e){
            JOptionPane.showMessageDialog(this,"Ya existe un empleado con ese DNI");
            return false;
        }
         catch(NssRepetido e){
            JOptionPane.showMessageDialog(this,"Ya existe un empleado con ese número de la seguridad social");
            return false;
        }
        catch(TelefonoNoValido e){
            JOptionPane.showMessageDialog(this,"El dato indicado no es un número de teléfono lógico");
            return false;
        }
        catch(FechaNoValida e){
            JOptionPane.showMessageDialog(this,"La fecha indicada no es válida");
            return false;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Problemas:" + e.getMessage());
            return false;
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JComboBox cbContratos;
    private javax.swing.JComboBox cbDepartamentos;
    private javax.swing.ButtonGroup grupoEstadoCivil;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbHombre;
    private javax.swing.JRadioButton rbMujer;
    private javax.swing.JRadioButton rbSoltero;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JFormattedTextField tfDni;
    private javax.swing.JTextField tfFechaAlta;
    private javax.swing.JTextField tfNombreApellidos;
    private javax.swing.JFormattedTextField tfNss;
    private javax.swing.JTextField tfNumeroEmpleado;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables

}

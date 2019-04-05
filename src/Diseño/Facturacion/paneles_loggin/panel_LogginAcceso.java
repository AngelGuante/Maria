package Diseño.Facturacion.paneles_loggin;

import Diseño.Facturacion.ventanas_bases.Ventana_logginBase;
import java.util.ArrayList;

public class panel_LogginAcceso extends Diseño.Facturacion.paneles_base.PanelBase_Loggin {

    public panel_LogginAcceso() {
        initComponents();
        detallesComponentes();
        modificarComponentesPanelPadre();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelLogginAcceso_buttonGroupRecordar = new javax.swing.ButtonGroup();
        panelLogginAcceso_textFieldNombre = new javax.swing.JTextField();
        panelLogginAcceso_textFieldContraseña = new javax.swing.JPasswordField();
        panelLogginAcceso_botonAcceder = new javax.swing.JButton();
        panelLogginAcceso_labelContraseñaIncorrecta = new javax.swing.JLabel();
        panelLogginAcceso_botonVerContraseña = new javax.swing.JButton();
        panelLogginAcceso_labelVerContraseña = new javax.swing.JLabel();
        radioNada = new javax.swing.JRadioButton();
        radioNombreContrasenia = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        radioNombre = new javax.swing.JRadioButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/FondoBloqueo.png"))); // NOI18N

        panelLogginAcceso_textFieldNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelLogginAcceso_textFieldNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nombre de Usuario"));
        panelLogginAcceso_textFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelLogginAcceso_textFieldNombreFocusGained(evt);
            }
        });
        panelLogginAcceso_textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelLogginAcceso_textFieldNombreActionPerformed(evt);
            }
        });
        panelLogginAcceso_textFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelLogginAcceso_textFieldNombreKeyPressed(evt);
            }
        });
        add(panelLogginAcceso_textFieldNombre);
        panelLogginAcceso_textFieldNombre.setBounds(0, 10, 220, 50);

        panelLogginAcceso_textFieldContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contraseña"));
        panelLogginAcceso_textFieldContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelLogginAcceso_textFieldContraseñaFocusGained(evt);
            }
        });
        panelLogginAcceso_textFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelLogginAcceso_textFieldContraseñaActionPerformed(evt);
            }
        });
        panelLogginAcceso_textFieldContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                panelLogginAcceso_textFieldContraseñaKeyTyped(evt);
            }
        });
        add(panelLogginAcceso_textFieldContraseña);
        panelLogginAcceso_textFieldContraseña.setBounds(0, 60, 220, 50);

        panelLogginAcceso_botonAcceder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelLogginAcceso_botonAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/login.png"))); // NOI18N
        panelLogginAcceso_botonAcceder.setText("Acceder");
        panelLogginAcceso_botonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelLogginAcceso_botonAccederActionPerformed(evt);
            }
        });
        add(panelLogginAcceso_botonAcceder);
        panelLogginAcceso_botonAcceder.setBounds(0, 190, 110, 25);

        panelLogginAcceso_labelContraseñaIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        panelLogginAcceso_labelContraseñaIncorrecta.setText("*Datos incorrectos*");
        add(panelLogginAcceso_labelContraseñaIncorrecta);
        panelLogginAcceso_labelContraseñaIncorrecta.setBounds(0, 110, 140, 14);

        panelLogginAcceso_botonVerContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelLogginAcceso_botonVerContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eye.png"))); // NOI18N
        panelLogginAcceso_botonVerContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelLogginAcceso_botonVerContraseñaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelLogginAcceso_botonVerContraseñaMouseReleased(evt);
            }
        });
        add(panelLogginAcceso_botonVerContraseña);
        panelLogginAcceso_botonVerContraseña.setBounds(190, 110, 30, 20);

        panelLogginAcceso_labelVerContraseña.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelLogginAcceso_labelVerContraseña.setForeground(new java.awt.Color(0, 0, 204));
        add(panelLogginAcceso_labelVerContraseña);
        panelLogginAcceso_labelVerContraseña.setBounds(80, 160, 220, 20);

        panelLogginAcceso_buttonGroupRecordar.add(radioNada);
        radioNada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radioNada.setForeground(new java.awt.Color(255, 255, 255));
        radioNada.setSelected(true);
        radioNada.setText("No Recordar");
        add(radioNada);
        radioNada.setBounds(220, 80, 110, 23);

        panelLogginAcceso_buttonGroupRecordar.add(radioNombreContrasenia);
        radioNombreContrasenia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radioNombreContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        radioNombreContrasenia.setText("Nombre y Contraseña");
        add(radioNombreContrasenia);
        radioNombreContrasenia.setBounds(220, 40, 160, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Recordar:");
        add(jLabel2);
        jLabel2.setBounds(220, 20, 80, 17);

        panelLogginAcceso_buttonGroupRecordar.add(radioNombre);
        radioNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radioNombre.setForeground(new java.awt.Color(255, 255, 255));
        radioNombre.setText("Sólo Nombre");
        add(radioNombre);
        radioNombre.setBounds(220, 60, 110, 23);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    private void panelLogginAcceso_botonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelLogginAcceso_botonAccederActionPerformed
        loggin();
    }//GEN-LAST:event_panelLogginAcceso_botonAccederActionPerformed

    private void panelLogginAcceso_textFieldContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelLogginAcceso_textFieldContraseñaFocusGained
        panelLogginAcceso_labelContraseñaIncorrecta.setVisible(false);
    }//GEN-LAST:event_panelLogginAcceso_textFieldContraseñaFocusGained

    private void panelLogginAcceso_textFieldNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelLogginAcceso_textFieldNombreFocusGained
        panelLogginAcceso_labelContraseñaIncorrecta.setVisible(false);
    }//GEN-LAST:event_panelLogginAcceso_textFieldNombreFocusGained

    private void panelLogginAcceso_textFieldContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelLogginAcceso_textFieldContraseñaKeyTyped
        //Verifica que el tamaño del campo de  contraseña sea mayor a 0 pararecer el boton "ver contraseña"
        panelLogginAcceso_labelVerContraseña.setText(Logica.herramientas.passwordToString(panelLogginAcceso_textFieldContraseña.getPassword()) + "*");
        if (Logica.herramientas.passwordToString(panelLogginAcceso_textFieldContraseña.getPassword()).length() > 0) {
            panelLogginAcceso_botonVerContraseña.setVisible(true);
        } else {
            panelLogginAcceso_botonVerContraseña.setVisible(false);
        }
    }//GEN-LAST:event_panelLogginAcceso_textFieldContraseñaKeyTyped

    private void panelLogginAcceso_botonVerContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLogginAcceso_botonVerContraseñaMousePressed
        panelLogginAcceso_labelVerContraseña.setVisible(true);
    }//GEN-LAST:event_panelLogginAcceso_botonVerContraseñaMousePressed

    private void panelLogginAcceso_botonVerContraseñaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLogginAcceso_botonVerContraseñaMouseReleased
        panelLogginAcceso_labelVerContraseña.setVisible(false);
    }//GEN-LAST:event_panelLogginAcceso_botonVerContraseñaMouseReleased

    private void panelLogginAcceso_textFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelLogginAcceso_textFieldNombreKeyPressed
        panelLogginAcceso_textFieldContraseña.setText("");
    }//GEN-LAST:event_panelLogginAcceso_textFieldNombreKeyPressed

    private void panelLogginAcceso_textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelLogginAcceso_textFieldNombreActionPerformed
        panelLogginAcceso_textFieldContraseña.requestFocus();
    }//GEN-LAST:event_panelLogginAcceso_textFieldNombreActionPerformed

    private void panelLogginAcceso_textFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelLogginAcceso_textFieldContraseñaActionPerformed
        loggin();
    }//GEN-LAST:event_panelLogginAcceso_textFieldContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton panelLogginAcceso_botonAcceder;
    private javax.swing.JButton panelLogginAcceso_botonVerContraseña;
    private javax.swing.ButtonGroup panelLogginAcceso_buttonGroupRecordar;
    private javax.swing.JLabel panelLogginAcceso_labelContraseñaIncorrecta;
    private javax.swing.JLabel panelLogginAcceso_labelVerContraseña;
    public static javax.swing.JPasswordField panelLogginAcceso_textFieldContraseña;
    public static javax.swing.JTextField panelLogginAcceso_textFieldNombre;
    public static javax.swing.JRadioButton radioNada;
    public static javax.swing.JRadioButton radioNombre;
    public static javax.swing.JRadioButton radioNombreContrasenia;
    // End of variables declaration//GEN-END:variables

    private void detallesComponentes() {
        panelLogginAcceso_botonVerContraseña.setVisible(false);
        panelLogginAcceso_labelVerContraseña.setVisible(false);

        //AUTOCOMPLETER textField 
        setDatosEmpleadosAutoCompleter("campo_loggin_empleado");
    }

    private void modificarComponentesPanelPadre() {
        panelLogginAcceso_labelContraseñaIncorrecta.setVisible(false);
    }

    //**************************************************************//
    //************************* Metodos ****************************//
    //*************************************************************//
    //Limpia el campo de contraseña para cuando se cierre seccion
    public static void resertPanel() {
        panelLogginAcceso_textFieldNombre.setText("");
        panelLogginAcceso_textFieldContraseña.setText("");
        if (DataBase.Facturacion.DatosFuncionamiento.Select.Datos()[4].equals("NC")) {
            panelLogginAcceso_textFieldNombre.setText(
                    DataBase.Facturacion.DatosFuncionamiento.Select.Datos()[5]);
            panelLogginAcceso_textFieldContraseña.setText(
                    DataBase.Facturacion.DatosFuncionamiento.Select.Datos()[6]);
        } else if (DataBase.Facturacion.DatosFuncionamiento.Select.Datos()[4]
                .equals("N")) {
            panelLogginAcceso_textFieldNombre.setText(
                    DataBase.Facturacion.DatosFuncionamiento.Select.Datos()[5]);
        }
    }

    /**
     * Retorna ArrayList con los datos, claveUsuario y nombreUsuario de los
     * usuarios con acceso al sistema y que estan activos.
     *
     * @param nombreCampo
     */
    public static void setDatosEmpleadosAutoCompleter(String nombreCampo) {
        ArrayList<String> usuarios = new ArrayList<>();
        try (java.sql.ResultSet rs = DataBase.Facturacion.Empleado.Select.soloEmpleadosConAcceso()) {
            while (rs.next()) {
                usuarios.add(rs.getString("claveEmpleado")
                        + " - "
                        + rs.getString("nombreEmpleado")
                        + " "
                        + rs.getString("apellidoEmpleado"));
            }
            rs.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        Logica.CamposTexto.Campo_autoCompleter.setAutoCompleterInfijo(
                panelLogginAcceso_textFieldNombre, usuarios, nombreCampo);
    }

    private void loggin() {
        //Verifica que la contraseña ingresada coincida con la del usuario ingresado.
        if (DataBase.Facturacion.Empleado.Select.verificarContrasenia(
                Logica.CamposTexto.Campo_extraerCodigo.getCode(
                        panelLogginAcceso_textFieldNombre),
                Logica.herramientas.passwordToString(
                        panelLogginAcceso_textFieldContraseña.getPassword()))) {
            //Especificar el nivel de privilegio del empleado logeado:
            Logica.CredencialesDeUsuario.setPrivilegio(
                    DataBase.Facturacion.Empleado.Select.getPrivilegio(
                            Logica.CamposTexto.Campo_extraerCodigo.getCode(
                                    panelLogginAcceso_textFieldNombre)
                    ));
            //Guardar los datos en la db segun sea el caso:
            String recordar = "NO";
            if (radioNombreContrasenia.isSelected()) {
                recordar = "NC";
            } else if (radioNombre.isSelected()) {
                recordar = "N";
            }
            DataBase.Facturacion.DatosFuncionamiento.Update.Datos_backUp(
                    "usuario_datosARecordar",
                    recordar);
            DataBase.Facturacion.DatosFuncionamiento.Update.Datos_backUp(
                    "usuario_nombreRecordado",
                    panelLogginAcceso_textFieldNombre.getText());
            DataBase.Facturacion.DatosFuncionamiento.Update.Datos_backUp(
                    "usuario_contraseniaRecordada",
                    Logica.herramientas.passwordToString(panelLogginAcceso_textFieldContraseña.getPassword()));
            this.setVisible(false);
            Ventana_logginBase.PANELES[1].setVisible(true);
            javax.swing.JFrame objectFrame = Diseño.Facturacion.ventanas_bases.Ventana_logginBase.getThisObject();
            java.awt.EventQueue.invokeLater(() -> {
                new Diseño.Facturacion.ventanas_bases.Ventana_base();
                Diseño.Facturacion.paneles_pantallaPrincipal.panel_pantallaPrincipal.ModifyComponentsByPrivilege(panelLogginAcceso_textFieldNombre.getText());
            });
            objectFrame.dispose();
        } else {
            //En caso de que los datos sean incorrectos se muesta el label de contraseña incorrecta.
            panelLogginAcceso_labelContraseñaIncorrecta.setVisible(true);
        }
    }
}

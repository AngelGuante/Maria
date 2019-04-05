package Diseño.Facturacion.paneles_programador;

import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_mayuscula;

public class panel_configuracion extends Diseño.Facturacion.paneles_base.panelBase {

    public panel_configuracion() {
        initComponents();
        detallesComponentes();
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        panelConfiguracion_labelDireccion1 = new javax.swing.JLabel();
        txt_direccion1 = new javax.swing.JTextField();
        panelConfiguracion_labelDireccion2 = new javax.swing.JLabel();
        txt_direccion2 = new javax.swing.JTextField();
        panelConfiguracion_labelTelefono1 = new javax.swing.JLabel();
        txt_tlfn1 = new javax.swing.JTextField();
        panelConfiguracion_labelTelefono2 = new javax.swing.JLabel();
        txt_tlfn2 = new javax.swing.JTextField();
        panelConfiguracion_labelNegocio = new javax.swing.JLabel();
        panelConfiguracion_separador2 = new javax.swing.JSeparator();
        panelConfiguracion_labelNombre = new javax.swing.JLabel();
        panelConfiguracion_labelTelefono3 = new javax.swing.JLabel();
        txt_rnc = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelConfiguracion_separador3 = new javax.swing.JSeparator();
        panelConfiguracion_labelRutas = new javax.swing.JLabel();
        btn_BIN = new javax.swing.JButton();
        lbl_BIN = new javax.swing.JLabel();
        btn_backUp_USB = new javax.swing.JButton();
        lbl_backUp_USB = new javax.swing.JLabel();
        btn_backUp_EQUIPO = new javax.swing.JButton();
        lbl_backUp_EQUIPO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txt_numbreUsuario = new javax.swing.JTextField();
        panelConfiguracion_labelUsuarioPrincipal = new javax.swing.JLabel();
        panelConfiguracion_separador4 = new javax.swing.JSeparator();
        panelConfiguracion_labelNombreUsuario = new javax.swing.JLabel();
        panelConfiguracion_separador5 = new javax.swing.JSeparator();
        panelConfiguracion_labelUsuarioPrincipal1 = new javax.swing.JLabel();
        rd_no = new javax.swing.JRadioButton();
        rd_si = new javax.swing.JRadioButton();
        btn_Guardar2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        panelConfiguracion_labelDireccion1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelConfiguracion_labelDireccion1.setText("Direccion 1");

        txt_direccion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        panelConfiguracion_labelDireccion2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelConfiguracion_labelDireccion2.setText("Direccion 2");

        txt_direccion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        panelConfiguracion_labelTelefono1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelConfiguracion_labelTelefono1.setText("Telefono 1");

        txt_tlfn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        panelConfiguracion_labelTelefono2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelConfiguracion_labelTelefono2.setText("Telefono 2");

        txt_tlfn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        panelConfiguracion_labelNegocio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelConfiguracion_labelNegocio.setText("NEGOCIO");

        panelConfiguracion_separador2.setBackground(new java.awt.Color(0, 0, 0));
        panelConfiguracion_separador2.setForeground(new java.awt.Color(0, 0, 0));

        panelConfiguracion_labelNombre.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelConfiguracion_labelNombre.setText("NOMBRE");

        panelConfiguracion_labelTelefono3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelConfiguracion_labelTelefono3.setText("RNC");

        btn_Guardar.setText("GUARDAR");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelConfiguracion_labelNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelConfiguracion_labelNombre)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelConfiguracion_separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelConfiguracion_labelDireccion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(panelConfiguracion_labelDireccion2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_direccion2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelConfiguracion_labelTelefono1)
                                .addComponent(panelConfiguracion_labelTelefono3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_tlfn1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panelConfiguracion_labelTelefono2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_tlfn2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_rnc, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btn_Guardar))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelConfiguracion_labelNegocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConfiguracion_separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelConfiguracion_labelNombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelConfiguracion_labelDireccion1)
                    .addComponent(txt_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelConfiguracion_labelDireccion2)
                    .addComponent(txt_direccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelConfiguracion_labelTelefono1)
                    .addComponent(txt_tlfn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelConfiguracion_labelTelefono2)
                    .addComponent(txt_tlfn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelConfiguracion_labelTelefono3)
                    .addComponent(txt_rnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Guardar)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        panelConfiguracion_separador3.setBackground(new java.awt.Color(0, 0, 0));
        panelConfiguracion_separador3.setForeground(new java.awt.Color(0, 0, 0));

        panelConfiguracion_labelRutas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelConfiguracion_labelRutas.setText("RUTAS");

        btn_BIN.setText("'Bin' de MySQL");
        btn_BIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BINActionPerformed(evt);
            }
        });

        lbl_BIN.setText("Ruta");

        btn_backUp_USB.setText("USB");
        btn_backUp_USB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backUp_USBActionPerformed(evt);
            }
        });

        lbl_backUp_USB.setText("Ruta");

        btn_backUp_EQUIPO.setText("EQUIPO");
        btn_backUp_EQUIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backUp_EQUIPOActionPerformed(evt);
            }
        });

        lbl_backUp_EQUIPO.setText("Ruta");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("BackUps");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_BIN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_BIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_backUp_USB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_backUp_EQUIPO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_backUp_EQUIPO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_backUp_USB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelConfiguracion_labelRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelConfiguracion_separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelConfiguracion_labelRutas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConfiguracion_separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_BIN)
                    .addComponent(lbl_BIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_backUp_USB)
                    .addComponent(lbl_backUp_USB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_backUp_EQUIPO)
                    .addComponent(lbl_backUp_EQUIPO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        txt_numbreUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        panelConfiguracion_labelUsuarioPrincipal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelConfiguracion_labelUsuarioPrincipal.setText("USUARIO PRINCIPAL");

        panelConfiguracion_separador4.setBackground(new java.awt.Color(0, 0, 0));
        panelConfiguracion_separador4.setForeground(new java.awt.Color(0, 0, 0));

        panelConfiguracion_labelNombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelConfiguracion_labelNombreUsuario.setText("NOMBRE");

        panelConfiguracion_separador5.setBackground(new java.awt.Color(0, 0, 0));
        panelConfiguracion_separador5.setForeground(new java.awt.Color(0, 0, 0));

        panelConfiguracion_labelUsuarioPrincipal1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelConfiguracion_labelUsuarioPrincipal1.setText("Configuracion de Inicio de Seccion");

        rbg.add(rd_no);
        rd_no.setText("No pedir contraseña");
        rd_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_noActionPerformed(evt);
            }
        });

        rbg.add(rd_si);
        rd_si.setText("Pedir contraseña");
        rd_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_siActionPerformed(evt);
            }
        });

        btn_Guardar2.setText("GUARDAR");
        btn_Guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panelConfiguracion_labelNombreUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_numbreUsuario))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rd_si, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rd_no, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelConfiguracion_labelUsuarioPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelConfiguracion_separador4))
                                .addComponent(panelConfiguracion_labelUsuarioPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelConfiguracion_separador5)))
                        .addGap(0, 184, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Guardar2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelConfiguracion_labelUsuarioPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConfiguracion_separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelConfiguracion_labelNombreUsuario)
                    .addComponent(txt_numbreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Guardar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelConfiguracion_labelUsuarioPrincipal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConfiguracion_separador5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd_si)
                .addGap(7, 7, 7)
                .addComponent(rd_no)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Evento para el boton 'Ruta carpeta Bin'
    private void btn_BINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BINActionPerformed
        String ruta = (Logica.FileChooser.returnPath("Carpeta 'Bin' de MySQL"))
                .replace("\\", "/");
        DataBase.Facturacion.DatosFuncionamiento.Update.Datos_backUp(
                "rutaBin",
                ruta);
        lbl_BIN.setText(ruta);
    }//GEN-LAST:event_btn_BINActionPerformed

    private void btn_backUp_USBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backUp_USBActionPerformed
        String ruta = (Logica.FileChooser.returnPath("Backup General"))
                .replace("\\", "/");
        DataBase.Facturacion.DatosFuncionamiento.Update.Datos_backUp(
                "ruta_backUp_USB",
                ruta);
        lbl_backUp_USB.setText(ruta);
    }//GEN-LAST:event_btn_backUp_USBActionPerformed

    private void btn_backUp_EQUIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backUp_EQUIPOActionPerformed
        String ruta = (Logica.FileChooser.returnPath("Ruta en la USB - Principal"))
                .replace("\\", "/");
        DataBase.Facturacion.DatosFuncionamiento.Update.Datos_backUp(
                "ruta_backUp_EQUIPO",
                ruta);
        lbl_backUp_EQUIPO.setText(ruta);
    }//GEN-LAST:event_btn_backUp_EQUIPOActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        DataBase.Facturacion.DatosNecocio.Update.Datos(new String[]{
            txt_nombre.getText(),
            txt_direccion1.getText(),
            txt_direccion2.getText(),
            txt_tlfn1.getText(),
            txt_tlfn2.getText(),
            txt_rnc.getText()
        });
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void rd_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_noActionPerformed
        DataBase.Facturacion.DatosFuncionamiento.Update.Datos_backUp(
                "pedirContrasenia", "no");
    }//GEN-LAST:event_rd_noActionPerformed

    private void rd_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_siActionPerformed
        DataBase.Facturacion.DatosFuncionamiento.Update.Datos_backUp(
                "pedirContrasenia", "si");
    }//GEN-LAST:event_rd_siActionPerformed

    private void btn_Guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar2ActionPerformed
        DataBase.Facturacion.DatosFuncionamiento.Update.Datos_backUp(
                "usuarioPrincipal",
                txt_numbreUsuario.getText());
        Diseño.Facturacion.paneles_pantallaPrincipal.panel_pantallaPrincipal.panel_PantallaPrincipal_labelNombreLog.setText(
                DataBase.Facturacion.DatosFuncionamiento.Select.Datos()[7]);
    }//GEN-LAST:event_btn_Guardar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BIN;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Guardar2;
    private javax.swing.JButton btn_backUp_EQUIPO;
    private javax.swing.JButton btn_backUp_USB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_BIN;
    private javax.swing.JLabel lbl_backUp_EQUIPO;
    private javax.swing.JLabel lbl_backUp_USB;
    private javax.swing.JLabel panelConfiguracion_labelDireccion1;
    private javax.swing.JLabel panelConfiguracion_labelDireccion2;
    private javax.swing.JLabel panelConfiguracion_labelNegocio;
    private javax.swing.JLabel panelConfiguracion_labelNombre;
    private javax.swing.JLabel panelConfiguracion_labelNombreUsuario;
    private javax.swing.JLabel panelConfiguracion_labelRutas;
    private javax.swing.JLabel panelConfiguracion_labelTelefono1;
    private javax.swing.JLabel panelConfiguracion_labelTelefono2;
    private javax.swing.JLabel panelConfiguracion_labelTelefono3;
    private javax.swing.JLabel panelConfiguracion_labelUsuarioPrincipal;
    private javax.swing.JLabel panelConfiguracion_labelUsuarioPrincipal1;
    private javax.swing.JSeparator panelConfiguracion_separador2;
    private javax.swing.JSeparator panelConfiguracion_separador3;
    private javax.swing.JSeparator panelConfiguracion_separador4;
    private javax.swing.JSeparator panelConfiguracion_separador5;
    private javax.swing.ButtonGroup rbg;
    private static javax.swing.JRadioButton rd_no;
    private static javax.swing.JRadioButton rd_si;
    private static javax.swing.JTextField txt_direccion1;
    private static javax.swing.JTextField txt_direccion2;
    private static javax.swing.JTextField txt_nombre;
    private static javax.swing.JTextField txt_numbreUsuario;
    private static javax.swing.JTextField txt_rnc;
    private static javax.swing.JTextField txt_tlfn1;
    private static javax.swing.JTextField txt_tlfn2;
    // End of variables declaration//GEN-END:variables

    //*************************************************************//
    //*********************** -METODOS- **************************//
    //*************************************************************//
    //**************************************************************//
    //***************** Configurar componentes ********************//
    //*************************************************************//
    private void detallesComponentes() {
        //MAYUSCULA campos de texto
        Campo_mayuscula.campoTextoMayuscula(txt_nombre);

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(txt_nombre, 43);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(txt_direccion1, 43);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(txt_direccion2, 43);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(txt_tlfn1, 15);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(txt_tlfn2, 15);

        //Rutas:
        String[] datos = DataBase.Facturacion.DatosFuncionamiento.Select.Datos();
        lbl_BIN.setText(datos[0]);
        lbl_backUp_USB.setText(datos[1]);
        lbl_backUp_EQUIPO.setText(datos[2]);
    }

    public static void setData() {
        String[] datos = DataBase.Facturacion.DatosNecocio.Select.Datos();
        txt_nombre.setText(datos[0]);
        txt_direccion1.setText(datos[1]);
        txt_direccion2.setText(datos[2]);
        txt_tlfn1.setText(datos[3]);
        txt_tlfn2.setText(datos[4]);
        txt_rnc.setText(datos[5]);

        String[] datos2 = DataBase.Facturacion.DatosFuncionamiento.Select.Datos();
        txt_numbreUsuario.setText(datos2[7]);
        rd_si.setSelected(Boolean.valueOf(datos2[3]));
        rd_no.setSelected(!rd_si.isSelected());
    }
}

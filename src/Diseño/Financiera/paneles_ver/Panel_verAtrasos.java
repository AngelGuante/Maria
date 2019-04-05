package Diseño.Financiera.paneles_ver;

public class Panel_verAtrasos extends Diseño.Facturacion.paneles_base.panelBase_crearArticuloClienteDistribuidor {

    public javax.swing.JTable tabla;
    private javax.swing.JScrollPane pane;
    public javax.swing.table.DefaultTableModel model;
    //Esta variable pertenece al obtenerDatosRecivo de los atraso.
    private int totalAtrasoUnitario;
    private int totalCuotasAtrasos;
    private int totalCuotasRecivo;

    public Panel_verAtrasos() {
        initComponents();
        detallesComponentes();
        modificarComponentesPanelPadre();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelAtrasos_textFieldatraso = new javax.swing.JTextField();
        panelAtrasos_labelNumeroDeClientes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        atrasos_panel_principal = new javax.swing.JPanel();
        panelAtrasos_labelFechaProximoPago = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelAtrasos_labelFechaUltimoPago = new javax.swing.JLabel();
        panelAtrasos_labelDiasUltimoPago = new javax.swing.JLabel();
        panelAtrasos_labelDiasProximoPago = new javax.swing.JLabel();
        panelPrincipal_label_MesesAtrasados = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panelAtrasos_labelPagosHechos = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panelAtrasos_label_cuotasAcordadasAtrasadas = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        boton_verReporte = new javax.swing.JButton();
        boton_removerDelReporte = new javax.swing.JButton();
        atrasos_panel_detalles = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelDetalles_label_totalAtraso = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panelDetalles_label_totalPagado = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panelDetalles_label_totalRestante = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        panelDetalles_field_numeroAtrasosAPagar = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        panelDetalles_label_totalPagar = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        panelDetalles_button_procesar = new javax.swing.JButton();
        panelDetalles_buton_regresar = new javax.swing.JButton();
        checkBox_morasMesActual = new javax.swing.JCheckBox();

        setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/search.png"))); // NOI18N
        jButton1.setMargin(new java.awt.Insets(2, 12, 2, 14));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(291, 32, 38, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("CANTIDAD DE CUOTAS EN ATRASO");
        add(jLabel2);
        jLabel2.setBounds(10, 40, 184, 13);

        panelAtrasos_textFieldatraso.setText("1");
        add(panelAtrasos_textFieldatraso);
        panelAtrasos_textFieldatraso.setBounds(200, 30, 40, 30);

        panelAtrasos_labelNumeroDeClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelAtrasos_labelNumeroDeClientes.setForeground(new java.awt.Color(255, 0, 0));
        panelAtrasos_labelNumeroDeClientes.setText("0");
        add(panelAtrasos_labelNumeroDeClientes);
        panelAtrasos_labelNumeroDeClientes.setBounds(300, 10, 30, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Clientes en atraso:");
        add(jLabel3);
        jLabel3.setBounds(190, 10, 105, 14);

        atrasos_panel_principal.setBackground(new java.awt.Color(192, 192, 192));
        atrasos_panel_principal.setLayout(null);

        panelAtrasos_labelFechaProximoPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelAtrasos_labelFechaProximoPago.setForeground(new java.awt.Color(102, 102, 255));
        panelAtrasos_labelFechaProximoPago.setText("00/00/0000");
        atrasos_panel_principal.add(panelAtrasos_labelFechaProximoPago);
        panelAtrasos_labelFechaProximoPago.setBounds(50, 84, 88, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("HECHOS:");
        atrasos_panel_principal.add(jLabel10);
        jLabel10.setBounds(2, 24, 50, 14);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("MESES EN ATRASO:");
        atrasos_panel_principal.add(jLabel12);
        jLabel12.setBounds(2, 46, 104, 14);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("ULTMO:");
        atrasos_panel_principal.add(jLabel14);
        jLabel14.setBounds(2, 66, 42, 14);

        panelAtrasos_labelFechaUltimoPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelAtrasos_labelFechaUltimoPago.setForeground(new java.awt.Color(102, 102, 255));
        panelAtrasos_labelFechaUltimoPago.setText("00/00/0000");
        atrasos_panel_principal.add(panelAtrasos_labelFechaUltimoPago);
        panelAtrasos_labelFechaUltimoPago.setBounds(50, 66, 88, 17);

        panelAtrasos_labelDiasUltimoPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelAtrasos_labelDiasUltimoPago.setForeground(new java.awt.Color(0, 0, 255));
        panelAtrasos_labelDiasUltimoPago.setText("- 00");
        atrasos_panel_principal.add(panelAtrasos_labelDiasUltimoPago);
        panelAtrasos_labelDiasUltimoPago.setBounds(140, 66, 28, 17);

        panelAtrasos_labelDiasProximoPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelAtrasos_labelDiasProximoPago.setForeground(new java.awt.Color(0, 0, 255));
        panelAtrasos_labelDiasProximoPago.setText("- 00");
        atrasos_panel_principal.add(panelAtrasos_labelDiasProximoPago);
        panelAtrasos_labelDiasProximoPago.setBounds(140, 84, 32, 17);

        panelPrincipal_label_MesesAtrasados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPrincipal_label_MesesAtrasados.setForeground(new java.awt.Color(255, 0, 0));
        panelPrincipal_label_MesesAtrasados.setText("0");
        atrasos_panel_principal.add(panelPrincipal_label_MesesAtrasados);
        panelPrincipal_label_MesesAtrasados.setBounds(110, 45, 30, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("PROX.:  ");
        atrasos_panel_principal.add(jLabel13);
        jLabel13.setBounds(2, 84, 42, 14);

        panelAtrasos_labelPagosHechos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelAtrasos_labelPagosHechos.setForeground(new java.awt.Color(51, 51, 255));
        panelAtrasos_labelPagosHechos.setText("0");
        atrasos_panel_principal.add(panelAtrasos_labelPagosHechos);
        panelAtrasos_labelPagosHechos.setBounds(52, 23, 30, 17);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setText("Moras");
        jButton2.setMargin(new java.awt.Insets(2, 12, 2, 14));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        atrasos_panel_principal.add(jButton2);
        jButton2.setBounds(230, 78, 90, 22);

        panelAtrasos_label_cuotasAcordadasAtrasadas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelAtrasos_label_cuotasAcordadasAtrasadas.setForeground(new java.awt.Color(255, 51, 51));
        panelAtrasos_label_cuotasAcordadasAtrasadas.setText("0");
        atrasos_panel_principal.add(panelAtrasos_label_cuotasAcordadasAtrasadas);
        panelAtrasos_label_cuotasAcordadasAtrasadas.setBounds(185, 1, 140, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("PAGOS ACORDADOS EN ATRASO:");
        atrasos_panel_principal.add(jLabel11);
        jLabel11.setBounds(2, 2, 180, 14);

        boton_verReporte.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_verReporte.setText("Ver Reporte");
        boton_verReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_verReporteActionPerformed(evt);
            }
        });
        atrasos_panel_principal.add(boton_verReporte);
        boton_verReporte.setBounds(230, 50, 90, 21);

        boton_removerDelReporte.setBackground(new java.awt.Color(255, 102, 102));
        boton_removerDelReporte.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_removerDelReporte.setText("Remover Del Reporte");
        boton_removerDelReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_removerDelReporteActionPerformed(evt);
            }
        });
        atrasos_panel_principal.add(boton_removerDelReporte);
        boton_removerDelReporte.setBounds(190, 20, 130, 21);

        add(atrasos_panel_principal);
        atrasos_panel_principal.setBounds(10, 310, 319, 100);

        atrasos_panel_detalles.setBackground(new java.awt.Color(192, 192, 192));
        atrasos_panel_detalles.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("MORA TOTAL:");
        atrasos_panel_detalles.add(jLabel17);
        jLabel17.setBounds(12, 10, 76, 14);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("PAGADO:");
        atrasos_panel_detalles.add(jLabel18);
        jLabel18.setBounds(12, 29, 50, 14);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("RESTANTE:");
        atrasos_panel_detalles.add(jLabel19);
        jLabel19.setBounds(12, 50, 59, 14);

        panelDetalles_label_totalAtraso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelDetalles_label_totalAtraso.setForeground(new java.awt.Color(255, 0, 0));
        panelDetalles_label_totalAtraso.setText("0");
        atrasos_panel_detalles.add(panelDetalles_label_totalAtraso);
        panelDetalles_label_totalAtraso.setBounds(102, 8, 80, 17);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("$");
        atrasos_panel_detalles.add(jLabel21);
        jLabel21.setBounds(90, 8, 9, 17);

        panelDetalles_label_totalPagado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelDetalles_label_totalPagado.setForeground(new java.awt.Color(51, 51, 255));
        panelDetalles_label_totalPagado.setText("0");
        atrasos_panel_detalles.add(panelDetalles_label_totalPagado);
        panelDetalles_label_totalPagado.setBounds(78, 26, 110, 17);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 255));
        jLabel23.setText("$");
        atrasos_panel_detalles.add(jLabel23);
        jLabel23.setBounds(66, 26, 9, 17);

        panelDetalles_label_totalRestante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelDetalles_label_totalRestante.setForeground(new java.awt.Color(255, 0, 0));
        panelDetalles_label_totalRestante.setText("0");
        atrasos_panel_detalles.add(panelDetalles_label_totalRestante);
        panelDetalles_label_totalRestante.setBounds(88, 48, 80, 17);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("$");
        atrasos_panel_detalles.add(jLabel25);
        jLabel25.setBounds(76, 48, 9, 17);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("A PAGAR:");
        atrasos_panel_detalles.add(jLabel26);
        jLabel26.setBounds(190, 4, 53, 14);

        panelDetalles_field_numeroAtrasosAPagar.setText("0");
        panelDetalles_field_numeroAtrasosAPagar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelDetalles_field_numeroAtrasosAPagarFocusGained(evt);
            }
        });
        panelDetalles_field_numeroAtrasosAPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelDetalles_field_numeroAtrasosAPagarKeyReleased(evt);
            }
        });
        atrasos_panel_detalles.add(panelDetalles_field_numeroAtrasosAPagar);
        panelDetalles_field_numeroAtrasosAPagar.setBounds(300, 0, 30, 24);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("$");
        atrasos_panel_detalles.add(jLabel27);
        jLabel27.setBounds(250, 30, 9, 17);

        panelDetalles_label_totalPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelDetalles_label_totalPagar.setForeground(new java.awt.Color(255, 0, 0));
        panelDetalles_label_totalPagar.setText("0");
        atrasos_panel_detalles.add(panelDetalles_label_totalPagar);
        panelDetalles_label_totalPagar.setBounds(260, 30, 70, 17);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("MONTO:");
        atrasos_panel_detalles.add(jLabel29);
        jLabel29.setBounds(190, 30, 43, 14);

        panelDetalles_button_procesar.setText("Procesar");
        panelDetalles_button_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelDetalles_button_procesarActionPerformed(evt);
            }
        });
        atrasos_panel_detalles.add(panelDetalles_button_procesar);
        panelDetalles_button_procesar.setBounds(250, 74, 80, 23);

        panelDetalles_buton_regresar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panelDetalles_buton_regresar.setText("Atrasos");
        panelDetalles_buton_regresar.setMargin(new java.awt.Insets(2, 12, 2, 14));
        panelDetalles_buton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelDetalles_buton_regresarActionPerformed(evt);
            }
        });
        atrasos_panel_detalles.add(panelDetalles_buton_regresar);
        panelDetalles_buton_regresar.setBounds(160, 74, 90, 21);

        checkBox_morasMesActual.setText("Mora solo de este mes");
        checkBox_morasMesActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_morasMesActualActionPerformed(evt);
            }
        });
        atrasos_panel_detalles.add(checkBox_morasMesActual);
        checkBox_morasMesActual.setBounds(160, 50, 170, 23);

        add(atrasos_panel_detalles);
        atrasos_panel_detalles.setBounds(0, 310, 330, 110);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("CallToPrintStackTrace")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try (java.sql.ResultSet rs = DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.todasFacturasVentasCreditoActivasConDatosCliente(true)) {
            Evento_botonBuscar(rs);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Evento_botonMostrarPanelMoras();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void panelDetalles_buton_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelDetalles_buton_regresarActionPerformed
        atrasos_panel_detalles.setVisible(false);
        atrasos_panel_principal.setVisible(true);
    }//GEN-LAST:event_panelDetalles_buton_regresarActionPerformed

    private void panelDetalles_field_numeroAtrasosAPagarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelDetalles_field_numeroAtrasosAPagarKeyReleased
        try {
            if ((Integer.parseInt(
                    panelDetalles_field_numeroAtrasosAPagar.getText())
                    > (totalCuotasAtrasos + 1))) {
                Logica.Cuadros_Emergentes.alerta("El numero de atrasos a pagar no "
                        + "puede ser mayor al numero de atrasos REALES que debe"
                        + "esta factura.");
                panelDetalles_field_numeroAtrasosAPagar.setText(""
                        + totalCuotasAtrasos);
            }
            if (Integer.parseInt(panelDetalles_field_numeroAtrasosAPagar.getText())
                    <= totalCuotasAtrasos) {
                panelDetalles_label_totalPagar.setText(Integer.toString(
                        Integer.parseInt(GetTotalProcesoAtraso(
                                Integer.toString(totalCuotasRecivo),
                                panelAtrasos_label_cuotasAcordadasAtrasadas.getText(),
                                DiasUltimoPago(), 1))
                        * Integer.parseInt(panelDetalles_field_numeroAtrasosAPagar
                                .getText())
                ));
            } else {
                panelDetalles_label_totalPagar.setText(
                        panelDetalles_label_totalRestante.getText());
            }
        } catch (java.lang.NumberFormatException e) {
            panelDetalles_label_totalPagar.setText("0");
        }
    }//GEN-LAST:event_panelDetalles_field_numeroAtrasosAPagarKeyReleased

    private void panelDetalles_field_numeroAtrasosAPagarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelDetalles_field_numeroAtrasosAPagarFocusGained
//        totalAtrasoUnitario = Integer.parseInt(panelDetalles_label_totalPagar
//                .getText())
//                / Integer.parseInt(panelDetalles_field_numeroAtrasosAPagar.getText());
    }//GEN-LAST:event_panelDetalles_field_numeroAtrasosAPagarFocusGained

    private void panelDetalles_button_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelDetalles_button_procesarActionPerformed
        //Verifico que el monto a pagar sea mayor a 0
        if (!panelDetalles_label_totalPagar.getText().equals("0")) {
            if (Logica.Cuadros_Emergentes.Transacciones(
                    panelDetalles_label_totalPagar.getText()) == 0) {
                DataBase.Financiera.AtrasosPagados.Insert.AtrasosPagados(new String[]{
                    (String) tabla.getValueAt(tabla.getSelectedRow(), 1),
                    panelDetalles_field_numeroAtrasosAPagar.getText(),
                    panelDetalles_label_totalPagar.getText(),
                    Diseño.Financiera.paneles_pantallaPrincipal.panel_pagosSaldosEnvargos.jFormattedTextField1.getText()
                });
                Logica.Cuadros_Emergentes.completado();
                LimpiarVentana();
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("El monto a pagar debe ser diferente"
                    + "de 0.");
        }
    }//GEN-LAST:event_panelDetalles_button_procesarActionPerformed

    private void checkBox_morasMesActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_morasMesActualActionPerformed
        if (checkBox_morasMesActual.isSelected()) {
            panelDetalles_field_numeroAtrasosAPagar.setText("1");
            panelDetalles_label_totalPagar.setText(GetTotalProcesoAtraso(
                    Integer.toString(totalCuotasRecivo),
                    panelAtrasos_label_cuotasAcordadasAtrasadas.getText(),
                    DiasUltimoPago(), 2));
        } else {
            panelDetalles_field_numeroAtrasosAPagar.setText(""
                    + (totalCuotasAtrasos + 1));
            panelDetalles_label_totalPagar.setText(
                    panelDetalles_label_totalRestante.getText());
        }
    }//GEN-LAST:event_checkBox_morasMesActualActionPerformed

    private void boton_verReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_verReporteActionPerformed
        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
        java.util.List<String> clientesNombres = new java.util.ArrayList<>();
        java.util.List<String> recivos = new java.util.ArrayList<>();
        java.util.List<String> meses = new java.util.ArrayList<>();
        java.util.List<String> dias = new java.util.ArrayList<>();
        java.util.List<String> monto = new java.util.ArrayList<>();
        java.util.List<String> cuotas = new java.util.ArrayList<>();
        java.util.List<String> total = new java.util.ArrayList<>();
        for (int i = 0; i < tabla.getRowCount(); i++) {
            clientesNombres.add((String) tabla.getValueAt(i, 0));
            recivos.add((String) tabla.getValueAt(i, 1));
        }
        for (int i = 0; i < recivos.size(); i++) {
            String[] datos = obtenerDatosRecivo(recivos.get(i));
            meses.add(datos[1]);
            dias.add(datos[5]);
            monto.add(datos[10]);
            cuotas.add(Integer.toString(
                    Integer.parseInt(datos[7]) * Integer.parseInt(datos[2])));
            total.add(Integer.parseInt(datos[7]) * Integer.parseInt(datos[2]) == 0
                    ? datos[11]
                    : Integer.toString(((Integer.parseInt(datos[7]) * Integer.parseInt(datos[2]))
                            + Integer.parseInt(datos[10]))));
        }
        parametros.put("nombreClientes", clientesNombres);
        parametros.put("recivos", recivos);
        parametros.put("mesAtrasos", meses);
        parametros.put("diasAtrasos", dias);
        parametros.put("montoAtraso", monto);
        parametros.put("cuotasRecivo", cuotas);
        parametros.put("total", total);
        Logica.Reportes.Reporte_generarSinDB.ReportesSinDB(
                parametros,
                "Financiera\\ListadoClientesAtrasados",
                false);
    }//GEN-LAST:event_boton_verReporteActionPerformed

    private void boton_removerDelReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_removerDelReporteActionPerformed
        model.removeRow(tabla.getSelectedRow());
        boton_removerDelReporte.setVisible(false);
    }//GEN-LAST:event_boton_removerDelReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atrasos_panel_detalles;
    private javax.swing.JPanel atrasos_panel_principal;
    private javax.swing.JButton boton_removerDelReporte;
    private javax.swing.JButton boton_verReporte;
    private javax.swing.JCheckBox checkBox_morasMesActual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel panelAtrasos_labelDiasProximoPago;
    private javax.swing.JLabel panelAtrasos_labelDiasUltimoPago;
    private static javax.swing.JLabel panelAtrasos_labelFechaProximoPago;
    private static javax.swing.JLabel panelAtrasos_labelFechaUltimoPago;
    private static javax.swing.JLabel panelAtrasos_labelNumeroDeClientes;
    private static javax.swing.JLabel panelAtrasos_labelPagosHechos;
    private static javax.swing.JLabel panelAtrasos_label_cuotasAcordadasAtrasadas;
    private static javax.swing.JTextField panelAtrasos_textFieldatraso;
    private javax.swing.JButton panelDetalles_buton_regresar;
    private javax.swing.JButton panelDetalles_button_procesar;
    public static javax.swing.JTextField panelDetalles_field_numeroAtrasosAPagar;
    private javax.swing.JLabel panelDetalles_label_totalAtraso;
    private javax.swing.JLabel panelDetalles_label_totalPagado;
    public static javax.swing.JLabel panelDetalles_label_totalPagar;
    public javax.swing.JLabel panelDetalles_label_totalRestante;
    private static javax.swing.JLabel panelPrincipal_label_MesesAtrasados;
    // End of variables declaration//GEN-END:variables

    private void detallesComponentes() {
        //Ocultar componentes
        atrasos_panel_detalles.setVisible(false);
        boton_removerDelReporte.setVisible(false);

        //Tabla
        tabla = new javax.swing.JTable();
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            @SuppressWarnings("override")
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Evento_tabla();
            }
        });
        model = (javax.swing.table.DefaultTableModel) tabla.getModel();
        pane = new javax.swing.JScrollPane(tabla);
        pane.setBounds(6, 60, 320, 250);
        this.add(pane);

        //Fuentes Tabla
        tabla.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 12));

        //Columnas Header Tabla
        String header[] = {"Cliente", "Recivo"};
        for (String element : header) {
            model.addColumn(element);
        }

        //TAMAÑO celdas de tabla
        int[] tamaño = {251, 48};
        Logica.tablas.Tabla_tamañoCeldas.setTablaColumnasTamaño(tamaño, tabla);
    }

    private void modificarComponentesPanelPadre() {
        //LABELS
        panelCrearArticuloClienteDistribuidor_labelLosCamposMarcadosSonObligatorios.setVisible(false);
        panelCrearArticuloClienteDistribuidor_labelTitulo.setText("Clientes en atraso");
    }

    //**************************************************************//
    //************************* Metodos ****************************//
    //**************************************************************//
    //Retorna la cantida de de dias que han pasado desde el ultimo pago, localizado
    //en el label de dias pasados desde el ultimo pago.
    private int DiasUltimoPago() {
        return (Integer.parseInt(panelAtrasos_labelDiasUltimoPago
                .getText().substring(
                        panelAtrasos_labelDiasUltimoPago.getText().indexOf(" ") + 1,
                        panelAtrasos_labelDiasUltimoPago.getText().length())));
    }

    //Recive los datos de un recivo y retorna los datos del atraso en una matriz.
    private Object[] DatosAtrasoRecivo(String[] datos) {
        Object[] detallesDeFactura = new Object[2];

        detallesDeFactura[0] = (DataBase.logica.diasEntreFechas.getDIas(
                Logica.fechaHora.getFechaSQL(), datos[0])
                / 30);
        detallesDeFactura[1] = DataBase.Financiera.Pagos.Select.totalPagos((String) datos[1]);
        //detallesDeFactura[0] = La cantidad de cuotas que deberia tener desde la fecha de creacion hasta la actualidad.
        //detallesDeFactura[1] = Cantidad de pagos que tiene la factura.
        return detallesDeFactura;
    }

    //Calculara el obtenerDatosRecivo de multiplicar la cuota de un recivo por el XX% de
    //este y luego  multiplicar ese resultado por el numero que representa la
    //cantidad de veces que se va a elevar, el parametro 'porcientoOTotal'
    //si es true retornara el total de atraso de un recivo. si es false 
    //retornara el totall de un atraso mensual.
    private String GetTotalProcesoAtraso(String cuotas, String cantidad, int dias, int porcientoOTotal) {
        double porcientoMensual = 0.10;
        //Porciente de un mes completo
        int porcientoDeAtrasoMensual = (int) (java.lang.Math.ceil(
                Integer.parseInt(cuotas) * porcientoMensual));
        //Moras de el mes en curso
        Double totalDias = dias * (porcientoMensual / 30) * Integer.parseInt(cuotas);
        switch (porcientoOTotal) {
            case 0:
                //Retorta el total de las moras de los meses pasados mas el mes
                //actual.
                int cantidadInt = Integer.parseInt(cantidad);
                int totalMesesCompletos = (cantidadInt) * porcientoDeAtrasoMensual;
                double totalMoras = totalMesesCompletos + totalDias;
                return Integer.toString((int) totalMoras);
            case 1:
                //Retorna el atraso de un solo mes.
                return Integer.toString((int) porcientoDeAtrasoMensual);
            case 2:
                //Retorna el atraso de el mes en  curso.
                return Integer.toString(totalDias.intValue());
            default:
                break;
        }
        return null;
    }

    //Retorna una matriz con todos los datos que tengan que ver con el atraso de
    //un recivo pasado por parametro.
    private String[] obtenerDatosRecivo(String idFactura) {
        String[] datos = new String[12];
        try (java.sql.ResultSet rs = DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.facturaVentaCreditoid(idFactura)) {
            rs.next();
            Object[] detallesDeFactura = DatosAtrasoRecivo(new String[]{
                rs.getString("fechaSQL"), idFactura});
            datos[0] = "" + detallesDeFactura[1];
            datos[1] = "" + ((Integer) detallesDeFactura[0]
                    - (Integer) detallesDeFactura[1]);
            datos[2] = Integer.parseInt(datos[1]) >= rs.getInt("cantidadCuotasRst")
                    ? Integer.toString(rs.getInt("cantidadCuotas")
                            - Integer.parseInt(datos[0]))
                    : datos[1];
            int diasUltimoPago = 30 * (Integer) detallesDeFactura[0];
            int diasSiguientePago = 30 * ((Integer) detallesDeFactura[0] + 1);
            datos[3] = DataBase.logica.agregarDiasAFecha.agregarDias(
                    rs.getString("fechaSQL"), diasUltimoPago);
            datos[4] = DataBase.logica.agregarDiasAFecha.agregarDias(
                    rs.getString("fechaSQL"), diasSiguientePago);
            datos[5] = "" + (DataBase.logica.diasEntreFechas.getDIas(
                    Logica.fechaHora.getFechaSQL(),
                    Logica.String.String_convertirFechaAFormatoSQL.formatearFecha(
                            datos[3])));
            datos[6] = "" + (DataBase.logica.diasEntreFechas.getDIas(
                    Logica.String.String_convertirFechaAFormatoSQL.formatearFecha(
                            datos[4]),
                    Logica.fechaHora.getFechaSQL()));
            totalCuotasRecivo = rs.getInt("cuotas");
            datos[7] = Integer.toString(totalCuotasRecivo);
            //para calcular las moras segun el total acordado, el segundo parametro
            //debe der datos[2] y para el total de meses atrasados datos[1]
            datos[8] = (GetTotalProcesoAtraso(Integer.toString(
                    totalCuotasRecivo), datos[1], Integer.parseInt(datos[5]), 0));
            datos[9] = DataBase.Financiera.AtrasosPagados.Select.AtrasosPagadosSumatoriaRecivo(
                    idFactura);
            int atrasoRestante = ((Integer.parseInt(datos[8])))
                    - (Integer.parseInt(datos[9]));
            datos[10] = Integer.toString(atrasoRestante <= 0 ? 0 : atrasoRestante);
            datos[11] = rs.getString("totalPagarRst");
            totalCuotasAtrasos = Integer.parseInt(datos[1]);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        //datos[0] = Pagos Realizados.
        //datos[1] = Meses Atrasados.
        //datos[2] = Cuotas Acordadas Atrasadas.
        //datos[3] = Fecha Ultimo Pago.
        //datos[4] = Fecha Proximo Pago.
        //datos[5] = Dias Ultimo Pago.
        //datos[6] = Dias Ultimo Pago.
        //datos[7] = Cuotas Totales Del Recivo.
        //datos[8] = Total Atrasado.
        //datos[9] = Total Pagado.
        //datos[10] = Total Restante.
        //datos[11] = Total Pagar Restante, si es un recivo sin cuotas.
        return datos;
    }

    //********************* Metodos Uso Externo ********************//
    //**************************************************************//
    /**
     * Proceso para saber los datos exactos de atraso de un recivo en
     * espesifico, con estos datos llena tada la ventada.
     *
     * @param idFactura
     */
    public void LlenarDatosAtrasoDeRecivo(Object idFactura) {
        String[] datos = obtenerDatosRecivo((String) idFactura);
        //PANEL PRINCIPAL
        panelAtrasos_labelPagosHechos.setText(datos[0]);
        panelPrincipal_label_MesesAtrasados.setText(datos[1]);
        panelAtrasos_label_cuotasAcordadasAtrasadas.setText(datos[2]);
        panelAtrasos_labelFechaUltimoPago.setText(datos[3]);
        panelAtrasos_labelFechaProximoPago.setText(datos[4]);
        panelAtrasos_labelDiasUltimoPago.setText("- " + datos[5]);
        panelAtrasos_labelDiasProximoPago.setText("- " + datos[6]);
        //PANEL DETALLES
        panelDetalles_label_totalAtraso.setText(datos[8]);
        panelDetalles_label_totalPagado.setText(datos[9]);
        panelDetalles_label_totalRestante.setText(datos[10]);
        //Si la cantidad de atraso es mayor a 0 se le suma el numero de
        //atrasos +1 para reflejar los los meses atrasados mas los dias.
        int cuotasAtrasadas = Integer.parseInt(datos[1]);
        if (cuotasAtrasadas > 0) {
            panelDetalles_field_numeroAtrasosAPagar.setText(
                    Integer.toString(cuotasAtrasadas + 1));
        } else {
            panelDetalles_field_numeroAtrasosAPagar.setText(datos[1]);
        }
        panelDetalles_label_totalPagar.setText(datos[10]);
    }

    /**
     * Agrega un recivo pasado a la tabla de recivos atrasados.
     *
     * @param rs DetalleVentaCredito
     * @param numeroCuotas Para ver cuantas cuotas en atraso debe tener un
     * recivo para que se agregen a la tabla.
     * @param valoCuotasAtrasadasIgualARestante En caso de que se pase un recivo
     * en espesifico y se quiera agregar ese recivo a la tabla este valor debe
     * ser true para que se ignore la condicion que tiene este metodo de
     * verificar si el recivo esta atrasado o no y solo agregarlo. true =
     * AGREGAR false = EVALUAR
     */
    public void procesoAgregarRecivo(java.sql.ResultSet rs, int numeroCuotas, boolean valoCuotasAtrasadasIgualARestante) {
        Object[] detallesDeFactura;
        try {
            detallesDeFactura = DatosAtrasoRecivo(new String[]{
                rs.getString("fecha"),
                rs.getString("idVentaCredito")
            });
            int cuotasAtrasadas = valoCuotasAtrasadasIgualARestante
                    ? 0
                    : ((Integer) detallesDeFactura[0] - (Integer) detallesDeFactura[1]);
            //Si la cantidad de cuotas que tiene el recivo es mayor o igual al 
            //valor que hay en el campo que verifica los atrasos, se agrega un 
            //nuevo registro a la tabla.
            if (cuotasAtrasadas >= numeroCuotas) {
                model.addRow(new Object[]{
                    rs.getString("nombreCliente") + " " + rs.getString("apellidoCliente"),
                    rs.getString("facturaventacredito.idVentaCredito")});
            }
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        panelAtrasos_labelNumeroDeClientes.setText(Integer.toString(tabla.getRowCount()));
    }

    //**************************************************************//
    public void LimpiarVentana() {
        //General
        panelAtrasos_textFieldatraso.setText("1");
        panelAtrasos_labelNumeroDeClientes.setText("0");
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model, tabla);
        //PAGOS
        panelPrincipal_label_MesesAtrasados.setText("0");
        panelAtrasos_labelPagosHechos.setText("0");
        panelAtrasos_labelFechaUltimoPago.setText("00/00/0000");
        panelAtrasos_labelFechaProximoPago.setText("00/00/0000");
        panelAtrasos_labelDiasUltimoPago.setText("- 0");
        panelAtrasos_labelDiasProximoPago.setText("- 0");
        boton_removerDelReporte.setVisible(false);
        //DETALLES
        panelDetalles_label_totalAtraso.setText("0");
        panelDetalles_label_totalPagado.setText("0");
        panelDetalles_label_totalRestante.setText("0");
        panelDetalles_field_numeroAtrasosAPagar.setText("0");
        panelDetalles_label_totalPagar.setText("0");
    }

    //**************************************************************//
    //************************* Eventos ****************************//
    //**************************************************************//
    private void Evento_botonBuscar(java.sql.ResultSet rs) {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model, tabla);
        try {
            while (rs.next()) {
                procesoAgregarRecivo(rs,
                        Integer.parseInt(panelAtrasos_textFieldatraso.getText()),
                        false);
            }
            rs.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    private void Evento_tabla() {
        String primerNombre = (String) model.getValueAt(0, 0);
        boton_removerDelReporte.setVisible(true);
        checkBox_morasMesActual.setSelected(false);
        LlenarDatosAtrasoDeRecivo(
                tabla.getValueAt(tabla.getSelectedRow(), 1)
        );
        Diseño.Financiera.paneles_pantallaPrincipal.panel_pagosSaldosEnvargos
                .llenarVentanaConIdFactura((String) tabla.getValueAt(
                        tabla.getSelectedRow(),
                        1), false);
        model.setValueAt(primerNombre, 0, 0);
    }

    /**
     * Oculta el panel princial de las moras y muestra el panel del total de las
     * moras debitadas de un recivo.
     */
    public void Evento_botonMostrarPanelMoras() {
        atrasos_panel_principal.setVisible(false);
        atrasos_panel_detalles.setVisible(true);
    }
}

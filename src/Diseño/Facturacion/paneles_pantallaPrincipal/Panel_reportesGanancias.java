package Diseño.Facturacion.paneles_pantallaPrincipal;

public class Panel_reportesGanancias extends Diseño.Facturacion.paneles_base.panelBase {

    public Panel_reportesGanancias() {
        initComponents();
        ComponentsDetails();
        System.err.println(jPanel1.isVisible());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelIntervaloFechas_JFormater_fechaInicio = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelIntervaloFechas_JFormater_fechaFin = new javax.swing.JFormattedTextField();
        panelIntervalos_boton_reporteSaldos = new javax.swing.JButton();
        panelIntervalos_boton_reportePagos = new javax.swing.JButton();
        panelIntervalos_boton_reporteVentas = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        panelIntervaloFechas_JFormater_fechaInicio.setForeground(new java.awt.Color(0, 102, 204));
        try {
            panelIntervaloFechas_JFormater_fechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##. ##. ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelIntervaloFechas_JFormater_fechaInicio.setText("03. 01. 2017");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("FECHA INICIO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("FECHA FIN");

        panelIntervaloFechas_JFormater_fechaFin.setForeground(new java.awt.Color(0, 102, 204));
        try {
            panelIntervaloFechas_JFormater_fechaFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##. ##. ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelIntervaloFechas_JFormater_fechaFin.setText("03. 01. 2017");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(panelIntervaloFechas_JFormater_fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelIntervaloFechas_JFormater_fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(717, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelIntervaloFechas_JFormater_fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelIntervaloFechas_JFormater_fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1010, 80);

        panelIntervalos_boton_reporteSaldos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelIntervalos_boton_reporteSaldos.setText("GANANCIA POR SALDOS");
        panelIntervalos_boton_reporteSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelIntervalos_boton_reporteSaldosActionPerformed(evt);
            }
        });
        add(panelIntervalos_boton_reporteSaldos);
        panelIntervalos_boton_reporteSaldos.setBounds(290, 120, 230, 40);

        panelIntervalos_boton_reportePagos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelIntervalos_boton_reportePagos.setText("GANANCIA POR PAGOS");
        panelIntervalos_boton_reportePagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelIntervalos_boton_reportePagosActionPerformed(evt);
            }
        });
        add(panelIntervalos_boton_reportePagos);
        panelIntervalos_boton_reportePagos.setBounds(560, 120, 230, 40);

        panelIntervalos_boton_reporteVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelIntervalos_boton_reporteVentas.setText("GANANCIAS POR VENTAS");
        panelIntervalos_boton_reporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelIntervalos_boton_reporteVentasActionPerformed(evt);
            }
        });
        add(panelIntervalos_boton_reporteVentas);
        panelIntervalos_boton_reporteVentas.setBounds(20, 120, 230, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void panelIntervalos_boton_reporteSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelIntervalos_boton_reporteSaldosActionPerformed
        llamarReporte("Financiera\\ListadoSaldosDetalles");
    }//GEN-LAST:event_panelIntervalos_boton_reporteSaldosActionPerformed

    private void panelIntervalos_boton_reportePagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelIntervalos_boton_reportePagosActionPerformed
        llamarReporte("Financiera\\ListadoPagosDetalles");
    }//GEN-LAST:event_panelIntervalos_boton_reportePagosActionPerformed

    private void panelIntervalos_boton_reporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelIntervalos_boton_reporteVentasActionPerformed
        llamarReporte("Facturacion\\ListadoFacturasVentaDetalles");
    }//GEN-LAST:event_panelIntervalos_boton_reporteVentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JFormattedTextField panelIntervaloFechas_JFormater_fechaFin;
    public javax.swing.JFormattedTextField panelIntervaloFechas_JFormater_fechaInicio;
    private javax.swing.JButton panelIntervalos_boton_reportePagos;
    private javax.swing.JButton panelIntervalos_boton_reporteSaldos;
    private javax.swing.JButton panelIntervalos_boton_reporteVentas;
    // End of variables declaration//GEN-END:variables

    private void ComponentsDetails() {
        //FECHA campos de texto
        panelIntervaloFechas_JFormater_fechaInicio.setText(Logica.fechaHora.getFecha());
        panelIntervaloFechas_JFormater_fechaFin.setText(Logica.fechaHora.getFecha());
    }

    //**************************************************************//
    //************************* Metodos ****************************//
    //**************************************************************//
    private void llamarReporte(String nombreReporte) {
        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
        parametros.put("fechaInicio", Logica.String.String_convertirFechaAFormatoSQL.formatearFecha(
                panelIntervaloFechas_JFormater_fechaInicio.getText()));
        parametros.put("fechaFin", Logica.String.String_convertirFechaAFormatoSQL.formatearFecha(
                panelIntervaloFechas_JFormater_fechaFin.getText()));
        parametros.put("inicioFecha", panelIntervaloFechas_JFormater_fechaInicio.getText());
        parametros.put("finFecha", panelIntervaloFechas_JFormater_fechaFin.getText());
        Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                parametros,
                nombreReporte,
                false);
    }

}

package Diseño.Paneles_herramientas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Panel_busquedaAvanzadaFacturasVenta extends javax.swing.JPanel {

    //Para determinar si se llama desde ccompra o desde venta
    String tipo;

    public Panel_busquedaAvanzadaFacturasVenta(String tipodeBusquedaDeFacturas) {
        initComponents();
        ComponentsDetails();
        this.tipo = tipodeBusquedaDeFacturas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIntervaloFechas_JFormater_fechaInicio = new javax.swing.JFormattedTextField();
        panelIntervaloFechas_JFormater_fechaFin = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        ComboBox_articulos = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        panelIntervaloFechas_JFormater_fechaInicio.setForeground(new java.awt.Color(0, 102, 204));
        try {
            panelIntervaloFechas_JFormater_fechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##. ##. ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelIntervaloFechas_JFormater_fechaInicio.setText("03. 01. 2017");

        panelIntervaloFechas_JFormater_fechaFin.setForeground(new java.awt.Color(0, 102, 204));
        try {
            panelIntervaloFechas_JFormater_fechaFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##. ##. ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelIntervaloFechas_JFormater_fechaFin.setText("03. 01. 2017");

        jLabel1.setText("FECHA INICIO");

        jLabel2.setText("FECHA FIN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Busqueda Avanzada");

        jLabel4.setText("Por Intervalo de Fechas");

        jLabel5.setText("Por Producto");

        ComboBox_articulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escriba el nombre del producto" }));

        jButton1.setText("Preparar Busqueda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(ComboBox_articulos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(panelIntervaloFechas_JFormater_fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(panelIntervaloFechas_JFormater_fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelIntervaloFechas_JFormater_fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelIntervaloFechas_JFormater_fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBox_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigoProducto = "";
        //Se busca el ID del producto seleccionado
        try (java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select
                .productoPorCodigo(Logica.CamposTexto.Campo_extraerCodigo.getCode(
                        ComboBox_articulos.getItemAt(
                                ComboBox_articulos.getSelectedIndex())))) {
            rs.next();
            codigoProducto = rs.getString("idProducto");
        } catch (SQLException ex) {
            Logger.getLogger(Panel_busquedaAvanzadaFacturasVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.tipo.equals("venta")) {
            //Buscar todas las facturas que contengan el producto buscado por su id
            Diseño.Facturacion.paneles_historiales.panel_historialVentas.llenarTablaTodosDatos(
                    DataBase.Facturacion.FacturaVenta.Detalle.Select.FacturasBusquedaAvanzada(
                            codigoProducto,
                            Logica.String.String_convertirFechaAFormatoSQL.formatearFecha(panelIntervaloFechas_JFormater_fechaInicio.getText()),
                            Logica.String.String_convertirFechaAFormatoSQL.formatearFecha(panelIntervaloFechas_JFormater_fechaFin.getText())),
                    true);
        } else if (this.tipo.equals("compra")) {
            //Buscar todas las facturas que contengan el producto buscado por su id
            Diseño.Facturacion.paneles_historiales.panel_historialCompras.llenarTablaTodosDatos(
                    DataBase.Facturacion.FacturaCompra.Detalle.Select.FacturasBusquedaAvanzada(
                            codigoProducto,
                            Logica.String.String_convertirFechaAFormatoSQL.formatearFecha(panelIntervaloFechas_JFormater_fechaInicio.getText()),
                            Logica.String.String_convertirFechaAFormatoSQL.formatearFecha(panelIntervaloFechas_JFormater_fechaFin.getText())));
        } else if (this.tipo.equals("credito")) {
            //Buscar todas las facturas que contengan el producto buscado por su id
            Diseño.Financiera.paneles_pantallaPrincipal.panel_ClientesPendientes.actualizarLlenarTablaFacturasVentaCreditoActivas(
                    DataBase.Financiera.FacturaVentaCredito.Detalle.Select.FacturasBusquedaAvanzada(
                            codigoProducto,
                            Logica.String.String_convertirFechaAFormatoSQL.formatearFecha(panelIntervaloFechas_JFormater_fechaInicio.getText()),
                            Logica.String.String_convertirFechaAFormatoSQL.formatearFecha(panelIntervaloFechas_JFormater_fechaFin.getText())));
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_articulos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JFormattedTextField panelIntervaloFechas_JFormater_fechaFin;
    public javax.swing.JFormattedTextField panelIntervaloFechas_JFormater_fechaInicio;
    // End of variables declaration//GEN-END:variables

    private void ComponentsDetails() {
        //FECHA campos de texto
        panelIntervaloFechas_JFormater_fechaFin.setText(Logica.fechaHora.getFecha());
        String fecha = DataBase.logica.agregarDiasAFecha.agregarDias(
                Logica.String.String_convertirFechaAFormatoSQL.formatearFecha(
                        panelIntervaloFechas_JFormater_fechaFin.getText()), -365).replace("/", "");
        panelIntervaloFechas_JFormater_fechaInicio.setText(fecha);

        try (java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select.todoProductoConSinExistenciaAlmace("claveProducto")) {
            while (rs.next()) {
                ComboBox_articulos.addItem(rs.getString("claveProducto") + " . - " + rs.getString("descripcionProducto"));
            }
        } catch (java.sql.SQLException e) {
        }
    }
}

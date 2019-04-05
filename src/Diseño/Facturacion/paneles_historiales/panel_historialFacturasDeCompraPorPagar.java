package Diseño.Facturacion.paneles_historiales;

public class panel_historialFacturasDeCompraPorPagar extends Diseño.Facturacion.paneles_base.panelBase {

    private static javax.swing.JTable tabla1;
    private static javax.swing.JScrollPane pane1;
    private static javax.swing.table.DefaultTableModel model1;

    private static javax.swing.JTable tabla2;
    private static javax.swing.JScrollPane pane2;
    private static javax.swing.table.DefaultTableModel model2;

    public panel_historialFacturasDeCompraPorPagar() {
        initComponents();
        detallesComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagar = new javax.swing.JTextField();
        panelBaseHistorialFacturas_textFieldNombre = new javax.swing.JTextField();
        panelHistorialFacturas_botonImprimirFactura = new javax.swing.JButton();
        panelHistorialFacturas_botonEliminarFactura = new javax.swing.JButton();
        panelHistorialFacturas_botonPagarFactura = new javax.swing.JButton();

        panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagar.setForeground(new java.awt.Color(0, 102, 204));
        panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagarKeyReleased(evt);
            }
        });

        panelBaseHistorialFacturas_textFieldNombre.setBackground(new java.awt.Color(240, 240, 240));
        panelBaseHistorialFacturas_textFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelBaseHistorialFacturas_textFieldNombre.setForeground(new java.awt.Color(0, 102, 204));
        panelBaseHistorialFacturas_textFieldNombre.setEnabled(false);

        panelHistorialFacturas_botonImprimirFactura.setBackground(new java.awt.Color(204, 255, 255));
        panelHistorialFacturas_botonImprimirFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/printerSmall.png"))); // NOI18N
        panelHistorialFacturas_botonImprimirFactura.setText("Imprimir factura");

        panelHistorialFacturas_botonEliminarFactura.setBackground(new java.awt.Color(255, 102, 102));
        panelHistorialFacturas_botonEliminarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/delete.png"))); // NOI18N
        panelHistorialFacturas_botonEliminarFactura.setText("Eliminar factura");
        panelHistorialFacturas_botonEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelHistorialFacturas_botonEliminarFacturaActionPerformed(evt);
            }
        });

        panelHistorialFacturas_botonPagarFactura.setBackground(new java.awt.Color(51, 153, 255));
        panelHistorialFacturas_botonPagarFactura.setText("Pagar factura");
        panelHistorialFacturas_botonPagarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelHistorialFacturas_botonPagarFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelHistorialFacturas_botonPagarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelHistorialFacturas_botonEliminarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panelHistorialFacturas_botonImprimirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(panelBaseHistorialFacturas_textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBaseHistorialFacturas_textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(panelHistorialFacturas_botonEliminarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelHistorialFacturas_botonPagarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelHistorialFacturas_botonImprimirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //Evento del campo Buscar Facturas
    private void panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagarKeyReleased
        EventoCampoBuscar();
    }//GEN-LAST:event_panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagarKeyReleased

    private void panelHistorialFacturas_botonEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelHistorialFacturas_botonEliminarFacturaActionPerformed
        if (Logica.Cuadros_Emergentes.confirmacionDefinida(""
                + "-Se borrara la factura seleccionada.\n"
                + "-Los articulos saldran del inventario\n") == 0) {
            DataBase.Facturacion.FacturaCompra.CompraPorPagar.Update.eliminarFactura(
                    (String) tabla1.getValueAt(tabla1.getSelectedRow(), 0));
            llenarTablaTodosDatos();
            Logica.Cuadros_Emergentes.completado();
        }
    }//GEN-LAST:event_panelHistorialFacturas_botonEliminarFacturaActionPerformed

    private void panelHistorialFacturas_botonPagarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelHistorialFacturas_botonPagarFacturaActionPerformed
        if (Logica.Cuadros_Emergentes.confirmacionDefinida(""
                + "-El monto de la compra pasara al monto de dinero en caja.\n\n") == 0) {
            DataBase.Facturacion.FacturaCompra.CompraPorPagar.Update.pagarFactura((String) tabla1.getValueAt(tabla1.getSelectedRow(), 0));
            llenarTablaTodosDatos();
            Logica.Cuadros_Emergentes.completado();
        }
    }//GEN-LAST:event_panelHistorialFacturas_botonPagarFacturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JTextField panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagar;
    public static javax.swing.JTextField panelBaseHistorialFacturas_textFieldNombre;
    public static javax.swing.JButton panelHistorialFacturas_botonEliminarFactura;
    public static javax.swing.JButton panelHistorialFacturas_botonImprimirFactura;
    public static javax.swing.JButton panelHistorialFacturas_botonPagarFactura;
    // End of variables declaration//GEN-END:variables

    private void detallesComponentes() {
        panelHistorialFacturas_botonEliminarFactura.setVisible(false);
        panelHistorialFacturas_botonImprimirFactura.setVisible(false);
        panelHistorialFacturas_botonPagarFactura.setVisible(false);

        //TABLA 1
        tabla1 = new javax.swing.JTable();
        model1 = (javax.swing.table.DefaultTableModel) tabla1.getModel();
        pane1 = new javax.swing.JScrollPane(tabla1);
        pane1.setBounds(10, 49, 314, 382);
        this.add(pane1);

        //Evento Tabla
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Evento_tabla();
            }
        });

        //Fuentes Tabla
        tabla1.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 12));

        //Columnas Header Tabla
        String header[] = {"Nro.", "Fecha", "Total"};
        for (String titulos : header) {
            model1.addColumn(titulos);
        }

        //TABLA 2
        tabla2 = new javax.swing.JTable();
        model2 = (javax.swing.table.DefaultTableModel) tabla2.getModel();
        pane2 = new javax.swing.JScrollPane(tabla2);
        pane2.setBounds(320, 49, 562, 382);
        this.add(pane2);

        //Fuentes Tabla
        tabla2.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 12));

        //Columnas Header Tabla
        String header2[] = {"Codigo", "Descripcion", "Unidad", "Cant.", "Total"};
        for (String titulos : header2) {
            model2.addColumn(titulos);
        }
    }

    //**************************************************************//
    //************************* Metodos ****************************//
    //**************************************************************//
    private static void llenarTablaResultSet(java.sql.ResultSet rs) {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model1, tabla1);
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model2, tabla2);
        try {
            while (rs.next()) {
                model1.addRow(new Object[]{
                    rs.getString("idFacturaCompra"),
                    rs.getString("fecha"),
                    rs.getString("valorFacturaCompra")
                });
            }
            rs.close();
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }
    }

    //********************* Metodos Uso Externo ********************//
    //**************************************************************//
    /**
     * LLENAR LA TABLA con los productos activos y que tienen existencia.
     */
    public static void llenarTablaTodosDatos() {
        llenarTablaResultSet(DataBase.Facturacion.FacturaCompra.CompraPorPagar.Select
                .todasFacturasActivasNoPasadaCaja());

    }

    //**************************************************************//
    //************************ Eventos ****************************//
    //*************************************************************//
    private void Evento_tabla() {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model2, tabla2);
        try (java.sql.ResultSet rs = DataBase.Facturacion.FacturaCompra.Detalle.Select
                .detalleFctura((tabla1.getValueAt(tabla1.getSelectedRow(), 0)
                        .toString()), "detallecompraporpagar")) {
            while (rs.next()) {
                model2.addRow(new Object[]{
                    rs.getString("detallecompraporpagar.producto_idProducto"),
                    rs.getString("producto.descripcionProducto"),
                    rs.getString("detallecompraporpagar.costoProductoIndividualCompra"),
                    rs.getString("detallecompraporpagar.cantidadProductoCompra"),
                    rs.getInt("detallecompraporpagar.costoProductoIndividualCompra")
                    * rs.getInt("detallecompraporpagar.cantidadProductoCompra")
                });
                panelBaseHistorialFacturas_textFieldNombre
                        .setText(rs.getString("distribuidor.nombreDistribuidor")
                                + "(" + rs.getString("distribuidor.claveDistribuidor") + ")");
                //Mostrar los botones de eliminar e imprimir
                panelHistorialFacturas_botonEliminarFactura.setVisible(
                        Logica.CredencialesDeUsuario.getPrivilegio() == 1);
                panelHistorialFacturas_botonPagarFactura.setVisible(true);
                panelHistorialFacturas_botonImprimirFactura.setVisible(true);
            }
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void EventoCampoBuscar() {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model1, tabla1);
        try (java.sql.ResultSet rs = DataBase.Facturacion.FacturaCompra.CompraPorPagar
                .Select.facturaIDNoPasadaCaja(
                        panelBaseHistorialFacturas_textFieldBuscadorComprasPorPagar
                        .getText())) {
            llenarTablaResultSet(rs);
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }
    }
}

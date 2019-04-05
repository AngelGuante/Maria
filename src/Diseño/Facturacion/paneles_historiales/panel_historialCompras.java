package Diseño.Facturacion.paneles_historiales;

public class panel_historialCompras extends Diseño.Facturacion.paneles_base.panelBase {

    private static javax.swing.JTable tabla1;
    private static javax.swing.JScrollPane pane1;
    private static javax.swing.table.DefaultTableModel model1;

    private static javax.swing.JTable tabla2;
    private static javax.swing.JScrollPane pane2;
    private static javax.swing.table.DefaultTableModel model2;

    public panel_historialCompras() {
        initComponents();
        detallesComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBaseHistorialFacturas_textFieldBuscadorCompras = new javax.swing.JTextField();
        panelBaseHistorialFacturas_textFieldNombre = new javax.swing.JTextField();
        panelHistorialFacturas_botonImprimirFactura = new javax.swing.JButton();
        panelHistorialFacturas_botonEliminarFactura = new javax.swing.JButton();
        panelDatosAntesdeCompra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_Costo = new javax.swing.JLabel();
        label_cantidad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lb_facturadaPor = new javax.swing.JLabel();

        panelBaseHistorialFacturas_textFieldBuscadorCompras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelBaseHistorialFacturas_textFieldBuscadorCompras.setForeground(new java.awt.Color(0, 102, 204));
        panelBaseHistorialFacturas_textFieldBuscadorCompras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelBaseHistorialFacturas_textFieldBuscadorComprasKeyReleased(evt);
            }
        });

        panelBaseHistorialFacturas_textFieldNombre.setBackground(new java.awt.Color(240, 240, 240));
        panelBaseHistorialFacturas_textFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelBaseHistorialFacturas_textFieldNombre.setForeground(new java.awt.Color(0, 102, 204));
        panelBaseHistorialFacturas_textFieldNombre.setEnabled(false);

        panelHistorialFacturas_botonImprimirFactura.setBackground(new java.awt.Color(204, 255, 255));
        panelHistorialFacturas_botonImprimirFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/printerSmall.png"))); // NOI18N
        panelHistorialFacturas_botonImprimirFactura.setText("Imprimir factura");
        panelHistorialFacturas_botonImprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelHistorialFacturas_botonImprimirFacturaActionPerformed(evt);
            }
        });

        panelHistorialFacturas_botonEliminarFactura.setBackground(new java.awt.Color(255, 102, 102));
        panelHistorialFacturas_botonEliminarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/delete.png"))); // NOI18N
        panelHistorialFacturas_botonEliminarFactura.setText("Eliminar factura");
        panelHistorialFacturas_botonEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelHistorialFacturas_botonEliminarFacturaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Datos del Articulo Seleccionado");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Costo Antes de Compra:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cantida Antes de Compra:");

        label_Costo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_Costo.setForeground(new java.awt.Color(51, 102, 255));
        label_Costo.setText("0");

        label_cantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_cantidad.setForeground(new java.awt.Color(51, 102, 255));
        label_cantidad.setText("0");

        javax.swing.GroupLayout panelDatosAntesdeCompraLayout = new javax.swing.GroupLayout(panelDatosAntesdeCompra);
        panelDatosAntesdeCompra.setLayout(panelDatosAntesdeCompraLayout);
        panelDatosAntesdeCompraLayout.setHorizontalGroup(
            panelDatosAntesdeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosAntesdeCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosAntesdeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelDatosAntesdeCompraLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(label_Costo))
                    .addGroup(panelDatosAntesdeCompraLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_cantidad)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        panelDatosAntesdeCompraLayout.setVerticalGroup(
            panelDatosAntesdeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosAntesdeCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosAntesdeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(label_Costo))
                .addGap(11, 11, 11)
                .addGroup(panelDatosAntesdeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(label_cantidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Avanzada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lb_facturadaPor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_facturadaPor.setText("      ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBaseHistorialFacturas_textFieldBuscadorCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(panelBaseHistorialFacturas_textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_facturadaPor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelHistorialFacturas_botonEliminarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelHistorialFacturas_botonImprimirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDatosAntesdeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelBaseHistorialFacturas_textFieldBuscadorCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBaseHistorialFacturas_textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                .addComponent(panelDatosAntesdeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelHistorialFacturas_botonEliminarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelHistorialFacturas_botonImprimirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_facturadaPor))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //Evento del campo Buscar Facturas 
    private void panelBaseHistorialFacturas_textFieldBuscadorComprasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelBaseHistorialFacturas_textFieldBuscadorComprasKeyReleased
        EventoCampoBuscar();
    }//GEN-LAST:event_panelBaseHistorialFacturas_textFieldBuscadorComprasKeyReleased

    private void panelHistorialFacturas_botonEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelHistorialFacturas_botonEliminarFacturaActionPerformed
        if (Logica.Cuadros_Emergentes.confirmacionDefinida(""
                + "-Se borrara la factura seleccionada.\n"
                + "-Los articulos saldran del inventario\n"
                + "-El monto de la venta regresara al monto de dinero en caja.\n\n") == 0) {
            DataBase.Facturacion.FacturaCompra.Compra.Update.eliminarFactura((String) tabla1.getValueAt(tabla1.getSelectedRow(), 0));
            llenarTablaTodosDatos();
            Logica.Cuadros_Emergentes.completado();
        }
    }//GEN-LAST:event_panelHistorialFacturas_botonEliminarFacturaActionPerformed

    private void panelHistorialFacturas_botonImprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelHistorialFacturas_botonImprimirFacturaActionPerformed
        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
        parametros.put("idFactura", (String) tabla1.getValueAt(tabla1.getSelectedRow(), 0));
        Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                parametros,
                "Facturacion\\FacturaCompra",
                false);
    }//GEN-LAST:event_panelHistorialFacturas_botonImprimirFacturaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Logica.Cuadros_Emergentes.BusquedaAvanzadaFacturasVentas(
                "BUSQUEDA AVANZADA DE FACTURAS DE COMPRAS",
                "compra");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_Costo;
    private javax.swing.JLabel label_cantidad;
    private static javax.swing.JLabel lb_facturadaPor;
    protected static javax.swing.JTextField panelBaseHistorialFacturas_textFieldBuscadorCompras;
    public static javax.swing.JTextField panelBaseHistorialFacturas_textFieldNombre;
    private static javax.swing.JPanel panelDatosAntesdeCompra;
    public static javax.swing.JButton panelHistorialFacturas_botonEliminarFactura;
    public static javax.swing.JButton panelHistorialFacturas_botonImprimirFactura;
    // End of variables declaration//GEN-END:variables

    private void detallesComponentes() {
        panelHistorialFacturas_botonEliminarFactura.setVisible(false);
        panelHistorialFacturas_botonImprimirFactura.setVisible(false);
        panelDatosAntesdeCompra.setVisible(false);

        //MAYUSCULA campos de texto
        Logica.CamposTexto.Campo_mayuscula.campoTextoMayuscula(panelBaseHistorialFacturas_textFieldBuscadorCompras);

        //TAMAÑO campos de texto
        Logica.CamposTexto.Campo_limiteDigitosCampo.SetCampoTextoLimite(panelBaseHistorialFacturas_textFieldBuscadorCompras, 25);

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
                Evento_tabla1();
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
        pane2.setBounds(320, 49, 562, 290);
        this.add(pane2);

        //Evento Tabla
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Evento_tabla2();
            }
        });

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
        lb_facturadaPor.setText("");
        llenarTablaResultSet(DataBase.Facturacion.FacturaCompra.Compra.Select
                .todasFacturasActivas());
        panelDatosAntesdeCompra.setVisible(false);
        panelHistorialFacturas_botonEliminarFactura.setVisible(false);
        panelHistorialFacturas_botonImprimirFactura.setVisible(false);
    }

    public static void llenarTablaTodosDatos(java.sql.ResultSet rs) {
        lb_facturadaPor.setText("");
        llenarTablaResultSet(rs);
        panelDatosAntesdeCompra.setVisible(false);
        panelHistorialFacturas_botonEliminarFactura.setVisible(false);
        panelHistorialFacturas_botonImprimirFactura.setVisible(false);
    }

    //**************************************************************//
    //************************ Eventos ****************************//
    //*************************************************************//
    private void Evento_tabla1() {
        String codigoEmpleado = DataBase.Facturacion.FacturaCompra.Compra.Select.facturadaPor(
                (String) (tabla1.getValueAt(tabla1.getSelectedRow(),
                        0)));
        lb_facturadaPor.setText(
                "Facturada por:  "
                + DataBase.Facturacion.Empleado.Select.Empleado(codigoEmpleado, true));
        
        panelDatosAntesdeCompra.setVisible(false);
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model2, tabla2);
        try (java.sql.ResultSet rs = DataBase.Facturacion.FacturaCompra.Detalle.Select
                .detalleFctura((tabla1.getValueAt(tabla1.getSelectedRow(), 0)
                        .toString()), "detallecompra")) {
            while (rs.next()) {
                model2.addRow(new Object[]{
                    rs.getString("producto.claveProducto"),
                    rs.getString("producto.descripcionProducto"),
                    rs.getString("detallecompra.costoProductoIndividualCompra"),
                    rs.getString("detallecompra.cantidadProductoCompra"),
                    rs.getInt("detallecompra.costoProductoIndividualCompra")
                    * rs.getInt("detallecompra.cantidadProductoCompra")
                });
                panelBaseHistorialFacturas_textFieldNombre
                        .setText(rs.getString("distribuidor.nombreDistribuidor")
                                + "(" + rs.getString("distribuidor.claveDistribuidor") + ")");
                //Mostrar los botones de eliminar e imprimir
                panelHistorialFacturas_botonEliminarFactura
                        .setVisible(Logica.CredencialesDeUsuario.getPrivilegio() == 1);
                panelHistorialFacturas_botonImprimirFactura.setVisible(true);
            }
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void Evento_tabla2() {
        panelDatosAntesdeCompra.setVisible(true);
        String[] datos = DataBase.Facturacion.datosproductosantesdecompra.Select
                .DatosProdcutoAntesDeCompra(
                        (String) tabla1.getValueAt(tabla1.getSelectedRow(), 0),
                        (String) tabla2.getValueAt(tabla2.getSelectedRow(), 0));
        label_Costo.setText(datos[0]);
        label_cantidad.setText(datos[1]);
    }

    private void EventoCampoBuscar() {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model1, tabla1);

        //Primero se realiza la busqueda por el ID de la factura
        java.sql.ResultSet rs = DataBase.Facturacion.FacturaCompra.Compra.Select
                .facturaID(panelBaseHistorialFacturas_textFieldBuscadorCompras
                        .getText());
        llenarTablaResultSet(rs);

        //En caso de que no se encuentre niinguna factura por su ID se buscara
        //por el nombre o clave del distribuidor
        if (tabla1.getRowCount() < 1) {
            java.sql.ResultSet rs1;
            rs1 = DataBase.Facturacion.FacturaCompra.Compra.Select
                    .facturasPorDatosDistribuido(panelBaseHistorialFacturas_textFieldBuscadorCompras
                            .getText());
            llenarTablaResultSet(rs1);
        }
    }
}

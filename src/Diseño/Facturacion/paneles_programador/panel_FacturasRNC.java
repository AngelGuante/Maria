package Diseño.Facturacion.paneles_programador;

import Logica.GenerarExcel;

public class panel_FacturasRNC extends Diseño.Facturacion.paneles_base.panelBase {

    private static javax.swing.JTable tabla1;
    private static javax.swing.JScrollPane pane1;
    private static javax.swing.table.DefaultTableModel model1;

    private static javax.swing.JTable tabla2;
    private static javax.swing.JScrollPane pane2;
    private static javax.swing.table.DefaultTableModel model2;

    public panel_FacturasRNC() {
        initComponents();
        detallesComponentes();
        llenarTablaTodosDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbg = new javax.swing.ButtonGroup();
        panelBaseHistorialFacturas_textFieldBuscadorVentas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NroFacturasSeleccionadas = new javax.swing.JLabel();
        panelHistorialFacturas_botonImprimirFactura = new javax.swing.JButton();

        panelBaseHistorialFacturas_textFieldBuscadorVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelBaseHistorialFacturas_textFieldBuscadorVentas.setForeground(new java.awt.Color(0, 102, 204));
        panelBaseHistorialFacturas_textFieldBuscadorVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("FACTURAS SELECCIONADAS:");

        NroFacturasSeleccionadas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NroFacturasSeleccionadas.setText("0");

        panelHistorialFacturas_botonImprimirFactura.setBackground(new java.awt.Color(204, 255, 255));
        panelHistorialFacturas_botonImprimirFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/printerSmall.png"))); // NOI18N
        panelHistorialFacturas_botonImprimirFactura.setText("Generar Excel");
        panelHistorialFacturas_botonImprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelHistorialFacturas_botonImprimirFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBaseHistorialFacturas_textFieldBuscadorVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NroFacturasSeleccionadas)
                .addContainerGap(333, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHistorialFacturas_botonImprimirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(NroFacturasSeleccionadas))
                    .addComponent(panelBaseHistorialFacturas_textFieldBuscadorVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(panelHistorialFacturas_botonImprimirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(524, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased
        EventoCampoBuscar();
    }//GEN-LAST:event_panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased

    private void panelHistorialFacturas_botonImprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelHistorialFacturas_botonImprimirFacturaActionPerformed
        String[][] contenido = new String[tabla2.getRowCount() + 1][5];

        int NCF = 1000;
        
        contenido[0][0] = "NCF";
        contenido[0][1] = "Total factura";
        contenido[0][2] = "ITBIS";
        contenido[0][3] = "Total + ITBIS";
        contenido[0][4] = "Fecha";
        
        for (int i = 0; i < tabla2.getRowCount(); i++) {
            contenido[i + 1][0] = Integer.toString(NCF++);
            contenido[i + 1][1] = tabla2.getValueAt(i, 2).toString();
            contenido[i + 1][2] = Double.toString(Double.parseDouble(tabla2.getValueAt(i, 2).toString()) * 0.18);
            contenido[i + 1][3] = Double.toString(Double.parseDouble(contenido[i + 1][1]) + Double.parseDouble(contenido[i + 1][2]));
            contenido[i + 1][4] = tabla2.getValueAt(i, 1).toString();
        }

        String ruta = "C:/Users/Angel/Desktop/Facturas.xls";

        new GenerarExcel().generar(contenido, ruta);
    }//GEN-LAST:event_panelHistorialFacturas_botonImprimirFacturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NroFacturasSeleccionadas;
    private javax.swing.JLabel jLabel1;
    protected static javax.swing.JTextField panelBaseHistorialFacturas_textFieldBuscadorVentas;
    public static javax.swing.JButton panelHistorialFacturas_botonImprimirFactura;
    private javax.swing.ButtonGroup rbg;
    // End of variables declaration//GEN-END:variables

    //*************************************************************//
    //*********************** -METODOS- **************************//
    //*************************************************************//
    /**
     * LLENAR LA TABLA con los productos activos y que tienen existencia.
     */
    public static void llenarTablaTodosDatos() {
        llenarTablaResultSet(DataBase.Facturacion.FacturaVenta.Venta.Select
                .FacturasBusquedaAvanzada(), true);
    }

    private static void llenarTablaResultSet(java.sql.ResultSet rs, boolean limpiar) {
        //Si limpiar es true se limpian las tablas.
        if (limpiar) {
            Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model1, tabla1);
        }

        try {
            while (rs.next()) {
                model1.addRow(new Object[]{
                    rs.getString("idFacturaVenta"),
                    rs.getString("fecha"),
                    rs.getString("valorFacturaVenta")
                });
            }
            rs.close();
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }
    }

    //**************************************************************//
    //***************** Configurar componentes ********************//
    //*************************************************************//
    private void detallesComponentes() {
        //TABLA 1
        tabla1 = new javax.swing.JTable();
        model1 = (javax.swing.table.DefaultTableModel) tabla1.getModel();
        pane1 = new javax.swing.JScrollPane(tabla1);
        pane1.setBounds(10, 49, 314, 382);
        this.add(pane1);

        //Fuentes Tabla
        tabla1.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 12));

        //Columnas Header Tabla
        String header[] = {"Nro.", "Fecha", "Total"};
        for (String titulos : header) {
            model1.addColumn(titulos);
        }

        //Evento Tabla 1
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                model2.addRow(new Object[]{tabla1.getValueAt(tabla1.getSelectedRow(), 0), tabla1.getValueAt(tabla1.getSelectedRow(), 1), tabla1.getValueAt(tabla1.getSelectedRow(), 2)});
                NroFacturasSeleccionadas.setText(Integer.toString((Integer.parseInt(NroFacturasSeleccionadas.getText()) + 1)));
            }
        });

        //TABLA 2
        tabla2 = new javax.swing.JTable();
        model2 = (javax.swing.table.DefaultTableModel) tabla2.getModel();
        pane2 = new javax.swing.JScrollPane(tabla2);
        pane2.setBounds(330, 49, 314, 382);
        this.add(pane2);

        //Fuentes Tabla
        tabla2.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 12));

        //Columnas Header Tabla
        String header2[] = {"Nro.", "Fecha", "Total"};
        for (String titulos : header) {
            model2.addColumn(titulos);
        }

        //Evento Tabla 2
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                model2.removeRow(tabla2.getSelectedRow());
                NroFacturasSeleccionadas.setText(Integer.toString((Integer.parseInt(NroFacturasSeleccionadas.getText()) - 1)));

            }
        });
    }

    private void EventoCampoBuscar() {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model1, tabla1);

        //Primero se realiza la busqueda por el ID de la factura
        java.sql.ResultSet rs;
        rs = DataBase.Facturacion.FacturaVenta.Venta.Select
                .facturaID(panelBaseHistorialFacturas_textFieldBuscadorVentas
                        .getText());
        llenarTablaResultSet(rs, true);

        //En caso de que no se encuentre niinguna factura por su ID se buscara
        //por el nombre apellido o cedula del cliente
        if (tabla1.getRowCount() < 1) {
            java.sql.ResultSet rs1;
            rs1 = DataBase.Facturacion.FacturaVenta.Venta.Select
                    .facturasPorDatosQuickClient(panelBaseHistorialFacturas_textFieldBuscadorVentas
                            .getText());
            llenarTablaResultSet(rs1, true);
            rs1 = DataBase.Facturacion.FacturaVenta.Venta.Select
                    .facturasPorDatosCliente(panelBaseHistorialFacturas_textFieldBuscadorVentas
                            .getText());
            llenarTablaResultSet(rs1, false);
        }
    }
}

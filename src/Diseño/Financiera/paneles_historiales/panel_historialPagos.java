package Diseño.Financiera.paneles_historiales;

public class panel_historialPagos extends Diseño.Facturacion.paneles_base.panelBase {

    private static javax.swing.JTable tabla1;
    private static javax.swing.JScrollPane pane1;
    private static javax.swing.table.DefaultTableModel model1;

    public panel_historialPagos() {
        initComponents();
        ComponentsDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBaseHistorialFacturas_textFieldBuscadorVentas = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setLayout(null);

        panelBaseHistorialFacturas_textFieldBuscadorVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelBaseHistorialFacturas_textFieldBuscadorVentas.setForeground(new java.awt.Color(0, 102, 204));
        panelBaseHistorialFacturas_textFieldBuscadorVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased(evt);
            }
        });
        add(panelBaseHistorialFacturas_textFieldBuscadorVentas);
        panelBaseHistorialFacturas_textFieldBuscadorVentas.setBounds(10, 11, 310, 32);

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setText("Imprimir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(10, 430, 100, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased
        EventoCampoBuscar();
    }//GEN-LAST:event_panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Historial ReportesConDB
        String idPago = (String) model1.getValueAt(
                tabla1.getSelectedRow(), 0);
        String ruta = "\\Reportes\\Historial\\P-" + idPago + ".txt";
        int atraso = Integer.parseInt(Logica.FileBufferWritter.readFileLineByLine(
                ruta, 0));
        String numeroAtrasos = Logica.FileBufferWritter.readFileLineByLine(ruta,
                1);
        //REPORTE
        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
        parametros.put("id", idPago);
        parametros.put("atraso", atraso);
        parametros.put("numeroAtrasos", numeroAtrasos);
        Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                parametros,
                "Financiera\\ComprobantePago",
                false);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    protected static javax.swing.JTextField panelBaseHistorialFacturas_textFieldBuscadorVentas;
    // End of variables declaration//GEN-END:variables

    private void ComponentsDetails() {
        //Tabla
        tabla1 = new javax.swing.JTable();
        model1 = (javax.swing.table.DefaultTableModel) tabla1.getModel();
        pane1 = new javax.swing.JScrollPane(tabla1);
        pane1.setBounds(10, 49, 350, 382);
        this.add(pane1);

        //Evento Tabla
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5.setVisible(true);
            }
        });

        //Fuentes Tabla
        tabla1.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 12));

        //Columnas Header Tabla
        String header[] = {"Nro. Pago", "Nro. Recivo", "Fecha", "Total"};
        for (String titulos : header) {
            model1.addColumn(titulos);
        }
    }

    //**************************************************************//
    //************************* Metodos ****************************//
    //**************************************************************//
    private static void llenarTablaResultSet(java.sql.ResultSet rs) {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model1, tabla1);
        try {
            while (rs.next()) {
                model1.addRow(new Object[]{
                    rs.getString("idPagos"),
                    rs.getString("idVentaCredito"),
                    rs.getString("fecha"),
                    rs.getString("montoPagado")
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
     * LLENAR LA TABLA con todos los datos.
     */
    public static void llenarTablaTodosDatos() {
        llenarTablaResultSet(DataBase.Financiera.Pagos.Select.todosPagosActivos());

    }

    private void EventoCampoBuscar() {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model1, tabla1);
        try (java.sql.ResultSet rs = DataBase.Financiera.Pagos.Select.todosPagosActivosDeFactura(
                panelBaseHistorialFacturas_textFieldBuscadorVentas.getText())) {
            llenarTablaResultSet(rs);
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }
    }
}

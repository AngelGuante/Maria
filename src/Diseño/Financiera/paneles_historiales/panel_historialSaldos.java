package Diseño.Financiera.paneles_historiales;

public class panel_historialSaldos extends Diseño.Facturacion.paneles_base.panelBase {

    private static javax.swing.JTable tabla1;
    private static javax.swing.JScrollPane pane1;
    private static javax.swing.table.DefaultTableModel model1;

    public panel_historialSaldos() {
        initComponents();
        ComponentesDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBaseHistorialFacturas_textFieldBuscadorVentas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

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

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(10, 430, 100, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased
        EventoCampoBuscar();
    }//GEN-LAST:event_panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Mostrar ReportesConDB
        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
        try (java.sql.ResultSet rs = DataBase.Financiera.saldos.Select
                .saldoFacturaVentaCredito((String) model1.getValueAt(
                        tabla1.getSelectedRow(), 0))) {
            rs.next();
            parametros.put("id", rs.getInt("saldos.idSaldos"));
            Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                    parametros,
                    "Financiera\\ComprobanteSaldo",
                    false);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    protected static javax.swing.JTextField panelBaseHistorialFacturas_textFieldBuscadorVentas;
    // End of variables declaration//GEN-END:variables

    private void ComponentesDetails() {
        //Tabla
        tabla1 = new javax.swing.JTable();
        model1 = (javax.swing.table.DefaultTableModel) tabla1.getModel();
        pane1 = new javax.swing.JScrollPane(tabla1);
        pane1.setBounds(10, 49, 314, 382);
        this.add(pane1);

        //Evento Tabla
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1.setVisible(true);
            }
        });

        //Fuentes Tabla
        tabla1.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 12));

        //Columnas Header Tabla
        String header[] = {"Nro.", "Fecha", "Total"};
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
                    rs.getString("idVentaCredito"),
                    rs.getString("fecha"),
                    rs.getString("totalSaldo")
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
        llenarTablaResultSet(DataBase.Financiera.saldos.Select.todosSaldos());

    }

    private void EventoCampoBuscar() {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model1, tabla1);
        try (java.sql.ResultSet rs = DataBase.Financiera.saldos.Select
                .saldoFacturaVentaCredito(
                        panelBaseHistorialFacturas_textFieldBuscadorVentas.getText())) {
            llenarTablaResultSet(rs);
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }
    }
}

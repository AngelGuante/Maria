package Diseño.Financiera.paneles_historiales;

public class panel_historialEnvargos extends Diseño.Facturacion.paneles_base.panelBase {

    private static javax.swing.JTable tabla1;
    private static javax.swing.JScrollPane pane1;
    private static javax.swing.table.DefaultTableModel model1;

    public panel_historialEnvargos() {
        initComponents();
        ComponetsDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBaseHistorialFacturas_textFieldBuscadorVentas = new javax.swing.JTextField();

        panelBaseHistorialFacturas_textFieldBuscadorVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelBaseHistorialFacturas_textFieldBuscadorVentas.setForeground(new java.awt.Color(0, 102, 204));
        panelBaseHistorialFacturas_textFieldBuscadorVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased(evt);
            }
        });
        add(panelBaseHistorialFacturas_textFieldBuscadorVentas);
        panelBaseHistorialFacturas_textFieldBuscadorVentas.setBounds(10, 11, 310, 32);
    }// </editor-fold>//GEN-END:initComponents

    private void panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased
        EventoCampoBuscar();
    }//GEN-LAST:event_panelBaseHistorialFacturas_textFieldBuscadorVentasKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JTextField panelBaseHistorialFacturas_textFieldBuscadorVentas;
    // End of variables declaration//GEN-END:variables

    private void ComponetsDetails() {
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
                    "0"
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
        llenarTablaResultSet(DataBase.Financiera.Envargo.Select.todosEnvargos());
    }

    private void EventoCampoBuscar() {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model1, tabla1);
        try (java.sql.ResultSet rs = DataBase.Financiera.Envargo.Select.envargoDeFactura(
                        panelBaseHistorialFacturas_textFieldBuscadorVentas.getText())) {
            llenarTablaResultSet(rs);
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }
    }
}

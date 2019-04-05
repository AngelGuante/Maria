package Diseño.Financiera.paneles_ver;

public class panel_verAbonos extends Diseño.Facturacion.paneles_base.panelBase_crearArticuloClienteDistribuidor {

    private static javax.swing.JTable tabla;
    private static javax.swing.JScrollPane pane;
    private static javax.swing.table.DefaultTableModel model;
    private static java.sql.ResultSet rs;
    
    public panel_verAbonos() {
        initComponents();
        detallesComponentes();
        modificarComponentesPanelPadre();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVerAbonos_textFieldBuscarAbonos = new javax.swing.JTextField();

        panelVerAbonos_textFieldBuscarAbonos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelVerAbonos_textFieldBuscarAbonosKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelVerAbonos_textFieldBuscarAbonos, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(panelVerAbonos_textFieldBuscarAbonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelVerAbonos_textFieldBuscarAbonosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelVerAbonos_textFieldBuscarAbonosKeyReleased
        rs = DataBase.Financiera.abonoAPago.Select.abonoParametrizado(panelVerAbonos_textFieldBuscarAbonos.getText());
        llenarTabla(rs);
    }//GEN-LAST:event_panelVerAbonos_textFieldBuscarAbonosKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField panelVerAbonos_textFieldBuscarAbonos;
    // End of variables declaration//GEN-END:variables

    private void detallesComponentes() {
        //Tabla
        tabla = new javax.swing.JTable();
        model = (javax.swing.table.DefaultTableModel) tabla.getModel();
        pane = new javax.swing.JScrollPane(tabla);
        pane.setBounds(6,60, 322, 325);
        this.add(pane);
        
        //Fuentes Tabla
        tabla.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 12));

        //Columnas Header Tabla
        String header[] = {"Cliente", "Recivo", "Abono"};
        for (int i = 0; i < header.length; i++) {
            model.addColumn(header[i]);
        }

        //TAMAÑO celdas de tabla
        int[] tamaño = {206, 50, 45};
        Logica.tablas.Tabla_tamañoCeldas.setTablaColumnasTamaño(tamaño, tabla);
        
        //LLENA la tabla
        rs = DataBase.Financiera.abonoAPago.Select.todosAbonos();
        llenarTabla(rs);
    }
    
    private void modificarComponentesPanelPadre() {
        //LABELS
        panelCrearArticuloClienteDistribuidor_labelLosCamposMarcadosSonObligatorios.setVisible(false);
        panelCrearArticuloClienteDistribuidor_labelTitulo.setText("ABONOS");
    }
    
    //**************************************************************//
    //************************* Metodos ****************************//
    //**************************************************************//
    public static void llenarTabla(java.sql.ResultSet rs) {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model, tabla);
        try {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("nombreCliente") + " " + rs.getString("apellidoCliente") ,
                    rs.getString("abonoapago.ventaCredito_idVentaCredito"),
                    rs.getString("suma")
                });
            }
            rs.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void llenarTablaDesdeFuera() {
        rs = DataBase.Financiera.abonoAPago.Select.todosAbonos();
        llenarTabla(rs);
    }
}
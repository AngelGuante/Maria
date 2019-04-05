package Diseño.Facturacion.paneles_historiales;

import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_mayuscula;

public class panel_historialFacturasEliminadasCompras extends Diseño.Facturacion.paneles_base.panelBase {

    private static javax.swing.JTable tabla1;
    private static javax.swing.JScrollPane pane1;
    private static javax.swing.table.DefaultTableModel model1;

    private static javax.swing.JTable tabla2;
    private static javax.swing.JScrollPane pane2;
    private static javax.swing.table.DefaultTableModel model2;

    public panel_historialFacturasEliminadasCompras() {
        initComponents();
        ComponentsDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBaseHistorialFacturas_textFieldBuscadorCompras = new javax.swing.JTextField();
        panelBaseHistorialFacturas_textFieldNombre = new javax.swing.JTextField();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBaseHistorialFacturas_textFieldBuscadorCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(panelBaseHistorialFacturas_textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelBaseHistorialFacturas_textFieldBuscadorCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBaseHistorialFacturas_textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(444, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Evento del campo Buscar Facturas 
    private void panelBaseHistorialFacturas_textFieldBuscadorComprasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelBaseHistorialFacturas_textFieldBuscadorComprasKeyReleased
        EventoCampoBuscar();
    }//GEN-LAST:event_panelBaseHistorialFacturas_textFieldBuscadorComprasKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JTextField panelBaseHistorialFacturas_textFieldBuscadorCompras;
    public static javax.swing.JTextField panelBaseHistorialFacturas_textFieldNombre;
    // End of variables declaration//GEN-END:variables

    private void ComponentsDetails() {
        
        //MAYUSCULA campos de texto
        Campo_mayuscula.campoTextoMayuscula(panelBaseHistorialFacturas_textFieldBuscadorCompras);

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelBaseHistorialFacturas_textFieldBuscadorCompras, 25);
        
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
        String header2[] = {"Codigo", "Descripcion", "Precio", "Costo", "C", "Total"};
        for (String titulos : header2) {
            model2.addColumn(titulos);
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
        llenarTablaResultSet(DataBase.Facturacion.FacturaCompra.Compra.Select
                .todasFacturasEliminadas());
    }

    //**************************************************************//
    //************************ Eventos ****************************//
    //*************************************************************//
    private void Evento_tabla() {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model2, tabla2);
        try (java.sql.ResultSet rs = DataBase.Facturacion.FacturaCompra.Detalle.Select
                .detalleFctura((tabla1.getValueAt(tabla1.getSelectedRow(), 0)
                        .toString()), "detallecompra")) {
            while (rs.next()) {
                model2.addRow(new Object[]{
                    rs.getString("detallecompra.producto_idProducto"),
                    rs.getString("producto.descripcionProducto"),
                    rs.getString("detallecompra.costoProductoIndividualCompra"),
                    rs.getString("detallecompra.cantidadProductoCompra"),
                    rs.getInt("detallecompra.costoProductoIndividualCompra")
                    * rs.getInt("detallecompra.cantidadProductoCompra")
                });
                panelBaseHistorialFacturas_textFieldNombre
                        .setText(rs.getString("distribuidor.nombreDistribuidor")
                                + "(" + rs.getString("distribuidor.claveDistribuidor") + ")");
            }
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void EventoCampoBuscar() {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model1, tabla1);
        try (java.sql.ResultSet rs = DataBase.Facturacion.FacturaCompra.Compra.Select
                .facturaEliminada(panelBaseHistorialFacturas_textFieldBuscadorCompras
                        .getText())) {
            llenarTablaResultSet(rs);
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }
    }
}

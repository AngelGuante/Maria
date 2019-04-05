package Diseño.Facturacion.paneles_pantallaPrincipal;

import Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo;
import Diseño.Facturacion.paneles_modificar.panel_modificarArticulo;
import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_mayuscula;

public class panel_inventario extends Diseño.Facturacion.paneles_base.panelBase_inventarioClientesDistribuidores {

    private static javax.swing.JTable tabla;
    private static javax.swing.JScrollPane pane;
    private static javax.swing.table.DefaultTableModel model;
    public static panel_nuevoArticulo panelNuevo = new panel_nuevoArticulo();
    public static panel_modificarArticulo panelModificar = new panel_modificarArticulo();

    public panel_inventario() {
        initComponents();
        modificarComponentesPanelPadre();
        detallesComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInventario_grupoRadio = new javax.swing.ButtonGroup();
        panelInventario_radioVerSoloSinExistencia = new javax.swing.JRadioButton();
        panelInventario_radioVerSoloConExistencia = new javax.swing.JRadioButton();
        panelInventario_radioVerTodo = new javax.swing.JRadioButton();
        panelInventario_botonImprimir = new javax.swing.JButton();
        panelInventario_textFieldTotalAlmacen = new javax.swing.JTextField();
        panelInventario_labelTotalEnAlmacen = new javax.swing.JLabel();
        panelBaseInventarioClientesDistribuidores_textFieldBuscador = new javax.swing.JTextField();
        panelInventario_botonNuevoProducto = new javax.swing.JButton();

        panelInventario_grupoRadio.add(panelInventario_radioVerSoloSinExistencia);
        panelInventario_radioVerSoloSinExistencia.setText("Sin existencia");
        panelInventario_radioVerSoloSinExistencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelInventario_radioVerSoloSinExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelInventario_radioVerSoloSinExistenciaActionPerformed(evt);
            }
        });
        add(panelInventario_radioVerSoloSinExistencia);
        panelInventario_radioVerSoloSinExistencia.setBounds(470, 20, 110, 17);

        panelInventario_grupoRadio.add(panelInventario_radioVerSoloConExistencia);
        panelInventario_radioVerSoloConExistencia.setText("Con existencia");
        panelInventario_radioVerSoloConExistencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelInventario_radioVerSoloConExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelInventario_radioVerSoloConExistenciaActionPerformed(evt);
            }
        });
        add(panelInventario_radioVerSoloConExistencia);
        panelInventario_radioVerSoloConExistencia.setBounds(360, 20, 110, 17);

        panelInventario_grupoRadio.add(panelInventario_radioVerTodo);
        panelInventario_radioVerTodo.setSelected(true);
        panelInventario_radioVerTodo.setText("Ver todo");
        panelInventario_radioVerTodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelInventario_radioVerTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelInventario_radioVerTodoActionPerformed(evt);
            }
        });
        add(panelInventario_radioVerTodo);
        panelInventario_radioVerTodo.setBounds(290, 20, 90, 17);

        panelInventario_botonImprimir.setBackground(new java.awt.Color(204, 255, 255));
        panelInventario_botonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/printerSmall.png"))); // NOI18N
        panelInventario_botonImprimir.setText("Imprimir");
        panelInventario_botonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelInventario_botonImprimirActionPerformed(evt);
            }
        });
        add(panelInventario_botonImprimir);
        panelInventario_botonImprimir.setBounds(100, 430, 100, 28);

        panelInventario_textFieldTotalAlmacen.setEditable(false);
        panelInventario_textFieldTotalAlmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelInventario_textFieldTotalAlmacen.setForeground(new java.awt.Color(255, 0, 0));
        add(panelInventario_textFieldTotalAlmacen);
        panelInventario_textFieldTotalAlmacen.setBounds(510, 430, 87, 28);

        panelInventario_labelTotalEnAlmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelInventario_labelTotalEnAlmacen.setText("Total en almacen:");
        panelInventario_labelTotalEnAlmacen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelInventario_labelTotalEnAlmacen.setMaximumSize(new java.awt.Dimension(100, 18));
        panelInventario_labelTotalEnAlmacen.setMinimumSize(new java.awt.Dimension(100, 18));
        add(panelInventario_labelTotalEnAlmacen);
        panelInventario_labelTotalEnAlmacen.setBounds(380, 430, 220, 30);

        panelBaseInventarioClientesDistribuidores_textFieldBuscador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelBaseInventarioClientesDistribuidores_textFieldBuscador.setForeground(new java.awt.Color(0, 102, 204));
        panelBaseInventarioClientesDistribuidores_textFieldBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelBaseInventarioClientesDistribuidores_textFieldBuscadorKeyReleased(evt);
            }
        });
        add(panelBaseInventarioClientesDistribuidores_textFieldBuscador);
        panelBaseInventarioClientesDistribuidores_textFieldBuscador.setBounds(2, 10, 280, 28);

        panelInventario_botonNuevoProducto.setBackground(new java.awt.Color(0, 153, 255));
        panelInventario_botonNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/add.png"))); // NOI18N
        panelInventario_botonNuevoProducto.setText("Nuevo");
        panelInventario_botonNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelInventario_botonNuevoProductoActionPerformed(evt);
            }
        });
        add(panelInventario_botonNuevoProducto);
        panelInventario_botonNuevoProducto.setBounds(0, 430, 100, 28);
    }// </editor-fold>//GEN-END:initComponents

    //Radio button "todos los productos"
    private void panelInventario_radioVerTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelInventario_radioVerTodoActionPerformed
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model, tabla);
        llenarTablaTodosDatosInventario();
    }//GEN-LAST:event_panelInventario_radioVerTodoActionPerformed

    //Radio button "productos en almacen"
    private void panelInventario_radioVerSoloConExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelInventario_radioVerSoloConExistenciaActionPerformed
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model, tabla);
        llenarTablaProctosEnAlmacen();
    }//GEN-LAST:event_panelInventario_radioVerSoloConExistenciaActionPerformed

    //Evento de el campo de busqueda de la clase padre que llena la tabla segun los datos del campo.
    private void panelBaseInventarioClientesDistribuidores_textFieldBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelBaseInventarioClientesDistribuidores_textFieldBuscadorKeyReleased
        java.sql.ResultSet rs;
        if (panelInventario_radioVerTodo.isSelected()) {
            rs = DataBase.Facturacion.Producto.Select.productoLike(panelBaseInventarioClientesDistribuidores_textFieldBuscador.getText());
        } else if (panelInventario_radioVerSoloConExistencia.isSelected()) {
            rs = DataBase.Facturacion.Producto.Select.productoLikeEnAlmacen(panelBaseInventarioClientesDistribuidores_textFieldBuscador.getText());
        } else {
            rs = DataBase.Facturacion.Producto.Select.productoLikeNoAlmacen(panelBaseInventarioClientesDistribuidores_textFieldBuscador.getText());
        }
        actualizarLlenarTabla(rs);
    }//GEN-LAST:event_panelBaseInventarioClientesDistribuidores_textFieldBuscadorKeyReleased

    //Radio button "productos NO almacen"
    private void panelInventario_radioVerSoloSinExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelInventario_radioVerSoloSinExistenciaActionPerformed
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model, tabla);
        llenarTablaProctosNoAlmacen();
    }//GEN-LAST:event_panelInventario_radioVerSoloSinExistenciaActionPerformed

    //Boton "Nuevo"
    private void panelInventario_botonNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelInventario_botonNuevoProductoActionPerformed
        Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.reestablecerElementos();
        panelModificar.setVisible(false);
        panelNuevo.setVisible(true);
    }//GEN-LAST:event_panelInventario_botonNuevoProductoActionPerformed

    private void panelInventario_botonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelInventario_botonImprimirActionPerformed
        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
        java.util.List<String> codigos = new java.util.ArrayList<>();
        java.util.List<String> descripcion = new java.util.ArrayList<>();
        java.util.List<String> costo = new java.util.ArrayList<>();
        java.util.List<String> cantidad = new java.util.ArrayList<>();

        for (int i = 0; i < tabla.getRowCount(); i++) {
            codigos.add((String) tabla.getValueAt(i, 0));
            descripcion.add((String) tabla.getValueAt(i, 1));
            costo.add((String) tabla.getValueAt(i, 3));
            cantidad.add((String) tabla.getValueAt(i, 4));
        }

        parametros.put("codigos", codigos);
        parametros.put("descripcion", descripcion);
        parametros.put("costo", costo);
        parametros.put("cantidad", cantidad);
        Logica.Reportes.Reporte_generarSinDB.ReportesSinDB(
                parametros,
                "Facturacion\\ListadoDeInventario",
                false);
    }//GEN-LAST:event_panelInventario_botonImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JTextField panelBaseInventarioClientesDistribuidores_textFieldBuscador;
    private javax.swing.JButton panelInventario_botonImprimir;
    private javax.swing.JButton panelInventario_botonNuevoProducto;
    private javax.swing.ButtonGroup panelInventario_grupoRadio;
    private javax.swing.JLabel panelInventario_labelTotalEnAlmacen;
    public static javax.swing.JRadioButton panelInventario_radioVerSoloConExistencia;
    public static javax.swing.JRadioButton panelInventario_radioVerSoloSinExistencia;
    public static javax.swing.JRadioButton panelInventario_radioVerTodo;
    private static javax.swing.JTextField panelInventario_textFieldTotalAlmacen;
    // End of variables declaration//GEN-END:variables

    private void detallesComponentes() {
        //Tabla
        tabla = new javax.swing.JTable();
        model = (javax.swing.table.DefaultTableModel) tabla.getModel();
        pane = new javax.swing.JScrollPane(tabla);
        pane.setBounds(5, 40, 595, 390);
        this.add(pane);

        //Evento Tabla
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel_modificarArticulo.reestablecerElementos();
                panelNuevo.setVisible(false);
                panelModificar.setVisible(true);
                //Poner los detalles de el articulo seleccionado en los campos correspondientes:
                if (Logica.tablas.Tabla_verificarFilaSeleccionada.rowSelectedNotNull(tabla)) {
                    Diseño.Facturacion.paneles_modificar.panel_modificarArticulo.panelModificarArticulo_textFieldCodigo.setText((tabla.getValueAt(tabla.getSelectedRow(), 0)).toString());
                    Diseño.Facturacion.paneles_modificar.panel_modificarArticulo.panelModificarArticulo_textAreaDescripcion.setText((tabla.getValueAt(tabla.getSelectedRow(), 1)).toString());
                    Diseño.Facturacion.paneles_modificar.panel_modificarArticulo.panelModificarArticulo_textFieldPrecio.setText((tabla.getValueAt(tabla.getSelectedRow(), 2)).toString());
                    Diseño.Facturacion.paneles_modificar.panel_modificarArticulo.panelModificarArticulo_textFieldCosto.setText((tabla.getValueAt(tabla.getSelectedRow(), 3)).toString());
                    Diseño.Facturacion.paneles_modificar.panel_modificarArticulo.panelModificarArticulo_textFieldEnAlmacen.setText((tabla.getValueAt(tabla.getSelectedRow(), 4)).toString());
                }
            }
        });

        //Fuentes Tabla
        tabla.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 12));

        //Columnas Header Tabla
        String header[] = {"Codigo", "Descripcion", "Precio", "Costo", "C", "Total"};
        for (String titulos : header) {
            model.addColumn(titulos);
        }

        //TAMAÑO celdas de tabla
        int[] tamaño = {118, 289, 45, 44, 28, 50};
        Logica.tablas.Tabla_tamañoCeldas.setTablaColumnasTamaño(tamaño, tabla);

        //LLENA la tabla
        llenarTablaTodosDatosInventario();

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelBaseInventarioClientesDistribuidores_textFieldBuscador, 29);

        //MAYUSCULA campos de texto
        Campo_mayuscula.campoTextoMayuscula(panelBaseInventarioClientesDistribuidores_textFieldBuscador);

        //PANELES
        panelModificar.setBounds(600, 75, 280, 385);
        add(panelModificar);
        panelModificar.setVisible(false);
        panelNuevo.setBounds(600, 75, 280, 385);
        add(panelNuevo);
        panelNuevo.setVisible(false);
    }

    private void modificarComponentesPanelPadre() {
        //LABELS
        panelBaseInventarioClientesDistribuidores_labelInventarioClienteDistribuidor.setText("INVENTARIO");
    }

    //llena la tabla con los datos recibidos por el ResultSet, y pasa aquellos datos
    //que no se colocaran en la tabla pero que si se van a usar en otro lado, en un
    //arrayList.
    private static void actualizarLlenarTabla(java.sql.ResultSet rs) {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model, tabla);
        int totalCostosProductos = 0;
        try {
            while (rs.next()) {
                String costoUnidad = rs.getString("costoUnidadProducto");
                String cantidadAlmacen = rs.getString("cantidadAlmacenProducto");
                int costoXcantidad = Integer.parseInt(costoUnidad) * Integer.parseInt(cantidadAlmacen);
                model.addRow(new Object[]{
                    rs.getString("claveProducto"),
                    rs.getString("descripcionProducto"),
                    rs.getString("precioUnidadProducto"),
                    costoUnidad,
                    cantidadAlmacen,
                    costoXcantidad
                });

                totalCostosProductos += costoXcantidad;
            }
            rs.close();
            panelInventario_textFieldTotalAlmacen.setText(Integer.toString(totalCostosProductos));
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    //**************************************************************//
    //******************* Metodos de Eventos **********************//
    //*************************************************************//
    //LLENAR LA TABLA con los productos activos y que tienen existencia en el
    //almacen en la base de datos.
    public static void llenarTablaProctosEnAlmacen() {
        java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select.ProductoEnAlmacen();
        actualizarLlenarTabla(rs);
    }

    //LLENAR LA TABLA con los productos activos y que No tienen existencia
    //en el almacen en la base de datos.
    public static void llenarTablaProctosNoAlmacen() {
        java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select.ProductoNoAlmacen();
        actualizarLlenarTabla(rs);
    }

    //LLENAR LA TABLA con todos los productos activos de la base de datos.
    public static void llenarTablaTodosDatosInventario() {
        java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select.todoProductoConSinExistenciaAlmace("descripcionProducto");
        actualizarLlenarTabla(rs);
    }
}

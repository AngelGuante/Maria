package Diseño.Facturacion.paneles_base;

import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_tipoNumero;
import javax.swing.JTextField;

public class panelBase_CompraVenta extends panelBase {

    protected javax.swing.JTextField herencia_texteFieldCantidad;
    protected javax.swing.JTextField herencia_texteFieldPrecioCosto;
    protected javax.swing.JTextField herencia_texteFieldCodigoProducto;
    protected javax.swing.table.DefaultTableModel herencia_model;
    protected javax.swing.JTable herencia_tabla;
    protected javax.swing.JButton herencia_botonEliminar;
    protected javax.swing.JTextField herencia_textFieldClienteDistribuidor;

    public panelBase_CompraVenta() {
        initComponents();
        detallesComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBaseCompraVenta_separador1 = new javax.swing.JSeparator();
        panelBaseCompraVenta_textFieldCosto = new javax.swing.JTextField();
        panelBaseCompraVenta_textFieldEnAlmacen = new javax.swing.JTextField();
        panelBaseCompraVenta_textFieldTotal = new javax.swing.JTextField();
        panelBaseCompraVenta_separador2 = new javax.swing.JSeparator();
        panelBaseCompraVenta_labelGuardar = new javax.swing.JLabel();
        panelBaseCompraVenta_labelGuardarImprimir = new javax.swing.JLabel();
        panelBaseCompraVenta_labelTotal = new javax.swing.JLabel();
        panelBaseCompraVenta_textFieldFecha = new javax.swing.JFormattedTextField();
        panelBaseCompraVenta_labelVentaCompra = new javax.swing.JLabel();
        panelBaseCompraVenta_botonLimpiar = new javax.swing.JButton();
        panelBaseCompraVenta_labelLimpiarVentana = new javax.swing.JLabel();

        setForeground(new java.awt.Color(0, 153, 204));
        setLayout(null);

        panelBaseCompraVenta_separador1.setBackground(new java.awt.Color(0, 0, 0));
        panelBaseCompraVenta_separador1.setForeground(new java.awt.Color(0, 0, 0));
        add(panelBaseCompraVenta_separador1);
        panelBaseCompraVenta_separador1.setBounds(0, 80, 980, 10);

        panelBaseCompraVenta_textFieldCosto.setEditable(false);
        panelBaseCompraVenta_textFieldCosto.setText("0");
        panelBaseCompraVenta_textFieldCosto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Costo"));
        panelBaseCompraVenta_textFieldCosto.setEnabled(false);
        add(panelBaseCompraVenta_textFieldCosto);
        panelBaseCompraVenta_textFieldCosto.setBounds(10, 130, 80, 40);

        panelBaseCompraVenta_textFieldEnAlmacen.setEditable(false);
        panelBaseCompraVenta_textFieldEnAlmacen.setText("0");
        panelBaseCompraVenta_textFieldEnAlmacen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Almacen"));
        panelBaseCompraVenta_textFieldEnAlmacen.setEnabled(false);
        add(panelBaseCompraVenta_textFieldEnAlmacen);
        panelBaseCompraVenta_textFieldEnAlmacen.setBounds(90, 130, 70, 40);

        panelBaseCompraVenta_textFieldTotal.setEditable(false);
        panelBaseCompraVenta_textFieldTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        panelBaseCompraVenta_textFieldTotal.setForeground(new java.awt.Color(0, 153, 153));
        panelBaseCompraVenta_textFieldTotal.setText("0");
        add(panelBaseCompraVenta_textFieldTotal);
        panelBaseCompraVenta_textFieldTotal.setBounds(70, 330, 140, 42);

        panelBaseCompraVenta_separador2.setBackground(new java.awt.Color(0, 0, 0));
        panelBaseCompraVenta_separador2.setForeground(new java.awt.Color(0, 0, 0));
        add(panelBaseCompraVenta_separador2);
        panelBaseCompraVenta_separador2.setBounds(0, 370, 970, 10);

        panelBaseCompraVenta_labelGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelBaseCompraVenta_labelGuardar.setText("Guardar");
        panelBaseCompraVenta_labelGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(panelBaseCompraVenta_labelGuardar);
        panelBaseCompraVenta_labelGuardar.setBounds(690, 380, 190, 40);

        panelBaseCompraVenta_labelGuardarImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelBaseCompraVenta_labelGuardarImprimir.setText("Guardar e imprimir");
        panelBaseCompraVenta_labelGuardarImprimir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(panelBaseCompraVenta_labelGuardarImprimir);
        panelBaseCompraVenta_labelGuardarImprimir.setBounds(690, 420, 190, 40);

        panelBaseCompraVenta_labelTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelBaseCompraVenta_labelTotal.setText("TOTAL");
        panelBaseCompraVenta_labelTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(panelBaseCompraVenta_labelTotal);
        panelBaseCompraVenta_labelTotal.setBounds(10, 330, 200, 40);

        panelBaseCompraVenta_textFieldFecha.setForeground(new java.awt.Color(0, 102, 204));
        try {
            panelBaseCompraVenta_textFieldFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##. ##. ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelBaseCompraVenta_textFieldFecha.setText("03. 01. 2017");
        add(panelBaseCompraVenta_textFieldFecha);
        panelBaseCompraVenta_textFieldFecha.setBounds(140, 10, 120, 29);

        panelBaseCompraVenta_labelVentaCompra.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        panelBaseCompraVenta_labelVentaCompra.setText("FACTURA DE ");
        add(panelBaseCompraVenta_labelVentaCompra);
        panelBaseCompraVenta_labelVentaCompra.setBounds(290, 0, 410, 44);

        panelBaseCompraVenta_botonLimpiar.setBackground(new java.awt.Color(153, 255, 153));
        panelBaseCompraVenta_botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/erase.png"))); // NOI18N
        panelBaseCompraVenta_botonLimpiar.setToolTipText("Limpia los datos contenidos en la ventana (SE PUEDEN LLEGAR A PERDER DATOS SI NO HA GUARDADO).");
        panelBaseCompraVenta_botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelBaseCompraVenta_botonLimpiarActionPerformed(evt);
            }
        });
        add(panelBaseCompraVenta_botonLimpiar);
        panelBaseCompraVenta_botonLimpiar.setBounds(640, 380, 50, 40);

        panelBaseCompraVenta_labelLimpiarVentana.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelBaseCompraVenta_labelLimpiarVentana.setText("Limpiar ventana");
        panelBaseCompraVenta_labelLimpiarVentana.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(panelBaseCompraVenta_labelLimpiarVentana);
        panelBaseCompraVenta_labelLimpiarVentana.setBounds(500, 380, 190, 40);
    }// </editor-fold>//GEN-END:initComponents

    //Reestablece los componentes de la ventana de factura.
    private void panelBaseCompraVenta_botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBaseCompraVenta_botonLimpiarActionPerformed
        if ((Logica.Cuadros_Emergentes.confirmacionDefinida(
                "-Limpia toda la ventana perdiendo los datos de la factura."
        )) == 0) {
            reestablecerElementos();
        }
    }//GEN-LAST:event_panelBaseCompraVenta_botonLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton panelBaseCompraVenta_botonLimpiar;
    protected javax.swing.JLabel panelBaseCompraVenta_labelGuardar;
    protected javax.swing.JLabel panelBaseCompraVenta_labelGuardarImprimir;
    protected javax.swing.JLabel panelBaseCompraVenta_labelLimpiarVentana;
    protected javax.swing.JLabel panelBaseCompraVenta_labelTotal;
    protected javax.swing.JLabel panelBaseCompraVenta_labelVentaCompra;
    protected javax.swing.JSeparator panelBaseCompraVenta_separador1;
    protected javax.swing.JSeparator panelBaseCompraVenta_separador2;
    protected javax.swing.JTextField panelBaseCompraVenta_textFieldCosto;
    protected javax.swing.JTextField panelBaseCompraVenta_textFieldEnAlmacen;
    protected javax.swing.JFormattedTextField panelBaseCompraVenta_textFieldFecha;
    protected javax.swing.JTextField panelBaseCompraVenta_textFieldTotal;
    // End of variables declaration//GEN-END:variables

    private void detallesComponentes() {
        //FECHA campos de texto
        panelBaseCompraVenta_textFieldFecha.setText(Logica.fechaHora.getFecha());

        //FUENTES campos de texto
        panelBaseCompraVenta_textFieldFecha.setFont(new java.awt.Font("Tahoma", 0, 18));
    }

    //************************************************************************//
    //******** Metodos para configurar componentes de clases hijas ***********//
    //************************************************************************//
    /**
     * Configura los componentes que tienen un mismo funcionamiento y que son
     * similares en las clases hijas.
     *
     * @param campoPrecioCost Campo a aplicarle la configuración
     * @param campoCantidad Campo a aplicarle la configucación
     */
    protected void Herencia_detallesComponentes(JTextField campoPrecioCost, JTextField campoCantidad) {
        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(campoPrecioCost, 5);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(campoCantidad, 3);

        //TIPO campo de texto
        Campo_tipoNumero.campoTextoTipoNumero(campoPrecioCost);
        Campo_tipoNumero.campoTextoTipoNumero(campoCantidad);
    }

    /**
     * Agrega el evento a la tabla.
     */
    protected void Herencia_metodoEventoTabla() {
        reestablecerElementosSuperioresVentana();
        DatosTodosProducto(herencia_model.getValueAt(herencia_tabla.getSelectedRow(), 0).toString());
        herencia_texteFieldPrecioCosto.setText(herencia_model.getValueAt(herencia_tabla.getSelectedRow(), 2).toString());
        herencia_texteFieldCantidad.setText(herencia_model.getValueAt(herencia_tabla.getSelectedRow(), 3).toString());
        herencia_botonEliminar.setVisible(true);
    }

    /**
     * Agrega el evento al boton eliminar de las clases hijas.
     */
    protected void Herencia_metodoEventoBotonEliminar() {
        herencia_botonEliminar.setVisible(false);
        panelBaseCompraVenta_textFieldTotal.setText(Integer.toString(
                Integer.parseInt(panelBaseCompraVenta_textFieldTotal.getText())
                - (Integer) herencia_tabla.getValueAt(herencia_tabla.getSelectedRow(), 4)
        ));
        panelBaseCompraVenta_textFieldCosto.setText("0");
        panelBaseCompraVenta_textFieldEnAlmacen.setText("0");
        herencia_texteFieldCantidad.setText("0");
        herencia_texteFieldPrecioCosto.setText("0");
        herencia_model.removeRow(herencia_tabla.getSelectedRow());
    }

    /**
     * Establece el evento de el campo que muestra el costo y el precio de el
     * producto seleccionado en las clases hijas.
     */
    protected void Herencia_metodoEventoCampoPrecioCosto() {
        try {
            if ((Integer.parseInt(herencia_texteFieldPrecioCosto.getText())) > 0) {
                herencia_texteFieldCantidad.setEditable(true);
                herencia_texteFieldCantidad.setText("1");
                herencia_texteFieldCantidad.requestFocus();
                herencia_texteFieldCantidad.setEnabled(true);
                herencia_texteFieldCantidad.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
            } else {
                Logica.Cuadros_Emergentes.alerta("La cantidad debe ser mayor que  0.");
            }
        } catch (java.lang.NumberFormatException e) {
            Logica.Cuadros_Emergentes.alerta("Debe poner una cantidad.");
        }
    }

    /**
     * Establece el evento de el campo que muestra la cantidad del producto que
     * se va a registrar en la tabla.
     *
     * @return int. el costo de el producto, -1 en caso de que haya algún error.
     */
    @SuppressWarnings({"CallToPrintStackTrace", "ConvertToTryWithResources"})
    protected int[] Herencia_metodoEventoCampoCantidad() {
        //Verificar que el campo de 'cantidad' NO este vacio.
        if ((Integer.parseInt(herencia_texteFieldCantidad.getText())) > 0) {
            @SuppressWarnings("UnusedAssignment")
            int total = 0;
            int costo;
            int cantidad = Integer.parseInt(herencia_texteFieldCantidad.getText());
            try {
                java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select.productoPorCodigo(herencia_texteFieldCodigoProducto.getText().substring(0, (herencia_texteFieldCodigoProducto.getText()).indexOf(" .")));
                rs.next();
                total = Integer.parseInt(herencia_texteFieldPrecioCosto.getText())
                        * cantidad;
                costo = rs.getInt("costoUnidadProducto");
                //Agregar el dato a la tabla
                herencia_model.addRow(new Object[]{
                    rs.getString("claveProducto"),
                    rs.getString("descripcionProducto"),
                    herencia_texteFieldPrecioCosto.getText(),
                    herencia_texteFieldCantidad.getText(),
                    total
                });
                //Poner el monto agregado por esta factura al total de la factura
                panelBaseCompraVenta_textFieldTotal.setText(
                        Integer.toString(
                                Integer.parseInt(panelBaseCompraVenta_textFieldTotal.getText())
                                + total
                        ));
                reestablecerElementosSuperioresVentana();
                rs.close();
                return new int[]{costo, cantidad};
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("La cantidad debe ser mayor que  0.");
            return null;
        }
        return null;
    }

    /**
     * Metodo de evento para el botón guardar de las clases hijas.
     *
     * @param monto Monto con el cual se realiza la transaccion en la factura
     * @return boolean true si todo es correcto.
     */
    protected boolean Herencia_metodoEventoBotonGuardar(String monto) {
        //Proceso de verificacion de movimientos diarios.
        if (Logica.gestiosDineroCaja.verificarExistenciaYEstadoDia(panelBaseCompraVenta_textFieldFecha.getText())) {
            //Verifica que la factura tenga algun producto.
            if (!(panelBaseCompraVenta_textFieldTotal.getText().equals("0"))) {
                switch (monto) {
                    case "0":
                        if ((Logica.Cuadros_Emergentes.confirmacionDefinida(
                                "-Guardara esta factura.")) == 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((Logica.Cuadros_Emergentes.Transacciones(
                                monto)) == 0) {
                            return true;
                        }
                }
            } else {
                Logica.Cuadros_Emergentes.alerta("La factura debe tener algun producto.");
                return false;
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("No se puede realizar la factura en esta fecha.\n"
                    + "Esta fecha esta cerrada.");
            return false;
        }
        return false;
    }

    //************************************************************************//
    //******** Metodos para configurar componentes de clases hijas ***********//
    //************************************************************************//
    //asigna los datos de los productos para autoCompletar al campo pasado por parametro.
    public static void autoCompleterCampoBuscadorArticulo(javax.swing.JTextField tf, String nombreCampo) {
        java.util.ArrayList<String> al = new java.util.ArrayList<>();
        java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select.todoProductoConSinExistenciaAlmace("descripcionProducto");
        try {
            while (rs.next()) {
                al.add(rs.getString("claveProducto") + " . - " + rs.getString("descripcionProducto"));
            }
            Logica.CamposTexto.Campo_autoCompleter.setAutoCompleterInfijo(tf, al, nombreCampo);
        } catch (java.sql.SQLException e) {
        }
    }

    //asigna los datos de los distribuidores o clientes para autoCompletar al campo pasado por parametro.
    public static void autoCompleterCampoClienteDistribuidor(javax.swing.JTextField tf, boolean clienteODistribuidor, String nombreCampo) {
        java.util.ArrayList<String> al = new java.util.ArrayList<>();
        @SuppressWarnings("UnusedAssignment")
        java.sql.ResultSet rs = null;
        //Si clienteODistribuidor es true buscara los clientes y si no, los distribuidores
        if (clienteODistribuidor) {
            rs = DataBase.Facturacion.Clientes.Select.todoClientes();
        } else {
            rs = DataBase.Facturacion.Distribuidor.Select.todoDistribuidores();
        }

        try {
            while (rs.next()) {
                if (clienteODistribuidor) {
                    al.add(rs.getString("cedulaCliente") + " . " + rs.getString("nombreCliente") + " . " + rs.getString("apellidoCliente"));
                } else {
                    al.add(rs.getString("claveDistribuidor") + " . " + rs.getString("nombreDistribuidor"));
                }
            }
            Logica.CamposTexto.Campo_autoCompleter.setAutoCompleterInfijo(tf, al, nombreCampo);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Limpiar componentes de la ventana.
     */
    protected void reestablecerElementos() {
        panelBaseCompraVenta_textFieldFecha.setText(Logica.fechaHora.getFecha());
        panelBaseCompraVenta_textFieldTotal.setText("0");
        herencia_botonEliminar.setVisible(false);
        herencia_textFieldClienteDistribuidor.setText("0 . GENERICO**");
        herencia_texteFieldPrecioCosto.setText("0");
        herencia_texteFieldCantidad.setText("0");
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(herencia_model, herencia_tabla);
    }

    /**
     * Limpia los campos de la parte superior de la ventana.
     */
    protected void reestablecerElementosSuperioresVentana() {
        herencia_texteFieldPrecioCosto.setEnabled(false);
        herencia_texteFieldCantidad.setEnabled(false);
        herencia_texteFieldCodigoProducto.setText("");
        herencia_texteFieldPrecioCosto.setText("0");
        herencia_texteFieldCantidad.setText("0");
        panelBaseCompraVenta_textFieldEnAlmacen.setText("0");
        panelBaseCompraVenta_textFieldCosto.setText("0");
    }

    /**
     * Para el metodo de el BOTON ver los clientes y los distribuidores.
     */
    protected void eventoBotonClienteDistribuidor() {
    }

    /**
     * Para el metodo de ver el historial de facturas de ventas y compras.
     */
    protected void eventoBotonHistorial() {
    }

    /**
     * Llena los campos de costo, y cantidad en almacen, del codigo del
     * procducto pasado por parametro.
     *
     * @param codigoProducto
     */
    protected void DatosTodosProducto(String codigoProducto) {
        @SuppressWarnings("UnusedAssignment")
        java.sql.ResultSet rs = null;
        try {
            rs = DataBase.Facturacion.Producto.Select.productoPorCodigo(codigoProducto);
            rs.next();
            panelBaseCompraVenta_textFieldCosto.setText(rs.getString("costoUnidadProducto"));
            panelBaseCompraVenta_textFieldEnAlmacen.setText(rs.getString("cantidadAlmacenProducto"));
            rs.close();
        } catch (java.sql.SQLException ex) {
        }
    }

    //Llena los campos de costo, y cantidad en almacen, para para en codigo
    //pasado por parametro.(solo los que tienen cantidad en  almacen).
    protected void datosAlmacenProducto(String codigoProducto) {
        @SuppressWarnings("UnusedAssignment")
        java.sql.ResultSet rs = null;
        try {
            rs = DataBase.Facturacion.Producto.Select.productoParametroEnAlmacen(codigoProducto);
            rs.next();
            panelBaseCompraVenta_textFieldCosto.setText(rs.getString("costoUnidadProducto"));
            panelBaseCompraVenta_textFieldEnAlmacen.setText(rs.getString("cantidadAlmacenProducto"));
            rs.close();
        } catch (java.sql.SQLException ex) {
            panelBaseCompraVenta_textFieldEnAlmacen.setText("0");
        }
    }
}

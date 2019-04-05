package Diseño.Facturacion.paneles_pantallaPrincipal;

import Logica.CamposTexto.Campo_limiteDigitosCampo;

public class panel_compras extends Diseño.Facturacion.paneles_base.panelBase_CompraVenta {

    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane pane;
    private javax.swing.table.DefaultTableModel model;

    public panel_compras() {
        initComponents();
        detallesComponentes();
        modificarComponentesPanelPadre();
        herencia_texteFieldCantidad = panelCompra_textFieldCantidad;
        herencia_texteFieldPrecioCosto = panelCompra_textFieldCosto;
        herencia_texteFieldCodigoProducto = panelCompra_textFieldCodigoProducto;
        herencia_model = model;
        herencia_tabla = tabla;
        herencia_botonEliminar = paneCompra_botonEliminarFilaSeleccionada;
        herencia_textFieldClienteDistribuidor = panelCompra_textFieldDistribuidor;
        panelBaseCompraVenta_botonGuardarImprimir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCompra_groupRadioButton = new javax.swing.ButtonGroup();
        panelCompra_radioButtonPasarACaja = new javax.swing.JRadioButton();
        panelCompra_radioButtonNoPasarACaja = new javax.swing.JRadioButton();
        panelCompra_textFieldCodigoProducto = new javax.swing.JTextField();
        panelCompra_textFieldDistribuidor = new javax.swing.JTextField();
        panelCompra_textFieldCodigo = new javax.swing.JTextField();
        panelCompra_botonDistribuidores = new javax.swing.JButton();
        paneCompra_botonEliminarFilaSeleccionada = new javax.swing.JButton();
        panelCompra_textFieldCantidad = new javax.swing.JTextField();
        panelCompra_textFieldCosto = new javax.swing.JTextField();
        panelCompra_botonGuardarFactura = new javax.swing.JButton();
        panelBaseCompraVenta_botonGuardarImprimir = new javax.swing.JButton();
        panelBaseCompraVenta_botonHistorial = new javax.swing.JButton();

        panelCompra_groupRadioButton.add(panelCompra_radioButtonPasarACaja);
        panelCompra_radioButtonPasarACaja.setForeground(new java.awt.Color(0, 51, 153));
        panelCompra_radioButtonPasarACaja.setSelected(true);
        panelCompra_radioButtonPasarACaja.setText("Pasar a caja");
        panelCompra_radioButtonPasarACaja.setToolTipText("Al crear la factura con esta opcion seleccionada el total se vera reflejado en el cuadre de la caja.");
        panelCompra_radioButtonPasarACaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(panelCompra_radioButtonPasarACaja);
        panelCompra_radioButtonPasarACaja.setBounds(10, 377, 101, 17);

        panelCompra_groupRadioButton.add(panelCompra_radioButtonNoPasarACaja);
        panelCompra_radioButtonNoPasarACaja.setForeground(new java.awt.Color(0, 102, 153));
        panelCompra_radioButtonNoPasarACaja.setText("No pasar a caja");
        panelCompra_radioButtonNoPasarACaja.setToolTipText("Al crear la factura con esta opcion seleccionada el total NO se vera reflejado en el cuadre de la caja.");
        panelCompra_radioButtonNoPasarACaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(panelCompra_radioButtonNoPasarACaja);
        panelCompra_radioButtonNoPasarACaja.setBounds(117, 377, 150, 17);

        panelCompra_textFieldCodigoProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelCompra_textFieldCodigoProducto.setForeground(new java.awt.Color(0, 153, 204));
        panelCompra_textFieldCodigoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Codigo"));
        panelCompra_textFieldCodigoProducto.setMinimumSize(new java.awt.Dimension(630, 28));
        panelCompra_textFieldCodigoProducto.setPreferredSize(new java.awt.Dimension(630, 28));
        panelCompra_textFieldCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCompra_textFieldCodigoProductoActionPerformed(evt);
            }
        });
        add(panelCompra_textFieldCodigoProducto);
        panelCompra_textFieldCodigoProducto.setBounds(10, 91, 630, 40);

        panelCompra_textFieldDistribuidor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelCompra_textFieldDistribuidor.setForeground(new java.awt.Color(0, 102, 204));
        panelCompra_textFieldDistribuidor.setText("GENERICO** .");
        panelCompra_textFieldDistribuidor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Distribuidor"));
        panelCompra_textFieldDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCompra_textFieldDistribuidorActionPerformed(evt);
            }
        });
        add(panelCompra_textFieldDistribuidor);
        panelCompra_textFieldDistribuidor.setBounds(10, 40, 450, 40);

        panelCompra_textFieldCodigo.setEditable(false);
        panelCompra_textFieldCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelCompra_textFieldCodigo.setForeground(new java.awt.Color(0, 102, 204));
        panelCompra_textFieldCodigo.setText("1000");
        add(panelCompra_textFieldCodigo);
        panelCompra_textFieldCodigo.setBounds(10, 10, 80, 30);

        panelCompra_botonDistribuidores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCompra_botonDistribuidores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/managerSmall.png"))); // NOI18N
        panelCompra_botonDistribuidores.setText("  Distribuidores");
        panelCompra_botonDistribuidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCompra_botonDistribuidoresActionPerformed(evt);
            }
        });
        add(panelCompra_botonDistribuidores);
        panelCompra_botonDistribuidores.setBounds(710, 40, 166, 40);

        paneCompra_botonEliminarFilaSeleccionada.setBackground(new java.awt.Color(255, 102, 102));
        paneCompra_botonEliminarFilaSeleccionada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        paneCompra_botonEliminarFilaSeleccionada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/delete.png"))); // NOI18N
        paneCompra_botonEliminarFilaSeleccionada.setText("Eliminar fila seleccionada");
        paneCompra_botonEliminarFilaSeleccionada.setToolTipText("");
        paneCompra_botonEliminarFilaSeleccionada.setActionCommand("");
        paneCompra_botonEliminarFilaSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paneCompra_botonEliminarFilaSeleccionadaActionPerformed(evt);
            }
        });
        add(paneCompra_botonEliminarFilaSeleccionada);
        paneCompra_botonEliminarFilaSeleccionada.setBounds(650, 150, 230, 25);

        panelCompra_textFieldCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelCompra_textFieldCantidad.setForeground(new java.awt.Color(0, 153, 204));
        panelCompra_textFieldCantidad.setText("0");
        panelCompra_textFieldCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cantidad"));
        panelCompra_textFieldCantidad.setEnabled(false);
        panelCompra_textFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCompra_textFieldCantidadActionPerformed(evt);
            }
        });
        add(panelCompra_textFieldCantidad);
        panelCompra_textFieldCantidad.setBounds(720, 80, 70, 50);

        panelCompra_textFieldCosto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelCompra_textFieldCosto.setForeground(new java.awt.Color(0, 153, 204));
        panelCompra_textFieldCosto.setText("0");
        panelCompra_textFieldCosto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Costo"));
        panelCompra_textFieldCosto.setEnabled(false);
        panelCompra_textFieldCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCompra_textFieldCostoActionPerformed(evt);
            }
        });
        add(panelCompra_textFieldCosto);
        panelCompra_textFieldCosto.setBounds(640, 80, 80, 50);

        panelCompra_botonGuardarFactura.setBackground(new java.awt.Color(102, 204, 255));
        panelCompra_botonGuardarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save.png"))); // NOI18N
        panelCompra_botonGuardarFactura.setToolTipText("Guarda la factura sin realizar una impresion de ella.");
        panelCompra_botonGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCompra_botonGuardarFacturaActionPerformed(evt);
            }
        });
        add(panelCompra_botonGuardarFactura);
        panelCompra_botonGuardarFactura.setBounds(830, 380, 50, 40);

        panelBaseCompraVenta_botonGuardarImprimir.setBackground(new java.awt.Color(204, 255, 255));
        panelBaseCompraVenta_botonGuardarImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/printer.png"))); // NOI18N
        panelBaseCompraVenta_botonGuardarImprimir.setToolTipText("Guarda e imprime la factura.");
        panelBaseCompraVenta_botonGuardarImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelBaseCompraVenta_botonGuardarImprimirActionPerformed(evt);
            }
        });
        add(panelBaseCompraVenta_botonGuardarImprimir);
        panelBaseCompraVenta_botonGuardarImprimir.setBounds(830, 420, 50, 40);

        panelBaseCompraVenta_botonHistorial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelBaseCompraVenta_botonHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/invoice.png"))); // NOI18N
        panelBaseCompraVenta_botonHistorial.setText("  Facturas");
        panelBaseCompraVenta_botonHistorial.setToolTipText("");
        panelBaseCompraVenta_botonHistorial.setActionCommand("");
        panelBaseCompraVenta_botonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelBaseCompraVenta_botonHistorialActionPerformed(evt);
            }
        });
        add(panelBaseCompraVenta_botonHistorial);
        panelBaseCompraVenta_botonHistorial.setBounds(710, 0, 166, 40);
    }// </editor-fold>//GEN-END:initComponents

    //evento del campo buscar producto, despues de verificarse que el codigo/nombre del 
    //producto introducido existe, si existe activa el campo de precio/costo pero si no 
    //existe le avisa al usuario que este no existe para mandarlo a la ventana de creacion
    //de codigo.
    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void panelCompra_textFieldCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCompra_textFieldCodigoProductoActionPerformed
        //ESTAS LINEAS SE ELIMINARAN EN PROXIMAS ACTUALIZACIONES Y OPTIMIZACIONES
        panelCompra_textFieldCosto.setText("0");
        panelBaseCompraVenta_textFieldCosto.setText("0");
        panelBaseCompraVenta_textFieldEnAlmacen.setText("0");
        panelCompra_textFieldCosto.setEnabled(false);

        String codigo = Logica.CamposTexto.Campo_extraerCodigo.getCode(panelCompra_textFieldCodigoProducto);
        java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select.productoPorCodigo(codigo);
        try {
            rs.next();
            rs.getString("idProducto");
            DatosTodosProducto(codigo);
            panelCompra_textFieldCosto.setText(rs.getString("costoUnidadProducto"));
            panelCompra_textFieldCosto.setEnabled(true);
            panelCompra_textFieldCosto.requestFocus();
            panelCompra_textFieldCosto.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        } catch (java.sql.SQLException ex) {
            if ((Logica.Cuadros_Emergentes.confirmacionProductoClienteDistribuidorNoEncontrado(codigo)) == 0) {
                Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.panelModificar.setVisible(false);
                Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.panelNuevo.setVisible(true);
                Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.reestablecerElementos();
                Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.panelNuevoArticulo_textFieldCodigo.setText(codigo);
                Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.tipoDeCreacion = 1;
                Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[2].setVisible(false);
                Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[3].setVisible(true);
            }
        }
    }//GEN-LAST:event_panelCompra_textFieldCodigoProductoActionPerformed

    /*
    *Evento para el campo de Distribuidor, verifica que el patron sea correcto,
    *en caso de no ser asi abre la ventana de creacion de distribuidor.
     */
    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void panelCompra_textFieldDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCompra_textFieldDistribuidorActionPerformed
        Evento_campoDistribuidor();
        panelCompra_textFieldCodigoProducto.requestFocus();
    }//GEN-LAST:event_panelCompra_textFieldDistribuidorActionPerformed

    private void panelCompra_botonDistribuidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCompra_botonDistribuidoresActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[7].setVisible(true);
    }//GEN-LAST:event_panelCompra_botonDistribuidoresActionPerformed

    private void paneCompra_botonEliminarFilaSeleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paneCompra_botonEliminarFilaSeleccionadaActionPerformed
        Herencia_metodoEventoBotonEliminar();
    }//GEN-LAST:event_paneCompra_botonEliminarFilaSeleccionadaActionPerformed

    private void panelCompra_textFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCompra_textFieldCantidadActionPerformed
        Herencia_metodoEventoCampoCantidad();
    }//GEN-LAST:event_panelCompra_textFieldCantidadActionPerformed

    private void panelCompra_textFieldCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCompra_textFieldCostoActionPerformed
        Herencia_metodoEventoCampoPrecioCosto();
    }//GEN-LAST:event_panelCompra_textFieldCostoActionPerformed

    private void panelCompra_botonGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCompra_botonGuardarFacturaActionPerformed
        Evento_procesosRealizarFactura();
    }//GEN-LAST:event_panelCompra_botonGuardarFacturaActionPerformed

    private void panelBaseCompraVenta_botonGuardarImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBaseCompraVenta_botonGuardarImprimirActionPerformed
        //Almacenar el id de la factura que se va a imprimir
        String idFactura = panelCompra_textFieldCodigo.getText();
        //Proceso de agregar la factura a la base de datos
        Evento_procesosRealizarFactura();
        //Verificar si la factura es a credito o al contado para imprimir el correcto
        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
        parametros.put("idFactura", idFactura);
        Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                parametros,
                "Facturacion\\FacturaCompra",
                true);
    }//GEN-LAST:event_panelBaseCompraVenta_botonGuardarImprimirActionPerformed

    private void panelBaseCompraVenta_botonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBaseCompraVenta_botonHistorialActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[9].setVisible(true);
        Diseño.Facturacion.paneles_historiales.panel_historialCompras.llenarTablaTodosDatos();
    }//GEN-LAST:event_panelBaseCompraVenta_botonHistorialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton paneCompra_botonEliminarFilaSeleccionada;
    protected javax.swing.JButton panelBaseCompraVenta_botonGuardarImprimir;
    protected javax.swing.JButton panelBaseCompraVenta_botonHistorial;
    private javax.swing.JButton panelCompra_botonDistribuidores;
    protected javax.swing.JButton panelCompra_botonGuardarFactura;
    private javax.swing.ButtonGroup panelCompra_groupRadioButton;
    private javax.swing.JRadioButton panelCompra_radioButtonNoPasarACaja;
    public static javax.swing.JRadioButton panelCompra_radioButtonPasarACaja;
    protected javax.swing.JTextField panelCompra_textFieldCantidad;
    private static javax.swing.JTextField panelCompra_textFieldCodigo;
    public static javax.swing.JTextField panelCompra_textFieldCodigoProducto;
    protected javax.swing.JTextField panelCompra_textFieldCosto;
    public static javax.swing.JTextField panelCompra_textFieldDistribuidor;
    // End of variables declaration//GEN-END:variables

    //**************************************************************//
    //***************** Configurar componentes ********************//
    //*************************************************************//
    private void detallesComponentes() {
        paneCompra_botonEliminarFilaSeleccionada.setVisible(false);

        //Tabla
        tabla = new javax.swing.JTable();
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            @SuppressWarnings("override")
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Herencia_metodoEventoTabla();
            }
        });
        model = (javax.swing.table.DefaultTableModel) tabla.getModel();
        pane = new javax.swing.JScrollPane(tabla);
        pane.setBounds(10, 170, 870, 162);
        this.add(pane);

        //Columnas Header Tabla
        String header[] = {"Codigo", "Descripcion", "Costo Unidad", "Cantidad", "Total"};
        for (int i = 0; i < header.length; i++) {
            model.addColumn(header[i]);
        }

        //TAMAÑO celdas de tabla
        int[] tamaño = {184, 355, 145, 90, 90};
        Logica.tablas.Tabla_tamañoCeldas.setTablaColumnasTamaño(tamaño, tabla);

        Herencia_detallesComponentes(panelCompra_textFieldCosto, panelCompra_textFieldCantidad);
    }

    //**************************************************************//
    //********** Configurar componentes de clase padre *************//
    //*************************************************************//
    private void modificarComponentesPanelPadre() {
        //AutoCompletar textfields
        autoCompleterCampoBuscadorArticulo(panelCompra_textFieldCodigoProducto, "campo_compras_articulo");
        autoCompleterCampoClienteDistribuidor(panelCompra_textFieldDistribuidor, false, "campo_cliente_distribuidor");

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelCompra_textFieldCodigoProducto, 56);

        //LABELS
        panelBaseCompraVenta_labelVentaCompra.setText(panelBaseCompraVenta_labelVentaCompra.getText() + "COMPRA");

        setNumeroFactura();
    }

    //Coloca el numero de la factura buscando el id de de ultima factura y mostrarlo.
    public static void setNumeroFactura() {
        panelCompra_textFieldCodigo.setText(Integer.toString(DataBase.Facturacion.FacturaCompra.Compra.Select.ultimoId() + 1));
    }

    //Evento para el campo de 'distribuidor' lo pongo en este metodo porque aparte del evento en si tambien utilizare esto mismo en otra clase.
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public boolean Evento_campoDistribuidor() {
        String codigo = Logica.CamposTexto.Campo_extraerCodigo.getCode(panelCompra_textFieldDistribuidor);
        java.sql.ResultSet rs = DataBase.Facturacion.Distribuidor.Select.distribuidorCodigo(codigo);
        try {
            rs.next();
            rs.getString("idDistribuidor");
            rs.close();
            return true;
        } catch (java.sql.SQLException ex) {
            //En caso de que el distribuidor no exista se hace este proceso para ingresarlo a la base de datos.
            if ((Logica.Cuadros_Emergentes.confirmacionProductoClienteDistribuidorNoEncontrado(codigo)) == 0) {
                Diseño.Facturacion.Paneles_nuevo.panel_nuevoDistribuidor.eventoArticuloClienteDistribuidor(false);
                Diseño.Facturacion.Paneles_nuevo.panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldNombre.setText(codigo.toUpperCase());
                Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[2].setVisible(false);
                Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[7].setVisible(true);
                Diseño.Facturacion.paneles_base.panelBase_inventarioClientesDistribuidores.reestablecerComponentes();
            }
        }
        return false;
    }

    //**************************************************************//
    //************************* Eventos ****************************//
    //**************************************************************//
    private void Evento_procesosRealizarFactura() {
        if (Herencia_metodoEventoBotonGuardar("0")) {
            /*Este metodo es por si el usuario pone un cliente pero no
            *le da a 'enter' para validar al cliente asi que se valida
            *antes de crear la factura, verifica si esta bien escrito y
            *si el cliente existe.*/
            if (Evento_campoDistribuidor()) {
                //Verificar si la factura de compra se pasara a la caja o no mediante los radio button.
                if (panelCompra_radioButtonPasarACaja.isSelected()) {
                    //Se pasan los datos a la tabla de "facturaCompra"
                    //************************************************
                    if (DataBase.Facturacion.FacturaCompra.Compra.Insert.facturaCompra(new String[]{
                        Logica.CamposTexto.Campo_extraerCodigo.getCode(panelCompra_textFieldDistribuidor),
                        panelBaseCompraVenta_textFieldFecha.getText(),
                        panelBaseCompraVenta_textFieldTotal.getText()
                    }, panelBaseCompraVenta_textFieldFecha.getText())) {
                        //Se pasan los datos a la tabla de "detalleCompra"
                        //************************************************
                        for (int i = 0; i < herencia_model.getRowCount(); i++) {
                            DataBase.Facturacion.FacturaCompra.Detalle.Insert.detalleCompra(new String[]{
                                (String) herencia_model.getValueAt(i, 0),
                                (String) herencia_model.getValueAt(i, 3),
                                (String) herencia_model.getValueAt(i, 2)
                            });
                        }
                        //Pasa los montos a la caja
                        Logica.gestiosDineroCaja.agregarMontos(
                                panelBaseCompraVenta_textFieldTotal.getText(),
                                false,
                                panelBaseCompraVenta_textFieldFecha.getText());
                    }
                } else {
                    //Se pasan los datos a la tabla de "facturaCompraPorPagar"
                    //************************************************
                    if (DataBase.Facturacion.FacturaCompra.CompraPorPagar.Insert.facturaCompraPorPagar(new String[]{
                        Logica.CamposTexto.Campo_extraerCodigo.getCode(panelCompra_textFieldDistribuidor),
                        panelBaseCompraVenta_textFieldFecha.getText(),
                        panelBaseCompraVenta_textFieldTotal.getText()
                    }, panelBaseCompraVenta_textFieldFecha.getText())) {
                        //Se pasan los datos a la tabla de "detalleCompraPorPagar"
                        //************************************************
                        for (int i = 0; i < herencia_model.getRowCount(); i++) {
                            DataBase.Facturacion.FacturaCompra.DetallePorPagar.Insert.detalleCompraPorPagar(new String[]{
                                (String) herencia_model.getValueAt(i, 0),
                                (String) herencia_model.getValueAt(i, 3),
                                (String) herencia_model.getValueAt(i, 2)
                            });
                        }
                    }
                }
                //Limpiar ventana y mostrar mensage de confirmacion..
                reestablecerElementos();
                reestablecerElementosSuperioresVentana();
                Logica.Cuadros_Emergentes.completado();
                setNumeroFactura();
            }
        }
    }

    //**************************************************************//
    //********************** -@Overrides- *************************//
    //*************************************************************//
    //Agrega al metodo de la clase padre que limpia toda la ventana que tambien
    //reestablezca el radio button propio de esta clase hija a su boton original.
    @Override
    protected void reestablecerElementos() {
        super.reestablecerElementos();
        panelCompra_textFieldDistribuidor.setText("GENERICO**");
        panelCompra_radioButtonPasarACaja.setSelected(true);
    }

    //Sobreescribe el metodo que es llamado por el evento del BOTON Clientes/Distribuidores.
    @Override
    protected void eventoBotonClienteDistribuidor() {
        Logica.herramientas.procesoDeHistorial();
        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[7].setVisible(true);
    }
}

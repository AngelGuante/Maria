package Diseño.Facturacion.Paneles_nuevo;

import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_mayuscula;
import Logica.CamposTexto.Campo_tipoNumero;

public class panel_nuevoArticulo extends Diseño.Facturacion.paneles_base.panelBase_crearArticuloClienteDistribuidor {

    public static int tipoDeCreacion = 0;

    public panel_nuevoArticulo() {
        initComponents();
        modificarComponentesPanelPadre();
        detallesComponentes();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNuevoArticulo_labelCodigo = new javax.swing.JLabel();
        panelNuevoArticulo_textFieldCodigo = new javax.swing.JTextField();
        panelNuevoArticulo_labelDescripcion = new javax.swing.JLabel();
        panelNuevoArticulo_textFieldCosto = new javax.swing.JTextField();
        panelNuevoArticulo_labelCosto = new javax.swing.JLabel();
        panelNuevoArticulo_textFieldPrecio = new javax.swing.JTextField();
        panelNuevoArticulo_labelPrecio = new javax.swing.JLabel();
        panelNuevoArticulo_textFieldEnAlmacen = new javax.swing.JTextField();
        panelNuevoArticulo_labelEnAlmace = new javax.swing.JLabel();
        panelNuevoArticulo_scroll = new javax.swing.JScrollPane();
        panelNuevoArticulo_textAreaDescripcion = new javax.swing.JTextArea();
        panelBaseInventarioClientesDistribuidores_botonCrear = new javax.swing.JButton();
        panelBaseInventarioClientesDistribuidores_botonLimpiar = new javax.swing.JButton();

        panelNuevoArticulo_labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelNuevoArticulo_labelCodigo.setText("Codigo(*)");

        panelNuevoArticulo_textFieldCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoArticulo_textFieldCodigo.setForeground(new java.awt.Color(0, 102, 204));
        panelNuevoArticulo_textFieldCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelNuevoArticulo_textFieldCodigoFocusLost(evt);
            }
        });
        panelNuevoArticulo_textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelNuevoArticulo_textFieldCodigoActionPerformed(evt);
            }
        });

        panelNuevoArticulo_labelDescripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelNuevoArticulo_labelDescripcion.setText("Descripcion(*)");

        panelNuevoArticulo_textFieldCosto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoArticulo_textFieldCosto.setForeground(new java.awt.Color(0, 102, 204));
        panelNuevoArticulo_textFieldCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelNuevoArticulo_textFieldCostoActionPerformed(evt);
            }
        });

        panelNuevoArticulo_labelCosto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelNuevoArticulo_labelCosto.setText("Costo(*)");

        panelNuevoArticulo_textFieldPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoArticulo_textFieldPrecio.setForeground(new java.awt.Color(0, 102, 204));
        panelNuevoArticulo_textFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelNuevoArticulo_textFieldPrecioActionPerformed(evt);
            }
        });

        panelNuevoArticulo_labelPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelNuevoArticulo_labelPrecio.setText("Precio(*)");

        panelNuevoArticulo_textFieldEnAlmacen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoArticulo_textFieldEnAlmacen.setForeground(new java.awt.Color(0, 102, 204));

        panelNuevoArticulo_labelEnAlmace.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelNuevoArticulo_labelEnAlmace.setText("En almacen(*)");

        panelNuevoArticulo_textAreaDescripcion.setColumns(20);
        panelNuevoArticulo_textAreaDescripcion.setRows(5);
        panelNuevoArticulo_scroll.setViewportView(panelNuevoArticulo_textAreaDescripcion);

        panelBaseInventarioClientesDistribuidores_botonCrear.setBackground(new java.awt.Color(102, 204, 255));
        panelBaseInventarioClientesDistribuidores_botonCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/saveShort.png"))); // NOI18N
        panelBaseInventarioClientesDistribuidores_botonCrear.setText("Guardar");
        panelBaseInventarioClientesDistribuidores_botonCrear.setActionCommand("");
        panelBaseInventarioClientesDistribuidores_botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelBaseInventarioClientesDistribuidores_botonCrearActionPerformed(evt);
            }
        });

        panelBaseInventarioClientesDistribuidores_botonLimpiar.setBackground(new java.awt.Color(153, 255, 153));
        panelBaseInventarioClientesDistribuidores_botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eraseSmall.png"))); // NOI18N
        panelBaseInventarioClientesDistribuidores_botonLimpiar.setText("Limpiar");
        panelBaseInventarioClientesDistribuidores_botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelBaseInventarioClientesDistribuidores_botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelNuevoArticulo_labelCosto)
                                .addGap(0, 37, Short.MAX_VALUE))
                            .addComponent(panelNuevoArticulo_textFieldCosto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNuevoArticulo_labelPrecio)
                            .addComponent(panelNuevoArticulo_textFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelNuevoArticulo_textFieldEnAlmacen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNuevoArticulo_labelEnAlmace, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(panelNuevoArticulo_scroll)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNuevoArticulo_labelCodigo)
                            .addComponent(panelNuevoArticulo_labelDescripcion)
                            .addComponent(panelNuevoArticulo_textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelBaseInventarioClientesDistribuidores_botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelBaseInventarioClientesDistribuidores_botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(panelNuevoArticulo_labelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNuevoArticulo_textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelNuevoArticulo_labelDescripcion)
                .addGap(12, 12, 12)
                .addComponent(panelNuevoArticulo_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panelNuevoArticulo_labelCosto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelNuevoArticulo_textFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(panelNuevoArticulo_labelEnAlmace)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelNuevoArticulo_textFieldEnAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelNuevoArticulo_labelPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNuevoArticulo_textFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelBaseInventarioClientesDistribuidores_botonCrear)
                    .addComponent(panelBaseInventarioClientesDistribuidores_botonLimpiar))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //TextFiel Costo
    private void panelNuevoArticulo_textFieldCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelNuevoArticulo_textFieldCostoActionPerformed
        panelNuevoArticulo_textFieldPrecio.requestFocus();
    }//GEN-LAST:event_panelNuevoArticulo_textFieldCostoActionPerformed

    //TextFiel Precio
    private void panelNuevoArticulo_textFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelNuevoArticulo_textFieldPrecioActionPerformed
        panelNuevoArticulo_textFieldEnAlmacen.requestFocus();
    }//GEN-LAST:event_panelNuevoArticulo_textFieldPrecioActionPerformed

    //TextFiel CcodigoProducto
    private void panelNuevoArticulo_textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelNuevoArticulo_textFieldCodigoActionPerformed
        panelNuevoArticulo_textAreaDescripcion.requestFocus();
    }//GEN-LAST:event_panelNuevoArticulo_textFieldCodigoActionPerformed

    //Boton Crear
    private void panelBaseInventarioClientesDistribuidores_botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBaseInventarioClientesDistribuidores_botonCrearActionPerformed
        eventoBotonCrear();
    }//GEN-LAST:event_panelBaseInventarioClientesDistribuidores_botonCrearActionPerformed
    
    //Boton Limpiar
    private void panelBaseInventarioClientesDistribuidores_botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBaseInventarioClientesDistribuidores_botonLimpiarActionPerformed
        if (Logica.Cuadros_Emergentes.confirmacionDefinida(""
                + "-Se borraran todos los datos escritos del nuevo codigo.\n\n") == 0) {
            reestablecerElementos();
        }
    }//GEN-LAST:event_panelBaseInventarioClientesDistribuidores_botonLimpiarActionPerformed

    private void panelNuevoArticulo_textFieldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelNuevoArticulo_textFieldCodigoFocusLost
        Logica.CamposTexto.Campo_cambiarEspacioPorGuion.cambiarEspacioPorGuion(panelNuevoArticulo_textFieldCodigo);
    }//GEN-LAST:event_panelNuevoArticulo_textFieldCodigoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton panelBaseInventarioClientesDistribuidores_botonCrear;
    public static javax.swing.JButton panelBaseInventarioClientesDistribuidores_botonLimpiar;
    private javax.swing.JLabel panelNuevoArticulo_labelCodigo;
    public static javax.swing.JLabel panelNuevoArticulo_labelCosto;
    private javax.swing.JLabel panelNuevoArticulo_labelDescripcion;
    public static javax.swing.JLabel panelNuevoArticulo_labelEnAlmace;
    public static javax.swing.JLabel panelNuevoArticulo_labelPrecio;
    private javax.swing.JScrollPane panelNuevoArticulo_scroll;
    public static javax.swing.JTextArea panelNuevoArticulo_textAreaDescripcion;
    public static javax.swing.JTextField panelNuevoArticulo_textFieldCodigo;
    public static javax.swing.JTextField panelNuevoArticulo_textFieldCosto;
    public static javax.swing.JTextField panelNuevoArticulo_textFieldEnAlmacen;
    public static javax.swing.JTextField panelNuevoArticulo_textFieldPrecio;
    // End of variables declaration//GEN-END:variables

    private void modificarComponentesPanelPadre() {
        panelCrearArticuloClienteDistribuidor_labelTitulo.setText(panelCrearArticuloClienteDistribuidor_labelTitulo.getText() + "Nuevo Articulo");
    }

    private void detallesComponentes() {
        //OCULTAR elementos
        panel_nuevoArticulo.panelNuevoArticulo_labelEnAlmace.setVisible(false);
        panel_nuevoArticulo.panelNuevoArticulo_textFieldEnAlmacen.setVisible(false);
        
        //SOMBREAR campos de texto
        panelNuevoArticulo_textAreaDescripcion.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelNuevoArticulo_textFieldCosto.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelNuevoArticulo_textFieldPrecio.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelNuevoArticulo_textFieldEnAlmacen.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());

        //TEXTAREA para que salte de linea automaticamente
        panelNuevoArticulo_textAreaDescripcion.setLineWrap(true);
        panelNuevoArticulo_textAreaDescripcion.setWrapStyleWord(true);

        //MAYUSCULA campos de texto
        Campo_mayuscula.campoTextoMayuscula(panelNuevoArticulo_textFieldCodigo);
        Logica.herramientas.campoTextoAreaMayuscula(panelNuevoArticulo_textAreaDescripcion);

        //TIPO campo de texto
        Campo_tipoNumero.campoTextoTipoNumero(panelNuevoArticulo_textFieldCosto);
        Campo_tipoNumero.campoTextoTipoNumero(panelNuevoArticulo_textFieldPrecio);
        Campo_tipoNumero.campoTextoTipoNumero(panelNuevoArticulo_textFieldEnAlmacen);

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoArticulo_textFieldCodigo, 19);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoArticulo_textFieldCosto, 17);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoArticulo_textFieldPrecio, 5);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoArticulo_textFieldEnAlmacen, 3);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoArticulo_textFieldCosto, 5);
        Logica.herramientas.campoTextoAreaTamaño(panelNuevoArticulo_textAreaDescripcion, 42);
        
        //SIN ESPACIO campo de texto
        Logica.CamposTexto.Campo_validarSinEspacio.SinEspacios(panelNuevoArticulo_textFieldCodigo);
    }
    
    //*************************************************************//
    //****************** -METODOS DE EVENTOS- *********************//
    //*************************************************************//
    /*
    *Evento para el boton Guardar, comprueba que los campos marcados como
    *obligatorios esten llenos, muestra un cuadro de confirmacion para saber 
    *si se realizara la accion o no, si la opcion es 'si' guardara los datos en 
    *la base de datos, limpia los campo al  terminar y actualiza la tabla con el
    *nuevo registro.
     */
    protected void eventoBotonCrear() {
        if (((panel_nuevoArticulo.panelNuevoArticulo_textFieldCodigo.getText().length() > 0)
                && (panel_nuevoArticulo.panelNuevoArticulo_textAreaDescripcion.getText().length() > 0)
                && (panel_nuevoArticulo.panelNuevoArticulo_textFieldCosto.getText().length() > 0)
                && (panel_nuevoArticulo.panelNuevoArticulo_textFieldPrecio.getText().length() > 0))) {
            if ((Logica.Cuadros_Emergentes.confirmacion()) == 0) {
                if (DataBase.Facturacion.Producto.Insert.producto(new String[]{Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.panelNuevoArticulo_textFieldCodigo.getText(),
                    Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.panelNuevoArticulo_textAreaDescripcion.getText(),
                    Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.panelNuevoArticulo_textFieldCosto.getText(),
                    Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.panelNuevoArticulo_textFieldPrecio.getText(),
                    "0"})) {
                    //Verifico el valor de 'tipoDeCreacion' para actualizar los campos correspondientes si tipoDeCreacion == 0 no hara nada de esto porque e una creacion normal de codigo de producto.
                    //Desde Compra:
                    if (tipoDeCreacion == 1) {
                        Diseño.Facturacion.paneles_pantallaPrincipal.panel_compras.panelCompra_textFieldCodigoProducto.setText(Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.panelNuevoArticulo_textFieldCodigo.getText()
                                + " . - " + Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.panelNuevoArticulo_textAreaDescripcion.getText());
                        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[3].setVisible(false);
                        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[2].setVisible(true);
                    }
                    //Desde Venta
                    if (tipoDeCreacion == 2) {
                        Diseño.Facturacion.paneles_pantallaPrincipal.panel_ventas.panelVenta_textFieldCodigoProducto.setText(Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.panelNuevoArticulo_textFieldCodigo.getText()
                                + " . - " + Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.panelNuevoArticulo_textAreaDescripcion.getText());
                        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[3].setVisible(false);
                        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[1].setVisible(true);
                    }
                    reestablecerElementos();
                    Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.llenarTablaTodosDatosInventario();
                    //Llama un metodo que vuelve a cargar el  AutoCompleter en el campo de 'buscar productos' en los paneles de compra y venta.
                    Diseño.Facturacion.paneles_base.panelBase_CompraVenta.autoCompleterCampoBuscadorArticulo(Diseño.Facturacion.paneles_pantallaPrincipal.panel_compras.panelCompra_textFieldCodigoProducto, "campo_compras_articulo");
                    Diseño.Facturacion.paneles_base.panelBase_CompraVenta.autoCompleterCampoBuscadorArticulo(Diseño.Facturacion.paneles_pantallaPrincipal.panel_ventas.panelVenta_textFieldCodigoProducto, "campo_ventas_articulo");
                    
                    Logica.Cuadros_Emergentes.completado();
                } else {
                    Logica.Cuadros_Emergentes.alerta("No se pudo crear el codigo"
                            + ", el problema pudo aver sido causado porque ya este codigo existe en la base de datos.");
                }
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("Todos los campos marcados con (*)"
                    + " son obligatorios.");
        }
        tipoDeCreacion = 0;
    }

    //**************************************************************//
    //************************* Metodos ****************************//
    //*************************************************************//
    public static void reestablecerElementos() {
        panelNuevoArticulo_textFieldCodigo.setText("");
        panelNuevoArticulo_textAreaDescripcion.setText("");
        panelNuevoArticulo_textFieldCosto.setText("");
        panelNuevoArticulo_textFieldPrecio.setText("");
        panelNuevoArticulo_textFieldEnAlmacen.setText("");
    }
}

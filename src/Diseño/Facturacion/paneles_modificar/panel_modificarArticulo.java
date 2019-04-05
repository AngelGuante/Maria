package Diseño.Facturacion.paneles_modificar;

import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_mayuscula;
import Logica.CamposTexto.Campo_tipoNumero;

public class panel_modificarArticulo extends Diseño.Facturacion.paneles_base.panelBase_crearArticuloClienteDistribuidor {

    public panel_modificarArticulo() {
        initComponents();
        modificarComponentesPanelPadre();
        detallesComponentes();
        ModifyComponentsByPrivilege();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelModificarArticulo_labelCodigo = new javax.swing.JLabel();
        panelModificarArticulo_textFieldCodigo = new javax.swing.JTextField();
        panelModificarArticulo_labelDescripcion = new javax.swing.JLabel();
        panelModificarArticulo_textFieldCosto = new javax.swing.JTextField();
        panelModificarArticulo_labelCosto = new javax.swing.JLabel();
        panelModificarArticulo_textFieldPrecio = new javax.swing.JTextField();
        panelModificarArticulo_labelPrecio = new javax.swing.JLabel();
        panelModificarArticulo_textFieldEnAlmacen = new javax.swing.JTextField();
        panelModificarArticulo_labelEnAlmace = new javax.swing.JLabel();
        panelModificarArticulo_scroll = new javax.swing.JScrollPane();
        panelModificarArticulo_textAreaDescripcion = new javax.swing.JTextArea();
        panelModificarArticulo_botonModificar = new javax.swing.JButton();

        panelModificarArticulo_labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelModificarArticulo_labelCodigo.setText("Codigo");

        panelModificarArticulo_textFieldCodigo.setEditable(false);
        panelModificarArticulo_textFieldCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelModificarArticulo_textFieldCodigo.setForeground(new java.awt.Color(0, 102, 204));
        panelModificarArticulo_textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelModificarArticulo_textFieldCodigoActionPerformed(evt);
            }
        });

        panelModificarArticulo_labelDescripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelModificarArticulo_labelDescripcion.setText("Descripcion(*)");

        panelModificarArticulo_textFieldCosto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelModificarArticulo_textFieldCosto.setForeground(new java.awt.Color(0, 102, 204));
        panelModificarArticulo_textFieldCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelModificarArticulo_textFieldCostoActionPerformed(evt);
            }
        });

        panelModificarArticulo_labelCosto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelModificarArticulo_labelCosto.setText("Costo(*)");

        panelModificarArticulo_textFieldPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelModificarArticulo_textFieldPrecio.setForeground(new java.awt.Color(0, 102, 204));
        panelModificarArticulo_textFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelModificarArticulo_textFieldPrecioActionPerformed(evt);
            }
        });

        panelModificarArticulo_labelPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelModificarArticulo_labelPrecio.setText("Precio(*)");

        panelModificarArticulo_textFieldEnAlmacen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelModificarArticulo_textFieldEnAlmacen.setForeground(new java.awt.Color(0, 102, 204));

        panelModificarArticulo_labelEnAlmace.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelModificarArticulo_labelEnAlmace.setText("En almacen(*)");

        panelModificarArticulo_textAreaDescripcion.setColumns(20);
        panelModificarArticulo_textAreaDescripcion.setRows(5);
        panelModificarArticulo_scroll.setViewportView(panelModificarArticulo_textAreaDescripcion);

        panelModificarArticulo_botonModificar.setBackground(new java.awt.Color(204, 204, 204));
        panelModificarArticulo_botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cogwheel.png"))); // NOI18N
        panelModificarArticulo_botonModificar.setText("Modificar");
        panelModificarArticulo_botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelModificarArticulo_botonModificarActionPerformed(evt);
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
                                .addComponent(panelModificarArticulo_labelCosto)
                                .addGap(0, 37, Short.MAX_VALUE))
                            .addComponent(panelModificarArticulo_textFieldCosto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelModificarArticulo_labelPrecio)
                            .addComponent(panelModificarArticulo_textFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelModificarArticulo_textFieldEnAlmacen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelModificarArticulo_labelEnAlmace, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(panelModificarArticulo_scroll)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelModificarArticulo_labelCodigo)
                            .addComponent(panelModificarArticulo_labelDescripcion)
                            .addComponent(panelModificarArticulo_textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelModificarArticulo_botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(panelModificarArticulo_labelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelModificarArticulo_textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelModificarArticulo_labelDescripcion)
                .addGap(12, 12, 12)
                .addComponent(panelModificarArticulo_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panelModificarArticulo_labelCosto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelModificarArticulo_textFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(panelModificarArticulo_labelEnAlmace)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelModificarArticulo_textFieldEnAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelModificarArticulo_labelPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelModificarArticulo_textFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(panelModificarArticulo_botonModificar)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelModificarArticulo_textFieldCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelModificarArticulo_textFieldCostoActionPerformed
        panelModificarArticulo_textFieldPrecio.requestFocus();
    }//GEN-LAST:event_panelModificarArticulo_textFieldCostoActionPerformed

    private void panelModificarArticulo_textFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelModificarArticulo_textFieldPrecioActionPerformed
        panelModificarArticulo_textFieldEnAlmacen.requestFocus();
    }//GEN-LAST:event_panelModificarArticulo_textFieldPrecioActionPerformed

    private void panelModificarArticulo_textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelModificarArticulo_textFieldCodigoActionPerformed
        panelModificarArticulo_textAreaDescripcion.requestFocus();
    }//GEN-LAST:event_panelModificarArticulo_textFieldCodigoActionPerformed

    private void panelModificarArticulo_botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelModificarArticulo_botonModificarActionPerformed
        eventoBotonModificar();
    }//GEN-LAST:event_panelModificarArticulo_botonModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton panelModificarArticulo_botonModificar;
    private javax.swing.JLabel panelModificarArticulo_labelCodigo;
    public static javax.swing.JLabel panelModificarArticulo_labelCosto;
    private javax.swing.JLabel panelModificarArticulo_labelDescripcion;
    public static javax.swing.JLabel panelModificarArticulo_labelEnAlmace;
    public static javax.swing.JLabel panelModificarArticulo_labelPrecio;
    private javax.swing.JScrollPane panelModificarArticulo_scroll;
    public static javax.swing.JTextArea panelModificarArticulo_textAreaDescripcion;
    public static javax.swing.JTextField panelModificarArticulo_textFieldCodigo;
    public static javax.swing.JTextField panelModificarArticulo_textFieldCosto;
    public static javax.swing.JTextField panelModificarArticulo_textFieldEnAlmacen;
    public static javax.swing.JTextField panelModificarArticulo_textFieldPrecio;
    // End of variables declaration//GEN-END:variables

    //**************************************************************//
    //********** Configurar componentes de clase padre ***********//
    //*************************************************************//
    private void modificarComponentesPanelPadre() {
        panelCrearArticuloClienteDistribuidor_labelTitulo.setText(panelCrearArticuloClienteDistribuidor_labelTitulo.getText() + "Modificar Articulo");
    }

    //**************************************************************//
    //***************** Configurar componentes ********************//
    //*************************************************************//
    private void detallesComponentes() {
        //SOMBREAR campos de texto
        panelModificarArticulo_textAreaDescripcion.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelModificarArticulo_textFieldCosto.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelModificarArticulo_textFieldPrecio.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelModificarArticulo_textFieldEnAlmacen.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());

        //TEXTAREA para que salte de linea automaticamente
        panelModificarArticulo_textAreaDescripcion.setLineWrap(true);
        panelModificarArticulo_textAreaDescripcion.setWrapStyleWord(true);

        //MAYUSCULA campos de texto
        Campo_mayuscula.campoTextoMayuscula(panelModificarArticulo_textFieldCodigo);
        Logica.herramientas.campoTextoAreaMayuscula(panelModificarArticulo_textAreaDescripcion);

        //TIPO campo de texto
        Campo_tipoNumero.campoTextoTipoNumero(panelModificarArticulo_textFieldCosto);
        Campo_tipoNumero.campoTextoTipoNumero(panelModificarArticulo_textFieldPrecio);
        Campo_tipoNumero.campoTextoTipoNumero(panelModificarArticulo_textFieldEnAlmacen);

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelModificarArticulo_textFieldCodigo, 19);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelModificarArticulo_textFieldCosto, 17);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelModificarArticulo_textFieldPrecio, 5);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelModificarArticulo_textFieldEnAlmacen, 3);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelModificarArticulo_textFieldCosto, 5);
        Logica.herramientas.campoTextoAreaTamaño(panelModificarArticulo_textAreaDescripcion, 42);
    }

    //*************************************************************//
    //****************** -METODOS DE EVENTOS- *********************//
    //*************************************************************//
    protected void eventoBotonModificar() {
        if (((panel_modificarArticulo.panelModificarArticulo_textAreaDescripcion.getText().length() > 0)
                && (panel_modificarArticulo.panelModificarArticulo_textFieldCosto.getText().length() > 0)
                && (panel_modificarArticulo.panelModificarArticulo_textFieldPrecio.getText().length() > 0)
                && (panel_modificarArticulo.panelModificarArticulo_textFieldEnAlmacen.getText().length() > 0))) {
            if (Logica.Cuadros_Emergentes.confirmacionDefinida("-Sobreescribira los datos del producto por los nuevos datos escritos.") == 0) {
                DataBase.Facturacion.Producto.Update.producto(new String[]{panel_modificarArticulo.panelModificarArticulo_textFieldCodigo.getText(),
                    panel_modificarArticulo.panelModificarArticulo_textAreaDescripcion.getText(),
                    panel_modificarArticulo.panelModificarArticulo_textFieldCosto.getText(),
                    panel_modificarArticulo.panelModificarArticulo_textFieldPrecio.getText(),
                    panel_modificarArticulo.panelModificarArticulo_textFieldEnAlmacen.getText()});
                //
                if (Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.panelInventario_radioVerTodo.isSelected()) {
                    Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.llenarTablaTodosDatosInventario();
                } else if(Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.panelInventario_radioVerSoloConExistencia.isSelected()){
                    Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.llenarTablaProctosEnAlmacen();
                } else{
                    Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.llenarTablaProctosNoAlmacen();
                }
                Logica.Cuadros_Emergentes.completado();
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("Todos los campos marcados con (*)"
                    + " son obligatorios.");
        }
    }

    public static void ModifyComponentsByPrivilege(){
        panelModificarArticulo_botonModificar.setVisible(Logica.CredencialesDeUsuario.getPrivilegio() == 1);
    }
    
    public static void reestablecerElementos() {
        panelModificarArticulo_textFieldCodigo.setText("");
        panelModificarArticulo_textAreaDescripcion.setText("");
        panelModificarArticulo_textFieldCosto.setText("");
        panelModificarArticulo_textFieldPrecio.setText("");
        panelModificarArticulo_textFieldEnAlmacen.setText("");
    }
}

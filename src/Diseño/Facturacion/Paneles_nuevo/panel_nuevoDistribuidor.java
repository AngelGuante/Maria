package Diseño.Facturacion.Paneles_nuevo;

import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_mayuscula;
import Logica.CamposTexto.Campo_tipoNumero;

public class panel_nuevoDistribuidor extends Diseño.Facturacion.paneles_base.panelBase_crearArticuloClienteDistribuidor {

    public panel_nuevoDistribuidor() {
        initComponents();
        detallesComponentes();
        modificarComponentesPanelPadre();
        panelNuevoDistribuidor_botonHistorialDeDistribuidor.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNuevoDistribuidor_labelCodigo = new javax.swing.JLabel();
        panelNuevoDistribuidor_textFieldCodigo = new javax.swing.JTextField();
        panelNuevoDistribuidor_labelNombre = new javax.swing.JLabel();
        panelNuevoDistribuidor_textFieldNombre = new javax.swing.JTextField();
        panelNuevoDistribuidor_labelContacto = new javax.swing.JLabel();
        panelNuevoDistribuidor_textFieldContacto = new javax.swing.JTextField();
        panelNuevoDistribuidor_labelDireccion = new javax.swing.JLabel();
        panelNuevoDistribuidor_textFieldDireccion = new javax.swing.JTextField();
        panelNuevoDistribuidor_botonHistorialDeDistribuidor = new javax.swing.JButton();

        panelNuevoDistribuidor_labelCodigo.setText("Codigo(*)");

        panelNuevoDistribuidor_textFieldCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoDistribuidor_textFieldCodigo.setForeground(new java.awt.Color(0, 102, 204));
        panelNuevoDistribuidor_textFieldCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelNuevoDistribuidor_textFieldCodigoFocusLost(evt);
            }
        });

        panelNuevoDistribuidor_labelNombre.setText("Nombre(*)");

        panelNuevoDistribuidor_textFieldNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoDistribuidor_textFieldNombre.setForeground(new java.awt.Color(0, 102, 204));

        panelNuevoDistribuidor_labelContacto.setText("Contacto");
        panelNuevoDistribuidor_labelContacto.setToolTipText("");

        panelNuevoDistribuidor_textFieldContacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoDistribuidor_textFieldContacto.setForeground(new java.awt.Color(0, 102, 204));

        panelNuevoDistribuidor_labelDireccion.setText("Direccion");
        panelNuevoDistribuidor_labelDireccion.setToolTipText("");

        panelNuevoDistribuidor_textFieldDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoDistribuidor_textFieldDireccion.setForeground(new java.awt.Color(0, 102, 204));

        panelNuevoDistribuidor_botonHistorialDeDistribuidor.setText("Historial de compras a este distribuidor");
        panelNuevoDistribuidor_botonHistorialDeDistribuidor.setActionCommand("");
        panelNuevoDistribuidor_botonHistorialDeDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelNuevoDistribuidor_botonHistorialDeDistribuidorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelNuevoDistribuidor_textFieldNombre)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNuevoDistribuidor_labelContacto)
                            .addComponent(panelNuevoDistribuidor_textFieldContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelNuevoDistribuidor_labelDireccion)
                                .addGap(0, 184, Short.MAX_VALUE))
                            .addComponent(panelNuevoDistribuidor_textFieldDireccion)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelNuevoDistribuidor_labelCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNuevoDistribuidor_labelNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNuevoDistribuidor_botonHistorialDeDistribuidor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNuevoDistribuidor_textFieldCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(panelNuevoDistribuidor_labelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNuevoDistribuidor_textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelNuevoDistribuidor_labelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNuevoDistribuidor_textFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelNuevoDistribuidor_labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNuevoDistribuidor_textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNuevoDistribuidor_labelContacto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNuevoDistribuidor_textFieldContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101)
                .addComponent(panelNuevoDistribuidor_botonHistorialDeDistribuidor)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Muestra el historial del distribuidor seleccionado.
    private void panelNuevoDistribuidor_botonHistorialDeDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelNuevoDistribuidor_botonHistorialDeDistribuidorActionPerformed
        Logica.herramientas.procesoDeHistorial();
    }//GEN-LAST:event_panelNuevoDistribuidor_botonHistorialDeDistribuidorActionPerformed

    private void panelNuevoDistribuidor_textFieldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelNuevoDistribuidor_textFieldCodigoFocusLost
        Logica.CamposTexto.Campo_cambiarEspacioPorGuion.cambiarEspacioPorGuion(panelNuevoDistribuidor_textFieldCodigo);
    }//GEN-LAST:event_panelNuevoDistribuidor_textFieldCodigoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton panelNuevoDistribuidor_botonHistorialDeDistribuidor;
    private javax.swing.JLabel panelNuevoDistribuidor_labelCodigo;
    private javax.swing.JLabel panelNuevoDistribuidor_labelContacto;
    private javax.swing.JLabel panelNuevoDistribuidor_labelDireccion;
    private javax.swing.JLabel panelNuevoDistribuidor_labelNombre;
    public static javax.swing.JTextField panelNuevoDistribuidor_textFieldCodigo;
    public static javax.swing.JTextField panelNuevoDistribuidor_textFieldContacto;
    public static javax.swing.JTextField panelNuevoDistribuidor_textFieldDireccion;
    public static javax.swing.JTextField panelNuevoDistribuidor_textFieldNombre;
    // End of variables declaration//GEN-END:variables

    //**************************************************************//
    //********* Configurar componentes de clase padre ************//
    //*************************************************************//
    private void modificarComponentesPanelPadre() {
        panelCrearArticuloClienteDistribuidor_labelTitulo.setText(panelCrearArticuloClienteDistribuidor_labelTitulo.getText() + "Distribuidor");
    }

    private void detallesComponentes() {
        panelNuevoDistribuidor_botonHistorialDeDistribuidor.setVisible(false);

        //MAYUSCULA campos de texto
        Campo_mayuscula.campoTextoMayuscula(panelNuevoDistribuidor_textFieldCodigo);
        Campo_mayuscula.campoTextoMayuscula(panelNuevoDistribuidor_textFieldNombre);
        Campo_mayuscula.campoTextoMayuscula(panelNuevoDistribuidor_textFieldDireccion);

        //TIPO campo de texto
        Campo_tipoNumero.campoTextoTipoNumero(panelNuevoDistribuidor_textFieldContacto);

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoDistribuidor_textFieldCodigo, 14);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoDistribuidor_textFieldNombre, 29);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoDistribuidor_textFieldContacto, 14);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoDistribuidor_textFieldDireccion, 16);

        //SIN ESPACIO campo de texto
        Logica.CamposTexto.Campo_validarSinEspacio.SinEspacios(panelNuevoDistribuidor_textFieldCodigo);
    }

    /*
    *Reestablece la ventana al modo inicial. pido un booleano porque hay ocaciones en las que se llamara y se preguntara algo en un JPtionPane
    *pero desde otro lado que se haga lo mismo pero que NO se va a hacer la misma pregunta con el JOpptionPane.
     */
    public static void eventoArticuloClienteDistribuidor(boolean preguntar) {
        if (preguntar) {
            if (Logica.Cuadros_Emergentes.confirmacionDefinida(""
                    + "-Se borraran todos los datos escritos del nuevo distribuidor.\n\n") == 0) {
                panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldCodigo.setText("");
                panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldNombre.setText("");
                panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldContacto.setText("");
                panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldDireccion.setText("");
                panel_nuevoDistribuidor.panelNuevoDistribuidor_botonHistorialDeDistribuidor.setVisible(false);
                panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldCodigo.setEditable(true);
                Diseño.Facturacion.paneles_base.panelBase_inventarioClientesDistribuidores.reestablecerComponentes();
            }
        } else {
            panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldCodigo.setText("");
            panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldNombre.setText("");
            panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldContacto.setText("");
            panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldDireccion.setText("");
            panel_nuevoDistribuidor.panelNuevoDistribuidor_botonHistorialDeDistribuidor.setVisible(false);
            panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldCodigo.setEditable(true);
            Diseño.Facturacion.paneles_base.panelBase_inventarioClientesDistribuidores.reestablecerComponentes();
        }
    }
}

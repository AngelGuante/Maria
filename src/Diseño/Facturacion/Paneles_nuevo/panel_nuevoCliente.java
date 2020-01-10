package Diseño.Facturacion.Paneles_nuevo;

import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_mayuscula;
import Logica.CamposTexto.Campo_tipoLetra;
import Logica.CamposTexto.Campo_tipoNumero;

public class panel_nuevoCliente extends Diseño.Facturacion.paneles_base.panelBase_crearArticuloClienteDistribuidor {

    public panel_nuevoCliente() {
        initComponents();
        modificarComponentesPanelPadre();
        detallesComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNuevoCliente_labelCedula = new javax.swing.JLabel();
        panelNuevoCliente_textFieldCedula = new javax.swing.JTextField();
        panelNuevoCliente_textFieldNombre = new javax.swing.JTextField();
        panelNuevoCliente_labelNombre = new javax.swing.JLabel();
        panelNuevoCliente_textFieldApellido = new javax.swing.JTextField();
        panelNuevoCliente_labelApellido = new javax.swing.JLabel();
        panelNuevoCliente_labelContacto = new javax.swing.JLabel();
        panelNuevoCliente_textFieldContacto = new javax.swing.JTextField();
        panelNuevoCliente_labelDireccion = new javax.swing.JLabel();
        panelNuevoCliente_textFieldDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelNuevoCliente_textFieldRNC = new javax.swing.JTextField();

        panelNuevoCliente_labelCedula.setText("Cedula(*)");

        panelNuevoCliente_textFieldCedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoCliente_textFieldCedula.setForeground(new java.awt.Color(0, 102, 204));
        panelNuevoCliente_textFieldCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelNuevoCliente_textFieldCedulaFocusLost(evt);
            }
        });
        panelNuevoCliente_textFieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelNuevoCliente_textFieldCedulaActionPerformed(evt);
            }
        });

        panelNuevoCliente_textFieldNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoCliente_textFieldNombre.setForeground(new java.awt.Color(0, 102, 204));
        panelNuevoCliente_textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelNuevoCliente_textFieldNombreActionPerformed(evt);
            }
        });

        panelNuevoCliente_labelNombre.setText("Nombre(*)");

        panelNuevoCliente_textFieldApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoCliente_textFieldApellido.setForeground(new java.awt.Color(0, 102, 204));
        panelNuevoCliente_textFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelNuevoCliente_textFieldApellidoActionPerformed(evt);
            }
        });

        panelNuevoCliente_labelApellido.setText("Apellido");

        panelNuevoCliente_labelContacto.setText("Contacto");

        panelNuevoCliente_textFieldContacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoCliente_textFieldContacto.setForeground(new java.awt.Color(0, 102, 204));
        panelNuevoCliente_textFieldContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelNuevoCliente_textFieldContactoActionPerformed(evt);
            }
        });

        panelNuevoCliente_labelDireccion.setText("Direccion");

        panelNuevoCliente_textFieldDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoCliente_textFieldDireccion.setForeground(new java.awt.Color(0, 102, 204));

        jLabel1.setText("RNC");

        panelNuevoCliente_textFieldRNC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelNuevoCliente_textFieldRNC.setForeground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNuevoCliente_textFieldDireccion)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelNuevoCliente_labelNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNuevoCliente_textFieldNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNuevoCliente_textFieldApellido)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelNuevoCliente_labelApellido)
                                .addGap(0, 81, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNuevoCliente_labelCedula)
                            .addComponent(panelNuevoCliente_textFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelNuevoCliente_labelContacto)
                            .addComponent(panelNuevoCliente_textFieldContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelNuevoCliente_labelDireccion)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelNuevoCliente_textFieldRNC))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelNuevoCliente_labelApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNuevoCliente_textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelNuevoCliente_labelCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNuevoCliente_textFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNuevoCliente_labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNuevoCliente_textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNuevoCliente_labelContacto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNuevoCliente_textFieldContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNuevoCliente_labelDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNuevoCliente_textFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNuevoCliente_textFieldRNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelNuevoCliente_textFieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelNuevoCliente_textFieldCedulaActionPerformed
        panelNuevoCliente_textFieldNombre.requestFocus();
    }//GEN-LAST:event_panelNuevoCliente_textFieldCedulaActionPerformed

    private void panelNuevoCliente_textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelNuevoCliente_textFieldNombreActionPerformed
        panelNuevoCliente_textFieldApellido.requestFocus();
    }//GEN-LAST:event_panelNuevoCliente_textFieldNombreActionPerformed

    private void panelNuevoCliente_textFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelNuevoCliente_textFieldApellidoActionPerformed
        panelNuevoCliente_textFieldContacto.requestFocus();
    }//GEN-LAST:event_panelNuevoCliente_textFieldApellidoActionPerformed

    private void panelNuevoCliente_textFieldContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelNuevoCliente_textFieldContactoActionPerformed
        panelNuevoCliente_textFieldDireccion.requestFocus();
    }//GEN-LAST:event_panelNuevoCliente_textFieldContactoActionPerformed

    private void panelNuevoCliente_textFieldCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelNuevoCliente_textFieldCedulaFocusLost
        Logica.CamposTexto.Campo_cambiarEspacioPorGuion.cambiarEspacioPorGuion(panelNuevoCliente_textFieldCedula);
    }//GEN-LAST:event_panelNuevoCliente_textFieldCedulaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel panelNuevoCliente_labelApellido;
    private javax.swing.JLabel panelNuevoCliente_labelCedula;
    private javax.swing.JLabel panelNuevoCliente_labelContacto;
    private javax.swing.JLabel panelNuevoCliente_labelDireccion;
    private javax.swing.JLabel panelNuevoCliente_labelNombre;
    public static javax.swing.JTextField panelNuevoCliente_textFieldApellido;
    public static javax.swing.JTextField panelNuevoCliente_textFieldCedula;
    public static javax.swing.JTextField panelNuevoCliente_textFieldContacto;
    public static javax.swing.JTextField panelNuevoCliente_textFieldDireccion;
    public static javax.swing.JTextField panelNuevoCliente_textFieldNombre;
    public static javax.swing.JTextField panelNuevoCliente_textFieldRNC;
    // End of variables declaration//GEN-END:variables

    //*************************************************************//
    //*********************** -METODOS- **************************//
    //*************************************************************//
    //**************************************************************//
    //********* Configurar componentes de clase padre ************//
    //*************************************************************//
    private void modificarComponentesPanelPadre() {
        panelCrearArticuloClienteDistribuidor_labelTitulo.setText(panelCrearArticuloClienteDistribuidor_labelTitulo.getText() + "cliente");
    }

    //**************************************************************//
    //***************** Configurar componentes ********************//
    //*************************************************************//
    private void detallesComponentes() {
        //SOMBREAR campos de texto
        panelNuevoCliente_textFieldCedula.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelNuevoCliente_textFieldNombre.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelNuevoCliente_textFieldApellido.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelNuevoCliente_textFieldContacto.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelNuevoCliente_textFieldDireccion.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());

        //MAYUSCULA campos de texto
        Campo_mayuscula.campoTextoMayuscula(panelNuevoCliente_textFieldNombre);
        Campo_mayuscula.campoTextoMayuscula(panelNuevoCliente_textFieldApellido);
        Campo_mayuscula.campoTextoMayuscula(panelNuevoCliente_textFieldDireccion);
        Campo_mayuscula.campoTextoMayuscula(panelNuevoCliente_textFieldRNC);

        //TIPO campo de texto
        Campo_tipoNumero.campoTextoTipoNumero(panelNuevoCliente_textFieldCedula);
        Campo_tipoNumero.campoTextoTipoNumero(panelNuevoCliente_textFieldContacto);
        Campo_tipoLetra.campoTextoTipoLetras(panelNuevoCliente_textFieldNombre);
        Campo_tipoLetra.campoTextoTipoLetras(panelNuevoCliente_textFieldApellido);

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoCliente_textFieldCedula, 10);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoCliente_textFieldNombre, 19);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoCliente_textFieldApellido, 19);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoCliente_textFieldContacto, 14);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoCliente_textFieldDireccion, 69);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelNuevoCliente_textFieldRNC, 45);
    }

    /*
    *Reestablece la ventana al modo inicial. pido un booleano porque hay ocaciones en las que se llamara y se preguntara algo en un JPtionPane
    *pero desde otro lado que se haga lo mismo pero que NO se va a hacer la misma pregunta con el JOpptionPane.
     */
    public static void eventoArticuloClienteDistribuidor(boolean preguntar) {
        if (preguntar) {
            if (Logica.Cuadros_Emergentes.confirmacionDefinida(""
                    + "-Se borraran todos los datos escritos del nuevo cliente.\n\n") == 0) {
                panel_nuevoCliente.panelNuevoCliente_textFieldCedula.setText("");
                panel_nuevoCliente.panelNuevoCliente_textFieldNombre.setText("");
                panel_nuevoCliente.panelNuevoCliente_textFieldApellido.setText("");
                panel_nuevoCliente.panelNuevoCliente_textFieldContacto.setText("");
                panel_nuevoCliente.panelNuevoCliente_textFieldDireccion.setText("");
                panel_nuevoCliente.panelNuevoCliente_textFieldRNC.setText("");
                Diseño.Facturacion.Paneles_nuevo.panel_nuevoCliente.panelNuevoCliente_textFieldCedula.setEditable(true);
                Diseño.Facturacion.paneles_base.panelBase_inventarioClientesDistribuidores.reestablecerComponentes();
            }
        } else {
            panel_nuevoCliente.panelNuevoCliente_textFieldCedula.setText("");
            panel_nuevoCliente.panelNuevoCliente_textFieldNombre.setText("");
            panel_nuevoCliente.panelNuevoCliente_textFieldApellido.setText("");
            panel_nuevoCliente.panelNuevoCliente_textFieldContacto.setText("");
            panel_nuevoCliente.panelNuevoCliente_textFieldDireccion.setText("");
            panel_nuevoCliente.panelNuevoCliente_textFieldRNC.setText("");
            Diseño.Facturacion.Paneles_nuevo.panel_nuevoCliente.panelNuevoCliente_textFieldCedula.setEditable(true);
            Diseño.Facturacion.paneles_base.panelBase_inventarioClientesDistribuidores.reestablecerComponentes();
        }
    }
}

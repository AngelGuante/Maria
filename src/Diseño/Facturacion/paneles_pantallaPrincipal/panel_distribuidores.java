package Diseño.Facturacion.paneles_pantallaPrincipal;

import Diseño.Facturacion.Paneles_nuevo.panel_nuevoDistribuidor;
import javax.swing.table.DefaultTableModel;

public class panel_distribuidores extends Diseño.Facturacion.paneles_base.panelBase_inventarioClientesDistribuidores {

    public panel_distribuidores() {
        initComponents();
        modificarComponentesPanelPadre();
        detallesComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBaseInventarioClientesDistribuidores_botonModificar = new javax.swing.JButton();
        panelBaseInventarioClientesDistribuidores_botonCrear = new javax.swing.JButton();
        panelBaseInventarioClientesDistribuidores_botonLimpiar = new javax.swing.JButton();
        panelBaseInventarioClientesDistribuidores_textFieldBuscador = new javax.swing.JTextField();

        panelBaseInventarioClientesDistribuidores_botonModificar.setBackground(new java.awt.Color(204, 204, 204));
        panelBaseInventarioClientesDistribuidores_botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cogwheel.png"))); // NOI18N
        panelBaseInventarioClientesDistribuidores_botonModificar.setText("Modificar");
        panelBaseInventarioClientesDistribuidores_botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelBaseInventarioClientesDistribuidores_botonModificarActionPerformed(evt);
            }
        });
        add(panelBaseInventarioClientesDistribuidores_botonModificar);
        panelBaseInventarioClientesDistribuidores_botonModificar.setBounds(690, 430, 110, 25);

        panelBaseInventarioClientesDistribuidores_botonCrear.setBackground(new java.awt.Color(102, 204, 255));
        panelBaseInventarioClientesDistribuidores_botonCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/saveShort.png"))); // NOI18N
        panelBaseInventarioClientesDistribuidores_botonCrear.setText("Guardar");
        panelBaseInventarioClientesDistribuidores_botonCrear.setActionCommand("");
        panelBaseInventarioClientesDistribuidores_botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelBaseInventarioClientesDistribuidores_botonCrearActionPerformed(evt);
            }
        });
        add(panelBaseInventarioClientesDistribuidores_botonCrear);
        panelBaseInventarioClientesDistribuidores_botonCrear.setBounds(590, 430, 100, 25);

        panelBaseInventarioClientesDistribuidores_botonLimpiar.setBackground(new java.awt.Color(153, 255, 153));
        panelBaseInventarioClientesDistribuidores_botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eraseSmall.png"))); // NOI18N
        panelBaseInventarioClientesDistribuidores_botonLimpiar.setText("Limpiar");
        panelBaseInventarioClientesDistribuidores_botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelBaseInventarioClientesDistribuidores_botonLimpiarActionPerformed(evt);
            }
        });
        add(panelBaseInventarioClientesDistribuidores_botonLimpiar);
        panelBaseInventarioClientesDistribuidores_botonLimpiar.setBounds(590, 430, 100, 25);

        panelBaseInventarioClientesDistribuidores_textFieldBuscador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelBaseInventarioClientesDistribuidores_textFieldBuscador.setForeground(new java.awt.Color(0, 102, 204));
        panelBaseInventarioClientesDistribuidores_textFieldBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelBaseInventarioClientesDistribuidores_textFieldBuscadorKeyReleased(evt);
            }
        });
        add(panelBaseInventarioClientesDistribuidores_textFieldBuscador);
        panelBaseInventarioClientesDistribuidores_textFieldBuscador.setBounds(2, 10, 280, 28);
    }// </editor-fold>//GEN-END:initComponents

    //Evento para el boton modificar
    private void panelBaseInventarioClientesDistribuidores_botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBaseInventarioClientesDistribuidores_botonModificarActionPerformed
        eventoBotonModificar();
    }//GEN-LAST:event_panelBaseInventarioClientesDistribuidores_botonModificarActionPerformed

    //Evento para el boton crear
    private void panelBaseInventarioClientesDistribuidores_botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBaseInventarioClientesDistribuidores_botonCrearActionPerformed
        eventoBotonCrear();
    }//GEN-LAST:event_panelBaseInventarioClientesDistribuidores_botonCrearActionPerformed

    //Evento para el boton limpiar
    private void panelBaseInventarioClientesDistribuidores_botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBaseInventarioClientesDistribuidores_botonLimpiarActionPerformed
        Diseño.Facturacion.Paneles_nuevo.panel_nuevoDistribuidor.eventoArticuloClienteDistribuidor(true);
    }//GEN-LAST:event_panelBaseInventarioClientesDistribuidores_botonLimpiarActionPerformed

    //Evento de el campo de busqueda de la clase padre que llena la tabla segun los datos del campo.
    private void panelBaseInventarioClientesDistribuidores_textFieldBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelBaseInventarioClientesDistribuidores_textFieldBuscadorKeyReleased
        java.sql.ResultSet rs;
        eliminarAgregarFilas();
        rs = DataBase.Facturacion.Distribuidor.Select.distribuidorLike(panelBaseInventarioClientesDistribuidores_textFieldBuscador.getText());
        actualizarLlenarTabla(rs);
    }//GEN-LAST:event_panelBaseInventarioClientesDistribuidores_textFieldBuscadorKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton panelBaseInventarioClientesDistribuidores_botonCrear;
    public static javax.swing.JButton panelBaseInventarioClientesDistribuidores_botonLimpiar;
    public static javax.swing.JButton panelBaseInventarioClientesDistribuidores_botonModificar;
    protected static javax.swing.JTextField panelBaseInventarioClientesDistribuidores_textFieldBuscador;
    // End of variables declaration//GEN-END:variables

    //**************************************************************//
    //***************** Configurar componentes ********************//
    //*************************************************************//
    private void detallesComponentes() {
        panelBaseInventarioClientesDistribuidores_botonLimpiar.setVisible(false);
        panelBaseInventarioClientesDistribuidores_botonModificar.setVisible(false);
    }

    //**************************************************************//
    //**************** Configurar a Componentes *******************//
    //*************************************************************//
    private void modificarComponentesPanelPadre() {
        //LABELS
        panelBaseInventarioClientesDistribuidores_labelInventarioClienteDistribuidor.setText("DISTRIBUIDORES");

        //TABLA titulo columnas
        String header[] = {"Codigo", "Nombre", "Contacto"};
        Logica.tablas.Tabla_ponerTitulosCeldas.setTablaColumnasTitulos(header, panelBaseInventarioClientesDistribuidores_tablaDistribuidores);

        //LLENA la tabla
        llenarTablaTodosDatos();

        //TABLA hacerla visible
        panelBaseInventarioClientesDistribuidores_scrollDistribuidores.setVisible(true);

        //TAMAÑO celdas de tabla
        int[] tamaño = {170, 310, 83, 0};
        Logica.tablas.Tabla_tamañoCeldas.setTablaColumnasTamaño(tamaño, panelBaseInventarioClientesDistribuidores_tablaDistribuidores);

        panel_nuevoDistribuidor pb = new panel_nuevoDistribuidor();
        pb.setBounds(594, 75, 280, 355);
        add(pb);
    }

    /*
    *llena la tabla con los datos recibidos por el ResultSet, y pasa aquellos datos
    *que no se colocaran en la tabla pero que si se van a usar en otro lado, en un
    *arrayList.
     */
    private void actualizarLlenarTabla(java.sql.ResultSet rs) {
        try {
            while (rs.next()) {
                panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel().setValueAt(rs.getString("claveDistribuidor"), rs.getRow() - 1, 0);
                panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel().setValueAt(rs.getString("nombreDistribuidor"), rs.getRow() - 1, 1);
                panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel().setValueAt(rs.getString("telefonoDistribuidor"), rs.getRow() - 1, 2);
            }
            rs.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    /*
    *Este metodo es realmente estupido, pero para solucionar un problema
    *(y por un poco de pereza)me vi obligao a crear este metodo, aqui la explicacion:
    *Como cree la tabla de "panelBaseInventarioClientesDistribuidores_tablaInventario"
    *a travez del wizzard de Netbeans, este establece un DefaultTableModel
    *por defecto, como con el DefaultTableModel es que elimino y agrego nuevas filas
    *y al (por mi falta de conocimiento en este momento que cree esto) tratar de
    *hacer algo con el DefaultTableModel tenia que quitar el por defecto y poner uno nuevo
    *entonces las propiedades que tenia esta obviamente se iban, (y he aqui donde entra mi pereza,
    *tenia que buscar otra manera para agregar las propiedades que ya hice y buscar OTRA manera
    *de agregar estas propiedades porque tendria que crear las tablas yo mismo sin el Wizzard
    *por eso tube que crear este metodo solo para eliminar y agregar filas a la tabla
    *porque para colmo cuando encontre la manera de eliminar filas usando el DefaultTableModel por defecto
    *usando un 'for' para recorrer cada fila e irla eliminandola iba de 2 en 2 a pesar de que mi 'for'
    *iba de 1 en 1; me toco crear dos 'for' y al final me terminaba quedando 1 fila, asi que tambien
    *me toco eliminar el ultimo igual a mano. (HASTA AHORA LA MEJOR SOLUCION POSIBLE QUE SE ME OCURRIO
    *Y LA VERDAD NO ESTOY ORGULLOSO DE ESTA SOLUCION).
     */
    private void eliminarAgregarFilas() {
        for (int i = 0; i < 250; i++) {
            ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel()).removeRow(i);
        }
        for (int i = 0; i < 124; i++) {
            ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel()).removeRow(i);
        }
        for (int i = 0; i < 62; i++) {
            ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel()).removeRow(i);
        }
        for (int i = 0; i < 30; i++) {
            ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel()).removeRow(i);
        }
        for (int i = 0; i < 15; i++) {
            ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel()).removeRow(i);
        }
        for (int i = 0; i < 7; i++) {
            ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel()).removeRow(i);
        }
        for (int i = 0; i < 4; i++) {
            ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel()).removeRow(i);
        }
        for (int i = 0; i < 2; i++) {
            ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel()).removeRow(i);
        }
        for (int i = 0; i < 2; i++) {
            ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel()).removeRow(i);
        }
        for (int i = 0; i < 2; i++) {
            ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel()).removeRow(i);
        }
        ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaClientes.getModel()).removeRow(0);
        for (int i = 0; i < 500; i++) {
            ((DefaultTableModel) panelBaseInventarioClientesDistribuidores_tablaDistribuidores.getModel()).addRow(new String[]{"", "", "", ""});
        }
    }

    /*
    *Actualizar la tabla. Verifica que todos los campos
    *esten  llenos y al final oculta los botones y campos reestableciendo la
    *ventana nuevamente.
     */
    private void actualizarTablaAlModificarOEliminar() {
        panel_nuevoDistribuidor.eventoArticuloClienteDistribuidor(false);
        panel_nuevoDistribuidor.panelNuevoDistribuidor_botonHistorialDeDistribuidor.setVisible(false);
        panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldCodigo.setEditable(true);
        panelBaseInventarioClientesDistribuidores_botonCrear.setVisible(true);
        panelBaseInventarioClientesDistribuidores_botonLimpiar.setVisible(false);
        panelBaseInventarioClientesDistribuidores_botonModificar.setVisible(false);
        eliminarAgregarFilas();
        llenarTablaTodosDatos();
        Logica.Cuadros_Emergentes.completado();
    }

    //**************************************************************//
    //********************** -@Overrides- *************************//
    //*************************************************************//

    /*
    *Evento para el boton Guardar, comprueba que los campos marcados como
    *obligatorios esten llenos, muestra un cuadro de confirmacion para saber 
    *si se realizara la accion o no, si la opcion es 'si' guardara los datos en 
    *la base de datos, limpia los campo al  terminar y actualiza la tabla con el
    *nuevo registro.
     */
    @Override
    protected void eventoBotonCrear() {
        if (((panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldCodigo.getText().length() > 0)
                && (panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldNombre.getText().length() > 0))) {
            if ((Logica.Cuadros_Emergentes.confirmacion()) == 0) {
                //Verifico que el contenido del campo de texto "distribuidor" no
                //sea igual a 'GENERICO**', de  ser asi se colocaran los datos
                //ingresados en la ventana de venta y luego se mostrara esta
                //ventana directamente.
                if (!(Diseño.Facturacion.paneles_pantallaPrincipal.panel_compras.panelCompra_textFieldDistribuidor.getText().equals("GENERICO** ."))) {
                    Diseño.Facturacion.paneles_pantallaPrincipal.panel_compras.panelCompra_textFieldDistribuidor.setText(Diseño.Facturacion.Paneles_nuevo.panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldCodigo.getText()
                            + " . " + Diseño.Facturacion.Paneles_nuevo.panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldNombre.getText());
                    //Se oculta la ventana actual de crear distribuidor y se muestra la de la factura de compra.
                    Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[7].setVisible(false);
                    Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[2].setVisible(true);
                }
                if (DataBase.Facturacion.Distribuidor.Insert.distribuidor(new String[]{
                    Diseño.Facturacion.Paneles_nuevo.panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldCodigo.getText(),
                    Diseño.Facturacion.Paneles_nuevo.panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldNombre.getText(),
                    Diseño.Facturacion.Paneles_nuevo.panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldContacto.getText(),
                    Diseño.Facturacion.Paneles_nuevo.panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldDireccion.getText()})) {
                    panel_nuevoDistribuidor.eventoArticuloClienteDistribuidor(false);
                    llenarTablaTodosDatos();
                    //Llama un metodo que vuelve a cargar el  AutoCompleter en el campo de distribuidores.
                    Diseño.Facturacion.paneles_base.panelBase_CompraVenta.autoCompleterCampoClienteDistribuidor(Diseño.Facturacion.paneles_pantallaPrincipal.panel_compras.panelCompra_textFieldDistribuidor, false, "campo_cliente_distribuidor");
                    //*
                    Logica.Cuadros_Emergentes.completado();
                } else {
                    Logica.Cuadros_Emergentes.alerta("No se pudo crear el distribuidor"
                            + ", el problema pudo aver sido causado porque ya este distribuidor"
                            + "existe en la base de datos.");
                }
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("Todos los campos marcados con (*)"
                    + " son obligatorios.");
        }
    }

    //LLENAR LA TABLA con todos los distribuidores activos de la base de datos.
    @Override
    protected void llenarTablaTodosDatos() {
        java.sql.ResultSet rs = DataBase.Facturacion.Distribuidor.Select.todoDistribuidores();
        actualizarLlenarTabla(rs);
    }

    //Evento para el boton 'modificar', guarda la modificacion del distribuidor en la DB.
    @Override
    protected void eventoBotonModificar() {
        if (((panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldCodigo.getText().length() > 0)
                && (panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldNombre.getText().length() > 0))) {
            if (Logica.Cuadros_Emergentes.confirmacionDefinida("-Sobreescribira los datos del distribuidor por los nuevos datos escritos.") == 0) {
                DataBase.Facturacion.Distribuidor.Update.Distribuidor(new String[]{panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldCodigo.getText(),
                    panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldNombre.getText(),
                    panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldContacto.getText(),
                    panel_nuevoDistribuidor.panelNuevoDistribuidor_textFieldDireccion.getText()});
                actualizarTablaAlModificarOEliminar();
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("Todos los campos marcados con (*)"
                    + " son obligatorios.");
        }
    }
}

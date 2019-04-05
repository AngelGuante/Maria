package Diseño.Facturacion.paneles_pantallaPrincipal;

import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_mayuscula;
import Logica.CamposTexto.Campo_tipoLetra;
import Logica.CamposTexto.Campo_tipoNumero;
import javax.swing.table.DefaultTableModel;

public class panel_gerencia extends Diseño.Facturacion.paneles_base.panelBase {

    public panel_gerencia() {
        initComponents();
        detallesComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGerencia_radioGroup = new javax.swing.ButtonGroup();
        panelGerencia_groupEmpleados = new javax.swing.ButtonGroup();
        panelGerencia_groupPedirContraseña = new javax.swing.ButtonGroup();
        panelGerencia_labelNuevoEmpleado = new javax.swing.JLabel();
        panelGerencia_separador1 = new javax.swing.JSeparator();
        panelGerencia_textFieldNombre = new javax.swing.JTextField();
        panelGerencia_textFieldApellido = new javax.swing.JTextField();
        panelGerencia_textFieldContacto = new javax.swing.JTextField();
        panelGerencia_textFieldPuesto = new javax.swing.JTextField();
        panelGerencia_textFieldSueldo = new javax.swing.JTextField();
        panelGerencia_labelEmpleadoTieneAccesoAlSistema = new javax.swing.JLabel();
        panelGerencia_radioSi = new javax.swing.JRadioButton();
        panelGerencia_radioNo = new javax.swing.JRadioButton();
        panelGerencia_scrollTextArea = new javax.swing.JScrollPane();
        panelGerencia_textAreaNota = new javax.swing.JTextArea();
        panelGerencia_textFieldContraseña = new javax.swing.JTextField();
        panelGerencia_botonAgregar = new javax.swing.JButton();
        panelGerencia_LosCamposMarcadosSonObligatorios = new javax.swing.JLabel();
        panelGerencia_botonModificar = new javax.swing.JButton();
        panelGerencia_botonEliminar = new javax.swing.JButton();
        panelGerencia_scrollTabla = new javax.swing.JScrollPane();
        panelGerencia_tabla = new javax.swing.JTable();
        panelGerencia_radioVerSoloEmpleadosActivos = new javax.swing.JRadioButton();
        panelGerencia_radioVerTodosLosEmpleados = new javax.swing.JRadioButton();
        panelGerencia_botonLimpiar = new javax.swing.JButton();
        panelGerencia_textFieldFechaDeIngreso = new javax.swing.JFormattedTextField();
        panelGerencia_checkBoxAdministrador = new javax.swing.JCheckBox();
        panelGerencia_radioVerSoloAdministradoresActivos = new javax.swing.JRadioButton();
        panelGerencia_textFieldClaveEmpleado = new javax.swing.JTextField();

        setLayout(null);

        panelGerencia_labelNuevoEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelGerencia_labelNuevoEmpleado.setText("Nuevo empleado");
        add(panelGerencia_labelNuevoEmpleado);
        panelGerencia_labelNuevoEmpleado.setBounds(10, 11, 267, 15);

        panelGerencia_separador1.setBackground(new java.awt.Color(0, 0, 0));
        panelGerencia_separador1.setForeground(new java.awt.Color(0, 0, 0));
        add(panelGerencia_separador1);
        panelGerencia_separador1.setBounds(10, 32, 267, 10);

        panelGerencia_textFieldNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelGerencia_textFieldNombre.setForeground(new java.awt.Color(0, 153, 204));
        panelGerencia_textFieldNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nombre*"));
        panelGerencia_textFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelGerencia_textFieldNombreFocusLost(evt);
            }
        });
        panelGerencia_textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_textFieldNombreActionPerformed(evt);
            }
        });
        add(panelGerencia_textFieldNombre);
        panelGerencia_textFieldNombre.setBounds(10, 67, 117, 37);

        panelGerencia_textFieldApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelGerencia_textFieldApellido.setForeground(new java.awt.Color(0, 153, 204));
        panelGerencia_textFieldApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Apellido*"));
        panelGerencia_textFieldApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelGerencia_textFieldApellidoFocusLost(evt);
            }
        });
        panelGerencia_textFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_textFieldApellidoActionPerformed(evt);
            }
        });
        add(panelGerencia_textFieldApellido);
        panelGerencia_textFieldApellido.setBounds(133, 67, 117, 37);

        panelGerencia_textFieldContacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelGerencia_textFieldContacto.setForeground(new java.awt.Color(0, 153, 204));
        panelGerencia_textFieldContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contacto"));
        panelGerencia_textFieldContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_textFieldContactoActionPerformed(evt);
            }
        });
        add(panelGerencia_textFieldContacto);
        panelGerencia_textFieldContacto.setBounds(10, 110, 117, 37);

        panelGerencia_textFieldPuesto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelGerencia_textFieldPuesto.setForeground(new java.awt.Color(0, 153, 204));
        panelGerencia_textFieldPuesto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Puesto"));
        panelGerencia_textFieldPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_textFieldPuestoActionPerformed(evt);
            }
        });
        add(panelGerencia_textFieldPuesto);
        panelGerencia_textFieldPuesto.setBounds(133, 110, 117, 37);

        panelGerencia_textFieldSueldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelGerencia_textFieldSueldo.setForeground(new java.awt.Color(0, 153, 204));
        panelGerencia_textFieldSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sueldo"));
        panelGerencia_textFieldSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_textFieldSueldoActionPerformed(evt);
            }
        });
        add(panelGerencia_textFieldSueldo);
        panelGerencia_textFieldSueldo.setBounds(10, 153, 117, 37);

        panelGerencia_labelEmpleadoTieneAccesoAlSistema.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelGerencia_labelEmpleadoTieneAccesoAlSistema.setText("Tiene acceso al sistema");
        add(panelGerencia_labelEmpleadoTieneAccesoAlSistema);
        panelGerencia_labelEmpleadoTieneAccesoAlSistema.setBounds(10, 332, 117, 13);

        panelGerencia_radioGroup.add(panelGerencia_radioSi);
        panelGerencia_radioSi.setText("Si");
        panelGerencia_radioSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_radioSiActionPerformed(evt);
            }
        });
        add(panelGerencia_radioSi);
        panelGerencia_radioSi.setBounds(133, 327, 33, 23);

        panelGerencia_radioGroup.add(panelGerencia_radioNo);
        panelGerencia_radioNo.setSelected(true);
        panelGerencia_radioNo.setText("NO");
        panelGerencia_radioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_radioNoActionPerformed(evt);
            }
        });
        add(panelGerencia_radioNo);
        panelGerencia_radioNo.setBounds(166, 327, 41, 23);

        panelGerencia_textAreaNota.setColumns(20);
        panelGerencia_textAreaNota.setForeground(new java.awt.Color(0, 153, 204));
        panelGerencia_textAreaNota.setRows(5);
        panelGerencia_textAreaNota.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nota"));
        panelGerencia_scrollTextArea.setViewportView(panelGerencia_textAreaNota);

        add(panelGerencia_scrollTextArea);
        panelGerencia_scrollTextArea.setBounds(10, 196, 240, 90);

        panelGerencia_textFieldContraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelGerencia_textFieldContraseña.setForeground(new java.awt.Color(255, 51, 51));
        panelGerencia_textFieldContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contraseña*", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        add(panelGerencia_textFieldContraseña);
        panelGerencia_textFieldContraseña.setBounds(10, 350, 200, 50);

        panelGerencia_botonAgregar.setBackground(new java.awt.Color(102, 204, 255));
        panelGerencia_botonAgregar.setText("Guardar");
        panelGerencia_botonAgregar.setActionCommand("");
        panelGerencia_botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_botonAgregarActionPerformed(evt);
            }
        });
        add(panelGerencia_botonAgregar);
        panelGerencia_botonAgregar.setBounds(10, 420, 80, 23);

        panelGerencia_LosCamposMarcadosSonObligatorios.setForeground(new java.awt.Color(255, 0, 0));
        panelGerencia_LosCamposMarcadosSonObligatorios.setText("Los campos marcados con (*) son obligatorios.");
        add(panelGerencia_LosCamposMarcadosSonObligatorios);
        panelGerencia_LosCamposMarcadosSonObligatorios.setBounds(10, 450, 290, 14);

        panelGerencia_botonModificar.setText("Modificar");
        panelGerencia_botonModificar.setActionCommand("");
        panelGerencia_botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_botonModificarActionPerformed(evt);
            }
        });
        add(panelGerencia_botonModificar);
        panelGerencia_botonModificar.setBounds(90, 420, 80, 23);

        panelGerencia_botonEliminar.setBackground(new java.awt.Color(255, 102, 102));
        panelGerencia_botonEliminar.setText("Cancelar");
        panelGerencia_botonEliminar.setActionCommand("");
        panelGerencia_botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_botonEliminarActionPerformed(evt);
            }
        });
        add(panelGerencia_botonEliminar);
        panelGerencia_botonEliminar.setBounds(170, 420, 90, 23);

        panelGerencia_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
            },
            new String [] {
                "Nombre", "Contacto", "Puesto", "Sueldo", "Activo", "Id"
            }
        ));
        panelGerencia_tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelGerencia_tablaMouseReleased(evt);
            }
        });
        panelGerencia_scrollTabla.setViewportView(panelGerencia_tabla);

        add(panelGerencia_scrollTabla);
        panelGerencia_scrollTabla.setBounds(260, 80, 620, 350);

        panelGerencia_groupEmpleados.add(panelGerencia_radioVerSoloEmpleadosActivos);
        panelGerencia_radioVerSoloEmpleadosActivos.setSelected(true);
        panelGerencia_radioVerSoloEmpleadosActivos.setText("Solo empleados activos");
        panelGerencia_radioVerSoloEmpleadosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_radioVerSoloEmpleadosActivosActionPerformed(evt);
            }
        });
        add(panelGerencia_radioVerSoloEmpleadosActivos);
        panelGerencia_radioVerSoloEmpleadosActivos.setBounds(410, 50, 160, 23);

        panelGerencia_groupEmpleados.add(panelGerencia_radioVerTodosLosEmpleados);
        panelGerencia_radioVerTodosLosEmpleados.setText("Todos los empleados");
        panelGerencia_radioVerTodosLosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_radioVerTodosLosEmpleadosActionPerformed(evt);
            }
        });
        add(panelGerencia_radioVerTodosLosEmpleados);
        panelGerencia_radioVerTodosLosEmpleados.setBounds(260, 50, 150, 23);

        panelGerencia_botonLimpiar.setBackground(new java.awt.Color(153, 255, 153));
        panelGerencia_botonLimpiar.setText("Limpiar");
        panelGerencia_botonLimpiar.setActionCommand("");
        panelGerencia_botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_botonLimpiarActionPerformed(evt);
            }
        });
        add(panelGerencia_botonLimpiar);
        panelGerencia_botonLimpiar.setBounds(10, 420, 80, 23);

        panelGerencia_textFieldFechaDeIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fecha de ingreso"));
        panelGerencia_textFieldFechaDeIngreso.setForeground(new java.awt.Color(51, 102, 255));
        try {
            panelGerencia_textFieldFechaDeIngreso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##. ##. ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelGerencia_textFieldFechaDeIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_textFieldFechaDeIngresoActionPerformed(evt);
            }
        });
        add(panelGerencia_textFieldFechaDeIngreso);
        panelGerencia_textFieldFechaDeIngreso.setBounds(133, 154, 117, 36);

        panelGerencia_checkBoxAdministrador.setText("Administrador");
        add(panelGerencia_checkBoxAdministrador);
        panelGerencia_checkBoxAdministrador.setBounds(10, 400, 100, 23);

        panelGerencia_groupEmpleados.add(panelGerencia_radioVerSoloAdministradoresActivos);
        panelGerencia_radioVerSoloAdministradoresActivos.setText("Aministradores");
        panelGerencia_radioVerSoloAdministradoresActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelGerencia_radioVerSoloAdministradoresActivosActionPerformed(evt);
            }
        });
        add(panelGerencia_radioVerSoloAdministradoresActivos);
        panelGerencia_radioVerSoloAdministradoresActivos.setBounds(570, 50, 130, 23);

        panelGerencia_textFieldClaveEmpleado.setEditable(false);
        panelGerencia_textFieldClaveEmpleado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelGerencia_textFieldClaveEmpleado.setForeground(new java.awt.Color(255, 51, 51));
        panelGerencia_textFieldClaveEmpleado.setText("_____");
        panelGerencia_textFieldClaveEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Codigo del Empleado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        add(panelGerencia_textFieldClaveEmpleado);
        panelGerencia_textFieldClaveEmpleado.setBounds(10, 290, 200, 40);
    }// </editor-fold>//GEN-END:initComponents

    //Guardar el Nuevo empleado
    private void panelGerencia_botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_botonAgregarActionPerformed
        if (((panelGerencia_textFieldNombre.getText().length() > 0))
                && (panelGerencia_textFieldApellido.getText().length() > 0)) {
            //Verifico si el radio button de "acceso al sistema" esta seleccionado entonces el campo de "contraseña" debe estar lleno.
            if (panelGerencia_radioSi.isSelected()
                    && !((panelGerencia_textFieldContraseña.getText().length() > 0))) {
                Logica.Cuadros_Emergentes.alerta("La contraseña es obligatoria.");
                return;
            }
            DataBase.Facturacion.Empleado.Insert.empleado(new String[]{
                panelGerencia_textFieldClaveEmpleado.getText(),
                panelGerencia_textFieldNombre.getText(),
                panelGerencia_textFieldApellido.getText(),
                panelGerencia_textFieldContacto.getText(),
                panelGerencia_textFieldPuesto.getText(),
                panelGerencia_textFieldSueldo.getText(),
                panelGerencia_textAreaNota.getText(),
                (panelGerencia_textFieldContraseña.getText().length() > 0
                ? panelGerencia_textFieldContraseña.getText()
                : "-")
            }, panelGerencia_textFieldFechaDeIngreso.getText(),
                    panelGerencia_radioSi.isSelected(),
                    panelGerencia_checkBoxAdministrador.isSelected()
            );
            actualizarLlenarTabla(DataBase.Facturacion.Empleado.Select.empleadosActivos());
            Logica.Cuadros_Emergentes.completado();
            limpiarVentana();
            //Actualizar las otras ventanas que tratan los datos evaluados ahora:
            Diseño.Facturacion.paneles_pantallaPrincipal.panel_caja.llenarRadioButtonEmisorMovimiento();
            Diseño.Facturacion.paneles_loggin.panel_LogginAcceso.setDatosEmpleadosAutoCompleter("campo_loggin_empleado");
        } else {
            Logica.Cuadros_Emergentes.alerta("Todos los campos marcados con (*)"
                    + " son obligatorios.");
        }
    }//GEN-LAST:event_panelGerencia_botonAgregarActionPerformed

    /*
    *Limpia los campos de texto del de e muevo empleado y regresa los demas componentes
    *a su estado original.
     */
    private void panelGerencia_botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_botonLimpiarActionPerformed
        if (Logica.Cuadros_Emergentes.confirmacionDefinida(""
                + "-Se borraran todos los datos escritos del nuevo empleado.\n\n") == 0) {
            limpiarVentana();
        }
    }//GEN-LAST:event_panelGerencia_botonLimpiarActionPerformed

    //Evento para la tabla, muestra los botones Limpiar, modificar, eliminar y oculta Crear. tambien hala los datos del Empleado seleccionado.
    private void panelGerencia_tablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGerencia_tablaMouseReleased
        limpiarVentana();
        if (Logica.tablas.Tabla_verificarFilaSeleccionada.rowSelectedNotNull(panelGerencia_tabla)) {
            java.sql.ResultSet rs = DataBase.Facturacion.Empleado.Select.empleadoPorId((String) panelGerencia_tabla.getValueAt(panelGerencia_tabla.getSelectedRow(), 5));
            try {
                rs.next();
                panelGerencia_textFieldNombre.setText(rs.getString("nombreEmpleado"));
                panelGerencia_textFieldApellido.setText(rs.getString("apellidoEmpleado"));
                panelGerencia_textFieldContacto.setText(rs.getString("contacto"));
                panelGerencia_textFieldPuesto.setText(rs.getString("puesto"));
                panelGerencia_textFieldSueldo.setText(rs.getString("Sueldo"));
                panelGerencia_textFieldFechaDeIngreso.setText(rs.getString("fecha"));
                panelGerencia_textAreaNota.setText(rs.getString("notas"));
                panelGerencia_textFieldContraseña.setText(rs.getString("contrasenia"));
                panelGerencia_textFieldContraseña.setVisible(false);
                //Verifico si el usuario tiene acceso al sistema para mostrarlo en la GUI.
                if (rs.getBoolean("accesoASistema")) {
                    panelGerencia_radioSi.setSelected(true);
                    panelGerencia_textFieldContraseña.setVisible(true);
                    panelGerencia_checkBoxAdministrador.setVisible(true);
                    panelGerencia_checkBoxAdministrador.setSelected(rs.getBoolean("administrador"));
                }
                rs.close();
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
            panelGerencia_botonAgregar.setVisible(false);
            panelGerencia_botonLimpiar.setVisible(true);
            panelGerencia_botonModificar.setVisible(true);
            panelGerencia_botonEliminar.setVisible(true);
        }
    }//GEN-LAST:event_panelGerencia_tablaMouseReleased

    private void panelGerencia_radioSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_radioSiActionPerformed
        panelGerencia_checkBoxAdministrador.setVisible(true);
        panelGerencia_checkBoxAdministrador.setSelected(false);
        panelGerencia_textFieldContraseña.setVisible(true);
        panelGerencia_textFieldContraseña.setText("");
    }//GEN-LAST:event_panelGerencia_radioSiActionPerformed

    private void panelGerencia_radioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_radioNoActionPerformed
        panelGerencia_checkBoxAdministrador.setVisible(false);
        panelGerencia_textFieldContraseña.setVisible(false);
        panelGerencia_textFieldContraseña.setText("");
    }//GEN-LAST:event_panelGerencia_radioNoActionPerformed

    private void panelGerencia_textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_textFieldNombreActionPerformed
        ComportamientoEvento_campoNombre();
    }//GEN-LAST:event_panelGerencia_textFieldNombreActionPerformed

    private void panelGerencia_textFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_textFieldApellidoActionPerformed
        ComportamientoEvento_campoApellido();
    }//GEN-LAST:event_panelGerencia_textFieldApellidoActionPerformed

    private void panelGerencia_textFieldContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_textFieldContactoActionPerformed
        panelGerencia_textFieldPuesto.requestFocus();
    }//GEN-LAST:event_panelGerencia_textFieldContactoActionPerformed

    private void panelGerencia_textFieldPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_textFieldPuestoActionPerformed
        panelGerencia_textFieldSueldo.requestFocus();
    }//GEN-LAST:event_panelGerencia_textFieldPuestoActionPerformed

    private void panelGerencia_textFieldSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_textFieldSueldoActionPerformed
        panelGerencia_textFieldFechaDeIngreso.requestFocus();
    }//GEN-LAST:event_panelGerencia_textFieldSueldoActionPerformed

    private void panelGerencia_textFieldFechaDeIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_textFieldFechaDeIngresoActionPerformed
        panelGerencia_textAreaNota.requestFocus();
    }//GEN-LAST:event_panelGerencia_textFieldFechaDeIngresoActionPerformed

    private void panelGerencia_radioVerTodosLosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_radioVerTodosLosEmpleadosActionPerformed
        actualizarLlenarTabla(DataBase.Facturacion.Empleado.Select.todoEmpleados());
    }//GEN-LAST:event_panelGerencia_radioVerTodosLosEmpleadosActionPerformed

    private void panelGerencia_radioVerSoloEmpleadosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_radioVerSoloEmpleadosActivosActionPerformed
        actualizarLlenarTabla(DataBase.Facturacion.Empleado.Select.empleadosActivos());
    }//GEN-LAST:event_panelGerencia_radioVerSoloEmpleadosActivosActionPerformed

    private void panelGerencia_botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_botonModificarActionPerformed
        if ((Logica.Cuadros_Emergentes.confirmacionDefinida(
                "-Modificara los datos del empleado.")) == 0) {
            DataBase.Facturacion.Empleado.Update.empleado(new String[]{(String) panelGerencia_tabla.getValueAt(panelGerencia_tabla.getSelectedRow(), 5),
                panelGerencia_textFieldNombre.getText(), panelGerencia_textFieldApellido.getText(), panelGerencia_textFieldContacto.getText(),
                panelGerencia_textFieldPuesto.getText(), panelGerencia_textFieldSueldo.getText(),
                panelGerencia_textAreaNota.getText(), panelGerencia_textFieldContraseña.getText()},
                    panelGerencia_textFieldFechaDeIngreso.getText(), panelGerencia_radioSi.isSelected(), panelGerencia_checkBoxAdministrador.isSelected());
            Logica.Cuadros_Emergentes.completado();
            limpiarVentana();
            Diseño.Facturacion.paneles_pantallaPrincipal.panel_caja.llenarRadioButtonEmisorMovimiento();
        }
    }//GEN-LAST:event_panelGerencia_botonModificarActionPerformed

    private void panelGerencia_radioVerSoloAdministradoresActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_radioVerSoloAdministradoresActivosActionPerformed
        actualizarLlenarTabla(DataBase.Facturacion.Empleado.Select.todosAdministradoresActivos());
    }//GEN-LAST:event_panelGerencia_radioVerSoloAdministradoresActivosActionPerformed

    private void panelGerencia_botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelGerencia_botonEliminarActionPerformed
        if ((Logica.Cuadros_Emergentes.confirmacionDefinida(
                "-Cancelara al empleado.")) == 0) {
            DataBase.Facturacion.Empleado.Update.cancelarEmpleado((String) panelGerencia_tabla.getValueAt(panelGerencia_tabla.getSelectedRow(), 5));
            Logica.Cuadros_Emergentes.completado();
            limpiarVentana();
            Diseño.Facturacion.paneles_pantallaPrincipal.panel_caja.llenarRadioButtonEmisorMovimiento();
        }
    }//GEN-LAST:event_panelGerencia_botonEliminarActionPerformed

    private void panelGerencia_textFieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelGerencia_textFieldNombreFocusLost
        ComportamientoEvento_campoNombre();
    }//GEN-LAST:event_panelGerencia_textFieldNombreFocusLost

    private void panelGerencia_textFieldApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelGerencia_textFieldApellidoFocusLost
        ComportamientoEvento_campoApellido();
    }//GEN-LAST:event_panelGerencia_textFieldApellidoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel panelGerencia_LosCamposMarcadosSonObligatorios;
    private javax.swing.JButton panelGerencia_botonAgregar;
    private javax.swing.JButton panelGerencia_botonEliminar;
    private javax.swing.JButton panelGerencia_botonLimpiar;
    private javax.swing.JButton panelGerencia_botonModificar;
    private javax.swing.JCheckBox panelGerencia_checkBoxAdministrador;
    private javax.swing.ButtonGroup panelGerencia_groupEmpleados;
    private javax.swing.ButtonGroup panelGerencia_groupPedirContraseña;
    private javax.swing.JLabel panelGerencia_labelEmpleadoTieneAccesoAlSistema;
    private javax.swing.JLabel panelGerencia_labelNuevoEmpleado;
    private javax.swing.ButtonGroup panelGerencia_radioGroup;
    private javax.swing.JRadioButton panelGerencia_radioNo;
    private javax.swing.JRadioButton panelGerencia_radioSi;
    private javax.swing.JRadioButton panelGerencia_radioVerSoloAdministradoresActivos;
    private javax.swing.JRadioButton panelGerencia_radioVerSoloEmpleadosActivos;
    private javax.swing.JRadioButton panelGerencia_radioVerTodosLosEmpleados;
    private javax.swing.JScrollPane panelGerencia_scrollTabla;
    private javax.swing.JScrollPane panelGerencia_scrollTextArea;
    private javax.swing.JSeparator panelGerencia_separador1;
    private javax.swing.JTable panelGerencia_tabla;
    private javax.swing.JTextArea panelGerencia_textAreaNota;
    private javax.swing.JTextField panelGerencia_textFieldApellido;
    private javax.swing.JTextField panelGerencia_textFieldClaveEmpleado;
    private javax.swing.JTextField panelGerencia_textFieldContacto;
    private javax.swing.JTextField panelGerencia_textFieldContraseña;
    private javax.swing.JFormattedTextField panelGerencia_textFieldFechaDeIngreso;
    private javax.swing.JTextField panelGerencia_textFieldNombre;
    private javax.swing.JTextField panelGerencia_textFieldPuesto;
    private javax.swing.JTextField panelGerencia_textFieldSueldo;
    // End of variables declaration//GEN-END:variables

    //**************************************************************//
    //***************** Configurar componentes ********************//
    //*************************************************************//
    private void detallesComponentes() {
        panelGerencia_botonModificar.setVisible(false);
        panelGerencia_botonEliminar.setVisible(false);
        panelGerencia_botonLimpiar.setVisible(false);
        panelGerencia_textFieldContraseña.setVisible(false);
        panelGerencia_checkBoxAdministrador.setVisible(false);

        //FECHA campos de texto
        panelGerencia_textFieldFechaDeIngreso.setText(Logica.fechaHora.getFecha());

        //MAYUSCULA campos de texto
        Campo_mayuscula.campoTextoMayuscula(panelGerencia_textFieldNombre);
        Campo_mayuscula.campoTextoMayuscula(panelGerencia_textFieldApellido);
        Campo_mayuscula.campoTextoMayuscula(panelGerencia_textFieldPuesto);

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelGerencia_textFieldNombre, 12);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelGerencia_textFieldApellido, 12);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelGerencia_textFieldPuesto, 12);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelGerencia_textFieldContraseña, 30);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelGerencia_textFieldContraseña, 16);
        Logica.herramientas.campoTextoAreaTamaño(panelGerencia_textAreaNota, 100);

        //TIPO campo de texto
        Campo_tipoLetra.campoTextoTipoLetras(panelGerencia_textFieldNombre);
        Campo_tipoLetra.campoTextoTipoLetras(panelGerencia_textFieldApellido);
        Campo_tipoLetra.campoTextoTipoLetras(panelGerencia_textFieldPuesto);
        Campo_tipoNumero.campoTextoTipoNumero(panelGerencia_textFieldContacto);
        Campo_tipoNumero.campoTextoTipoNumero(panelGerencia_textFieldSueldo);

        //SALTO DE LINEA AUTOMATICO text area
        panelGerencia_textAreaNota.setLineWrap(true);
        panelGerencia_textAreaNota.setWrapStyleWord(true);

        //TAMAÑO celdas de tabla
        int[] tamaño = {185, 80, 85, 50, 38, 38};
        Logica.tablas.Tabla_tamañoCeldas.setTablaColumnasTamaño(tamaño, panelGerencia_tabla);

        //Llenar la tabla
        actualizarLlenarTabla(DataBase.Facturacion.Empleado.Select.empleadosActivos());
    }

    //*************************************************************//
    //************** -COMPORTAMIENTOS DE EVENTOS- *****************//
    //*************************************************************//    
    private void ComportamientoEvento_campoNombre() {
        panelGerencia_textFieldApellido.requestFocus();
        panelGerencia_textFieldClaveEmpleado.setText(
                panelGerencia_textFieldClaveEmpleado.getText().equals("_____")
                ? panelGerencia_textFieldNombre.getText().substring(0, 1)
                + "_" + DataBase.Facturacion.Empleado.Select.getNumeroEmpleados()
                : panelGerencia_textFieldNombre.getText().substring(0, 1)
                + panelGerencia_textFieldClaveEmpleado.getText().substring(1,
                        panelGerencia_textFieldClaveEmpleado.getText().length()));
    }

    private void ComportamientoEvento_campoApellido() {
        panelGerencia_textFieldContacto.requestFocus();
        panelGerencia_textFieldClaveEmpleado.setText(
                panelGerencia_textFieldNombre.getText().substring(0, 1)
                + panelGerencia_textFieldApellido.getText().substring(0, 1)
                + panelGerencia_textFieldClaveEmpleado.getText().substring(2,
                        panelGerencia_textFieldClaveEmpleado.getText().length())
        );
    }

    //*************************************************************//
    //*********************** -METODOS- **************************//
    //*************************************************************//
    //Limpia los campos de esta ventana
    private void limpiarVentana() {
        panelGerencia_textFieldClaveEmpleado.setText("_____");
        panelGerencia_textFieldNombre.setText("");
        panelGerencia_textFieldApellido.setText("");
        panelGerencia_textFieldContacto.setText("");
        panelGerencia_textFieldPuesto.setText("");
        panelGerencia_textFieldSueldo.setText("");
        panelGerencia_textAreaNota.setText("");
        panelGerencia_textFieldContraseña.setText("");
        panelGerencia_textFieldContraseña.setVisible(false);
        panelGerencia_checkBoxAdministrador.setSelected(false);
        panelGerencia_radioNo.setSelected(true);
        panelGerencia_botonModificar.setVisible(false);
        panelGerencia_botonEliminar.setVisible(false);
        panelGerencia_botonAgregar.setVisible(true);
        panelGerencia_botonLimpiar.setVisible(false);
        panelGerencia_checkBoxAdministrador.setVisible(false);
        panelGerencia_textFieldFechaDeIngreso.setText(Logica.fechaHora.getFecha());
    }

    //Llena la tabla con los datos recibidos por el ResultSet
    private void actualizarLlenarTabla(java.sql.ResultSet rs) {
        eliminarAgregarFilasFacturas();
        try {
            while (rs.next()) {
                panelGerencia_tabla.getModel().setValueAt(rs.getString("nombreEmpleado"), rs.getRow() - 1, 0);
                panelGerencia_tabla.getModel().setValueAt(rs.getString("contacto"), rs.getRow() - 1, 1);
                panelGerencia_tabla.getModel().setValueAt(rs.getString("puesto"), rs.getRow() - 1, 2);
                panelGerencia_tabla.getModel().setValueAt(rs.getString("Sueldo"), rs.getRow() - 1, 3);
                panelGerencia_tabla.getModel().setValueAt(rs.getString("activo"), rs.getRow() - 1, 4);
                panelGerencia_tabla.getModel().setValueAt(rs.getString("idEmpleado"), rs.getRow() - 1, 5);
            }
            rs.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    //Elimina y agrega filas a la tabla
    private void eliminarAgregarFilasFacturas() {
        for (int i = 0; i < 50; i++) {
            ((DefaultTableModel) panelGerencia_tabla.getModel()).removeRow(i);
        }
        for (int i = 0; i < 25; i++) {
            ((DefaultTableModel) panelGerencia_tabla.getModel()).removeRow(i);
        }
        for (int i = 0; i < 13; i++) {
            ((DefaultTableModel) panelGerencia_tabla.getModel()).removeRow(i);
        }
        for (int i = 0; i < 6; i++) {
            ((DefaultTableModel) panelGerencia_tabla.getModel()).removeRow(i);
        }
        for (int i = 0; i < 3; i++) {
            ((DefaultTableModel) panelGerencia_tabla.getModel()).removeRow(i);
        }
        for (int i = 0; i < 2; i++) {
            ((DefaultTableModel) panelGerencia_tabla.getModel()).removeRow(i);
        }
        ((DefaultTableModel) panelGerencia_tabla.getModel()).removeRow(0);

        for (int i = 0; i < 100; i++) {
            ((DefaultTableModel) panelGerencia_tabla.getModel()).addRow(new String[]{"", "", "", "", ""});
        }
    }
}

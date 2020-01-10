package Diseño.Facturacion.paneles_pantallaPrincipal;

import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_tipoNumero;
import java.awt.Color;
import java.sql.SQLException;

public class panel_ventas extends Diseño.Facturacion.paneles_base.panelBase_CompraVenta {

    public static String totalTmp = "";
    private boolean enterPrecionado = false;

    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane pane;
    private javax.swing.table.DefaultTableModel model;
    @SuppressWarnings("FieldMayBeFinal")
    //Aqui almaceno todos los costos para por si en la venta se borra un
    //articulo tener un control de cual monto restar.
    private java.util.ArrayList<Integer> costosTMP = new java.util.ArrayList<>();
    private java.util.ArrayList<Integer> cantidadTMP = new java.util.ArrayList<>();

    private String NCF = "";

    public panel_ventas() {
        initComponents();
        detallesComponentes();
        modificarComponentesPanelPadre();
        herencia_texteFieldCantidad = panelVenta_textFieldCantidad;
        herencia_texteFieldPrecioCosto = panelVenta_textFieldPrecio;
        herencia_texteFieldCodigoProducto = panelVenta_textFieldCodigoProducto;
        herencia_model = model;
        herencia_tabla = tabla;
        herencia_botonEliminar = paneVenta_botonEliminarFilaSeleccionada;
        herencia_textFieldClienteDistribuidor = panelVenta_textFieldCliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVenta_groupTipo = new javax.swing.ButtonGroup();
        panelVenta_textFieldQuickCliente = new javax.swing.JTextField();
        panelVenta_textFieldCliente = new javax.swing.JTextField();
        panelVentas_toggle_guardarCliente = new javax.swing.JToggleButton();
        panelVenta_radioContado = new javax.swing.JRadioButton();
        panelVenta_radioCredito = new javax.swing.JRadioButton();
        panelVenta_textFieldCodigo = new javax.swing.JTextField();
        panelVenta_panelDatosVentaCredito = new javax.swing.JPanel();
        panelVentaPanelDatosVentaCredito_textFieldMonto = new javax.swing.JTextField();
        panelVentaPanelDatosVentaCredito_textFieldInicial = new javax.swing.JTextField();
        panelVentaPanelDatosVentaCredito_textFieldPorciento = new javax.swing.JTextField();
        panelVentaPanelDatosVentaCredito_textFieldCuotas = new javax.swing.JTextField();
        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas = new javax.swing.JTextField();
        panelVentaPanelDatosVentaCredito_textFieldGananciaPagos = new javax.swing.JTextField();
        panelVentaPanelDatosVentaCredito_labelMonto = new javax.swing.JLabel();
        panelVentaPanelDatosVentaCredito_labelInicial = new javax.swing.JLabel();
        panelVentaPanelDatosVentaCredito_labelPorciento = new javax.swing.JLabel();
        panelVentaPanelDatosVentaCredito_labelCuotas = new javax.swing.JLabel();
        panelVentaPanelDatosVentaCredito_labelNumeroCuotas = new javax.swing.JLabel();
        panelVentaPanelDatosVentaCredito_labelGananciaPagos = new javax.swing.JLabel();
        panelVentaPanelDatosVentaCredito_ButtonReestablecer = new javax.swing.JButton();
        panelVenta_checkBoxPendiente = new javax.swing.JCheckBox();
        panelVenta_checkBoxEnvargado = new javax.swing.JCheckBox();
        panelVenta_textFieldSumatoriaDeCostos = new javax.swing.JTextField();
        panelVenta_panelTipoVenta = new javax.swing.JPanel();
        panelVenta_botonClientes = new javax.swing.JButton();
        panelVenta_botonGuardarFactura = new javax.swing.JButton();
        paneVenta_botonEliminarFilaSeleccionada = new javax.swing.JButton();
        panelVenta_textFieldCantidad = new javax.swing.JTextField();
        panelVenta_textFieldPrecio = new javax.swing.JTextField();
        panelBaseCompraVenta_botonGuardarImprimir = new javax.swing.JButton();
        panelBaseCompraVenta_botonHistorial = new javax.swing.JButton();
        panelVenta_textFieldCodigoProducto = new javax.swing.JTextField();
        panelVenta_botonFactuarConComprobante = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        label_totalConImpuestos = new javax.swing.JLabel();

        panelVenta_textFieldQuickCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelVenta_textFieldQuickCliente.setForeground(new java.awt.Color(0, 102, 204));
        panelVenta_textFieldQuickCliente.setText("CLIENTE");
        panelVenta_textFieldQuickCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cliente"));
        add(panelVenta_textFieldQuickCliente);
        panelVenta_textFieldQuickCliente.setBounds(10, 40, 440, 40);

        panelVenta_textFieldCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelVenta_textFieldCliente.setForeground(new java.awt.Color(0, 102, 204));
        panelVenta_textFieldCliente.setText("0 . GENERICO** .");
        panelVenta_textFieldCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cliente"));
        panelVenta_textFieldCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVenta_textFieldClienteActionPerformed(evt);
            }
        });
        add(panelVenta_textFieldCliente);
        panelVenta_textFieldCliente.setBounds(10, 40, 440, 40);

        panelVentas_toggle_guardarCliente.setSelected(true);
        panelVentas_toggle_guardarCliente.setText("No Guardar Cliente");
        panelVentas_toggle_guardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVentas_toggle_guardarClienteActionPerformed(evt);
            }
        });
        add(panelVentas_toggle_guardarCliente);
        panelVentas_toggle_guardarCliente.setBounds(450, 52, 160, 28);

        panelVenta_groupTipo.add(panelVenta_radioContado);
        panelVenta_radioContado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelVenta_radioContado.setSelected(true);
        panelVenta_radioContado.setText("CONTADO");
        panelVenta_radioContado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVenta_radioContadoActionPerformed(evt);
            }
        });
        add(panelVenta_radioContado);
        panelVenta_radioContado.setBounds(790, 84, 86, 18);

        panelVenta_groupTipo.add(panelVenta_radioCredito);
        panelVenta_radioCredito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelVenta_radioCredito.setText("CREDITO");
        panelVenta_radioCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVenta_radioCreditoActionPerformed(evt);
            }
        });
        add(panelVenta_radioCredito);
        panelVenta_radioCredito.setBounds(790, 104, 86, 18);

        panelVenta_textFieldCodigo.setEditable(false);
        panelVenta_textFieldCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelVenta_textFieldCodigo.setForeground(new java.awt.Color(0, 102, 204));
        panelVenta_textFieldCodigo.setText("1000");
        add(panelVenta_textFieldCodigo);
        panelVenta_textFieldCodigo.setBounds(10, 10, 80, 30);

        panelVenta_panelDatosVentaCredito.setBackground(new java.awt.Color(102, 102, 102));
        panelVenta_panelDatosVentaCredito.setLayout(null);

        panelVentaPanelDatosVentaCredito_textFieldMonto.setBackground(new java.awt.Color(153, 255, 153));
        panelVentaPanelDatosVentaCredito_textFieldMonto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelVentaPanelDatosVentaCredito_textFieldMonto.setForeground(new java.awt.Color(0, 153, 153));
        panelVentaPanelDatosVentaCredito_textFieldMonto.setText("0");
        panelVentaPanelDatosVentaCredito_textFieldMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVentaPanelDatosVentaCredito_textFieldMontoActionPerformed(evt);
            }
        });
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_textFieldMonto);
        panelVentaPanelDatosVentaCredito_textFieldMonto.setBounds(300, 10, 70, 30);

        panelVentaPanelDatosVentaCredito_textFieldInicial.setBackground(new java.awt.Color(204, 204, 255));
        panelVentaPanelDatosVentaCredito_textFieldInicial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelVentaPanelDatosVentaCredito_textFieldInicial.setForeground(new java.awt.Color(0, 153, 153));
        panelVentaPanelDatosVentaCredito_textFieldInicial.setText("0");
        panelVentaPanelDatosVentaCredito_textFieldInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVentaPanelDatosVentaCredito_textFieldInicialActionPerformed(evt);
            }
        });
        panelVentaPanelDatosVentaCredito_textFieldInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelVentaPanelDatosVentaCredito_textFieldInicialKeyReleased(evt);
            }
        });
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_textFieldInicial);
        panelVentaPanelDatosVentaCredito_textFieldInicial.setBounds(300, 40, 70, 30);

        panelVentaPanelDatosVentaCredito_textFieldPorciento.setBackground(new java.awt.Color(204, 204, 255));
        panelVentaPanelDatosVentaCredito_textFieldPorciento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelVentaPanelDatosVentaCredito_textFieldPorciento.setForeground(new java.awt.Color(0, 153, 153));
        panelVentaPanelDatosVentaCredito_textFieldPorciento.setText("0");
        panelVentaPanelDatosVentaCredito_textFieldPorciento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelVentaPanelDatosVentaCredito_textFieldPorcientoFocusLost(evt);
            }
        });
        panelVentaPanelDatosVentaCredito_textFieldPorciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVentaPanelDatosVentaCredito_textFieldPorcientoActionPerformed(evt);
            }
        });
        panelVentaPanelDatosVentaCredito_textFieldPorciento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelVentaPanelDatosVentaCredito_textFieldPorcientoKeyReleased(evt);
            }
        });
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_textFieldPorciento);
        panelVentaPanelDatosVentaCredito_textFieldPorciento.setBounds(400, 40, 60, 30);

        panelVentaPanelDatosVentaCredito_textFieldCuotas.setBackground(new java.awt.Color(204, 204, 255));
        panelVentaPanelDatosVentaCredito_textFieldCuotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelVentaPanelDatosVentaCredito_textFieldCuotas.setForeground(new java.awt.Color(0, 153, 153));
        panelVentaPanelDatosVentaCredito_textFieldCuotas.setText("0");
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_textFieldCuotas);
        panelVentaPanelDatosVentaCredito_textFieldCuotas.setBounds(300, 70, 70, 30);

        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.setBackground(new java.awt.Color(204, 204, 255));
        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.setForeground(new java.awt.Color(0, 153, 153));
        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.setText("0");
        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotasActionPerformed(evt);
            }
        });
        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotasKeyReleased(evt);
            }
        });
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas);
        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.setBounds(400, 70, 60, 30);

        panelVentaPanelDatosVentaCredito_textFieldGananciaPagos.setBackground(new java.awt.Color(204, 204, 255));
        panelVentaPanelDatosVentaCredito_textFieldGananciaPagos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelVentaPanelDatosVentaCredito_textFieldGananciaPagos.setForeground(new java.awt.Color(0, 153, 153));
        panelVentaPanelDatosVentaCredito_textFieldGananciaPagos.setText("0");
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_textFieldGananciaPagos);
        panelVentaPanelDatosVentaCredito_textFieldGananciaPagos.setBounds(170, 10, 60, 30);

        panelVentaPanelDatosVentaCredito_labelMonto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelVentaPanelDatosVentaCredito_labelMonto.setText("MONTO");
        panelVentaPanelDatosVentaCredito_labelMonto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_labelMonto);
        panelVentaPanelDatosVentaCredito_labelMonto.setBounds(230, 10, 140, 30);

        panelVentaPanelDatosVentaCredito_labelInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelVentaPanelDatosVentaCredito_labelInicial.setText("INICIAL");
        panelVentaPanelDatosVentaCredito_labelInicial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_labelInicial);
        panelVentaPanelDatosVentaCredito_labelInicial.setBounds(230, 40, 140, 30);

        panelVentaPanelDatosVentaCredito_labelPorciento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelVentaPanelDatosVentaCredito_labelPorciento.setText("%");
        panelVentaPanelDatosVentaCredito_labelPorciento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_labelPorciento);
        panelVentaPanelDatosVentaCredito_labelPorciento.setBounds(370, 40, 90, 30);

        panelVentaPanelDatosVentaCredito_labelCuotas.setBackground(new java.awt.Color(255, 255, 255));
        panelVentaPanelDatosVentaCredito_labelCuotas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelVentaPanelDatosVentaCredito_labelCuotas.setText("CUOTAS");
        panelVentaPanelDatosVentaCredito_labelCuotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_labelCuotas);
        panelVentaPanelDatosVentaCredito_labelCuotas.setBounds(230, 70, 140, 30);

        panelVentaPanelDatosVentaCredito_labelNumeroCuotas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelVentaPanelDatosVentaCredito_labelNumeroCuotas.setText("#");
        panelVentaPanelDatosVentaCredito_labelNumeroCuotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_labelNumeroCuotas);
        panelVentaPanelDatosVentaCredito_labelNumeroCuotas.setBounds(370, 70, 90, 30);

        panelVentaPanelDatosVentaCredito_labelGananciaPagos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelVentaPanelDatosVentaCredito_labelGananciaPagos.setText("GANANCIA PAGOS");
        panelVentaPanelDatosVentaCredito_labelGananciaPagos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_labelGananciaPagos);
        panelVentaPanelDatosVentaCredito_labelGananciaPagos.setBounds(10, 10, 220, 30);

        panelVentaPanelDatosVentaCredito_ButtonReestablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/restore.png"))); // NOI18N
        panelVentaPanelDatosVentaCredito_ButtonReestablecer.setText("Reestablecer Valores de Factura");
        panelVentaPanelDatosVentaCredito_ButtonReestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVentaPanelDatosVentaCredito_ButtonReestablecerActionPerformed(evt);
            }
        });
        panelVenta_panelDatosVentaCredito.add(panelVentaPanelDatosVentaCredito_ButtonReestablecer);
        panelVentaPanelDatosVentaCredito_ButtonReestablecer.setBounds(620, 0, 250, 30);

        add(panelVenta_panelDatosVentaCredito);
        panelVenta_panelDatosVentaCredito.setBounds(10, 260, 870, 110);

        panelVenta_checkBoxPendiente.setText("Pendiente");
        panelVenta_checkBoxPendiente.setEnabled(false);
        add(panelVenta_checkBoxPendiente);
        panelVenta_checkBoxPendiente.setBounds(450, 50, 80, 18);

        panelVenta_checkBoxEnvargado.setText("Envargado");
        panelVenta_checkBoxEnvargado.setEnabled(false);
        add(panelVenta_checkBoxEnvargado);
        panelVenta_checkBoxEnvargado.setBounds(530, 50, 81, 18);

        panelVenta_textFieldSumatoriaDeCostos.setEditable(false);
        panelVenta_textFieldSumatoriaDeCostos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelVenta_textFieldSumatoriaDeCostos.setText("0");
        panelVenta_textFieldSumatoriaDeCostos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "SUMATORIA DE COSTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        panelVenta_textFieldSumatoriaDeCostos.setEnabled(false);
        add(panelVenta_textFieldSumatoriaDeCostos);
        panelVenta_textFieldSumatoriaDeCostos.setBounds(0, 370, 230, 50);

        panelVenta_panelTipoVenta.setBackground(new java.awt.Color(153, 153, 153));
        panelVenta_panelTipoVenta.setLayout(null);
        add(panelVenta_panelTipoVenta);
        panelVenta_panelTipoVenta.setBounds(790, 84, 90, 40);

        panelVenta_botonClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelVenta_botonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/manSmall.png"))); // NOI18N
        panelVenta_botonClientes.setText("  Clientes");
        panelVenta_botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVenta_botonClientesActionPerformed(evt);
            }
        });
        add(panelVenta_botonClientes);
        panelVenta_botonClientes.setBounds(710, 40, 166, 40);

        panelVenta_botonGuardarFactura.setBackground(new java.awt.Color(102, 204, 255));
        panelVenta_botonGuardarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save.png"))); // NOI18N
        panelVenta_botonGuardarFactura.setToolTipText("Guarda la factura sin realizar una impresion de ella.");
        panelVenta_botonGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVenta_botonGuardarFacturaActionPerformed(evt);
            }
        });
        add(panelVenta_botonGuardarFactura);
        panelVenta_botonGuardarFactura.setBounds(830, 380, 50, 40);

        paneVenta_botonEliminarFilaSeleccionada.setBackground(new java.awt.Color(255, 102, 102));
        paneVenta_botonEliminarFilaSeleccionada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        paneVenta_botonEliminarFilaSeleccionada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/delete.png"))); // NOI18N
        paneVenta_botonEliminarFilaSeleccionada.setText("Eliminar fila seleccionada");
        paneVenta_botonEliminarFilaSeleccionada.setToolTipText("");
        paneVenta_botonEliminarFilaSeleccionada.setActionCommand("");
        paneVenta_botonEliminarFilaSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paneVenta_botonEliminarFilaSeleccionadaActionPerformed(evt);
            }
        });
        add(paneVenta_botonEliminarFilaSeleccionada);
        paneVenta_botonEliminarFilaSeleccionada.setBounds(650, 150, 230, 28);

        panelVenta_textFieldCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelVenta_textFieldCantidad.setForeground(new java.awt.Color(0, 153, 204));
        panelVenta_textFieldCantidad.setText("0");
        panelVenta_textFieldCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cantidad"));
        panelVenta_textFieldCantidad.setEnabled(false);
        panelVenta_textFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVenta_textFieldCantidadActionPerformed(evt);
            }
        });
        add(panelVenta_textFieldCantidad);
        panelVenta_textFieldCantidad.setBounds(720, 80, 70, 50);

        panelVenta_textFieldPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelVenta_textFieldPrecio.setForeground(new java.awt.Color(0, 153, 204));
        panelVenta_textFieldPrecio.setText("0");
        panelVenta_textFieldPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Precio"));
        panelVenta_textFieldPrecio.setEnabled(false);
        panelVenta_textFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVenta_textFieldPrecioActionPerformed(evt);
            }
        });
        add(panelVenta_textFieldPrecio);
        panelVenta_textFieldPrecio.setBounds(640, 80, 80, 50);

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

        panelVenta_textFieldCodigoProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelVenta_textFieldCodigoProducto.setForeground(new java.awt.Color(0, 153, 204));
        panelVenta_textFieldCodigoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Codigo"));
        panelVenta_textFieldCodigoProducto.setMinimumSize(new java.awt.Dimension(630, 28));
        panelVenta_textFieldCodigoProducto.setPreferredSize(new java.awt.Dimension(630, 28));
        panelVenta_textFieldCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVenta_textFieldCodigoProductoActionPerformed(evt);
            }
        });
        add(panelVenta_textFieldCodigoProducto);
        panelVenta_textFieldCodigoProducto.setBounds(10, 90, 630, 40);

        panelVenta_botonFactuarConComprobante.setBackground(new java.awt.Color(255, 153, 153));
        panelVenta_botonFactuarConComprobante.setText("FACTURA SIN COMPROBANTE FISCAL");
        panelVenta_botonFactuarConComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVenta_botonFactuarConComprobanteActionPerformed(evt);
            }
        });
        add(panelVenta_botonFactuarConComprobante);
        panelVenta_botonFactuarConComprobante.setBounds(345, 130, 290, 28);
        add(jLabel1);
        jLabel1.setBounds(0, -10, 890, 490);

        label_totalConImpuestos.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        label_totalConImpuestos.setForeground(new java.awt.Color(255, 51, 51));
        label_totalConImpuestos.setText("+ 18% = 0");
        add(label_totalConImpuestos);
        label_totalConImpuestos.setBounds(220, 336, 660, 29);
    }// </editor-fold>//GEN-END:initComponents

    //Evento para el campo de cliente, verifica que el patron sea correcto,
    //en caso de no ser asi habre la ventana de creacion de cliente.
    private void panelVenta_textFieldClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVenta_textFieldClienteActionPerformed
        Evento_campoCliente();
        panelVenta_textFieldCodigoProducto.requestFocus();
    }//GEN-LAST:event_panelVenta_textFieldClienteActionPerformed

    private void panelVenta_radioCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVenta_radioCreditoActionPerformed
        pane.setSize(pane.getWidth(), 90);
        panelVenta_panelDatosVentaCredito.setVisible(true);
        panelVenta_checkBoxEnvargado.setVisible(true);
        panelVenta_checkBoxPendiente.setVisible(true);
        panelVenta_textFieldQuickCliente.setVisible(false);
        panelVentas_toggle_guardarCliente.setVisible(false);
        panelVenta_textFieldCliente.setVisible(true);
        label_totalConImpuestos.setVisible(false);
        PonerValorProductoFacturaConComprobanteFiscal();
        panelVenta_botonFactuarConComprobante.setVisible(false);
        panelVenta_botonFactuarConComprobante.setSelected(true);
        panelVenta_botonFactuarConComprobante.setText("FACTURA SIN COMPROBANTE FISCAL");
        panelVenta_botonFactuarConComprobante.setBackground(new java.awt.Color(204, 204, 204));
        setNumeroFacturaCredito();
    }//GEN-LAST:event_panelVenta_radioCreditoActionPerformed

    private void panelVenta_radioContadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVenta_radioContadoActionPerformed
        pane.setSize(pane.getWidth(), 160);
        panelVenta_panelDatosVentaCredito.setVisible(false);
        panelVenta_checkBoxEnvargado.setVisible(false);
        panelVenta_checkBoxPendiente.setVisible(false);
        panelVenta_textFieldQuickCliente.setVisible(true);
        panelVentas_toggle_guardarCliente.setVisible(true);
        setNumeroFactura();
    }//GEN-LAST:event_panelVenta_radioContadoActionPerformed


    private void panelVenta_botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVenta_botonClientesActionPerformed
        eventoBotonClienteDistribuidor();
    }//GEN-LAST:event_panelVenta_botonClientesActionPerformed

    private void panelVenta_botonGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVenta_botonGuardarFacturaActionPerformed
        if (Evento_procesosRealizarFactura(panelVenta_textFieldCodigo.getText())) {
            Logica.gestiosDineroCaja.agregarMontos(
                    panelVenta_radioCredito.isSelected()
                ? panelVentaPanelDatosVentaCredito_textFieldInicial.getText()
                : (!panelVenta_botonFactuarConComprobante.isSelected() && !panelVentas_toggle_guardarCliente.isSelected())
                        ? PonerValorProductoFacturaConComprobanteFiscal() + ""
                        : panelBaseCompraVenta_textFieldTotal.getText(),
                    true,
                    panelBaseCompraVenta_textFieldFecha.getText());
            reestablecerElementosSuperioresVentana();
            reestablecerElementos();
            panelVenta_textFieldSumatoriaDeCostos.setText("0");
            Logica.Cuadros_Emergentes.completado();
        }
    }//GEN-LAST:event_panelVenta_botonGuardarFacturaActionPerformed

    private void paneVenta_botonEliminarFilaSeleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paneVenta_botonEliminarFilaSeleccionadaActionPerformed
        panelVenta_textFieldSumatoriaDeCostos.setText(Integer.toString(
                Integer.parseInt(panelVenta_textFieldSumatoriaDeCostos.getText())
                - (costosTMP.get(tabla.getSelectedRow()))
                * cantidadTMP.get(tabla.getSelectedRow()))
        );
        costosTMP.remove(tabla.getSelectedRow());
        cantidadTMP.remove(tabla.getSelectedRow());
        Herencia_metodoEventoBotonEliminar();
        panelVentaPanelDatosVentaCredito_textFieldMonto.setText(
                Integer.toString(
                        Integer.parseInt(
                                panelBaseCompraVenta_textFieldTotal.getText())));

        PonerValorProductoFacturaConComprobanteFiscal();
    }//GEN-LAST:event_paneVenta_botonEliminarFilaSeleccionadaActionPerformed

    private void panelVenta_textFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVenta_textFieldCantidadActionPerformed
        //Verificar que la cantidad de productos que se vayan a facturar no sea mayor a la cantidad de producto que hay en almacen
        if (Integer.parseInt(panelVenta_textFieldCantidad.getText())
                <= Integer.parseInt(panelBaseCompraVenta_textFieldEnAlmacen.getText())) {
            procesoRegistrarProductoEnTabla();
        } else {
            Logica.Cuadros_Emergentes.alerta("La cantidad que intenta facturar es mayor a la cantidad que hay en el almacen.");
        }
    }//GEN-LAST:event_panelVenta_textFieldCantidadActionPerformed

    private void panelVenta_textFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVenta_textFieldPrecioActionPerformed
        Herencia_metodoEventoCampoPrecioCosto();
        if (panelVenta_radioCredito.isSelected()) {
            procesoRegistrarProductoEnTabla();
        }
    }//GEN-LAST:event_panelVenta_textFieldPrecioActionPerformed

    private void panelBaseCompraVenta_botonGuardarImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBaseCompraVenta_botonGuardarImprimirActionPerformed
        //Almacenar el id de la factura que se va a imprimir
        String idFactura = panelVenta_textFieldCodigo.getText();
        //Proceso de agregar la factura a la base de datos
        Evento_procesosRealizarFactura(idFactura);
        //Verificar si la factura es a credito o al contado para imprimir el correcto
        String clienteNoGuardado = panelVenta_textFieldQuickCliente
                .getText();
        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
        parametros.put("idFactura", idFactura);
        parametros.put("NCF", "NCF: B0" + NCF);
        parametros.put("clienteNoGuardado", clienteNoGuardado.equals("CLIENTE")
                ? "" : clienteNoGuardado);
        Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                parametros,
                panelVenta_radioContado
                        .isSelected() ? "Facturacion\\FacturaVenta" : "Financiera\\FacturaVentaCredito",
                false);
        Logica.gestiosDineroCaja.agregarMontos(
                panelBaseCompraVenta_textFieldTotal.getText(),
                true,
                panelBaseCompraVenta_textFieldFecha.getText());
        reestablecerElementosSuperioresVentana();
        reestablecerElementos();
        panelVenta_textFieldSumatoriaDeCostos.setText("0");
        Logica.Cuadros_Emergentes.completado();
    }//GEN-LAST:event_panelBaseCompraVenta_botonGuardarImprimirActionPerformed

    private void panelBaseCompraVenta_botonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelBaseCompraVenta_botonHistorialActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[8].setVisible(true);
        Diseño.Facturacion.paneles_historiales.panel_historialVentas
                .llenarTablaTodosDatos();
    }//GEN-LAST:event_panelBaseCompraVenta_botonHistorialActionPerformed

    private void panelVenta_textFieldCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVenta_textFieldCodigoProductoActionPerformed
        //ESTAS LINEAS SE ELIMINARAN EN PROXIMAS ACTUALIZACIONES Y OPTIMIZACIONES
        panelVenta_textFieldPrecio.setEnabled(false);
        panelVenta_textFieldCantidad.setEnabled(false);
        panelVenta_textFieldPrecio.setText("0");
        panelBaseCompraVenta_textFieldCosto.setText("0");
        panelBaseCompraVenta_textFieldEnAlmacen.setText("0");
        panelVenta_textFieldCantidad.setText("0");
        String codigo = Logica.CamposTexto.Campo_extraerCodigo.getCode(
                panelVenta_textFieldCodigoProducto);
        java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select
                .productoPorCodigo(codigo);
        try {
            rs.next();
            rs.getString("idProducto");
            datosAlmacenProducto(codigo);
            panelVenta_textFieldPrecio.setText(rs.getString("precioUnidadProducto"));
            panelVenta_textFieldPrecio.requestFocus();
            panelVenta_textFieldPrecio.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
            panelVenta_textFieldPrecio.setEnabled(true);
            if ((Integer.parseInt(panelBaseCompraVenta_textFieldEnAlmacen.getText())) < 1) {
                panelVenta_textFieldPrecio.setEnabled(false);
                Logica.Cuadros_Emergentes.alerta(
                        "este producto no se puede facturar porque su cantidad en el almacen es 0.");
            }
            rs.close();
            //Si es una factura a credito se pone la cantidad del producto aregistrar automaticamente a 1.
            if (panelVenta_radioCredito.isSelected()) {
                panelVenta_textFieldCantidad.setText("1");
            }
        } catch (java.sql.SQLException ex) {
            if ((Logica.Cuadros_Emergentes
                    .confirmacionProductoClienteDistribuidorNoEncontrado(codigo)) == 0) {
                Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.panelModificar.setVisible(false);
                Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.panelNuevo.setVisible(true);
                Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo
                        .reestablecerElementos();
                Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.panelNuevoArticulo_textFieldCodigo.setText(
                        panelVenta_textFieldCodigoProducto.getText()
                                .toUpperCase());
                Diseño.Facturacion.Paneles_nuevo.panel_nuevoArticulo.tipoDeCreacion = 2;
                Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[1]
                        .setVisible(false);
                Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[3]
                        .setVisible(true);
            }
        }
    }//GEN-LAST:event_panelVenta_textFieldCodigoProductoActionPerformed

    private void panelVentas_toggle_guardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVentas_toggle_guardarClienteActionPerformed
        Logica.FileBufferWritter.writeFile(
                "botonGuardarClienteEnVenta.txt",
                Boolean.toString(panelVentas_toggle_guardarCliente.isSelected()));
        panelVenta_textFieldCliente.setText("0 . GENERICO**");
        if (panelVentas_toggle_guardarCliente.isSelected()) {
            panelVentas_toggle_guardarCliente.setText("No Guardar Cliente");
            panelVenta_textFieldQuickCliente.setVisible(true);
            panelVenta_textFieldCliente.setVisible(false);
            label_totalConImpuestos.setVisible(false);
            panelVenta_botonFactuarConComprobante.setVisible(false);
            panelVenta_botonFactuarConComprobante.setSelected(false);
            panelVenta_botonFactuarConComprobante.setText("FACTURA CON COMPROBANTE FISCAL");
            panelVenta_botonFactuarConComprobante.setBackground(new java.awt.Color(255, 153, 153));

        } else {
            panelVentas_toggle_guardarCliente.setText("Guardar Cliente");
            panelVenta_textFieldQuickCliente.setVisible(false);
            panelVenta_textFieldCliente.setVisible(true);
            panelVenta_botonFactuarConComprobante.setVisible(true);
            panelVenta_botonFactuarConComprobante.setSelected(true);
            panelVenta_botonFactuarConComprobante.setText("FACTURA SIN COMPROBANTE FISCAL");
            panelVenta_botonFactuarConComprobante.setBackground(new java.awt.Color(204, 204, 204));
            panelVenta_textFieldQuickCliente.setText("CLIENTE");
        }
    }//GEN-LAST:event_panelVentas_toggle_guardarClienteActionPerformed

    private void panelVenta_botonFactuarConComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVenta_botonFactuarConComprobanteActionPerformed
        if (panelVenta_botonFactuarConComprobante.isSelected()) {
            label_totalConImpuestos.setVisible(false);
            panelVenta_botonFactuarConComprobante.setText("FACTURA SIN COMPROBANTE FISCAL");
            panelVenta_botonFactuarConComprobante.setBackground(new java.awt.Color(204, 204, 204));
        } else {
            PonerValorProductoFacturaConComprobanteFiscal();
            label_totalConImpuestos.setVisible(true);
            panelVenta_botonFactuarConComprobante.setText("FACTURA CON COMPROBANTE FISCAL");
            panelVenta_botonFactuarConComprobante.setBackground(new java.awt.Color(255, 153, 153));
        }
    }//GEN-LAST:event_panelVenta_botonFactuarConComprobanteActionPerformed

    private void panelVentaPanelDatosVentaCredito_ButtonReestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVentaPanelDatosVentaCredito_ButtonReestablecerActionPerformed
        if (Logica.Cuadros_Emergentes.confirmacion() == 0) {
            limpiarDatosFacturaVentaCredito(false);
            int total = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                total += (Integer) herencia_model.getValueAt(i, 4);
            }
            panelBaseCompraVenta_textFieldTotal.setText(Integer.toString(total));
            panelVentaPanelDatosVentaCredito_textFieldMonto.setText(Integer.toString(total));
        }
    }//GEN-LAST:event_panelVentaPanelDatosVentaCredito_ButtonReestablecerActionPerformed

    private void panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotasKeyReleased
        if (panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.getText().length() > 0) {
            panelVentaPanelDatosVentaCredito_textFieldCuotas.setText(Integer.toString(Integer.parseInt(panelVentaPanelDatosVentaCredito_textFieldMonto.getText()) / Integer.parseInt(panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.getText())));

            panelVentaPanelDatosVentaCredito_textFieldGananciaPagos.setText(
                    Integer.toString((Integer.parseInt(panelBaseCompraVenta_textFieldTotal.getText())
                            - Integer.parseInt(panelVenta_textFieldSumatoriaDeCostos.getText()))
                            / Integer.parseInt(panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.getText())));
            //Cambiar el color de fondo a verde para que el usuario vea que su cambio surgio efecto.
            panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.setBackground(new Color(153, 255, 153));
            panelVentaPanelDatosVentaCredito_textFieldGananciaPagos.setBackground(new Color(153, 255, 153));
            panelVentaPanelDatosVentaCredito_textFieldCuotas.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotasKeyReleased

    private void panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotasActionPerformed
        panelVentaPanelDatosVentaCredito_textFieldCuotas.requestFocus();
    }//GEN-LAST:event_panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotasActionPerformed

    private void panelVentaPanelDatosVentaCredito_textFieldPorcientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelVentaPanelDatosVentaCredito_textFieldPorcientoKeyReleased
        if (panelVentaPanelDatosVentaCredito_textFieldPorciento.getText().length() > 0) {
            //Proceso de calcular el porciento.
            int porciento = (Integer.parseInt(totalTmp)
                    * Integer.parseInt(panelVentaPanelDatosVentaCredito_textFieldPorciento.getText())) / 100;
            //Le sumo al campo 'monto' la multiplicacion del porciento entre 100.
            panelVentaPanelDatosVentaCredito_textFieldMonto.setText(Integer.toString(
                    Integer.parseInt(totalTmp) + porciento));
            //Cambiar el color de fondo a verde para que el usuario vea que su cambio surgio efecto.
            panelVentaPanelDatosVentaCredito_textFieldPorciento.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_panelVentaPanelDatosVentaCredito_textFieldPorcientoKeyReleased

    //Evento para el campo 'Porciento', busca el porciento en el campo 'monto' y se lo asigna al campo 'monto'.
    private void panelVentaPanelDatosVentaCredito_textFieldPorcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVentaPanelDatosVentaCredito_textFieldPorcientoActionPerformed
        aplicarPorcientoDefinitivo();
        enterPrecionado = true;
    }//GEN-LAST:event_panelVentaPanelDatosVentaCredito_textFieldPorcientoActionPerformed

    private void panelVentaPanelDatosVentaCredito_textFieldPorcientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelVentaPanelDatosVentaCredito_textFieldPorcientoFocusLost
        if (!enterPrecionado) {
            aplicarPorcientoDefinitivo();
        } else {
            enterPrecionado = false;
        }
    }//GEN-LAST:event_panelVentaPanelDatosVentaCredito_textFieldPorcientoFocusLost

    private void panelVentaPanelDatosVentaCredito_textFieldInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelVentaPanelDatosVentaCredito_textFieldInicialKeyReleased
        if (panelVentaPanelDatosVentaCredito_textFieldInicial.getText().length() > 0) {
            if (Integer.parseInt(panelVentaPanelDatosVentaCredito_textFieldInicial.getText())
                    < Integer.parseInt(panelBaseCompraVenta_textFieldTotal.getText())) {
                //Casteo de los campos de texto a int luego a string nuevamente para ponerse el resultado en 'monto'.
                panelVentaPanelDatosVentaCredito_textFieldMonto.setText(
                        Integer.toString(Integer.parseInt(panelBaseCompraVenta_textFieldTotal.getText())
                                - Integer.parseInt(panelVentaPanelDatosVentaCredito_textFieldInicial.getText())));
                totalTmp = panelVentaPanelDatosVentaCredito_textFieldMonto.getText();
                //Cambiar el color de fondo a verde para que el usuario vea que su cambio surgio efecto.
                panelVentaPanelDatosVentaCredito_textFieldInicial.setBackground(new Color(153, 255, 153));
            } else {
                Logica.Cuadros_Emergentes.alerta("El inicial no puede ser mayor o igual al Monto a pagar");
                panelVentaPanelDatosVentaCredito_textFieldInicial.setText(Integer.toString(
                        Integer.parseInt(panelBaseCompraVenta_textFieldTotal.getText()) - 1));
            }
        }
    }//GEN-LAST:event_panelVentaPanelDatosVentaCredito_textFieldInicialKeyReleased

    private void panelVentaPanelDatosVentaCredito_textFieldInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVentaPanelDatosVentaCredito_textFieldInicialActionPerformed
        panelVentaPanelDatosVentaCredito_textFieldPorciento.requestFocus();
    }//GEN-LAST:event_panelVentaPanelDatosVentaCredito_textFieldInicialActionPerformed

    private void panelVentaPanelDatosVentaCredito_textFieldMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVentaPanelDatosVentaCredito_textFieldMontoActionPerformed
        cambiarColoresTextFieldsYVariablesPorDefecto();
        panelVentaPanelDatosVentaCredito_textFieldInicial.requestFocus();
    }//GEN-LAST:event_panelVentaPanelDatosVentaCredito_textFieldMontoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_totalConImpuestos;
    protected javax.swing.JButton paneVenta_botonEliminarFilaSeleccionada;
    protected javax.swing.JButton panelBaseCompraVenta_botonGuardarImprimir;
    protected javax.swing.JButton panelBaseCompraVenta_botonHistorial;
    private javax.swing.JButton panelVentaPanelDatosVentaCredito_ButtonReestablecer;
    protected javax.swing.JLabel panelVentaPanelDatosVentaCredito_labelCuotas;
    protected javax.swing.JLabel panelVentaPanelDatosVentaCredito_labelGananciaPagos;
    protected javax.swing.JLabel panelVentaPanelDatosVentaCredito_labelInicial;
    protected javax.swing.JLabel panelVentaPanelDatosVentaCredito_labelMonto;
    protected javax.swing.JLabel panelVentaPanelDatosVentaCredito_labelNumeroCuotas;
    protected javax.swing.JLabel panelVentaPanelDatosVentaCredito_labelPorciento;
    public static javax.swing.JTextField panelVentaPanelDatosVentaCredito_textFieldCuotas;
    public static javax.swing.JTextField panelVentaPanelDatosVentaCredito_textFieldGananciaPagos;
    public static javax.swing.JTextField panelVentaPanelDatosVentaCredito_textFieldInicial;
    public static javax.swing.JTextField panelVentaPanelDatosVentaCredito_textFieldMonto;
    public static javax.swing.JTextField panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas;
    public static javax.swing.JTextField panelVentaPanelDatosVentaCredito_textFieldPorciento;
    private javax.swing.JButton panelVenta_botonClientes;
    private javax.swing.JToggleButton panelVenta_botonFactuarConComprobante;
    protected javax.swing.JButton panelVenta_botonGuardarFactura;
    private javax.swing.JCheckBox panelVenta_checkBoxEnvargado;
    public static javax.swing.JCheckBox panelVenta_checkBoxPendiente;
    private javax.swing.ButtonGroup panelVenta_groupTipo;
    private javax.swing.JPanel panelVenta_panelDatosVentaCredito;
    private javax.swing.JPanel panelVenta_panelTipoVenta;
    public static javax.swing.JRadioButton panelVenta_radioContado;
    private static javax.swing.JRadioButton panelVenta_radioCredito;
    protected javax.swing.JTextField panelVenta_textFieldCantidad;
    public static javax.swing.JTextField panelVenta_textFieldCliente;
    private static javax.swing.JTextField panelVenta_textFieldCodigo;
    public static javax.swing.JTextField panelVenta_textFieldCodigoProducto;
    protected javax.swing.JTextField panelVenta_textFieldPrecio;
    public static javax.swing.JTextField panelVenta_textFieldQuickCliente;
    public static javax.swing.JTextField panelVenta_textFieldSumatoriaDeCostos;
    private javax.swing.JToggleButton panelVentas_toggle_guardarCliente;
    // End of variables declaration//GEN-END:variables

    private void detallesComponentes() {
        paneVenta_botonEliminarFilaSeleccionada.setVisible(false);

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
        String header[] = {"Codigo", "Descripcion", "Precio Unidad", "Cantidad", "Total"};
        for (String element : header) {
            model.addColumn(element);
        }

        //TAMAÑO celdas de tabla
        int[] tamaño = {184, 355, 145, 90, 90};
        Logica.tablas.Tabla_tamañoCeldas.setTablaColumnasTamaño(tamaño, tabla);
    }

    private void modificarComponentesPanelPadre() {
        panelVenta_panelDatosVentaCredito.setVisible(false);
        panelVenta_checkBoxEnvargado.setVisible(false);
        panelVenta_checkBoxPendiente.setVisible(false);
        panelVenta_botonFactuarConComprobante.setVisible(false);
        label_totalConImpuestos.setVisible(false);

        panelVentas_toggle_guardarCliente.setSelected(
                Boolean.parseBoolean(Logica.FileBufferWritter.readFile(
                        "botonGuardarClienteEnVenta.txt")));

        //SOMBREAR campos de texto
        panelVentaPanelDatosVentaCredito_textFieldMonto.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelVentaPanelDatosVentaCredito_textFieldInicial.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelVentaPanelDatosVentaCredito_textFieldCuotas.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelVentaPanelDatosVentaCredito_textFieldPorciento.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());
        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.addFocusListener(new Logica.CamposTexto.Campo_seleccionarTodoTexto());

        //AutoCompletar textfield
        autoCompleterCampoBuscadorArticulo(panelVenta_textFieldCodigoProducto, "campo_ventas_articulo");
        autoCompleterCampoClienteDistribuidor(panelVenta_textFieldCliente, true, "campo_ventas_cliente");

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelVenta_textFieldCodigoProducto, 56);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelVentaPanelDatosVentaCredito_textFieldMonto, 4);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelVentaPanelDatosVentaCredito_textFieldInicial, 4);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas, 1);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelVentaPanelDatosVentaCredito_textFieldPorciento, 2);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelVentaPanelDatosVentaCredito_textFieldGananciaPagos, 3);

        //TIPO campo de texto
        Campo_tipoNumero.campoTextoTipoNumero(panelVentaPanelDatosVentaCredito_textFieldMonto);
        Campo_tipoNumero.campoTextoTipoNumero(panelVentaPanelDatosVentaCredito_textFieldInicial);
        Campo_tipoNumero.campoTextoTipoNumero(panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas);
        Campo_tipoNumero.campoTextoTipoNumero(panelVentaPanelDatosVentaCredito_textFieldPorciento);
        Campo_tipoNumero.campoTextoTipoNumero(panelVentaPanelDatosVentaCredito_textFieldGananciaPagos);

        //LABELS
        panelBaseCompraVenta_labelVentaCompra.setText(panelBaseCompraVenta_labelVentaCompra.getText() + "VENTA");

        panelVenta_botonFactuarConComprobante.setSelected(true);
        panelVenta_botonFactuarConComprobante.setText("FACTURA SIN COMPROBANTE FISCAL");
        panelVenta_botonFactuarConComprobante.setBackground(new java.awt.Color(204, 204, 204));
        setNumeroFactura();
    }

    //**************************************************************//
    //************************ Metodos ****************************//
    //*************************************************************//
    //Este metodo es para el proceso de pasar el dato a la tabla, por motivos de
    //que es una version de credito este proceso puede variar en varios casos:
    private void procesoRegistrarProductoEnTabla() {
        int[] costoYCantidadProducto = Herencia_metodoEventoCampoCantidad();
        //Obtiene el costo de el producto agregado
        panelVenta_textFieldSumatoriaDeCostos.setText(Integer.toString(
                Integer.parseInt(panelVenta_textFieldSumatoriaDeCostos.getText())
                + (costoYCantidadProducto[0] * costoYCantidadProducto[1])
        ));

        PonerValorProductoFacturaConComprobanteFiscal();

        //Almacena el costo en un ArrayList por si hay que eliminarlo luego.
        costosTMP.add(costoYCantidadProducto[0]);
        cantidadTMP.add(costoYCantidadProducto[1]);
        panelVentaPanelDatosVentaCredito_textFieldMonto.setText(
                Integer.toString(
                        Integer.parseInt(
                                panelBaseCompraVenta_textFieldTotal.getText())));
    }

    //Este metodo es para el campo 'panelVentaPanelDatosVentaCredito_textFieldPorciento'
    //Cree este metodo para poder hacer el mismo procedimiento si se le da a
    //ENTER o si el campo pierde el FOCO.
    private void aplicarPorcientoDefinitivo() {
        totalTmp = panelBaseCompraVenta_textFieldTotal.getText();
        //Le sumo al campo 'TOTAL' la multiplicacion del porciento entre 100.
        int porciento = ((Integer.parseInt(totalTmp) - Integer.parseInt(panelVentaPanelDatosVentaCredito_textFieldInicial.getText()))
                * Integer.parseInt(panelVentaPanelDatosVentaCredito_textFieldPorciento.getText())) / 100;
        panelBaseCompraVenta_textFieldTotal.setText(Integer.toString(
                Integer.parseInt(panelBaseCompraVenta_textFieldTotal.getText()) + porciento));
        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.requestFocus();
    }

    //Coloca el numero de la factura buscando el id de de ultima factura y mostrarlo.
    public static void setNumeroFactura() {
        panelVenta_textFieldCodigo.setText(Integer.toString(DataBase.Facturacion.FacturaVenta.Venta.Select.ultimoId() + 1));
    }

    //Coloca el numero de la factura buscando el id de de ultima factura a credito y mostrarlo.
    public static void setNumeroFacturaCredito() {
        panelVenta_textFieldCodigo.setText(Integer.toString(DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.ultimoId() + 1));
    }

    //Evento para el campo de 'cliente' lo pongo en este metodo porque aparte del evento en si tambien utilizare esto mismo en otra clase.
    @SuppressWarnings({"ResultOfMethodCallIgnored", "StringEquality"})
    public boolean Evento_campoCliente() {
        String cedula = Logica.CamposTexto.Campo_extraerCodigo.getCode(panelVenta_textFieldCliente);
        java.sql.ResultSet rs = DataBase.Facturacion.Clientes.Select.clienteCedula(cedula);
        if (Logica.String.String_verificarStringNumero.ValidarString(cedula)) {
            try {
                rs.next();
                rs.getString("idCliente");
                //Verificar que el id del distribuidor no sea generico en caso de ser una factura de venta a credito
                if (panelVenta_radioCredito.isSelected() && rs.getInt("idCliente") == 1) {
                    Logica.Cuadros_Emergentes.alerta("No se puede realizar la factura a credito con cliente\n"
                            + "'GENERIRO', debe ingresar un cliente distinto.");
                    return false;
                }
                //Si la factura que se hara es a credito se verifica si el usuario tiene facturas pendientes.
                panelVenta_checkBoxPendiente.setSelected(panelVenta_radioCredito.isSelected()
                        ? (DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.clienteConFacturaVentaCredito(cedula)
                        ? true
                        : false)
                        : false);
                rs.close();
                return true;
            } catch (java.sql.SQLException ex) {
                IngresarCliente(cedula, true);
            }
        } else {
            IngresarCliente(cedula, false);
        }
        return false;
    }

    //En caso de que el cliente introducido en panelVenta_textFieldCliente no exista se hace este proceso para ingresarlo a la base de datos.
    private static void IngresarCliente(String cedula, boolean campoValidado) {
        if ((Logica.Cuadros_Emergentes.confirmacionProductoClienteDistribuidorNoEncontrado(cedula)) == 0) {
            Diseño.Facturacion.Paneles_nuevo.panel_nuevoCliente.eventoArticuloClienteDistribuidor(false);
            //Verifico si el texto introducido en el campo de el cliente es solo numero o no para saber si colocar el contenido en codigo o nombre
            if (campoValidado) {
                Diseño.Facturacion.Paneles_nuevo.panel_nuevoCliente.panelNuevoCliente_textFieldCedula.setText(cedula);
            } else {
                Diseño.Facturacion.Paneles_nuevo.panel_nuevoCliente.panelNuevoCliente_textFieldNombre.setText(cedula.toUpperCase());
            }
            Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[1].setVisible(false);
            Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[6].setVisible(true);
            Diseño.Facturacion.paneles_base.panelBase_inventarioClientesDistribuidores.reestablecerComponentes();
        }
    }

    //Limpia la ventana de datos de la factura a credito.
    private void limpiarDatosFacturaVentaCredito(boolean limpiarCheckBox) {
        panelVenta_checkBoxPendiente.setSelected(!limpiarCheckBox);
        panelVentaPanelDatosVentaCredito_textFieldGananciaPagos.setText("0");
        panelVentaPanelDatosVentaCredito_textFieldMonto.setText("0");
        panelVentaPanelDatosVentaCredito_textFieldInicial.setText("0");
        panelVentaPanelDatosVentaCredito_textFieldPorciento.setText("0");
        panelVentaPanelDatosVentaCredito_textFieldCuotas.setText("0");
        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.setText("0");
        enterPrecionado = false;
        cambiarColoresTextFieldsYVariablesPorDefecto();
    }

    //Reestablece los colores de los campos de texto y las variables en factura
    //de venta a credito, lo tengo asi en ves de tenerlo todo en el metodo
    //'limpiarDatosFacturaVentaCredito()' poque necesitara hacer esto mismo en
    //otro lado pero no quiero que los campos se limpien.
    private void cambiarColoresTextFieldsYVariablesPorDefecto() {
        //Pone los colores de los campos de texto a los de fabrica:
        panelVentaPanelDatosVentaCredito_textFieldGananciaPagos.setBackground(new Color(204, 204, 255));
        panelVentaPanelDatosVentaCredito_textFieldInicial.setBackground(new Color(204, 204, 255));
        panelVentaPanelDatosVentaCredito_textFieldCuotas.setBackground(new Color(204, 204, 255));
        panelVentaPanelDatosVentaCredito_textFieldPorciento.setBackground(new Color(204, 204, 255));
        panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.setBackground(new Color(204, 204, 255));
    }

    private boolean clienteComprobantezFiscal() {
        if (!panelVenta_botonFactuarConComprobante.isSelected()) {
            String cedula = Logica.CamposTexto.Campo_extraerCodigo.getCode(panelVenta_textFieldCliente);
            java.sql.ResultSet rs = DataBase.Facturacion.Clientes.Select.clienteCedula(cedula);
            if (Logica.String.String_verificarStringNumero.ValidarString(cedula)) {
                try {
                    rs.next();
                    String _tlfno = rs.getString("telefonoCliente") == null ? "" : (rs.getString("telefonoCliente")).replaceAll("\\D+", "");
                    String _dirc = rs.getString("direccionCliente") == null ? "" : rs.getString("direccionCliente");
                    String _rnc = rs.getString("RNC") == null ? "" : rs.getString("RNC");
                    rs.close();
                    if ((_tlfno.trim()).length() > 0
                            && (_dirc.trim()).length() > 0
                            && (_rnc.trim()).length() > 0) {
                        return true;
                    } else {
                        Logica.Cuadros_Emergentes.alerta("Al usuario le falta: " + (_tlfno.length() <= 0 ? "\n-TELEFONO " : "")
                                + (_dirc.length() <= 0 ? "\n-DIRECCION" : "")
                                + (_rnc.length() <= 0 ? "\n-RNC" : ""));
                        Logica.herramientas.procesoDeHistorial();
                        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[6].setVisible(true);
                        ((panel_clientes) Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[6])
                                .BuscarClienteDesdeFuera(cedula);
                    }
                } catch (SQLException e) {
                    return false;
                }
            }
        }
        return false;
    }

    //**************************************************************//
    //************************* Eventos ****************************//
    //**************************************************************//
    private boolean Evento_procesosRealizarFactura(String idFactura) {
        //Si correcto es true al finalizar el proceso de factura, mostrará y 
        //limpiará los campos.
        boolean correcto = false;
        if (Herencia_metodoEventoBotonGuardar(
                panelVenta_radioCredito.isSelected()
                ? panelVentaPanelDatosVentaCredito_textFieldInicial.getText()
                : (!panelVenta_botonFactuarConComprobante.isSelected() && !panelVentas_toggle_guardarCliente.isSelected())
                        ? PonerValorProductoFacturaConComprobanteFiscal() + ""
                        : panelBaseCompraVenta_textFieldTotal.getText()
        )) {
            //Este metodo es por si el usuario pone un cliente pero no le da a
            //'enter' para validar al cliente asi que se valida antes de crear la
            //factura, verifica si esta bien escrito y si el cliente existe.
            if (Evento_campoCliente()) {
                //  SI SE A SELECCIONADO UNA FACTURA CON COMPROBANTE FISCAL, SE
                //  SE DEVE VALIDAR QUE EL CLINTE QUE A TENGA DIRECCION, TELEFONO Y RNC
                if (clienteComprobantezFiscal()) {
                    if (panelVenta_radioContado.isSelected()) {
                        //Se pasan los datos a la tabla de "facturaVenta"
                        //************************************************
                        if (DataBase.Facturacion.FacturaVenta.Venta.Insert.facturaVenta(new String[]{
                            Logica.CamposTexto.Campo_extraerCodigo.getCode(
                            panelVenta_textFieldCliente),
                            panelBaseCompraVenta_textFieldFecha.getText(),
                            panelBaseCompraVenta_textFieldTotal.getText(),
                            panelVenta_textFieldSumatoriaDeCostos.getText()
                        })) {
                            //Verifico si la factura es con un cliente sin guardar
                            if (panelVentas_toggle_guardarCliente.isSelected()
                                    && !(panelVenta_textFieldQuickCliente.getText()
                                            .equals("CLIENTE"))) {
                                DataBase.Facturacion.QuickClient.Insert.QuickClient(
                                        Integer.toString(
                                                DataBase.Facturacion.FacturaVenta.Venta.Select
                                                        .ultimoId()),
                                        panelVenta_textFieldQuickCliente.getText());

                            }
                            //Se pasan los datos a la tabla de "detalleVenta"
                            //************************************************
                            for (int i = 0; i < herencia_model.getRowCount(); i++) {
                                DataBase.Facturacion.FacturaVenta.Detalle.Insert.detalleVenta(
                                        new String[]{
                                            (String) herencia_model.getValueAt(i, 0),
                                            (String) herencia_model.getValueAt(i, 3),
                                            Integer.toString(costosTMP.get(i)),
                                            (String) herencia_model.getValueAt(i, 2)
                                        });
                            }
                            setNumeroFactura();
                            correcto = true;
                        }
                    } else {
                        //Se pasan los datos a la tabla de "facturaVentaCredito"
                        //************************************************
                        if (DataBase.Financiera.FacturaVentaCredito.VentaCredito.Insert.facturaVentaCredito(new String[]{
                            Logica.CamposTexto.Campo_extraerCodigo.getCode(panelVenta_textFieldCliente),
                            panelBaseCompraVenta_textFieldFecha.getText(),
                            panelBaseCompraVenta_textFieldTotal.getText(),
                            panelVentaPanelDatosVentaCredito_textFieldInicial.getText(),
                            panelVentaPanelDatosVentaCredito_textFieldCuotas.getText(),
                            panelVentaPanelDatosVentaCredito_textFieldNumeroDeCuotas.getText(),
                            panelVentaPanelDatosVentaCredito_textFieldGananciaPagos.getText()
                        })) {
                            //Se pasan los datos a la tabla de "detalleVentaCredito"
                            //************************************************
                            for (int i = 0; i < herencia_model.getRowCount(); i++) {
                                DataBase.Financiera.FacturaVentaCredito.Detalle.Insert.detalleVentaCredito(new String[]{
                                    panelVenta_textFieldCodigo.getText(),
                                    (String) herencia_model.getValueAt(i, 0),
                                    Integer.toString(costosTMP.get(i))
                                });
                            }
                            //Se aumenta el costo de las facturas activas en la calle
                            DataBase.Financiera.DatosFinanciera.Update.CambiarCostoFacturasActivas(
                                    Integer.parseInt(panelVenta_textFieldSumatoriaDeCostos
                                            .getText())
                                    - Integer.parseInt(panelVentaPanelDatosVentaCredito_textFieldInicial
                                            .getText()),
                                    true);
                            //Actualizar y limpiar la tabla de 'Clientes con facturas de ventas activas'
                            Diseño.Financiera.paneles_pantallaPrincipal.panel_ClientesPendientes
                                    .actualizarLabelsTotalTacturasActivasYCostos();
                            setNumeroFacturaCredito();
                            correcto = true;
                        }
                    }
                }
            }
        }

        if (correcto && !panelVenta_botonFactuarConComprobante.isSelected() && !panelVentas_toggle_guardarCliente.isSelected()) {
            //Buscar el NCF para asignarselo a esa factura
            try (java.sql.ResultSet rs = DataBase.Facturacion.ncfnos.Select.NcsNOs()) {
                rs.next();
                NCF = rs.getString("ncfActual");
                DataBase.Facturacion.FacturasImpuestos.Insert.FacturaImpuestos(new Object[]{idFactura, NCF}, panelVenta_radioContado.isSelected());
                DataBase.Facturacion.ncfnos.Update.NcfNOs(Integer.toString((Integer.parseInt(NCF) + 1)));
            } catch (java.sql.SQLException e) {
                System.err.println(e);
            }
        }

        return correcto;
    }

    /**
     * SI LA FACTURA ES CON COMPROBANTE FISCAL, SE LE PONE AL LABEL QUE MUESTRA
     * EL TOTAL EL TOTAL LA SUMATORIA CON EL 18% DEL IMPUESTO.
     */
    private int PonerValorProductoFacturaConComprobanteFiscal() {
        int totalMasImpuesto = (int) Math.round(Integer.parseInt(panelBaseCompraVenta_textFieldTotal.getText()) + (Integer.parseInt(panelBaseCompraVenta_textFieldTotal.getText()) * 0.18));
        label_totalConImpuestos.setText("+ 18% => " + totalMasImpuesto);
        return totalMasImpuesto;
    }

    //**************************************************************//
    //********************** -@Overrides- *************************//
    //*************************************************************//
    //Sobreescribe el metodo que es llamado por evento del boton Clientes/Distribuidores.
    @Override
    protected void eventoBotonClienteDistribuidor() {
        Logica.herramientas.procesoDeHistorial();
        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[6].setVisible(true);
    }

    //Agrega al metodo de la clase padre que limpia toda la ventana que tambien
    //reestablezca el radio button propio de esta clase hija a su boton original.
    @Override
    protected void reestablecerElementos() {
        super.reestablecerElementos();
        panelVentas_toggle_guardarCliente.setSelected(true);
        panelVenta_textFieldSumatoriaDeCostos.setText("0");
        costosTMP.clear();
        panelVenta_botonFactuarConComprobante.setVisible(false);
        panelVenta_botonFactuarConComprobante.setSelected(true);
        panelVenta_botonFactuarConComprobante.setText("FACTURA SIN COMPROBANTE FISCAL");
        panelVenta_botonFactuarConComprobante.setBackground(new java.awt.Color(204, 204, 204));
        label_totalConImpuestos.setVisible(false);
        PonerValorProductoFacturaConComprobanteFiscal();
        limpiarDatosFacturaVentaCredito(true);
    }
}

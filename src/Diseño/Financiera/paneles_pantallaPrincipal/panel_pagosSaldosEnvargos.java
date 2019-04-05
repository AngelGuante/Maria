package Diseño.Financiera.paneles_pantallaPrincipal;

import Diseño.Financiera.paneles_ver.Panel_verAtrasos;
import Diseño.Facturacion.ventanas_bases.Ventana_base;
import Diseño.Financiera.paneles_ver.panel_verAbonos;
import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_mayuscula;
import Logica.CamposTexto.Campo_tipoNumero;

public class panel_pagosSaldosEnvargos extends Diseño.Facturacion.paneles_base.panelBase {

    private static javax.swing.JTable tabla;
    private static javax.swing.JScrollPane pane;
    private static javax.swing.table.DefaultTableModel model;
    public static Panel_verAtrasos panelAtrasos = new Panel_verAtrasos();
    public static panel_verAbonos panelAbonos = new panel_verAbonos();
    private static String idCliente = "";
    private static String tmpCuotasRst = "";
    private static String tmpMontoRst = "";
    private static String tmpMontoAbonado = "";
    private static int tmpGananciaCuotas = 0;
    private static int tmpTotalPagarRst;
    private static int tmpTotalGananciasRst;
    //Para el reporte de los pagos por abono
    private int abonoRestante;
    //Para limpiar la ventana segun escriba en el campo de buscar cliente
    private int numeroDeCaracteresAntes = 0;

    public panel_pagosSaldosEnvargos() {
        initComponents();
        detallesComponentes();
        jButton1.setEnabled(Logica.CredencialesDeUsuario.getPrivilegio() == 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorID = new javax.swing.JTextField();
        panelPagosSaldosEnvargos_verFacturas = new javax.swing.JButton();
        panelPagosSaldosEnvargos_tabbdPanel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        panelPagos_textFieldCodigoFactura = new javax.swing.JTextField();
        panelPagos_texFieldValorCuotas = new javax.swing.JTextField();
        panelPagos_labelValorCuota = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelPagos_textFieldMontoAPagar = new javax.swing.JTextField();
        panelPagos_textFieldMontoRestante = new javax.swing.JTextField();
        panelPagos_texFieldCantidadCuotasRst = new javax.swing.JTextField();
        panelPagos_textFieldCuotasAPagar = new javax.swing.JTextField();
        panelPagos_labelAPagar = new javax.swing.JLabel();
        panelPagos_labelAPagar1 = new javax.swing.JLabel();
        panelPagos_labelAPagar3 = new javax.swing.JLabel();
        panelPagos_labelMontoAPagar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        panelPagos_labelAPagar4 = new javax.swing.JLabel();
        panelPagos_textFieldGanancia = new javax.swing.JTextField();
        panelPagos_botonProcesarPagos = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        panelPagos_botonPasarAbono = new javax.swing.JButton();
        panelPagos_botonProcesarAbono = new javax.swing.JButton();
        panelPagos_textFieldMontoAAbonar = new javax.swing.JTextField();
        panelPagos_textFieldMontoAbonado = new javax.swing.JTextField();
        panelPagos_checkBox_agregarAtraso = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        check_saldoAntesDeFecha = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        panelSaldos_textFieldCodigoFactura = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        panelSaldos_botonProcesarSaldo = new javax.swing.JButton();
        panelSaldos_texFieldCostoFactura = new javax.swing.JTextField();
        panelSaldos_labelMontoParaSaldar = new javax.swing.JLabel();
        panelSaldos_textFieldMontoParaSaldar = new javax.swing.JTextField();
        panelSaldos_textFieldGananciaTotalSaldo = new javax.swing.JTextField();
        panelSaldos_labelMontoParaSaldar1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        panelSaldos_checkBox_agregarAtraso = new javax.swing.JCheckBox();
        panelSaldos_texFieldCostoFacturaRestante = new javax.swing.JTextField();
        panelPagos_labelValorCuota3 = new javax.swing.JLabel();
        panelPagos_labelValorCuota1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelEnvargos_textFieldCodigoFactura = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        panelEnvargos_botonProcesarEnvargo = new javax.swing.JButton();
        panelPagos_labelValorCuota2 = new javax.swing.JLabel();
        panelEnvargos_texFieldCostoFactura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelEnvargos_textFieldCodigoProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        panelEnvargos_textFieldCostoProducto = new javax.swing.JTextField();
        panelEnvargos_textFieldPrecioProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        panelEnvargos_texFieldCostoFacturaRestante = new javax.swing.JTextField();
        panelPagos_labelValorCuota4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        panelSacarDelSistema_textFieldCodigoFactura = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        panelPagosSaldosEnvargos_botonHIstorialEnvargos = new javax.swing.JButton();
        panelPagosSaldosEnvargos_botonHistorialPagos = new javax.swing.JButton();
        panelPagosSaldosEnvargos_botonHistorialSaldos = new javax.swing.JButton();
        panelPagos_labelCliente = new javax.swing.JLabel();
        panelPagosSaldosEnvargos_botonHIstorialEnvargos1 = new javax.swing.JButton();
        panelPagosSaldosEnvargos_botonClientesAtrasados = new javax.swing.JButton();
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        setLayout(null);

        panelPagosSaldosEnvargos_textFieldBuscarReciboPorID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorID.setForeground(new java.awt.Color(51, 153, 255));
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Numero recibo:"));
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagosSaldosEnvargos_textFieldBuscarReciboPorIDActionPerformed(evt);
            }
        });
        add(panelPagosSaldosEnvargos_textFieldBuscarReciboPorID);
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorID.setBounds(320, 0, 120, 40);

        panelPagosSaldosEnvargos_verFacturas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelPagosSaldosEnvargos_verFacturas.setText("VER DETALLES DE FACTURA");
        panelPagosSaldosEnvargos_verFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagosSaldosEnvargos_verFacturasActionPerformed(evt);
            }
        });
        add(panelPagosSaldosEnvargos_verFacturas);
        panelPagosSaldosEnvargos_verFacturas.setBounds(10, 167, 250, 30);

        panelPagosSaldosEnvargos_tabbdPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setLayout(null);

        panelPagos_textFieldCodigoFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagos_textFieldCodigoFactura.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(panelPagos_textFieldCodigoFactura);
        panelPagos_textFieldCodigoFactura.setBounds(10, 11, 60, 31);

        panelPagos_texFieldValorCuotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagos_texFieldValorCuotas.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(panelPagos_texFieldValorCuotas);
        panelPagos_texFieldValorCuotas.setBounds(402, 20, 120, 31);

        panelPagos_labelValorCuota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagos_labelValorCuota.setText("Valor de cada cuota");
        jPanel2.add(panelPagos_labelValorCuota);
        panelPagos_labelValorCuota.setBounds(402, 6, 130, 15);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(10, 56, 507, 10);

        panelPagos_textFieldMontoAPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagos_textFieldMontoAPagar.setForeground(new java.awt.Color(255, 0, 0));
        panelPagos_textFieldMontoAPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelPagos_textFieldMontoAPagarKeyReleased(evt);
            }
        });
        jPanel2.add(panelPagos_textFieldMontoAPagar);
        panelPagos_textFieldMontoAPagar.setBounds(10, 122, 79, 29);

        panelPagos_textFieldMontoRestante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagos_textFieldMontoRestante.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(panelPagos_textFieldMontoRestante);
        panelPagos_textFieldMontoRestante.setBounds(150, 122, 79, 29);

        panelPagos_texFieldCantidadCuotasRst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagos_texFieldCantidadCuotasRst.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(panelPagos_texFieldCantidadCuotasRst);
        panelPagos_texFieldCantidadCuotasRst.setBounds(150, 74, 43, 29);

        panelPagos_textFieldCuotasAPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagos_textFieldCuotasAPagar.setForeground(new java.awt.Color(255, 0, 0));
        panelPagos_textFieldCuotasAPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelPagos_textFieldCuotasAPagarKeyReleased(evt);
            }
        });
        jPanel2.add(panelPagos_textFieldCuotasAPagar);
        panelPagos_textFieldCuotasAPagar.setBounds(10, 74, 43, 29);

        panelPagos_labelAPagar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagos_labelAPagar.setText("Cuotas a pagar(*)  ");
        jPanel2.add(panelPagos_labelAPagar);
        panelPagos_labelAPagar.setBounds(10, 60, 130, 15);

        panelPagos_labelAPagar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagos_labelAPagar1.setText("Cuotas restantes");
        jPanel2.add(panelPagos_labelAPagar1);
        panelPagos_labelAPagar1.setBounds(150, 60, 120, 15);

        panelPagos_labelAPagar3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagos_labelAPagar3.setText("Monto restante");
        jPanel2.add(panelPagos_labelAPagar3);
        panelPagos_labelAPagar3.setBounds(150, 108, 110, 15);

        panelPagos_labelMontoAPagar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagos_labelMontoAPagar.setText("Monto a pagar(*)  ");
        jPanel2.add(panelPagos_labelMontoAPagar);
        panelPagos_labelMontoAPagar.setBounds(10, 108, 120, 15);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(350, 67, 11, 80);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(10, 160, 507, 10);

        panelPagos_labelAPagar4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagos_labelAPagar4.setText("Ganancia");
        jPanel2.add(panelPagos_labelAPagar4);
        panelPagos_labelAPagar4.setBounds(370, 60, 60, 15);

        panelPagos_textFieldGanancia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagos_textFieldGanancia.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(panelPagos_textFieldGanancia);
        panelPagos_textFieldGanancia.setBounds(370, 74, 79, 29);

        panelPagos_botonProcesarPagos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelPagos_botonProcesarPagos.setText("PROCESAR PAGO");
        panelPagos_botonProcesarPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagos_botonProcesarPagosActionPerformed(evt);
            }
        });
        jPanel2.add(panelPagos_botonProcesarPagos);
        panelPagos_botonProcesarPagos.setBounds(368, 170, 160, 31);

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator8);
        jSeparator8.setBounds(350, 165, 11, 40);

        panelPagos_botonPasarAbono.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelPagos_botonPasarAbono.setText("Pasar Pago");
        panelPagos_botonPasarAbono.setEnabled(false);
        panelPagos_botonPasarAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagos_botonPasarAbonoActionPerformed(evt);
            }
        });
        jPanel2.add(panelPagos_botonPasarAbono);
        panelPagos_botonPasarAbono.setBounds(220, 190, 116, 21);

        panelPagos_botonProcesarAbono.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelPagos_botonProcesarAbono.setText("Procesar Abono");
        panelPagos_botonProcesarAbono.setEnabled(false);
        panelPagos_botonProcesarAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagos_botonProcesarAbonoActionPerformed(evt);
            }
        });
        jPanel2.add(panelPagos_botonProcesarAbono);
        panelPagos_botonProcesarAbono.setBounds(220, 164, 116, 21);

        panelPagos_textFieldMontoAAbonar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagos_textFieldMontoAAbonar.setForeground(new java.awt.Color(255, 0, 51));
        panelPagos_textFieldMontoAAbonar.setEnabled(false);
        panelPagos_textFieldMontoAAbonar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelPagos_textFieldMontoAAbonarFocusGained(evt);
            }
        });
        panelPagos_textFieldMontoAAbonar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelPagos_textFieldMontoAAbonarKeyReleased(evt);
            }
        });
        jPanel2.add(panelPagos_textFieldMontoAAbonar);
        panelPagos_textFieldMontoAAbonar.setBounds(10, 174, 90, 26);

        panelPagos_textFieldMontoAbonado.setEditable(false);
        panelPagos_textFieldMontoAbonado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagos_textFieldMontoAbonado.setText("0");
        panelPagos_textFieldMontoAbonado.setEnabled(false);
        jPanel2.add(panelPagos_textFieldMontoAbonado);
        panelPagos_textFieldMontoAbonado.setBounds(110, 174, 90, 26);

        panelPagos_checkBox_agregarAtraso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagos_checkBox_agregarAtraso.setText("AGREGAR ATRASO");
        panelPagos_checkBox_agregarAtraso.setEnabled(false);
        panelPagos_checkBox_agregarAtraso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagos_checkBox_agregarAtrasoActionPerformed(evt);
            }
        });
        jPanel2.add(panelPagos_checkBox_agregarAtraso);
        panelPagos_checkBox_agregarAtraso.setBounds(373, 110, 140, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Abono a Pago");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 160, 100, 15);

        check_saldoAntesDeFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_saldoAntesDeFecha.setText("SALDAR ANTES DE FECHA");
        check_saldoAntesDeFecha.setEnabled(false);
        check_saldoAntesDeFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_saldoAntesDeFechaActionPerformed(evt);
            }
        });
        jPanel2.add(check_saldoAntesDeFecha);
        check_saldoAntesDeFecha.setBounds(8, 198, 200, 23);

        panelPagosSaldosEnvargos_tabbdPanel.addTab("PAGOS", jPanel2);

        jPanel3.setLayout(null);

        panelSaldos_textFieldCodigoFactura.setEditable(false);
        panelSaldos_textFieldCodigoFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelSaldos_textFieldCodigoFactura.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(panelSaldos_textFieldCodigoFactura);
        panelSaldos_textFieldCodigoFactura.setBounds(10, 11, 60, 31);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4);
        jSeparator4.setBounds(10, 56, 511, 10);

        panelSaldos_botonProcesarSaldo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelSaldos_botonProcesarSaldo.setText("PROCESAR SALDO");
        panelSaldos_botonProcesarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelSaldos_botonProcesarSaldoActionPerformed(evt);
            }
        });
        jPanel3.add(panelSaldos_botonProcesarSaldo);
        panelSaldos_botonProcesarSaldo.setBounds(368, 170, 160, 31);

        panelSaldos_texFieldCostoFactura.setEditable(false);
        panelSaldos_texFieldCostoFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelSaldos_texFieldCostoFactura.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(panelSaldos_texFieldCostoFactura);
        panelSaldos_texFieldCostoFactura.setBounds(421, 20, 100, 31);

        panelSaldos_labelMontoParaSaldar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelSaldos_labelMontoParaSaldar.setText("Monto Para Saldar(*)");
        jPanel3.add(panelSaldos_labelMontoParaSaldar);
        panelSaldos_labelMontoParaSaldar.setBounds(10, 60, 140, 14);

        panelSaldos_textFieldMontoParaSaldar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelSaldos_textFieldMontoParaSaldar.setForeground(new java.awt.Color(255, 51, 51));
        panelSaldos_textFieldMontoParaSaldar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelSaldos_textFieldMontoParaSaldarKeyReleased(evt);
            }
        });
        jPanel3.add(panelSaldos_textFieldMontoParaSaldar);
        panelSaldos_textFieldMontoParaSaldar.setBounds(10, 74, 140, 28);

        panelSaldos_textFieldGananciaTotalSaldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelSaldos_textFieldGananciaTotalSaldo.setForeground(new java.awt.Color(0, 102, 255));
        jPanel3.add(panelSaldos_textFieldGananciaTotalSaldo);
        panelSaldos_textFieldGananciaTotalSaldo.setBounds(10, 122, 140, 28);

        panelSaldos_labelMontoParaSaldar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelSaldos_labelMontoParaSaldar1.setText("Ganancia Total Saldo(*)");
        jPanel3.add(panelSaldos_labelMontoParaSaldar1);
        panelSaldos_labelMontoParaSaldar1.setBounds(10, 108, 150, 14);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator6);
        jSeparator6.setBounds(10, 160, 511, 10);

        panelSaldos_checkBox_agregarAtraso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelSaldos_checkBox_agregarAtraso.setText("AGREGAR ATRASO");
        panelSaldos_checkBox_agregarAtraso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelSaldos_checkBox_agregarAtrasoActionPerformed(evt);
            }
        });
        jPanel3.add(panelSaldos_checkBox_agregarAtraso);
        panelSaldos_checkBox_agregarAtraso.setBounds(170, 80, 150, 23);

        panelSaldos_texFieldCostoFacturaRestante.setEditable(false);
        panelSaldos_texFieldCostoFacturaRestante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelSaldos_texFieldCostoFacturaRestante.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(panelSaldos_texFieldCostoFacturaRestante);
        panelSaldos_texFieldCostoFacturaRestante.setBounds(300, 20, 100, 31);

        panelPagos_labelValorCuota3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagos_labelValorCuota3.setText("Costo Restante");
        jPanel3.add(panelPagos_labelValorCuota3);
        panelPagos_labelValorCuota3.setBounds(300, 6, 110, 14);

        panelPagos_labelValorCuota1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagos_labelValorCuota1.setText("Costo Factura");
        jPanel3.add(panelPagos_labelValorCuota1);
        panelPagos_labelValorCuota1.setBounds(418, 6, 100, 14);

        panelPagosSaldosEnvargos_tabbdPanel.addTab("SALDOS", jPanel3);

        jPanel1.setLayout(null);

        panelEnvargos_textFieldCodigoFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelEnvargos_textFieldCodigoFactura.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(panelEnvargos_textFieldCodigoFactura);
        panelEnvargos_textFieldCodigoFactura.setBounds(10, 11, 60, 31);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(10, 56, 511, 10);

        panelEnvargos_botonProcesarEnvargo.setText("PROCESAR ENVARGO");
        panelEnvargos_botonProcesarEnvargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelEnvargos_botonProcesarEnvargoActionPerformed(evt);
            }
        });
        jPanel1.add(panelEnvargos_botonProcesarEnvargo);
        panelEnvargos_botonProcesarEnvargo.setBounds(368, 170, 160, 31);

        panelPagos_labelValorCuota2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagos_labelValorCuota2.setText("Costo Factura");
        jPanel1.add(panelPagos_labelValorCuota2);
        panelPagos_labelValorCuota2.setBounds(418, 6, 100, 15);

        panelEnvargos_texFieldCostoFactura.setEditable(false);
        panelEnvargos_texFieldCostoFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelEnvargos_texFieldCostoFactura.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(panelEnvargos_texFieldCostoFactura);
        panelEnvargos_texFieldCostoFactura.setBounds(421, 20, 100, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Codigo(*)");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 60, 61, 15);

        panelEnvargos_textFieldCodigoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelEnvargos_textFieldCodigoProducto.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(panelEnvargos_textFieldCodigoProducto);
        panelEnvargos_textFieldCodigoProducto.setBounds(10, 74, 353, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Costo(*)");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 108, 54, 15);

        panelEnvargos_textFieldCostoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelEnvargos_textFieldCostoProducto.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(panelEnvargos_textFieldCostoProducto);
        panelEnvargos_textFieldCostoProducto.setBounds(10, 122, 96, 31);

        panelEnvargos_textFieldPrecioProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelEnvargos_textFieldPrecioProducto.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(panelEnvargos_textFieldPrecioProducto);
        panelEnvargos_textFieldPrecioProducto.setBounds(120, 122, 96, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Precio(*)");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 108, 55, 15);

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(10, 160, 511, 10);

        panelEnvargos_texFieldCostoFacturaRestante.setEditable(false);
        panelEnvargos_texFieldCostoFacturaRestante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelEnvargos_texFieldCostoFacturaRestante.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(panelEnvargos_texFieldCostoFacturaRestante);
        panelEnvargos_texFieldCostoFacturaRestante.setBounds(300, 20, 100, 31);

        panelPagos_labelValorCuota4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagos_labelValorCuota4.setText("Costo Restante");
        jPanel1.add(panelPagos_labelValorCuota4);
        panelPagos_labelValorCuota4.setBounds(300, 6, 110, 14);

        panelPagosSaldosEnvargos_tabbdPanel.addTab("ENVARGOS", jPanel1);

        jPanel4.setLayout(null);

        panelSacarDelSistema_textFieldCodigoFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelSacarDelSistema_textFieldCodigoFactura.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(panelSacarDelSistema_textFieldCodigoFactura);
        panelSacarDelSistema_textFieldCodigoFactura.setBounds(10, 11, 60, 31);

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator9);
        jSeparator9.setBounds(10, 56, 511, 10);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("AL PRECIONAR EL BOTON DE ARRIBA, ESTE SALDRA DEL SISTEMA SIN PASAR POR LOS REGISTROS");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 120, 510, 13);

        jButton1.setText("Sacar Recivo del Sistema");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(10, 80, 180, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText(" DE GANANCIA DEL SISTEMA, EL(LOS) ARTICULO(S) NO VOLVERA(N) AINGRESAR AL INVENTARIO.");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 140, 490, 13);

        panelPagosSaldosEnvargos_tabbdPanel.addTab("SACAR RECIVO DEL SISTEMA", jPanel4);

        add(panelPagosSaldosEnvargos_tabbdPanel);
        panelPagosSaldosEnvargos_tabbdPanel.setBounds(10, 196, 540, 250);

        jFormattedTextField1.setForeground(new java.awt.Color(0, 0, 255));
        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##. ##. ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jFormattedTextField1);
        jFormattedTextField1.setBounds(439, 168, 110, 30);

        panelPagosSaldosEnvargos_botonHIstorialEnvargos.setBackground(new java.awt.Color(204, 204, 204));
        panelPagosSaldosEnvargos_botonHIstorialEnvargos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagosSaldosEnvargos_botonHIstorialEnvargos.setText("ENVARGOS");
        panelPagosSaldosEnvargos_botonHIstorialEnvargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagosSaldosEnvargos_botonHIstorialEnvargosActionPerformed(evt);
            }
        });
        add(panelPagosSaldosEnvargos_botonHIstorialEnvargos);
        panelPagosSaldosEnvargos_botonHIstorialEnvargos.setBounds(680, 0, 100, 30);

        panelPagosSaldosEnvargos_botonHistorialPagos.setBackground(new java.awt.Color(204, 204, 204));
        panelPagosSaldosEnvargos_botonHistorialPagos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagosSaldosEnvargos_botonHistorialPagos.setText("PAGOS");
        panelPagosSaldosEnvargos_botonHistorialPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagosSaldosEnvargos_botonHistorialPagosActionPerformed(evt);
            }
        });
        add(panelPagosSaldosEnvargos_botonHistorialPagos);
        panelPagosSaldosEnvargos_botonHistorialPagos.setBounds(480, 0, 100, 30);

        panelPagosSaldosEnvargos_botonHistorialSaldos.setBackground(new java.awt.Color(153, 153, 153));
        panelPagosSaldosEnvargos_botonHistorialSaldos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagosSaldosEnvargos_botonHistorialSaldos.setText("SALDOS");
        panelPagosSaldosEnvargos_botonHistorialSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagosSaldosEnvargos_botonHistorialSaldosActionPerformed(evt);
            }
        });
        add(panelPagosSaldosEnvargos_botonHistorialSaldos);
        panelPagosSaldosEnvargos_botonHistorialSaldos.setBounds(580, 0, 100, 30);

        panelPagos_labelCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add(panelPagos_labelCliente);
        panelPagos_labelCliente.setBounds(10, 440, 540, 30);

        panelPagosSaldosEnvargos_botonHIstorialEnvargos1.setBackground(new java.awt.Color(153, 153, 153));
        panelPagosSaldosEnvargos_botonHIstorialEnvargos1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagosSaldosEnvargos_botonHIstorialEnvargos1.setText("ABONOS");
        panelPagosSaldosEnvargos_botonHIstorialEnvargos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagosSaldosEnvargos_botonHIstorialEnvargos1ActionPerformed(evt);
            }
        });
        add(panelPagosSaldosEnvargos_botonHIstorialEnvargos1);
        panelPagosSaldosEnvargos_botonHIstorialEnvargos1.setBounds(780, 0, 100, 30);

        panelPagosSaldosEnvargos_botonClientesAtrasados.setBackground(new java.awt.Color(153, 153, 153));
        panelPagosSaldosEnvargos_botonClientesAtrasados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagosSaldosEnvargos_botonClientesAtrasados.setText("ATRASOS");
        panelPagosSaldosEnvargos_botonClientesAtrasados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagosSaldosEnvargos_botonClientesAtrasadosActionPerformed(evt);
            }
        });
        add(panelPagosSaldosEnvargos_botonClientesAtrasados);
        panelPagosSaldosEnvargos_botonClientesAtrasados.setBounds(480, 30, 100, 30);

        panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.setForeground(new java.awt.Color(51, 153, 255));
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar recibo por cliente:"));
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteActionPerformed(evt);
            }
        });
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteKeyReleased(evt);
            }
        });
        add(panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente);
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.setBounds(10, 0, 310, 40);
    }// </editor-fold>//GEN-END:initComponents

    //Evento para el campo de texto de busqueda.
    private void panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteActionPerformed
        try {
            java.sql.ResultSet rs
                    = DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.todasFacturasActivasDeClienteCedula(
                            Logica.CamposTexto.Campo_extraerCodigo.getCode(
                                    panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente));
            limpiarVentana();
            actualizarLlenarTabla(rs);
            try {
                llenarVentanaConIdFactura((String) model.getValueAt(0, 0), true);
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                //Si no se encuentra ninguna factura
                Logica.Cuadros_Emergentes.alerta("Este cliente no tiene ninguna"
                        + "factura activa.");
            }
        } catch (java.lang.StringIndexOutOfBoundsException ex) {
            Logica.Cuadros_Emergentes.alerta("Ningun cliente encontrado.");
            limpiarVentana();
        }
    }//GEN-LAST:event_panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteActionPerformed

    //Evento para el boton 'procesar pago'
    @SuppressWarnings("static-access")
    private void panelPagos_botonProcesarPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagos_botonProcesarPagosActionPerformed
        //Verifica que haya alguna factura seleccionada.
        if (panelPagos_textFieldCodigoFactura.getText().length() > 0) {
            //Verifica que todos los campos tengan algun valor.
            if ((panelPagos_textFieldCuotasAPagar.getText().length() > 0)
                    && (panelPagos_textFieldMontoAPagar.getText().length() > 0)) {
                if ((Logica.Cuadros_Emergentes.Transacciones(
                        panelPagos_textFieldMontoAPagar.getText())) == 0) {
                    String montoOCuotas = Integer.parseInt(
                            panelPagos_textFieldCuotasAPagar.getText()) > 0
                            ? panelPagos_textFieldCuotasAPagar.getText()
                            : panelPagos_textFieldCuotasAPagar.getText();
                    if (procesoPago(
                            montoOCuotas,
                            "0",
                            panelPagos_textFieldMontoAPagar.getText(),
                            panelPagos_textFieldMontoRestante.getText(),
                            true)) {
                        //Verifica si los abonos estan agregados al pago
                        if (panelPagos_checkBox_agregarAtraso.isSelected()) {
                            panelPagos_textFieldMontoAPagar.setText(
                                    Integer.toString(
                                            Integer.parseInt(
                                                    panelPagos_textFieldMontoAPagar
                                                            .getText())
                                            - Integer.parseInt(panelAtrasos.panelDetalles_label_totalRestante
                                                    .getText())
                                    )
                            );
                            DataBase.Financiera.AtrasosPagados.Insert.AtrasosPagados(new String[]{
                                panelPagos_textFieldCodigoFactura.getText(),
                                Panel_verAtrasos.panelDetalles_field_numeroAtrasosAPagar.getText(),
                                panelAtrasos.panelDetalles_label_totalRestante.getText(),
                                jFormattedTextField1.getText()
                            });
                        }
                        //Historial ReportesConDB
                        String idPago = Integer.toString(DataBase.Financiera.Pagos.Select
                                .ultimoId());
                        int atraso = panelPagos_checkBox_agregarAtraso
                                .isSelected() ? Integer.parseInt(
                                                panelAtrasos.panelDetalles_label_totalPagar
                                                        .getText()) : 0;
                        String numeroAtrasos = panelPagos_checkBox_agregarAtraso
                                .isSelected() ? panelAtrasos.panelDetalles_field_numeroAtrasosAPagar
                                                .getText() : "----";
                        String ruta = "\\Reportes\\Historial\\P-" + idPago + ".txt";
                        Logica.FileBufferWritter.writeFile(ruta, "-\n-");
                        Logica.FileBufferWritter.writeFileInSpesificLine(
                                ruta, Integer.toString(atraso), 0);
                        Logica.FileBufferWritter.writeFileInSpesificLine(
                                ruta, numeroAtrasos, 1);
                        //REPORTE
                        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
                        parametros.put("id", idPago);
                        parametros.put("atraso", atraso);
                        parametros.put("numeroAtrasos", numeroAtrasos);
                        Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                                parametros,
                                "Financiera\\ComprobantePago",
                                false);
                        panelAtrasos.LimpiarVentana();
                        procesoLlmadoMetodosDeLimpiado();
                        Logica.Cuadros_Emergentes.completado();
                        ocultarPanelesVer();
                    }
                }
            } else {
                Logica.Cuadros_Emergentes.alerta("Todos los campos marcados con (*)"
                        + " son obligatorios.");
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("Debe seleccionar alguna factura.");
        }
    }//GEN-LAST:event_panelPagos_botonProcesarPagosActionPerformed

    //Evento para el boton 'procesar saldo'
    private void panelSaldos_botonProcesarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelSaldos_botonProcesarSaldoActionPerformed
        //Verifica que haya alguna factura seleccionada.
        if (panelSaldos_textFieldCodigoFactura.getText().length() > 0) {
            //Verifica que todos los campos tengan algun valor.
            if ((panelSaldos_textFieldMontoParaSaldar.getText().length() > 0)
                    && (panelSaldos_textFieldGananciaTotalSaldo.getText().length() > 0)) {
                //Verificar si este recivo tiene algun abono hecho.
                if (!(Integer.parseInt(panelPagos_textFieldMontoAbonado.getText())
                        > 0)) {
                    if ((Logica.Cuadros_Emergentes.Transacciones(
                            panelSaldos_textFieldMontoParaSaldar.getText())) == 0) {
                        procesoSaldo(panelSaldos_textFieldMontoParaSaldar.getText(),
                                panelSaldos_textFieldGananciaTotalSaldo.getText(),
                                true);
                        //vuelve todos los ABONOS registrados a false para que no se cuenten en futuros abonos.
                        DataBase.Financiera.abonoAPago.Update.actualizarAbonoAPagoAFalse(panelPagos_textFieldCodigoFactura.getText());
                        //Mostrar ReportesConDB
                        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
                        try (java.sql.ResultSet rs = DataBase.Financiera.saldos.Select.saldoFacturaVentaCredito("")) {
                            rs.next();
                            parametros.put("id", rs.getInt("saldos.idSaldos"));
                            Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                                    parametros,
                                    "Financiera\\ComprobanteSaldo",
                                    false);
                        } catch (java.sql.SQLException e) {
                            e.printStackTrace();
                        }
                        limpiarVentana();
                        panelAtrasos.LimpiarVentana();
                        panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.setText("");
                        Logica.Cuadros_Emergentes.completado();
                        ocultarPanelesVer();
                    }
                } else {
                    Logica.Cuadros_Emergentes.alerta("Este Recibo tiene un abono"
                            + " realizado. \nPara poder registrar las ganancias de"
                            + " este saldo, necesita realizar este proceso en la"
                            + " ventana de: \n'Pagos -> Abonos'.");
                    panelPagosSaldosEnvargos_tabbdPanel.setSelectedIndex(0);
                    panelPagos_textFieldMontoAAbonar.requestFocus();
                }
            } else {
                Logica.Cuadros_Emergentes.alerta("Todos los campos marcados con (*)"
                        + " son obligatorios.");
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("Debe seleccionar alguna factura.");
        }
    }//GEN-LAST:event_panelSaldos_botonProcesarSaldoActionPerformed

    //Evento para el boton 'ver detalles de factura seleccionada'
    private void panelPagosSaldosEnvargos_verFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagosSaldosEnvargos_verFacturasActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Ventana_base.PANELES[17].setVisible(true);
        Diseño.Financiera.paneles_pantallaPrincipal.panel_ClientesPendientes.grupo_Activos.setSelected(true);
        Diseño.Financiera.paneles_pantallaPrincipal.panel_ClientesPendientes
                .llenarTablaFacturaConIdFactura(panelPagos_textFieldCodigoFactura.getText());
        Diseño.Financiera.paneles_pantallaPrincipal.panel_ClientesPendientes
                .llenarVentanaConIdFactura(panelPagos_textFieldCodigoFactura.getText());
    }//GEN-LAST:event_panelPagosSaldosEnvargos_verFacturasActionPerformed

    //Evento para el boton 'procesar envargo'
    private void panelEnvargos_botonProcesarEnvargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelEnvargos_botonProcesarEnvargoActionPerformed
        //Verifica que haya alguna factura seleccionada.
        if (panelEnvargos_textFieldCodigoFactura.getText().length() > 0) {
            //Verifica que todos los campos tengan algun valor.
            if ((panelEnvargos_textFieldCodigoProducto.getText().length() > 0)
                    && (panelEnvargos_textFieldCostoProducto.getText().length() > 0)
                    && (panelEnvargos_textFieldPrecioProducto.getText().length() > 0)) {
                if ((Logica.Cuadros_Emergentes.confirmacionDefinida(
                        "-Guardara este ENVARGO.")) == 0) {

                    //Crear el nuevo articulo con su descripcion precio y costo:
                    if (DataBase.Facturacion.Producto.Insert.producto(new String[]{panelEnvargos_textFieldCodigoProducto.getText().replaceAll(" ", "-"),
                        "ARTICULO ENVARGADO",
                        panelEnvargos_textFieldCostoProducto.getText(),
                        panelEnvargos_textFieldPrecioProducto.getText(),
                        "1"})) {
                        //Pasar los datos a la tabla 'envargos'
                        DataBase.Financiera.Envargo.Insert.envargos(panelSaldos_textFieldCodigoFactura.getText(),
                                jFormattedTextField1.getText());
                        //Desactiva la factura venta credito para que no aparezca mas.
                        DataBase.Financiera.FacturaVentaCredito.VentaCredito.Update.ventaCreditoCambiarEstado(panelEnvargos_textFieldCodigoFactura.getText(), "2");
                        //disminuye el cuotas de costo de las facturas a creditos activas si la factura es con cuotas
                        DataBase.Financiera.DatosFinanciera.Update.CambiarCostoFacturasActivas(
                                Integer.parseInt(panelSaldos_texFieldCostoFacturaRestante
                                        .getText()), false);
                        Logica.Cuadros_Emergentes.alerta("Se a agregado el articulo al almacen con cantidad 1.");

                        panelAtrasos.LimpiarVentana();
                        limpiarVentana();
                        panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.setText("");
                        Logica.Cuadros_Emergentes.completado();
                        ocultarPanelesVer();
                        //Actualizar y limpiar la tabla de 'Clientes con facturas de vents activas'
                        Diseño.Financiera.paneles_pantallaPrincipal.panel_ClientesPendientes.actualizarLabelsTotalTacturasActivasYCostos();
                        Diseño.Facturacion.paneles_base.panelBase_CompraVenta.autoCompleterCampoBuscadorArticulo(Diseño.Facturacion.paneles_pantallaPrincipal.panel_compras.panelCompra_textFieldCodigoProducto, "campo_compras_articulo");
                        Diseño.Facturacion.paneles_base.panelBase_CompraVenta.autoCompleterCampoBuscadorArticulo(Diseño.Facturacion.paneles_pantallaPrincipal.panel_ventas.panelVenta_textFieldCodigoProducto, "campo_ventas_articulo");
                    } else {
                        Logica.Cuadros_Emergentes.alerta(
                                "El codigo " + panelEnvargos_textFieldCodigoProducto.getText()
                                + " ya existe en la base de datos, intente con uno diferente.");
                    }
                }
            } else {
                Logica.Cuadros_Emergentes.alerta("Todos los campos marcados con (*)"
                        + " son obligatorios.");
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("Debe seleccionar alguna factura.");
        }
    }//GEN-LAST:event_panelEnvargos_botonProcesarEnvargoActionPerformed

    private void panelPagosSaldosEnvargos_botonHistorialPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagosSaldosEnvargos_botonHistorialPagosActionPerformed
        ocultarPanelesVer();
        Logica.herramientas.procesoDeHistorial();
        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[18].setVisible(true);
        Diseño.Financiera.paneles_historiales.panel_historialPagos.llenarTablaTodosDatos();
        Diseño.Financiera.paneles_historiales.panel_historialPagos.jButton5.setVisible(false);
    }//GEN-LAST:event_panelPagosSaldosEnvargos_botonHistorialPagosActionPerformed

    private void panelPagosSaldosEnvargos_botonHistorialSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagosSaldosEnvargos_botonHistorialSaldosActionPerformed
        ocultarPanelesVer();
        Logica.herramientas.procesoDeHistorial();
        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[19].setVisible(true);
        Diseño.Financiera.paneles_historiales.panel_historialSaldos.llenarTablaTodosDatos();
        Diseño.Financiera.paneles_historiales.panel_historialSaldos.jButton1.setVisible(false);
    }//GEN-LAST:event_panelPagosSaldosEnvargos_botonHistorialSaldosActionPerformed

    private void panelPagosSaldosEnvargos_botonHIstorialEnvargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagosSaldosEnvargos_botonHIstorialEnvargosActionPerformed
        ocultarPanelesVer();
        Logica.herramientas.procesoDeHistorial();
        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[20].setVisible(true);
        Diseño.Financiera.paneles_historiales.panel_historialEnvargos.llenarTablaTodosDatos();
    }//GEN-LAST:event_panelPagosSaldosEnvargos_botonHIstorialEnvargosActionPerformed

    private void panelPagos_botonPasarAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagos_botonPasarAbonoActionPerformed
        //Se verifica que el chequeBox este seleccionado, si lo esta se saldara
        //el recivo con la cantidad que se haya colocado no importa que sea menor
        //a lo que debe pagar, asi se le puede hacer un descuento al cliente,
        //desde el panel de abonos a pagos/saldos.
        //O, si el monto a abonar mas el monto abonado es mayor o igual al 
        //monto restante, se procede a hacer un saldo.
        int val = Integer.parseInt(panelPagos_textFieldMontoAAbonar.getText())
                + Integer.parseInt(panelPagos_textFieldMontoAbonado.getText());
        if (check_saldoAntesDeFecha.isSelected() || (val >= Integer.parseInt(tmpMontoRst))) {
            if ((Logica.Cuadros_Emergentes.Transacciones(
                    panelPagos_textFieldMontoAAbonar.getText())) == 0) {
                ProcesoSaldoPorAbono();
            }
        } else {
            if (!tmpCuotasRst.equals("1")) {
                //En caso de que NO sea el ultimo pago, se procedera a hacer un pago normal.
                int montoAAbonarMasMontoAbonado = Integer.parseInt(
                        panelPagos_textFieldMontoAAbonar.getText())
                        + Integer.parseInt(panelPagos_textFieldMontoAbonado.getText());
                if (montoAAbonarMasMontoAbonado
                        < (Integer.parseInt(panelPagos_textFieldMontoRestante
                                .getText())
                        + Integer.parseInt(panelPagos_textFieldMontoAPagar.getText()))) {
                    //lastId es para guardar el ultimo registro de abonoAPago para
                    //no eliminarlo luego de limpiar todos los abonos hechos.
                    int lastId = DataBase.Financiera.abonoAPago.Select.ultimoId();
                    if (invocarJDialogAntesDePasarAbono(
                            true,
                            panelPagos_textFieldMontoAAbonar.getText(),
                            2)) {
                        //Se verifica que si el modulo de la sumatoria de cuotas a
                        //abonar mas el monto abonado es mayor a 0, si es asi se
                        //desabilitan todos los abonos hechos menos el ultimo, y en
                        //caso contrario se desabilitan todos sin excepcion de ninguno.
                        if ((montoAAbonarMasMontoAbonado % Integer.parseInt(
                                panelPagos_texFieldValorCuotas.getText())) > 0) {
                            DataBase.Financiera.abonoAPago.Update
                                    .actualizarAbonoAPagoAFalseenEspecifico(
                                            Integer.toString(lastId + 1));
                        } else {
                            DataBase.Financiera.abonoAPago.Update.actualizarAbonoAPagoAFalse(
                                    panelPagos_textFieldCodigoFactura.getText());
                            Diseño.Financiera.paneles_ver.panel_verAbonos.llenarTablaDesdeFuera();
                        }
                        //Historial ReportesConDB
                        String idPago = Integer.toString(DataBase.Financiera.Pagos.Select
                                .ultimoId());
                        String ruta = "\\Reportes\\Historial\\P-" + idPago + ".txt";
                        Logica.FileBufferWritter.writeFile(ruta, "-\n-");
                        Logica.FileBufferWritter.writeFileInSpesificLine(
                                ruta, Integer.toString(0), 0);
                        Logica.FileBufferWritter.writeFileInSpesificLine(
                                ruta, "----", 1);
                        //Mostrar ReportesConDB de Pago
                        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
                        parametros.put("id", idPago);
                        parametros.put("montoAbonado",
                                panelPagos_textFieldMontoAAbonar.getText());
                        parametros.put("abonoRestante", Integer.toString(abonoRestante));
                        Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                                parametros,
                                "Financiera\\ComprobantePagoPorAbono",
                                false);
                        procesoLlmadoMetodosDeLimpiado();
                        Logica.Cuadros_Emergentes.completado();
                    }
                } else {
                    Logica.Cuadros_Emergentes.alerta("La cantidad de cuotas que"
                            + "desea restar es MAYOR a la cantidad de cuotas restantes.\n");
                }
            } else {
                //En caso de que SI sea el ultimo pago, se procedera a hacer una cancelacion.
                if (invocarJDialogAntesDePasarAbono(true, panelPagos_textFieldMontoAAbonar.getText(), 4)) {
                    Logica.Cuadros_Emergentes.alerta("Al ser el ultimo pago de esta factura\n"
                            + "se procedera automaticamente a ralizar un saldo del recibo.");
                    ProcesoSaldoPorAbono();
                }
            }
        }
    }//GEN-LAST:event_panelPagos_botonPasarAbonoActionPerformed

    private void panelPagos_botonProcesarAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagos_botonProcesarAbonoActionPerformed
        if (invocarJDialogAntesDePasarAbono(
                true,
                panelPagos_textFieldMontoAAbonar.getText(),
                1)) {
            //Mostrar ReportesConDB de Pago
            java.util.Map<String, Object> parametros = new java.util.HashMap<>();
            parametros.put("idAbono", Integer.toString(DataBase.Financiera.abonoAPago.Select
                    .ultimoId()));
            parametros.put("idFactura", panelPagos_textFieldCodigoFactura.getText());
            Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                    parametros,
                    "Financiera\\ComprobanteAbono",
                    false);
            limpiarVentana();
            panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.setText("");
            panelPagosSaldosEnvargos_textFieldBuscarReciboPorID.setText("");
            Logica.Cuadros_Emergentes.completado();
        }
    }//GEN-LAST:event_panelPagos_botonProcesarAbonoActionPerformed

    //Este evento esta al tanto de cada vez que se teclee algo en la JTextBox de
    //'MontoAAbonar' para ir sumando su contenido con el contenido del
    //JTextField del campo 'MontoAbonado' e ir verificando si el resultado de
    //esta suma es menor, igual o mayor al valor de cada cuota. Segun sea el
    //caso activará y desactivará los botones de 'procesar abono' y 'procesar
    //pago' segun sea el caso.
    private void panelPagos_textFieldMontoAAbonarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelPagos_textFieldMontoAAbonarKeyReleased
        int montoAAbonarMASmontoAbonado = 0;
        check_saldoAntesDeFecha.setEnabled(false);
        check_saldoAntesDeFecha.setSelected(false);
        //Verifico que la cantidad de caracteres en el campo de texto sea mayor a 0 para que no me tire un Exception.
        if (panelPagos_textFieldMontoAAbonar.getText().length() > 0) {
            //Desabilitar en boton de procesar Pago
            panelPagos_botonProcesarPagos.setEnabled(false);
            //Hago que los campos de cantidad y monto no sean editables
            panelPagos_textFieldCuotasAPagar.setEnabled(false);
            panelPagos_textFieldMontoAPagar.setEnabled(false);
            //Verifico que el valor introducido en 'montoAAbonar' no sea igual a '0'.
            if (Integer.parseInt(panelPagos_textFieldMontoAAbonar.getText()) != 0) {
                montoAAbonarMASmontoAbonado = Integer.parseInt(
                        panelPagos_textFieldMontoAAbonar.getText())
                        + Integer.parseInt(
                                panelPagos_textFieldMontoAbonado
                                        .getText());
                //Comprobacion de la sumatoria de los campos 'MontoAbonado' y
                //'MontoAAbonar' con el valor de cada cuota.
                if (montoAAbonarMASmontoAbonado >= Integer.parseInt(
                        panelPagos_texFieldValorCuotas.getText())) {
                    panelPagos_botonPasarAbono.setEnabled(true);
                    check_saldoAntesDeFecha.setEnabled(true);
                    panelPagos_botonProcesarAbono.setEnabled(false);
                    int valorCuota = Integer.parseInt(panelPagos_texFieldValorCuotas
                            .getText());
                    //Mientras no sea la ultima cuota, llenara el panel de pagos
                    int montoPasadoACuotas = montoAAbonarMASmontoAbonado / valorCuota;
                    if (montoPasadoACuotas < Integer.parseInt(tmpCuotasRst)) {
                        panelPagos_textFieldCuotasAPagar.setText(Integer.toString(
                                montoPasadoACuotas));
                        procesoLlenarPanelPagos();
                    } else {
                        panelPagos_textFieldCuotasAPagar.setText("0");
                        //Si el recivo tiene un abono realizado y la cantidad de
                        //cuotas a pagar por abono es mayor al monto restante:
                        if (Integer.parseInt(panelPagos_textFieldMontoAbonado
                                .getText()) > 0) {
                            ProcesoCampoMontoSaldar(Integer.toString(
                                    montoAAbonarMASmontoAbonado));
                            panelPagos_textFieldGanancia.setText(panelSaldos_textFieldGananciaTotalSaldo
                                    .getText());
                            panelPagos_textFieldMontoAPagar.setText(
                                    panelPagos_textFieldMontoAAbonar.getText());
                        } else {
                            //Si el recivo no tiene abono y se intenta poner un
                            //monto MAYOR al valor restante se le manda al usuario
                            //a saldar por la ventana de saldos directamente.
                            Logica.Cuadros_Emergentes.alerta("Para Saldar este "
                                    + "recivo, debe hacerlo desde la ventana de "
                                    + "Saldos.");
                            panelPagosSaldosEnvargos_tabbdPanel
                                    .setSelectedIndex(1);
                            panelSaldos_textFieldMontoParaSaldar.requestFocus();
                            panelPagos_textFieldMontoAAbonar.setText("");
                            panelPagos_textFieldCuotasAPagar.setText("");
                            panelPagos_textFieldCuotasAPagar.setEnabled(true);
                            panelPagos_textFieldMontoAPagar.setEnabled(true);
                            panelPagos_botonProcesarPagos.setEnabled(true);
                            panelPagos_botonPasarAbono.setEnabled(false);
                            check_saldoAntesDeFecha.setEnabled(false);
                        }
                    }
                } else {
                    panelPagos_botonPasarAbono.setEnabled(false);
                    panelPagos_botonProcesarAbono.setEnabled(true);
                }
            }
        } else {
            panelPagos_textFieldCuotasAPagar.setText("");
            panelPagos_textFieldMontoAPagar.setText("");
            panelPagos_texFieldCantidadCuotasRst.setText(tmpCuotasRst);
            panelPagos_textFieldMontoRestante.setText(tmpMontoRst);
            panelPagos_textFieldGanancia.setText(Integer.toString(tmpGananciaCuotas));
            panelPagos_botonProcesarPagos.setEnabled(true);
            panelPagos_textFieldCuotasAPagar.setEnabled(true);
            panelPagos_textFieldMontoAPagar.setEnabled(true);
            panelPagos_botonPasarAbono.setEnabled(false);
            panelPagos_botonProcesarAbono.setEnabled(false);
            panelSaldos_textFieldMontoParaSaldar.setText(tmpMontoRst);
            panelSaldos_textFieldGananciaTotalSaldo.setText(Integer
                    .toString(tmpTotalGananciasRst));
        }
        if (check_saldoAntesDeFecha.isSelected()) {
            panelSaldos_textFieldMontoParaSaldar.setText(Integer.toString(
                    montoAAbonarMASmontoAbonado));
            ProcesoCampoMontoSaldar(Integer.toString(
                    montoAAbonarMASmontoAbonado));
            panelPagos_textFieldGanancia.setText(panelSaldos_textFieldGananciaTotalSaldo
                    .getText());
        }
        //En caso de que se quiera saldar un recivo con menos de lo que se completa
        //un pago, si es el ultimo pago se activara el checkBox.
        if ((panelPagos_texFieldCantidadCuotasRst.getText().equals("1"))) {
            check_saldoAntesDeFecha.setEnabled(true);
        }
    }//GEN-LAST:event_panelPagos_textFieldMontoAAbonarKeyReleased

    private void panelPagos_textFieldCuotasAPagarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelPagos_textFieldCuotasAPagarKeyReleased
        procesoLlenarPanelPagos();
        panelAtrasos.Evento_botonMostrarPanelMoras();
    }//GEN-LAST:event_panelPagos_textFieldCuotasAPagarKeyReleased

    private void panelPagos_textFieldMontoAPagarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelPagos_textFieldMontoAPagarKeyReleased
        if (panelPagos_textFieldMontoAPagar.getText().length() > 0) {
            //Verifico que el cuotas  pagar sea menor al cuotas restante.
            if (Integer.parseInt(panelPagos_textFieldMontoAPagar.getText())
                    < Integer.parseInt(tmpMontoRst)) {
                //Si el recivo es sin cuotas, al momento de escribir una cantidad
                //esta alterara el resultado de el camo panelPagos_textFieldMontoRestante
                if (panelPagos_texFieldValorCuotas.getText().equals("0")) {
                    panelPagos_textFieldMontoRestante.setText(
                            Integer.toString(Integer.parseInt(tmpMontoRst)
                                    - Integer.parseInt(
                                            panelPagos_textFieldMontoAPagar.getText())));
                } else {
                    panelPagos_textFieldGanancia.setText(
                            Integer.toString(tmpGananciaCuotas
                                    - (Integer.parseInt(
                                            panelPagos_texFieldValorCuotas
                                                    .getText())
                                    - Integer.parseInt(
                                            panelPagos_textFieldMontoAPagar
                                                    .getText())))
                    );
                }
            } else {
                Logica.Cuadros_Emergentes.alerta("El monto a pagar no puede ser"
                        + " mayor o igual a monto total restante.");
                panelPagos_textFieldMontoAPagar.setText("1");
            }
        }
    }//GEN-LAST:event_panelPagos_textFieldMontoAPagarKeyReleased

    private void procesoLlenarPanelPagos() {
        panelPagos_checkBox_agregarAtraso.setEnabled(false);
        panelPagos_checkBox_agregarAtraso.setSelected(false);
        if (panelPagos_textFieldCuotasAPagar.getText().length() > 0) {
            //Verifica que el nunmero de cuotas a pagar ni sea menor o igual a 0 ni sea mayor al numero de cuotas debitadas
            if ((Integer.parseInt(panelPagos_textFieldCuotasAPagar.getText()) < Integer.parseInt(tmpCuotasRst)) && (Integer.parseInt(panelPagos_textFieldCuotasAPagar.getText()) > 0)) {
                panelPagos_texFieldCantidadCuotasRst.setText(Integer.toString(Integer.parseInt(tmpCuotasRst) - Integer.parseInt(panelPagos_textFieldCuotasAPagar.getText())));
                panelPagos_textFieldMontoAPagar.setText(Integer.toString(Integer.parseInt(panelPagos_texFieldValorCuotas.getText()) * Integer.parseInt(panelPagos_textFieldCuotasAPagar.getText())));
                panelPagos_textFieldMontoRestante.setText(Integer.toString(Integer.parseInt(tmpMontoRst) - Integer.parseInt(panelPagos_textFieldMontoAPagar.getText())));
                panelPagos_textFieldGanancia.setText(Integer.toString(tmpGananciaCuotas * Integer.parseInt(panelPagos_textFieldCuotasAPagar.getText())));
                panelPagos_checkBox_agregarAtraso.setEnabled(true);
            } else {
                Logica.Cuadros_Emergentes.alerta("La cantidad de cuotas a restar no puede ser mayor o igual a la cantidad de cuotas totales.");
                if (!tmpCuotasRst.equals("1")) {
                    panelPagos_textFieldCuotasAPagar.setText(
                            Integer.toString(
                                    Integer.parseInt(tmpCuotasRst) - 1));
                } else {
                    panelPagos_textFieldCuotasAPagar.setText("");
                }
            }
        }
    }

    private void panelPagosSaldosEnvargos_botonHIstorialEnvargos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagosSaldosEnvargos_botonHIstorialEnvargos1ActionPerformed
        ocultarPanelesVer();
        panelAbonos.setVisible(true);
    }//GEN-LAST:event_panelPagosSaldosEnvargos_botonHIstorialEnvargos1ActionPerformed

    private void panelPagosSaldosEnvargos_botonClientesAtrasadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagosSaldosEnvargos_botonClientesAtrasadosActionPerformed
        ocultarPanelesVer();
        panelAtrasos.LimpiarVentana();
        panelAtrasos.setVisible(true);
    }//GEN-LAST:event_panelPagosSaldosEnvargos_botonClientesAtrasadosActionPerformed

    private void panelPagosSaldosEnvargos_textFieldBuscarReciboPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagosSaldosEnvargos_textFieldBuscarReciboPorIDActionPerformed
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(panelAtrasos.model, panelAtrasos.tabla);
        llenarVentanaConIdFactura(panelPagosSaldosEnvargos_textFieldBuscarReciboPorID.getText(), true);
    }//GEN-LAST:event_panelPagosSaldosEnvargos_textFieldBuscarReciboPorIDActionPerformed

    private void panelPagos_checkBox_agregarAtrasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPagos_checkBox_agregarAtrasoActionPerformed
        if (panelPagos_checkBox_agregarAtraso.isSelected()) {
            panelPagos_textFieldMontoAPagar.setText(
                    Integer.toString(
                            Integer.parseInt(panelPagos_textFieldMontoAPagar.getText())
                            + Integer.parseInt(panelAtrasos.panelDetalles_label_totalPagar.getText()))
            );
        } else {
            panelPagos_textFieldMontoAPagar.setText(
                    Integer.toString(
                            Integer.parseInt(panelPagos_textFieldMontoAPagar.getText())
                            - Integer.parseInt(panelAtrasos.panelDetalles_label_totalPagar.getText()))
            );
        }
    }//GEN-LAST:event_panelPagos_checkBox_agregarAtrasoActionPerformed

    private void panelSaldos_checkBox_agregarAtrasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelSaldos_checkBox_agregarAtrasoActionPerformed
        if (panelSaldos_checkBox_agregarAtraso.isSelected()) {
            panelSaldos_textFieldMontoParaSaldar.setText(
                    Integer.toString(
                            Integer.parseInt(panelSaldos_textFieldMontoParaSaldar
                                    .getText())
                            + Integer.parseInt(panelAtrasos.panelDetalles_label_totalRestante.getText())));
            panelSaldos_textFieldGananciaTotalSaldo.setText(
                    Integer.toString(
                            Integer.parseInt(panelSaldos_textFieldGananciaTotalSaldo
                                    .getText())
                            + Integer.parseInt(panelAtrasos.panelDetalles_label_totalRestante.getText())));
        } else {
            panelSaldos_textFieldMontoParaSaldar.setText(
                    Integer.toString(
                            Integer.parseInt(panelSaldos_textFieldMontoParaSaldar
                                    .getText())
                            - Integer.parseInt(panelAtrasos.panelDetalles_label_totalRestante.getText())));
            panelSaldos_textFieldGananciaTotalSaldo.setText(
                    Integer.toString(
                            Integer.parseInt(panelSaldos_textFieldGananciaTotalSaldo
                                    .getText())
                            - Integer.parseInt(panelAtrasos.panelDetalles_label_totalRestante.getText())));
        }
    }//GEN-LAST:event_panelSaldos_checkBox_agregarAtrasoActionPerformed

    private void panelSaldos_textFieldMontoParaSaldarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelSaldos_textFieldMontoParaSaldarKeyReleased
        ProcesoCampoMontoSaldar(panelSaldos_textFieldMontoParaSaldar.getText());
    }//GEN-LAST:event_panelSaldos_textFieldMontoParaSaldarKeyReleased

    private void panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteKeyReleased
        //Limiar la ventana si escribe y el numero de caracteres actual es
        //diferente al numero de caracteres que habia.
        if (numeroDeCaracteresAntes != panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.getText()
                .length()) {
            if (panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.getText()
                    .length() >= 2) {
                limpiarVentana();
            }
        }
    }//GEN-LAST:event_panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteKeyReleased

    private void panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteKeyPressed
        numeroDeCaracteresAntes = panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente
                .getText().length();
    }//GEN-LAST:event_panelPagosSaldosEnvargos_textFieldBuscarReciboPorClienteKeyPressed

    private void check_saldoAntesDeFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_saldoAntesDeFechaActionPerformed
        int montoAAbonarMasMontoAbonado = Integer.parseInt(
                panelPagos_textFieldMontoAAbonar.getText())
                + Integer.parseInt(panelPagos_textFieldMontoAbonado.getText());
        ProcesoCampoMontoSaldar(Integer.toString(
                montoAAbonarMasMontoAbonado));
        panelPagos_textFieldGanancia.setText(panelSaldos_textFieldGananciaTotalSaldo
                .getText());
        panelPagos_botonPasarAbono.setEnabled(check_saldoAntesDeFecha.isSelected());
        panelPagos_botonProcesarAbono.setEnabled(!check_saldoAntesDeFecha.isSelected());
    }//GEN-LAST:event_check_saldoAntesDeFechaActionPerformed

    private void panelPagos_textFieldMontoAAbonarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelPagos_textFieldMontoAAbonarFocusGained
        panelPagos_texFieldCantidadCuotasRst.setText(tmpCuotasRst);
        panelPagos_textFieldMontoRestante.setText(Integer.toString(tmpTotalPagarRst));
        panelPagos_textFieldCuotasAPagar.setText("");
        panelPagos_textFieldMontoAPagar.setText("");
    }//GEN-LAST:event_panelPagos_textFieldMontoAAbonarFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Verifica que haya alguna factura seleccionada.
        if (panelEnvargos_textFieldCodigoFactura.getText().length() > 0) {
            if (Logica.Cuadros_Emergentes.confirmacionDefinida(""
                    + "-Se Sacara la factura del sistema.\n\n") == 0) {
                DataBase.Financiera.FacturaVentaCredito.VentaCredito.Update.ventaCreditoCambiarEstado(
                        panelSacarDelSistema_textFieldCodigoFactura.getText(), "3");
                limpiarVentana();
                panelAtrasos.LimpiarVentana();
                panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.setText("");
                Logica.Cuadros_Emergentes.completado();
                ocultarPanelesVer();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JCheckBox check_saldoAntesDeFecha;
    private static javax.swing.JButton jButton1;
    public static javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private static javax.swing.JButton panelEnvargos_botonProcesarEnvargo;
    private static javax.swing.JTextField panelEnvargos_texFieldCostoFactura;
    private static javax.swing.JTextField panelEnvargos_texFieldCostoFacturaRestante;
    private static javax.swing.JTextField panelEnvargos_textFieldCodigoFactura;
    private static javax.swing.JTextField panelEnvargos_textFieldCodigoProducto;
    private static javax.swing.JTextField panelEnvargos_textFieldCostoProducto;
    private static javax.swing.JTextField panelEnvargos_textFieldPrecioProducto;
    private javax.swing.JButton panelPagosSaldosEnvargos_botonClientesAtrasados;
    private javax.swing.JButton panelPagosSaldosEnvargos_botonHIstorialEnvargos;
    private javax.swing.JButton panelPagosSaldosEnvargos_botonHIstorialEnvargos1;
    private javax.swing.JButton panelPagosSaldosEnvargos_botonHistorialPagos;
    private javax.swing.JButton panelPagosSaldosEnvargos_botonHistorialSaldos;
    private javax.swing.JTabbedPane panelPagosSaldosEnvargos_tabbdPanel;
    private static javax.swing.JTextField panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente;
    private static javax.swing.JTextField panelPagosSaldosEnvargos_textFieldBuscarReciboPorID;
    private static javax.swing.JButton panelPagosSaldosEnvargos_verFacturas;
    private static javax.swing.JButton panelPagos_botonPasarAbono;
    private static javax.swing.JButton panelPagos_botonProcesarAbono;
    private static javax.swing.JButton panelPagos_botonProcesarPagos;
    private static javax.swing.JCheckBox panelPagos_checkBox_agregarAtraso;
    private javax.swing.JLabel panelPagos_labelAPagar;
    private javax.swing.JLabel panelPagos_labelAPagar1;
    private javax.swing.JLabel panelPagos_labelAPagar3;
    private javax.swing.JLabel panelPagos_labelAPagar4;
    private static javax.swing.JLabel panelPagos_labelCliente;
    private javax.swing.JLabel panelPagos_labelMontoAPagar;
    private javax.swing.JLabel panelPagos_labelValorCuota;
    private javax.swing.JLabel panelPagos_labelValorCuota1;
    private javax.swing.JLabel panelPagos_labelValorCuota2;
    private javax.swing.JLabel panelPagos_labelValorCuota3;
    private javax.swing.JLabel panelPagos_labelValorCuota4;
    private static javax.swing.JTextField panelPagos_texFieldCantidadCuotasRst;
    private static javax.swing.JTextField panelPagos_texFieldValorCuotas;
    private static javax.swing.JTextField panelPagos_textFieldCodigoFactura;
    private static javax.swing.JTextField panelPagos_textFieldCuotasAPagar;
    private static javax.swing.JTextField panelPagos_textFieldGanancia;
    private static javax.swing.JTextField panelPagos_textFieldMontoAAbonar;
    private static javax.swing.JTextField panelPagos_textFieldMontoAPagar;
    private static javax.swing.JTextField panelPagos_textFieldMontoAbonado;
    private static javax.swing.JTextField panelPagos_textFieldMontoRestante;
    private static javax.swing.JTextField panelSacarDelSistema_textFieldCodigoFactura;
    private static javax.swing.JButton panelSaldos_botonProcesarSaldo;
    private static javax.swing.JCheckBox panelSaldos_checkBox_agregarAtraso;
    private javax.swing.JLabel panelSaldos_labelMontoParaSaldar;
    private javax.swing.JLabel panelSaldos_labelMontoParaSaldar1;
    private static javax.swing.JTextField panelSaldos_texFieldCostoFactura;
    private static javax.swing.JTextField panelSaldos_texFieldCostoFacturaRestante;
    private static javax.swing.JTextField panelSaldos_textFieldCodigoFactura;
    private static javax.swing.JTextField panelSaldos_textFieldGananciaTotalSaldo;
    private static javax.swing.JTextField panelSaldos_textFieldMontoParaSaldar;
    // End of variables declaration//GEN-END:variables

    private void detallesComponentes() {
        //MAYUSCULA campos de texto
        Campo_mayuscula.campoTextoMayuscula(panelEnvargos_textFieldCodigoProducto);

        panelPagosSaldosEnvargos_verFacturas.setVisible(false);
        panelPagos_textFieldCodigoFactura.setEditable(false);
        panelPagos_texFieldValorCuotas.setEditable(false);
        panelPagos_textFieldMontoRestante.setEditable(false);
        panelPagos_textFieldGanancia.setEditable(false);
        panelSaldos_textFieldGananciaTotalSaldo.setEditable(false);
        panelPagos_texFieldCantidadCuotasRst.setEditable(false);
        panelPagos_botonPasarAbono.setEnabled(false);

        //Tabla
        tabla = new javax.swing.JTable();
        model = (javax.swing.table.DefaultTableModel) tabla.getModel();
        pane = new javax.swing.JScrollPane(tabla);
        pane.setBounds(10, 40, 430, 133);
        this.add(pane);

        //Evento Tabla
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelPagosSaldosEnvargos_verFacturas.setVisible(false);
                if (!(Logica.tablas.Tabla_verificarFilaSeleccionada.rowSelectedNotEmpty(tabla))) {
                    String idVentaCredito = (String) tabla.getValueAt(tabla.getSelectedRow(), 0);
                    java.sql.ResultSet rs = DataBase.Financiera.FacturaVentaCredito.Detalle.Select.detalleFacturaCredito(idVentaCredito);
                    datosRecibo(rs);
                    procesoDatosRecivoAtraso(rs);
                }
            }
        });

        //Fuentes Tabla
        tabla.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 12));

        //Columnas Header Tabla
        String header[] = {"No.", "Creacion", "total"};
        for (String titulos : header) {
            model.addColumn(titulos);
        }

        //TIPO campo de texto
        Campo_tipoNumero.campoTextoTipoNumero(panelPagos_textFieldCuotasAPagar);
        Campo_tipoNumero.campoTextoTipoNumero(panelPagos_textFieldMontoAPagar);
        Campo_tipoNumero.campoTextoTipoNumero(panelSaldos_textFieldMontoParaSaldar);
        Campo_tipoNumero.campoTextoTipoNumero(panelSaldos_textFieldGananciaTotalSaldo);
        Campo_tipoNumero.campoTextoTipoNumero(panelPagos_textFieldMontoAAbonar);
        Campo_tipoNumero.campoTextoTipoNumero(panelPagosSaldosEnvargos_textFieldBuscarReciboPorID);

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelPagos_textFieldCuotasAPagar, 1);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelPagos_textFieldMontoAPagar, 4);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelSaldos_textFieldMontoParaSaldar, 4);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelSaldos_textFieldGananciaTotalSaldo, 4);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelPagos_textFieldMontoAAbonar, 5);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelPagosSaldosEnvargos_textFieldBuscarReciboPorID, 5);

        //FUENTES campos de texto
        jFormattedTextField1.setFont(new java.awt.Font("Tahoma", 0, 15));

        //AutoCompletar textfield
        Diseño.Facturacion.paneles_base.panelBase_CompraVenta.autoCompleterCampoClienteDistribuidor(panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente, true, "campo_pse_clienteDistribuidor");

        jFormattedTextField1.setText(Logica.fechaHora.getFecha());

        //PANELES
        add(panelAbonos);
        panelAbonos.setVisible(false);
        add(panelAtrasos);
        panelAtrasos.setVisible(false);
    }

    public static void ocultarPanelesVer() {
        panelAbonos.setVisible(false);
        panelAtrasos.setVisible(false);
    }

    //Recibe un ResultSet con los detalles de un recibo, luego llena los paneles
    //de abonoAPagos, saldos y envargos.
    private static void datosRecibo(java.sql.ResultSet rs) {
        panelPagos_textFieldCuotasAPagar.setText("");
        panelPagos_textFieldMontoAPagar.setText("");
        try {
            rs.next();
            tmpTotalPagarRst = rs.getInt("totalPagarRst");
            tmpCuotasRst = rs.getString("cantidadCuotasRst");
            tmpGananciaCuotas = rs.getInt("gananciaPagos");
            tmpMontoAbonado = DataBase.Financiera.abonoAPago.Select.abonosDePagoDeFactura(
                    rs.getString("facturaVentaCredito_idFacturaVentaCredito"));

            //Llenar los campos de ABONOS:
            //Verificar si el tmpMontoAbonado es null, en caso de ser asi se
            //coloca 0 para que no lance un exception al momento de
            //agregarce la cantidad abonada y esta se reste con el campo
            //panelPagos_textFieldMontoAbonado.
            panelPagos_textFieldMontoAbonado.setText(tmpMontoAbonado == null
                    ? "0"
                    : tmpMontoAbonado
            );
            //Verificar si el resivo que se a buscado es con o sin cuotas
            //por medio de la variable 'tmpGananciaCuotas'.
            panelPagos_textFieldMontoAAbonar.setEnabled((tmpGananciaCuotas != 0));

            //llenar el panel de SALDOS:
            panelSaldos_textFieldCodigoFactura.setText(
                    rs.getString("facturaVentaCredito_idFacturaVentaCredito"));
            panelSaldos_texFieldCostoFactura.setText(rs.getString("sumatoriaCostos"));
            if (panelSaldos_texFieldCostoFactura.getText().length() <= 0) {
                panelSaldos_texFieldCostoFactura.setText("0");
            }

            panelSaldos_textFieldMontoParaSaldar.setText(rs.getString("totalPagarRst"));
            tmpTotalGananciasRst = rs.getInt("facturaVentaCredito.cuotas") == 0
                    ? (rs.getInt("totalPagar") - rs.getInt("sumatoriaCostos"))
                    : (rs.getInt("gananciaPagos")
                    * Integer.parseInt(rs.getString("cantidadCuotasRst")));
            panelSaldos_textFieldGananciaTotalSaldo.setText(
                    Integer.toString(tmpTotalGananciasRst));

            //llenar el panel de ENVARGOS:
            panelEnvargos_textFieldCodigoFactura.setText(rs.getString("facturaVentaCredito_idFacturaVentaCredito"));
            panelEnvargos_texFieldCostoFactura.setText(rs.getString("sumatoriaCostos"));
            if (panelEnvargos_texFieldCostoFactura.getText().length() <= 0) {
                panelEnvargos_texFieldCostoFactura.setText("0");
            }
            panelEnvargos_textFieldCodigoProducto.setText("ENBG-" + panelEnvargos_textFieldCodigoFactura.getText());

            //Llenar el panel de SACAR RECIVO DEL SISTEMA
            panelSacarDelSistema_textFieldCodigoFactura.setText(panelSaldos_textFieldCodigoFactura.getText());
            jButton1.setEnabled(Logica.CredencialesDeUsuario.getPrivilegio() == 1);

            //Si la factura es con cuotas se le pasa como costo al nuevo 
            //producto la sumatoria de todos los abonoAPagos menos la ganancia
            //de cada uno en cambio, si el sin cuotas se le pasa directamente el
            //costo del producto.
            if (!(Integer.parseInt(panelSaldos_textFieldGananciaTotalSaldo.getText()) == 0)) {
                panelEnvargos_textFieldCostoProducto.setText(Integer.toString(Integer.parseInt(panelSaldos_textFieldMontoParaSaldar.getText()) - Integer.parseInt(panelSaldos_textFieldGananciaTotalSaldo.getText())));
            } else {
                panelEnvargos_textFieldCostoProducto.setText(panelEnvargos_texFieldCostoFactura.getText());
            }

            //llenar el panel de PAGOS:
            panelPagos_texFieldValorCuotas.setText(rs.getString("cuotas"));
            panelPagos_textFieldCodigoFactura.setText(rs.getString("facturaVentaCredito_idFacturaVentaCredito"));

            panelPagos_textFieldMontoRestante.setText(rs.getString("totalPagarRst"));
            //En caso de que la factura sea sin o con cuotas:
            if ((panelPagos_texFieldValorCuotas.getText().equals("0"))) {
                panelPagos_textFieldGanancia.setText("0");
                panelPagos_textFieldCuotasAPagar.setText("0");
                panelPagos_texFieldCantidadCuotasRst.setText("0");
                tmpMontoRst = panelPagos_textFieldMontoRestante.getText();
                panelPagos_textFieldCuotasAPagar.setEditable(false);
            } else {
                panelPagos_textFieldGanancia.setText(Integer.toString(tmpGananciaCuotas));
                panelPagos_texFieldCantidadCuotasRst.setText(tmpCuotasRst);
                panelPagos_textFieldCuotasAPagar.setEditable(true);
                tmpMontoRst = Integer.toString(Integer.parseInt(panelPagos_texFieldCantidadCuotasRst.getText())
                        * Integer.parseInt(panelPagos_texFieldValorCuotas.getText()));
            }
            idCliente = rs.getString("cliente_idCliente");
            panelPagosSaldosEnvargos_verFacturas.setVisible(true);
            //Muestra el panel de atrasos con los datos del recivo
            ocultarPanelesVer();
            panelAtrasos.setVisible(true);

            //ESTE COMPONENTE ES DE SALDOS, PERO NO SE COLOCA JUNTO CON LOS DEMAS
            //PORQUE NECESITO QUE SE INICIALESEN UNOS COMPONENTES DE PAGO ANTES
            //DE EJECUTAR ESTE.
            if (panelPagos_texFieldValorCuotas.getText().equals("0")) {
                panelSaldos_texFieldCostoFacturaRestante.setText(
                        Integer.toString(
                                Integer.parseInt(panelSaldos_texFieldCostoFactura.getText())
                                - rs.getInt("facturaVentaCredito.inicial")
                        )
                );
            } else {
                panelSaldos_texFieldCostoFacturaRestante.setText(
                        Integer.toString((tmpTotalPagarRst
                                - (tmpGananciaCuotas
                                * Integer.parseInt(tmpCuotasRst)))));
            }
            //Si el costo restante es menor a 0 se muestra un 0 para no mostrar
            //numeros negativos.
            panelSaldos_texFieldCostoFacturaRestante.setText(
                    Integer.parseInt(
                            panelSaldos_texFieldCostoFacturaRestante
                                    .getText()) < 0
                            ? "0"
                            : panelSaldos_texFieldCostoFacturaRestante
                                    .getText());
            //ESTE COMPONENTE ES DE ENVARGO, PERO NO SE COLOCA JUNTO CON LOS DEMAS
            //PORQUE NECESITO QUE SE INICIALESEN UNOS COMPONENTES DE SALDO ANTES
            //DE EJECUTAR ESTE.
            panelEnvargos_texFieldCostoFacturaRestante.setText(
                    panelSaldos_texFieldCostoFacturaRestante.getText());
        } catch (java.sql.SQLException | java.lang.NumberFormatException ex) {
            Logica.Cuadros_Emergentes.alerta("Numero de recivo NO valido.");
            limpiarVentana();
        }
    }

    /**
     * Llena los datos de la ventana con el id de la factura pasado por
     * parametro.
     *
     * @param idFactura
     * @param limpiarTabla
     */
    public static void llenarVentanaConIdFactura(String idFactura, boolean limpiarTabla) {
        limpiarVentana();
        try {
            java.sql.ResultSet rs = DataBase.Financiera.FacturaVentaCredito.Detalle.Select
                    .detalleFacturaCredito(idFactura);
            panelPagosSaldosEnvargos_textFieldBuscarReciboPorID.setText("");
            panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.setText("");
            datosRecibo(rs);
            if (limpiarTabla) {
                procesoDatosRecivoAtraso(rs);
            }
            rs = DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.todasFacturasActivasDeClienteId(idCliente);
            actualizarLlenarTabla(rs);
            panelAtrasos.model.setValueAt(panelPagos_labelCliente.getText(), 0, 0);
        } catch (java.lang.StringIndexOutOfBoundsException ex) {
            Logica.Cuadros_Emergentes.alerta("Numero de recivo NO valido.");
        }
    }

    //llena la tabla con los datos recibidos por el ResultSet.
    private static void actualizarLlenarTabla(java.sql.ResultSet rs) {
        try {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("idVentaCredito"),
                    rs.getString("fecha"),
                    rs.getString("totalPagar")
                });
                panelPagos_labelCliente.setText(rs.getString("nombreCliente") + " " + rs.getString("apellidoCliente"));
            }
            rs.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    //Limpia toda la ventana
    private static void limpiarVentana() {
        panelPagosSaldosEnvargos_verFacturas.setVisible(false);

        panelPagos_texFieldValorCuotas.setText("");
        panelPagos_textFieldCodigoFactura.setText("");
        panelPagos_textFieldCuotasAPagar.setText("");
        panelPagos_textFieldMontoAPagar.setText("");
        panelPagos_texFieldCantidadCuotasRst.setText("");
        panelPagos_textFieldMontoRestante.setText("");
        panelPagos_textFieldGanancia.setText("");
        panelPagos_labelCliente.setText("");
        panelPagos_checkBox_agregarAtraso.setEnabled(false);
        panelPagos_checkBox_agregarAtraso.setSelected(false);
        panelPagos_botonProcesarPagos.setEnabled(true);
        check_saldoAntesDeFecha.setSelected(false);
        check_saldoAntesDeFecha.setEnabled(false);

        panelPagos_textFieldCuotasAPagar.setEnabled(true);
        panelPagos_textFieldMontoAPagar.setEnabled(true);

        panelSaldos_texFieldCostoFacturaRestante.setText("");
        panelSaldos_textFieldCodigoFactura.setText("");
        panelSaldos_texFieldCostoFactura.setText("");
        panelSaldos_textFieldMontoParaSaldar.setText("");
        panelSaldos_textFieldGananciaTotalSaldo.setText("");

        panelEnvargos_texFieldCostoFacturaRestante.setText("");
        panelEnvargos_textFieldCodigoFactura.setText("");
        panelEnvargos_texFieldCostoFactura.setText("");
        panelEnvargos_textFieldCodigoProducto.setText("");
        panelEnvargos_textFieldCostoProducto.setText("");
        panelEnvargos_textFieldPrecioProducto.setText("");

        panelSacarDelSistema_textFieldCodigoFactura.setText("");

        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(model, tabla);

        jFormattedTextField1.setText(Logica.fechaHora.getFecha());

        tmpCuotasRst = "";
        tmpMontoRst = "";
        tmpMontoAbonado = "";
        tmpGananciaCuotas = 0;

        panelPagos_textFieldMontoAAbonar.setText("");
        panelPagos_textFieldMontoAAbonar.setEnabled(false);
        panelPagos_textFieldMontoAbonado.setText("0");

        if (panelPagos_botonProcesarAbono.isEnabled()) {
            panelPagos_botonProcesarAbono.setEnabled(false);
        }
        if (panelPagos_botonPasarAbono.isEnabled()) {
            panelPagos_botonPasarAbono.setEnabled(false);
        }
    }

    //Limpiar la ventana
    private void procesoLlmadoMetodosDeLimpiado() {
        limpiarVentana();
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorCliente.setText("");
        panelPagosSaldosEnvargos_textFieldBuscarReciboPorID.setText("");
    }

    //Este procesoPago fue creado para que si se quiere llamar al procesoPago
    //'procesoPasarAbono(int)' dependiendo de si se quiere invocar al JDialog o
    //no se pueda alternar entre uno y otro.
    private boolean invocarJDialogAntesDePasarAbono(boolean llamarJDialog, String monto, int tipo) {
        if (llamarJDialog) {
            if ((Logica.Cuadros_Emergentes.Transacciones(monto)) == 0) {
                procesoPasarAbono(tipo);
                return true;
            }
        } else {
            procesoPasarAbono(tipo);
            return false;
        }
        return false;
    }

    private void ProcesoCampoMontoSaldar(String monto) {
        panelSaldos_textFieldGananciaTotalSaldo.setText(
                Integer.toString(
                        tmpTotalGananciasRst - (tmpTotalPagarRst
                        - Integer.parseInt(monto)))
        );
    }

    //Hace el proceso de agregar los datos al panel de atrasos del recivo
    //seleccionado.
    private static void procesoDatosRecivoAtraso(java.sql.ResultSet rs) {
        Logica.tablas.Tabla_limpiarFilas.limpiarTabla(panelAtrasos.model, panelAtrasos.tabla);
        panelAtrasos.procesoAgregarRecivo(rs, 0, true);
        panelAtrasos.LlenarDatosAtrasoDeRecivo(panelPagos_textFieldCodigoFactura.getText());
    }

    //Pasa los datos de abono a la base de datos.
    private boolean procesoPasarAbono(int tipo) {
        int montoAAbonarMasMontoAbonado = Integer.parseInt(
                panelPagos_textFieldMontoAAbonar.getText())
                + Integer.parseInt(panelPagos_textFieldMontoAbonado.getText());
        switch (tipo) {
            //Verifico si se esta llamando desde el boton de "PasarAbono" O desde el boton "PasarPago"
            case 1:
                DataBase.Financiera.abonoAPago.Insert.abonoAPagos(new String[]{
                    panelPagos_textFieldCodigoFactura.getText(),
                    //En este parametro se pueden dar 2 casos, uno en el que sea
                    //menor al valor de 1 cuota o mayor al valor de 1 cuota, en
                    //caso de que sea menor solo se almacenará el nuevo valor de
                    //el abono y en segundo caso de que sea mayor al valor de 1
                    //cuota se guardara la diferencia de la sumatoria de el
                    //abono y la cantidad abonada menos el valor de 1 cuota.
                    montoAAbonarMasMontoAbonado
                    > Integer.parseInt(panelPagos_texFieldValorCuotas.getText())
                    ? (Integer.toString(montoAAbonarMasMontoAbonado
                    % Integer.parseInt(panelPagos_texFieldValorCuotas
                    .getText())))
                    : panelPagos_textFieldMontoAAbonar.getText()
                }, jFormattedTextField1.getText());
                //Agregar el cuotas a la caja
                Logica.gestiosDineroCaja.agregarMontos(
                        panelPagos_textFieldMontoAAbonar.getText(),
                        true,
                        jFormattedTextField1.getText());
                break;
            case 2:
                //Procesar los datos de abono al pago:
                //En este caso hay dos alternativas, si al momento de pasar el
                //abono a pago la sumatoria de los campos 'montoAAbonar' y
                //'MontoAbonado' es igual al valor de 1 cuota exactamente se
                //hará un pago normal. Pero en caso de que la  sumatoria de los
                //campos mencionados anteriosmente sea MAYOR al valor de una
                //cuota, aparte de crearse el pago tambien se creara un nuevo
                //abono con el valor extra de el resultado de la sumatoria de
                //los campos.
                if (montoAAbonarMasMontoAbonado
                        == Integer.parseInt(panelPagos_texFieldValorCuotas.getText())) {
                    procesoPago(1, "1", panelPagos_textFieldMontoAPagar.getText());
                } else {
                    int cantidadCuotas = montoAAbonarMasMontoAbonado
                            / Integer.parseInt(panelPagos_texFieldValorCuotas
                                    .getText());
                    procesoPago(cantidadCuotas,
                            "1",
                            panelPagos_textFieldMontoAPagar.getText());
                }
                invocarJDialogAntesDePasarAbono(false, null, 3);
                break;
            case 3:
                //Crea un abono con el cuotas abonado solo para que quede
                //registro de el dinero que entro en la caja
                int cuotas = (montoAAbonarMasMontoAbonado
                        / Integer.parseInt(panelPagos_texFieldValorCuotas.getText()));
                int abono = Integer.parseInt(
                        panelPagos_texFieldValorCuotas.getText()) * cuotas;
                abonoRestante = montoAAbonarMasMontoAbonado - abono;

                DataBase.Financiera.abonoAPago.Insert.abonoAPagos(new String[]{
                    panelPagos_textFieldCodigoFactura.getText(),
                    Integer.toString(abono)
                }, jFormattedTextField1.getText());

                if (abonoRestante != 0) {
                    DataBase.Financiera.abonoAPago.Insert.abonoAPagos(new String[]{
                        panelPagos_textFieldCodigoFactura.getText(),
                        Integer.toString(abonoRestante
                        - Integer.parseInt(panelPagos_textFieldMontoAbonado
                        .getText()))
                    }, jFormattedTextField1.getText());
                }
                //Agregar el cuotas a la caja
                Logica.gestiosDineroCaja.agregarMontos(
                        panelPagos_textFieldMontoAAbonar.getText(),
                        true,
                        jFormattedTextField1.getText());
                break;
            //En caso de que solo se quiera comprobar que todo este bien en el
            //formulario se retorna true.
            case 4:
                return true;
            default:
                break;
        }
        return false;
    }

    //Este procesoPago hace el proceso de pasar el pago a la base de datos, lo
    //hago de esta manera porque se llama de 2 lugares diferentes
    private void procesoPago(int cantidadCuotas, String pagoPorAbono, String montoPago) {
        procesoPago(
                Integer.toString(cantidadCuotas),
                pagoPorAbono,
                montoPago,
                Integer.toString(
                        Integer.parseInt(panelPagos_textFieldMontoRestante.getText())),
                false);
    }

    //Este procesoPago hace el proceso de pago a factura. pasa los datos a las
    //tablas correspondientes y disminuye el cuotas correspondiente al costo
    //restante de la factura. Lo mantengo aqui porque se llamaran desde lugares
    //distintos.
    private boolean procesoPago(String montoOCuotas, String pagoPorAbono, String montoPago, String montoRestante, boolean tipoPago) {
        //Pasar los datos a la tabla 'Pagos'
        if (DataBase.Financiera.Pagos.Insert.pagos(new String[]{
            panelPagos_textFieldCodigoFactura.getText(),
            montoOCuotas,
            montoPago,
            pagoPorAbono},
                jFormattedTextField1.getText())) {
            //Actualiza el cuotas restantes y la cantidad de cuotas restantes de esta factura:
            DataBase.Financiera.FacturaVentaCredito.Restantes.Update.RestantesVentaCredito(
                    new String[]{
                        panelPagos_textFieldCodigoFactura.getText(),
                        montoRestante,
                        panelPagos_texFieldCantidadCuotasRst.getText()});
            String monto = (tipoPago) ? panelPagos_textFieldMontoAPagar.getText() : panelPagos_textFieldMontoAAbonar.getText();
            //Agregar el cuotas a la caja
            Logica.gestiosDineroCaja.agregarMontos(monto, true, jFormattedTextField1.getText());
            //disminuye el cuotas de costo de las facturas a creditos activas si la factura es con cuotas
            if (Integer.parseInt(panelPagos_textFieldGanancia.getText()) > 0) {
                DataBase.Financiera.DatosFinanciera.Update.CambiarCostoFacturasActivas(
                        (Integer.parseInt(panelPagos_texFieldValorCuotas.getText())
                        * Integer.parseInt(montoOCuotas))
                        - Integer.parseInt(panelPagos_textFieldGanancia.getText()),
                        false);
                //Actualizar y limpiar la tabla de 'Clientes con facturas de vents activas'
                Diseño.Financiera.paneles_pantallaPrincipal.panel_ClientesPendientes
                        .actualizarLabelsTotalTacturasActivasYCostos();
            }
            return true;
        } else {
            Logica.Cuadros_Emergentes.alerta("Un error a ocurrido al momento de"
                    + " ingresar el pago, recomendaciones:\n"
                    + "-Verificar los valores ingresados.\n"
                    + "-Reiniciar el sistema y volver a realizar los pasos.\n"
                    + "-Contactar con el programador.");
            return false;
        }
    }

    //Este metodo es el funcionamiento de el boton de Pasar Saldo, pero solo para
    //cuando es la ultima cuota, en caso de que se haga el pago antes de fecha de
    //parte de los pagos y se quiera hacer una rebaja se, se agrega este metodo 
    //para dicho caso.
    private void ProcesoSaldoPorAbono() {
        //vuelve todos los abonos registrados a false para que no se cuenten en futuros abonos.
        DataBase.Financiera.abonoAPago.Update.actualizarAbonoAPagoAFalse(panelPagos_textFieldCodigoFactura.getText());
        Diseño.Financiera.paneles_ver.panel_verAbonos.llenarTablaDesdeFuera();
        //Procesar el Saldo
        String montoParaSaldar = Integer.toString(Integer.parseInt(panelPagos_textFieldMontoAAbonar.getText())
                + Integer.parseInt(panelPagos_textFieldMontoAbonado.getText()));
        procesoSaldo(montoParaSaldar, panelPagos_textFieldGanancia.getText(),
                false);
        //Mostrar ReportesConDB
        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
        try (java.sql.ResultSet rs = DataBase.Financiera.saldos.Select.saldoFacturaVentaCredito("")) {
            rs.next();
            parametros.put("id", rs.getInt("saldos.idSaldos"));
            parametros.put("montoAbonado", panelPagos_textFieldMontoAAbonar.getText());
            Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                    parametros,
                    "Financiera\\ComprobanteSaldoPorAbono",
                    false);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        procesoLlmadoMetodosDeLimpiado();
        Logica.Cuadros_Emergentes.completado();
    }

    //Este procesoPago hace el proceso de saldo. Pasa los datos a las tablas
    //correspondientes y disminuye el cuotas correspondiente al costo restante de
    //la factura. Lo mantengo aqui porque se llamaran desde lugares distintos.
    private void procesoSaldo(String MontoParaSaldar, String gananciaTotalSaldo, boolean tipoSaldo) {
        //Pasar los datos a la tabla 'saldos'
        DataBase.Financiera.saldos.Insert.saldos(new String[]{
            panelSaldos_textFieldCodigoFactura.getText(),
            MontoParaSaldar,
            gananciaTotalSaldo
        }, jFormattedTextField1.getText());
        //Desactiva la factura venta credito para que no aparezca mas.
        DataBase.Financiera.FacturaVentaCredito.VentaCredito.Update.ventaCreditoCambiarEstado(panelSaldos_textFieldCodigoFactura.getText(), "2");
        //Agregar el cuotas a la caja
        String monto = (tipoSaldo) ? panelSaldos_textFieldMontoParaSaldar.getText() : panelPagos_textFieldMontoAAbonar.getText();
        Logica.gestiosDineroCaja.agregarMontos(monto, true, jFormattedTextField1.getText());

        //disminuye el cuotas de costo de las facturas a creditos activas si la factura es con cuotas
        DataBase.Financiera.DatosFinanciera.Update.CambiarCostoFacturasActivas(
                Integer.parseInt(panelSaldos_texFieldCostoFacturaRestante.getText()),
                false);
        //Actualizar y limpiar la tabla de 'Clientes con facturas de ventas activas'
        Diseño.Financiera.paneles_pantallaPrincipal.panel_ClientesPendientes
                .actualizarLabelsTotalTacturasActivasYCostos();
    }
}

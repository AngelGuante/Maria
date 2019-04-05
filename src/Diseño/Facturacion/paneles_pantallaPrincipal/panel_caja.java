package Diseño.Facturacion.paneles_pantallaPrincipal;

import Logica.CamposTexto.Campo_limiteDigitosCampo;
import Logica.CamposTexto.Campo_mayuscula;
import Logica.CamposTexto.Campo_tipoLetra;
import Logica.CamposTexto.Campo_tipoNumero;
import javax.swing.table.DefaultTableModel;

public class panel_caja extends Diseño.Facturacion.paneles_base.panelBase {

    public panel_caja() {
        initComponents();
        detallesComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCaja_labelCrearMovimiento = new javax.swing.JLabel();
        panelCaja_separador1 = new javax.swing.JSeparator();
        panelCaja_comboBoxCargadoA = new javax.swing.JComboBox<>();
        panelCaja_textFieldMonto = new javax.swing.JTextField();
        panelCaja_labelMonedaSimbolo = new javax.swing.JLabel();
        panelCaja_comboBoxTipoMovimientoCaja = new javax.swing.JComboBox<>();
        panelCaja_textFieldMotivo = new javax.swing.JTextField();
        panelCaja_botonProcesarMovimiento = new javax.swing.JButton();
        panelCaja_scrollPaneMovimientos = new javax.swing.JScrollPane();
        panelCaja_tablaMovimientos = new javax.swing.JTable();
        panelCaja_textFieldBuscadorMovimiento = new javax.swing.JTextField();
        panelCaja_separador3 = new javax.swing.JSeparator();
        panelCaja_botonImprimirMovimiento = new javax.swing.JButton();
        panelCaja_labelMovimientosEspesificos = new javax.swing.JLabel();
        panelCaja_separador4 = new javax.swing.JSeparator();
        panelCaja_textFieldBuscarMontosDe = new javax.swing.JTextField();
        panelCaja_botonMontoBuscarPorFechaDe = new javax.swing.JButton();
        panelCaja_botonBuscarMontoMovimientoDe = new javax.swing.JButton();
        panelCaja_labelMontoDe = new javax.swing.JLabel();
        panelCaja_labelMonedaSimbolo1 = new javax.swing.JLabel();
        panelCaja_comboBoxTipoMovimientoEmpleado = new javax.swing.JComboBox<>();
        panelCaja_comboBoxTipoMovimientoDefault = new javax.swing.JComboBox<>();
        panelCaja_botonEliminarMovimiento = new javax.swing.JButton();
        panelCaja_botonModificarMovimiento = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panelCaja_botonCerrarCuadre = new javax.swing.JButton();
        panelCaja_textFieldFechaCuadreInicio = new javax.swing.JFormattedTextField();
        panelCaja_botonBuscarCuadre = new javax.swing.JButton();
        panelCaja_lalbelMontoPrestamos = new javax.swing.JLabel();
        panelCaja_labelMontoVentas = new javax.swing.JLabel();
        panelCaja_lalbelMontoMicelaneos = new javax.swing.JLabel();
        panelCaja_labelCompras = new javax.swing.JLabel();
        panelCaja_labelMicelaneos = new javax.swing.JLabel();
        panelCaja_labelSueldos = new javax.swing.JLabel();
        panelCaja_labelPrestamos = new javax.swing.JLabel();
        panelCaja_labelRetirosDeCaja = new javax.swing.JLabel();
        panelCaja_labelMontoCompras = new javax.swing.JLabel();
        panelCaja_lalbelMontoSueldos = new javax.swing.JLabel();
        panelCaja_lalbelMontoSalidaCaja = new javax.swing.JLabel();
        panelCaja_textFieldMontoEnCaja = new javax.swing.JTextField();
        panelCaja_labelVentas = new javax.swing.JLabel();
        panelCaja_textFieldInicioCon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        panelCaja_labelPagoPrestamos = new javax.swing.JLabel();
        panelCaja_lalbelMontoPagosPrestamos = new javax.swing.JLabel();
        panelCaja_labelOtrosBeneficios = new javax.swing.JLabel();
        panelCaja_lalbelMontoOtrosBeneficios = new javax.swing.JLabel();
        panelCaja_labelEntradaACaja = new javax.swing.JLabel();
        panelCaja_lalbelMontoEntradaACaja = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelCaja_labelRetirosDeCaja1 = new javax.swing.JLabel();
        panelCaja_lalbelMontoPagoFactura = new javax.swing.JLabel();
        panelCaja_labelIniciales = new javax.swing.JLabel();
        panelCaja_lalbelMontoIniciales = new javax.swing.JLabel();
        panelCaja_labelPagos = new javax.swing.JLabel();
        panelCaja_lalbelMontoPagos = new javax.swing.JLabel();
        panelCaja_labelAbonos = new javax.swing.JLabel();
        panelCaja_lalbelMontoAbonos = new javax.swing.JLabel();
        panelCaja_labelSaldos = new javax.swing.JLabel();
        panelCaja_lalbelMontoSaldos = new javax.swing.JLabel();
        panelCaja_labelSaldos1 = new javax.swing.JLabel();
        panelCaja_lalbelMoras = new javax.swing.JLabel();
        panelCaja_textFieldFechaCuadreFin = new javax.swing.JFormattedTextField();
        panelCaja_lalbel_sumatoriaMontosEntrada = new javax.swing.JLabel();
        panelCaja_labelMontoCompras1 = new javax.swing.JLabel();
        panelCaja_lalbel_sumatoriaMontosSalida = new javax.swing.JLabel();
        panelCaja_labelCuandreDeCaja = new javax.swing.JLabel();
        panelCaja_separador5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        panelCaja_labelCargadoA1 = new javax.swing.JLabel();
        panelCaja_labelMotivo1 = new javax.swing.JLabel();
        panelCaja_textFieldFecha = new javax.swing.JFormattedTextField();
        panelCaja_label = new javax.swing.JLabel();

        setToolTipText("");
        setLayout(null);

        panelCaja_labelCrearMovimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCaja_labelCrearMovimiento.setText("CREAR MOVIMIENTO");
        add(panelCaja_labelCrearMovimiento);
        panelCaja_labelCrearMovimiento.setBounds(10, 11, 412, 15);

        panelCaja_separador1.setBackground(new java.awt.Color(0, 0, 0));
        panelCaja_separador1.setForeground(new java.awt.Color(0, 0, 0));
        add(panelCaja_separador1);
        panelCaja_separador1.setBounds(10, 32, 127, 10);

        panelCaja_comboBoxCargadoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        panelCaja_comboBoxCargadoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCaja_comboBoxCargadoAActionPerformed(evt);
            }
        });
        add(panelCaja_comboBoxCargadoA);
        panelCaja_comboBoxCargadoA.setBounds(80, 50, 420, 30);

        panelCaja_textFieldMonto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelCaja_textFieldMonto.setForeground(new java.awt.Color(0, 153, 204));
        panelCaja_textFieldMonto.setPreferredSize(new java.awt.Dimension(77, 25));
        add(panelCaja_textFieldMonto);
        panelCaja_textFieldMonto.setBounds(770, 50, 77, 30);

        panelCaja_labelMonedaSimbolo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCaja_labelMonedaSimbolo.setText("$");
        add(panelCaja_labelMonedaSimbolo);
        panelCaja_labelMonedaSimbolo.setBounds(850, 60, 8, 15);

        panelCaja_comboBoxTipoMovimientoCaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"<Tipo de movimiento>", "Entrada a caja", "Otro benefico", "Salida de caja", "Gasto micelaneo"}));
        add(panelCaja_comboBoxTipoMovimientoCaja);
        panelCaja_comboBoxTipoMovimientoCaja.setBounds(500, 50, 270, 30);

        panelCaja_textFieldMotivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelCaja_textFieldMotivo.setForeground(new java.awt.Color(0, 153, 255));
        add(panelCaja_textFieldMotivo);
        panelCaja_textFieldMotivo.setBounds(62, 89, 360, 30);

        panelCaja_botonProcesarMovimiento.setBackground(new java.awt.Color(102, 204, 255));
        panelCaja_botonProcesarMovimiento.setForeground(new java.awt.Color(0, 51, 153));
        panelCaja_botonProcesarMovimiento.setText("Procesar");
        panelCaja_botonProcesarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCaja_botonProcesarMovimientoActionPerformed(evt);
            }
        });
        add(panelCaja_botonProcesarMovimiento);
        panelCaja_botonProcesarMovimiento.setBounds(428, 91, 100, 30);

        panelCaja_tablaMovimientos.setModel(new javax.swing.table.DefaultTableModel(
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
                "No.", "Motivo", "Fecha - Hora", "Tipo", "Monto"
            }
        ));
        panelCaja_tablaMovimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelCaja_tablaMovimientosMouseReleased(evt);
            }
        });
        panelCaja_scrollPaneMovimientos.setViewportView(panelCaja_tablaMovimientos);

        add(panelCaja_scrollPaneMovimientos);
        panelCaja_scrollPaneMovimientos.setBounds(10, 160, 860, 112);

        panelCaja_textFieldBuscadorMovimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCaja_textFieldBuscadorMovimiento.setForeground(new java.awt.Color(0, 153, 204));
        panelCaja_textFieldBuscadorMovimiento.setMinimumSize(new java.awt.Dimension(6, 25));
        panelCaja_textFieldBuscadorMovimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelCaja_textFieldBuscadorMovimientoKeyReleased(evt);
            }
        });
        add(panelCaja_textFieldBuscadorMovimiento);
        panelCaja_textFieldBuscadorMovimiento.setBounds(10, 130, 247, 30);

        panelCaja_separador3.setBackground(new java.awt.Color(0, 0, 0));
        panelCaja_separador3.setForeground(new java.awt.Color(0, 0, 0));
        add(panelCaja_separador3);
        panelCaja_separador3.setBounds(-20, 130, 964, 10);

        panelCaja_botonImprimirMovimiento.setForeground(new java.awt.Color(0, 102, 204));
        panelCaja_botonImprimirMovimiento.setText("Imprimir movimiento");
        panelCaja_botonImprimirMovimiento.setEnabled(false);
        add(panelCaja_botonImprimirMovimiento);
        panelCaja_botonImprimirMovimiento.setBounds(710, 130, 160, 30);

        panelCaja_labelMovimientosEspesificos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCaja_labelMovimientosEspesificos.setText("Ver monto de movimientos de:");
        add(panelCaja_labelMovimientosEspesificos);
        panelCaja_labelMovimientosEspesificos.setBounds(940, 150, 189, 15);

        panelCaja_separador4.setBackground(new java.awt.Color(0, 0, 0));
        panelCaja_separador4.setForeground(new java.awt.Color(0, 0, 0));
        add(panelCaja_separador4);
        panelCaja_separador4.setBounds(940, 170, 189, 10);
        add(panelCaja_textFieldBuscarMontosDe);
        panelCaja_textFieldBuscarMontosDe.setBounds(940, 180, 180, 20);

        panelCaja_botonMontoBuscarPorFechaDe.setForeground(new java.awt.Color(0, 102, 204));
        panelCaja_botonMontoBuscarPorFechaDe.setText("Rango de fechas");
        add(panelCaja_botonMontoBuscarPorFechaDe);
        panelCaja_botonMontoBuscarPorFechaDe.setBounds(940, 220, 113, 23);

        panelCaja_botonBuscarMontoMovimientoDe.setForeground(new java.awt.Color(0, 102, 204));
        panelCaja_botonBuscarMontoMovimientoDe.setText("Buscar");
        add(panelCaja_botonBuscarMontoMovimientoDe);
        panelCaja_botonBuscarMontoMovimientoDe.setBounds(1050, 220, 65, 23);

        panelCaja_labelMontoDe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCaja_labelMontoDe.setText("9999999");
        add(panelCaja_labelMontoDe);
        panelCaja_labelMontoDe.setBounds(1030, 250, 56, 15);

        panelCaja_labelMonedaSimbolo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCaja_labelMonedaSimbolo1.setText("$");
        add(panelCaja_labelMonedaSimbolo1);
        panelCaja_labelMonedaSimbolo1.setBounds(1090, 250, 8, 15);

        panelCaja_comboBoxTipoMovimientoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"<Tipo de movimiento>", "Pago de prestamo", "Prestamo personal", "Pago de sueldo"}));
        add(panelCaja_comboBoxTipoMovimientoEmpleado);
        panelCaja_comboBoxTipoMovimientoEmpleado.setBounds(500, 50, 270, 30);

        panelCaja_comboBoxTipoMovimientoDefault.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        add(panelCaja_comboBoxTipoMovimientoDefault);
        panelCaja_comboBoxTipoMovimientoDefault.setBounds(500, 50, 270, 30);

        panelCaja_botonEliminarMovimiento.setBackground(new java.awt.Color(255, 102, 102));
        panelCaja_botonEliminarMovimiento.setText("Eliminar");
        panelCaja_botonEliminarMovimiento.setEnabled(false);
        panelCaja_botonEliminarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCaja_botonEliminarMovimientoActionPerformed(evt);
            }
        });
        add(panelCaja_botonEliminarMovimiento);
        panelCaja_botonEliminarMovimiento.setBounds(500, 130, 100, 30);

        panelCaja_botonModificarMovimiento.setText("Modificar");
        panelCaja_botonModificarMovimiento.setEnabled(false);
        panelCaja_botonModificarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCaja_botonModificarMovimientoActionPerformed(evt);
            }
        });
        add(panelCaja_botonModificarMovimiento);
        panelCaja_botonModificarMovimiento.setBounds(600, 130, 100, 30);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setToolTipText(""); // NOI18N
        jPanel1.setLayout(null);

        panelCaja_botonCerrarCuadre.setBackground(new java.awt.Color(51, 153, 255));
        panelCaja_botonCerrarCuadre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_botonCerrarCuadre.setForeground(new java.awt.Color(0, 51, 204));
        panelCaja_botonCerrarCuadre.setText("CERRAR");
        panelCaja_botonCerrarCuadre.setActionCommand("");
        panelCaja_botonCerrarCuadre.setEnabled(false);
        panelCaja_botonCerrarCuadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCaja_botonCerrarCuadreActionPerformed(evt);
            }
        });
        jPanel1.add(panelCaja_botonCerrarCuadre);
        panelCaja_botonCerrarCuadre.setBounds(0, 120, 220, 23);

        panelCaja_textFieldFechaCuadreInicio.setBackground(new java.awt.Color(204, 204, 204));
        panelCaja_textFieldFechaCuadreInicio.setForeground(new java.awt.Color(0, 102, 204));
        try {
            panelCaja_textFieldFechaCuadreInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##. ##. ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelCaja_textFieldFechaCuadreInicio.setText("03. 01. 2017");
        jPanel1.add(panelCaja_textFieldFechaCuadreInicio);
        panelCaja_textFieldFechaCuadreInicio.setBounds(0, 30, 97, 30);

        panelCaja_botonBuscarCuadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/search.png"))); // NOI18N
        panelCaja_botonBuscarCuadre.setToolTipText("");
        panelCaja_botonBuscarCuadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCaja_botonBuscarCuadreActionPerformed(evt);
            }
        });
        jPanel1.add(panelCaja_botonBuscarCuadre);
        panelCaja_botonBuscarCuadre.setBounds(150, 60, 70, 20);

        panelCaja_lalbelMontoPrestamos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoPrestamos.setForeground(new java.awt.Color(255, 0, 0));
        panelCaja_lalbelMontoPrestamos.setText("0");
        panelCaja_lalbelMontoPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoPrestamosMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoPrestamos);
        panelCaja_lalbelMontoPrestamos.setBounds(640, 80, 70, 15);

        panelCaja_labelMontoVentas.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_labelMontoVentas.setForeground(new java.awt.Color(0, 51, 204));
        panelCaja_labelMontoVentas.setText("0");
        panelCaja_labelMontoVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_labelMontoVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_labelMontoVentasMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_labelMontoVentas);
        panelCaja_labelMontoVentas.setBounds(340, 20, 70, 15);

        panelCaja_lalbelMontoMicelaneos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoMicelaneos.setForeground(new java.awt.Color(255, 0, 0));
        panelCaja_lalbelMontoMicelaneos.setText("0");
        panelCaja_lalbelMontoMicelaneos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoMicelaneos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoMicelaneosMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoMicelaneos);
        panelCaja_lalbelMontoMicelaneos.setBounds(640, 40, 70, 15);

        panelCaja_labelCompras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelCompras.setText("COMPRAS_______");
        jPanel1.add(panelCaja_labelCompras);
        panelCaja_labelCompras.setBounds(530, 20, 110, 14);

        panelCaja_labelMicelaneos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelMicelaneos.setText("MICELANEOS_____");
        jPanel1.add(panelCaja_labelMicelaneos);
        panelCaja_labelMicelaneos.setBounds(530, 40, 110, 14);

        panelCaja_labelSueldos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelSueldos.setText("SUELDOS________");
        panelCaja_labelSueldos.setToolTipText("");
        jPanel1.add(panelCaja_labelSueldos);
        panelCaja_labelSueldos.setBounds(530, 60, 110, 14);

        panelCaja_labelPrestamos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelPrestamos.setText("PRESTAMOS_____");
        jPanel1.add(panelCaja_labelPrestamos);
        panelCaja_labelPrestamos.setBounds(530, 80, 110, 14);

        panelCaja_labelRetirosDeCaja.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelRetirosDeCaja.setText("SALIDA DE CAJA__");
        jPanel1.add(panelCaja_labelRetirosDeCaja);
        panelCaja_labelRetirosDeCaja.setBounds(530, 100, 110, 20);

        panelCaja_labelMontoCompras.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_labelMontoCompras.setForeground(new java.awt.Color(255, 0, 0));
        panelCaja_labelMontoCompras.setText("0");
        panelCaja_labelMontoCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_labelMontoCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_labelMontoComprasMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_labelMontoCompras);
        panelCaja_labelMontoCompras.setBounds(640, 20, 70, 15);

        panelCaja_lalbelMontoSueldos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoSueldos.setForeground(new java.awt.Color(255, 0, 0));
        panelCaja_lalbelMontoSueldos.setText("0");
        panelCaja_lalbelMontoSueldos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoSueldos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoSueldosMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoSueldos);
        panelCaja_lalbelMontoSueldos.setBounds(640, 60, 70, 15);

        panelCaja_lalbelMontoSalidaCaja.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoSalidaCaja.setForeground(new java.awt.Color(255, 0, 0));
        panelCaja_lalbelMontoSalidaCaja.setText("0");
        panelCaja_lalbelMontoSalidaCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoSalidaCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoSalidaCajaMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoSalidaCaja);
        panelCaja_lalbelMontoSalidaCaja.setBounds(640, 100, 70, 15);

        panelCaja_textFieldMontoEnCaja.setEditable(false);
        panelCaja_textFieldMontoEnCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCaja_textFieldMontoEnCaja.setForeground(new java.awt.Color(0, 102, 204));
        panelCaja_textFieldMontoEnCaja.setText("0.0");
        panelCaja_textFieldMontoEnCaja.setToolTipText("");
        panelCaja_textFieldMontoEnCaja.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Monto caja", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        jPanel1.add(panelCaja_textFieldMontoEnCaja);
        panelCaja_textFieldMontoEnCaja.setBounds(110, 80, 109, 40);

        panelCaja_labelVentas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelVentas.setText("VENTAS_________");
        jPanel1.add(panelCaja_labelVentas);
        panelCaja_labelVentas.setBounds(230, 20, 110, 14);

        panelCaja_textFieldInicioCon.setEditable(false);
        panelCaja_textFieldInicioCon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCaja_textFieldInicioCon.setForeground(new java.awt.Color(0, 102, 204));
        panelCaja_textFieldInicioCon.setText("0.0");
        panelCaja_textFieldInicioCon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Monto inicial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        jPanel1.add(panelCaja_textFieldInicioCon);
        panelCaja_textFieldInicioCon.setBounds(0, 80, 109, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("SALIDAS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(530, 0, 90, 17);

        panelCaja_labelPagoPrestamos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelPagoPrestamos.setText("PAGO PRESTAMOS");
        jPanel1.add(panelCaja_labelPagoPrestamos);
        panelCaja_labelPagoPrestamos.setBounds(230, 40, 110, 14);

        panelCaja_lalbelMontoPagosPrestamos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoPagosPrestamos.setForeground(new java.awt.Color(0, 51, 204));
        panelCaja_lalbelMontoPagosPrestamos.setText("0");
        panelCaja_lalbelMontoPagosPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoPagosPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoPagosPrestamosMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoPagosPrestamos);
        panelCaja_lalbelMontoPagosPrestamos.setBounds(340, 40, 70, 15);

        panelCaja_labelOtrosBeneficios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelOtrosBeneficios.setText("OTROS BENEFICIOS");
        jPanel1.add(panelCaja_labelOtrosBeneficios);
        panelCaja_labelOtrosBeneficios.setBounds(230, 60, 110, 14);

        panelCaja_lalbelMontoOtrosBeneficios.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoOtrosBeneficios.setForeground(new java.awt.Color(0, 51, 204));
        panelCaja_lalbelMontoOtrosBeneficios.setText("0");
        panelCaja_lalbelMontoOtrosBeneficios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoOtrosBeneficios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoOtrosBeneficiosMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoOtrosBeneficios);
        panelCaja_lalbelMontoOtrosBeneficios.setBounds(340, 60, 70, 15);

        panelCaja_labelEntradaACaja.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelEntradaACaja.setText("ENTRADA A CAJA_");
        jPanel1.add(panelCaja_labelEntradaACaja);
        panelCaja_labelEntradaACaja.setBounds(230, 80, 110, 20);

        panelCaja_lalbelMontoEntradaACaja.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoEntradaACaja.setForeground(new java.awt.Color(0, 51, 204));
        panelCaja_lalbelMontoEntradaACaja.setText("0");
        panelCaja_lalbelMontoEntradaACaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoEntradaACaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoEntradaACajaMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoEntradaACaja);
        panelCaja_lalbelMontoEntradaACaja.setBounds(340, 80, 70, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("ENTRADAS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 0, 90, 17);

        panelCaja_labelRetirosDeCaja1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelRetirosDeCaja1.setText("PAGO DE FACTURAS");
        jPanel1.add(panelCaja_labelRetirosDeCaja1);
        panelCaja_labelRetirosDeCaja1.setBounds(530, 120, 110, 20);

        panelCaja_lalbelMontoPagoFactura.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoPagoFactura.setForeground(new java.awt.Color(255, 0, 0));
        panelCaja_lalbelMontoPagoFactura.setText("0");
        panelCaja_lalbelMontoPagoFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoPagoFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoPagoFacturaMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoPagoFactura);
        panelCaja_lalbelMontoPagoFactura.setBounds(640, 120, 70, 15);

        panelCaja_labelIniciales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelIniciales.setText("INICIALES_______");
        jPanel1.add(panelCaja_labelIniciales);
        panelCaja_labelIniciales.setBounds(230, 100, 110, 20);

        panelCaja_lalbelMontoIniciales.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoIniciales.setForeground(new java.awt.Color(0, 51, 204));
        panelCaja_lalbelMontoIniciales.setText("0");
        panelCaja_lalbelMontoIniciales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoIniciales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoInicialesMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoIniciales);
        panelCaja_lalbelMontoIniciales.setBounds(340, 100, 70, 15);

        panelCaja_labelPagos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelPagos.setText("PAGOS__________");
        jPanel1.add(panelCaja_labelPagos);
        panelCaja_labelPagos.setBounds(230, 120, 110, 20);

        panelCaja_lalbelMontoPagos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoPagos.setForeground(new java.awt.Color(0, 51, 204));
        panelCaja_lalbelMontoPagos.setText("0");
        panelCaja_lalbelMontoPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoPagosMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoPagos);
        panelCaja_lalbelMontoPagos.setBounds(340, 120, 70, 15);

        panelCaja_labelAbonos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelAbonos.setText("ABONOS");
        jPanel1.add(panelCaja_labelAbonos);
        panelCaja_labelAbonos.setBounds(410, 20, 50, 20);

        panelCaja_lalbelMontoAbonos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoAbonos.setForeground(new java.awt.Color(0, 51, 204));
        panelCaja_lalbelMontoAbonos.setText("0");
        panelCaja_lalbelMontoAbonos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoAbonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoAbonosMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoAbonos);
        panelCaja_lalbelMontoAbonos.setBounds(460, 20, 70, 15);

        panelCaja_labelSaldos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelSaldos.setText("SALDOS");
        jPanel1.add(panelCaja_labelSaldos);
        panelCaja_labelSaldos.setBounds(410, 40, 44, 20);

        panelCaja_lalbelMontoSaldos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMontoSaldos.setForeground(new java.awt.Color(0, 51, 204));
        panelCaja_lalbelMontoSaldos.setText("0");
        panelCaja_lalbelMontoSaldos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMontoSaldos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMontoSaldosMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMontoSaldos);
        panelCaja_lalbelMontoSaldos.setBounds(460, 40, 70, 15);

        panelCaja_labelSaldos1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelCaja_labelSaldos1.setText("MORAS");
        jPanel1.add(panelCaja_labelSaldos1);
        panelCaja_labelSaldos1.setBounds(410, 60, 41, 20);

        panelCaja_lalbelMoras.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        panelCaja_lalbelMoras.setForeground(new java.awt.Color(0, 51, 204));
        panelCaja_lalbelMoras.setText("0");
        panelCaja_lalbelMoras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCaja_lalbelMoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCaja_lalbelMorasMouseClicked(evt);
            }
        });
        jPanel1.add(panelCaja_lalbelMoras);
        panelCaja_lalbelMoras.setBounds(460, 60, 70, 15);

        panelCaja_textFieldFechaCuadreFin.setBackground(new java.awt.Color(204, 204, 204));
        panelCaja_textFieldFechaCuadreFin.setForeground(new java.awt.Color(0, 102, 204));
        try {
            panelCaja_textFieldFechaCuadreFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##. ##. ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelCaja_textFieldFechaCuadreFin.setText("03. 01. 2017");
        jPanel1.add(panelCaja_textFieldFechaCuadreFin);
        panelCaja_textFieldFechaCuadreFin.setBounds(120, 30, 97, 30);

        panelCaja_lalbel_sumatoriaMontosEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelCaja_lalbel_sumatoriaMontosEntrada.setForeground(new java.awt.Color(0, 51, 204));
        panelCaja_lalbel_sumatoriaMontosEntrada.setText("0");
        jPanel1.add(panelCaja_lalbel_sumatoriaMontosEntrada);
        panelCaja_lalbel_sumatoriaMontosEntrada.setBounds(270, 160, 70, 17);

        panelCaja_labelMontoCompras1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelCaja_labelMontoCompras1.setText("0 $");
        jPanel1.add(panelCaja_labelMontoCompras1);
        panelCaja_labelMontoCompras1.setBounds(760, 160, 70, 17);

        panelCaja_lalbel_sumatoriaMontosSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelCaja_lalbel_sumatoriaMontosSalida.setForeground(new java.awt.Color(255, 0, 0));
        panelCaja_lalbel_sumatoriaMontosSalida.setText("0");
        jPanel1.add(panelCaja_lalbel_sumatoriaMontosSalida);
        panelCaja_lalbel_sumatoriaMontosSalida.setBounds(560, 160, 70, 17);

        panelCaja_labelCuandreDeCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCaja_labelCuandreDeCaja.setText("Cuadre de caja");
        jPanel1.add(panelCaja_labelCuandreDeCaja);
        panelCaja_labelCuandreDeCaja.setBounds(0, 0, 90, 15);

        panelCaja_separador5.setBackground(new java.awt.Color(0, 0, 0));
        panelCaja_separador5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(panelCaja_separador5);
        panelCaja_separador5.setBounds(0, 20, 90, 10);

        add(jPanel1);
        jPanel1.setBounds(10, 280, 860, 190);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        panelCaja_labelCargadoA1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelCaja_labelCargadoA1.setText("Cargado a:");

        panelCaja_labelMotivo1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        panelCaja_labelMotivo1.setText("Motivo:");

        panelCaja_textFieldFecha.setForeground(new java.awt.Color(0, 102, 204));
        try {
            panelCaja_textFieldFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##. ##. ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelCaja_textFieldFecha.setText("03. 01. 2017");

        panelCaja_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCaja_label.setForeground(new java.awt.Color(153, 0, 0));
        panelCaja_label.setText("*TERNER EN CUENTA LA FECHA CON LA QUE TRABAJA*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCaja_labelCargadoA1)
                    .addComponent(panelCaja_labelMotivo1))
                .addContainerGap(796, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCaja_label)
                .addGap(18, 18, 18)
                .addComponent(panelCaja_textFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelCaja_textFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCaja_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCaja_labelCargadoA1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(panelCaja_labelMotivo1)
                .addGap(21, 21, 21))
        );

        add(jPanel2);
        jPanel2.setBounds(10, 10, 860, 120);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("IndexOfReplaceableByContains")
    private void panelCaja_comboBoxCargadoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCaja_comboBoxCargadoAActionPerformed
        try {
            if (((String) panelCaja_comboBoxCargadoA.getSelectedItem()).equals("Caja")) {//Verifica si el elemento seleccionado es "Caja"
                llenarRadioButtonTipoMovimiento(1);
            } else if (((panelCaja_comboBoxCargadoA.getSelectedItem()).toString()).indexOf(")") != -1) {//Verifica si el elemento seleccionado contiene un ")" de ser asi es porque es un empleado y muestra los tipos de movimientos para los empleados.
                llenarRadioButtonTipoMovimiento(2);
            } else if (((String) panelCaja_comboBoxCargadoA.getSelectedItem()).equals("<Seleccionar un elemento>")) {//Verifica si no a seleccionado a nadie a quien se le vaya a cargar el movimiento.
                llenarRadioButtonTipoMovimiento(3);
            }
        } catch (java.lang.NullPointerException e) {
            //Este exception es porque me explotaba al momento de seleccionar un dueño de movimiento, con esto el exception no ocurria.
            System.out.println("panel_caja.java\n" + e);
        }
    }//GEN-LAST:event_panelCaja_comboBoxCargadoAActionPerformed

    private void panelCaja_botonProcesarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCaja_botonProcesarMovimientoActionPerformed
        //Proceso de verificacion de movimientos diarios.
        if (Logica.gestiosDineroCaja.verificarExistenciaYEstadoDia(panelCaja_textFieldFecha.getText())) {
            //Para saber con cual JComboBox Se esta trabajando.
            javax.swing.JComboBox jcb = panelCaja_comboBoxTipoMovimientoCaja.isVisible() ? panelCaja_comboBoxTipoMovimientoCaja : panelCaja_comboBoxTipoMovimientoEmpleado;
            //*
            if (panelCaja_comboBoxCargadoA.getSelectedIndex() != 0) {//Verifica si a seleccionado un dueño de movimiento.
                if (jcb.getSelectedIndex() != 0) {//Verifica si a seleccionado un tipo de movimiento.
                    if ((panelCaja_textFieldMonto.getText().length() > 0) && !(panelCaja_textFieldMonto.getText().equals("0"))) {//Verifica que el campo de monto no este vacio y que tampoco sea 0 su contenido.
                        if ((Logica.Cuadros_Emergentes.confirmacionDefinida(
                                "-Guardara este movimiento.")) == 0) {
                            DataBase.Facturacion.Movimento.Insert.movimento(new String[]{(String) panelCaja_comboBoxCargadoA.getSelectedItem(),//Guardar los datos en la base de datos.
                                (String) jcb.getSelectedItem(), panelCaja_textFieldMonto.getText(),
                                (String) panelCaja_textFieldMotivo.getText()});
                            //Mandar datos a la tabla de movimientoDiario.(Verificar si es unmovimiento de entrada o de salida).
                            if (((String) jcb.getSelectedItem()).compareTo("Entrada a caja") == 0
                                    || ((String) jcb.getSelectedItem()).compareTo("Otro benefico") == 0
                                    || ((String) jcb.getSelectedItem()).compareTo("Pago de prestamo") == 0) {
                                //*Aumentar montoDiario de entrada.
                                Logica.gestiosDineroCaja.agregarMontos(panelCaja_textFieldMonto.getText(), true, panelCaja_textFieldFecha.getText());
                            } else {
                                //*Aumentar montoDiario de salida.
                                Logica.gestiosDineroCaja.agregarMontos(panelCaja_textFieldMonto.getText(), false, panelCaja_textFieldFecha.getText());
                            }
                            //*Limpiar todos los campos.
                            limpiarCampos();
                            Logica.Cuadros_Emergentes.completado();
                            actualizarLlenarTabla(DataBase.Facturacion.Movimento.Select.todosMovimientosActivos(panelCaja_textFieldFecha.getText().substring(4, 6),
                                    panelCaja_textFieldFecha.getText().substring(8, 12)));
                        }
                    } else {
                        Logica.Cuadros_Emergentes.alerta("El monto debe ser mayor a 0");
                    }
                } else {
                    Logica.Cuadros_Emergentes.alerta("Debe seleccionar el motivo de este movimiento.");
                }
            } else {
                Logica.Cuadros_Emergentes.alerta("Debe seleccionar a quien se le cargara el movimiento.");
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("No se puede realizar la este movimientos en esta fecha.\n"
                    + "Esta fecha esta cerrada.");
        }
    }//GEN-LAST:event_panelCaja_botonProcesarMovimientoActionPerformed

    private void panelCaja_tablaMovimientosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_tablaMovimientosMouseReleased
        if (Logica.tablas.Tabla_verificarFilaSeleccionada.rowSelectedNotNull(panelCaja_tablaMovimientos)) {
            //*Activar los botones de "eliminar" y "modificar".
            panelCaja_botonModificarMovimiento.setEnabled(true);
            panelCaja_botonEliminarMovimiento.setEnabled(true);

            //Sacar el Id del movimiendo seleccionado.
            java.sql.ResultSet rs = DataBase.Facturacion.Movimento.Select.facturaID((String) panelCaja_tablaMovimientos.getValueAt(panelCaja_tablaMovimientos.getSelectedRow(), 0));
            try {
                rs.next();
                //Recorrer todo el comboBox para ver si el item en la pocision
                //del comboBox es igual al elemento devuelto por el query para 
                //cuando lo encuentre mover el item seleccionado en el comboBox
                //a la misma en la que se encuentra el elemento encontrado.
                for (int i = 0; i < panelCaja_comboBoxCargadoA.getItemCount(); i++) {
                    if (rs.getString("cargadoA").equals(panelCaja_comboBoxCargadoA.getItemAt(i))) {
                        panelCaja_comboBoxCargadoA.setSelectedIndex(i);
                    }
                }
                rs.close();
                //Llenar los campos de monto y motivo del movimiento al hacer click en un movimiento.
                panelCaja_textFieldMonto.setText((String) panelCaja_tablaMovimientos.getValueAt(panelCaja_tablaMovimientos.getSelectedRow(), 4));
                panelCaja_textFieldMotivo.setText((String) panelCaja_tablaMovimientos.getValueAt(panelCaja_tablaMovimientos.getSelectedRow(), 1));
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
        } else {
            limpiarCampos();
        }
    }//GEN-LAST:event_panelCaja_tablaMovimientosMouseReleased

    private void panelCaja_botonModificarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCaja_botonModificarMovimientoActionPerformed
        if (panelCaja_comboBoxCargadoA.getSelectedItem() != "<Seleccionar un elemento>") {
            javax.swing.JComboBox jcb = panelCaja_comboBoxTipoMovimientoCaja.isVisible() ? panelCaja_comboBoxTipoMovimientoCaja : panelCaja_comboBoxTipoMovimientoEmpleado;
            if (jcb.getSelectedItem() != "<Tipo de movimiento>") {
                if ((panelCaja_textFieldMonto.getText().length() > 0) && !(panelCaja_textFieldMonto.getText().equals("0"))) {
                    if ((Logica.Cuadros_Emergentes.confirmacionDefinida(
                            "-Modificara los datos del movimiento.")) == 0) {
                        DataBase.Facturacion.Movimento.Update.movimiento(new String[]{(String) panelCaja_tablaMovimientos.getValueAt(panelCaja_tablaMovimientos.getSelectedRow(), 0),
                            (String) panelCaja_comboBoxCargadoA.getSelectedItem(),
                            (String) jcb.getSelectedItem(), panelCaja_textFieldMonto.getText(),
                            panelCaja_textFieldMotivo.getText()});
                        Logica.Cuadros_Emergentes.completado();
                        limpiarCampos();
                        actualizarLlenarTabla(DataBase.Facturacion.Movimento.Select.todosMovimientosActivos(panelCaja_textFieldFecha.getText().substring(4, 6),
                                panelCaja_textFieldFecha.getText().substring(8, 12)));
                    }
                } else {
                    Logica.Cuadros_Emergentes.alerta("El nuevo valor debe ser mayor a 0.");
                }
            } else {
                Logica.Cuadros_Emergentes.alerta("Debe seleccionar un tipo de movimiento.");
            }
        } else {
            Logica.Cuadros_Emergentes.alerta("Debe seleccionar un dueño de movimiento.");
        }
    }//GEN-LAST:event_panelCaja_botonModificarMovimientoActionPerformed

    private void panelCaja_botonEliminarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCaja_botonEliminarMovimientoActionPerformed
        if ((Logica.Cuadros_Emergentes.confirmacionDefinida(
                "-Eliminara el movimiento.")) == 0) {
            DataBase.Facturacion.Movimento.Update.desabilitarMovimiento(new String[]{(String) panelCaja_tablaMovimientos.getValueAt(panelCaja_tablaMovimientos.getSelectedRow(), 0)});
            Logica.Cuadros_Emergentes.completado();
            limpiarCampos();
            actualizarLlenarTabla(DataBase.Facturacion.Movimento.Select.todosMovimientosActivos(panelCaja_textFieldFecha.getText().substring(4, 6),
                    panelCaja_textFieldFecha.getText().substring(8, 12)));
        }
    }//GEN-LAST:event_panelCaja_botonEliminarMovimientoActionPerformed

    private void panelCaja_textFieldBuscadorMovimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelCaja_textFieldBuscadorMovimientoKeyReleased
        actualizarLlenarTabla(DataBase.Facturacion.Movimento.Select.todosMovimientosActivosDeEmpleado(panelCaja_textFieldFecha.getText().substring(4, 6),
                panelCaja_textFieldFecha.getText().substring(8, 12),
                panelCaja_textFieldBuscadorMovimiento.getText()));
    }//GEN-LAST:event_panelCaja_textFieldBuscadorMovimientoKeyReleased

    private void panelCaja_botonBuscarCuadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCaja_botonBuscarCuadreActionPerformed
        panelCaja_botonCerrarCuadre.setEnabled(false);
        if (Logica.gestiosDineroCaja.verificarExistenciaYEstadoDia(panelCaja_textFieldFechaCuadreInicio.getText())) {
            panelCaja_botonCerrarCuadre.setEnabled(true);
        }
        //ENTRADA
        //Total de ventas
        panelCaja_labelMontoVentas.setText(DataBase.Facturacion.FacturaVenta.Venta.Select
                .sumatoriaFacturasActivas(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()));
        //Total inicial de ventas a credito
        panelCaja_lalbelMontoIniciales.setText(DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.sumatoriaInicialesFacturasActivas(
                panelCaja_textFieldFechaCuadreInicio.getText(),
                panelCaja_textFieldFechaCuadreFin.getText()));
        //Pagos
        panelCaja_lalbelMontoPagos.setText(DataBase.Financiera.Pagos.Select.sumatoriaPagos(
                panelCaja_textFieldFechaCuadreInicio.getText(),
                panelCaja_textFieldFechaCuadreFin.getText()));
        //Abonos
        panelCaja_lalbelMontoAbonos.setText(DataBase.Financiera.abonoAPago.Select
                .sumatoriaFacturasActivas(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()));
        //Saldos
        panelCaja_lalbelMontoSaldos.setText(DataBase.Financiera.saldos.Select
                .sumatoriaSaldos(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()));
        //Moras
        panelCaja_lalbelMoras.setText(DataBase.Financiera.AtrasosPagados.Select
                .sumatoriaMorasEnFecha(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()));

        //SALIDA:
        //Total de compras:
        panelCaja_labelMontoCompras.setText(DataBase.Facturacion.FacturaCompra.Compra.Select
                .sumatoriaFacturasActivas(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()));
        //Pago facturas compra:
        panelCaja_lalbelMontoPagoFactura.setText(DataBase.Facturacion.FacturaCompra.CompraPorPagar.Select.sumatoriaFacturasActivasPagadas(
                panelCaja_textFieldFechaCuadreInicio.getText(),
                panelCaja_textFieldFechaCuadreFin.getText()));

        //DINERO EN CAJA:
        //Total de dinero en la caja
        panelCaja_textFieldMontoEnCaja.setText(DataBase.Facturacion.caja.Select.montoTotalEnCaja());
        //Total dinero inicio en fecha
        panelCaja_textFieldInicioCon.setText(DataBase.Facturacion.movimientoDiario.Select
                .movimientoDiaMontoInicioFecha(
                        panelCaja_textFieldFechaCuadreInicio.getText()));

        //MOVIMIENTOS:
        String[] sumatorias = DataBase.Facturacion.Movimento.Select
                .movimientosSumatoriaDetallados(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText());
        //CAJA
        panelCaja_lalbelMontoEntradaACaja.setText(sumatorias[0]);
        panelCaja_lalbelMontoOtrosBeneficios.setText(sumatorias[1]);
        panelCaja_lalbelMontoSalidaCaja.setText(sumatorias[2]);
        panelCaja_lalbelMontoMicelaneos.setText(sumatorias[3]);
        //EMPLEADO
        panelCaja_lalbelMontoPagosPrestamos.setText(sumatorias[4]);
        panelCaja_lalbelMontoPrestamos.setText(sumatorias[5]);
        panelCaja_lalbelMontoSueldos.setText(sumatorias[6]);

        //SUMATORIA DE MONTOS
        panelCaja_lalbel_sumatoriaMontosEntrada.setText(
                Integer.toString(
                        Integer.parseInt(panelCaja_labelMontoVentas.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoPagosPrestamos.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoOtrosBeneficios.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoEntradaACaja.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoIniciales.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoPagos.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoAbonos.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoSaldos.getText())
                        + Integer.parseInt(panelCaja_lalbelMoras.getText())
                ));
        panelCaja_lalbel_sumatoriaMontosSalida.setText(
                Integer.toString(
                        Integer.parseInt(panelCaja_labelMontoCompras.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoMicelaneos.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoSueldos.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoPrestamos.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoSalidaCaja.getText())
                        + Integer.parseInt(panelCaja_lalbelMontoPagoFactura.getText())
                ));
        panelCaja_labelMontoCompras1.setText(
                Integer.toString(
                        Integer.parseInt(panelCaja_lalbel_sumatoriaMontosEntrada.getText())
                        - Integer.parseInt(panelCaja_lalbel_sumatoriaMontosSalida.getText())
                ) + " $");
    }//GEN-LAST:event_panelCaja_botonBuscarCuadreActionPerformed

    private void panelCaja_botonCerrarCuadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCaja_botonCerrarCuadreActionPerformed
        if ((Logica.Cuadros_Emergentes.confirmacionDefinida(
                "-Cerrara los cuadres hasta esta fecha '" + panelCaja_textFieldFechaCuadreFin.getText() + "'.\n"
                + "-No podra efectuar ningun movimiento en esta fecha (Compra, Venta, etc.)")) == 0) {
            //Casteo de la fecha pasada como String a SqlDate
            java.util.Date date = DataBase.logica.casteoFecha.stringToDate(panelCaja_textFieldFechaCuadreFin.getText());
            java.sql.Date fecha = new java.sql.Date(date.getTime());

            DataBase.Facturacion.movimientoDiario.Update.cerrarCuadre(fecha);
        }
    }//GEN-LAST:event_panelCaja_botonCerrarCuadreActionPerformed

    private void panelCaja_labelMontoVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_labelMontoVentasMouseClicked
        Logica.Cuadros_Emergentes.Historiales(
                "VENTAS",
                DataBase.Facturacion.FacturaVenta.Venta.Select.FacturasActivasEntreFechas(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()),
                new String[]{"idFacturaVenta", "fecha", "valorFacturaVenta"});
    }//GEN-LAST:event_panelCaja_labelMontoVentasMouseClicked

    private void panelCaja_lalbelMontoPagosPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoPagosPrestamosMouseClicked
        Logica.Cuadros_Emergentes.Historiales("PAGOS PRESTAMOS",
                DataBase.Facturacion.Movimento.Select.MovimientosActivosPorTipoEntreFecha(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText(),
                        "Pago de prestamo"),
                new String[]{"idMovimiento", "fechaMovimiento", "montoMovimiento"});
    }//GEN-LAST:event_panelCaja_lalbelMontoPagosPrestamosMouseClicked

    private void panelCaja_lalbelMontoOtrosBeneficiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoOtrosBeneficiosMouseClicked
        Logica.Cuadros_Emergentes.Historiales("OTROS BENEFICIOS",
                DataBase.Facturacion.Movimento.Select.MovimientosActivosPorTipoEntreFecha(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText(),
                        "Otro benefico"),
                new String[]{"idMovimiento", "fechaMovimiento", "montoMovimiento"});
    }//GEN-LAST:event_panelCaja_lalbelMontoOtrosBeneficiosMouseClicked

    private void panelCaja_lalbelMontoEntradaACajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoEntradaACajaMouseClicked
        Logica.Cuadros_Emergentes.Historiales("ENTRADAS A CAJA",
                DataBase.Facturacion.Movimento.Select.MovimientosActivosPorTipoEntreFecha(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText(),
                        "Entrada a caja"),
                new String[]{"idMovimiento", "fechaMovimiento", "montoMovimiento"});
    }//GEN-LAST:event_panelCaja_lalbelMontoEntradaACajaMouseClicked

    private void panelCaja_lalbelMontoInicialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoInicialesMouseClicked
        Logica.Cuadros_Emergentes.Historiales(
                "INICIALES",
                DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.InicialesActivosEntreFechas(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()),
                new String[]{"idVentaCredito", "fecha", "inicial"});
    }//GEN-LAST:event_panelCaja_lalbelMontoInicialesMouseClicked

    private void panelCaja_lalbelMontoPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoPagosMouseClicked
        Logica.Cuadros_Emergentes.Historiales(
                "PAGOS A FACTURAS DE CREDITO",
                DataBase.Financiera.Pagos.Select.PagosActivosEntreFechas(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()),
                new String[]{"ventaCredito_idVentaCredito", "fecha", "pagadas"});
    }//GEN-LAST:event_panelCaja_lalbelMontoPagosMouseClicked

    private void panelCaja_lalbelMontoAbonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoAbonosMouseClicked
        Logica.Cuadros_Emergentes.Historiales(
                "ABONOS A PAGO DE FACTURAS A CREDITO",
                DataBase.Financiera.abonoAPago.Select.AbonosActivosEntreFechas(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()),
                new String[]{"ventaCredito_idVentaCredito", "fecha", "montoAbonado"});
    }//GEN-LAST:event_panelCaja_lalbelMontoAbonosMouseClicked

    private void panelCaja_lalbelMontoSaldosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoSaldosMouseClicked
        Logica.Cuadros_Emergentes.Historiales("SALDOS DE FACTURAS A CREDITO",
                DataBase.Financiera.saldos.Select.SaldosActivosEntreFechas(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()),
                new String[]{"ventaCredito_idVentaCredito", "fecha", "totalSaldo"});
    }//GEN-LAST:event_panelCaja_lalbelMontoSaldosMouseClicked

    private void panelCaja_lalbelMorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMorasMouseClicked
        Logica.Cuadros_Emergentes.Historiales("PAGOS DE MORAS",
                DataBase.Financiera.AtrasosPagados.Select.AtrasosPagadosActivosEntreFechas(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()),
                new String[]{"atrasosPagados_idFacturaVentaCredito", "fecha", "monto"});
    }//GEN-LAST:event_panelCaja_lalbelMorasMouseClicked

    private void panelCaja_labelMontoComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_labelMontoComprasMouseClicked
        Logica.Cuadros_Emergentes.Historiales("COMPRAS",
                DataBase.Facturacion.FacturaCompra.Compra.Select.FacturasActivasEntreFechas(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()),
                new String[]{"idFacturaCompra", "fecha", "valorFacturaCompra"});
    }//GEN-LAST:event_panelCaja_labelMontoComprasMouseClicked

    private void panelCaja_lalbelMontoMicelaneosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoMicelaneosMouseClicked
        Logica.Cuadros_Emergentes.Historiales("GASTOS MICELANEOS",
                DataBase.Facturacion.Movimento.Select.MovimientosActivosPorTipoEntreFecha(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText(),
                        "Gasto micelaneo"),
                new String[]{"idMovimiento", "fechaMovimiento", "montoMovimiento"});
    }//GEN-LAST:event_panelCaja_lalbelMontoMicelaneosMouseClicked

    private void panelCaja_lalbelMontoSueldosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoSueldosMouseClicked
        Logica.Cuadros_Emergentes.Historiales("PAGOS DE SUELDOS",
                DataBase.Facturacion.Movimento.Select.MovimientosActivosPorTipoEntreFecha(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText(),
                        "Pago de sueldo"),
                new String[]{"idMovimiento", "fechaMovimiento", "montoMovimiento"});
    }//GEN-LAST:event_panelCaja_lalbelMontoSueldosMouseClicked

    private void panelCaja_lalbelMontoPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoPrestamosMouseClicked
        Logica.Cuadros_Emergentes.Historiales("PRESTAMOS A PERSONALES",
                DataBase.Facturacion.Movimento.Select.MovimientosActivosPorTipoEntreFecha(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText(),
                        "Prestamo personal"),
                new String[]{"idMovimiento", "fechaMovimiento", "montoMovimiento"});
    }//GEN-LAST:event_panelCaja_lalbelMontoPrestamosMouseClicked

    private void panelCaja_lalbelMontoSalidaCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoSalidaCajaMouseClicked
        Logica.Cuadros_Emergentes.Historiales("SALIDA DE LA CAJA",
                DataBase.Facturacion.Movimento.Select.MovimientosActivosPorTipoEntreFecha(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText(),
                        "Salida de caja"),
                new String[]{"idMovimiento", "fechaMovimiento", "montoMovimiento"});
    }//GEN-LAST:event_panelCaja_lalbelMontoSalidaCajaMouseClicked

    private void panelCaja_lalbelMontoPagoFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCaja_lalbelMontoPagoFacturaMouseClicked
        /*Logica.Cuadros_Emergentes.Historiales("PAGOS DE FACTURAS DE COMPRAS",
                DataBase.FacturaCompra.CompraPorPagar.Select.FacturasActivasEntreFechas(
                        panelCaja_textFieldFechaCuadreInicio.getText(),
                        panelCaja_textFieldFechaCuadreFin.getText()),
                new String[]{"idFacturaCompra", "fecha", "valorFacturaCompra"});*/
    }//GEN-LAST:event_panelCaja_lalbelMontoPagoFacturaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton panelCaja_botonBuscarCuadre;
    private javax.swing.JButton panelCaja_botonBuscarMontoMovimientoDe;
    private javax.swing.JButton panelCaja_botonCerrarCuadre;
    private javax.swing.JButton panelCaja_botonEliminarMovimiento;
    private javax.swing.JButton panelCaja_botonImprimirMovimiento;
    private javax.swing.JButton panelCaja_botonModificarMovimiento;
    private javax.swing.JButton panelCaja_botonMontoBuscarPorFechaDe;
    private javax.swing.JButton panelCaja_botonProcesarMovimiento;
    private static javax.swing.JComboBox<String> panelCaja_comboBoxCargadoA;
    private static javax.swing.JComboBox<String> panelCaja_comboBoxTipoMovimientoCaja;
    private static javax.swing.JComboBox<String> panelCaja_comboBoxTipoMovimientoDefault;
    private static javax.swing.JComboBox<String> panelCaja_comboBoxTipoMovimientoEmpleado;
    private javax.swing.JLabel panelCaja_label;
    private javax.swing.JLabel panelCaja_labelAbonos;
    private javax.swing.JLabel panelCaja_labelCargadoA1;
    private javax.swing.JLabel panelCaja_labelCompras;
    private javax.swing.JLabel panelCaja_labelCrearMovimiento;
    private javax.swing.JLabel panelCaja_labelCuandreDeCaja;
    private javax.swing.JLabel panelCaja_labelEntradaACaja;
    private javax.swing.JLabel panelCaja_labelIniciales;
    private javax.swing.JLabel panelCaja_labelMicelaneos;
    private javax.swing.JLabel panelCaja_labelMonedaSimbolo;
    private javax.swing.JLabel panelCaja_labelMonedaSimbolo1;
    private javax.swing.JLabel panelCaja_labelMontoCompras;
    private javax.swing.JLabel panelCaja_labelMontoCompras1;
    private javax.swing.JLabel panelCaja_labelMontoDe;
    private javax.swing.JLabel panelCaja_labelMontoVentas;
    private javax.swing.JLabel panelCaja_labelMotivo1;
    private javax.swing.JLabel panelCaja_labelMovimientosEspesificos;
    private javax.swing.JLabel panelCaja_labelOtrosBeneficios;
    private javax.swing.JLabel panelCaja_labelPagoPrestamos;
    private javax.swing.JLabel panelCaja_labelPagos;
    private javax.swing.JLabel panelCaja_labelPrestamos;
    private javax.swing.JLabel panelCaja_labelRetirosDeCaja;
    private javax.swing.JLabel panelCaja_labelRetirosDeCaja1;
    private javax.swing.JLabel panelCaja_labelSaldos;
    private javax.swing.JLabel panelCaja_labelSaldos1;
    private javax.swing.JLabel panelCaja_labelSueldos;
    private javax.swing.JLabel panelCaja_labelVentas;
    private javax.swing.JLabel panelCaja_lalbelMontoAbonos;
    private javax.swing.JLabel panelCaja_lalbelMontoEntradaACaja;
    private javax.swing.JLabel panelCaja_lalbelMontoIniciales;
    private javax.swing.JLabel panelCaja_lalbelMontoMicelaneos;
    private javax.swing.JLabel panelCaja_lalbelMontoOtrosBeneficios;
    private javax.swing.JLabel panelCaja_lalbelMontoPagoFactura;
    private javax.swing.JLabel panelCaja_lalbelMontoPagos;
    private javax.swing.JLabel panelCaja_lalbelMontoPagosPrestamos;
    private javax.swing.JLabel panelCaja_lalbelMontoPrestamos;
    private javax.swing.JLabel panelCaja_lalbelMontoSaldos;
    private javax.swing.JLabel panelCaja_lalbelMontoSalidaCaja;
    private javax.swing.JLabel panelCaja_lalbelMontoSueldos;
    private javax.swing.JLabel panelCaja_lalbelMoras;
    private javax.swing.JLabel panelCaja_lalbel_sumatoriaMontosEntrada;
    private javax.swing.JLabel panelCaja_lalbel_sumatoriaMontosSalida;
    private javax.swing.JScrollPane panelCaja_scrollPaneMovimientos;
    private javax.swing.JSeparator panelCaja_separador1;
    private javax.swing.JSeparator panelCaja_separador3;
    private javax.swing.JSeparator panelCaja_separador4;
    private javax.swing.JSeparator panelCaja_separador5;
    private javax.swing.JTable panelCaja_tablaMovimientos;
    private javax.swing.JTextField panelCaja_textFieldBuscadorMovimiento;
    private javax.swing.JTextField panelCaja_textFieldBuscarMontosDe;
    private javax.swing.JFormattedTextField panelCaja_textFieldFecha;
    private javax.swing.JFormattedTextField panelCaja_textFieldFechaCuadreFin;
    private javax.swing.JFormattedTextField panelCaja_textFieldFechaCuadreInicio;
    private javax.swing.JTextField panelCaja_textFieldInicioCon;
    private javax.swing.JTextField panelCaja_textFieldMonto;
    private javax.swing.JTextField panelCaja_textFieldMontoEnCaja;
    private javax.swing.JTextField panelCaja_textFieldMotivo;
    // End of variables declaration//GEN-END:variables

    //*************************************************************//
    //*********************** -METODOS- **************************//
    //*************************************************************//
    private void detallesComponentes() {
        panelCaja_comboBoxTipoMovimientoCaja.setVisible(false);
        panelCaja_comboBoxTipoMovimientoEmpleado.setVisible(false);

        //MAYUSCULA campos de texto
        Campo_mayuscula.campoTextoMayuscula(panelCaja_textFieldMotivo);
        Campo_mayuscula.campoTextoMayuscula(panelCaja_textFieldBuscarMontosDe);
        Campo_mayuscula.campoTextoMayuscula(panelCaja_textFieldBuscadorMovimiento);

        //FUENTES campos de texto
        panelCaja_textFieldFecha.setFont(new java.awt.Font("Tahoma", 0, 18));
        panelCaja_textFieldFechaCuadreInicio.setFont(new java.awt.Font("Tahoma", 0, 15));

        //TAMAÑO campos de texto
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelCaja_textFieldMotivo, 62);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelCaja_textFieldBuscarMontosDe, 25);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelCaja_textFieldBuscadorMovimiento, 28);
        Campo_limiteDigitosCampo.SetCampoTextoLimite(panelCaja_textFieldMonto, 8);

        //TIPO campo de texto
        Campo_tipoNumero.campoTextoTipoNumero(panelCaja_textFieldMonto);
        Campo_tipoLetra.campoTextoTipoLetras(panelCaja_textFieldBuscarMontosDe);

        //TAMAÑO celdas de tabla
        int[] tamaño = {45, 420, 140, 145, 80};
        Logica.tablas.Tabla_tamañoCeldas.setTablaColumnasTamaño(tamaño, panelCaja_tablaMovimientos);

        //LLenar comboBox
        llenarRadioButtonEmisorMovimiento();

        //Llenar campos de fecha
        panelCaja_textFieldFecha.setText(Logica.fechaHora.getFecha());
        panelCaja_textFieldFechaCuadreInicio.setText(Logica.fechaHora.getFecha());
        panelCaja_textFieldFechaCuadreFin.setText(Logica.fechaHora.getFecha());

        //Llenar la tabla
        actualizarLlenarTabla(DataBase.Facturacion.Movimento.Select.todosMovimientosActivos(panelCaja_textFieldFecha.getText().substring(4, 6),
                panelCaja_textFieldFecha.getText().substring(8, 12)));

        //Desactivar tooltipText del panel de los detalles
        jPanel1.createToolTip().setEnabled(false);
    }

    //Reestablece los campos a un estado inicial.
    private void limpiarCampos() {
        javax.swing.JComboBox jcb = panelCaja_comboBoxTipoMovimientoCaja.isVisible() ? panelCaja_comboBoxTipoMovimientoCaja : panelCaja_comboBoxTipoMovimientoEmpleado;
        panelCaja_comboBoxCargadoA.setSelectedIndex(0);
        jcb.setSelectedIndex(0);
        panelCaja_textFieldMonto.setText("");
        panelCaja_textFieldMotivo.setText("");
        panelCaja_botonModificarMovimiento.setEnabled(false);
        panelCaja_botonEliminarMovimiento.setEnabled(false);
    }

    //llena la tabla con los datos recibidos por el ResultSet
    private void actualizarLlenarTabla(java.sql.ResultSet rs) {
        eliminarAgregarFilasFacturas();
        try {
            while (rs.next()) {
                panelCaja_tablaMovimientos.getModel().setValueAt(rs.getString("idMovimiento"), rs.getRow() - 1, 0);
                panelCaja_tablaMovimientos.getModel().setValueAt(rs.getString("motivoMovimiento"), rs.getRow() - 1, 1);
                panelCaja_tablaMovimientos.getModel().setValueAt(rs.getString("fecha"), rs.getRow() - 1, 2);
                panelCaja_tablaMovimientos.getModel().setValueAt(rs.getString("tipoMovimento"), rs.getRow() - 1, 3);
                panelCaja_tablaMovimientos.getModel().setValueAt(rs.getString("montoMovimiento"), rs.getRow() - 1, 4);
            }
            rs.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    //Elimina y agrega filas a la tabla
    private void eliminarAgregarFilasFacturas() {
        for (int i = 0; i < 150; i++) {
            ((DefaultTableModel) panelCaja_tablaMovimientos.getModel()).removeRow(i);
        }
        for (int i = 0; i < 75; i++) {
            ((DefaultTableModel) panelCaja_tablaMovimientos.getModel()).removeRow(i);
        }
        for (int i = 0; i < 38; i++) {
            ((DefaultTableModel) panelCaja_tablaMovimientos.getModel()).removeRow(i);
        }
        for (int i = 0; i < 19; i++) {
            ((DefaultTableModel) panelCaja_tablaMovimientos.getModel()).removeRow(i);
        }
        for (int i = 0; i < 9; i++) {
            ((DefaultTableModel) panelCaja_tablaMovimientos.getModel()).removeRow(i);
        }
        for (int i = 0; i < 5; i++) {
            ((DefaultTableModel) panelCaja_tablaMovimientos.getModel()).removeRow(i);
        }
        for (int i = 0; i < 2; i++) {
            ((DefaultTableModel) panelCaja_tablaMovimientos.getModel()).removeRow(i);
        }
        ((DefaultTableModel) panelCaja_tablaMovimientos.getModel()).removeRow(0);
        ((DefaultTableModel) panelCaja_tablaMovimientos.getModel()).removeRow(0);

        for (int i = 0; i < 300; i++) {
            ((DefaultTableModel) panelCaja_tablaMovimientos.getModel()).addRow(new String[]{});
        }
    }

    //llenar el comboBox que contendra los datos del empleado y los datos standards del mismo.
    public static void llenarRadioButtonEmisorMovimiento() {
        panelCaja_comboBoxCargadoA.removeAllItems();

        java.sql.ResultSet rs = DataBase.Facturacion.Empleado.Select.empleadosActivos();
        java.util.ArrayList<String> datos = new java.util.ArrayList<>();
        try {
            while (rs.next()) {
                datos.add(rs.getString("idEmpleado") + " . <" + rs.getString("nombreEmpleado") + " " + rs.getString("apellidoEmpleado") + "> - (" + rs.getString("puesto") + ")");
            }
            rs.close();
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }

        panelCaja_comboBoxCargadoA.addItem("<Seleccionar un elemento>");
        panelCaja_comboBoxCargadoA.addItem("Caja");
        for (int i = 0; i < datos.size(); i++) {
            panelCaja_comboBoxCargadoA.addItem(datos.get(i));
        }
    }

    //llenar el comboBox que contendra los tipos de movimientos a realizar.
    public static void llenarRadioButtonTipoMovimiento(int categoritaTipoMovimiento) {
        switch (categoritaTipoMovimiento) {
            case 1:
                panelCaja_comboBoxTipoMovimientoCaja.setVisible(true);
                panelCaja_comboBoxTipoMovimientoEmpleado.setVisible(false);
                panelCaja_comboBoxTipoMovimientoDefault.setVisible(false);

                panelCaja_comboBoxTipoMovimientoEmpleado.setSelectedIndex(0);
                break;
            case 2:
                panelCaja_comboBoxTipoMovimientoEmpleado.setVisible(true);
                panelCaja_comboBoxTipoMovimientoCaja.setVisible(false);
                panelCaja_comboBoxTipoMovimientoDefault.setVisible(false);

                panelCaja_comboBoxTipoMovimientoCaja.setSelectedIndex(0);
                break;
            case 3:
                panelCaja_comboBoxTipoMovimientoDefault.setVisible(true);
                panelCaja_comboBoxTipoMovimientoCaja.setVisible(false);
                panelCaja_comboBoxTipoMovimientoEmpleado.setVisible(false);

                panelCaja_comboBoxTipoMovimientoEmpleado.setSelectedIndex(0);
                panelCaja_comboBoxTipoMovimientoCaja.setSelectedIndex(0);
                break;
            default:
                break;
        }
    }
}

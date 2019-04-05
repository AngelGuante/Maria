package Diseño.Financiera.paneles_pantallaPrincipal;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class panel_ClientesPendientes extends Diseño.Facturacion.paneles_base.panelBase {

    public panel_ClientesPendientes() {
        initComponents();
        detallesComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelPagoslSaldosEnvargos_labelFacturasActivas = new javax.swing.JLabel();
        panelClientesPendientes_labelNumeroFacturasActivas = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelCapitalInvertido = new javax.swing.JLabel();
        panelClientesPendientes_labelCapitalInvertidoDebitado = new javax.swing.JLabel();
        panelClientesPendientes_textFieldBuscador = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        panelPagoslSaldosEnvargos_labelInicial = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelCuotas = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelNumeroCuotas = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelFechaCreacion = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelTotalFactura = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelCantidadInicial = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelCantidadCuotas = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelCantidadNumeroCuotas = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelCantidadCreacionFactura = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelCantidadTotalFactura = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelPagoslSaldosEnvargos_labelCuotasRestantes = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelTotalRestante = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelCantidadCuotasRestante = new javax.swing.JLabel();
        panelPagoslSaldosEnvargos_labelCantidadTotalRestante = new javax.swing.JLabel();
        clientesPendientes_scroll_todosPagosFacturas = new javax.swing.JScrollPane();
        clientesPendientes_tabla_todosPagosFacturas = new javax.swing.JTable();
        clientesPendientes_scroll_todasFacturasCliente = new javax.swing.JScrollPane();
        clientesPendientes_tabla_todasFacturasCliente = new javax.swing.JTable();
        clientesPendientes_scroll_productosFactura = new javax.swing.JScrollPane();
        clientesPendientes_tabla_productosFactura = new javax.swing.JTable();
        clientesPendientes_scroll_todasFacturasVentasCreditoActivas = new javax.swing.JScrollPane();
        clientesPendientes_tabla_todasFacturasVentasCreditoActivas = new javax.swing.JTable();
        panelClientesPendientes_button_reImprimir = new javax.swing.JButton();
        grupo_saldosEnvargos = new javax.swing.JRadioButton();
        grupo_Activos = new javax.swing.JRadioButton();
        panelClientesPendientes_button_eliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_cantidad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lb_facturadaPor = new javax.swing.JLabel();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panelPagoslSaldosEnvargos_labelFacturasActivas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagoslSaldosEnvargos_labelFacturasActivas.setText("FACTUARAS ACTIVAS:");

        panelClientesPendientes_labelNumeroFacturasActivas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelClientesPendientes_labelNumeroFacturasActivas.setForeground(new java.awt.Color(255, 51, 51));
        panelClientesPendientes_labelNumeroFacturasActivas.setText("0");

        panelPagoslSaldosEnvargos_labelCapitalInvertido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelPagoslSaldosEnvargos_labelCapitalInvertido.setText("CAPITAL INVERTIDO:");

        panelClientesPendientes_labelCapitalInvertidoDebitado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelClientesPendientes_labelCapitalInvertidoDebitado.setForeground(new java.awt.Color(255, 51, 51));
        panelClientesPendientes_labelCapitalInvertidoDebitado.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelPagoslSaldosEnvargos_labelCapitalInvertido)
                        .addGap(18, 18, 18)
                        .addComponent(panelClientesPendientes_labelCapitalInvertidoDebitado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelPagoslSaldosEnvargos_labelFacturasActivas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelClientesPendientes_labelNumeroFacturasActivas)))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelPagoslSaldosEnvargos_labelFacturasActivas)
                    .addComponent(panelClientesPendientes_labelNumeroFacturasActivas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelPagoslSaldosEnvargos_labelCapitalInvertido)
                    .addComponent(panelClientesPendientes_labelCapitalInvertidoDebitado)))
        );

        add(jPanel1);
        jPanel1.setBounds(10, 10, 240, 50);

        panelClientesPendientes_textFieldBuscador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelClientesPendientes_textFieldBuscador.setForeground(new java.awt.Color(0, 153, 255));
        panelClientesPendientes_textFieldBuscador.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar"));
        panelClientesPendientes_textFieldBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelClientesPendientes_textFieldBuscadorKeyReleased(evt);
            }
        });
        add(panelClientesPendientes_textFieldBuscador);
        panelClientesPendientes_textFieldBuscador.setBounds(10, 60, 470, 40);

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("DETALLES DE FACTURA"), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        panelPagoslSaldosEnvargos_labelInicial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelInicial.setText("Inicial:");

        panelPagoslSaldosEnvargos_labelCuotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelCuotas.setText("Valor Cuotas:");

        panelPagoslSaldosEnvargos_labelNumeroCuotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelNumeroCuotas.setText("Cuotas Acordadas:");

        panelPagoslSaldosEnvargos_labelFechaCreacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelFechaCreacion.setText("Fecha:");

        panelPagoslSaldosEnvargos_labelTotalFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelTotalFactura.setText("TOTAL:");

        panelPagoslSaldosEnvargos_labelCantidadInicial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelCantidadInicial.setForeground(new java.awt.Color(51, 0, 255));
        panelPagoslSaldosEnvargos_labelCantidadInicial.setText("0");

        panelPagoslSaldosEnvargos_labelCantidadCuotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelCantidadCuotas.setForeground(new java.awt.Color(51, 0, 255));
        panelPagoslSaldosEnvargos_labelCantidadCuotas.setText("0");

        panelPagoslSaldosEnvargos_labelCantidadNumeroCuotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelCantidadNumeroCuotas.setForeground(new java.awt.Color(51, 0, 255));
        panelPagoslSaldosEnvargos_labelCantidadNumeroCuotas.setText("0");

        panelPagoslSaldosEnvargos_labelCantidadCreacionFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelCantidadCreacionFactura.setForeground(new java.awt.Color(51, 0, 255));
        panelPagoslSaldosEnvargos_labelCantidadCreacionFactura.setText("0");

        panelPagoslSaldosEnvargos_labelCantidadTotalFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelCantidadTotalFactura.setForeground(new java.awt.Color(51, 0, 255));
        panelPagoslSaldosEnvargos_labelCantidadTotalFactura.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(panelPagoslSaldosEnvargos_labelInicial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelPagoslSaldosEnvargos_labelCantidadInicial))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(panelPagoslSaldosEnvargos_labelCuotas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelPagoslSaldosEnvargos_labelCantidadCuotas))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(panelPagoslSaldosEnvargos_labelNumeroCuotas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelPagoslSaldosEnvargos_labelCantidadNumeroCuotas))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(panelPagoslSaldosEnvargos_labelFechaCreacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelPagoslSaldosEnvargos_labelCantidadCreacionFactura)))
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panelPagoslSaldosEnvargos_labelTotalFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPagoslSaldosEnvargos_labelCantidadTotalFactura)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelPagoslSaldosEnvargos_labelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPagoslSaldosEnvargos_labelCantidadInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelPagoslSaldosEnvargos_labelCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPagoslSaldosEnvargos_labelCantidadCuotas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelPagoslSaldosEnvargos_labelNumeroCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPagoslSaldosEnvargos_labelCantidadNumeroCuotas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelPagoslSaldosEnvargos_labelFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPagoslSaldosEnvargos_labelCantidadCreacionFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelPagoslSaldosEnvargos_labelTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPagoslSaldosEnvargos_labelCantidadTotalFactura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(560, 170, 300, 200);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DETALLES DE CUOTAS"));

        panelPagoslSaldosEnvargos_labelCuotasRestantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelCuotasRestantes.setText("Cuotas restantes:");

        panelPagoslSaldosEnvargos_labelTotalRestante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelTotalRestante.setText("Total restante:");

        panelPagoslSaldosEnvargos_labelCantidadCuotasRestante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelCantidadCuotasRestante.setForeground(new java.awt.Color(51, 0, 255));
        panelPagoslSaldosEnvargos_labelCantidadCuotasRestante.setText("0");

        panelPagoslSaldosEnvargos_labelCantidadTotalRestante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPagoslSaldosEnvargos_labelCantidadTotalRestante.setForeground(new java.awt.Color(51, 0, 255));
        panelPagoslSaldosEnvargos_labelCantidadTotalRestante.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(panelPagoslSaldosEnvargos_labelTotalRestante)
                        .addGap(27, 27, 27)
                        .addComponent(panelPagoslSaldosEnvargos_labelCantidadTotalRestante))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(panelPagoslSaldosEnvargos_labelCuotasRestantes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPagoslSaldosEnvargos_labelCantidadCuotasRestante)))
                .addGap(26, 72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelPagoslSaldosEnvargos_labelCuotasRestantes)
                    .addComponent(panelPagoslSaldosEnvargos_labelCantidadCuotasRestante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelPagoslSaldosEnvargos_labelTotalRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPagoslSaldosEnvargos_labelCantidadTotalRestante))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        add(jPanel3);
        jPanel3.setBounds(10, 250, 220, 110);

        clientesPendientes_scroll_todosPagosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PAGOS"));

        clientesPendientes_tabla_todosPagosFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Cuotas pagadas", "Total pagado"
            }
        ));
        clientesPendientes_scroll_todosPagosFacturas.setViewportView(clientesPendientes_tabla_todosPagosFacturas);

        add(clientesPendientes_scroll_todosPagosFacturas);
        clientesPendientes_scroll_todosPagosFacturas.setBounds(230, 250, 330, 110);

        clientesPendientes_scroll_todasFacturasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FACTURAS ACTIVAS DE ESTE CLIENTE"));

        clientesPendientes_tabla_todasFacturasCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Fecha", "Total"
            }
        ));
        clientesPendientes_scroll_todasFacturasCliente.setViewportView(clientesPendientes_tabla_todasFacturasCliente);

        add(clientesPendientes_scroll_todasFacturasCliente);
        clientesPendientes_scroll_todasFacturasCliente.setBounds(560, 80, 300, 90);

        clientesPendientes_scroll_productosFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PRODUCTOS DE LA FACTURA"));

        clientesPendientes_tabla_productosFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Costo"
            }
        ));
        clientesPendientes_scroll_productosFactura.setViewportView(clientesPendientes_tabla_productosFactura);

        add(clientesPendientes_scroll_productosFactura);
        clientesPendientes_scroll_productosFactura.setBounds(10, 360, 550, 100);

        clientesPendientes_scroll_todasFacturasVentasCreditoActivas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CLIENTES CON FACTURAS PENDIENTES"));

        clientesPendientes_tabla_todasFacturasVentasCreditoActivas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Cedula", "Nombre", "Apellido", "Emicion"
            }
        ));
        clientesPendientes_tabla_todasFacturasVentasCreditoActivas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clientesPendientes_tabla_todasFacturasVentasCreditoActivasMouseReleased(evt);
            }
        });
        clientesPendientes_scroll_todasFacturasVentasCreditoActivas.setViewportView(clientesPendientes_tabla_todasFacturasVentasCreditoActivas);

        add(clientesPendientes_scroll_todasFacturasVentasCreditoActivas);
        clientesPendientes_scroll_todasFacturasVentasCreditoActivas.setBounds(10, 100, 550, 150);

        panelClientesPendientes_button_reImprimir.setBackground(new java.awt.Color(153, 255, 153));
        panelClientesPendientes_button_reImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelClientesPendientes_button_reImprimir.setText("Imprimir");
        panelClientesPendientes_button_reImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelClientesPendientes_button_reImprimirActionPerformed(evt);
            }
        });
        add(panelClientesPendientes_button_reImprimir);
        panelClientesPendientes_button_reImprimir.setBounds(740, 50, 120, 23);

        radioGroup.add(grupo_saldosEnvargos);
        grupo_saldosEnvargos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        grupo_saldosEnvargos.setText("Saldados/Envargados");
        grupo_saldosEnvargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo_saldosEnvargosActionPerformed(evt);
            }
        });
        add(grupo_saldosEnvargos);
        grupo_saldosEnvargos.setBounds(394, 44, 200, 23);

        radioGroup.add(grupo_Activos);
        grupo_Activos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        grupo_Activos.setSelected(true);
        grupo_Activos.setText("Solo Activos");
        grupo_Activos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo_ActivosActionPerformed(evt);
            }
        });
        add(grupo_Activos);
        grupo_Activos.setBounds(290, 44, 150, 23);

        panelClientesPendientes_button_eliminar.setBackground(new java.awt.Color(255, 102, 102));
        panelClientesPendientes_button_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelClientesPendientes_button_eliminar.setText("Eliminar");
        panelClientesPendientes_button_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelClientesPendientes_button_eliminarActionPerformed(evt);
            }
        });
        add(panelClientesPendientes_button_eliminar);
        panelClientesPendientes_button_eliminar.setBounds(620, 50, 120, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Datos del Articulo Seleccionado");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cantida Despues de Venta:");

        label_cantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_cantidad.setForeground(new java.awt.Color(51, 102, 255));
        label_cantidad.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_cantidad)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(label_cantidad))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(jPanel4);
        jPanel4.setBounds(560, 370, 300, 90);

        jButton1.setText("Avanzada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(480, 70, 81, 30);

        lb_facturadaPor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_facturadaPor.setText("      ");
        add(lb_facturadaPor);
        lb_facturadaPor.setBounds(290, 10, 560, 17);
    }// </editor-fold>//GEN-END:initComponents

    //Evento para el campo de busqueda, busca por datos del cliente o por el id de factura directamente.
    private void panelClientesPendientes_textFieldBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelClientesPendientes_textFieldBuscadorKeyReleased
        int estado = grupo_Activos.isSelected() ? 1 : 0;
        //Primero realizaFacturaVentaCredito la busqueda de los datos como si fuera un id de factura venta a credito.
        llenarTablaFacturaConIdFactura(panelClientesPendientes_textFieldBuscador.getText());
        //Si no encuentra nada busca como si los datos fueras el nombre de un cliente
        if (clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getValueAt(0, 0).equals("")) {
            java.sql.ResultSet rs1
                    = DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select
                            .todasFacturasVentasCreditoPorDatosCliente(
                                    panelClientesPendientes_textFieldBuscador.getText(), 1, estado);
            actualizarLlenarTablaFacturasVentaCreditoActivas(rs1);
        }
        //Si no encuentra nada busca como si los datos fueras el apellido de un cliente
        if (clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getValueAt(0, 0).equals("")) {
            java.sql.ResultSet rs1
                    = DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select
                            .todasFacturasVentasCreditoPorDatosCliente(
                                    panelClientesPendientes_textFieldBuscador.getText(), 2, estado);
            actualizarLlenarTablaFacturasVentaCreditoActivas(rs1);
        }
        //Si no encuentra nada busca como si los datos fueras la cedula de un cliente
        if (clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getValueAt(0, 0).equals("")) {
            java.sql.ResultSet rs1 = DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.todasFacturasVentasCreditoPorDatosCliente(
                    panelClientesPendientes_textFieldBuscador.getText(), 0, estado);
            actualizarLlenarTablaFacturasVentaCreditoActivas(rs1);
        }
    }//GEN-LAST:event_panelClientesPendientes_textFieldBuscadorKeyReleased

    //Evento de la tabla de 'todas las facturas activas':
    private void clientesPendientes_tabla_todasFacturasVentasCreditoActivasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesPendientes_tabla_todasFacturasVentasCreditoActivasMouseReleased
        String codigoEmpleado = DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.facturadaPor(
                (String) (clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getValueAt(clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getSelectedRow(),
                        0)));
        lb_facturadaPor.setText(
                "Facturada por:  "
                + DataBase.Facturacion.Empleado.Select.Empleado(codigoEmpleado, true));
        llenarVentanaConIdFactura((String) clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getValueAt(clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getSelectedRow(), 0));
    }//GEN-LAST:event_clientesPendientes_tabla_todasFacturasVentasCreditoActivasMouseReleased

    private void panelClientesPendientes_button_reImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelClientesPendientes_button_reImprimirActionPerformed
        String idFactura;
        try {
            idFactura = (String) clientesPendientes_tabla_todasFacturasVentasCreditoActivas
                    .getValueAt(clientesPendientes_tabla_todasFacturasVentasCreditoActivas
                            .getSelectedRow(), 0);
        } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
            idFactura = (String) clientesPendientes_tabla_todasFacturasVentasCreditoActivas
                    .getValueAt(0, 0);
        }
        java.util.Map<String, Object> parametros = new java.util.HashMap<>();
        parametros.put("idFactura", idFactura);
        Logica.Reportes.Reporte_generarConDB.ReportesConDB(
                parametros,
                "Financiera\\FacturaVentaCredito",
                false);
    }//GEN-LAST:event_panelClientesPendientes_button_reImprimirActionPerformed

    private void grupo_ActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo_ActivosActionPerformed
        eliminarAgregarFilasTablaFacturas();
        LimpiarVentana();
    }//GEN-LAST:event_grupo_ActivosActionPerformed

    private void grupo_saldosEnvargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo_saldosEnvargosActionPerformed
        eliminarAgregarFilasTablaFacturas();
    }//GEN-LAST:event_grupo_saldosEnvargosActionPerformed

    private void panelClientesPendientes_button_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelClientesPendientes_button_eliminarActionPerformed
        if (Logica.Cuadros_Emergentes.confirmacionDefinida(""
                + "-Se borrara la factura seleccionada.\n"
                + "-Los articulos regresaran al inventario\n"
                + "-El monto de la venta Saldra de el monto de dinero en caja.\n\n") == 0) {
            DataBase.Financiera.FacturaVentaCredito.VentaCredito.Update.ventaCreditoCambiarEstado(
                    clientesPendientes_tabla_todasFacturasVentasCreditoActivas
                            .getValueAt(clientesPendientes_tabla_todasFacturasVentasCreditoActivas
                                    .getSelectedRow(), 0).toString(), "0");
            //Carcular el costo de los productos de la factura
            int total = 0;
            for (int i = 0; i < clientesPendientes_tabla_productosFactura.getModel().getRowCount(); i++) {
                try {
                    int amount = Integer.parseInt((String) clientesPendientes_tabla_productosFactura.getModel().getValueAt(i, 2));
                    total += amount;
                } catch (java.lang.NumberFormatException e) {
                    break;
                }
            }
            //Disminuir el costo menos el inicial de la factura
            DataBase.Financiera.DatosFinanciera.Update.CambiarCostoFacturasActivas(
                    total
                    - Integer.parseInt(panelPagoslSaldosEnvargos_labelCantidadInicial
                            .getText()),
                    false);
            LimpiarVentana();
            actualizarLabelsTotalTacturasActivasYCostos();
            Logica.Cuadros_Emergentes.completado();
        }
    }//GEN-LAST:event_panelClientesPendientes_button_eliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Logica.Cuadros_Emergentes.BusquedaAvanzadaFacturasVentas(
                "BUSQUEDA AVANZADA DE FACTURAS DE CREDITO",
                "credito");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane clientesPendientes_scroll_productosFactura;
    private javax.swing.JScrollPane clientesPendientes_scroll_todasFacturasCliente;
    private javax.swing.JScrollPane clientesPendientes_scroll_todasFacturasVentasCreditoActivas;
    private javax.swing.JScrollPane clientesPendientes_scroll_todosPagosFacturas;
    private static javax.swing.JTable clientesPendientes_tabla_productosFactura;
    private static javax.swing.JTable clientesPendientes_tabla_todasFacturasCliente;
    private static javax.swing.JTable clientesPendientes_tabla_todasFacturasVentasCreditoActivas;
    private static javax.swing.JTable clientesPendientes_tabla_todosPagosFacturas;
    public static javax.swing.JRadioButton grupo_Activos;
    public static javax.swing.JRadioButton grupo_saldosEnvargos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private static javax.swing.JLabel label_cantidad;
    private static javax.swing.JLabel lb_facturadaPor;
    private static javax.swing.JButton panelClientesPendientes_button_eliminar;
    private static javax.swing.JButton panelClientesPendientes_button_reImprimir;
    private static javax.swing.JLabel panelClientesPendientes_labelCapitalInvertidoDebitado;
    private static javax.swing.JLabel panelClientesPendientes_labelNumeroFacturasActivas;
    private static javax.swing.JTextField panelClientesPendientes_textFieldBuscador;
    private static javax.swing.JLabel panelPagoslSaldosEnvargos_labelCantidadCreacionFactura;
    private static javax.swing.JLabel panelPagoslSaldosEnvargos_labelCantidadCuotas;
    private static javax.swing.JLabel panelPagoslSaldosEnvargos_labelCantidadCuotasRestante;
    private static javax.swing.JLabel panelPagoslSaldosEnvargos_labelCantidadInicial;
    private static javax.swing.JLabel panelPagoslSaldosEnvargos_labelCantidadNumeroCuotas;
    private static javax.swing.JLabel panelPagoslSaldosEnvargos_labelCantidadTotalFactura;
    private static javax.swing.JLabel panelPagoslSaldosEnvargos_labelCantidadTotalRestante;
    private javax.swing.JLabel panelPagoslSaldosEnvargos_labelCapitalInvertido;
    private javax.swing.JLabel panelPagoslSaldosEnvargos_labelCuotas;
    private javax.swing.JLabel panelPagoslSaldosEnvargos_labelCuotasRestantes;
    private javax.swing.JLabel panelPagoslSaldosEnvargos_labelFacturasActivas;
    private javax.swing.JLabel panelPagoslSaldosEnvargos_labelFechaCreacion;
    private javax.swing.JLabel panelPagoslSaldosEnvargos_labelInicial;
    private javax.swing.JLabel panelPagoslSaldosEnvargos_labelNumeroCuotas;
    private javax.swing.JLabel panelPagoslSaldosEnvargos_labelTotalFactura;
    private javax.swing.JLabel panelPagoslSaldosEnvargos_labelTotalRestante;
    private javax.swing.ButtonGroup radioGroup;
    // End of variables declaration//GEN-END:variables

    private void detallesComponentes() {
        panelClientesPendientes_button_reImprimir.setVisible(false);
        panelClientesPendientes_button_eliminar.setVisible(false);

        actualizarLabelsTotalTacturasActivasYCostos();

        //Evento Tabla
        clientesPendientes_tabla_productosFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Evento_tablaProductosFacturas();
            }
        });

        //MAYUSCULA campos de texto
        Logica.CamposTexto.Campo_mayuscula.campoTextoMayuscula(panelClientesPendientes_textFieldBuscador);

        //TAMAÑO celdas de tabla
        int[] tamaño = {40, 90, 160, 160, 80};
        Logica.tablas.Tabla_tamañoCeldas.setTablaColumnasTamaño(tamaño, clientesPendientes_tabla_todasFacturasVentasCreditoActivas);
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
    private static void eliminarAgregarFilasTablaFacturas() {
        for (int i = 0; i < 60; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel()).removeRow(i);
        }
        for (int i = 0; i < 30; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel()).removeRow(i);
        }
        for (int i = 0; i < 15; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel()).removeRow(i);
        }
        for (int i = 0; i < 8; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel()).removeRow(i);
        }
        for (int i = 0; i < 4; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel()).removeRow(i);
        }
        for (int i = 0; i < 2; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel()).removeRow(i);
        }
        ((DefaultTableModel) clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel()).removeRow(0);

        for (int i = 0; i < 120; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel()).addRow(new String[]{"", "", "", "", ""});
        }
    }

    private static void eliminarAgregarFilasTablaTodasFacturasCliente() {
        for (int i = 0; i < 3; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todasFacturasCliente.getModel()).removeRow(i);
        }
        ((DefaultTableModel) clientesPendientes_tabla_todasFacturasCliente.getModel()).removeRow(1);
        ((DefaultTableModel) clientesPendientes_tabla_todasFacturasCliente.getModel()).removeRow(0);
        //*
        for (int i = 0; i < 5; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todasFacturasCliente.getModel()).addRow(new String[]{"", "", ""});
        }
    }

    private static void eliminarAgregarFilasTablasPagosYProductosFactura() {
        for (int i = 0; i < 25; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todosPagosFacturas.getModel()).removeRow(i);
            ((DefaultTableModel) clientesPendientes_tabla_productosFactura.getModel()).removeRow(i);
        }
        for (int i = 0; i < 13; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todosPagosFacturas.getModel()).removeRow(i);
            ((DefaultTableModel) clientesPendientes_tabla_productosFactura.getModel()).removeRow(i);
        }
        for (int i = 0; i < 6; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todosPagosFacturas.getModel()).removeRow(i);
            ((DefaultTableModel) clientesPendientes_tabla_productosFactura.getModel()).removeRow(i);
        }
        for (int i = 0; i < 3; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todosPagosFacturas.getModel()).removeRow(i);
            ((DefaultTableModel) clientesPendientes_tabla_productosFactura.getModel()).removeRow(i);
        }
        for (int i = 0; i < 2; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todosPagosFacturas.getModel()).removeRow(i);
            ((DefaultTableModel) clientesPendientes_tabla_productosFactura.getModel()).removeRow(i);
        }
        ((DefaultTableModel) clientesPendientes_tabla_todosPagosFacturas.getModel()).removeRow(0);
        ((DefaultTableModel) clientesPendientes_tabla_productosFactura.getModel()).removeRow(0);

        for (int i = 0; i < 50; i++) {
            ((DefaultTableModel) clientesPendientes_tabla_todosPagosFacturas.getModel()).addRow(new String[]{"", "", "", "", ""});
            ((DefaultTableModel) clientesPendientes_tabla_productosFactura.getModel()).addRow(new String[]{"", "", "", "", ""});
        }
    }

    //llena la tabla de todas las facturas de venta credito activas con los datos recibidos por el ResultSet.
    public static void actualizarLlenarTablaFacturasVentaCreditoActivas(java.sql.ResultSet rs) {
        eliminarAgregarFilasTablaFacturas();
        eliminarAgregarFilasTablaTodasFacturasCliente();
        eliminarAgregarFilasTablasPagosYProductosFactura();
        try {
            while (rs.next()) {
                clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel().setValueAt(rs.getString("idVentaCredito"), rs.getRow() - 1, 0);
                clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel().setValueAt(rs.getString("cedulaCliente"), rs.getRow() - 1, 1);
                clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel().setValueAt(rs.getString("nombreCliente"), rs.getRow() - 1, 2);
                clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel().setValueAt(rs.getString("apellidoCliente"), rs.getRow() - 1, 3);
                clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getModel().setValueAt(rs.getString("fecha"), rs.getRow() - 1, 4);
            }
            rs.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    //llena la tabla de todas las facturas de venta credito activas de un cliente.
    private static void actualizarLlenarTablaTodasFacturasCliente(java.sql.ResultSet rs) {
        try {
            while (rs.next()) {
                clientesPendientes_tabla_todasFacturasCliente.getModel().setValueAt(rs.getString("idVentaCredito"), rs.getRow() - 1, 0);
                clientesPendientes_tabla_todasFacturasCliente.getModel().setValueAt(rs.getString("fecha"), rs.getRow() - 1, 1);
                clientesPendientes_tabla_todasFacturasCliente.getModel().setValueAt(rs.getString("totalPagar"), rs.getRow() - 1, 2);
            }
            rs.close();
        } catch (java.sql.SQLException e) {
        }
    }

    //llena la tabla de todos los pagos realizados de una factura.
    private static void actualizarLlenarTablaTodosPagos(java.sql.ResultSet rs) {
        try {
            while (rs.next()) {
                //Esta parte es para las facturas sin cuotas que muestren cuando
                //fue que pagaron del lado de monto y no de cuotas pagadas en la
                //tablaa de pagos realizados a una factura.
                int montoPagado;
                int cuotasPagadas;
                if (Integer.parseInt(panelPagoslSaldosEnvargos_labelCantidadCuotas.getText()) > 0) {
                    if (rs.getInt("montoPagado") == 0) {
                        montoPagado = rs.getInt("cuotasPagadas") * Integer.parseInt(panelPagoslSaldosEnvargos_labelCantidadCuotas.getText());
                        cuotasPagadas = rs.getInt("cuotasPagadas");
                    } else {
                        montoPagado = rs.getInt("montoPagado");
                        cuotasPagadas = rs.getInt("cuotasPagadas");
                    }
                } else {
                    montoPagado = rs.getInt("montoPagado");
                    cuotasPagadas = 0;
                }

                clientesPendientes_tabla_todosPagosFacturas.getModel().setValueAt(rs.getString("fecha"), rs.getRow() - 1, 0);
                clientesPendientes_tabla_todosPagosFacturas.getModel().setValueAt(cuotasPagadas, rs.getRow() - 1, 1);
                clientesPendientes_tabla_todosPagosFacturas.getModel().setValueAt(montoPagado, rs.getRow() - 1, 2);
            }
            rs.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    //llena la tabla de todos los pagos realizados de una factura.
    private static void actualizarLlenarTablaProductosFactura(java.sql.ResultSet rs) {
        java.sql.ResultSet rs2;
        try {
            while (rs.next()) {
                rs2 = DataBase.Facturacion.Producto.Select.productoDeFacturaVentaCredito(rs.getString("producto_idProducto"));
                rs2.next();
                clientesPendientes_tabla_productosFactura.getModel().setValueAt(rs2.getString("claveProducto"), rs.getRow() - 1, 0);
                clientesPendientes_tabla_productosFactura.getModel().setValueAt(rs2.getString("descripcionProducto"), rs.getRow() - 1, 1);
                clientesPendientes_tabla_productosFactura.getModel().setValueAt(rs.getString("costoProductoEnCompra"), rs.getRow() - 1, 2);
                rs2.close();
            }
            rs.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    public static void llenarTablaFacturaConIdFactura(String idFactura) {
        int estado = grupo_Activos.isSelected() ? 1 : 0;
        eliminarAgregarFilasTablaFacturas();
        java.sql.ResultSet rs = DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select
                .facturaVentaCreditoId(idFactura, estado);
        actualizarLlenarTablaFacturasVentaCreditoActivas(rs);
    }

    //Llena la ventana con los datos de un id de factura pasado pro parametro.
    @SuppressWarnings("ConvertToTryWithResources")
    public static void llenarVentanaConIdFactura(String idFacturaVentaCredito) {
        label_cantidad.setText("0");
        //Esta variable almacena el id del cliente antes de cerrar el Querey para usarlo en otro lado.
        String idCliente = "";
        //Llenar los componen de la ventana con los detalles de la factura:
        try {
            panelClientesPendientes_button_eliminar.setVisible(
                    (grupo_Activos.isSelected() && Logica.CredencialesDeUsuario.getPrivilegio() == 1)
            );
            panelClientesPendientes_button_reImprimir.setVisible(true);
            java.sql.ResultSet rs = DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.facturaVentaCreditoid(idFacturaVentaCredito);
            rs.next();
            panelPagoslSaldosEnvargos_labelCantidadInicial.setText(rs.getString("inicial"));
            panelPagoslSaldosEnvargos_labelCantidadCuotas.setText(rs.getString("cuotas"));
            panelPagoslSaldosEnvargos_labelCantidadNumeroCuotas.setText(rs.getString("cantidadCuotas"));
            panelPagoslSaldosEnvargos_labelCantidadCreacionFactura.setText(rs.getString("fecha"));
            panelPagoslSaldosEnvargos_labelCantidadTotalFactura.setText(rs.getString("totalPagar"));
            panelPagoslSaldosEnvargos_labelCantidadTotalRestante.setText(rs.getString("totalPagarRst"));
            panelPagoslSaldosEnvargos_labelCantidadCuotasRestante.setText(rs.getString("cantidadCuotasRst"));
            idCliente = rs.getString("cliente_idCliente");
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //Se limpia la tabla de 'todas las facturas activas del cliente' y luego se le pasan todas esas facturas.
        eliminarAgregarFilasTablaTodasFacturasCliente();
        java.sql.ResultSet rsTodasFacturasActivas = DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select.todasFacturasActivasDeClienteId(idCliente);
        actualizarLlenarTablaTodasFacturasCliente(rsTodasFacturasActivas);
        //Se limpian las tablas de 'todos los pagod de factura' y 'articulos de esta factura'
        eliminarAgregarFilasTablasPagosYProductosFactura();
        //Se llena la tabla de 'todos los pagos de factura'
        java.sql.ResultSet rsTodosPagos = DataBase.Financiera.Pagos.Select.todosPagosActivosFactura(idFacturaVentaCredito);
        actualizarLlenarTablaTodosPagos(rsTodosPagos);
        //*Se llena la tabla de 'productos de la factura'
        java.sql.ResultSet rsDetallesVentaCredito = DataBase.Financiera.FacturaVentaCredito.Detalle.Select.detallesFacturaVentaCredito(idFacturaVentaCredito);
        actualizarLlenarTablaProductosFactura(rsDetallesVentaCredito);
        panelClientesPendientes_button_eliminar.setEnabled(clientesPendientes_tabla_todosPagosFacturas.getModel().getValueAt(0, 0).toString().equals(""));
    }

    //Asigna los valores de Total facturas activas y  Costo de las facturas activas a sus campos correspondientes.
    public static void actualizarLabelsTotalTacturasActivasYCostos() {
        panelClientesPendientes_labelNumeroFacturasActivas.setText(
                DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select
                        .cantidadFacturasVentasCreditosActivas());
        panelClientesPendientes_labelCapitalInvertidoDebitado.setText(
                Integer.toString(DataBase.Financiera.DatosFinanciera.Select
                        .getMontoInvertidoEnLaCalle()));
    }

    private void Evento_tablaProductosFacturas() {
        String dato = DataBase.Financiera.datosproductosdespuesdeventacredito.Select
                .DatosProdcutoDespuesDeVenta(
                        (String) clientesPendientes_tabla_todasFacturasVentasCreditoActivas
                                .getValueAt(clientesPendientes_tabla_todasFacturasVentasCreditoActivas.getSelectedRow(), 0),
                        (String) clientesPendientes_tabla_productosFactura.getValueAt(clientesPendientes_tabla_productosFactura.getSelectedRow(), 0));
        label_cantidad.setText(dato);
    }

    public static void LimpiarVentana() {
        eliminarAgregarFilasTablaFacturas();
        eliminarAgregarFilasTablaTodasFacturasCliente();
        eliminarAgregarFilasTablasPagosYProductosFactura();

        //Llenar la tabla de ventas a credito activas
        actualizarLlenarTablaFacturasVentaCreditoActivas(
                DataBase.Financiera.FacturaVentaCredito.VentaCredito.Select
                        .todasFacturasVentasCreditoActivasConDatosCliente(false));
        panelClientesPendientes_textFieldBuscador.setText("");
        label_cantidad.setText("0");
        panelPagoslSaldosEnvargos_labelCantidadCuotasRestante.setText("0");
        panelPagoslSaldosEnvargos_labelCantidadTotalRestante.setText("0");
        panelPagoslSaldosEnvargos_labelCantidadInicial.setText("0");
        panelPagoslSaldosEnvargos_labelCantidadCuotas.setText("0");
        panelPagoslSaldosEnvargos_labelCantidadNumeroCuotas.setText("0");
        panelPagoslSaldosEnvargos_labelCantidadCreacionFactura.setText("0");
        panelPagoslSaldosEnvargos_labelCantidadTotalFactura.setText("0");
        panelClientesPendientes_button_reImprimir.setVisible(false);
        panelClientesPendientes_button_eliminar.setVisible(false);
        lb_facturadaPor.setText("");
        
        grupo_Activos.setSelected(true);
    }
}

package Diseño.Facturacion.paneles_pantallaPrincipal;

import Diseño.Facturacion.paneles_base.panelBase;
import Diseño.Facturacion.ventanas_bases.Ventana_base;
import com.mxrck.autocompleter.TextAutoCompleter;

public class panel_pantallaPrincipal extends panelBase {
    java.util.ArrayList<String> al = new java.util.ArrayList<>();
    TextAutoCompleter textAutoAcompleter;
    
    public panel_pantallaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel_PantallaPrincipal_BotonCaja = new javax.swing.JButton();
        panel_PantallaPrincipal_BotonCompras = new javax.swing.JButton();
        panel_PantallaPrincipal_BotonInventario = new javax.swing.JButton();
        panel_PantallaPrincipal_BotonVentas = new javax.swing.JButton();
        panel_PantallaPrincipal_BotonGerencia = new javax.swing.JButton();
        panel_PantallaPrincipal_labelNombreLog = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel_PantallaPrincipal_botonClientes = new javax.swing.JButton();
        panel_PantallaPrincipal_botonClientesPendientes = new javax.swing.JButton();
        panel_PantallaPrincipal_botonDistribuidores = new javax.swing.JButton();
        panel_PantallaPrincipal_botonReportes = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setLayout(null);

        panel_PantallaPrincipal_BotonCaja.setBackground(new java.awt.Color(204, 255, 204));
        panel_PantallaPrincipal_BotonCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_PantallaPrincipal_BotonCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/strongbox.png"))); // NOI18N
        panel_PantallaPrincipal_BotonCaja.setText("      CAJA");
        panel_PantallaPrincipal_BotonCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel_PantallaPrincipal_BotonCajaActionPerformed(evt);
            }
        });
        add(panel_PantallaPrincipal_BotonCaja);
        panel_PantallaPrincipal_BotonCaja.setBounds(10, 270, 240, 80);

        panel_PantallaPrincipal_BotonCompras.setBackground(new java.awt.Color(204, 255, 204));
        panel_PantallaPrincipal_BotonCompras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_PantallaPrincipal_BotonCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/trolley2.png"))); // NOI18N
        panel_PantallaPrincipal_BotonCompras.setText("   COMPRAS");
        panel_PantallaPrincipal_BotonCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel_PantallaPrincipal_BotonComprasActionPerformed(evt);
            }
        });
        add(panel_PantallaPrincipal_BotonCompras);
        panel_PantallaPrincipal_BotonCompras.setBounds(10, 110, 240, 80);

        panel_PantallaPrincipal_BotonInventario.setBackground(new java.awt.Color(204, 255, 204));
        panel_PantallaPrincipal_BotonInventario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_PantallaPrincipal_BotonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/trolley.png"))); // NOI18N
        panel_PantallaPrincipal_BotonInventario.setText("INVENTARIO");
        panel_PantallaPrincipal_BotonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel_PantallaPrincipal_BotonInventarioActionPerformed(evt);
            }
        });
        add(panel_PantallaPrincipal_BotonInventario);
        panel_PantallaPrincipal_BotonInventario.setBounds(10, 190, 240, 80);

        panel_PantallaPrincipal_BotonVentas.setBackground(new java.awt.Color(204, 255, 204));
        panel_PantallaPrincipal_BotonVentas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_PantallaPrincipal_BotonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/shopping-bag.png"))); // NOI18N
        panel_PantallaPrincipal_BotonVentas.setText("    VENTAS");
        panel_PantallaPrincipal_BotonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel_PantallaPrincipal_BotonVentasActionPerformed(evt);
            }
        });
        add(panel_PantallaPrincipal_BotonVentas);
        panel_PantallaPrincipal_BotonVentas.setBounds(10, 30, 240, 80);

        panel_PantallaPrincipal_BotonGerencia.setBackground(new java.awt.Color(204, 255, 204));
        panel_PantallaPrincipal_BotonGerencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_PantallaPrincipal_BotonGerencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/id-card.png"))); // NOI18N
        panel_PantallaPrincipal_BotonGerencia.setText("              GERENCIA");
        panel_PantallaPrincipal_BotonGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel_PantallaPrincipal_BotonGerenciaActionPerformed(evt);
            }
        });
        add(panel_PantallaPrincipal_BotonGerencia);
        panel_PantallaPrincipal_BotonGerencia.setBounds(250, 350, 240, 80);

        panel_PantallaPrincipal_labelNombreLog.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        panel_PantallaPrincipal_labelNombreLog.setForeground(new java.awt.Color(255, 255, 255));
        panel_PantallaPrincipal_labelNombreLog.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panel_PantallaPrincipal_labelNombreLog.setText("AM1 - Administrador");
        add(panel_PantallaPrincipal_labelNombreLog);
        panel_PantallaPrincipal_labelNombreLog.setBounds(490, 440, 380, 32);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pay.png"))); // NOI18N
        jButton1.setText("                 PAGOS");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(250, 30, 240, 80);

        panel_PantallaPrincipal_botonClientes.setBackground(new java.awt.Color(204, 255, 204));
        panel_PantallaPrincipal_botonClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_PantallaPrincipal_botonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/man.png"))); // NOI18N
        panel_PantallaPrincipal_botonClientes.setText("                 CLIENTES");
        panel_PantallaPrincipal_botonClientes.setBorder(null);
        panel_PantallaPrincipal_botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel_PantallaPrincipal_botonClientesActionPerformed(evt);
            }
        });
        add(panel_PantallaPrincipal_botonClientes);
        panel_PantallaPrincipal_botonClientes.setBounds(250, 110, 240, 80);

        panel_PantallaPrincipal_botonClientesPendientes.setBackground(new java.awt.Color(204, 255, 204));
        panel_PantallaPrincipal_botonClientesPendientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_PantallaPrincipal_botonClientesPendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/target.png"))); // NOI18N
        panel_PantallaPrincipal_botonClientesPendientes.setText(" CLIENTES PENDIENTES");
        panel_PantallaPrincipal_botonClientesPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel_PantallaPrincipal_botonClientesPendientesActionPerformed(evt);
            }
        });
        add(panel_PantallaPrincipal_botonClientesPendientes);
        panel_PantallaPrincipal_botonClientesPendientes.setBounds(250, 190, 240, 80);

        panel_PantallaPrincipal_botonDistribuidores.setBackground(new java.awt.Color(204, 255, 204));
        panel_PantallaPrincipal_botonDistribuidores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_PantallaPrincipal_botonDistribuidores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/manager.png"))); // NOI18N
        panel_PantallaPrincipal_botonDistribuidores.setText("       DISTRIBUIDORES");
        panel_PantallaPrincipal_botonDistribuidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel_PantallaPrincipal_botonDistribuidoresActionPerformed(evt);
            }
        });
        add(panel_PantallaPrincipal_botonDistribuidores);
        panel_PantallaPrincipal_botonDistribuidores.setBounds(250, 270, 240, 80);

        panel_PantallaPrincipal_botonReportes.setBackground(new java.awt.Color(204, 255, 204));
        panel_PantallaPrincipal_botonReportes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel_PantallaPrincipal_botonReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reportes.png"))); // NOI18N
        panel_PantallaPrincipal_botonReportes.setText("GANANCIA");
        panel_PantallaPrincipal_botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel_PantallaPrincipal_botonReportesActionPerformed(evt);
            }
        });
        add(panel_PantallaPrincipal_botonReportes);
        panel_PantallaPrincipal_botonReportes.setBounds(10, 350, 240, 80);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Fondo.png"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 930, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void panel_PantallaPrincipal_BotonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel_PantallaPrincipal_BotonVentasActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Ventana_base.PANELES[1].setVisible(true);
    }//GEN-LAST:event_panel_PantallaPrincipal_BotonVentasActionPerformed

    private void panel_PantallaPrincipal_BotonComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel_PantallaPrincipal_BotonComprasActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Ventana_base.PANELES[2].setVisible(true);
    }//GEN-LAST:event_panel_PantallaPrincipal_BotonComprasActionPerformed

    private void panel_PantallaPrincipal_BotonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel_PantallaPrincipal_BotonInventarioActionPerformed
        Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.panelModificar.setVisible(false);
        Diseño.Facturacion.paneles_modificar.panel_modificarArticulo.ModifyComponentsByPrivilege();
        Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario.panelNuevo.setVisible(false);
        Logica.herramientas.procesoDeHistorial();
        Ventana_base.PANELES[3].setVisible(true);
    }//GEN-LAST:event_panel_PantallaPrincipal_BotonInventarioActionPerformed

    private void panel_PantallaPrincipal_BotonCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel_PantallaPrincipal_BotonCajaActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Ventana_base.PANELES[4].setVisible(true);
    }//GEN-LAST:event_panel_PantallaPrincipal_BotonCajaActionPerformed

    private void panel_PantallaPrincipal_BotonGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel_PantallaPrincipal_BotonGerenciaActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Ventana_base.PANELES[5].setVisible(true);
    }//GEN-LAST:event_panel_PantallaPrincipal_BotonGerenciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Diseño.Financiera.paneles_pantallaPrincipal.panel_pagosSaldosEnvargos.ocultarPanelesVer();
        Logica.herramientas.procesoDeHistorial();
        Ventana_base.PANELES[16].setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void panel_PantallaPrincipal_botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel_PantallaPrincipal_botonClientesActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[6].setVisible(true);
    }//GEN-LAST:event_panel_PantallaPrincipal_botonClientesActionPerformed

    private void panel_PantallaPrincipal_botonClientesPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel_PantallaPrincipal_botonClientesPendientesActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Diseño.Financiera.paneles_pantallaPrincipal.panel_ClientesPendientes.LimpiarVentana();
        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[17].setVisible(true);
    }//GEN-LAST:event_panel_PantallaPrincipal_botonClientesPendientesActionPerformed

    private void panel_PantallaPrincipal_botonDistribuidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel_PantallaPrincipal_botonDistribuidoresActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[7].setVisible(true);
    }//GEN-LAST:event_panel_PantallaPrincipal_botonDistribuidoresActionPerformed

    private void panel_PantallaPrincipal_botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel_PantallaPrincipal_botonReportesActionPerformed
        Logica.herramientas.procesoDeHistorial();
        Ventana_base.PANELES[11].setVisible(true);
    }//GEN-LAST:event_panel_PantallaPrincipal_botonReportesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JButton panel_PantallaPrincipal_BotonCaja;
    public static javax.swing.JButton panel_PantallaPrincipal_BotonCompras;
    public static javax.swing.JButton panel_PantallaPrincipal_BotonGerencia;
    public static javax.swing.JButton panel_PantallaPrincipal_BotonInventario;
    private javax.swing.JButton panel_PantallaPrincipal_BotonVentas;
    private javax.swing.JButton panel_PantallaPrincipal_botonClientes;
    public static javax.swing.JButton panel_PantallaPrincipal_botonClientesPendientes;
    public static javax.swing.JButton panel_PantallaPrincipal_botonDistribuidores;
    public static javax.swing.JButton panel_PantallaPrincipal_botonReportes;
    public static javax.swing.JLabel panel_PantallaPrincipal_labelNombreLog;
    // End of variables declaration//GEN-END:variables

    /*Le coloca el nombre del usuario logueado al lablel
    'panel_PantallaPrincipal_labelNombreLog'Si el usuario logeado NO es un
    Administrador se ocultan los componentes que no son permitidos por este.*/
    public static void ModifyComponentsByPrivilege(String nombreLog) {
        if (Logica.CredencialesDeUsuario.getPrivilegio() == 1) {
            panel_PantallaPrincipal_BotonCaja.setVisible(true);
            panel_PantallaPrincipal_labelNombreLog.setText(nombreLog);
        } else if (Logica.CredencialesDeUsuario.getPrivilegio() == 0) {
            panel_PantallaPrincipal_BotonGerencia.setVisible(false);
            panel_PantallaPrincipal_labelNombreLog.setText(nombreLog);
        }
    }
}
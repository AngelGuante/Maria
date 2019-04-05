package Diseño.Facturacion.ventanas_bases;

import Diseño.Facturacion.paneles_pantallaPrincipal.panel_caja;
import Diseño.Facturacion.paneles_pantallaPrincipal.panel_clientes;
import Diseño.Facturacion.paneles_pantallaPrincipal.panel_compras;
import Diseño.Facturacion.paneles_programador.panel_configuracion;
import Diseño.Facturacion.paneles_pantallaPrincipal.panel_distribuidores;
import Diseño.Facturacion.paneles_pantallaPrincipal.panel_gerencia;
import Diseño.Facturacion.paneles_historiales.panel_historialCompras;
import Diseño.Facturacion.paneles_historiales.panel_historialFacturasDeCompraPorPagar;
import Diseño.Facturacion.paneles_historiales.panel_historialFacturasEliminadasVentas;
import Diseño.Facturacion.paneles_historiales.panel_historialVentas;
import Diseño.Facturacion.paneles_pantallaPrincipal.panel_inventario;
import Diseño.Facturacion.paneles_pantallaPrincipal.panel_pantallaPrincipal;
import Diseño.Facturacion.paneles_pantallaPrincipal.panel_ventas;
import Diseño.Facturacion.paneles_base.panelBase;
import Diseño.Facturacion.paneles_historiales.panel_historialFacturasEliminadasCompras;
import Diseño.Financiera.paneles_pantallaPrincipal.panel_pagosSaldosEnvargos;
import Diseño.Financiera.paneles_pantallaPrincipal.panel_ClientesPendientes;
import Diseño.Financiera.paneles_historiales.panel_historialEnvargos;
import Diseño.Financiera.paneles_historiales.panel_historialPagos;
import Diseño.Financiera.paneles_historiales.panel_historialSaldos;
import Diseño.Facturacion.paneles_pantallaPrincipal.Panel_reportesGanancias;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ventana_base extends javax.swing.JFrame {

    static public panelBase[] PANELES = {
        new panel_pantallaPrincipal(), //PANTALLA PRINCIPAL - 0
        new panel_ventas(), //VENTAS - 1
        new panel_compras(), //COMPRAS - 2
        new panel_inventario(), //INVENTARIO - 3
        new panel_caja(), //CAJA - 4
        new panel_gerencia(), //GERENCIA - 5
        new panel_clientes(), //CLIENTES - 6
        new panel_distribuidores(), //DISTRIBUIDORES - 7    
        new panel_historialVentas(), //HISTORIAL VENTAS - 8
        new panel_historialCompras(), //HISTORIAL COMPRAS - 9
        new panel_configuracion(),
        new Panel_reportesGanancias(), //REPORTES DE GANANCIA - 11
        new panel_historialFacturasEliminadasVentas(), //HISTORIAL FACTURAS DE VENTAS ELIMINADAS - 12
        new panel_historialFacturasDeCompraPorPagar(), //HISTORIAL FACTURAS DE COMPRA POR PAGAR - 13
        new panel_configuracion(), //CONFIGURACION - 14
        new panel_historialFacturasEliminadasCompras(), //HISTORIAL FACTURAS DE COMPRAS ELIMINADAS - 15
        new panel_pagosSaldosEnvargos(), //PANEL DE PAGOS SALDOS Y ENVARGOS - 16
        new panel_ClientesPendientes(), //PANEL CLIENTES PENDIENTES - 17 
        new panel_historialPagos(), //HISTORIAL DE PAGOS - 18
        new panel_historialSaldos(), //HISTORIAL DE SALDOS - 19
        new panel_historialEnvargos() //HISTORIAL DE ENVARGOS - 20
    };

    @SuppressWarnings({"OverridableMethodCallInConstructor", "UseSpecificCatch"})
    public Ventana_base() {
        initComponents();
        frameForm();
        modifyComponentsByUser();
        setIconImage(new javax.swing.ImageIcon(main.rutas.raiz + "\\Iconos\\LogoSistema.png").getImage());
        setTitle("Maria - Sistema de negocios");
        Diseño.Facturacion.paneles_pantallaPrincipal.panel_pantallaPrincipal
                .panel_PantallaPrincipal_labelNombreLog.setText(
                        DataBase.Facturacion.DatosFuncionamiento.Select.Datos()[7]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameBase_botonSalir = new javax.swing.JButton();
        BASEBOTONATRAS = new javax.swing.JButton();
        BASEBOTONINICIO = new javax.swing.JButton();
        frameBase_botonSalir1 = new javax.swing.JButton();
        frameBase_menu = new javax.swing.JMenuBar();
        frameBase_menuAdministracion = new javax.swing.JMenu();
        frameBase_menuItemFacturasPendientesPorPagar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        frameBase_menuItemFacturasEliminadas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        frameBase_menuProgramador = new javax.swing.JMenu();
        frameBase_menuItemConfiguracion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frameBase_botonSalir.setBackground(new java.awt.Color(255, 204, 255));
        frameBase_botonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        frameBase_botonSalir.setForeground(new java.awt.Color(0, 102, 102));
        frameBase_botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        frameBase_botonSalir.setText("");
        frameBase_botonSalir.setToolTipText("Finaliza el sistema y sus sub procesos.");
        frameBase_botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameBase_botonSalirActionPerformed(evt);
            }
        });

        BASEBOTONATRAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back.png"))); // NOI18N
        BASEBOTONATRAS.setText("Atras");
        BASEBOTONATRAS.setToolTipText("Regresar a la ventana anterior.");
        BASEBOTONATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BASEBOTONATRASActionPerformed(evt);
            }
        });

        BASEBOTONINICIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/house.png"))); // NOI18N
        BASEBOTONINICIO.setText("Inicio");
        BASEBOTONINICIO.setToolTipText("Regresar a la pantalla de inicio.");
        BASEBOTONINICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BASEBOTONINICIOActionPerformed(evt);
            }
        });

        frameBase_botonSalir1.setBackground(new java.awt.Color(255, 204, 255));
        frameBase_botonSalir1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        frameBase_botonSalir1.setForeground(new java.awt.Color(0, 102, 102));
        frameBase_botonSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lock.png"))); // NOI18N
        frameBase_botonSalir1.setText("Cerrar Seccion");
        frameBase_botonSalir1.setToolTipText("Cierra la seccion iniciada y regresa a la panalla de logeo.");
        frameBase_botonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameBase_botonSalir1ActionPerformed(evt);
            }
        });

        frameBase_menu.setBackground(new java.awt.Color(0, 0, 0));
        frameBase_menu.setForeground(new java.awt.Color(255, 255, 255));

        frameBase_menuAdministracion.setText("Administracion -");
        frameBase_menuAdministracion.setActionCommand("");

        frameBase_menuItemFacturasPendientesPorPagar.setText("Facturas pendientes por pagar");
        frameBase_menuItemFacturasPendientesPorPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameBase_menuItemFacturasPendientesPorPagarActionPerformed(evt);
            }
        });
        frameBase_menuAdministracion.add(frameBase_menuItemFacturasPendientesPorPagar);
        frameBase_menuAdministracion.add(jSeparator1);

        frameBase_menuItemFacturasEliminadas.setText("Facturas eliminadas (VENTAS)");
        frameBase_menuItemFacturasEliminadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameBase_menuItemFacturasEliminadasActionPerformed(evt);
            }
        });
        frameBase_menuAdministracion.add(frameBase_menuItemFacturasEliminadas);

        jMenuItem1.setText("Facturas eliminadas (COMPRAS)");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        frameBase_menuAdministracion.add(jMenuItem1);

        frameBase_menu.add(frameBase_menuAdministracion);

        frameBase_menuProgramador.setText("Programador");

        frameBase_menuItemConfiguracion.setText("Configuracion (SOLO  PROGRAMADOR)");
        frameBase_menuItemConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameBase_menuItemConfiguracionActionPerformed(evt);
            }
        });
        frameBase_menuProgramador.add(frameBase_menuItemConfiguracion);

        frameBase_menu.add(frameBase_menuProgramador);

        setJMenuBar(frameBase_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BASEBOTONATRAS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BASEBOTONINICIO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 479, Short.MAX_VALUE)
                .addComponent(frameBase_botonSalir1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frameBase_botonSalir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frameBase_botonSalir)
                    .addComponent(BASEBOTONATRAS)
                    .addComponent(BASEBOTONINICIO)
                    .addComponent(frameBase_botonSalir1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frameBase_botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frameBase_botonSalirActionPerformed
        backup();
        if (Logica.Cuadros_Emergentes.confirmacionDefinida(""
                + "-Cerrara el sistema.\n"
                + "-Si no a guardado algun tipo de informacion, esta se perdera.\n\n")
                == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_frameBase_botonSalirActionPerformed

    //Crea un BackUp de la base de datos.
    private static void backup() {
        String[] rutas = DataBase.Facturacion.DatosFuncionamiento.Select.Datos();
        File carpetaBackupEquipo = new File(main.rutas.raiz + "Dumps");
        carpetaBackupEquipo.mkdirs();

        Runtime runtime = Runtime.getRuntime();
        File backupUSB = new File(rutas[1] + "\\Backup.sql");
        File backupEquipo = new File(rutas[2] + "\\Backup-" + Logica.fechaHora.getFecha() + ".sql");

        try {
            InputStreamReader isr;
            BufferedReader br;

            FileWriter fileWriteruUSB = new FileWriter(backupUSB);
            FileWriter fileWriterEquipo = new FileWriter(backupEquipo);
            
            Process child = runtime.exec(rutas[0]
                    + "\\mysqldump  --opt --user=root --password=PrivateSource93@! --databases ventafinanciera -R");

            isr = new InputStreamReader(child.getInputStream());
            br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                fileWriteruUSB.write(line + "\n");
                fileWriterEquipo.write(line + "\n");
            }

            fileWriteruUSB.flush();
            fileWriterEquipo.flush();
            isr.close();
            br.close();
        } catch (IOException e) {
            Logica.Cuadros_Emergentes.alerta("Error al momento de crear el BackUp. \n"
                    + "Una o varias de las rutas no se encuentra y no se a podido crear el respaldo. \n"
                    + "Verificar las rutas o comunicarce con el prrogramador.");
            Logica.Cuadros_Emergentes.alerta(e.getMessage());
        }
    }

    private void BASEBOTONATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BASEBOTONATRASActionPerformed
        /*La variable "panelAMostrar" la cree porque al momento de retornar el
        ultimo panel desde get_historialPaneles()y mostrarlo directamente de la
        siguiente manera: 'metodos_Herramientas.herramientas.get_historialPaneles().setVisible(true)'
        cuando habia mas de 1 panel en la variable que almacena los paneles
        vistos como por ejemplo pantallaPrincipal -> Venta -> Clientes al
        momento de volver desde Clientes a Venta, el panel de Ventas no se hacia
        visible como se esperaba, pero me di cuenta que mostrandolo despues de
        la linea siguiente: 'metodos_Herramientas.herramientas.remove_historialPanelesLast();'
        este si se hace visible.*/
        panelBase panelAMostrar = Logica.herramientas.get_historialPaneles();
        Logica.herramientas.remove_historialPanelesLast();
        panelAMostrar.setVisible(true);
    }//GEN-LAST:event_BASEBOTONATRASActionPerformed

    private void BASEBOTONINICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BASEBOTONINICIOActionPerformed
        Logica.herramientas.ocultarSegundasVentanas();
    }//GEN-LAST:event_BASEBOTONINICIOActionPerformed

    private void frameBase_menuItemFacturasEliminadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frameBase_menuItemFacturasEliminadasActionPerformed
        Logica.herramientas.procesoDeHistorial();
        PANELES[12].setVisible(true);
        Diseño.Facturacion.paneles_historiales.panel_historialFacturasEliminadasVentas.llenarTablaTodosDatos();
    }//GEN-LAST:event_frameBase_menuItemFacturasEliminadasActionPerformed

    private void frameBase_menuItemFacturasPendientesPorPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frameBase_menuItemFacturasPendientesPorPagarActionPerformed
        Logica.herramientas.procesoDeHistorial();
        PANELES[13].setVisible(true);
        Diseño.Facturacion.paneles_historiales.panel_historialFacturasDeCompraPorPagar.llenarTablaTodosDatos();
    }//GEN-LAST:event_frameBase_menuItemFacturasPendientesPorPagarActionPerformed

    private void frameBase_menuItemConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frameBase_menuItemConfiguracionActionPerformed
        if ((Logica.Cuadros_Emergentes.confirmacionPassword()).equals("PrivateSource93")) {
            Logica.herramientas.procesoDeHistorial();
            PANELES[14].setVisible(true);
            Diseño.Facturacion.paneles_programador.panel_configuracion.setData();
        } else {
            Logica.Cuadros_Emergentes.alerta("Contraseña incorrecta.");
        }
    }//GEN-LAST:event_frameBase_menuItemConfiguracionActionPerformed

    private void frameBase_botonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frameBase_botonSalir1ActionPerformed
        if (Logica.Cuadros_Emergentes.confirmacionDefinida(""
                + "-Cerrara seccion iniciada.\n"
                + "-Si no a guardado algun tipo de informacion, esta se perdera.\n\n")
                == 0) {

            //Para limpiar el historial de paneles ya que al iniciar seccion de
            //nuevo los paneles de la seccion anterior quedaban cargados
            Logica.herramientas.clearHistorial();

            this.dispose();

            Diseño.Facturacion.paneles_loggin.panel_LogginAcceso.resertPanel();
            Diseño.Facturacion.ventanas_bases.Ventana_logginBase.resertLoggin();
            PANELES[0].setVisible(true);
            Diseño.Facturacion.paneles_pantallaPrincipal.panel_pantallaPrincipal.panel_PantallaPrincipal_BotonGerencia.setVisible(true);

            java.awt.EventQueue.invokeLater(() -> {
                new Diseño.Facturacion.ventanas_bases.Ventana_logginBase();
            });

        }
    }//GEN-LAST:event_frameBase_botonSalir1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Logica.herramientas.procesoDeHistorial();
        PANELES[15].setVisible(true);
        Diseño.Facturacion.paneles_historiales.panel_historialFacturasEliminadasCompras.llenarTablaTodosDatos();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BASEBOTONATRAS;
    public static javax.swing.JButton BASEBOTONINICIO;
    private javax.swing.JButton frameBase_botonSalir;
    private javax.swing.JButton frameBase_botonSalir1;
    private javax.swing.JMenuBar frameBase_menu;
    private javax.swing.JMenu frameBase_menuAdministracion;
    private javax.swing.JMenuItem frameBase_menuItemConfiguracion;
    private javax.swing.JMenuItem frameBase_menuItemFacturasEliminadas;
    private javax.swing.JMenuItem frameBase_menuItemFacturasPendientesPorPagar;
    private javax.swing.JMenu frameBase_menuProgramador;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void frameForm() {
        frameBase_botonSalir.setText("Cerrar Programa");
        //Verifico si la fecha en la que se abrio el programa tiene un cuadre
        //creado en caso de no ser asi crea un movimineto diario con el monto
        //inicial de la fecha con la que se cerron la fecha anterior.
        String fe = Logica.fechaHora.getFecha();
        Logica.gestiosDineroCaja.verificarExistenciaYEstadoDia((fe.substring(0, 2) + ". ")
                + (fe.substring(2, 4) + ". " + (fe.substring(4, fe.length()))));

        //Puse esto aqui porque el metodo setUndecorated() me daba un Exeption y
        //solo con  esta linea lo pude arreglar.
        dispose();

        for (panelBase paneles : PANELES) {
            add(paneles);
        }

        //Cargo todos los paneles y los mantengo invisibles para el usuario para
        // aumentar la velocidad de trancision entre "ventanas".
        for (int i = 1; i < PANELES.length; i++) {
            PANELES[i].setVisible(false);
        }
        BASEBOTONATRAS.setVisible(false);
        BASEBOTONINICIO.setVisible(false);

        setUndecorated(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(0, 0, 0));
        setVisible(true);
    }

    //Modifica los componente segun el privilegio del usuario.
    private void modifyComponentsByUser() {
        frameBase_botonSalir1.setVisible(
                DataBase.Facturacion.DatosFuncionamiento.Select.Datos()[3].equals("si"));
    }
}

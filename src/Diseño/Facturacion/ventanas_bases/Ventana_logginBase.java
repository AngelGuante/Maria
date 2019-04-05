package Diseño.Facturacion.ventanas_bases;

import Diseño.Facturacion.paneles_loggin.panel_LogginAcceso;
import Diseño.Facturacion.paneles_loggin.panel_LogginCargando;
import Diseño.Facturacion.paneles_base.PanelBase_Loggin;

public class Ventana_logginBase extends javax.swing.JFrame {

    private static javax.swing.JFrame estaVentana = null;
    public static PanelBase_Loggin[] PANELES = {
        new panel_LogginAcceso(), //ACCESO - 0
        new panel_LogginCargando(), //CARGANDO - 1
    };

    @SuppressWarnings({"OverridableMethodCallInConstructor", "UseSpecificCatch"})
    public Ventana_logginBase() {
        initComponents();
        frameForm();
        estaVentana = this;
        setIconImage(new javax.swing.ImageIcon(main.rutas.raiz + "\\Iconos\\LogoSistema.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private void frameForm() {
        for (PanelBase_Loggin paneles : PANELES) {
            add(paneles);
        }
        for (int i = 1; i < PANELES.length; i++) {
            PANELES[i].setVisible(false);
        }

        setTitle("Loggin - Maria");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    //Este metodo lo cree porque fue la unica manera que encontre para poder cerrar
    //esta ventana desde otro lado, espesificamente un panel.
    public static javax.swing.JFrame getThisObject() {
        return estaVentana;
    }

    /*Este metodo es para que cuando el usuario cierre seccion hacer que el panel
    "panel_LogginAcceso" aparezca de nuevo ya que no aparece automaticamente al
    crear un objeto de esta clase.*/
    public static void resertLoggin() {
        PANELES[0].setVisible(true);
    }
}

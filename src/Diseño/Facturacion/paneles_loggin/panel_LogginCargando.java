/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño.Facturacion.paneles_loggin;

/**
 *
 * @author Miki
 */
public class panel_LogginCargando extends Diseño.Facturacion.paneles_base.PanelBase_Loggin {

    /**
     * Creates new form panel_LogginCargando
     */
    public panel_LogginCargando() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jProgressBar1.setValue(100);
        add(jProgressBar1);
        jProgressBar1.setBounds(10, 120, 350, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cargando Programa");
        add(jLabel1);
        jLabel1.setBounds(100, 90, 181, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/FondoBloqueo.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 380, 220);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}

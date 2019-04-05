package Diseño.Paneles_herramientas;

public class Panel_efectivoEnTransaccion extends javax.swing.JPanel {

    public Panel_efectivoEnTransaccion(String monto) {
        initComponents();
        ComponentsDetails();
        panelTransacciones_label_montoReal.setText(monto);
        panelTransacciones_campoTexto_montoRecivido.setText(monto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTransacciones_campoTexto_montoRecivido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelTransacciones_label_montoReal = new javax.swing.JLabel();
        panelTransacciones_label_montoADevolver = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        panelTransacciones_campoTexto_montoRecivido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelTransacciones_campoTexto_montoRecivido.setForeground(new java.awt.Color(0, 102, 204));
        panelTransacciones_campoTexto_montoRecivido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelTransacciones_campoTexto_montoRecividoKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("TOTAL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("MONTO RECIVIDO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("A DEVOLVER ->");

        panelTransacciones_label_montoReal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        panelTransacciones_label_montoReal.setForeground(new java.awt.Color(0, 0, 204));
        panelTransacciones_label_montoReal.setText("jLabel4");

        panelTransacciones_label_montoADevolver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelTransacciones_label_montoADevolver.setForeground(new java.awt.Color(0, 0, 204));
        panelTransacciones_label_montoADevolver.setText("0 $");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panelTransacciones_label_montoReal)
                                .addGap(28, 28, 28))
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel2))
                            .addComponent(panelTransacciones_campoTexto_montoRecivido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelTransacciones_label_montoADevolver)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTransacciones_label_montoReal, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(panelTransacciones_campoTexto_montoRecivido))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTransacciones_label_montoADevolver)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelTransacciones_campoTexto_montoRecividoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelTransacciones_campoTexto_montoRecividoKeyReleased
        if (panelTransacciones_campoTexto_montoRecivido.getText().length() == 0) {
            panelTransacciones_campoTexto_montoRecivido.setText("0");
        }
        panelTransacciones_label_montoADevolver.setText(
                Integer.toString(
                        Integer.parseInt(
                                panelTransacciones_campoTexto_montoRecivido.getText())
                        - Integer.parseInt(
                                panelTransacciones_label_montoReal.getText())
                ) + " $"
        );
    }//GEN-LAST:event_panelTransacciones_campoTexto_montoRecividoKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField panelTransacciones_campoTexto_montoRecivido;
    private javax.swing.JLabel panelTransacciones_label_montoADevolver;
    private javax.swing.JLabel panelTransacciones_label_montoReal;
    // End of variables declaration//GEN-END:variables

    private void ComponentsDetails() {
        //TIPO campo de texto
        Logica.CamposTexto.Campo_tipoNumero.campoTextoTipoNumero(
                panelTransacciones_campoTexto_montoRecivido);

        //TAMAÑO campos de texto
        Logica.CamposTexto.Campo_limiteDigitosCampo.SetCampoTextoLimite(
                panelTransacciones_campoTexto_montoRecivido,
                5);
    }
}

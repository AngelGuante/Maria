package Diseño.Facturacion.paneles_base;

public class panelBase_crearArticuloClienteDistribuidor extends panelBase {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public panelBase_crearArticuloClienteDistribuidor() {
        initComponents();
        setBackground(new java.awt.Color(192, 192, 192));
        posicionTamañoComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCrearArticuloClienteDistribuidor_labelTitulo = new javax.swing.JLabel();
        panelCrearArticuloClienteDistribuidor_separador1 = new javax.swing.JSeparator();
        panelCrearArticuloClienteDistribuidor_labelLosCamposMarcadosSonObligatorios = new javax.swing.JLabel();

        panelCrearArticuloClienteDistribuidor_labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        panelCrearArticuloClienteDistribuidor_separador1.setBackground(new java.awt.Color(0, 0, 0));
        panelCrearArticuloClienteDistribuidor_separador1.setForeground(new java.awt.Color(0, 0, 0));

        panelCrearArticuloClienteDistribuidor_labelLosCamposMarcadosSonObligatorios.setForeground(new java.awt.Color(255, 0, 0));
        panelCrearArticuloClienteDistribuidor_labelLosCamposMarcadosSonObligatorios.setText("Los campos marcados con (*) son obligatorios.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCrearArticuloClienteDistribuidor_labelTitulo)
                    .addComponent(panelCrearArticuloClienteDistribuidor_separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelCrearArticuloClienteDistribuidor_labelLosCamposMarcadosSonObligatorios))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCrearArticuloClienteDistribuidor_labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCrearArticuloClienteDistribuidor_separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(panelCrearArticuloClienteDistribuidor_labelLosCamposMarcadosSonObligatorios))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JLabel panelCrearArticuloClienteDistribuidor_labelLosCamposMarcadosSonObligatorios;
    protected javax.swing.JLabel panelCrearArticuloClienteDistribuidor_labelTitulo;
    protected javax.swing.JSeparator panelCrearArticuloClienteDistribuidor_separador1;
    // End of variables declaration//GEN-END:variables
    private void posicionTamañoComponentes() {
        setBounds(550, 60, 335, 408);
        panelCrearArticuloClienteDistribuidor_labelTitulo.setBounds(5, 3, 150, 20);
        panelCrearArticuloClienteDistribuidor_separador1.setBounds(5, 25, 110, 20);
        panelCrearArticuloClienteDistribuidor_labelLosCamposMarcadosSonObligatorios.setBounds(5, 365, 300, 20);
    }
}

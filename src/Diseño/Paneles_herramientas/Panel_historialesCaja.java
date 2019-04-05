package Diseño.Paneles_herramientas;

import java.sql.ResultSet;

public class Panel_historialesCaja extends javax.swing.JPanel {

    private static javax.swing.JTable tabla;
    private static javax.swing.JScrollPane pane;
    private static javax.swing.table.DefaultTableModel model;

    private ResultSet rs;
    private String[] nombreColumnasTabla;

    public Panel_historialesCaja(ResultSet rs, String[] nombreColumnasTabla) {
        initComponents();

        this.rs = rs;
        this.nombreColumnasTabla = nombreColumnasTabla;

        ComponentsDetails();
        LlenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private void ComponentsDetails() {
        //Tabla
        tabla = new javax.swing.JTable();
        model = (javax.swing.table.DefaultTableModel) tabla.getModel();
        pane = new javax.swing.JScrollPane(tabla);
        pane.setBounds(0, 0, 385, 302);
        this.add(pane);

        //Fuentes Tabla
        tabla.setFont(new java.awt.Font("serif", java.awt.Font.PLAIN, 12));

        //Columnas Header Tabla
        String header[] = {"Numero", "Fecha", "monto"};
        for (String header1 : header) {
            model.addColumn(header1);
        }
    }

    private void LlenarTabla() {
        try {
            while (rs.next()) {
                model.addRow(new String[]{
                    rs.getString(nombreColumnasTabla[0]),
                    rs.getString(nombreColumnasTabla[1]),
                    rs.getString(nombreColumnasTabla[2])
                });
            }
            rs.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}

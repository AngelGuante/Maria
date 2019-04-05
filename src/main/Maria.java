package main;

import javax.swing.UIManager;

public class Maria {
    @SuppressWarnings({"CallToPrintStackTrace", "ResultOfObjectAllocationIgnored"})
    public static void main(String[] args) {
        for (UIManager.LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(laf.getName())) {
                try {
                    UIManager.setLookAndFeel(laf.getClassName());
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | javax.swing.UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        //Iniciar la conexion de el cliente
        new DataBase.ClientConexion();
        
        //Iniciar la UI
        if ((Logica.FileBufferWritter.existenciaCarpetaBase())) {
            String[] datos = DataBase.Facturacion.DatosFuncionamiento.Select.Datos();
            java.awt.EventQueue.invokeLater(() -> {
                //Si el sistema esta configurado para pedir contraseña se comprobaran todos los campos.
                if ((datos[3]).equals("si")) {
                    new Diseño.Facturacion.ventanas_bases.Ventana_logginBase();
                    switch (datos[4]) {
                        case "N":
                            Diseño.Facturacion.paneles_loggin.panel_LogginAcceso.radioNombre.setSelected(true);
                            Diseño.Facturacion.paneles_loggin.panel_LogginAcceso.panelLogginAcceso_textFieldNombre.setText(
                                    datos[5]);
                            break;
                        case "NC":
                            Diseño.Facturacion.paneles_loggin.panel_LogginAcceso.radioNombreContrasenia.setSelected(true);
                            Diseño.Facturacion.paneles_loggin.panel_LogginAcceso.panelLogginAcceso_textFieldNombre.setText(
                                    datos[5]);
                            Diseño.Facturacion.paneles_loggin.panel_LogginAcceso.panelLogginAcceso_textFieldContraseña.setText(
                                    datos[6]);
                            break;
                    }
                } else {
                    Logica.CredencialesDeUsuario.setPrivilegio(1);
                    new Diseño.Facturacion.ventanas_bases.Ventana_base();
                }
            });
        }
    }
}

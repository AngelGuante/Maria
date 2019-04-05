package Logica.Reportes;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Reporte_generarConDB {

    /**
     * Genera un reporte.
     *
     * @param parametros
     * @param reporteNombre
     * @param imprimir True -> Imprimir directamente. False -> Mostrar el
     * reporte.
     */
    public static void ReportesConDB(java.util.Map<String, Object> parametros, String reporteNombre, boolean imprimir) {
        //Datos del negocio
        String[] datos = DataBase.Facturacion.DatosNecocio.Select.Datos();
        parametros.put("NombreNegocio", datos[0]);
        parametros.put("Direccion1", datos[1]);
        parametros.put("Direccion2", datos[2]);
        parametros.put("telefono1", datos[3]);
        parametros.put("telefono2", datos[4]);
        parametros.put("Rnc", datos[5]);
        
        try {
            //Ruta del reporte
            String Path = main.rutas.raiz + "\\Reportes\\Modelos\\" + reporteNombre + ".jasper";
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(Path);
            //Pasar los parametros al reporte
            JasperPrint jprint = JasperFillManager.fillReport(
                    reporte,
                    parametros,
                    DataBase.ClientConexion.getConn());
            if (imprimir) {
                //Imprimir el reporte directamente
                JasperPrintManager.printReport(jprint, true);
            } else {
                //Mostrar el reporte
                JasperViewer view = new JasperViewer(jprint, false);
                view.setVisible(true);
            }
        } catch (JRException ex) {
            Logica.Cuadros_Emergentes.alerta("No se a encontrado el archivo .jasper,"
                    + " necesario para generar el reporte de esta accion.\n\n"
                    + ex.getMessage());
        }
    }
}

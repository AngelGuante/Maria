package Logica;

import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class GenerarExcel {

    public void generar(String[][] contenido, String ruta) {
        try{
            WorkbookSettings conf = new WorkbookSettings();
            conf.setEncoding("ISO-8859-1");
            WritableWorkbook workBook = Workbook.createWorkbook(new File(ruta), conf);
            
            WritableSheet sheet = workBook.createSheet("Facturas", 0);
            
            WritableFont h = new WritableFont(WritableFont.COURIER, 16, WritableFont.NO_BOLD);
            WritableCellFormat hFormat = new WritableCellFormat(h);
            
            for(int i = 0; i < contenido.length; i++){
                for(int j = 0; j < contenido[i].length; j++){
                    sheet.addCell(new jxl.write.Label(j, i, contenido[i][j], hFormat));
                }
            }
            workBook.write();
            workBook.close();
        }catch(IOException ex){
            System.err.println(ex);
        }catch(WriteException ex){
            System.err.println(ex);            
        }
    }
}

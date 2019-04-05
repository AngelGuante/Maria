package Logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileBufferWritter {

    private static File file;
    private static BufferedWriter bw;
    private static BufferedReader br;

    public static boolean existenciaCarpetaBase() {
        //'Maria' es la carpeta base donde guardare archivos que son importantes
        //para el funcionamiento del sistema, aqui verifico que dicha carpeta
        //existe y si no, es creada.
        file = new File(main.rutas.raiz);
        if (!file.exists()) {
            if (Logica.Cuadros_Emergentes.alertaConfirmacion() == 0) {
                file.mkdir();
                writeFile("botonGuardarClienteEnVenta.txt", "false");
                return true;
            }
        } else {
            return true;
        }
        return false;
    }

    //Metodo para escribir el contenido de un txt, recibe como parametro el nombre del
    //archivo dentro de la carpeta base 'Maria'
    public static void writeFile(String nombreArchivo, String texto) {
        file = new File(main.rutas.raiz + nombreArchivo);
        try {
            file.createNewFile();
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(texto);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metodo para escribir el contenido de un txt en una linea espesifica,
    //recibe como parametro el nombre del archivo dentro de la carpeta base 'Maria'
    public static void writeFileInSpesificLine(String nombreArchivo, String texto, int linea) {
        file = new File(main.rutas.raiz + nombreArchivo);
        try {
            java.util.List<String> lines = Files.readAllLines(file.toPath());
            lines.set(linea, texto);
            Files.write(file.toPath(), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metodo para leer el contenido de un txt, recibe como parametro el nombre del
    //archivo dentro de la carpeta base 'Maria'
    public static String readFile(String ruta) {
        String comprobar;
        String texto = "";
        try {
            br = new BufferedReader(new FileReader(main.rutas.raiz + ruta));
            comprobar = br.readLine();
            while (comprobar != null) {
                texto = comprobar;
                comprobar = br.readLine();
            }
        } catch (IOException e) {
        }
        return texto;
    }

    //Metodo para leer el contenido de un txt solo la linea espesificada,
    //recibe como parametro el nombre del archivo dentro de la carpeta base 'Maria'
    public static String readFileLineByLine(String ruta, int linea) {
        String texto = "";
        try {
            texto = Files.readAllLines(Paths.get(main.rutas.raiz + ruta)).get(linea);
            return texto;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return texto;
    }
}

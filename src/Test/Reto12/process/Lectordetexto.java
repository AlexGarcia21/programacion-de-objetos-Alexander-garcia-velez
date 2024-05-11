package Test.Reto12.process;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lectordetexto {
    public static void leerLibro(String nombreArchivo) {
        try (FileReader archivo = new FileReader(nombreArchivo);
             BufferedReader lector = new BufferedReader(archivo)) {
            String linea;
            System.out.println("Contenido de " + nombreArchivo + ":");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo " + nombreArchivo + ": " + e.getMessage());
        }
    }
}

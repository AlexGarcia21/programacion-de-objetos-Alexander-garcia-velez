package Test.Reto12.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Se elabora la clase de un depurador de texto donde sequieten los signos de interrogacion,
 * admiracion etc...
 */
public class Depuradortexto {

    public static String depurarTexto(String textoEntrada) {
        return textoEntrada.replaceAll("[^a-zA-Z0-9áéíóúÁÉÍÓÚüÜñÑ\\s,]", "");
    }

    public static String depurarArchivoTexto(String archivoEntrada) {
        StringBuilder textoDepurado = new StringBuilder();
        try (BufferedReader lector = new BufferedReader(new FileReader(archivoEntrada))) {
            String linea;
            while ((linea = lector.readLine())!= null) {
                textoDepurado.append(depurarTexto(linea)).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Hubo un error al leer o escribir: " + e.getMessage());
            e.printStackTrace();
        }
        return textoDepurado.toString();
    }
}
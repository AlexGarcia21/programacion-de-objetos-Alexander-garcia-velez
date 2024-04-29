package Test.Reto12.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Palabraincriptada {
    public static List<String> filtrarPalabrasEncriptadas(String nombreArchivo) {
        List<String> palabrasEncriptadas = new ArrayList<>();
        try (FileReader archivo = new FileReader(nombreArchivo);
             BufferedReader lector = new BufferedReader(archivo)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String palabra : palabras) {
                    if (esPalabraEncriptada(palabra)) {
                        palabrasEncriptadas.add(palabra);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return palabrasEncriptadas;
    }

    /**
     *     Este metodo se hizo para que ver si esta incriptada o codificada
      */
    private static boolean esPalabraEncriptada(String palabra) {
        return palabra.contains("patron_encriptado") || palabra.contains("caracteres_especificos");
    }
}

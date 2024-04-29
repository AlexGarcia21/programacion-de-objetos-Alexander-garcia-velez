package Test.Reto12.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Palabrasimpares {
    public static List<String> filtrarPalabrasImpares(String nombreArchivo) {
        List<String> palabrasImpares = new ArrayList<>();
        try (FileReader archivo = new FileReader(nombreArchivo);
             BufferedReader lector = new BufferedReader(archivo)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String palabra : palabras) {
                    if (palabra.length() % 2 != 0) {
                        palabrasImpares.add(palabra);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return palabrasImpares;
    }
}


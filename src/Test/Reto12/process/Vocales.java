package Test.Reto12.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Vocales {
    static String nombreArchivo = "archivo.txt";

    /**
     * En este metodo se cuenta las vocales
     * se lee cada linea del archivo
     * se convierte los caracteres a minisculas
     * Se filtran solo las minisculas
     * Se cuentan el numero de vocales
     * split("\\s+" para dividir cada linea en palabras y el \\s+ que representa el espacio en blanco
     *
     * @param nombreArchivo
     * @return
     */
    public static String contarVocales(String nombreArchivo) {
        StringBuilder vocalesEncontradas = new StringBuilder();
        try {
            List<String> palabras = Files.lines(Paths.get(nombreArchivo))
                    .flatMap(linea -> Arrays.stream(linea.split("\\s+")))
                    .toList();

            for (String palabra : palabras) {
                palabra = palabra.toLowerCase();
                for (int i = 0; i < palabra.length(); i++) {
                    char letra = palabra.charAt(i);
                    if ("aeiou".indexOf(letra) != -1) {
                        if (vocalesEncontradas.length() > 0) {
                            vocalesEncontradas.append(",");
                        }
                        vocalesEncontradas.append(letra);
                    }
                }
            }
            System.out.println("Palabras: " + String.join(", ", palabras));
            System.out.println("El archivo " + nombreArchivo + " contiene las vocales: " + vocalesEncontradas);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vocalesEncontradas.toString();
    }

    public static List<String> encontrarPalabrasSinVocales(String nombreArchivo) {
        List<String> palabrasSinVocales = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String palabra : palabras) {
                    if (!palabra.matches(".*[aeiou].*")) {
                        palabrasSinVocales.add(palabra);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return palabrasSinVocales;
    }

    /**
     * Aqui es para las palabras que empiezan por vocal
     * @param nombreArchivo
     */
    public void palabrasEmpiezanEnVocal(String nombreArchivo) {
        List<String> palabrasVocales = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String palabra : palabras) {
                    if (palabra.matches("[aeiouAEIOU].*")) {
                        palabrasVocales.add(palabra);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(palabrasVocales);
        for (String palabra : palabrasVocales) {
            System.out.println(palabra);
        }
    }

}

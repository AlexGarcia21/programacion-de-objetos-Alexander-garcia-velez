package Test.Reto12.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ContadorDePalabras {
    public static Map<String, Integer> contarPalabras(String nombreArchivo) {
        Map<String, Integer> contadorPalabras = new HashMap<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String palabra : palabras) {
                    palabra = palabra.toLowerCase();
                    contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorPalabras;
    }

    public static String encontrarPalabraMasRepetida(Map<String, Integer> contadorPalabras) {
        String palabraMasRepetida = "";
        int maxRepeticiones = 0;

        for (Map.Entry<String, Integer> entry : contadorPalabras.entrySet()) {
            if (entry.getValue() > maxRepeticiones) {
                palabraMasRepetida = entry.getKey();
                maxRepeticiones = entry.getValue();
            }
        }

        return palabraMasRepetida;
    }
    public static List<String> palabrasMasFrecuentes(Map<String, Integer> conteoPalabras, int n) {
        return conteoPalabras.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(n)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
    public static List<String> diezPalabrasMasFrecuentesAlfabeticamente(String nombreArchivo) {
        Map<String, Integer> conteoPalabras = contarPalabras(nombreArchivo);
        List<String> diezPalabrasMasFrecuentes = palabrasMasFrecuentes(conteoPalabras, 10);
        return diezPalabrasMasFrecuentes.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}

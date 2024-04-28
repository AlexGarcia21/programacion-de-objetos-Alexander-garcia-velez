package edu.alex.reto9.process;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

/**
 * Aqui hacemos los mismos pasos que lo anterior
 * solo usamos min y max para saber la largo de las palabras
 * https://youtu.be/uWZkUbGi0jU?si=aV39jILrLfYfKurx
 */

public class PalabraMasLargaCorta {
    static String nombreArchivo = "archivo.txt";
    public static void encontrarPalabraMasLargaYCorta(String nombreArchivo) {
        try {
            Optional<String> palabraMasLarga = Files.lines(Paths.get(nombreArchivo))
                    .flatMap(linea -> Arrays.stream(linea.split("\\s+")))
                    .max(Comparator.comparingInt(String::length));

            palabraMasLarga.ifPresent(palabra -> System.out.println("Palabra más larga: " + palabra));

            Optional<String> palabraMasCorta = Files.lines(Paths.get(nombreArchivo))
                    .flatMap(linea -> Arrays.stream(linea.split("\\s+")))
                    .min(Comparator.comparingInt(String::length));

            palabraMasCorta.ifPresent(palabra -> System.out.println("Palabra más corta: " + palabra));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package edu.alex.reto9.process;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Vocales {
    static String nombreArchivo = "archivo.txt";

    /**
     * En este metodo se cuenta las vocales
     * se lee cada linea del archivo
     * se convierte los caracteres a minisculas
     * Se filtran solo las minisculas
     * Se cuentan el numero de vocales
     * split("\\s+" para dividir cada linea en palabras y el \\s+ que representa el espacio en blanco
     * @param nombreArchivo
     */
    public static void contarVocales(String nombreArchivo) {
        try {
            long conteoVocales = Files.lines(Paths.get(nombreArchivo))
                    .flatMapToInt(String::chars)
                    .mapToObj(c -> (char) c)
                    .map(Character::toLowerCase)
                    .filter(c -> "aeiou".indexOf(c) != -1)
                    .count();

            Files.lines(Paths.get(nombreArchivo))
                    .flatMap(linea -> Arrays.stream(linea.split("\\s+")))
                    .forEach(palabra -> System.out.println("Palabra: " + palabra));

            System.out.println("El archivo " + nombreArchivo + " contiene " + conteoVocales + " vocales.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

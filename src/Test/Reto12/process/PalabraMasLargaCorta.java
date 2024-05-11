package Test.Reto12.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Aqui hacemos los mismos pasos que lo anterior
 * solo usamos min y max para saber la largo de las palabras
 * https://youtu.be/uWZkUbGi0jU?si=aV39jILrLfYfKurx
 */

/**
 * Aqui se dividi la clase en 2  por que es mas sencillo para mi.
 * aqui solo se encuentra la palabra mas larga del archivo txt.
 */

public class PalabraMasLargaCorta {
    static String nombreArchivo = "archivo.txt";

        public static String findPalabralarga(String nombreArchivo) {
            String Palabralarga = "";
            try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        if (word.length() > Palabralarga.length()) {
                            Palabralarga = word;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Palabralarga;
        }


    /**
     * Aqui modifico el otro metodo para sacar la palabra mas corta.
     * @param nombreArchivo
     * @return
     */
    public static String Findpalabracorta(String nombreArchivo) {
        String palabraCorta = "";
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (palabraCorta.length() == 0 || word.length() < palabraCorta.length()) {
                    palabraCorta = word;
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
        return palabraCorta;
}

    /**
     * Aqui se hace este metodo para ver que palabra es igual mas veces
     *
     * @param text
     * @param word
     * @return
     */
    public static List<String> findPalabrarep(String text, String word) {
        List<String> foundPalabra = new ArrayList<>();
        int index = 0;
        while ((index = text.indexOf(word, index)) != -1) {
            foundPalabra.add(word);
            index += word.length();
        }
        return foundPalabra;
    }
    }
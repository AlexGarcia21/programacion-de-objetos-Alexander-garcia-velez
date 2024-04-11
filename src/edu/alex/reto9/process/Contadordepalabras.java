package edu.alex.reto9.process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Aqui se ponen los metodos para poder contar las palabras del archivo formato txt
 * Tambien de como encontrar la palabra mas repetida de dicho formato.
 * Paginas de ayuda:https://tecnologiasmoviles.com/hashmap-java/#:~:text=Importancia%20de%20la%20clase%20java.util.HashMap
 * https://youtu.be/jT0gnObfFls?si=71eqcjCcI57v2Sf
 * https://youtu.be/8uuJSNj6ZQE?si=y6mDMVjUwxmRZUkB
 * y chatgpt
 */
public class Contadordepalabras {
    public static void contarPalabras(String nombreArchivo) {
            try {
                Map<String, Integer> contadorPalabras = new HashMap<>(); //se declara el hashmap

                BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String[] palabras = linea.split("\\s+"); // Dividir la línea en palabras
                    for (String palabra : palabras) {
                        palabra = palabra.toLowerCase(); // Convierto las palabras a miniscula
                        contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
                lector.close();
                //aqui ya es para encontrar la pabra mas repetida
                String palabraMasRepetida = "";
                int maxRepeticiones = 0;
                for (Map.Entry<String, Integer> entry : contadorPalabras.entrySet()) {
                    if (entry.getValue() > maxRepeticiones) {
                        palabraMasRepetida = entry.getKey();//para me devuelva la clave mas repetida
                        maxRepeticiones = entry.getValue();//para que me devuelva el valor asociada a la clave
                    }
                }

              /*
              aqui puse estos ya que los quise mover al CLI pero no pude o me marcaba error o al momento de
              ejecutarlo me daba 0 palabras y mejor lo deje aqui.
               */

                System.out.println("Total de palabras: " + contadorPalabras.size());
                System.out.println("Palabra más repetida: " + palabraMasRepetida + " - Repeticiones: " + maxRepeticiones);

            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        }
    }

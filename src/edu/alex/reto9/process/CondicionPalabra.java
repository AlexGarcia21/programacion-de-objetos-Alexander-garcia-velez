package edu.alex.reto9.process;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CondicionPalabra {
            String nombreArchivo = "archivo.txt";

    /**
     * Aqui hacemos lo mismo que los anteriores casos leemos el archivo y usamos el split
     * para dividir xada linea en palabras.
     * utilizamos el anyMatch para que al menos una de la condicion se cumpla y me de un verdadero o falso.
     * ah lo que investigue esta expresion (?i) no distingue las mayusculas y minisculas
     * ^ Este indica el incio de la cadena y [aeiou] busca la vocal al comienzo de la cadena
     * * Este busca cualquier caracter,[aeiou]$ busca cualquier vocal al final de la cadena que seguido por el $ que indica el final de esta misma.
     * @param nombreArchivo
     */
           public static void PalabrasCondicion(String nombreArchivo)
        {
            try {
                boolean existePalabra = Files.lines(Paths.get(nombreArchivo))
                        .flatMap(linea -> Arrays.stream(linea.split("\\s+")))
                        .anyMatch(palabra -> palabra.matches("(?i)^[aeiou].*[aeiou]$") && palabra.length() >= 5);

                if (existePalabra) {
                    System.out.println("Se encontró al menos una palabra que cumple con las condiciones.");
                } else {
                    System.out.println("No se encontró ninguna palabra que cumpla con las condiciones.");
                }

            } catch (
                    IOException e) {
                e.printStackTrace();
            }
        }
        }
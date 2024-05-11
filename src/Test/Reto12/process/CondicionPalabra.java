package Test.Reto12.process;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Aqui cambie mi variable anterior por un boolean ya que se me hacia mas facil hacer asi
 * las pruebas unitarias
 */
public class CondicionPalabra {
    public static boolean tienePalabraCondicion(String nombreArchivo) {

        try {
            return Files.lines(Paths.get(nombreArchivo))
                    .flatMap(linea -> Arrays.stream(linea.split("\\s+")))
                    .anyMatch(palabra -> palabra.matches("(?i)^[aeiou].*[aeiou]$") && palabra.length() >= 2);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}

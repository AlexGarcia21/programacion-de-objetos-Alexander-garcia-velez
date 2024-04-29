package Test.Reto12.process;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Aqui se logra hacer el test para leer libro
 * Usamos el ByteArrayOutputStream para poder alamcenar datos antes de escribirlos a un flujo de salida
 * en si a lo que entendi es un array de bits y manda
 * todo a la consola sin necesidad de imprimir todo el archivo.
 *
 *
 */
public class LectordetextoTest {

    @Test
    public void leerLibroTest() {
        String nombreArchivo = "C:\\El principito.txt";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream capturaSalida = new PrintStream(outputStream);

        System.setOut(capturaSalida);

        Lectordetexto.leerLibro(nombreArchivo);

        String[] lines = outputStream.toString().split(System.lineSeparator());
        String firstLine = lines[0];


        String expectedOutput = "Contenido de " + nombreArchivo + ":";
        assertEquals(expectedOutput, firstLine.trim());
    }


    @Test
    public void leerLibroArchivoNoExisteTest() {
        String nombreArchivo = "archivo_noexiste.txt";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream capturaSalida = new PrintStream(outputStream);

        System.setOut(capturaSalida);

        Lectordetexto.leerLibro(nombreArchivo);

        String expectedErrorMessage = "Error al leer el archivo " + nombreArchivo;
        String actualErrorMessage = outputStream.toString().trim();

        assertTrue(actualErrorMessage.startsWith(expectedErrorMessage));
    }

    /**
     * aqui se hace un test en caso de que el libro contenga caaracteres especiales
     * aun asi pueda ejecutarse y mostrar los caracteres especiales.
     */
    @Test
    public void leerLibroCaracteresEspecialesTest() {
        String rutaArchivo = "C:\\Caracteres_esp_Test.txt";
        Lectordetexto.leerLibro(rutaArchivo);
    }

    @Test
    public void leerLibroConPalabrasEnDiferentesIdiomasTest() {
        String rutaArchivo = "C:\\DiferentesIdiomas_Test.txt";
        Lectordetexto.leerLibro(rutaArchivo);
    }


    }
/*
  public class LectordetextoTest {

      @Test
 *     public void leerLibroTest() {
 *         String nombreArchivo = "C:\\El principito.txt";
 *
 *         ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
 *         PrintStream capturaSalida = new PrintStream(outputStream);
 *
 *         System.setOut(capturaSalida);
 *
 *         Lectordetexto.leerLibro(nombreArchivo);
 *
 *         String expectedOutput = "Contenido de " + nombreArchivo + ":\n";
 *         assertEquals(expectedOutput, outputStream.toString());
 *     }
 * }
*/

/**
 * Aqui lo dejo para mi ya que el error era que la prueba espera ael nombre del archivo literal,por eso marca error.
 *  String[] lines = outputStream.toString().split(System.lineSeparator());
 *          String firstLine = lines[0];
 *        habia que meter estas lineas de codigo
 *        para que se pudiera leer linea por linea y leer todo el archivo y asi marcara correctamente todo
 */


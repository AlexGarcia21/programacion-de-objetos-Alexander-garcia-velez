package Test.Reto12.process;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VocalesTest {
    @Test
    public void TienevocalesTest() {
        Vocales vocales = new Vocales();
        String PalabracortaActual = vocales.contarVocales("C:\\PalabralargaTest.txt");
        String PalabracprtaExpected = "e,e,o,e,e,a,o,a,i,a,o,a,o,o,i,a,o";
        /**
         * Aqui al momento de poner las vocales aeiou me las saba mal y no haye otro medo para
         * no hacerlo asi,y tuve qe poner las palabras esperadas
         */
        assertEquals(PalabracprtaExpected, PalabracortaActual);
    }

    /**
     * Test para ver si la palabra no tiene vocales
     */
    @Test
    public void NotienevocalesTest() {
        Vocales vocales = new Vocales();
        String palabrasSinVocalesActual = String.join(",", vocales.encontrarPalabrasSinVocales("C:\\Sin_vocales.txt"));
        List<String> palabrasSinVocalesExpected = Arrays.asList("Lctrnclgrafsst");
        assertEquals(palabrasSinVocalesExpected.toString(), palabrasSinVocalesActual);
    }



    /**
     * Test para saber si la palabra empieza por vocal
     */
    @Test
    public void testPalabrasEmpiezanEnVocal() {
        PalabraEmpiezaPorVocal.ProcesadorTexto procesador = new PalabraEmpiezaPorVocal.ProcesadorTexto();
        List<String> palabrasEsperadas = obtenerPalabrasEsperadas("texto.txt");

        List<String> palabrasObtenidas = new ArrayList<>();
        PalabraEmpiezaPorVocal.TextoSalida textoSalida = new PalabraEmpiezaPorVocal.TextoSalida() {
            @Override
            public void imprimir(String palabra) {
                palabrasObtenidas.add(palabra);
            }
        };

        procesador.palabrasEmpiezanEnVocal("C:\\ El principito.txt", textoSalida);
        Collections.sort(palabrasObtenidas);

        assertEquals(palabrasEsperadas, palabrasObtenidas);
    }

    /**
     * Aqui deje esto ya que si lo ponia en mi clase de empieza por vocal
     * no me se ejecutaba el programa aunque pusiera la clase publica.
     * @param nombreArchivo
     * @return
     */
    private List<String> obtenerPalabrasEsperadas(String nombreArchivo) {
        List<String> palabrasEsperadas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String palabra : palabras) {
                    if (palabra.matches("[aeiouAEIOU].*")) {
                        palabrasEsperadas.add(palabra);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(palabrasEsperadas);
        return palabrasEsperadas;
    }

}

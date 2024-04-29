package Test.Reto12.process;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class PalabrasimparesTest {
    @Test
    public void testFiltrarPalabrasImpares() {
        String rutaArchivo = "C:\\archivo.txt";
        List<String> palabrasFiltradas = Palabrasimpares.filtrarPalabrasImpares(rutaArchivo);

        for (String palabra : palabrasFiltradas) {
            assertTrue("La palabra no tiene un número impar de letras: " + palabra, palabra.length() % 2 != 0);
        }
    }
}

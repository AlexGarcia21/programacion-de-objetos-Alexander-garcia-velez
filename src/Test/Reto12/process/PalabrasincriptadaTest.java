package Test.Reto12.process;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Aqui se hizo una prueba para ver si
 * pasa los codigos codificados e incriptados
 * como ejemplo transforme un texto a codigo binario
 * y paso el test correctamente
 */
public class PalabrasincriptadaTest {
    @Test
    public void testFiltrarPalabrasEncriptadas() {
        String rutaArchivo = "C:\\HexadecimalTest.txt";
        //C:\Codigoincriptado.txt

        List<String> palabrasFiltradas = Palabraincriptada.filtrarPalabrasEncriptadas(rutaArchivo);

        for (String palabra : palabrasFiltradas) {
            assertTrue("La palabra no está encriptada o codificada: " + palabra, esPalabraEncriptada(palabra));
        }
    }



    /**
     *     Este metodo se hizo para que ver si esta incriptada o codificada
     */
    private boolean esPalabraEncriptada(String palabra) {

        return palabra.contains("patron_encriptado") || palabra.contains("caracteres_especificos");
    }
}

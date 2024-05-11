package Test.Reto12.process;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * aqui el test para depurar con caracteres
 *el segundo test es lo mismo pero para un archivo txt
 */
public class DepuradortextoTest {

    @Test
    public void testDepurarTexto() {
        String textoEntrada = "!Hola soy alex¡ ¿estudio? ingenira";

        String textoEsperado = "Hola soy alex estudio ingenira";

        String depurarTexto = Depuradortexto.depurarTexto(textoEntrada);

        assertEquals(textoEsperado, depurarTexto);
    }
    @Test
    public void testDepurarArchivoTexto() {

        String archivoEntrada = "C:\\archivo_depurado_Test.txt";

        String textoEsperado = "Hola soy alex estudio ingenira\n";

        String depurarArchivoTexto = Depuradortexto.depurarArchivoTexto(archivoEntrada);

        assertEquals(textoEsperado, depurarArchivoTexto);
    }
}

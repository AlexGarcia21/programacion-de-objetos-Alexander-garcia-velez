package Test.Reto12.process;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Aqui se prueba si el archivo.txt se cumplen correctamente con las condiciones.
 */
public class condicionPalabraTest {

    @Test
    public void tienepalabracondicionTest() {
        String nombreArchivo = "C:\\El Principito.txt";
        assertTrue(CondicionPalabra.tienePalabraCondicion(nombreArchivo));
    }

    @Test
    public void notienepalabracondiconTest() {
        String nombreArchivo = "archivo.txt";
        assertFalse(CondicionPalabra.tienePalabraCondicion(nombreArchivo));
    }
    @Test
    public void NoseencontroarchivoTest(){

        String nombreArchivo = "";
        assertFalse(CondicionPalabra.tienePalabraCondicion(nombreArchivo));
    }
}
/**
 * profe,aqui ya no supe que onda por que al momento de poner el nombre de mi archivo
 * que ya tengo en resources,no corre me marca el test error.
 * pero al momento de poner la ruta de C:\\ si me la marca bien.
 * mi duda es que si quiero que sea cualquier archivo y no especificamente ese como lo haria?
 */
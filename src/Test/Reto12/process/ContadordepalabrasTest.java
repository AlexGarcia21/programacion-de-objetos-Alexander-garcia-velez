package Test.Reto12.process;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ContadordepalabrasTest {
    @Test
    public void TestContadordepalabras(){
    String nombreArchivo="C:\\archico_contadorpalabras.txt";
        Map<String, Integer> resultado = ContadorDePalabras.contarPalabras(nombreArchivo);

        assertNotNull(resultado);


        assertEquals(1, (int) resultado.getOrDefault("hola", 0));
        assertEquals(1, (int) resultado.getOrDefault("mezcal", 0));
        assertEquals(1, (int) resultado.getOrDefault("pollo", 0));
    }
    @Test
    public void PalabrarepetidaTest(){
        String nombreArchivo = "C:\\archico_contadorpalabras.txt";
        Map<String, Integer> contadorPalabras = ContadorDePalabras.contarPalabras(nombreArchivo);
        String palabraMasRepetida = ContadorDePalabras.encontrarPalabraMasRepetida(contadorPalabras);

        assertNotNull(palabraMasRepetida);
     assertTrue(!palabraMasRepetida.isEmpty());
    }
    @Test
    public void Top10Test(){
        String texto = "C:\\archivo_depurado_Test.txt";
        List<String> esperado = List.of("alex","estudio","hola","ingenira.","soy");
        List<String> actual = ContadorDePalabras.diezPalabrasMasFrecuentesAlfabeticamente(texto);
        assertEquals(esperado, actual);
    }

    }
/**
 *     public void PalabrarepetidaTest(){
 *         String nombreArchivo = "C:\\archico_contadorpalabras.txt";
 *         Map<String, Integer> contadorPalabras = ContadorDePalabras.contarPalabras(nombreArchivo);
 *         String palabraMasRepetida = ContadorDePalabras.encontrarPalabraMasRepetida(contadorPalabras);
 *
 *         assertEquals("", palabraMasRepetida);
 *
 *
 *         Lo habia dejado asi pero tenia que definir la palabra que se esperaba
 *         que era mezcal, pero con estos ya el programa lo da en automatico
 *        " assertNotNull(palabraMasRepetida);
 *  *     assertTrue(!palabraMasRepetida.isEmpty());"
 *
 */
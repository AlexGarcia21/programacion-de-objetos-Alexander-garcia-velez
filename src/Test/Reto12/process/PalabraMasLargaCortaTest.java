package Test.Reto12.process;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PalabraMasLargaCortaTest {

        @Test
        public void PalabralargaTest() {
     PalabraMasLargaCorta palabraMasLargaCorta = new  PalabraMasLargaCorta();
            String PalabraMasLargaCortaActual= palabraMasLargaCorta.findPalabralarga("C:\\PalabralargaTest.txt");
            String PalabralargaExpected = "Electroencefalografista"; // Aqui solo remplace la palabra esperada ya que no pude hacer que se lo sacara en automatico
            assertEquals(PalabralargaExpected, PalabraMasLargaCortaActual);
        }


        @Test
    public void PalabracortaTest(){
            PalabraMasLargaCorta palabraMasLargaCorta = new  PalabraMasLargaCorta();
            String PalabracortaActual =  palabraMasLargaCorta.Findpalabracorta("C:\\PalabralargaTest.txt");
            String PalabracprtaExpected = "hola";
            assertEquals( PalabracprtaExpected, PalabracortaActual);
        }
    @Test
    public void FindpalabrarepetidaTest() {
        String text = "El doctor es un Electroencefalografista dice que el Electroencefalografista gana muy bien ";
        String word = "Electroencefalografista";
        List<String> expected = List.of("Electroencefalografista","Electroencefalografista");
        List<String> actual = PalabraMasLargaCorta.findPalabrarep(text, word);
        assertEquals(expected, actual);
    }
    }
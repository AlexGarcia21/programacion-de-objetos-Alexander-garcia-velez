package Test.Reto12.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *Aqui hice otra clase para que no se viera todo
 * amontonado en vocales y es para ver si la palabra empieza por vocal
 */
public class PalabraEmpiezaPorVocal {

    interface TextoSalida {
        void imprimir(String palabra);
    }

    static class ProcesadorTexto {
        public void palabrasEmpiezanEnVocal(String nombreArchivo, TextoSalida salida) {
            try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] palabras = linea.split("\\s+");
                    for (String palabra : palabras) {
                        if (palabra.matches("[aeiouAEIOU].*")) {
                            salida.imprimir(palabra);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
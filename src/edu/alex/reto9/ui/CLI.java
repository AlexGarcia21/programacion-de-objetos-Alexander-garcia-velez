package edu.alex.reto9.ui;

import edu.alex.reto9.process.Contadordepalabras;
import edu.alex.reto9.process.Lectordetexto;

import java.util.Scanner;

/**
 * programa para leer archivos txt.
 * Contador de palabras y palabra mas repetidas.
 *Elegi cuentos para que sea mas corto de leer.
 */
public class CLI {

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elige tu opción de idioma:");
            System.out.println("1. Español");
            System.out.println("2. Inglés");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                Traductor traductor = Traductor.getInstance("es");
                System.out.println(traductor.HOLA_Bienvenido);

                traductor = Traductor.getInstance("opcion1");
                System.out.println(traductor.HOLA_Bienvenido);
                System.out.println("1. El Principito");
                System.out.println("2. Caperucita Roja");
                System.out.println("3. El dinosaurio");
                System.out.println("4. El gato con botas ");
                System.out.println("5. Hansel y Gretel");
                System.out.println("0. Salir");

            } else if (opcion == 2) {
                Traductor traductor = Traductor.getInstance("eng");
                System.out.println(traductor.HOLA_Bienvenido);

                traductor = Traductor.getInstance("opcion2");
                System.out.println(traductor.HOLA_Bienvenido);

                traductor = Traductor.getInstance("the little prince");
                System.out.println(traductor.HOLA_Bienvenido);

                traductor = Traductor.getInstance("red riding hood");
                System.out.println(traductor.HOLA_Bienvenido);

                traductor = Traductor.getInstance("dinosaur");
                System.out.println(traductor.HOLA_Bienvenido);

                traductor = Traductor.getInstance("the puss in boots");
                System.out.println(traductor.HOLA_Bienvenido);

                traductor = Traductor.getInstance("hansel y gretel2.0");
                System.out.println(traductor.HOLA_Bienvenido);
            }


            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Lectordetexto.leerLibro("C:\\El Principito.txt");
                    scanner.nextLine();
                    Contadordepalabras.contarPalabras("C:\\El Principito.txt");
                    break;
                case 2:
                    Lectordetexto.leerLibro("C:\\caperucitaRoja.txt");
                    Contadordepalabras.contarPalabras("C:\\caperucitaRoja.txt");
                    break;
                case 3:
                    Lectordetexto.leerLibro("C:\\El dinosaurio.txt");
                    Contadordepalabras.contarPalabras("C:\\El dinosaurio.txt");
                    break;
                case 4:
                    Lectordetexto.leerLibro("C:\\El gato con botas.txt");
                    Contadordepalabras.contarPalabras("C:\\El gato con botas.txt");
                    break;
                case 5:
                    Lectordetexto.leerLibro("C:\\Hansel y gretel.txt");
                    Contadordepalabras.contarPalabras("C:\\Hansel y gretel.txt");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
/**
 * profe solo tengo una duda de por que al momneto de seleccionar el idioma español
 * y poner las variables para traducirlo me daba error,por eso solo los deje con sout.
 */
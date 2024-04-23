package edu.alex.reto9.ui;

import edu.alex.reto9.process.*;

import java.util.Scanner;

public class CLI_2 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        /**
         * Definimos las expresiones lambda para poder imprimir los textos
         */
        Printable printable1 = (text) -> {
            System.out.println(text);
        };

        /**
         * metodo para llamar la variable y asi con las demas.
         */
        printable1.print("Hola elige un idioma");


        Printable printable2 = (text) -> {
            System.out.println(text);
        };

        printable2.print("Hellow,chosee language option");


        int opcion;

        /**
         * El meto do-while debe estar dentro "run"
         * ya que si no es asio no procede con laos resultados
         */
        do {


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
                    Vocales.contarVocales("C:\\El Principito.txt");
                    PalabraMasLargaCorta.encontrarPalabraMasLargaYCorta("C:\\El Principito.txt");
                    CondicionPalabra.PalabrasCondicion("C:\\El Principito.txt");
                    break;
                case 2:
                    Lectordetexto.leerLibro("C:\\caperucitaRoja.txt");
                    Contadordepalabras.contarPalabras("C:\\caperucitaRoja.txt");
                    Vocales.contarVocales("C:\\caperucitaRoja.txt");
                    PalabraMasLargaCorta.encontrarPalabraMasLargaYCorta("C:\\caperucitaRoja.txt");
                    CondicionPalabra.PalabrasCondicion("C:\\caperucitaRoja.txt");
                    break;
                case 3:
                    Lectordetexto.leerLibro("C:\\El dinosaurio.txt");
                    Contadordepalabras.contarPalabras("C:\\El dinosaurio.txt");
                    Vocales.contarVocales("C:\\El dinosaurio.txt");
                    PalabraMasLargaCorta.encontrarPalabraMasLargaYCorta("C:\\El dinosaurio.txt");
                    CondicionPalabra.PalabrasCondicion("C:\\El dinosaurio.txt");
                    break;
                case 4:
                    Lectordetexto.leerLibro("C:\\El gato con botas.txt");
                    Contadordepalabras.contarPalabras("C:\\El gato con botas.txt");
                    Vocales.contarVocales("C:\\El gato con botas.txt");
                    PalabraMasLargaCorta.encontrarPalabraMasLargaYCorta("C:\\El gato con botas.txt");
                    CondicionPalabra.PalabrasCondicion("C:\\El gato con botas.txt");
                    break;
                case 5:
                    Lectordetexto.leerLibro("C:\\Hansel y gretel.txt");
                    Contadordepalabras.contarPalabras("C:\\Hansel y gretel.txt");
                    Vocales.contarVocales("C:\\Hansel y gretel.txt");
                    PalabraMasLargaCorta.encontrarPalabraMasLargaYCorta("C:\\Hansel y gretel.txt");
                    CondicionPalabra.PalabrasCondicion("C:\\Hansel y gretel.txt");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 0) ;
    }



    /**
     * aquí definimos la interfaz para poder imprimir los textos
     */
    interface Printable {
        void print(String text);
    }
}

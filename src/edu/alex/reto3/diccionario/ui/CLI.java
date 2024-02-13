package edu.alex.reto3.diccionario.ui;

import edu.alex.reto3.diccionario.process.Diccionario;

import java.util.Scanner;

public class CLI {
    private static String cantidadCaracteres;

    /**
     * primero el menu y mandamos a llamar las variables de
     * Diccionario
     * @param diccionario
     */
    public static void menuDiccionario(Diccionario diccionario){
    Scanner scanner=new Scanner(System.in);
    while (true){
        System.out.println("a.mostrar lista de palabras");
        System.out.println("b.buscar significado de palabras");
        System.out.println("c.Detalles del diccionario");

        String opcion = scanner.nextLine();
        switch (opcion){
            case "a":
                diccionario.printList();
                break;
            case "b":
                System.out.println("que palabra quiere saber");
                String palabra = scanner.nextLine();
                String significado = diccionario.buscarsignificado(palabra);
                System.out.printf("%s: %s\na", palabra, significado);
                break;
            case "c":
                System.out.println("cantidad de palabras:10");
                diccionario.cantidadCaracteres();
                diccionario.cantidaddecaracteressig();

        }

    }
}

}

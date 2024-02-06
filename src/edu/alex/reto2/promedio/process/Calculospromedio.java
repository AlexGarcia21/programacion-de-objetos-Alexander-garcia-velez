package edu.alex.reto2.promedio.process;

import java.util.Scanner;

public class Calculospromedio {
    /**
     * declaramos nuestras variables.
     */
    public static int sumaTotal = 0;
    public static int calculospromedio = 0;

    /**
     * Aqui vamos a utilizar un for para que el bucle siga
     * hasta que tenemos las calificaciones deseadas.
     */
    public static void mainCalculopromediofinal() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese las calificaciones que desa capturar");
            int numCalificasiones = scanner.nextInt();
            int sumaTotal = 0;
            for (int i = 1; i <= numCalificasiones; i++) {
                System.out.println("ingrese la calificacion obtenida por el trabajo" + i + ":");
                int grado = scanner.nextInt();
                sumaTotal += grado;
                int promedio = sumaTotal / numCalificasiones;
                System.out.printf("Su promedio es de: " + promedio);
        }
/**
 * Este trabajo lo pude realir viendo un tutorial en you tube
 * y realizando preguntas a chat gpt
 * https://youtu.be/AhwJqbIaGXw?si=bOqgJGAyK796EL6F
 *
 */
        }

    }
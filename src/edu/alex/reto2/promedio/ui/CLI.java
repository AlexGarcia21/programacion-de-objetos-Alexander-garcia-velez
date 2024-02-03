package edu.alex.reto2.promedio.ui;

import edu.alex.reto2.promedio.process.Calculospromedio;
/**
 * Este proyecto sirve para dar el promedio
 * final a un alumno de acuerdo a sus calificaciones.
 */
import java.util.Scanner;
public class CLI {
    public static class calificacionpromedio {
        public static void main(String[] args) {
            new Scanner(System.in);
            System.out.println("¡Bienvenido Estudiante!");
            Calculospromedio.mainCalculopromediofinal();
            /**
             * Aqui llamamos a la funcion para que el CLI no se
             * vea tan feo
             */
        }
    }
}
package edu.alex.reto3.numeros.process;

import java.util.Scanner;

public class Calculosnum {
    /**
     * se me fue y puse todo aqui
     * ya no le quise mover pero jala
     *
     * @param args
     */
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            int matriz[][], nFilas, nCol;

            System.out.println("Digite el número de filas:");
            nFilas = entrada.nextInt();
            System.out.println("Digite el número de columnas:");
            nCol = entrada.nextInt();

            matriz = new int[nFilas][nCol];

            System.out.println("Digite la matriz:");
            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < nCol; j++) {
                    System.out.println("matriz[" + i + "][" + j + "]:");
                    matriz[i][j] = 1 + (int)(Math.random() * 100); // generar un número aleatorio entre 1 y 100

                }
            }

            System.out.println("\nLa matriz es:");
            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < nCol; j++) {
                    System.out.print(matriz[i][j]);
                    if (j < nCol - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }


    }

/**
 * aqui van todos los tutoriales que me vi para hacer esto
 * y use ias para poder acabarlo
 *  https://youtu.be/8NkHXYVpciI?si=mGFDHfIOP7ea8ruz
 *  https://youtu.be/X8YFTykkGaQ?si=sxhMflocKTU1JkaN
 *  https://youtu.be/xVYZGMSeqrk?si=5_EObEqeth4ZmCfp
 * https://youtu.be/k24J92Hod50?si=00UeqAM4w_UvKVI
 */
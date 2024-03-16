package edu.alex.reto7.ui;

import edu.alex.reto7.process.*;

import java.util.Scanner;

/**
 * Programa para realizar procedimientos logicos a base de sumas y restas
 */


public class CLI {
    public static void showMenu(){
        System.out.println("------Seleccione la oeracion que desa realizar------");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Potencia");
        System.out.println("6.Modulo");
        System.out.println("7.Raiz");
        System.out.println("8.Logaritmo");

/**
 * Utilizo switch para que el usuario eliga la opcion y llamo las funciones
 */
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.next().charAt(0);

        switch (opcion){
            case '1':
                System.out.println("---Suma---");
                System.out.println("ingrese el primer valor");
                int valor1 = scanner.nextInt();
                System.out.println("ingrese el segundo valor");
                int valor2 = scanner.nextInt();
                Suma suma = new Suma();
                int resultado = suma.calcular(valor1, valor2);

                System.out.println("el resultado es: "+ resultado);


            case '2':
                System.out.println("---Resta---");
                System.out.println("ingrese el primer valor");
                valor1 = scanner.nextInt();
                System.out.println("ingrese el segundo valor");
                valor2 = scanner.nextInt();
                Resta resta = new Resta();
                resultado = resta.calcular(valor1, valor2);

                System.out.println("el resultado es: "+ resultado);

            case '3':
                System.out.println("---Multiplicar---");
                System.out.println("ingrese el primer valor");
                valor1 = scanner.nextInt();
                System.out.println("ingrese el segundo valor");
                valor2 = scanner.nextInt();
               Multiplicacion multiplicacion = new Multiplicacion();
                resultado = multiplicacion.calcular(valor1, valor2);

                System.out.println("el resultado es: "+ resultado);

            case '4':
                System.out.println("---Dividir---");
                System.out.println("ingrese el dividendo");
                valor1 = scanner.nextInt();
                System.out.println("ingrese el divisor");
                valor2 = scanner.nextInt();
                Division division = new Division();
                resultado = division.calcular(valor1, valor2);

                System.out.println("el resultado es: "+ resultado);

            case '5':
                System.out.println("---Potencia---");
                System.out.println("ingrese el numero base");
                valor1 = scanner.nextInt();
                System.out.println("ingrese la potencia");
                valor2 = scanner.nextInt();
                Potencia potencia = new Potencia();
                resultado = potencia.calcular(valor1, valor2);

                System.out.println("el resultado es: "+ resultado);


            case '6':
                System.out.println("---Modulo---");
                System.out.println("ingrese valor 1");
                valor1 = scanner.nextInt();
                System.out.println("ingrese valor 2");
                valor2 = scanner.nextInt();
                Modulo modulo= new Modulo();
                resultado = modulo.calcular(valor1, valor2);
                System.out.println("el resultado es: "+ resultado);



            case '7':
                System.out.println("---Raiz---");
                System.out.println("ingrese el primer valor");
                valor1 = scanner.nextInt();
                System.out.println("ingrese el primer valor");
                valor2 = 0;//aqui lo puse como cero por que es la raiz el segundo valor no se necesita pero al borrarlo me da error de todos modos
                //por eso lo declare en 0
                Raiz raiz = new Raiz();
                resultado = raiz.calcular(valor1,valor2);

                System.out.println("el resultado es: "+ resultado);
            case '8':
                System.out.println("---Logaritmo---");
                System.out.println("ingrese el primer valor");
                valor1 = scanner.nextInt();
                valor2 = scanner.nextInt();
                Logaritmo logaritmo = new Logaritmo();
                resultado = logaritmo.calcular( valor1,valor2);

                System.out.println("el resultado es: "+ resultado);

            case '9':


        }

    }
}

package edu.alex.reto1.ui;

import edu.alex.reto1.process.Calculadoramc;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CLI {
    public static void showmenu() {
/**
 *utilizamos Scanner scanner =new Scanner(System.in); para la lecutra de datos
 *por entrada estandar(solo lee los datos del teclado)
 */
        Scanner scanner =new Scanner(System.in);
double peso,altura;
String sexo,edad;

        while (true) {

            menu();
            char opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'A':
                    System.out.println("Usted eligió calcular su IMC");
                    System.out.println("Ingrese su peso");
                    peso = scanner.nextDouble();

                    System.out.println("Ingrese su estatura");
                     altura = scanner.nextDouble();

                    double imc = Calculadoramc.calcularIndiceMasaCorporal(altura, peso);
                    System.out.println("Su IMC es: " + imc);
                    System.out.println("Interpretación: " + Calculadoramc.condicionIMC(imc));
                    break;
                case 'B':
                    System.out.println("Usted eligió calcular su masa corporal magra");
                    System.out.println("Ingrese su peso");
                    peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingrese su estatura");
                    altura = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("ingrese su sexo");
                    sexo = scanner.nextLine();

                    double mcm = Calculadoramc.calculadoramasacorporalmagra(altura, peso, sexo);
                    System.out.println("su masa corporal magra es:" + mcm);
                    break;
                case 'C':
                    System.out.println("Usted eligió calcular su meteabolismo basal");
                    System.out.println("Ingrese su peso");
                    peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingrese su estatura");
                    altura = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("ingrese su sexo");
                    sexo = scanner.nextLine();
                    System.out.println("ingrese su edad");
                    edad = scanner.nextLine();

                    double mcmb = Calculadoramc.calculadoramasacorporalmagra(altura, peso, sexo);
                    System.out.println("su masa corporal magra es:" + mcmb);
                    break;
                case 'D':
                    System.out.println("Saliendo");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
    public static void menu() {

        System.out.println("Bienvenido");
        System.out.println("A. Calculo de masa corporal");
        System.out.println("B. Calculo de masa corporal magra");
        System.out.println("C. Calculo de metabolismo basal");
        System.out.println("D. PRESIONE D PARA SALIR");

        System.out.println("Por favor elija su opcion");
    }
}

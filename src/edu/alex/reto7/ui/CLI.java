package edu.alex.reto7.ui;

import edu.alex.reto7.process.*;

import java.util.Scanner;

/**
 * Programa para realizar procedimientos logicos a base de sumas y restas
 */


public class CLI {

    public static void showMenu(){


        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("elige tu opcion de idioma");
        System.out.println("1.Español");
        System.out.println("2.Ingles");
        opcion =scanner.nextInt();
        if (opcion ==1)
        {
            Textos español = new Español();
            System.out.println(español.MENU);
            System.out.println(español.TEXTO_1);
            System.out.println(español.TEXTO2);
            System.out.println(español.TEXTO3);
            System.out.println(español.TEXTO4);
            System.out.println(español.TEXTO5);
            System.out.println(español.TEXTO6);
            System.out.println(español.TEXTO7);
            System.out.println(español.TEXTO8);
        }
        else if(opcion==2){
            Textos ingles = new Ingles();
            System.out.println(ingles.MENU);
            System.out.println(ingles.TEXTO_1);
            System.out.println(ingles.TEXTO2);
            System.out.println(ingles.TEXTO3);
            System.out.println(ingles.TEXTO4);
            System.out.println(ingles.TEXTO5);
            System.out.println(ingles.TEXTO6);
            System.out.println(ingles.TEXTO7);
            System.out.println(ingles.TEXTO8);
        }

        else{
            System.out.println("ERROR");
        }


/**
 * Utilizo switch para que el usuario eliga la opcion y llamo las funciones
 * Tambien se manda a llamar la funcion de "Texto" para que al momento de elejir
 * el idioma las demas lineas de texto se puedan traducir.
 */
         scanner = new Scanner(System.in);

         opcion = scanner.next().charAt(0);

        Operacion op = null;
        switch (opcion){

            case '1':
                System.out.println(Textos.TEXTO_1);
                System.out.println(Textos.VALOR1);
                int valor1 = scanner.nextInt();
                System.out.println(Textos.VALOR2);
                int valor2 = scanner.nextInt();
                op = new Suma();

                System.out.println("el resultado es "+op.getClass()+ "es: "+op.calcular(valor1,valor2));

                break;



            case '2':
                System.out.println(Textos.TEXTO2);
                System.out.println(Textos.VALOR1);
                valor1 = scanner.nextInt();
                System.out.println(Textos.VALOR2);
                valor2 = scanner.nextInt();
                Resta resta = new Resta();
                op = new Resta();

                System.out.println("el resultado es "+op.getClass()+ "es: "+op.calcular(valor1,valor2));

                break;

            case '3':
                System.out.println(Textos.TEXTO3);
                System.out.println(Textos.VALOR1);
                valor1 = scanner.nextInt();
                System.out.println(Textos.VALOR2);
                valor2 = scanner.nextInt();
                op = new Multiplicacion();

                System.out.println("el resultado es "+op.getClass()+ "es: "+op.calcular(valor1,valor2));

                break;

            case '4':
                System.out.println(Textos.TEXTO4);
                System.out.println(Textos.DIVIDENDO);
                valor1 = scanner.nextInt();
                System.out.println(Textos.DIVISOR);
                valor2 = scanner.nextInt();
                Division division = new Division();
                op = new Division();

                System.out.println("el resultado es "+op.getClass()+ "es: "+op.calcular(valor1,valor2));

                break;

            case '5':
                System.out.println(Textos.TEXTO5);
                System.out.println(Textos.NUMEROBASE);
                valor1 = scanner.nextInt();
                System.out.println(Textos.POTENCIA);
                valor2 = scanner.nextInt();
                Potencia potencia = new Potencia();
                op = new Potencia();

                System.out.println("el resultado es "+op.getClass()+ "es: "+op.calcular(valor1,valor2));


                break;


            case '6':
                System.out.println(Textos.TEXTO6);
                System.out.println(Textos.VALOR1);
                valor1 = scanner.nextInt();
                System.out.println(Textos.VALOR2);
                valor2 = scanner.nextInt();
                Modulo modulo= new Modulo();
                op = new Modulo();

                System.out.println("el resultado es "+op.getClass()+ "es: "+op.calcular(valor1,valor2));

                break;



            case '7':
                System.out.println(Textos.TEXTO7);
                System.out.println(Textos.VALOR1);
                valor1 = scanner.nextInt();
                System.out.println(Textos.VALOR2);
                valor2 = scanner.nextInt();
                Raizcorregida raizcorregida = new Raizcorregida();
                op = new Raizcorregida();

                System.out.println("el resultado es "+op.getClass()+ "es: "+op.calcular(valor1,valor2));


                break;
            case '8':
                System.out.println(Textos.TEXTO8);
                System.out.println(Textos.VALOR1);
                valor1 = scanner.nextInt();
                System.out.println(Textos.VALOR2);
                valor2 = scanner.nextInt();
                Logaritmo logaritmo = new Logaritmo();
                op = new Logaritmo();

                System.out.println("el resultado es "+op.getClass()+ "es: "+op.calcular(valor1,valor2));


                break;

            case '9':
            default:
                String error = "Error";


        }


    }
    public static void printlnResult(Operacion op , int valor1, int valor2){
        System.out.println("el resultado es "+op.getClass()+ "es: "+op.calcular(valor1,valor2));
    }
}
/**
 * En el getclass ya no supe que procedia por que si me da el resultado
 * pero tambien me da el nombre de mi clase jaja
 */
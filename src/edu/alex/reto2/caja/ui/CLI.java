package edu.alex.reto2.caja.ui;

import edu.alex.reto2.caja.process.Calculoscaja;

import java.util.Scanner;

import static edu.alex.reto2.caja.process.Calculoscaja.*;

/**
 * este es el reto 2,donde elaborampos un programa para la venta y compra de cajas.
 * primero empezamos con el menu,despues abrimos un while para realizar un bucle.
 */
public class CLI {
    public static void menuCajas(){
        Scanner scanner =new Scanner(System.in);
        double numerodecajasacomprar,numerodecajasavender,costodelascajasavender,costodelascajasacomprar;

        System.out.println("Bienvenido,escoga la opcion que desa probar");
        System.out.println("A.comprar cajas de papel");
        System.out.println("B.Vender cajas de papel");
        System.out.println("C.mostar reporte");
        System.out.println("D.salir");


        while(true) {
            char opcion = scanner.next().charAt(0);
            /**
             * ponemos char para poder declarar las opciones.
             * switch para poder elegir las opciones.
             */
            switch (opcion){
                case 'A':
                    System.out.println("Comprar cajas de papel");
                    System.out.println("Número de cajas a comprar: ");
                    numerodecajasacomprar = scanner.nextInt();
                    System.out.println("Costo de las cajas a comprar: ");
                    costodelascajasacomprar = scanner.nextInt();
                    double comprarCajas = Calculoscaja.comprarCajas(numerodecajasacomprar,costodelascajasacomprar);
                    break;

                case 'B':
                    System.out.println("Vender cajas de papel");
                    System.out.println("Número de cajas a vender: ");
                    numerodecajasavender = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.println("Costo de las cajas a vender: ");
                    costodelascajasavender = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    double venderCajas = Calculoscaja.venderCajas(numerodecajasavender,costodelascajasavender);
                    break;
/**
 * En esta opcion solo le mostramos un pequeño
 * resumen de las operaciones que ah realizado.
 */
                case 'C':
                  Calculoscaja.mostrarResumen();
                    break;
/**
 * Al momento de que el usuario quiera salir se la va a mostrar
 * este resumen,que se basa en las variables obtenidas y le muestra el total
 * de sus operaciones realizadas.
 */
                case 'D':
                    System.out.println("salir");
                    System.out.println("La cantidad total de operaciones realizadas: ");
                    System.out.println("La cantidad total de ventas: " + cantidadVentasCaja);
                    System.out.println("La cantidad total de compras: " + cantidadComprasCaja);
                    System.out.println("monto en la caja:  " + montoencaja);
                    System.out.println("Los ingresos generados por ventas: " + ventascajas);
                    System.out.println("Los egresos generados por compras: " + comprasCajas);
                    System.out.println("que estes bien,vuelve pronto");

                            break;



                default:
                    System.out.println("saliendo");
                    break;
            }
/**
 * En este codigo hubo mucha falla y errores al momento de
 * elaborarlo tambien tome como base lo echo en el reto 1
 * y ,gracias a mis compañerpos pude realizarlo.
 */
        }
    }
}
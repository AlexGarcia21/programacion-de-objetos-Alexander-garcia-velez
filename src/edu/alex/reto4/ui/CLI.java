package edu.alex.reto4.ui;
/**
 * elaboracion de un menu para mostrar boletos vendidos
 * y guardar la info.
 * para su elaboracion usamos arraylist,for,switch.
 */

import edu.alex.reto4.Data.Persona;
import edu.alex.reto4.Data.Ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    public static void showMenu() {
        ArrayList<Ticket> listaVentas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        char opcion;
        do {
            opcion = Menu.mostrarMenu();
            switch (opcion) {
                case 'A':
                    Ticket ticket = registrarVenta(scanner);
                    listaVentas.add(ticket);
                    break;
                case 'B':
                    mostrarDatosVentas(listaVentas);
                    break;
                case 'S':
                    System.out.println("Fin del programa");
                    break; // Se agregó un break para salir del switch
                default:
                    System.out.println("Opción no válida");
                    break; // Se agregó un break para salir del switch
            }
        } while (opcion != 'S');
        scanner.close();
    }

    public static Ticket registrarVenta(Scanner scanner) {
        System.out.println("Nombre completo del comprador");
        String nombreComprador = scanner.nextLine();

        System.out.println("Ingrese cantidad de boletos");
        int cantidadBoletos = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Persona> pasajeros = new ArrayList<>();

        for (int i = 0; i < cantidadBoletos; i++) {
            System.out.println("Nombre completo del pasajero " + (i + 1) + ":");
            String nombrePasajero = scanner.nextLine();
            pasajeros.add(new Persona(nombrePasajero));
        }

        Ticket ticket = new Ticket(1250.50, cantidadBoletos, pasajeros);
        System.out.println("Venta realizada, importe total: " + ticket.ImporteTotal());
        return ticket;
    }

    public static void mostrarDatosVentas(ArrayList<Ticket> listaVentas) {
        System.out.println("Lista de ventas");
        int pasajerosTotales = 0;
        double importeTotal = 0.0;

        for (int i = 0; i < listaVentas.size(); i++) {
            Ticket ticket = listaVentas.get(i);
            System.out.println("Venta " + (i + 1) + ":");
            System.out.println("  Cantidad de pasajeros: " + ticket.getPasajeros());
            System.out.println("  Importe total: $" + ticket.ImporteTotal());

            pasajerosTotales += ticket.getPasajeros();
            importeTotal += ticket.ImporteTotal();
        }

        System.out.println("Total de pasajeros vendidos: " + pasajerosTotales);
        System.out.println("Importe total de ventas: $" + importeTotal);
    }
}

class Menu {
    public static char mostrarMenu() {
        System.out.println("------MENU------");
        System.out.println("A. Realizar venta de boleto");
        System.out.println("B. Mostrar datos de la lista de ventas");
        System.out.println("S. Finalizar programa");

        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}
/**con ayuda de mi compañero juan francisco,ias y
 * tutoriales vistos:https://youtu.be/3asmLRCsASs?si=MTA9EfEcsk94CpiQ
        * https://youtu.be/D0VH50zFVIA?si=v2AUNRNTtoEeAph9
        *
        *se logro su elaboracion.
        * jaja en si ahora ya esta al 100 creo.


 /**este ya fue entregado fuera de la fecha establecida
 ya que me di cuenta que los otros estaban mal.
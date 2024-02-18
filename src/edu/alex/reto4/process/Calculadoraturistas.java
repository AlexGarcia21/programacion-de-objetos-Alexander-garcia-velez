package edu.alex.reto4.process;

import edu.alex.reto4.Data.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static edu.alex.reto4.Data.Persona.pasajeros;

/**
 * en este coidgo se utilizo el array  para poder
 * ingresar varios pasajero.

 */

public class Calculadoraturistas {

    private static Ticket.TicketManager ticketManager;

    public static class Boleto {

        public static class Venta {
            private final String comprador;
            private final int cantidadBoletos;
            private final double importeTotal;
            private final List<Persona.Pasajero> pasajeros;

            public Venta(String comprador, int cantidadBoletos) {
                this.comprador = comprador;
                this.pasajeros = new ArrayList<>();
                this.cantidadBoletos = cantidadBoletos;
                this.importeTotal = 1250.50 * cantidadBoletos;
            }

            public void agregarPasajero(Persona.Pasajero pasajero) {
                this.pasajeros.add(pasajero);
            }

            public String getComprador() {
                return comprador;
            }

            public int getCantidadBoletos() {
                return cantidadBoletos;
            }

            public double getImporteTotal() {
                return importeTotal;
            }

            public List<Persona.Pasajero> getPasajeros() {
                return pasajeros;
            }
        }

        public static void realizarVenta(Scanner scanner, List<Venta> ventas) {
            System.out.print("Ingrese el nombre del comprador: ");
            String comprador = scanner.nextLine();

            System.out.print("Ingrese la cantidad de boletos: ");
            int cantidadBoletos = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            Venta venta = new Venta(comprador, cantidadBoletos);

            for (int i = 0; i < cantidadBoletos; i++) {
                System.out.print("Ingrese el nombre del pasajero " + (i + 1) + ": ");
                String nombrePasajero = scanner.nextLine();
                Persona.Pasajero pasajero = new Persona.Pasajero(nombrePasajero);
                venta.agregarPasajero(pasajero);
            }

            ventas.add(venta);
        }

        public static class Persona {

            public static class Pasajero {
                private final String nombre;

                public Pasajero(String nombre) {
                    this.nombre = nombre;
                }

                public String getNombre() {
                    return nombre;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Boleto.Venta> ventas = new ArrayList<>();

        while (true) {
            System.out.println("1. Realizar venta");
            System.out.println("2. Mostrar datos de la lista de ventas");
            System.out.println("3. Salir");
            System.out.print("Ingrese una optician: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Boleto.realizarVenta(scanner, ventas);
                    ticketManager.venderBoleto(comprador,pasajeros);
                    break;
                case 2:
                    System.out.println("datos de compra");
                    System.out.println("-----Datos de su compra-----");
                    ArrayList<Ticket> ticketList = ticketManager.getTicketList();

                case 3:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

}
/**
 * al final de cueentas este codigos se elaboro con pura prueba y error del codigo.
 * con ayuda de mi compañero juan francisco,ias y
 * tutoriales vistos:https://youtu.be/3asmLRCsASs?si=MTA9EfEcsk94CpiQ
 * https://youtu.be/D0VH50zFVIA?si=v2AUNRNTtoEeAph9
 *
 *se logro su elaboracion.
 */
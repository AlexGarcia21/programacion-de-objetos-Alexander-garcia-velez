package edu.alex.reto4.Data;

import edu.alex.reto4.process.Calculadoraturistas;
import java.util.ArrayList;

public class Ticket {

        /** El nombre del comprador del boleto. */
        private final String nombreComprador;

        /** La cantidad de boletos comprados. */
        private int cantidadBoletos;

        /** La lista de pasajeros asociados con este boleto. */
        private ArrayList<Pasajero> passengers;

        /**
         * Crea un nuevo onjeto Ticket con el nombre del comprador y la cantidad de boletos proporcionados.
         * @param nombreComprador El nombre del comprador del boleto.
         * @param cantidadDeTickets La cantidad de boletos comprados.
         */
        public Ticket(String nombreComprador, int cantidadDeTickets){
            this.nombreComprador = nombreComprador;
            this.cantidadBoletos = cantidadDeTickets;
            this.passengers = new ArrayList<>();
        }
    public class TicketManager {

            private final double precioTicket = 1250.50;

        private ArrayList<Ticket> ticketList;

        /**
         * Crea un nuevo gestor de boletos.
         */
        public TicketManager(){
            this.ticketList = new ArrayList<>();
        }

        /**
         * Vende un boleto con el nombre del comprador, la cantidad de boletos y la lista de pasajeros proporcionados.
         * @param nombreComprador El nombre del comprador del boleto.
         * @param cantidadBoletos La cantidad de boletos comprados.
         * @param passengers La lista de pasajeros asociados con el boleto.
         */
        public void venderBoleto(String nombreComprador, int cantidadBoletos, ArrayList<Pasajero> passengers){
            Ticket ticket = new Ticket(nombreComprador, cantidadBoletos);
            for (Pasajero passenger : passengers) {
           public void venderBoleto(String nombreComprador, int cantidadBoletos, ArrayList<ticketList.add(ticket);
            }
}
    }

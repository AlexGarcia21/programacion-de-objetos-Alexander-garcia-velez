package edu.alex.reto4.Data;

import edu.alex.reto4.process.Calculadoraturistas;
import java.util.ArrayList;

public class Ticket {
        private final String nombreComprador;


        private int cantidadBoletos;


        private ArrayList<Pasajero> passengers;


        public Ticket(String nombreComprador, int cantidadDeTickets){
            this.nombreComprador = nombreComprador;
            this.cantidadBoletos = cantidadDeTickets;
            this.passengers = new ArrayList<>();
        }
    public class TicketManager {

            private final double precioTicket = 1250.50;

        private ArrayList<Ticket> ticketList;


        public TicketManager(){
            this.ticketList = new ArrayList<>();
        }

        public void venderBoleto(String nombreComprador, int cantidadBoletos, ArrayList<Pasajero> passengers){
            Ticket ticket = new Ticket(nombreComprador, cantidadBoletos);
            for (Pasajero passenger : passengers) {
           public void venderBoleto(String nombreComprador, int cantidadBoletos, ArrayList<ticketList.add(ticket);
            }
}
    }

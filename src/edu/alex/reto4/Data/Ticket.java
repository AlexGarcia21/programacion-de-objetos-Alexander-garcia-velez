package edu.alex.reto4.Data;

import java.util.ArrayList;

public class Ticket {
    private final String nombreComprador;


    private int cantidadBoletos;


    private ArrayList<Persona.Pasajero> passengers;


    public Ticket(String nombreComprador, int cantidadDeTickets) {
        this.nombreComprador = nombreComprador;
        this.cantidadBoletos = cantidadDeTickets;
        this.passengers = new ArrayList<>();
    }
}

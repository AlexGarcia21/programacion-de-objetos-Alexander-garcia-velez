package edu.alex.reto4.Data;

import java.util.ArrayList;

/**
 * Aqui se almacenan los datos de cuantos pasajeros son.
 */
public class Ticket {
    private double Costo;
    private int pasajeros;

    private ArrayList<Persona> pasajerosAdicionales;

    public Ticket(double costo, int pasajeros, ArrayList<Persona> personas){
       this.Costo = Costo;
       this.pasajeros = pasajeros;
        ArrayList<Object> PasajerosAdicionales = new ArrayList<>();

    }
    public double ImporteTotal(){
return Costo * pasajeros;
    }
    public int getPasajeros(){
        return pasajeros;
    }
}

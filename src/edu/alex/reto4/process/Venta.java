package edu.alex.reto4.process;

import edu.alex.reto4.Data.Persona;

import java.util.ArrayList;
import java.util.List;

public  class Venta {
    public static Object ventaBoletos;
    private String comprador;
    private int cantidadBoletos;
    private double importeTotal;
    private List<Persona.Pasajero> pasajeros;

    public void ventaBoletos() {
        this.comprador = comprador;
        this.cantidadBoletos = cantidadBoletos;
        this.pasajeros = new ArrayList<>();
        this.importeTotal = 1250.50 * cantidadBoletos;
        System.out.println("Su importe total es de: " + importeTotal);
    }

    public void agregarPasajero() {
        Persona.Pasajero pasajero = new Persona.Pasajero();
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
}
package edu.alex.reto4.process;

import edu.alex.reto4.Data.Persona;

import java.util.ArrayList;
import java.util.List;

public  class Venta {
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
}
package edu.alex.reto4.Data;

import jdk.internal.icu.text.UnicodeSet;

import java.util.List;

public class Persona {
    private static UnicodeSet pasajeros;

    public static class Pasajero {
        private String nombre;

    public Pasajero(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }
    public static void agregarPasajero(Pasajero pasajero) {
        pasajeros.add((CharSequence) pasajero);
    }

    public String getComprador() {
        String comprador = null;
        return comprador;
    }

    public List<Pasajero> getPasajeros() {
        return (List<Pasajero>) pasajeros;
    }


}


package edu.alex.reto4.Data;

import java.util.ArrayList;
import java.util.List;

public class Boleto {
    public class Boleto1{
        private int cantidad;

        public Boleto1() {
            this.cantidad = 0;
        }

        public int getCantidad() {
            return cantidad;
        }

        // Otros métodos y constructores
    }

    public static class Venta {
        private String comprador;
        private List<Pasajero> pasajeros;
        private int cantidadBoletos;
        private double importeTotal;

        public Venta(String comprador, int cantidadBoletos) {
            this.comprador = comprador;
            this.pasajeros = new ArrayList<>();
            this.cantidadBoletos = cantidadBoletos;
            this.importeTotal = 1250.50 * cantidadBoletos;


        }

        public Venta(Object cantidadBoletos) {
        }

        public int getCantidadBoletos() {
            return cantidadBoletos;
        }

        public double getImporteTotal() {
            return importeTotal;
        }
    }

}

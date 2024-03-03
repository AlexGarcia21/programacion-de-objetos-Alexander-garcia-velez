package edu.alex.reto5.reto5_5.doc;

public class Precios {
    public class Articulo {
        private String nombre;
        private int cantidad;
        private double precioUnitario;
        private double iva;

        public Articulo(String nombre, int cantidad, double precioUnitario, double iva) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
            this.iva = iva;
        }

        public double calcularImporteNeto() {
            return cantidad * precioUnitario * (1 + iva);
        }
    }

}

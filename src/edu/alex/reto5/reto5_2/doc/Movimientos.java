package edu.alex.reto5.reto5_2.doc;

import java.util.ArrayList;
import java.util.Date;

public class Movimientos {
    private Date fecha;
    private String descripcion;
    private double monto;

    private ArrayList<Movimientos> movimientos;


    public Movimientos(Date fecha, String descripcion, double monto) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
        movimientos = new ArrayList<>();

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movimientos movimiento : movimientos) {
            sb.append(movimiento.toString()).append("\n");
        }
        return sb.toString();
    }

    public static class Movimiento {
        private Date fecha;
        private String descripcion;
        private double monto;

        public Movimiento(Date fecha, String descripcion, double monto) {
            this.fecha = fecha;
            this.descripcion = descripcion;
            this.monto = monto;
        }

        @Override
        public String toString() {
            return "Fecha: " + fecha + ", Descripción: " + descripcion + ", Monto: $" + monto;
        }

    }
}
package edu.alex.reto5.reto5_2.doc;

import java.util.Date;

public class Movimientos {
    private Date fecha;
    private String descripcion;
    private double monto;

    public void Movimiento(Date fecha, String descripcion, double monto) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public String toString() {
        return "Fecha: " + fecha + ", Descripción: " + descripcion + ", Monto: $" + monto;
    }
    ArrayList<Movimiento> movimientos = new ArrayList<>();

    // Simulación de movimientos en el banco
        movimientos.add(new Movimiento(new Date(), "Depósito", 1000.0));
        movimientos.add(new Movimiento(new Date(), "Retiro", -500.0));
        movimientos.add(new Movimiento(new Date(), "Transferencia recibida", 300.0));
}

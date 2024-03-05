package edu.alex.reto5.reto5_5.doc;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Precios.Articulo> articulos;

    public void CarritoDeCompras() {
        this.articulos = new ArrayList<>();
    }

    public void agregarArticulo(Precios.Articulo articulo) {
        articulos.add(articulo);
    }

    public double calcularTotal() {
        double total = 0;
        for (Precios.Articulo articulo : articulos) {
            total += articulo.calcularImporteNeto();
        }
        return total;
    }
    }

package edu.alex.reto5.reto5_3.doc;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * utilizamos el big decimal para tener una precisión exacta en cálculos que involucran números decimales.
 */

public class Calculototal {
    private HashMap<Object, Object> listaDeCompras;

    public BigDecimal calcularTotalCompra() {
        BigDecimal total = BigDecimal.ZERO;
        for (Object precio : listaDeCompras.values()) {
            total = total.add(BigDecimal.valueOf((Double) precio));
        }
        return total;
    }
    }


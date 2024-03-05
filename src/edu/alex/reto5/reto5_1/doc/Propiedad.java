package edu.alex.reto5.reto5_1.doc;

import java.util.Scanner;

public class Propiedad {
    public void cordenadas{
        System.out.println("cordenadas son las siguientes");
        Scanner scanner;
        String cordenadas = scanner.nextLine();

    }
    public class rentaOventa{
        String estado = "venta";

        if (estado.equals("venta")) {
            System.out.println("La casa está en venta");
        } else if (estado.equals("renta")) {
            System.out.println("La casa está en renta");
        } else {
            System.out.println("El estado de la casa es diferente a venta o renta");
        }
    }
}

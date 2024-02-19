package edu.alex.reto4.ui;


import edu.alex.reto4.Data.Persona;
import edu.alex.reto4.process.Venta;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {

    public static void showMenu() {
        System.out.println("------MENU------");
        System.out.println("A.Realizar venta de boleto");
        System.out.println("B.Mostrar datos de lista de venta");
        System.out.println("S.Salir del programa");

        while (true){
            Scanner scanner =new Scanner(System.in);
            char opcion = scanner.next().charAt(0);
            switch (opcion){
                case 'A':
                    System.out.println("Nombre completo del comprador");
                    String comprador = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Cantidad de boletos a comprar");
                    int boletos = scanner.nextInt();
                    ArrayList<pasajero> pasajero = new ArrayList<pasajero>();
                    scanner.nextLine();
                    for (int i = 1; i<boletos; i++){
                        System.out.println("ingrese pasajeros " + i + ": ");
                        scanner.nextLine();
                        Venta venta = new Venta();
                        new Persona.Pasajero();
                        venta.ventaBoletos();
                        new Persona.Pasajero();
                    }

            }

        }


    }

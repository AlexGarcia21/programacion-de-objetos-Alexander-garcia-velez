package edu.alex.reto5.reto5_2.doc;

import java.util.Scanner;

public class CuentaBanco {

    public static class CuentaBancaria {

        private double saldo;

        public CuentaBancaria(double saldoInicial) {
            this.saldo = saldoInicial;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void verSaldo() {
            System.out.println("El saldo actual de la cuenta es: $" + saldo);
        }

    }

    public void cliente() {

        System.out.println("Bienvenido *****");
        System.out.println("Su saldo es de *****");

        System.out.println("Elija una opción: A, B o C");

        Scanner scanner = new Scanner(System.in);
        char opcion = scanner.next().charAt(0);

        CuentaBancaria cuenta = new CuentaBancaria(1000.0);

        switch (opcion) {
            case 'A':
                System.out.println("Depósito");
                break;
            case 'B':
                System.out.println("Retirar");
                break;
            case 'C':
                System.out.println("Mostrar saldo");
                cuenta.verSaldo();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

}
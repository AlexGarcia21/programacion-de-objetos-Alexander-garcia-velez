package edu.alex.reto2.caja;

import edu.alex.reto2.caja.ui.CLI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        new CLI();
        new Scanner(System.in);
        CLI.menuCajas();
    }
}
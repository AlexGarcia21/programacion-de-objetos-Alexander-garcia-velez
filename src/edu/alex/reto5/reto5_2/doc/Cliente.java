package edu.alex.reto5.reto5_2.doc;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private int edad;
    private ArrayList<String> cuentasBancarias;

    public Cliente() {
        this.nombre = "";
        this.edad = 0;
        this.cuentasBancarias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<String> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void agregarCuenta(String cuenta) {
        cuentasBancarias.add(cuenta);
    }

    public void eliminarCuenta(String cuenta) {
        cuentasBancarias.remove(cuenta);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setEdad(edad);

        ArrayList<String> cuentas = cliente.getCuentasBancarias();
        cuentas.add("agregar cuenta");
        cuentas.add("eliminar cuenta");

        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            for (int i = 0; i < cuentas.size(); i++) {
                System.out.println((i + 1) + ". " + cuentas.get(i));
            }
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese el nombre de la cuenta a agregar");
                    String cuentaAgregar = scanner.next();
                    cliente.agregarCuenta(cuentaAgregar);
                    break;
                case 2:
                    System.out.println("ingrese el nombre de la cuenta a eliminar");
                    String cuentaEliminar = scanner.next();
                    cliente.eliminarCuenta(cuentaEliminar);
                    break;
                default:
                    System.out.println("opción no válida");
            }
        } while (opcion != 0);
    }
}
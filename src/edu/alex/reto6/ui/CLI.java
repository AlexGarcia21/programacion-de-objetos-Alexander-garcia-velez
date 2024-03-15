package edu.alex.reto6.ui;

import edu.alex.reto6.process.CalculadoraPagos;
import edu.alex.reto6.process.Categorias;
import edu.alex.reto6.process.Empleados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class CLI {
    public static void showMenu() {
        List<Empleados> empleados = capturarEmpleados();
        reporteNomina(empleados);
    }

    /**
     * aqui iniciamos el programa para calcular el salario de un empleado junto
     * con sus horas extras.
     * @return
     */

    private static List<Empleados> capturarEmpleados() {//para capturar empleados
        List<Empleados> empleados = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre completo del empleado: ");
        String nombreCompleto = scanner.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese las horas extras: ");
        int horasExtras = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el número telefónico: ");
        double telefono = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
        String fechaDeNacimiento = scanner.nextLine();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = formatoFecha.parse(fechaDeNacimiento);
        } catch (ParseException e) {
            System.out.println("Error: La fecha ingresada no tiene el formato correcto.");
            e.printStackTrace();
        }
/**
 * al momento de ingresar la fecha debe ser correcta para quel programa continue
 * igual que el numero telefonico ya que si no marcara error.
 */

        scanner.nextLine();
/**
 * en base a la categoria que es el empleado se le asignara el proceso de la calculadora
 */
        while (true) {
            char opcion = scanner.next().charAt(0);
            System.out.println("Eliga la categoría en la que está: A-Empleado de ventas, B-Administrador, C-Gerente, E-Salir");
            Categorias categoria = null;
            switch (opcion) {
                case 'A':
                    categoria = new Categorias("Empleado de ventas", "EV", 100, 50);
                    break;

                case 'B':
                    categoria = new Categorias("Administrador", "ADMI", 180, 100);
                    break;

                case 'C':
                    categoria = new Categorias("Gerente", "GER", 250, 150);
                    break;

                case 'E':
                    System.out.println("Saliendo");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    continue;
            }

            scanner.nextLine();
            empleados.add(new Empleados(nombreCompleto, horasTrabajadas, horasExtras, telefono, fechaNacimiento, categoria));
            return empleados;
        }
    }

    /**
     * aqui se reporta la nomia donde mando a llamar las funciones de mi calculadora.
     * @param empleados
     */
            private static void reporteNomina(List<Empleados> empleados){
                System.out.println("RPORTE NOMINA");
                System.out.println("Sueldo normal del empleados" + CalculadoraPagos.calculoSueldonormal(empleados));
                System.out.println("pago por horas extras trabajadas" + CalculadoraPagos.calculoHorastrabajadas(empleados));
                System.out.println("Total de la nómina de la empresa: $" + CalculadoraPagos.calcularTotalNomina(empleados));
                    System.out.println("Empleados sin horas extras: " + CalculadoraPagos.empleadosSinHorasExtras(empleados));
                System.out.println("Empleados con horas extras:" + CalculadoraPagos.empleadosConHorasExtras(empleados));
                    System.out.println("Total de horas extras laboradas en la empresa: " + CalculadoraPagos.calculoHorasExtras(empleados));
            }

        }
/**
 * tambien pude elaborar el codigo gracias a mi compañero de equipo
 *
 */






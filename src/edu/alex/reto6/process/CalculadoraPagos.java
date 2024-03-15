package edu.alex.reto6.process;

import java.util.List;

public class CalculadoraPagos {
    public static double calculoSueldonormal(List<Empleados>empleados){
        double Sueldonormal = 0;
        for (Empleados empleado : empleados) {
            Sueldonormal += empleado.getCategoria().getSueldoBase() * empleado.getHorasTrabajadas();
        }
        return Sueldonormal;
    }
    public static double calculoHorastrabajadas(List<Empleados>empleados){
        int horastrabajadas = 0;
        for (Empleados empleado : empleados){
            horastrabajadas+= empleado.getHorasTrabajadas() + empleado.getHorasExtras();
        }
        return horastrabajadas;

    }
    public static double calculoHorasExtrasTrabajadas(List<Empleados>empleados) {
        int horasExtrastrabajadas = 0;
        for (Empleados empleado : empleados) {
            horasExtrastrabajadas += empleado.getHorasTrabajadas() + empleado.getHorasExtras();
        }
        return horasExtrastrabajadas;
    }
    public static double calculoHorasExtras(List<Empleados> empleados){
        double HorasExtras= 0;
        for (Empleados empleado : empleados){
            HorasExtras += empleado.getCategoria().getPagoHoraextra() * empleado.getHorasExtras();
        }
        return HorasExtras;
    }
    public static double calcularTotalNomina(List<Empleados> empleados) {
        double Nomina = 0;
        for (Empleados empleado : empleados) {
            Nomina += calculoSueldoTotal(empleado);
        }
        return Nomina;
    }

    public static int empleadosConHorasExtras(List<Empleados>empleados){
        int count = 0;
        for (Empleados empleado : empleados){
            if (empleado.getHorasExtras() > 0){
                count++;
            }
        }
        return count;
    }

    public static int empleadosSinHorasExtras(List<Empleados>empleados){
        int count = 0;
        for (Empleados empleado : empleados){
            if (empleado.getHorasExtras() == 0){
                count++;
            }
        }
        return count;
    }



    private static double calculoSueldoTotal(Empleados empleado){
        return empleado.getCategoria().getSueldoBase() * empleado.getHorasTrabajadas() +
                empleado.getCategoria().getPagoHoraextra() * empleado.getHorasExtras();
    }
}


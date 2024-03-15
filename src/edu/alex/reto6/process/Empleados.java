package edu.alex.reto6.process;

import java.util.Date;

public class Empleados {
    private String NombreCompleto;
    private int HorasTrabajadas;
    private int HorasExtras;
    private double Telefono;
    private Date FechaDeNacimiento;
    private Categorias categoria;


    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        HorasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtras() {
        return HorasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        HorasExtras = horasExtras;
    }

    public double getTelefono() {
        return Telefono;
    }

    public void setTelefono(double telefono) {
        Telefono = telefono;
    }

    public Date getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        FechaDeNacimiento = fechaDeNacimiento;
    }
    public Empleados(String NombreCompleto, int HorasTrabajadas, int HorasExtras, double Telefono, Date FechaDeNacimiento, Categorias categoria) {
        this.NombreCompleto = NombreCompleto;
        this.HorasTrabajadas = HorasTrabajadas;
        this.HorasExtras = HorasExtras;
        this.Telefono = Telefono;
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
}

package edu.alex.reto6.process;

public class Categorias {
    public String nombre;
    private String categoria;
    public int sueldoBase;
    public int pagoHoraextra;

    public Categorias(String nombre, String categoria, int sueldoBase, int pagoHoraextra){
        this.nombre = nombre;
        this.categoria = categoria;
        this.sueldoBase = sueldoBase;
        this.pagoHoraextra = pagoHoraextra;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getPagoHoraextra() {
        return pagoHoraextra;
    }

    public void setPagoHoraextra(int pagoHoraextra) {
        this.pagoHoraextra = pagoHoraextra;
    }
}


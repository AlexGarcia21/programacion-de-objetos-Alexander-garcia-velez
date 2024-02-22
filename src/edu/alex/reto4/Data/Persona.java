package edu.alex.reto4.Data;

/**
 * aqui solo se guarda el nombre del comprador
 * para que se vuelva a regresar en pantalla.
 */
public class Persona {
    private String nombrecompleto;
    public Persona (String nombrecompleto){
        this.nombrecompleto = nombrecompleto;
    }
    public String getnombrecompleto(){
        return nombrecompleto;
    }

}


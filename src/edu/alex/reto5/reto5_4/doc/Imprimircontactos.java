package edu.alex.reto5.reto5_4.doc;

public class Imprimircontactos {
    public void imprimirContactos() {
        for (Contactos.Contacto contacto : contactos) {
            System.out.println("Nombre: " + contacto.getNombre());
            System.out.println("Dirección: " + contacto.getDireccion());
            System.out.println("Teléfono de Casa: " + contacto.getTelefonoCasa());
            System.out.println("Teléfono de Trabajo: " + contacto.getTelefonoTrabajo());
        }
    }
}


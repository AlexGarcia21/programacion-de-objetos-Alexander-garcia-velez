package edu.alex.reto5.reto5_4.doc;

public class Contactos {
    public class Contacto {
        private String nombre;
        private String direccion;
        private String telefonoCasa;
        private String telefonoTrabajo;

        public Contacto(String nombre, String direccion, String telefonoCasa, String telefonoTrabajo) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefonoCasa = telefonoCasa;
            this.telefonoTrabajo = telefonoTrabajo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public String getTelefonoCasa() {
            return telefonoCasa;
        }

        public String getTelefonoTrabajo() {
            return telefonoTrabajo;
        }
    }

}

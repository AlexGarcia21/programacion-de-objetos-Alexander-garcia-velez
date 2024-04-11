package edu.alex.reto9.ui;

public class Traductor {
    public String HOLA_Bienvenido;

    private Traductor() {
    }

    public Traductor(String HOLA_Bienvenido) {
        this.HOLA_Bienvenido = HOLA_Bienvenido;
    }

    public static Traductor getInstance(String idioma) {
        switch (idioma) {
            case "es":
                return new Traductor("¡Hola Bienvenido!");
            case "eng":
                return new Traductor("¡Hello Welcome!");
            case "opcion1":
                return new Traductor("¡Selecciona una opción!");
            case "elprincipito":
                return new Traductor("El principito");
            case "caperucitaRoja":
                return new Traductor("Caperucita Roja");
            case "Eldinosaurio":
                return new Traductor("El dinosaurio");
            case "elgatoconbotas":
                return new Traductor("El gato con botas");
            case "hansel y gretel":
                return new Traductor("Hansel y Gretel");


            case "opcion2":
                return new Traductor("¡Choose an option!");
            case "the little prince":
                return new Traductor("The Little Prince");
            case "red riding hood":
                return new Traductor("Red Riding Hood");
            case "dinosaur":
                return new Traductor("Dinosaur");
            case "the puss in boots":
                return new Traductor("The Puss in Boots");
            case "hansel y gretel2.0":
                return new Traductor("Hansel y Gretel");
            default:
                return null;
        }
    }
}

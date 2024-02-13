package edu.alex.reto3.diccionario.process;

import java.util.Arrays;

/**
 * ingresamos las variables de las
 * palabras yb significados
 */
public class Diccionario {
    private String[] palabras;
    private String[] significado;

    public Diccionario(String[] palabras, String[] significado) {
        this.palabras = palabras;
        this.significado = significado;
    }

    public String buscarsignificado(String palabra) {
        return getDescripcion(getIndice(palabra));
    }

    private int getIndice(String palabra) {
        int index = 0;

        while (index < palabras.length) {
            if (palabra.equalsIgnoreCase(palabras[index])) return index;
            index++;
        }
        return -1;
    }

    private String getDescripcion(int index) {
        if (index == -1) return "la palabra que busca no esta en el diccionario";
        return significado[index];
    }

    /**
     *
     */
    public void printList() {
        Arrays
                .stream(palabras)
                .forEach(System.out::println);
    }

    /**
     * aqui ews facil solo usamos el for
     * para mostrar el usuario la palabra que ingrese los caracteres
     */
    public static void cantidadCaracteres() {
        String[] palabras = {"maleante", "casa", "gato", "hip hop",
                "dropset", "pecera", "omnipotente", "pastel", "carro", "tabaco"};
        int[] caracteresPalabras = {8, 4, 4, 6, 7, 6, 11, 6, 5, 6};
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("palabras: " + palabras[i] + ", Caracteres: " + caracteresPalabras[i]);
        }
    }

    /**
     * aqui igual contamos la cantidad de caracteres y se
     * las mostramos al usuario
     */
    public void cantidaddecaracteressig() {
        String[] significado = {"Que malea o daña", "hogar del humano", "animal domestico", "movimiento cultural y artístico",
                "consiste en cargar un determinado peso en ir bajandolo sin descanso", "Vasija o globo de cristal", "significa todo, y potente",
                "Masa de harina y manteca, cocida al horno", "Vehículo o armazón con ruedas",
                "producto elaborado con las hojas curadas del tabaco y que suele fumarse."};
        int[] caracteresSignificado = {16, 16, 16, 31, 67, 25, 25, 41, 29, 72};
        for (int i = 0; i < significado.length; i++) {
            System.out.println("palabras: " + significado[i] + ", Caracteres: " + caracteresSignificado[i]);
        }
    }
}

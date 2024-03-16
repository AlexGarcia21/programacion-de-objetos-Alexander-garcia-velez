package edu.alex.reto7.process;

public class Potencia extends Multiplicacion {
    @Override
    public int calcular(int valor1, int valor2) {
        if (valor2 < 0) {
            throw new IllegalArgumentException("El exponente no puede ser 0");
        }

        int resultado = 1;
        for (int i = 0; i < valor2; i++) {
            resultado = sumas(resultado, valor1); // Aquí se corrige el uso de sumas
        }

        return resultado;
    }

    // Método sumas que realiza la multiplicación
    public static int sumas(int valor1, int valor2) {
        int resultado = 0;
        for (int i = 0; i < valor2; i++) {
            resultado += valor1;
        }
        return resultado;
    }
}


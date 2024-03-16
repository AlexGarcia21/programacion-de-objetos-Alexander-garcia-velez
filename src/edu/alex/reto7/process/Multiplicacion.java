package edu.alex.reto7.process;

public class Multiplicacion extends Suma {
    @Override
    public int calcular(int valor1, int valor2) {
        int resultado = 0;
        for (int i = 0; i < valor1; i++) {
            resultado += valor2;//aqui le pongo el acumulador + ,se lo quite primero pero solo me daba el segundo valor sin mas
        }
        return resultado;
    }
}


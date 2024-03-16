package edu.alex.reto7.process;

public class Raiz extends Multiplicacion{
    @Override
    public int calcular(int valor1, int b) {
        int resultado = 0;
        int i = 1;

        while (valor1 > 0) {
            valor1 -= i;
            i += 2;
            if (valor1 >= 0) resultado++;
        }

        return resultado;
    }
}
//me ayudaron compañerpos de clase aqui:)

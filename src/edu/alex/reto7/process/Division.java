package edu.alex.reto7.process;

public class Division extends Resta {
    @Override
    public int calcular(int valor1, int valor2) {
        if (valor2==0){
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        int cociente = 0;
        while (valor1 >= valor2) {
            valor1 -= valor2;
            cociente++;
        }
        return cociente;

    }
}

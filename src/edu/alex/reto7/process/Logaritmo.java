package edu.alex.reto7.process;

public class Logaritmo extends Division {
    @Override
    public int calcular(int valor1, int valor2) {
        if (valor1 <= 1 || valor2 <= 0) throw new ArithmeticException(
                "El logaritmo no esta definido");
        int log = 1;
        int multiplicacion;
        int potenciaBase = valor2;
        while (potenciaBase <= valor1) {
            multiplicacion = super.calcular(potenciaBase, valor2);
            potenciaBase += multiplicacion;
            log++;
        }
        return log;
    }
}


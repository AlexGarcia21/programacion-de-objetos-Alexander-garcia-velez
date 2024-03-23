package edu.alex.reto7.process;

import edu.alex.reto7.ui.Textos;

public class Modulo extends Resta{
    @Override
    public int calcular(int valor1,int valor2){
        if (valor2 == 0) {
            throw new IllegalArgumentException(Textos.ERROR_MODULO);
        }
        int contador = 0;
        int residuo = Math.abs(valor1);
        while (residuo >= Math.abs(valor2)) {
            residuo = super.calcular(residuo, Math.abs(valor2));
            contador++;
        }
return contador;
    }

}

package edu.alex.reto7.process;

public class Raizcorregida extends Multiplicacion {
    @Override
    public int calcular(int valor1, int valor2) {
        if (valor1 < 0) throw new ArithmeticException("No se puede calcular la raíz de un número negativo");

        if (valor2 < 0) throw new ArithmeticException("No se puede calcular la raíz de un número negativo");

        int raiz;
        int Potecncias = 0;
        int validacion = 0;
        int aprox = 1;

        while (Potecncias < valor1) {
            validacion = aprox;
            Potecncias = 1;
            for (int i = 0; i < valor2; i++) {
                Potecncias = super.calcular(Potecncias, aprox);
            }
            aprox++;
        }
        raiz = validacion;

        return raiz;
    }
}

//Lo corregi ya que solo la sacaba por la raiz normal no con otros numeros y con ayuda de mis compañeros.
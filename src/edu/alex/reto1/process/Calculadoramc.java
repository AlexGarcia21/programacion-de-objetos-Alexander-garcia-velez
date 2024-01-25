package edu.alex.reto1.process;

/**
 * Esta clase sirve para realizar calculo de masa corporal,
 * masa corporal magra.
 * masa corporal basal.
 * */
public class Calculadoramc {
    /**
     *este metodo sireve para calcular el indice de masa
     * corporal de una persona en base su peso y estatura
     * @param estatura esta del paciente esta en cm
     * @param peso peso esta en kg
     * @return
     */
    public static double calcularIndiceMasaCorporal(double estatura, double peso){
        return peso/(estatura / 100.0 * estatura / 100.0);
    }

    /**
    ingresamos los resultados para que el usuario pueda verlos
     */
    public static String condicionIMC(double imc) {
        if (imc < 18.5) {
            return "peso bajo";
        } else if (imc >= 18.5 && imc <= 24.99) {
            return "peso normal";
        } else if (imc >= 25 && imc <= 29.99) {
            return "sobrepeso";
        } else if (imc >= 30 && imc <= 34.99) {
            return "obesidad leve";
        } else if (imc >= 35 && imc <= 39.99) {
            return "obesidad moedia";
        } else {
            return "obesidad morbida";
        }
    }

    /**
     *utilizamos equals para comparar el sexo y asi poder hacer las operaciones correctas
     * @param
     * @return
     */
    public static double  calculadoramasacorporalmagra (double altura, double peso, String sexo) {

        if (sexo.equals("mujer")) {
            double mcm = (1.07 * peso) - 148 * (peso * peso / altura * altura);
            return mcm;
        }

        else  {
           double mcm = (1.10 * peso) - 128 *(peso * peso / altura * altura);
           return mcm;
            }
        }

    /**
     * copiamos y pegamos,solo sustituimos las variables
     *
     * @param altura
     * @param peso
     * @param sexo
     * @param edad
     * @return
     */
    public static double  calculadorametabolismobasal (double altura, double peso, String sexo, int edad) {

        if (sexo.equals("mujer")) {
            double mcmb = (655.1 + (9.563 * peso ) + (1.85 * altura) - (4.676 * edad));
            return mcmb;
        }

        else  {
            double mcmb = (66.5 + (13.75 * peso) + (5.003 * altura) - (6.775 * edad) );
            return mcmb;
        }
    }
}


package edu.alex.reto3.diccionario;

import edu.alex.reto3.diccionario.process.Diccionario;
import edu.alex.reto3.diccionario.ui.CLI;

public class Main {
public static void main(String[] args) {
    String palabras[]={"maleante" , "casa" ,"gato" , "hip hop" , "dropset" ,
    "pecera" , "omnipotente" , "pastel" , "carro" , "tabaco"};
    String significados[]={"Que malea o daña", "hogar del humano","animal domestico" ,"movimiento cultural y artístico" ,
            "consiste en cargar un determinado peso en ir bajandolo sin descanso" , "Vasija o globo de cristal", "significa todo, y potente" ,
    "Masa de harina y manteca, cocida al horno" , "Vehículo o armazón con ruedas" ,
            "producto elaborado con las hojas curadas del tabaco y que suele fumarse."};
    Diccionario diccionario = new Diccionario(palabras,significados);

    CLI.menuDiccionario(diccionario);
}
}

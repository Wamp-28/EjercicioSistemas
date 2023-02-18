package Clases;

import java.util.Scanner;

public class MetodosWM {

    // METODOS SIN RETORNO Y SIN PARAMETROS OK
    // METODOS SIN RETORNO Y CON PARAMETROS OK
    // METODOS CON RETORNO Y SIN PARAMETROS OK
    // METODOS CON RETORNO Y CON PARAMETROS
    // METODOS CONSTRUCTORES - VACIO - CON TODOS LOS PARAMETROS GETTER - SETTER


    public void calcularRaiz() {
        // clase objeto = instancia();

        Scanner teclado = new Scanner(System.in);
        double numero, raiz;

        System.out.println("Ingrese el valor que desea calcular");
        numero = teclado.nextDouble();

        raiz = Math.sqrt(numero);
        System.out.println("LA RAIZ DE: " + numero + " ES: " + raiz);
    }

    public void calcularSuma(int num1, int num2) {

        int respuesta = num1 + num2;

        System.out.println("LA SUMA DE: " + num1 + " + " + num2 + " ES: " + respuesta);

    }


    public String mensaje(){

        return "Estamos repasando metodos en java";

    }

    public int multiplicacion(int num1, int num2){


        return (num1*num2);

    }


}

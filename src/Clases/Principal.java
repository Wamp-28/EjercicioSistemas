package Clases;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
/*
        System.out.println("Hola Sistemas Distribuidos");

        // clase objeto = instancia();

        MetodosWM ver = new MetodosWM();

        ver.calcularRaiz();

        int n1, n2;

        System.out.println("Ingrese el primer valor");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor");
        n2 = teclado.nextInt();

        ver.calcularSuma(n1,n2);

        System.out.println(ver.mensaje());

        System.out.println("LA MULTIPLICACION ENTRE " + n1 +" * "+ n2+ " ES: " +ver.multiplicacion(n1,n2));
*/


        Metodos circulo1 = new Metodos();

        circulo1.setPi(3.14);
        circulo1.setRadio(65);



        System.out.println(circulo1.toString());

        System.out.println(circulo1.areaCirculo(circulo1.getPi(), circulo1.getRadio()));


    }
}

package com.JavaEjercicios;

import java.util.Scanner;

public class VolumenCono {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in); //Para escribir en el terminal
        double radio;   //Declaracion de varialbe
        double altura;
        double denominador;

        System.out.println("Escriba el radio del cono: "); //Aparecerá en el terminal

        radio = sc.nextDouble();

        System.out.println("Escriba la altura del cono: ");

        altura = sc.nextDouble();

        denominador = (radio*radio*3.14*altura);

        float resultado = (float)denominador/6;

        System.out.println(resultado);




}
    }





package com.JavaEjercicios;

import java.util.Scanner;

public class CalcularTiempoCaida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Para escribir en el terminal
        double altura;   //Declaracion de varialbe

        System.out.println("Altura del sitio");
        altura = sc.nextDouble();

        System.out.println("El tiempo total:" + ((float)altura/9.8) + " segundos");


    }
}

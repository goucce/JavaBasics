package com.JavaEjercicios;

import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, base;

        System.out.println("Ingrese la base: ");
        base = sc.nextInt();
        System.out.println("Ingrese el exponente");
        n = sc.nextInt();


        int resultado = (int) Math.pow(base, n);//Calculo de la potencia con math.pow...
        System.out.println(base + " elevado a la " + n + " es igual a " + resultado);
    }
}

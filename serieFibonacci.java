package com.JavaEjercicios;

import java.util.Scanner;

public class serieFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el entero del que hace rla serie fibonacci ");


        int n1 = sc.nextInt();
        int n2 = 1;
        int aux;
        int limite = 1000;

        System.out.println(n1);


        while (n2 + n1 <= limite) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;

            System.out.println(n2);
        }
    }
}

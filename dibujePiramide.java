package com.JavaEjercicios;

import java.util.Scanner;

public class dibujePiramide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simbolo a utilizar:");
        String simbolo = sc.nextLine();
        System.out.println("Altura de la piramide");
        int altura = sc.nextInt();
        int num2 = 0;

        for(int i=0; i<=altura;i++){
            int num = 0;

            while(num<=num2){
                System.out.print(simbolo); //esto hace para que se vaya repitiendo hasta que se iguala el num2 que seria cada paso de la piramide
                num++;      //Gracias a esto recorre uno a uno cada paso
            }
            num2++;         //Asi el num2 es cada vez mas grande hasta que lelga al tope que es la altura deseada.
            System.out.println("");
        }
    }
}


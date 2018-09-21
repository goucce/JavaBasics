package com.JavaEjercicios;
import java.util.Scanner;

public class kbConversionMB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Para escribir en el terminal
        int dato;   //Declaracion de varialbe

        System.out.println("Introduce Tamaño en KB"); //Aparecerá en el terminal
        dato = sc.nextInt();

        double decimales = dato%1000*0.001;
        System.out.println(decimales);

        double numero = dato/1000 ;
        double total = decimales + numero;
        System.out.println(total + " MB" );

    }
}

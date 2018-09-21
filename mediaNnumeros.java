package com.JavaEjercicios;

import java.util.Scanner;

public class mediaNnumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //El scanner para acceder a lo que muestra el terminal
        int i,b=0,num=5;    //Declaramos las variables int i, b y num;

        double suma=0.0; //Declaramos la suma cuanto tiene que ser tipo float para que tenga las comas

        System.out.println("Para salir ingresa cero"); //ingrese un numero hata que este sea 0

        while(num!=0){              //mientras el numero sea distinto de 0 se repetirá el bucle _todo el rato
            System.out.println("Ingresa un numero");
            num=sc.nextInt(); //variable se guarda en num
            suma=suma+num;  //la suma guarda el resultado anterior de suma y el nuevo numero
            b++; //incremente el numero por el que se va a dividir los numeros
        }
        System.out.println(suma/(b-1)+ " es la media");
    }
}
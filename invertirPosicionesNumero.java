package com.JavaEjercicios;

import java.util.Scanner;

public class invertirPosicionesNumero
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero a cambiar");
        int numero = sc.nextInt();

        int invertido = 0, resto;

        while(numero > 0){   //numero 1234 //123 ...
            resto = numero % 10; //4 //3 ...
            invertido = invertido * 10 +resto; //0 + 4 = 4 //40+3 = 43 ...
            numero /= 10; //123 //12 ...
        }

        System.out.println("Inversion:" + invertido); //...

    }
}

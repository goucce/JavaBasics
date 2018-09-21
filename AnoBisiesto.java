package com.JavaEjercicios;

import java.util.Scanner;

public class AnoBisiesto
{

    //1º Actividad.
    //
    //Escriba un métodos estático que tome un año como parámetro y
    // devuelva false si el año es bisiesto y true en caso contrario.


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in); //Para escribir en el terminal
        int anio;   //Declaracion de varialbe

        System.out.println("Introduce el año: "); //Aparecerá en el terminal

        anio = sc.nextInt();   //variable obtendrá el valor escrita desdse teclado.

        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            //Modulo 4, es divisible entre 4 y ademas al ser dividirse entre 100, tiene que ser distinto de 0.
            //Tambien puede ser que al ser divisible entre 400 ya seria bisiesto.
        {
            System.out.println("El año es bisiesto");

        }
        else
            {
            System.out.println("El año no es bisiesto");

            }

    }



}

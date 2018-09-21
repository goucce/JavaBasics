package com.JavaEjercicios;
import java.net.SocketOption;
import java.util.Scanner;

public class NumerosRomanos
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  //Scanner para recoger lo que se escribe en el terminal

        String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        //Aray para decir cuanto vale cada unidad
        String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        //Array para decir cuanto vale cada decena
        String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        //Array para decir cuanto vale cada centena
        String Mil[] = {"", "M", "MM", "MMM", "MMMM", "MMMMM", "MMMMMM", "MMMMMMM", "MMMMMMMM", "MMMMMMMMM"};
        System.out.println("Ingresa numero entre 1 y 999"); //Aparece por pantalla el ingreso

        int N = sc.nextInt();  //Int donde se va a guardar el numero que escribamos por el scanner

        int u=N%10;
        //Modulo del numero entre 10, dando como resultado la unidad, 345 / 10 = 34,5 ;  el 5 es lo que sobra, por lo tanto, la UNIDAD
        System.out.println(u);

        int d=(N/10)%10;
        //Modulo del numero dividido entre 10, para así eliminar los decimales, se quedaria 34 / 10 = 3, 4, lo que sobra es 4 DECIMAL
        int c=N/100;
        //Division entre 100, por lo tanto tenemos el ultimo numero 3 CENTENA

        int m = N/1000;

     //   if (N >=1000){
       // System.out.println(Mil[m]+Centena[c]+Decena[d]+Unidad[u]);
        // }

        if(N>=100)
        {
            System.out.println(Centena[c]+Decena[d]+Unidad[u]);
        }else
            {
                if(N>=10)
                {
                  System.out.println(Decena[d]+Unidad[u]);
                 }else
                     {
                    System.out.println(Unidad[N]);
                     }
            }
    }
}




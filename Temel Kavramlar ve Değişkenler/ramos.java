package javaProje;

import java.util.Scanner;

public class ramos {
    public static void main(String[] args) {

        // Ucgenin Alanini Bulma

        double a,b,c,u,cevre,alan;

        Scanner deger = new Scanner(System.in);

        System.out.print( "1. Degeri Giriniz: " );
        a = deger.nextDouble();

        System.out.println("-----------");

        System.out.print( "2. Degeri Giriniz : " );
        b = deger.nextDouble();

        System.out.println("-----------");

        System.out.print( "3. Degeri giriniz: " );
        c = deger.nextDouble();

        System.out.println( "-----------" );

        cevre = a+b+c;
        u = cevre/2;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println( "Ucgenin alani : " +alan);
    }
}

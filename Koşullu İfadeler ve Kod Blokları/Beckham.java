package javaProje;

import java.util.Scanner;

public class Beckham {
    public static void main(String[] args) {

        //Cin Zodyagı

        int year, remain ;

        Scanner reader = new Scanner(System.in);

        System.out.print( "Dogdugunuz Yili Giriniz : " );
        year = reader.nextInt();

        remain = year%12 ;

        if (remain == 0) {
            System.out.println( "Sizin Zodyak Burcunuz : Maymun" );
        } else if (remain == 1) {
            System.out.println( "Sizin Zodyak Burcunuz : Horoz" );
        } else if (remain == 2) {
            System.out.println( "Sizin Zodyak Burcunuz : Kopek" );
        } else if (remain == 3) {
            System.out.println( "Sizin Zodyak Burcunuz : Domuz" );
        } else if (remain == 4) {
            System.out.println( "Sizin Zodyak Burcunuz : Fare" );
        } else if (remain == 5) {
            System.out.println( "Sizin Zodyak Burcunuz : Okuz" );
        } else if (remain == 6) {
            System.out.println( "Sizin Zodyak Burcunuz : Kaplan" );
        } else if (remain == 7) {
            System.out.println( "Sizin Zodyak Burcunuz : Tavsan" );
        } else if (remain == 8) {
            System.out.println( "Sizin Zodyak Burcunuz : Ejderha" );
        } else if (remain == 9) {
            System.out.println( "Sizin Zodyak Burcunuz : Yilan" );
        } else if (remain == 10) {
            System.out.println( "Sizin Zodyak Burcunuz : At" );
        } else if (remain == 11) {
            System.out.println( "Sizin Zodyak Burcunuz : Koyun" );
        }
    }
}

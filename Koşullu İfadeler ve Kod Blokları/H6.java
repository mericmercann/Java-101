package javaProje;

import java.util.Scanner;

public class H6 {
    public static void main(String[] args) {
        //Hava Durumu
        double heat ;

        Scanner reader= new Scanner(System.in);
        System.out.print( "Sıcaklık Değerini Giriniz : " );
        heat= reader.nextDouble();

        if ( heat<5 ){
            System.out.println( "Kayak yapabilirsin." );
        } else if ( heat<=25 ) {
            if ( heat<=15 ){
                System.out.println( "Sinemaya gidebilirsin." );
            }if ( heat>10 ){
                System.out.println( "Pikniğe gidebilirsin." );
            }
        }else {
            System.out.println( "Yüzmeye gidebilirsin." );
        }
    }
}
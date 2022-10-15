package javaProje;

import java.util.Scanner ;

public class Carlos {
    public static void main(String[] args) {

        //Kucukten Buyuge Siralama
        int a,b,c ;

        Scanner reader = new Scanner(System.in);
        System.out.print( "1. Sayiyi Giriniz : " );
        a = reader.nextInt();

        System.out.print( "2. Sayiyi Giriniz : " );
        b = reader.nextInt();

        System.out.print( "3. Sayiyi Giriniz : " );
        c = reader.nextInt();

        if ( ( a<b ) && ( a<c ) ){
            if ( b<c ){
                System.out.println( " a<b<c " );
            }else {
                System.out.println( " a<c<b " );
            }
        } else if ( ( b<a ) && ( b<c )) {
            if ( a<c ){
                System.out.println( " b<a<c ");
            }else {
                System.out.println( " b<c<a " );
            }
        }else if ( ( c<b ) && ( c<a )){
            if ( a<b ){
                System.out.println( " c<a<b ");
            }else {
                System.out.println( " c<b<a " );
            }
        }

    }
}

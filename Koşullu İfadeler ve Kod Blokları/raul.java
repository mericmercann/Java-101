package javaProje;

import java.util.Scanner;

public class raul {
    public static void main(String[] args) {
        //Hesap Makinesi
        int n1,n2,select ;

        Scanner reader = new Scanner(System.in);
        System.out.print( "1. Sayiyi Giriniz : " );
        n1 = reader.nextInt();
        System.out.print( "2. Sayiyi Giriniz : " );
        n2 = reader.nextInt();

        System.out.println( "1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme" );
        System.out.print( "Lutfen Yapacaginiz Islemi Seciniz : " );
        select = reader.nextInt();

        switch (select){
            case 1:
                System.out.println( "Toplama : "+ ( n1+n2 ));
                break;
            case 2:
                System.out.println( "Cikarma : "+ ( n1-n2 ) );
                break;
            case 3 :
                System.out.println( " Carpma : "+ ( n1*n2 ) );
                break;
            case 4:
                if ( n2!=0 ){
                    System.out.println( "Bolme : "+ ( n1/n2 ) );
                }else{
                    System.out.println( "Bir Sayi 0'a Bolunemez! Lutfen Tekrar Deneyiniz." );
                }
                break;

            default:
                System.out.println( "Hatali Kodlama ! lUTFEN TEKRAR DENEYINIZ." );
        }
    }
}
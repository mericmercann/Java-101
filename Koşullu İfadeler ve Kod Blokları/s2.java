package javaProje;

import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
        int turkce, mat, kimya, fizik, tarih ;

        Scanner reader=new Scanner(System.in);

        System.out.println( "Türkçe Notunuzu Giriniz : " );
        turkce= reader.nextInt();

        System.out.println( "Matematik Notunuzu Giriniz : " );
        mat= reader.nextInt();

        System.out.println( "Fizik Notunuzu Giriniz : " );
        fizik= reader.nextInt();

        System.out.println( "Kimya Notunuzu Giriniz : " );
        kimya= reader.nextInt();

        System.out.println( "Tarih Notunuzu Giriniz : " );
        tarih= reader.nextInt();

        double avarage= (mat+kimya+fizik+turkce+tarih)/5 ;
        if ( avarage<55 ) {
            System.out.println( "Sınıfta Kaldınız !!!" );
        }else {
            System.out.println( "Tebrikler ! Sınıfı Geçtiniz !!" );
        }
        System.out.println( "Ortalamanız => "+avarage );
    }
}

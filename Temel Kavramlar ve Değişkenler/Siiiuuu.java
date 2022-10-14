package javaProje;

import java.util.Scanner;

public class Siiiuuu {
    public static void main(String[] args) {

        //Not Ortalamasi Hesaplama

        //Degisken tanimladim
        int mat,fizik,kimya,tarih,muzik,turkce;

        //Scanner sinifini tanimladim
        Scanner reader = new Scanner(System.in);

        //Kullanicidan degerleri aldim
        System.out.println( "Matematik Notunuz : " );
        mat = reader.nextInt();

        System.out.println( "Fizik Notunuz : " );
        fizik = reader.nextInt();

        System.out.println( "Kimya Notunuz : " );
        kimya = reader.nextInt();

        System.out.println( "Tarih Notunuz : " );
        tarih = reader.nextInt();

        System.out.println( "Muzik Notunuz : " );
        muzik = reader.nextInt();

        System.out.println( "Turkce Notunuz : " );
        turkce = reader.nextInt();

        //Tum dersleri toplayip double ile ortalamasini aldim
        int toplam = ( mat+fizik+kimya+tarih+muzik+turkce );
        double sonuc = toplam / 6 ;

        //Burada da sonucları ekrana yazdirdim
        System.out.println( "------------------" );
        System.out.println( "Ortalama Notunuz : " +sonuc );
        System.out.println( "------------------" );
        System.out.println( sonuc>=50 ? "Tebrikler , sinifi gectiniz!" : "Maalesef , sinifta kaldiniz! " );


    }
}

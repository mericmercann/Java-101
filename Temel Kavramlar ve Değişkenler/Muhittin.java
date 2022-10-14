package javaProje;
import java.util.Scanner;

public class Muhittin {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvliTutar, kdvOran =0.18 ;

        Scanner input=new Scanner(System.in);
        System.out.print( "Tutarı Giriniz : " );
        tutar= input.nextDouble();

        kdvTutar = tutar*kdvOran;
        kdvliTutar = tutar*kdvTutar;

        System.out.println( "KDV'siz Tutar : " +tutar );
        System.out.println( "KDV'li Tutar : " +kdvTutar);
        System.out.println( "KDV Oranı : " +kdvOran );
        System.out.println( "KDV'li Tutarı : " +kdvliTutar );
    }
}
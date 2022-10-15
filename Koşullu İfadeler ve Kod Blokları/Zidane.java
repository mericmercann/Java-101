package javaProje;

import java.util.Scanner ;

public class Zidane {
    public static void main(String[] args) {

        //Ucak Bileti Hesaplama

        int yas, yolculukTipi ;
        double mesafe, toplamTutar,tutar ;
        boolean isError = false;

        Scanner value = new Scanner(System.in);

        System.out.print( "Mesafeyi KM Cinsinden Giriniz : " );
        mesafe = value.nextDouble();

        System.out.println("##################################");

        System.out.print( "Yasinizi Giriniz : " );
        yas = value.nextInt();

        System.out.println("##################################");

        System.out.print( "1-Tek Yon\n2-Gidis Gelis\nYolculuk Tipini Giriniz :" );
        yolculukTipi = value.nextInt();

        System.out.println("##################################");

        tutar = ( mesafe*0.10 );

        if ( mesafe<0 ) {
            isError = true;
        }

        if ( yas<0 ) {
            isError = true;
        }

        if ( yolculukTipi>2 || yolculukTipi<1 ) {
            isError = true;
        }
        if ( yas<12 ) {
            if ( yolculukTipi==2 ) {
                toplamTutar = ((tutar - (tutar * 0.5)) - ((tutar - (tutar * 0.5)) * 0.2)) * 2;
            } else {
                toplamTutar = tutar - (tutar * 0.5);
            }
        } else if ( yas>12 && yas<24 ) {
            if ( yolculukTipi==2 ) {
                toplamTutar = ((tutar - (tutar * 0.1)) - ((tutar - (tutar * 0.1)) * 0.2)) * 2;
            } else {
                toplamTutar = tutar - (tutar * 0.1);
            }
        } else if( yas>64 ) {
            if ( yolculukTipi==2 ) {
                toplamTutar = ((tutar - (tutar * 0.3)) - ((tutar - (tutar * 0.3)) * 0.2)) * 2;
            } else {
                toplamTutar = tutar - (tutar * 0.3);
            }
        } else {
            if ( yolculukTipi==2 ) {
                toplamTutar = tutar * 2;
            } else {
                toplamTutar = tutar;
            }
        }

        if (isError) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        }
    }
}
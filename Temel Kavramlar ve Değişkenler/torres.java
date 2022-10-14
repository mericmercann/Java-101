package javaProje;
import java.util.Scanner ;

public class torres {
    public static void main(String[] args) {

        // Vucut Kitle Endeksi Hesaplama

        double boy, kilo, vki ;

        Scanner vamos = new Scanner(System.in);
        System.out.println( "Boyunuzu yazarken lutfen virgul (,) kullaniniz. " );
        System.out.println( "ORN. 1,77" );
        System.out.print( "Lutfen boyunuzu metre cinsinden giriniz : " );
        boy = vamos.nextDouble();

        System.out.print( "Lutfen kilonuzu giriniz : " );
        kilo = vamos.nextDouble();

        vki = kilo/( boy*boy );
        System.out.println( "Vucut kitle endeksiniz : " +vki);
    }
}

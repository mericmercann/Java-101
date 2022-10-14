package javaProje;
import java.util.Scanner ;

public class casillas {
    public static void main(String[] args) {

        //Manav Kasa Programı

        //meyveler ve kilogram fiyatlarını girdim
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95 ,patlican=5 ,toplamTutar=0  ;

        // kullanıcıdan girdi alacagım
        Scanner girdi = new Scanner(System.in);

        System.out.print("Patlican kac kg : " );
        patlican *= girdi.nextDouble();

        System.out.println( " - - - - - - - - " );

        System.out.print( "Muz kac kg : " );
        muz *= girdi.nextDouble();

        System.out.println( " - - - - - - - - " );

        System.out.print( "Domates kac kg : " );
        domates *= girdi.nextDouble();

        System.out.println( " - - - - - - - - " );

        System.out.print( "Elma kac kg : " );
        elma *= girdi.nextDouble();

        System.out.println( " - - - - - - - - " );

        System.out.print( "Armut kac kg : " );
        armut *= girdi.nextDouble();

        System.out.println( " - - - - - - - - " );

        //Toplam tutaru hesaplama.
        toplamTutar += ( armut+elma+domates+muz+patlican ) ;
        System.out.println( "Toplam tutar : " +toplamTutar+ " TL'dir." );
        System.out.println( " - - - - - - - - " );
    }
}

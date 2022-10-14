package javaProje;
import java.util.Scanner;

public class salihabi {
    public static void main(String[] args) {
        //Taksimetre
        double km, perKm=2.20, total, statrPrice=10 ;

        Scanner reader=new Scanner(System.in);
        System.out.print( "Mesafeyi Giriniz : " );
        km= reader.nextDouble();

        total = km*perKm;
        total += statrPrice;

        total = ( 20<total ) ? 20 : total;
        System.out.println( "Toplam Tutar : "+total );
    }
}

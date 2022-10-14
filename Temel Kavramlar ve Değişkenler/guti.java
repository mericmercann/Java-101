package javaProje;
import java.util.Scanner;

public class guti {
    public static void main(String[] args) {

        //Dairenin Dilimini Hesaplama
        double r, a, pi = 3.14, dilimAlani ;

        Scanner siu = new Scanner(System.in);
        System.out.print( "Yari capi giriniz: " );
        r=siu.nextDouble();

        System.out.print( "Merkez aciyi giriniz: " );
        a = siu.nextDouble();

        dilimAlani= ( pi* (r*r) *a )/360 ;
        System.out.println("Dairenin dilim alani : " +dilimAlani);
    }
}
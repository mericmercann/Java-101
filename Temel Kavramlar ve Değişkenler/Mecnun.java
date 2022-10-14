package javaProje;
import java.util.Scanner;

public class Mecnun {
    public static void main(String[] args) {

        //Hipotenüs
        int a,b ;
        double c;

        Scanner inp = new Scanner(System.in);
        System.out.print( "1. Kenari Giriniz : " );
        a = inp.nextInt();
        System.out.print( "2. Kenari Giriniz : " );
        b = inp.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println( "Hipotenus : "+c );
    }
}

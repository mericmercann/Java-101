package javaProje;
import java.util.Scanner ;

public class Helguera {
    public static void main(String[] args) {

        //Hava Durumu
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print( " Sicaklik Giriniz (°C) : " );
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz. ");
        } else if ( heat <= 25) {
            if (heat >= 5 && heat <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz.");
            }
            if (heat >= 15 && heat <= 25) {
                System.out.println("Piknik Yapabilirsiniz.");
            }
        } else  {
            System.out.println("Yuzmeye Gidebilirsiniz.");

        }
    }
}
package javaProje;

import java.util.Scanner;

public class vamos {
    public static void main(String[] args) {
        //KDV HESAPLAMA

        double kdv = 0.18 , kdv2 = 0.08;
        int tutar ;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutari giriniz :");
        tutar = input.nextInt();

        double toplamKdv = (tutar > 1000) ? tutar * kdv : tutar * kdv2;

        System.out.println("Tutar : " + tutar);
        System.out.println("Kdvsiz Tutar : " + (tutar-toplamKdv));
        System.out.println("Toplam Kdv : " + toplamKdv);
    }
}

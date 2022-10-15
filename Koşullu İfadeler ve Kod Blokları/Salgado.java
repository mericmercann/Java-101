package javaProje;
import java.util.Scanner;

public class Salgado {
    public static void main(String[] args) {

        //Gecme Kalma

        int matematik, fizik, turkce, kimya, tarih;
        int ortalama, toplamNot = 0, toplamDersSayisi = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = input.nextInt();
        if((matematik <= 0 || matematik > 100)) {
            toplamNot += matematik;
            toplamDersSayisi++;
        }

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        if((fizik <= 0 || fizik > 100)) {
            toplamNot += fizik;
            toplamDersSayisi++;
        }

        System.out.print("Turkce Notunuzu Giriniz: ");
        turkce = input.nextInt();
        if((turkce <= 0 || turkce > 100)) {
            toplamNot += turkce;
            toplamDersSayisi++;
        }

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();
        if((kimya <= 0 || kimya > 100)) {
            toplamNot += kimya;
            toplamDersSayisi++;
        }

        System.out.print("Muzik Notunuzu Giriniz: ");
        tarih = input.nextInt();
        if((tarih <= 0 || tarih > 100)) {
            toplamNot += tarih;
            toplamDersSayisi++;
        }

        ortalama = toplamNot / toplamDersSayisi;

        if(ortalama <= 55) {
            System.out.println("Gecme Durumu: Kaldiniz !");
        } else {
            System.out.println("Gecme Durumu: Gectiniz, Tebrik Ederiz!");
        }
        System.out.println("Ortalamaniz: " + ortalama);
    }
}
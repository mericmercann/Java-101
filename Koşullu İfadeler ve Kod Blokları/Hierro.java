package javaProje;
import java.util.Scanner ;

public class Hierro {
    public static void main(String[] args) {

        //Sifre Degistirme

        //degiskenleri tanimladim.
        String userName, passwd, change, newPasswd;

        //kullaniciden String tipinde girdi aldim.
        Scanner reader = new Scanner(System.in);
        System.out.print("Kullanici Adinizi Giriniz : ");
        userName = reader.nextLine();
        System.out.print("Sifrenizi Giriniz : ");
        passwd = reader.nextLine();

        System.out.println(" - - - - - - - - - - ");

        //burada sartları yazdım
        if (userName.equals("hala madrid") && passwd.equals("vamos madrid")) {
            System.out.print("Basarili Bir Sekilde Giris Yaptiniz ! ");
        } else {
            System.out.print("Kullanici Adi veya Sifreniz Yanlis ! ");
            System.out.println("Yeni Bir Sifre Olusturmak Ister Misiniz ? \n1-Evet\n2-Hayir");
            System.out.print("Seciniz : ");
            change = reader.nextLine();
            if (change.equals("1")) {
                System.out.println("Yeni Sifreniz Eski Sifre Ile Ayni Olamaz !");
                System.out.print("Yeni Sifreniz : ");
                newPasswd = reader.nextLine();
                if (newPasswd.equals("vamos madrid")) {
                    System.out.println( "Girilen Sifre Eski Sifre Ile Ayni Olmamalidir !" );
                    return;
                }else {
                    System.out.println( "Yeni Sifre Basarili Bir Sekilde Olusturuldu." );
                }

            }else {
                System.out.println( "Sifre Degistirme Islemi Iptal Edildi" );
            }
        }
    }
}

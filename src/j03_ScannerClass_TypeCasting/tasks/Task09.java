package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Task->
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("a sayısını giriniz: ");
        double a=scan.nextInt();

        System.out.println("b sayısını giriniz");
        double b = scan.nextInt();

        System.out.println("c sayısını giriniz");
        double c= scan.nextInt();

        double sonuc= ((a*a)-(b*b))/(c*3);
        System.out.println("sonuc = " + sonuc);


    }
}

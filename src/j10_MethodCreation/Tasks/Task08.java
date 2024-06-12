package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Task->   girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.

   input: 2023
   output:false
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir yil giriniz");
        int yil= scan.nextInt();
        System.out.println(lepYearControl1(yil));
        System.out.println(lepYearControl2(yil));

    }//main sonu

    private static boolean lepYearControl2(int yil) {
        return (yil%4==0&&yil%100!=0)||yil%400==0?true:false;
    }

    private static String lepYearControl1(int yil) {
        return (yil%4==0&&yil%100!=0)||yil%400==0?"true":"false";

    }//main sonu

}//Class sonu

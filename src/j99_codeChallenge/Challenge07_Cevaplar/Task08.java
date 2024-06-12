package j99_codeChallenge.Challenge07_Cevaplar;

import java.util.Scanner;

public class Task08 {

      /* task->  girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz..
   artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Agam yılını giresen : ");
        int yil = input.nextInt();
        System.out.println(artikYilControl(yil));
    }// main sonu

    private static String artikYilControl(int yil) {
        return (yil%4==0 && (yil%100!=0 || yil%400==0))?"girilen yil ARTIK YIL :) ":"girilen yil ARTIK YIL DEGIL:( ";
    }


}// Class sonu
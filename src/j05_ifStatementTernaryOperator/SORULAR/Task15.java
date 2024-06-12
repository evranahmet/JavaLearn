package j05_ifStatementTernaryOperator.SORULAR;

import java.beans.EventHandler;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Ehliyetiniz var mı?");
        String ehliyet= scan.next();
        if (ehliyet.equalsIgnoreCase("evet")){
            System.out.println("kaç yıldır ehliyetiniz var");
            int yıl=scan.nextInt();
            System.out.println("Ne kadar mesafe yol gittiniz");
            int mesafe=scan.nextInt();
            if (yıl>7){
            }else {
                System.out.println(7-yıl +" yıl daha geçmesi gerekiyotr");

            }if (mesafe>100000){

            }else {
                System.out.println(100000-mesafe+ " km daha kullanman gerek");

            }System.out.println("tebrikler anahtarı almayı hak ettiniz");

        }if (ehliyet.equalsIgnoreCase("hayır")){
            System.out.println("daha çok çalışmalısın");
        }else {
            System.out.println("tekrar deneyin");
        }

        }




    }























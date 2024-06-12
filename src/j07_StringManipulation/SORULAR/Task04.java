package j07_StringManipulation.SORULAR;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci kelimeyi giriniz");
        String kelime1=scan.next();
        System.out.println("ikinci kelimeyi giriniz");
        String kelime2=scan.next();
        if (kelime1.length()%2==0){
            System.out.println(kelime1.substring(0, kelime1.length() / 2) + kelime2 + kelime1.substring(kelime1.length() / 2));
        }else System.out.println("kelime2 kelime1'e eklenemez");


    }
}

package j99_codeChallenge.Challenge07_Cevaplar;

import java.util.Scanner;

public class Task06 {

    /* task->
     Girilen  isim ve soyismin ilk harflerini büyük
     diğer harflerini küçük harf olarak print eden method create ediniz.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Agam adını giresen : ");

        String ad=input.next().toUpperCase();

        System.out.println("Agam soyadını giresen : ");

        String soyad=input.next().toUpperCase();

        System.out.println("method öncesi : "+ad + " " + soyad);//HALUK BİLGİN
        System.out.println("method sonrası : "+name(ad, soyad));//
    }// main sonu

    private static String  name(String ad, String soyad) {

        return ad.charAt(0)+ad.substring(1).toLowerCase()+" "+soyad.charAt(0)+soyad.substring(1).toLowerCase();
    }


}// Class sonu

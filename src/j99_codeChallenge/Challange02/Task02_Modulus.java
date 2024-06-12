package j99_codeChallenge.Challange02;

import java.util.Scanner;

public class Task02_Modulus {

    public static void main(String[] args) {
        /* Task->
         *  Girilen 5 basamakli tamsayinin ilk 2 ve son 2 basamagindaki rakamlari toplamini print eden code create ediniz.
         *
         *   Ex :
         *   input  : 14531
         *   output : 9
         */
        Scanner input=new Scanner(System.in);
        System.out.print("Agam hele 5 basamaklı bir sayı giresen : ");
        int sayi=input.nextInt();
        int ilkIkıSayi=sayi/1000; // 14531/1000=14
        int sonIkıSayi=sayi%100; // 14531%100=31
        System.out.println("girilen sayının ilk ve son 2 rakam toplamı : "+(ilkIkıSayi%10+ilkIkıSayi/10+sonIkıSayi%10+sonIkıSayi/10));

    }
}

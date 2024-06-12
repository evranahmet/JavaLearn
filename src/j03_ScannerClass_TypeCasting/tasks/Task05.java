package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1. sayıyı giriniz");
        int sayi=scan.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz");
        int sayi2=scan.nextInt();

        int sonuc=sayi+sayi2;
        System.out.println("sonuc = " + sonuc);
        int sonuc2=sayi-sayi2;
        System.out.println("sonuc2 = " + sonuc2);
        int sonuc3=sayi*sayi2;
        System.out.println("sonuc3 = " + sonuc3);
        int sonuc4=sayi/sayi2;
        System.out.println("sonuc4 = " + sonuc4);



    }

}

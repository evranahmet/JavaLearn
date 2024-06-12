package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {//class level
    public static void main(String[] args) {//main menü
        // task-> girilen 3 sayının ortalamasını print eden METHOD create ediniz

//        Scanner scan=new Scanner(System.in);
//        int toplam=0;
//        for (int i = 1; i <=3 ; i++) {
//            System.out.println(i+".sayiyi giriniz");
//            int sayi=scan.nextInt();
//            toplam+=sayi;
//        }
        ortalamaAl(topla());
    }//main sonu

    private static int topla() {
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i <=3 ; i++) {
            System.out.println(i+".sayiyi giriniz");
            int sayi=scan.nextInt();
            toplam+=sayi;
        }
        return toplam;
    }

    private static void ortalamaAl(int toplam) {
        System.out.println("girilen sayilarin ortalamasi : "+(toplam/3));
    }






}//class sonu

package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {// main level
        //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Adinizi giriniz");
//        String ad= scan.next();
//        System.out.println("Soyadinizi giriniz");
//        String soyAd= scan.next();
//        adSoyadKontrol1(ad,soyAd);
        String safvet=adSoyadKontrol2("sAfVeT","sEMa");
        System.out.println("ad soyad = " + safvet);
        System.out.println("adSoyadKontrol3() = " + adSoyadKontrol3());


    }//main sonu

    private static String adSoyadKontrol3() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad= scan.next();
        System.out.println("Soyadinizi giriniz");
        String soyAd= scan.next();

        return ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()
                +" "+soyAd.substring(0,1).toUpperCase()+soyAd.substring(1).toLowerCase();
    }

    private static String adSoyadKontrol2(String ad, String soyAd) {
//        String yeniAd=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()
//                +" "+soyAd.substring(0,1).toUpperCase()+soyAd.substring(1).toLowerCase();
//        return yeniAd;
        return ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()
                +" "+soyAd.substring(0,1).toUpperCase()+soyAd.substring(1).toLowerCase();
    }

    private static void adSoyadKontrol1(String ad, String soyAd) {
        System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()
                +" "+soyAd.substring(0,1).toUpperCase()+soyAd.substring(1).toLowerCase());
    }

}// Class sonu

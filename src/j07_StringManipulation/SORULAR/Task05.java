package j07_StringManipulation.SORULAR;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..

              */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisminizi giriniz");
        String ad=scan.nextLine();
        String sonuc="";
        if (ad.indexOf(" ")==ad.lastIndexOf(" ")){
            sonuc=ad.substring(0,1).toUpperCase()+ad.substring(1,ad.indexOf(" ")).toLowerCase()
                    +" "+ad.substring(ad.indexOf(" ")+1,ad.indexOf(" ")+2).toUpperCase()+
                    ad.substring(ad.indexOf(" ")+2).toLowerCase();
        }else {
            sonuc=ad.substring(0,1).toUpperCase()+ad.substring(1,ad.indexOf(" ")).toLowerCase()
                    +" "+ad.substring(ad.indexOf(" ")+1,ad.indexOf(" ")+2).toUpperCase()+
                    ad.substring(ad.indexOf(" ")+2,ad.lastIndexOf(" ")).toLowerCase()+" "
                    +ad.substring(ad.lastIndexOf(" ")+1,ad.lastIndexOf(" ")+2).toUpperCase()
                    +ad.substring(ad.lastIndexOf(" ")+2).toLowerCase();
        }
        System.out.println(sonuc);


    }
}




















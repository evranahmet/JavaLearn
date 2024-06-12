package j20_StaticKeyword;

public class C02_StaticBlok {//class level

    /*
   1.static blok yapıları static variable'rı değer ataması update için kullanılır
   2.static blok Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
   3.birden fazla static blok varsa yukarıdan aşagiya sıralama ile çalışır.
   4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
    */

    static  String isim="JavvaNur";//initial edilmis static variable olusturuldu
    static {//ilk run edilecek static blok
        System.out.println("***2. static blok run edildi");
        System.out.println("2. blok uptade oncesi isim :"+isim);
        isim="JavvaTar";
        System.out.println("2. blok uptade sonrası isim :"+isim);

    }

    public static void main(String[] args) {//main level
        System.out.println("***main meth run basladı");
        System.out.println("main meth uptade oncesi isim :"+isim);
        isim="JavvaMain";
        System.out.println("main meth uptade sonrası isim :"+isim);
        System.out.println("***main meth run bitti");


    }//main sonu
    static {//ilk run edilecek static blok
        System.out.println("***1. static blok run edildi");
        System.out.println("1. blok uptade oncesi isim :" + isim);
        isim = "JavvaHar";
        System.out.println("1. blok uptade sonrası isim :" + isim);
    }

    }//class sonu

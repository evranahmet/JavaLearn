package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    /*
    Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
    ve başka elemanlara dönüştürmemize imkan sağlayar
     */
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));
        System.out.println("***Task01****");
        // Task01-> listin çift elemanlarının karelerini aynı satıra aralarına bosluk bırakarak print eden code create ediniz.
        printCiftKare(sayiList);

        System.out.println("\n***Task02****");
        // Task02 : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print eden code create ediniz.
        printKup1Fazla(sayiList);

        System.out.println("\n***Task03****");
        // Task03-> Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak print eden code create ediniz.
        printCiftKarekok(sayiList);


    }

    private static void printCiftKarekok(List<Integer> sayiList) {
        sayiList
                .stream()
                .filter(SeedMethods::ciftMi)
                .map(t->(int)Math.sqrt(t))
                .forEach(SeedMethods::intYazdir);
    }

    private static void printKup1Fazla(List<Integer> sayiList) {
        sayiList
                .stream()
                .filter(t->t%2==1)
                .map(t->t*t*t+1)
                //.map(t->(int)Math.pow(t,3)+1)
                .forEach(SeedMethods::intYazdir);
    }

    private static void printCiftKare(List<Integer> sayiList) {
        sayiList
                .stream()
                .filter(SeedMethods::ciftMi)
                //.map(t->t*t)
                .map(t->(int)Math.pow(t,2))//double oldu (int) casting yapınca düzeldi.
                .forEach(SeedMethods::intYazdir);
        //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için map kullanılmaktadır.
    }
}

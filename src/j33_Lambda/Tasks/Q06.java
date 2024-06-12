package j33_Lambda.Tasks;

import j33_Lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06 {
    //task01->Fonksiyonel Programlama ile [12, 9, 13, 4, 6, 2, 4, 12, 15] listesindeki tüm tek sayıları yazdırın
    //task02->6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
    //task03->Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("***Task01***");
        printTekSayi(list);
        System.out.println("\n***Task02***");
        printKare(list);
        System.out.println("\n***Task03***");
        printTekKarakok(list);

    }

    private static void printTekKarakok(List<Integer> list) {
        list.stream().filter(t->t%2==1).map(t->(int)Math.sqrt(t)).forEach(SeedMethods::intYazdir);
    }
    private static void printKare(List<Integer> list) {
        list.stream().filter(t->t<14&&t>6).map(t->(int)t*t).forEach(SeedMethods::intYazdir);
    }

    private static void printTekSayi(List<Integer> list) {
        list.stream().filter(t->t%2==1).forEach(SeedMethods::intYazdir);
    }

    // Task 01 -> //Fonksiyonel Programlama ile listedeki tüm tek sayıları yazdırın


    // Task 02 --> 6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz


    //Task 03 --> Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz
    
}

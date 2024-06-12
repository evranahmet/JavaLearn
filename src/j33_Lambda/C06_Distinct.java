package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_Distinct {
    public static void main(String[] args) {
        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir.
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

        List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));

        System.out.println("****Task01****");
        //Task01-> list elemanlarını alfabetik Buyuk harf ile tekrarsız print eden code create ediniz...
        printBykAlfSiraTekrarsiz(yemahhh);

        System.out.println("\n****Task02****");
        // Task02-> : list elemanlarinin character sayisini ters sirali olarak tekrarsiz print eden code create ediniz.
        printChSayiTers(yemahhh);

        System.out.println("\n****Task03****");
        // Task03-> : list elemanlarinin character sayisini  k->b sıralı benzersiz print eden code create ediniz.
        printChSayiSira(yemahhh);

        System.out.println("\n****Task04****");
        // Task04-> : list elemanlarini son characterine göre ters sıralı tekrarsız print eden code create ediniz.
        printChSayiTersSira(yemahhh);

        System.out.println("\n****Task05****");
        // Task05-> listin elemanlarin  cift sayili karakterlerinin  karelerini   b->k sirali tekrarsiz print eden code create ediniz...
        printCiftKarekterKok(yemahhh);

    }

    private static void printCiftKarekterKok(List<String> yemahhh) {
        yemahhh.stream()
                .map(String::length)
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::kareAl)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(SeedMethods::intYazdir);
    }

    private static void printChSayiTersSira(List<String> yemahhh) {
        yemahhh.stream()
                .sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed())
                .distinct()
                .forEach(SeedMethods::strYazdir);
                 /*
                sorted(Comparator.comparing(str -> str.charAt(str.length() - 1), Comparator.reverseOrder())
                sorted((s1, s2) -> Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1)))
                 */
    }

    private static void printChSayiSira(List<String> yemahhh) {
        yemahhh.stream()
                .map(String::length)
                .sorted()
                .distinct()
                .forEach(SeedMethods::intYazdir);
    }

    private static void printChSayiTers(List<String> yemahhh) {
        yemahhh.stream()
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(SeedMethods::intYazdir);
    }

    private static void printBykAlfSiraTekrarsiz(List<String> yemahhh) {
        yemahhh.stream()
                .sorted()//alfabetik olarak sıralandı
                .map(String::toUpperCase)//elemanlar büyük harfe cevrildi
                .distinct()//elemanlar tekrarsız hale getirildi
                .forEach(SeedMethods::strYazdir);
    }
}

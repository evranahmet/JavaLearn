package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sorted {
    public static void main(String[] args) {
        /*
sorted() -> akışdaki elemanları naturel order (doğal sıra) halinde akış return eder
sorted() tekrarlı kullanılırsa son return aktif olur...
 */
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));

        System.out.println("****Task01****");
        // Task01-> list çift elemanlarının karelerini k->b sıra ile print eden code create ediniz
        printCiftKareKbSira(sayiList);


        System.out.println("\n****Task02****");
        // Task02-> list tek elemanlarının karelerini b->k sıra ile print eden code create ediniz
        printTekKareSira(sayiList);

    }

    private static void printTekKareSira(List<Integer> sayiList) {
        sayiList.stream().filter(SeedMethods::tekMi).map(SeedMethods::kareAl)
                .sorted(Comparator.reverseOrder())//reverseOrder tersten yazdırma
                .forEach(SeedMethods::intYazdir);
    }

    private static void printCiftKareKbSira(List<Integer> sayiList) {
        sayiList
                .stream()
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::kareAl)
                .sorted()
                .forEach(SeedMethods::intYazdir);

    }
}

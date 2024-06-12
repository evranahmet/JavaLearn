package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {

    /*Filter:
    Dizimiz veya Collection'ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
    filtreleme işlemi yapmamıza yarayan bir yapıdır.
    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır
    /*
     */

    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));
        System.out.println("***Task01****");
        //Task01->"Structured Programming"--> AMELE Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        printCiftStructured(sayiList);


        System.out.println("\n***Task02****");
        //task02-> "Functional Programming"--> CINCIX Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        printCiftFunctional2(sayiList);

        System.out.println("\n***Task03****");
        //task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin 35'den kucuk çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        printCiftFunctional3(sayiList);

        System.out.println("\n***Task04****");
        printCiftFunctional4(sayiList);

        System.out.println("\n***Task05****");
        //task04-> "Functional Programming"--> CINCIX Programming kullanarak  listin 34'den buyuk yada  tek elemanlarını aynı satırda aralarında bosluk ile print ediniz
        printCiftFunctional5(sayiList);
    }

    private static void printCiftFunctional5(List<Integer> sayiList) {
        sayiList.stream().filter(t->t%2==1||t>34).forEach(SeedMethods::intYazdir);
        System.out.println();
        sayiList.stream().filter(SeedMethods::byk34Tek).forEach(SeedMethods::intYazdir);
    }

    private static void printCiftFunctional4(List<Integer> sayiList) {

        sayiList.stream().filter(SeedMethods::kck35Cift).forEach(SeedMethods::intYazdir);
    }

    private static void printCiftFunctional3(List<Integer> sayiList) {
        sayiList.
                stream().
                //filter(t->t%2==0&&t<35)
                filter(SeedMethods::ciftMi).
                filter((t)->t<35).
                forEach(SeedMethods::intYazdir);
    }

    private static void printCiftFunctional2(List<Integer> sayiList) {
        sayiList.
                stream().
               // filter((t)->t%2==0).//akışa alınan call elemanları çift şartına göre filtrelendi
                filter(SeedMethods::ciftMi).//akışa alınan call elemanları çift şartına göre filtrelendi
                forEach(SeedMethods::intYazdir);
    }

    private static void printCiftStructured(List<Integer> sayiList) {
        for (Integer each : sayiList) {
         if (each%2==0){
             System.out.print(each+" ");
         }
        }
    }
}

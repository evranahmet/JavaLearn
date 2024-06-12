package j33_Lambda;

import java.util.stream.IntStream;

public class C13_Stream_iterator {
    public static void main(String[] args) {
        System.out.println("****Task 01*****");
        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir code create ediniz.
        System.out.println("Task01->amele toplam : "+ameleTopla(10));
        System.out.println("Task01->cincix toplam : "+cincixTopla(10));
        System.out.println("****Task 02*****");
        //TASK 02 --> 1'den x'e kadar (x dahil) cift tamsayilari toplayan bir code create ediniz
        System.out.println("cift toplam : "+ciftTopla(10));
        System.out.println("****Task 03*****");
        //TASK 03 --> Ilk x pozitif cift tam sayiyi toplayan code  create ediniz.
        System.out.println("ilk x adet cift toplam : "+ilkXCiftTopla(10));
        System.out.print("ilk x adet cift sayi : ");
        ilkXCiftSayi(10);
        System.out.println("\n****Task 04*****");
        //TASK 04 --> Ilk X adet pozitif tek tamsayiyi toplayan programi  create ediniz.
        System.out.println("Ilk x adet tek sayi toplami : "+ilkXTekToplam(10));
        System.out.println("\n****Task 05*****");
        print2IlkXKuvveti(10);
        System.out.println("\n****Task 06*****");
        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini print eden code  create ediniz.
        printistenenIlkXKuvveti(5,3);

        System.out.println("\n****Task 07*****");
        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan code  create ediniz.
        System.out.println("faktoriyel(5) = " + faktoriyel(5));

        System.out.println("\n****Task 08*****");
        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini print eden code  create ediniz.
        printIstenenXKuvveti(3,5);

    }

    private static void printIstenenXKuvveti(int istenenSayi, int x) {
        IntStream
                .iterate(istenenSayi,t->t*istenenSayi)
                .limit(x)
                .skip(x-1)
                .forEach(SeedMethods::intYazdir);
    }

    private static int faktoriyel(int x) {
        return IntStream
                .rangeClosed(1,x)
                .reduce(1,(t,u)->t*u);
    }

    private static void printistenenIlkXKuvveti(int x, int istenenSayi) {
        IntStream
                .iterate(istenenSayi,t->t*istenenSayi)
                .limit(x)
                .forEach(SeedMethods::intYazdir);
    }

    private static void print2IlkXKuvveti(int x) {
        IntStream
                .iterate(2,t->t*2)//2'den baslayip surekli 2'nin kuvvetini alan tekrar tanimlandi
                .limit(x)//akisdaki ilk x adet eleman alindi
                .forEach(SeedMethods::intYazdir);
    }

    private static int ilkXTekToplam(int x) {
        return IntStream
                .iterate(1,t->t+2)
                .limit(x)
                .sum();
    }

    private static void ilkXCiftSayi(int x) {
        IntStream
                .iterate(2,t->t+2)
                .limit(x)
                .forEach(SeedMethods::intYazdir);
    }

    private static int ilkXCiftTopla(int x) {
        return IntStream
                .iterate(2,t->t+2)//2'den baslayip surekli 2'ser arttiran tekrar tanimlandi
                .limit(x)//akisdaki ilk x adet eleman alindi
                .sum();//akisdaki x adet eleman toplandi
    }

    private static int ciftTopla(int x) {
        return IntStream
                .rangeClosed(1,x)
                .filter(SeedMethods::ciftMi)
                .sum();
        //rangeClosed(startInclusive,endInclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endInclusive'e (dahil) kadar  sıralı bir IntStream return eder.
    }

    private static int cincixTopla(int x) {
        return IntStream//manuel olarak int akis tanimlandi
                //.range(1,x+1)//1,2,3....,x tam sayilari akisa alindi->x dahil degil
                .rangeClosed(1,x)
                .sum();
        //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (hariç) kadar sıralı bir IntStream return eder.
    }

    private static int ameleTopla(int x) {
        int toplam=0;
        for (int i = 1; i <=x; i++) {
            toplam+=i;
        }
        return toplam;
    }
}

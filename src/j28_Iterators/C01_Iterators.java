package j28_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {
        /*
   1)Iterator'lar loop'larin yaptigi ayni isi yapar.
   2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
   3)Iterator'lar ile loop'lar arasinda performans farki yoktur.
   4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basrilidir.
   5)Iki tip iterator var;
                i)Iterator: Bu sadece eleman silmede(remove) kullanilir,
                             eleman eklemek veya elemani degistirmek mumkun degildir.
                ii)ListIterator:eleman silebilir(remove), ekleyebilir(add) ve degistirebilir(set).
                           Note:"Iterator" sadece soldan saga(ilk elemandan son elemana) calisir.
                                "ListIterator" ise iki yonlu calisabilir.
*/
        List<String> l1 = new ArrayList<>(Arrays.asList("Sema", "Semra", "Dogukan", "Ahmet", "Halit", "Tuba", "Seher"));
        System.out.print("l1 listin ilk hali = " + l1);

        System.out.println("***Task 01***");
        //Task01-> l1 elemanlarını for loop ile print eden code create ediniz.
        for (int i = 0; i < l1.size(); i++) {
            System.out.print("l1.get(i) = " + l1.get(i));

        }
        System.out.println();


        System.out.println("***Task 02***");
        //Task02-> l1 elemanlarını for each ile print eden code create ediniz.
        for (String s : l1) {
            System.out.print(s + " ");//Sema Semra Dogukan Ahmet Halit Tuba Seher
        }
        System.out.println();

        System.out.println("***Task 02***");
        //Task03-> l1 her bir elemanını for loop ile  :-) update edip print eden code create ediniz.

        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + " :-)");

        }
        System.out.println("l1 uptade sonrası = " + l1);//[Sema :-), Semra :-), Dogukan :-), Ahmet :-), Halit :-), Tuba :-), Seher :-)]

        System.out.println("***Task 04***");
        //Task04-> l1 her bir elemanını for each ile  :-( update edip print eden code create ediniz.

        for (String s : l1) {
            s=s+":-(";
        }
        System.out.println("l1 = " + l1);//[Sema :-), Semra :-), Dogukan :-), Ahmet :-), Halit :-), Tuba :-), Seher :-)]

        /*
        index desteklemeyen yapılarda(collection) tekrarlayan(loop) action'ları için for-each loop update yapamayabilir->task04
        Bu durumda java iterator interface'den tanımlanacak bir variable ile tekrarlanması gereke action'lar kullanmadan tanımlanabilir
         */
        /*
        iterator nasil calisir
        bir iterator objesi olusturmak icin collection uyesi bir obje kullanılır.
        Iterator itr =  liste.iterator();
        iterator collection'in ilk elementinin oncesine gidip bekler

        [ (itr)5, 7, 8, 6, 9]

        itr.hasNext() ===> true  iterator'a yaninda eleman varlığını kontrol eder, true veya false return eder.

        itr.next(); ==> iterator bir sonraki elementin yanina geçirir.
                        ve uzerinden gectigi elementi return eder.
         [ 5, (itr)7, 8, 6, 9]   ===>  5 return eder.

         itr.next(); ==>

         [ 5, 7, (itr)8, 6, 9]   ===>  7 return eder.

         itr.remove(); // iterator'in elinde olan elementi sildi
         dolayisiyla ust uste iki kere itr.remove(); KULLANILAMAZ

         once itr.next(); methodunu calistirip
         iterator'in bir element return etmesi  saglanmalı..

         */
        /*
    ahan da trick --> hasPrevious() ve previous() method'larinin calismasi icin oncesinde
    MUTLAKA KESİNLİKLE hasNext() ve next();method'lari calistirilarak cursor(pointer) en sona getirilmeli

    "ITERATOR" ve "LISTITERATOR" arasi farklar :

    1) "ITERATOR" sadece hasNext(), next() ve remove() methodlarini icerir
    "LISTITERATOR"  ise hasNext(), next(),remove() hasPrevius(), Previus(), add(); set()  method'rini içerir.

    2) "LISTITERATOR" sadece list'ler icin kullanilir.
    "ITERATOR" ise tum collection(list set map) elemanlari icin kullanilir

    3) "ITERATOR" sadece ileri gidiyor, "LISTITERATOR" hem ileri hem geri cift yonlu gitmek icin kullanilir.
    */

        System.out.println("*** Iterator ***");
        //iterator için
        //1. step-->iterator tanımlama
        Iterator<String> it1=l1.iterator();

        //2. step-->while loop tanımlama
        while (it1.hasNext()){
            //hasNext()->it1 elemanları için pointer(cursor:imleç) oldugu yern sonrasında eleman varlıgını kontrol edip true-false return eder
            //next()-> pointer mevcut elemanın sonrasına konumlanıp mevcut eleman return eder
            System.out.print(it1.next()+" ");//Sema :-) Semra :-) Dogukan :-) Ahmet :-) Halit :-) Tuba :-) Seher :-)
        }
        System.out.println();
        System.out.println("*** Task 05 ***");
        //Task05-> l1 her bir elemanlarını silip  print eden code create ediniz.

        Iterator<String> it2=l1.iterator();
        while (it2.hasNext()){
            it2.next();
            it2.remove();

        }
        System.out.println("l1 silme sonrası = " + l1);//[]

        System.out.println("*** Task 06 ***");
        //Task06-> l2  elemanlarını :-) update edip  print eden code create ediniz.
        List<String> l2 = new ArrayList<>(Arrays.asList("javaCAN", "javvaNUR", "javaNAZZZ", "javaSU", "javaHAN", "javaZADE", "javaTAR", "javaLAZIM"));
        System.out.println("l2 List iterator öncesi = " + l2);
        ListIterator<String> lit1=l2.listIterator();//1. step
        while (lit1.hasNext()){//2. step
            lit1.set(lit1.next()+" :-)");
        }
        System.out.println("l2 List iterator sonrası = " + l2);//[javaCAN :-), javvaNUR :-), javaNAZZZ :-), javaSU :-), javaHAN :-), javaZADE :-), javaTAR :-), javaLAZIM :-)]

        List<String> l3 = new ArrayList<>(Arrays.asList("küşleme", "göveç", "soğan kebap", "ankara doner", "kuzu gerdan", "acıl antep tava", "şaşlık", "mardin şiş"));
        System.out.println("*** Task 07 ***");
        //Task07-> l3  elemanlarını ilk harfi buyuk kalan harfleri *** ile update edip  print eden code create ediniz.
        System.out.println("l3 List iterator öncesi = " + l3);
        ListIterator<String> lit2=l3.listIterator();//1.step
        while (lit2.hasNext()) {//2. step
            lit2.set(lit2.next().substring(0, 1).toUpperCase() + "***");
        }
        System.out.println("l3 List iterator sonrası = " + l3);

    }
}

package j29_Collection.p02_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

         /*
Set :  1) unique(benzersiz tek) elemanlardan olusur, Set'lerin icinde bir eleman sadece bir kere kullanilabilir. mükerrer(duplicate) eleman olmaz.
       2) sadece bir null değeri alabilir.(treeSet hariç).Java elementleri unique yapmak icin HASH ALGORITMASI kullanir.
            Java her data icin hashing teknigini kullanarak bir code uretir.Bu code'u almak icin hashCode() methodu kullanilir.
            Hashing, farklı büyüklükteki girdilerden sabit büyüklükte bir çıktı oluşturma sürecine verilen isimdir.
            Universitelerdeki ogrenci numaralari gibi bir ogrenci ismi soruldugunda numarasini bulursaniz onunla ilgili tum datalara ulasilabilir.


       Set     --> HashSet         : 1) HashSet, duplication'a(tekrarlı eleman) izin vermez.
                                       Eger bir elemani tekrar HashSet'e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
                                     2) Haset'ler Set'ler arasinda en hizli olanıdir. bir algoritmaya göre kayit eder.
                                      değerlerin giriş sırasına dikkat edilmez. (LinkedHashSet hariç)
                                     3) HashSet "null" object'ini eleman olarak kullanabilir.
                                     Ancak birden fazla null degerini bir HashSet'e eklemek isterseniz sadece bir tane null degeri olur.

                   LinkedHashset   : 1) Tekrarli eleman kabul etmezler. Elemanlari ekleme sirasina(insertion order) gore dizerler.
                                     2) LinkedHashSet, HashSet'den daha yavas calisir.
                                     3) LinkedHashSet "null" object'ini eleman olarak kullanabilir.
                                     4) Ekleme ve remove islemlerinde hizlidirlar.

                   TreeSet         : 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
                               2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge) gore dizer.
                             3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmalı...
                             4)AHAN DA TRİCK :TreeSet "null" object'ini eleman olarak kullanilamaz.


    Set Methods :
       .add(eleman);-->Set'e eleman ekler
       .addAll(collection);-->istenen collection'in tum elemanlarini ekler
       .contains(eleman);-->istenen eleman set'te varsa true, yoksa false return eder.
       .containsAll(collection);-->istenen collection'in tumu aranan sette var ise true, yoksa false return eder.
       .remove(eleman);-->istenen eleman bulursa siler ve true dondurur, bulamazsa false return eder.
       .removeAll(collection);-->istenen collection'in tum elemanlarini bulursa siler ve true dondurur, bulamazsa false return eder.
       .equlas(set2);-->istenen set2’le tum elemanlar ayni ise true, yoksa false return eder.
       .retainAll(collection1);-->collection1’nin elemanlarinin disindaki tum elemanlari siler, silme islemi yapti ise true, yoksa false return eder.
         (kesişen ortak elemanları döndürür.)
       .clear();-->sett'teki Tum elemanlari siler
       .isEmpty();-->Sette hic eleman yoksa true, varsa false return eder
       .size();-->set'in eleman sayisini verir

*/
        HashSet<String> hs1 = new HashSet<>();//bos hashSet tanımlandı->decleration
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("javaCAN", "javaSU", "javaHAN", "javaNAZ", "javaZADE", "javvaNUR", "javiDAN", "javFER"));
        //set print
        System.out.println("hs2 = " + hs2);//[javvaNUR, javaNAZ, javaHAN, javaCAN, javaSU, javFER, javiDAN, javaZADE]
        //set add() eleman ekleme
        hs2.add("JaviYe");
        System.out.println("hs2 add() sonrası = " + hs2);//[javvaNUR, JaviYe, javaNAZ, javaHAN, javaCAN, javaSU, javFER, javiDAN, javaZADE]
        //set tekrarlı eleman ekleme
        hs2.add("javaNAZ");
        System.out.println("hs2 tekrarlı eleman ekleme sonrası = " + hs2);//[javvaNUR, JaviYe, javaNAZ, javaHAN, javaCAN, javaSU, javFER, javiDAN, javaZADE]
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        System.out.println("hs2 null eleman ekleme sonrası = " + hs2);//[null, javvaNUR, JaviYe, javaNAZ, javaHAN, javaCAN, javaSU, javFER, javiDAN, javaZADE]
        HashSet<String> hs3 = new HashSet(Arrays.asList("balcanKebap", "Cüger", "haşhaşKebap", "guzuGerdan", "incik", "küşşşleme"));
        hs2.addAll(hs3);
        System.out.println("hs2 addAll() sonrası = " + hs2);//[null, javvaNUR, balcanKebap, JaviYe, javaNAZ, javaCAN, javaSU, javiDAN, guzuGerdan, javaHAN, küşşşleme, javFER, haşhaşKebap, incik, javaZADE, Cüger]
        //set remove() eleman silme
        hs2.remove(null);
        System.out.println("hs2 remove() sonrası = " + hs2);//[javvaNUR, balcanKebap, JaviYe, javaNAZ, javaCAN, javaSU, javiDAN, guzuGerdan, javaHAN, küşşşleme, javFER, haşhaşKebap, incik, javaZADE, Cüger]
        //set removeAll() eleman silme
        hs2.removeAll(hs3);
        System.out.println("hs2 removeAll() sonrası = " + hs2);//[javvaNUR, JaviYe, javaNAZ, javaCAN, javaSU, javiDAN, javaHAN, javFER, javaZADE]
        System.out.println("hs2.size() = " + hs2.size());//9
        System.out.println("hs2.isEmpty() = " + hs2.isEmpty());//false
        System.out.println("hs1.isEmpty() = " + hs1.isEmpty());//true
        hs2.clear();
        System.out.println("hs2 = " + hs2);//[]
        System.out.println("hs2.isEmpty() = " + hs2.isEmpty());//true
        //set contains()-->eleman varlığı kontrol
        System.out.println("hs3.contains(\"Cüger\") = " + hs3.contains("Cüger"));//true
        System.out.println("hs3.contains(\"ciger\") = " + hs3.contains("ciger"));//false
        System.out.println("hs3.hashCode() = " + hs3.hashCode());//1961978443
        System.out.println("hs2.hashCode() = " + hs2.hashCode());//0
        //set retainAll()-->Keşisen ortak eleman
        HashSet<Integer> hs5=new HashSet<Integer>(Arrays.asList(16,54,67,63,47,20));
        HashSet<Integer> hs6=new HashSet<Integer>(Arrays.asList(6,54,61,63,17,20));

        System.out.println("hs5.retainAll(hs6) = " + hs5.retainAll(hs6));//true
        Set<Integer> ortakEleman=new HashSet<>(hs6);
        System.out.println("ortakEleman = " + ortakEleman);//[17, 20, 6, 54, 61, 63]
        System.out.println("ortakEleman.retainAll() = " + ortakEleman.retainAll(hs5));//true

        System.out.println("hs5.equals(hs6) = " + hs5.equals(hs6));//false
        System.out.println("ortakEleman.equals(hs6) = " + ortakEleman.equals(hs6));//false


    }





}

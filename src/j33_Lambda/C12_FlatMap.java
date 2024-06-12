package j33_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C12_FlatMap {
    /*
  Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
  fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
  Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

  Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
  Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
  flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
  ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.

*/
    public static void main(String[] args) throws IOException {
        Path erisilecekDosya=Path.of("src/j33_Lambda/Haluk");//erişilecek dosyanın yolu tanımlandı
        Stream<String> dosyaAkisi= Files.lines(erisilecekDosya);//erişilecek dosya dataları satır olarak akışa alındı

        System.out.println("***Task 05***");
        //TASK 05 -> HalUk dosyasindaki farkli kelimeleri  print ediniz..
        Files.lines(erisilecekDosya)//Haluk dosyasına erişildi
                .map(t->t.split(" "))//akıştaki satır elemanlar "  " göre parçalanıp arraya atandı
                .flatMap(Arrays::stream)// "  " göre parçalanan satırlar tek array haline getirildi.
                .distinct()//tekrarsız yazıldı
                .forEach(SeedMethods::strYazdir);

        System.out.println("\n***Task 06***");
        //TASK 06 -> HalUk dosyasindaki tum kelimeleri natural order  print ediniz..
        Files.lines(erisilecekDosya)//Haluk dosyasına erişildi
                .map(t->t.split(" "))//akıştaki satır elemanlar "  " göre parçalanıp arraya atandı
                .flatMap(Arrays::stream)// "  " göre parçalanan satırlar tek array haline getirildi.
                .sorted()
                .forEach(SeedMethods::strYazdir);

        System.out.println("\n***Task 07***");
        //TASK 07 -> HalUk dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println(Files.lines(erisilecekDosya)
                .map(t->t.toLowerCase().split(" "))
                .flatMap(Arrays::stream)
                .filter(t->t.contains("basari"))
                .count());

        System.out.println("\n***Task 08***");
        //TASK 08 -> HalUk dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println(Files.lines(erisilecekDosya)
                .map(t->t.toLowerCase().split(" "))
                .flatMap(Arrays::stream)
                .filter(t->t.contains("a"))
                .count());


        System.out.println("\n***Task 09***");
        //TASK 09 -> HalUk dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        System.out.println(Files.lines(erisilecekDosya)
                .map(t->t.toLowerCase().split(" "))
                .flatMap(Arrays::stream)
                .filter(t->t.contains("a"))
                .collect(Collectors.toList()));
                //.forEach(System.out::println); forEach de sout olmaz!!!

        System.out.println("\n***Task 10***");
        //TASK 09 ->Haluk dosyasında kaç farklı harf kullanıldığını printediniz
        System.out.println(Files.lines(erisilecekDosya)
                .map(t->t.replaceAll("\\W","").split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .count());

        System.out.println("\n***Task 11***");
        //TASK 11 -> HalUk dosyasinda kac farkli kelime kullanildigini print ediniz.
        System.out.println(Files.lines(erisilecekDosya)
                .map(t->t.replaceAll("[.!,:)\\-]","").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .count());


        System.out.println("\n***Task 12***");
        //TASK 12 -> HalUk dosyasinda  farkli kelimeleri print ediniz.
        System.out.println(Files.lines(erisilecekDosya)
                .map(t->t.replaceAll("[.!,:)\\-]","").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList()));



    }
}

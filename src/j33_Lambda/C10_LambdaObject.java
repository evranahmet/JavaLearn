package j33_Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class C10_LambdaObject {
    /*
  TASK :
  fields --> Universite (String)
             bolum (String)
             ogrcSayisi (int)
             notOrt (int)
             olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
   */
    public static void main(String[] args) {

        C10_University u01 = new C10_University("Bogazici", "Matematik", 571, 73);
        C10_University u02 = new C10_University("Istanbul", "Matematik", 622, 77);
        C10_University u03 = new C10_University("Marmara", "Hukuk", 1453, 52);
        C10_University u04 = new C10_University("Itu", "uçak muh.", 333, 63);
        C10_University u05 = new C10_University("Yıldız Teknik", "Gemi ", 216, 55);

        List<C10_University> unv=new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));
        System.out.println("unv ="+ unv);
        System.out.println("***Task 01***");
        // Task01-> notOrt'larının 74'den buyuk oldg control eden code create ediniz...
        System.out.println("kontrolNotOrt74Byk(unv) = " + kontrolNotOrt74Byk(unv));

        System.out.println("***Task 02***");
        //task02->ogrc sayilarinin   110 den az olmadigini  kontrol eden code create ediniz.
        System.out.println("kontrolOgrncSayisi110Byk(unv) = " + kontrolOgrncSayisi110Byk(unv));

        System.out.println("***Task 03***");
        //task03->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden code create ediniz.
        System.out.println("kontrolMatVar(unv) = " + kontrolMatVar(unv));

        System.out.println("***Task 04***");
        //task04->universite'leri ogr sayilarina gore b->k siralayiniz.
        System.out.println("printOgrSayiTersSirala(unv) = " + printOgrSayiTersSirala(unv));

        System.out.println("***Task 05***");
        //task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...
        System.out.println("printNotOrtİlk3Sirala(unv) = " + printNotOrtİlk3Sirala(unv));

        System.out.println("***Task 06***");
        //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...
        System.out.println("printOgrncSayisiSiraliEnAzİkinci(unv) = " + printOgrncSayisiSiraliEnAzİkinci(unv));

        System.out.println("***Task 07***");
        //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...
        System.out.println("printNotOrt63Byk(unv) = " + printNotOrt63Byk(unv));

        System.out.println("****Task 08*****");
        //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz...
        System.out.println("printOgrnciSayisi333BykNotOrtOrtalama(unv) = " + printOgrnciSayisi333BykNotOrtOrtalama(unv));//OptionalDouble[66.25]

        System.out.println("****Task 09*****");
        //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...
        System.out.println("printMathBolumSayisi(unv) = " + printMathBolumSayisi(unv));//2

        System.out.println("****Task 10*****");
        //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...
        System.out.println("printOgrnciSayisi571BykMaxNotOrt(unv) = " + printOgrnciSayisi571BykMaxNotOrt(unv));//OptionalDouble[77.0]

        System.out.println("****Task 11*****");
        //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...
        System.out.println("printOgrnciSayisi1071KckMinNotOrt(unv) = " + printOgrnciSayisi1071KckMinNotOrt(unv));//OptionalDouble[55.0]

    }

    private static OptionalDouble printOgrnciSayisi1071KckMinNotOrt(List<C10_University> unv) {
        return unv
                .stream()
                .filter(t->t.getOgrcSayisi()<=1071)
                .mapToDouble(C10_University::getNotOrt)
                .min();
    }

    private static OptionalDouble printOgrnciSayisi571BykMaxNotOrt(List<C10_University> unv) {
        return unv
                .stream()
                .filter(t->t.getOgrcSayisi()>=571)
                .mapToDouble(C10_University::getNotOrt)
                .max();
    }

    private static long printMathBolumSayisi(List<C10_University> unv) {
        return unv
                .stream()
                .filter(t->t.getBolum().equalsIgnoreCase("Matematik"))
                .count();

    }

    private static OptionalDouble printOgrnciSayisi333BykNotOrtOrtalama(List<C10_University> unv) {
        return  unv
                .stream()
                .filter(t->t.getOgrcSayisi()>=333)
                .mapToDouble(C10_University::getNotOrt)
                .average();//ortalama methodu
    }

    private static int printNotOrt63Byk(List<C10_University> unv) {
        return unv
                .stream()
                .filter(t->t.getNotOrt()>63)
                .mapToInt(C10_University::getOgrcSayisi)//üniversite obj akışını parametre girilen öğrenci sayısı olarak uptade edildi.
                .sum();//akış elemanları toplandı
    }

    private static List<C10_University> printOgrncSayisiSiraliEnAzİkinci(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi))
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
    }

    private static List<C10_University> printNotOrtİlk3Sirala(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getNotOrt).reversed())
                .limit(3)
                .collect(Collectors.toList());//listeye çevirmek için
    }

    private static List<C10_University> printOgrSayiTersSirala(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi).reversed())
                .collect(Collectors.toList());
    }

    private static String kontrolMatVar(List<C10_University> unv) {
        return unv.stream().anyMatch(t -> t.getBolum().contains("Matematik")) ?
                "En az 1 üniversitede Matematik bölümü var" :
                "Hiç bir üniversitede Matematik bölümü yok";
    }

    private static String kontrolOgrncSayisi110Byk(List<C10_University> unv) {
        return unv.stream().allMatch(t->t.getOgrcSayisi()>110)?
                "Üniversitelerin hepsinin öğrenci sayısı 110 dan büyük":
                "Üniversitelerde en az 1 tanesinin öğrenci sayısı 110 dan küçük";
    }

    private static String kontrolNotOrt74Byk(List<C10_University> unv) {
        return unv.stream().allMatch(t->t.getNotOrt()>74)?
                "Üniversitelerin hepsinin not ortalaması 74 ten büyük":
                "Üniversitelerden en az 1 tanesinin not ortalaması 74 ten küçük";
    }
}

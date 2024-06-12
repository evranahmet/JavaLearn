package j100_javaProjects.P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class deneme2 {//Class level
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static List<String> günler= new ArrayList<>(Arrays.asList("pazartesi","salı","çarşamba","perşembe","cuma","cumartesi","pazar"));
    static List<Double> gunlukKazanc= new ArrayList<>(Arrays.asList());
    static Scanner input = new Scanner(System.in);
    static double haftanınToplamKazancı=0;

    public static void main(String[] args) {//main level
        int gün=0;
        while (gün<7){
            System.out.print("Gün giriniz : "+günler.get(gün)+" günün kazancını giriniz ");
            double gününkazancı=input.nextDouble();
            haftanınToplamKazancı+=gününkazancı;
            gunlukKazanc.add(gününkazancı);

            gün++;
        }
        System.out.println("Bu haftalık toplam hasılat :"+haftanınToplamKazancı);
        System.out.println("günlük hasılat :"+gunlukKazanc);
        System.out.println("getOrtalamaKazanç() = " + getOrtalamaKazanç());
        System.out.println("Ortalamanı üstünde kazanç günleri = " + getOttamanınÜstündeToplamKazanç());
        System.out.println("Ortalamanı altında kazanç günleri = " + getOrtalamanınAltındaKazançGünleri());


    }//main sonu

    private static ArrayList<String> getOrtalamanınAltındaKazançGünleri() {
        ArrayList<String> ortalamanınAltındaGünler=new ArrayList<>();
        for (int i = 0; i <gunlukKazanc.size() ; i++) {
            if (gunlukKazanc.get(i)<getOrtalamaKazanç()){
                ortalamanınAltındaGünler.add(günler.get(i));
            }
        }
        return ortalamanınAltındaGünler;

    }

    private static ArrayList<String> getOttamanınÜstündeToplamKazanç() {
        ArrayList<String> ortalamanınÜstündeGünler=new ArrayList<>();
        for (int i = 0; i <gunlukKazanc.size() ; i++) {
            if (gunlukKazanc.get(i)>getOrtalamaKazanç()){
                ortalamanınÜstündeGünler.add(günler.get(i));
            }
        }
        return ortalamanınÜstündeGünler;
    }

    private static double getOrtalamaKazanç() {
        return haftanınToplamKazancı/7;

    }


}//Class sonu

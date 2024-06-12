package j100_javaProjects.P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class deneme1 {//Class level

    static ArrayList<String> ürünlistesi=new ArrayList<String>(Arrays.asList("domat->1","balcan->2","fujiElma->3","çilek->4","muz->5"));
    static ArrayList<Double> ürünfiyatlistesi=new ArrayList<>(Arrays.asList(20.5,35.3,40.2,50.0,85.7));
    static double toplamÖdenecekMiktar=0;
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {//main level
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

//        System.out.println(ürünlistesi);
//        System.out.println(ürünfiyatlistesi);
        
        müşteriSeçim();


    }//main sonu

    private static void müşteriSeçim() {
        System.out.println("Marketimize Hoşgeldiniz \n"+" Seçeceğinin ürün listesi :"+ürünlistesi+"\n"+" Seçeceğiniz ürün fiyat listesi :"+ürünfiyatlistesi);
        System.out.println("Hangi ürünü istersiniz : ");
        int ürünseçim=input.nextInt();
        if (ürünseçim<6 && ürünseçim>0){
            System.out.println("Seçtiğiniz üründen kaç kg istersiniz :" );
            double kilo=input.nextDouble();
            toplamÖdenecekMiktar+=kilo*ürünfiyatlistesi.get(ürünseçim-1);
            System.out.println("Seçtiğiniz ürün :"+ürünlistesi.get(ürünseçim-1)+"\n"+
                    "istediğiniz kilo :"+ kilo+"\n"+
                    "seçtiğiniz ürünün fiyatı :"+ürünfiyatlistesi.get(ürünseçim-1)+"\n"+
                    "Toplam ödemeniz :"+toplamÖdenecekMiktar);
            System.out.println("Başka bir ürün almak istiyorsanız 1 Kasa için 2 giriniz");
            int karar=input.nextInt();
            if (karar==1){
                müşteriSeçim();
            } else if (karar==2) {
                kAsa();
            }else System.out.println("Lütfen doğru seçim yapınız");

        }else {System.out.println("Yanlış seçim yaptınız tekrar ürün seçimi yapınız");
        müşteriSeçim();}

    }

    private static void kAsa() {
        System.out.println("Toplam ödemeniz gereken tutar :"+toplamÖdenecekMiktar+"Yine Bekleriz");
    }


}//Class sonu

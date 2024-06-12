package j100_javaProjects.P01;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {// Class level
    static Scanner input = new Scanner(System.in);
    static Random rnd = new Random();
    static int pcSayi = rnd.nextInt(100) + 1;

    public static void main(String[] args) {//main level
        /*
Sayı tahmin etme oyunu....
Bilgisayardan rastle(random Class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi  en fazla 3 tekrarda  bulmasını sağlayan method create ediniz .
*/
        sayiTahminEt();

    }//main sonu
    public static void sayiTahminEt() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rastgeleSayi = random.nextInt(101); // 0-100 arasında rastgele bir sayı
        int tahmin;
        int denemeSayisi = 0;

        System.out.println("0 ile 100 arasında bir sayıyı tahmin edin.");

        do {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();

            if (tahmin < 0 || tahmin > 100) {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı girin.");
                continue; // Geçerli bir sayı girilene kadar döngüyü devam ettir
            }

            denemeSayisi++;

            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! " + denemeSayisi + " denemede doğru tahmin ettiniz.");
            }

        } while (denemeSayisi < 3 && tahmin != rastgeleSayi);

        if (denemeSayisi == 3 && tahmin != rastgeleSayi) {
            System.out.println("Üzgünüm, hakkınız doldu. Doğru cevap: " + rastgeleSayi);
        }
    }
  // private static void sayiTahminEt() {
  //     System.out.println("psSayi = " + pcSayi);
  //     System.out.println("   ***   Tahmin oyununa hojjj geldiniz :)   ***    \n" +
  //             "Agam hele 1-100 arası bi sayı giresen  : ");
  //     int agaTahmini = input.nextInt();
  //     int tahminHakki = 1;
  //     if (agaTahmini < 100 && agaTahmini > 0) {

  //      //  while (tahminHakki <=3) {
  //      //      if (agaTahmini < pcSayi) {
  //      //          System.out.println("Agam elini yuksek tut sayısı arttır");
  //      //          agaTahmini = input.nextInt();
  //      //        tahminHakki++;
  //      //      } else if (agaTahmini > pcSayi) {
  //      //          System.out.println("Agam elini alcak  tut sayısı azalt");
  //      //          agaTahmini = input.nextInt();
  //      //        tahminHakki++;
  //      //      } else System.out.println("BINGOOOO agam caylar senden  :) " + tahminHakki + ". tahminde buldunuz");
  //      //    tahminHakki++;
  //      //  }


  //    } else {
  //        System.out.println("Agam gelimim ora adam gibin bişey giresen :( ");
  //        sayiTahminEt();
  //    }


  // }
}//Class sonu

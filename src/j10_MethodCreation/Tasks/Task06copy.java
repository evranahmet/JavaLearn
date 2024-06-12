package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task06copy {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare dikdörtgen , üçgen) alan ve çevre değerlerini print eden METHOD  create ediniz


        System.out.println("Hangi sekil");
        String sekil = input.next().toLowerCase();
        switch (sekil) {
            case "kare":
                kareAlani();
                kareCevresi();
                break;
            case "dikdortgen":
                dikdortgenAlani();
                dikdortgenCevresi();
                break;
            case "ucgen":
                ucgenAlani();
                ucgenCevresi();
                break;
        }
    }//main sonu

    private static void ucgenCevresi() {
        System.out.println("1.kenari giriniz : ");
        int boyut1 = input.nextInt();
        System.out.println("2.kenari giriniz : ");
        int boyut2 = input.nextInt();
        System.out.println("3.kenari giriniz : ");
        int boyut3 = input.nextInt();
        System.out.println("Ucgenin cevresi : " + (boyut1 + boyut2 + boyut3));
    }

    private static void ucgenAlani() {
        System.out.println("Ucgenin yuksekligini giriniz : ");
        int yukseklik = input.nextInt();
        System.out.println("Ucgenin tabanini giriniz : ");
        int taban = input.nextInt();
        System.out.println("Ucgeni alani : " + (taban * yukseklik) / 2);
    }

    private static void dikdortgenCevresi() {
        System.out.println("Uzun kenari giriniz : ");
        int uzun = input.nextInt();
        System.out.println("Kisa kenari giriniz : ");
        int kisa = input.nextInt();
        System.out.println("Dikdortgenin cevresi : " + (uzun + kisa) * 2);
    }

    private static void dikdortgenAlani() {
        System.out.println("Uzun kenari giriniz : ");
        int uzun = input.nextInt();
        System.out.println("Kisa kenari giriniz : ");
        int kisa = input.nextInt();
        System.out.println("Dikdortgenin alani : " + (uzun * kisa));
    }

    private static void kareCevresi() {
        System.out.println("Karenin kenar uzunlugunu giriniz : ");
        int kenar = input.nextInt();
        System.out.println("Karenin cevresi : " + (kenar * 4));
    }

    private static void kareAlani() {
        System.out.println("Karenin kenar uzunlugunu giriniz : ");
        int kenar = input.nextInt();
        System.out.println("Karenin alani : " + (kenar*kenar));


    }//main sonu


}//Class sonu

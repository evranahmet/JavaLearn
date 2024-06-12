package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task06 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare dikdörtgen , üçgen) alan ve çevre değerlerini print eden METHOD  create ediniz


        System.out.println("1.boyutu giriniz : ");
        int boyut1 = input.nextInt();
        System.out.println("2.boyutu giriniz : ");
        int boyut2 = input.nextInt();
        System.out.println("Hangi sekil");
        String sekil = input.next().toLowerCase();
        switch (sekil) {
            case "kare":
                kareAlani(boyut1);
                kareCevresi(boyut1);
                break;
            case "dikdortgen":
                dikdortgenAlani(boyut1, boyut2);
                dikdortgenCevresi(boyut1, boyut2);
                break;
            case "ucgen":
                System.out.println("3.boyutu giriniz");
                int boyut3 = input.nextInt();
                ucgenAlani(boyut1, boyut2);
                ucgenCevresi(boyut1, boyut2, boyut3);
                break;
        }


    }//main sonu

    private static void ucgenCevresi(int boyut1, int boyut2, int boyut3) {
        System.out.println("Ucgenin cevresi : " + (boyut1 + boyut2 + boyut3));
    }

    private static void ucgenAlani(int boyut1, int boyut2) {
        System.out.println("Ucgeni alani : " + (boyut1 * boyut2) / 2);
    }

    private static void dikdortgenCevresi(int boyut1, int boyut2) {
        System.out.println("Dikdortgenin cevresi : " + (boyut1 + boyut2) * 2);
    }

    private static void dikdortgenAlani(int boyut1, int boyut2) {
        System.out.println("Dikdortgenin alani : " + (boyut1 * boyut2));
    }

    private static void kareCevresi(int boyut1) {
        System.out.println("Karenin cevresi : " + (boyut1 * 4));
    }

    private static void kareAlani(int boyut1) {
        System.out.println("Karenin alani : " + (boyut1 * boyut1));


    }//main sonu


}//Class sonu

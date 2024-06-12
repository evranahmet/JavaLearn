package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
    Task->
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saati giriniz : ");
        int saati = scanner.nextInt();
        System.out.print("Dakika giriniz : ");
        int dakika = scanner.nextInt();
        System.out.print("Saniye giriniz : ");
        int saniye = scanner.nextInt();
        int sonuc = saati * 3600 + dakika * 60 + saniye;
        System.out.println("sonuc = " + sonuc+ " saniye");



    }

}




























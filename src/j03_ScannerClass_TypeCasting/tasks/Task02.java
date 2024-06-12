package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
    public static <İnteger> void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen boyunuzu giriniz");
        double boy = input.nextDouble();


        System.out.println("lütfen kilosunuzu giriniz");
        int kilo=input.nextInt();

        double sonuc1=kilo/(boy*boy);


        System.out.println("VKE1 = " + sonuc1);





    }
}

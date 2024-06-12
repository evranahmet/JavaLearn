package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi girin : ");
        int sayi = sc.nextInt();

        basamakSayisi(sayi);
    }

    public static void basamakSayisi(int sayi) { // 54698 -> 5469 -> 546 -> 54 -> 5 -> 0

        int sayac = 0;

        while (sayi != 0) {

            sayi = sayi / 10;

            sayac++;
        }

        System.out.println("Basamak Sayisi = " + sayac);


    }

}

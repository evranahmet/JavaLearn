package j04_JavaOperators.j01_AritmeticOperators.SORULAR;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        /* Task->
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("üç Basamakli bir sayı giriniz");
        int sayi=input.nextInt();
        //int birlerBas=sayi%10;
        //int yuzlerBas=sayi/100;
        //System.out.println("Toplam = " +(birlerBas + yuzlerBas));
        System.out.println("Toplam = " +(sayi%10 + sayi/100));










    }

}

package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /* Task->
         Girilen bir sayı için

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayı = sc.nextInt();
        if (sayı>=0) {
            if (sayı>=10){
                System.out.println("büyüksün");
            } else if (sayı<10){
                System.out.println("normalsin");

            }
        }
        if (sayı<0){
            if (sayı>-10){
                System.out.println("negatifsin");

            } else if (sayı<=-10) {
                System.out.println("aşırı negatifsin");

            }
        }

    }






}





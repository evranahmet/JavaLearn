package j08_Loops.Loop03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhlieLoop {
    public static void main(String[] args) {

        // task-> girilen sayı 13 den kucuk ise "olaaa kazandınız :) " değilse saysı girişi isteyen code create ediniz...

        Scanner scan=new Scanner(System.in);
        int sayi;
        do {
            System.out.println("Bir sayı giriniz");
            sayi=scan.nextInt();

        }while (sayi>=13);
        System.out.println("olaaa kazandınız :)");
    }
}

package j99_codeChallenge.Challenge07_Cevaplar;

import java.util.Scanner;

public class Task02 {

    // task-> girilen tamsayının tek-çift olmasını kontrol eden method create ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Agam  sayı gireceksen : ");
        int sayi = input.nextInt();
        System.out.println(tekCiftControlEt1(sayi));
        System.out.println(tekCiftControlEt2(sayi));


    }//main sonu

    private static boolean tekCiftControlEt2(int sayi) {
        return sayi%2==0?true:false;
    }

    private static String tekCiftControlEt1(int sayi) {
        return sayi%2==0?"Agam girilen sayı CİFT":"Agam girilen sayı TEK";
    }


}//Class sonu





package j99_codeChallenge.Challenge07_Cevaplar;

import java.util.Scanner;

public class Task07 {

    /* task ->
    İki integer sayının eşitliğini kontrol eden method create ediniz.

    num1 = num2 => true
    */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam  sayı1 giresen : ");
        int sayi1 = input.nextInt();

        System.out.println("Agam  sayı1 giresen : ");
        int sayi2 = input.nextInt();
        System.out.println(esitControl(sayi2, sayi1));

    }// main sonu

    private static String  esitControl(int sayi2, int sayi1) {
        return sayi1==sayi2?" girilen sayılar ESIT :) ":" girilen sayılar ESIT DEGIL :( ";
    }


}// Class sonu





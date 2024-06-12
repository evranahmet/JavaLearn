package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir karakter giriniz: ");
        char karakter = input.next().charAt(0);
        System.out.println("Girdiginiz karakter : " + karakter);
        System.out.println("Girdiginiz karakterinin ascii degeri : " + (int)karakter);







    }


}

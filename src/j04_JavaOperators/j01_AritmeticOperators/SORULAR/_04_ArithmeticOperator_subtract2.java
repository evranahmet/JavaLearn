package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

        Scanner dp = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz: ");
        int num1 = dp.nextInt();

        System.out.println("Lütfen 2. sayıyı giriniz");
        int num2 = dp.nextInt();

        System.out.println("Lütfen 3. sayıyı giriniz");
        int num3 = dp.nextInt();

        System.out.println("Lütfen 4. sayıyı giriniz");
        int num4 = dp.nextInt();

        int sonuc= num1-num2-num3-num4;
        System.out.println("sonuc = " + sonuc);


        //Kodu aşağıya yazınız.


    }
}

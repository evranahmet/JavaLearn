package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında (num1,  num2),
        İlk int'i ikinci int'e bölün.
        Sonucu yazdırın. */

        Scanner dp = new Scanner(System.in);

        System.out.println("Lütfen 1. sayıyı giriniz: ");
        int num1 = dp.nextInt();

        System.out.println("Lütfen 2. sayıyı giriniz");
        int num2 = dp.nextInt();

        int sonuc=num1/num2;
        System.out.println("sonuc = " + sonuc);



        //Kodu aşağıya yazınız.

    }
}

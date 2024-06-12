package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz");
        int num1 = dp.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz");
        int num2 = dp.nextInt();
        int sonuc = num1 % num2;
        System.out.println("sonuc = " + sonuc);


        //Kodu aşağıya yazınız.



    }
}

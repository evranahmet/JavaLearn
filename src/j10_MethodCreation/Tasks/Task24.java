package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
/*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci dizisinin kac elemanini istiyorsun : ");
        int sayi = scan.nextInt();


        fibonacci(sayi);
    }

    public static void fibonacci(int sayi) {

        int num1 = 0;
        int num2 = 1;

        // ilk iki sayiyi yazdirdik
        System.out.print(num1 + ", " + num2);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);


        for (int i = 0; i < sayi; i++) {

            int num3 = num1 + num2;

            System.out.print(", " + num3);

            if (num3 >= sayi) break; // girilen sayiya kadar yazdirir.


            num1 = num2;
            num2 = num3;
        }


    }


}

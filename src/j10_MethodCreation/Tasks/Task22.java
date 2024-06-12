package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task22 {

    /* task->
      katsayıları a,b,c  verilen 1 bilinmeyenli ax^2 + bx + c denklemin köklerini print eden METHOD create ediniz.



      trick-> kokler : (-b +/- karekök(delta)) / (2*a)
        delta = b*b - 4*a*c
        delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        delta = 0 => 1 tane kök vardır x = -b/2a
        delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Denklemin a, b ve c sayilarini giriniz\na: ");
        double a = input.nextInt();
        System.out.print("b: ");
        double b = input.nextInt();
        System.out.print("c: ");
        double c = input.nextInt();

        kokBul(a, b, c);

    }

    public static void kokBul(double a, double b, double c) {

        // ax^2 + bx + c
        System.out.println("Denklem = " + a + "x^2 + " + b + "x + " + c);

        // delta = b*b - 4*a*c
        double delta = b * b - 4 * a * c;

        if (delta > 0) { // 2 tane kök vardır x1=(-b + kök(d)) / (2*a)  , x2= (-b - kök(d)) / (2*a)

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("2 tane kök vardır x1 = " + x1 + ", x2 = " + x2);

        } else if (delta == 0) { // 1 tane kök vardır x = -b/2a

            double x = -b / 2 * a;
            System.out.println("1 tane kök vardır x = " + x);

        } else { // kök yoktur.

            System.out.println("kök yoktur.");
        }


    }


}
